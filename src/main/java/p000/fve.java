package p000;

import com.google.googlex.gcam.androidutils.camera2.BlockingCameraManager;

/* compiled from: PG */
/* renamed from: fve */
public final class fve implements kwk {
    /* renamed from: a */
    private final kwk f18818a;

    private fve(kwk kwk) {
        this.f18818a = kwk;
    }

    /* renamed from: a */
    public static fve m11005a(kwk kwk) {
        return new fve(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        fvh fvh = (fvh) this.f18818a.mo10566a();
        ikb ikb = new ikb();
        iqo b = fvh.mo8558b();
        b.mo8557a(new bbx(new bbv("DelLifetime", BlockingCameraManager.OPEN_TIME_OUT_MS), ikb));
        ikb.mo8557a(b);
        return (ikb) ktm.m14219a(ikb, "Cannot return null from a non-@Nullable @Provides method");
    }
}
