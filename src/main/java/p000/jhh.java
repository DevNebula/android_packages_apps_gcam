package p000;

import android.media.MediaMuxer;
import android.util.Log;
import java.util.concurrent.CancellationException;

/* renamed from: jhh */
final /* synthetic */ class jhh implements Runnable {
    /* renamed from: a */
    private final jhg f8200a;

    jhh(jhg jhg) {
        this.f8200a = jhg;
    }

    public final void run() {
        jhg jhg = this.f8200a;
        if (jhg.f21495b.isCancelled()) {
            Log.w("MuxerTrackStreamImpl", "Muxer cancelled. Closing track.");
            jhg.mo13797a();
            return;
        }
        try {
            if (((Boolean) kow.m13881c(jhg.f21495b)).booleanValue()) {
                MediaMuxer mediaMuxer = (MediaMuxer) kow.m13881c(jhg.f21494a);
                int intValue = ((Integer) kow.m13881c(jhg.f21499f)).intValue();
                synchronized (jhg.f21501h) {
                    jgy jgy = (jgy) jhg.f21500g.pollFirst();
                    if (jgy == null) {
                        return;
                    } else if (jgy.mo9417a()) {
                        jhg.mo13797a();
                    } else if (!jhg.f21497d.isDone()) {
                        long j = jgy.f8185b.presentationTimeUs;
                        long j2 = jhg.f21502i;
                        if (jhg.m13089a(jhg.f21496c.f8199b, "oo.muxer.force_sequential")) {
                            if (j < j2) {
                                jgy.f8185b.presentationTimeUs = jhg.f21502i;
                            }
                            jhg.f21502i = jgy.f8185b.presentationTimeUs + 100;
                        }
                        try {
                            mediaMuxer.writeSampleData(intValue, jgy.f8184a, jgy.f8185b);
                        } catch (Throwable th) {
                            jhg.f21497d.mo15642a(th);
                        }
                    }
                }
            } else {
                return;
            }
        } catch (CancellationException e) {
            Log.w("MuxerTrackStreamImpl", "Muxer cancelled. Closing track.");
            jhg.mo13797a();
            return;
        }
        return;
    }
}
