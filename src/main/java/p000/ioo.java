package p000;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Handler;
import android.util.Log;
import java.io.File;
import java.io.FileDescriptor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: ioo */
public final class ioo implements iqo {
    /* renamed from: a */
    public MediaMuxer f21105a;
    /* renamed from: b */
    public MediaMuxer f21106b = null;
    /* renamed from: c */
    public final Object f21107c;
    /* renamed from: d */
    public final ConcurrentLinkedQueue f21108d;
    /* renamed from: e */
    public ipi f21109e;
    /* renamed from: f */
    public final ioq f21110f;
    /* renamed from: g */
    public final ioq f21111g;
    /* renamed from: h */
    public final ioq f21112h;
    /* renamed from: i */
    public final iol f21113i;
    /* renamed from: j */
    public boolean f21114j;
    /* renamed from: k */
    public boolean f21115k;
    /* renamed from: l */
    public final int f21116l;
    /* renamed from: m */
    public final float f21117m;
    /* renamed from: n */
    public final float f21118n;
    /* renamed from: o */
    public final int f21119o;
    /* renamed from: p */
    public boolean f21120p = false;
    /* renamed from: q */
    private final Handler f21121q;
    /* renamed from: r */
    private final kpw f21122r;
    /* renamed from: s */
    private long f21123s = 0;
    /* renamed from: t */
    private final ExecutorService f21124t;

    public ioo(String str, FileDescriptor fileDescriptor, int i, int i2, float f, float f2, long j, long j2, boolean z, boolean z2, ion ion, Handler handler, ExecutorService executorService) {
        this.f21119o = i2;
        this.f21116l = i;
        this.f21117m = f;
        this.f21118n = f2;
        this.f21105a = ioo.m12566a(str, fileDescriptor, i, i2, f, f2);
        this.f21107c = new Object();
        this.f21109e = ipi.READY;
        if (z || z2) {
            this.f21110f = new ioq(z);
            this.f21111g = new ioq(z2);
            this.f21112h = new ioq(false);
            if (j <= 0) {
                j = Long.MAX_VALUE;
            }
            if (j2 <= 0) {
                j2 = Long.MAX_VALUE;
            }
            this.f21113i = new iol(j2, j);
            this.f21121q = handler;
            this.f21122r = kpw.m18486d();
            this.f21108d = new ConcurrentLinkedQueue();
            this.f21114j = false;
            this.f21115k = false;
            this.f21124t = executorService;
            return;
        }
        throw new IllegalArgumentException("add least audio or video is required.");
    }

    public final void close() {
        mo13684b();
        this.f21124t.shutdown();
    }

    /* renamed from: a */
    public final boolean mo13683a() {
        boolean z;
        synchronized (this.f21107c) {
            z = this.f21109e == ipi.STARTED;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo13681a(File file) {
        try {
            this.f21106b = ioo.m12566a(file.getPath(), null, this.f21116l, this.f21119o, this.f21117m, this.f21118n);
            String str = "MediaMuxerMul";
            String str2 = "Create a new media muxer: ";
            String valueOf = String.valueOf(file.getPath());
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            Log.d(str, valueOf);
            ArrayList arrayList = new ArrayList();
            ioq ioq = this.f21111g;
            if (ioq.f7605a) {
                arrayList.add(ioq);
            }
            ioq = this.f21110f;
            if (ioq.f7605a) {
                arrayList.add(ioq);
            }
            ioq = this.f21112h;
            if (ioq.f7605a) {
                arrayList.add(ioq);
            }
            Collections.sort(arrayList);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                boolean z;
                int i2 = i + 1;
                ioq = (ioq) arrayList.get(i);
                if (((MediaMuxer) jri.m13404b(this.f21106b)).addTrack((MediaFormat) jri.m13404b(ioq.f7608d)) == ioq.mo8688a()) {
                    z = true;
                } else {
                    z = false;
                }
                jri.m13395a(z);
                i = i2;
            }
            this.f21120p = true;
        } catch (Throwable e) {
            Log.e("MediaMuxerMul", "Fail to create next video file", e);
            throw new IllegalStateException("Fail to create next video file", e);
        }
    }

    /* renamed from: a */
    public static MediaMuxer m12566a(String str, FileDescriptor fileDescriptor, int i, int i2, float f, float f2) {
        if (str == null && fileDescriptor == null) {
            throw new IllegalArgumentException("Either outputFilePath or outputFilePath should be provided.");
        }
        MediaMuxer a;
        if (fileDescriptor != null) {
            a = ion.m3995a(fileDescriptor, i);
            if (str != null) {
                Log.w("MediaMuxerMul", String.valueOf(str).concat(" is provided as output path but will be ignored as outputFilePathDescriptor is also provided."));
            }
        } else {
            a = ion.m3996a((String) jri.m13404b((Object) str), i);
        }
        a.setOrientationHint(i2);
        if (i == 0) {
            a.setLocation(f, f2);
        }
        return a;
    }

    /* renamed from: b */
    public final void mo13684b() {
        String valueOf;
        synchronized (this.f21107c) {
            if (this.f21109e == ipi.STARTED) {
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1);
                allocateDirect.put((byte) 0);
                BufferInfo bufferInfo = new BufferInfo();
                bufferInfo.set(0, 1, 0, 4);
                ioq ioq = this.f21112h;
                if (ioq.f7607c) {
                    if (ioq.f7606b) {
                        m12567a(allocateDirect, bufferInfo, ioq.mo8688a());
                        if (bufferInfo.size > 0) {
                            this.f21112h.f7607c = false;
                        }
                    } else {
                        Log.e("MediaMuxerMul", "metadata track is not supported");
                    }
                }
                if (this.f21111g.f7607c) {
                    mo13685b(allocateDirect, bufferInfo);
                }
                if (this.f21110f.f7607c) {
                    mo13682a(allocateDirect, bufferInfo);
                }
                try {
                    this.f21105a.stop();
                } catch (IllegalStateException e) {
                    valueOf = String.valueOf(e);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 26);
                    stringBuilder.append("Failed to stop mediamuxer ");
                    stringBuilder.append(valueOf);
                    Log.e("MediaMuxerMul", stringBuilder.toString());
                }
                Log.d("MediaMuxerMul", "stopped");
                this.f21109e = ipi.STOPPED;
            }
            if (this.f21109e != ipi.CLOSED) {
                try {
                    this.f21105a.release();
                } catch (IllegalStateException e2) {
                    valueOf = String.valueOf(e2);
                    StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 29);
                    stringBuilder2.append("Failed to release mediamuxer ");
                    stringBuilder2.append(valueOf);
                    Log.e("MediaMuxerMul", stringBuilder2.toString());
                }
                this.f21109e = ipi.CLOSED;
            }
        }
    }

    /* renamed from: d */
    private final void m12568d() {
        synchronized (this.f21107c) {
            Log.d("MediaMuxerMul", "switch to new media muxer");
            MediaMuxer mediaMuxer = this.f21105a;
            this.f21105a = (MediaMuxer) jri.m13404b(this.f21106b);
            this.f21105a.start();
            this.f21120p = false;
            this.f21124t.submit(new ipg(mediaMuxer));
            this.f21121q.post(new iph(this));
        }
    }

    /* renamed from: a */
    public final void mo13680a(long j) {
        Throwable e;
        try {
            this.f21122r.get(j, TimeUnit.MILLISECONDS);
            Log.d("MediaMuxerMul", "wait and started");
        } catch (InterruptedException e2) {
            e = e2;
            throw new RuntimeException("Wait for Muxer start is interrupted", e);
        } catch (ExecutionException e3) {
            e = e3;
            throw new RuntimeException("Wait for Muxer start is interrupted", e);
        } catch (TimeoutException e4) {
            StringBuilder stringBuilder = new StringBuilder(68);
            stringBuilder.append("Wait for muxer to start times out in ");
            stringBuilder.append(j);
            stringBuilder.append(" Milisecond");
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /* renamed from: c */
    public final void mo13686c() {
        Object obj = null;
        synchronized (this.f21107c) {
            if (this.f21109e == ipi.READY) {
                Object obj2;
                ioq ioq = this.f21110f;
                if (!ioq.f7605a) {
                    obj2 = 1;
                } else if (ioq.f7606b) {
                    int obj22 = 1;
                } else {
                    obj22 = null;
                }
                ioq = this.f21111g;
                Object obj3;
                if (!ioq.f7605a) {
                    obj3 = 1;
                } else if (ioq.f7606b) {
                    int obj32 = 1;
                } else {
                    obj32 = null;
                }
                ioq = this.f21112h;
                Object obj4;
                if (!ioq.f7605a) {
                    obj4 = 1;
                } else if (ioq.f7606b) {
                    int obj42 = 1;
                } else {
                    obj42 = null;
                }
                if (!(obj22 == null || obj32 == null || obj42 == null)) {
                    int obj5 = 1;
                }
                if (obj5 != null) {
                    this.f21105a.start();
                    this.f21109e = ipi.STARTED;
                    this.f21122r.mo15641a(null);
                    Log.d("MediaMuxerMul", "started");
                }
            } else if (this.f21109e == ipi.STOPPED) {
                Log.e("MediaMuxerMul", "Muxer is already stopped and it cannot be reused");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A:{SYNTHETIC, RETURN, Catch:{  }} */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bf  */
    /* renamed from: a */
    private final void m12567a(java.nio.ByteBuffer r11, android.media.MediaCodec.BufferInfo r12, int r13) {
        /*
        r10 = this;
        r8 = 0;
        r1 = r10.f21107c;
        monitor-enter(r1);
        r0 = r10.f21109e;	 Catch:{ all -> 0x0086 }
        r2 = p000.ipi.STARTED;	 Catch:{ all -> 0x0086 }
        if (r0 == r2) goto L_0x0045;
    L_0x000b:
        r0 = "MediaMuxerMul";
        r2 = p000.ipi.STARTED;	 Catch:{ all -> 0x0086 }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x0086 }
        r3 = r10.f21109e;	 Catch:{ all -> 0x0086 }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x0086 }
        r4 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x0086 }
        r4 = r4.length();	 Catch:{ all -> 0x0086 }
        r4 = r4 + 25;
        r5 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x0086 }
        r5 = r5.length();	 Catch:{ all -> 0x0086 }
        r4 = r4 + r5;
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0086 }
        r5.<init>(r4);	 Catch:{ all -> 0x0086 }
        r5.append(r2);	 Catch:{ all -> 0x0086 }
        r2 = " is expected, but we get ";
        r5.append(r2);	 Catch:{ all -> 0x0086 }
        r5.append(r3);	 Catch:{ all -> 0x0086 }
        r2 = r5.toString();	 Catch:{ all -> 0x0086 }
        android.util.Log.e(r0, r2);	 Catch:{ all -> 0x0086 }
        monitor-exit(r1);	 Catch:{ all -> 0x0086 }
    L_0x0044:
        return;
    L_0x0045:
        r2 = r10.f21107c;	 Catch:{ all -> 0x0086 }
        monitor-enter(r2);	 Catch:{ all -> 0x0086 }
        r4 = r10.f21123s;	 Catch:{ all -> 0x00e7 }
        r6 = 3700000000; // 0xdc898500 float:-3.09666455E17 double:1.8280428896E-314;
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 < 0) goto L_0x0079;
    L_0x0053:
        r0 = "MediaMuxerMul";
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00e7 }
        r6 = 65;
        r3.<init>(r6);	 Catch:{ all -> 0x00e7 }
        r6 = "Need to switch to new media muxer: file size=";
        r3.append(r6);	 Catch:{ all -> 0x00e7 }
        r3.append(r4);	 Catch:{ all -> 0x00e7 }
        r3 = r3.toString();	 Catch:{ all -> 0x00e7 }
        android.util.Log.d(r0, r3);	 Catch:{ all -> 0x00e7 }
        r0 = r10.f21121q;	 Catch:{ all -> 0x00e7 }
        r3 = new ipc;	 Catch:{ all -> 0x00e7 }
        r3.<init>(r10);	 Catch:{ all -> 0x00e7 }
        r0.post(r3);	 Catch:{ all -> 0x00e7 }
        r4 = 0;
        r10.f21123s = r4;	 Catch:{ all -> 0x00e7 }
    L_0x0079:
        r0 = r10.f21120p;	 Catch:{ all -> 0x00e7 }
        if (r0 != 0) goto L_0x00cb;
    L_0x007d:
        monitor-exit(r2);	 Catch:{ all -> 0x00e7 }
    L_0x007e:
        r2 = r12.presentationTimeUs;	 Catch:{ all -> 0x0086 }
        r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r0 >= 0) goto L_0x0089;
    L_0x0084:
        monitor-exit(r1);	 Catch:{ all -> 0x0086 }
        goto L_0x0044;
    L_0x0086:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0086 }
        throw r0;
    L_0x0089:
        r0 = r10.f21105a;	 Catch:{ IllegalArgumentException -> 0x00fd, IllegalStateException -> 0x00ea }
        r0.writeSampleData(r13, r11, r12);	 Catch:{ IllegalArgumentException -> 0x00fd, IllegalStateException -> 0x00ea }
        r0 = r10.f21113i;	 Catch:{ IllegalArgumentException -> 0x00fd, IllegalStateException -> 0x00ea }
        r2 = r12.size;	 Catch:{ IllegalArgumentException -> 0x00fd, IllegalStateException -> 0x00ea }
        r2 = (long) r2;	 Catch:{ IllegalArgumentException -> 0x00fd, IllegalStateException -> 0x00ea }
        r4 = r0.f7603c;	 Catch:{ IllegalArgumentException -> 0x00fd, IllegalStateException -> 0x00ea }
        r2 = r2 + r4;
        r0.f7603c = r2;	 Catch:{ IllegalArgumentException -> 0x00fd, IllegalStateException -> 0x00ea }
        r2 = r10.f21123s;	 Catch:{ IllegalArgumentException -> 0x00fd, IllegalStateException -> 0x00ea }
        r0 = r12.size;	 Catch:{ IllegalArgumentException -> 0x00fd, IllegalStateException -> 0x00ea }
        r4 = (long) r0;	 Catch:{ IllegalArgumentException -> 0x00fd, IllegalStateException -> 0x00ea }
        r2 = r2 + r4;
        r10.f21123s = r2;	 Catch:{ IllegalArgumentException -> 0x00fd, IllegalStateException -> 0x00ea }
    L_0x00a0:
        monitor-exit(r1);	 Catch:{ all -> 0x0086 }
        r0 = r10.f21113i;
        r2 = r0.f7603c;
        r0 = r0.f7601a;
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 < 0) goto L_0x00b5;
    L_0x00ab:
        r0 = r10.f21121q;
        r1 = new ipe;
        r1.<init>(r10);
        r0.post(r1);
    L_0x00b5:
        r0 = r10.f21113i;
        r2 = r0.f7604d;
        r0 = r0.f7602b;
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 < 0) goto L_0x0044;
    L_0x00bf:
        r0 = r10.f21121q;
        r1 = new ipf;
        r1.<init>(r10);
        r0.post(r1);
        goto L_0x0044;
    L_0x00cb:
        r0 = r10.f21111g;	 Catch:{ all -> 0x00e7 }
        r0 = r0.f7605a;	 Catch:{ all -> 0x00e7 }
        if (r0 != 0) goto L_0x00d4;
    L_0x00d1:
        r10.m12568d();	 Catch:{ all -> 0x00e7 }
    L_0x00d4:
        r0 = r10.f21111g;	 Catch:{ all -> 0x00e7 }
        r0 = r0.mo8688a();	 Catch:{ all -> 0x00e7 }
        if (r13 != r0) goto L_0x00e5;
    L_0x00dc:
        r0 = r12.flags;	 Catch:{ all -> 0x00e7 }
        r0 = r0 & 1;
        if (r0 == 0) goto L_0x00e5;
    L_0x00e2:
        r10.m12568d();	 Catch:{ all -> 0x00e7 }
    L_0x00e5:
        monitor-exit(r2);	 Catch:{ all -> 0x00e7 }
        goto L_0x007e;
    L_0x00e7:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x00e7 }
        throw r0;	 Catch:{ all -> 0x0086 }
    L_0x00ea:
        r0 = move-exception;
    L_0x00eb:
        r2 = "MediaMuxerMul";
        r3 = "Fail to write data to muxer";
        android.util.Log.e(r2, r3, r0);	 Catch:{ all -> 0x0086 }
        r0 = r10.f21121q;	 Catch:{ all -> 0x0086 }
        r2 = new ipd;	 Catch:{ all -> 0x0086 }
        r2.<init>(r10);	 Catch:{ all -> 0x0086 }
        r0.post(r2);	 Catch:{ all -> 0x0086 }
        goto L_0x00a0;
    L_0x00fd:
        r0 = move-exception;
        goto L_0x00eb;
        */
        throw new UnsupportedOperationException("Method not decompiled: ioo.a(java.nio.ByteBuffer, android.media.MediaCodec$BufferInfo, int):void");
    }

    /* renamed from: a */
    public final void mo13682a(ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        ioq ioq = this.f21110f;
        if (ioq.f7606b) {
            m12567a(byteBuffer, bufferInfo, ioq.mo8688a());
            if (bufferInfo.size > 0) {
                this.f21110f.f7607c = false;
                return;
            }
            return;
        }
        Log.e("MediaMuxerMul", "Audio track is not supported");
    }

    /* renamed from: b */
    public final void mo13685b(ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        ioq ioq = this.f21111g;
        if (ioq.f7606b) {
            m12567a(byteBuffer, bufferInfo, ioq.mo8688a());
            if (bufferInfo.size > 0) {
                this.f21111g.f7607c = false;
                this.f21121q.post(new ipb(this, bufferInfo));
                return;
            }
            return;
        }
        Log.e("MediaMuxerMul", "Video track is not supported");
    }
}
