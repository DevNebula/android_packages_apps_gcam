package p000;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.util.Log;
import com.google.android.libraries.smartburst.filterfw.decoder.ImageDecoder;
import java.nio.ByteBuffer;
import java.util.Queue;

/* compiled from: PG */
/* renamed from: ioy */
public final class ioy extends Thread {
    /* renamed from: a */
    private final /* synthetic */ iow f7627a;

    public ioy(iow iow, String str) {
        this.f7627a = iow;
        super(str);
    }

    public final void run() {
        Log.v("AudioEncoder", "starting");
        boolean z;
        do {
            iow iow = this.f7627a;
            BufferInfo a = ins.m3954a();
            int dequeueOutputBuffer = iow.f21186d.dequeueOutputBuffer(a, 10000);
            ioo ioo;
            if (dequeueOutputBuffer == -1) {
                z = false;
                continue;
            } else if (dequeueOutputBuffer == -2) {
                if (iow.f21187e.mo13683a()) {
                    throw new IllegalStateException("format changed twice");
                }
                MediaFormat outputFormat = iow.f21186d.getOutputFormat();
                String valueOf = String.valueOf(outputFormat);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 37);
                stringBuilder.append("Audio encoder output format changed: ");
                stringBuilder.append(valueOf);
                Log.w("AudioEncoder", stringBuilder.toString());
                ioo = iow.f21187e;
                synchronized (ioo.f21107c) {
                    if (ioo.f21109e != ipi.READY) {
                        Log.e("MediaMuxerMul", "already started, cannot add audio track.");
                    } else {
                        ioq ioq = ioo.f21110f;
                        if (ioq.f7605a) {
                            ioq.mo8689a(ioo.f21105a.addTrack(outputFormat));
                            ioq ioq2 = ioo.f21110f;
                            ioq2.f7608d = outputFormat;
                            int a2 = ioq2.mo8688a();
                            stringBuilder = new StringBuilder(35);
                            stringBuilder.append("Audio track getIndex(): ");
                            stringBuilder.append(a2);
                            Log.v("MediaMuxerMul", stringBuilder.toString());
                        } else {
                            Log.e("MediaMuxerMul", "Audio track is not supported");
                        }
                    }
                }
                iow.f21187e.mo13686c();
                z = false;
                continue;
            } else if (dequeueOutputBuffer != -3) {
                if ((a.flags & 2) != 0) {
                    a.size = 0;
                }
                if (a.size != 0) {
                    Queue queue = iow.f21189g;
                    long j = a.presentationTimeUs;
                    while (!queue.isEmpty()) {
                        kge kge = (kge) jri.m13404b((kge) queue.peek());
                        if (kge.mo9713a(Long.valueOf(j))) {
                            z = true;
                            break;
                        } else if (kge.f21895a != kdq.f21876b && ((Long) kge.f21895a.mo9812a()).longValue() > j) {
                            z = false;
                            break;
                        } else {
                            String valueOf2 = String.valueOf(kge);
                            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 20);
                            stringBuilder2.append("remove a time range ");
                            stringBuilder2.append(valueOf2);
                            Log.d("AudioEncoder", stringBuilder2.toString());
                            queue.poll();
                        }
                    }
                    z = false;
                    if (!z) {
                        if (!iow.f21187e.mo13683a()) {
                            iow.f21187e.mo13680a((long) ImageDecoder.CONSUMER_REGISTRATION_DELAY_MS);
                        }
                        ByteBuffer outputBuffer = iow.f21186d.getOutputBuffer(dequeueOutputBuffer);
                        outputBuffer.position(a.offset);
                        outputBuffer.limit(a.offset + a.size);
                        ioo = iow.f21187e;
                        j = (iow.f21190h - a.presentationTimeUs) / 1000;
                        if (j < 0) {
                            Log.e("MediaMuxerMul", "The duration of record cannot be shorter than existing one.");
                        } else {
                            iol iol = ioo.f21113i;
                            iol.f7604d = j + iol.f7604d;
                        }
                        a.presentationTimeUs -= iow.f21192j;
                        j = iow.f21193k;
                        if (j < a.presentationTimeUs) {
                            iow.f21193k = a.presentationTimeUs;
                            iow.f21187e.mo13682a(outputBuffer, a);
                        } else {
                            StringBuilder stringBuilder3 = new StringBuilder(49);
                            stringBuilder3.append("Ignore frame at ");
                            stringBuilder3.append(j);
                            stringBuilder3.append(" after resume");
                            Log.i("AudioEncoder", stringBuilder3.toString());
                        }
                    }
                }
                iow.f21186d.releaseOutputBuffer(dequeueOutputBuffer, false);
                if (a.presentationTimeUs >= iow.f21191i) {
                    z = true;
                    continue;
                } else if ((a.flags & 4) == 0) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
            } else {
                z = false;
                continue;
            }
        } while (!z);
        Log.v("AudioEncoder", "stopping");
    }
}
