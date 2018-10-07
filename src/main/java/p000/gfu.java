package p000;

import android.content.Context;

/* compiled from: PG */
/* renamed from: gfu */
public final class gfu implements gft {
    /* renamed from: c */
    private static final String f24346c = bli.m887a("ImageShadowTask");
    /* renamed from: a */
    public final ghh f24347a;
    /* renamed from: b */
    public final Runnable f24348b;
    /* renamed from: d */
    private final get f24349d;

    public gfu(ghh ghh, get get, kbg kbg) {
        this.f24347a = ghh;
        this.f24349d = get;
        this.f24348b = (Runnable) kbg.mo9710c();
    }

    public gfu(gkr gkr) {
        this(new ghh().mo7130b(1), gkr, kau.f21835a);
    }

    public final void addFinishedCallback(iqb iqb) {
        throw new RuntimeException("Not implemented yet");
    }

    public final get getSession() {
        return this.f24349d;
    }

    public final void process(Context context) {
        try {
            this.f24347a.mo7128a();
        } catch (InterruptedException e) {
            bli.m898e(f24346c, "Image Shadow task Interrupted.");
        }
    }

    public final void removeFinishedCallback(iqb iqb) {
        throw new RuntimeException("Not implemented yet");
    }

    public final void resume() {
    }

    public final void suspend() {
    }

    /* renamed from: a */
    public final void mo13344a() {
        this.f24347a.mo7130b(0);
        this.f24347a.mo7131c();
    }
}
