package p000;

import android.media.MediaFormat;
import android.media.MediaMuxer;

/* renamed from: jha */
final /* synthetic */ class jha implements Runnable {
    /* renamed from: a */
    private final jgz f8191a;
    /* renamed from: b */
    private final jhe f8192b;
    /* renamed from: c */
    private final kpw f8193c;

    jha(jgz jgz, jhe jhe, kpw kpw) {
        this.f8191a = jgz;
        this.f8192b = jhe;
        this.f8193c = kpw;
    }

    public final void run() {
        this.f8193c.mo15641a(Integer.valueOf(((MediaMuxer) kow.m13881c(this.f8191a.f21483f)).addTrack((MediaFormat) kow.m13881c(this.f8192b.f8198a))));
    }
}
