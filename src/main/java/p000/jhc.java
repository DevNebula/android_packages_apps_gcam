package p000;

import android.media.MediaMuxer;

/* renamed from: jhc */
final /* synthetic */ class jhc implements Runnable {
    /* renamed from: a */
    private final jgz f8195a;
    /* renamed from: b */
    private final kpk f8196b;

    jhc(jgz jgz, kpk kpk) {
        this.f8195a = jgz;
        this.f8196b = kpk;
    }

    public final void run() {
        jgz jgz = this.f8195a;
        if (!this.f8196b.isCancelled()) {
            MediaMuxer mediaMuxer = (MediaMuxer) kow.m13881c(jgz.f21483f);
            for (Runnable run : jgz.f21486i) {
                run.run();
            }
            jgz.f21486i.clear();
            mediaMuxer.start();
            jgz.f21484g.mo15641a(Boolean.valueOf(true));
        }
    }
}
