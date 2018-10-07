package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: cxm */
public final class cxm implements ijk {
    /* renamed from: a */
    public static final String f13428a = bli.m887a("CaptureModeStartup");
    /* renamed from: b */
    public final ird f13429b;
    /* renamed from: c */
    public final cwc f13430c;
    /* renamed from: d */
    public final kpk f13431d;
    /* renamed from: e */
    public final kpw f13432e;
    /* renamed from: f */
    public final kwa f13433f;
    /* renamed from: g */
    public final gjk f13434g;
    /* renamed from: h */
    private final Executor f13435h;
    /* renamed from: i */
    private final irh f13436i;
    /* renamed from: j */
    private final ced f13437j;

    public cxm(irh irh, Executor executor, ced ced, cwc cwc, kpk kpk, kpw kpw, kwa kwa, ird ird, gjk gjk) {
        this.f13435h = executor;
        this.f13436i = irh;
        this.f13437j = ced;
        this.f13430c = cwc;
        this.f13431d = kpk;
        this.f13432e = kpw;
        this.f13433f = kwa;
        this.f13429b = ird;
        this.f13434g = gjk;
    }

    /* renamed from: a */
    public final kpk mo8560a() {
        this.f13429b.mo8856a("CaptureModeStartup");
        this.f13429b.mo8856a("CameraDevice#prewarm");
        this.f13436i.mo8867a(this.f13437j.f1888a, new isl());
        this.f13429b.mo8858b("OneCameraCreator#resolve");
        kpk d = kpw.m18486d();
        this.f13435h.execute(new cxp(this, d));
        this.f13429b.mo8858b("OneCameraCreator#setupCreateAndStart");
        kow.m13878a(kny.m18476a(d, new cxn(this), kpq.f8776a), new cxo(this), kpq.f8776a);
        this.f13429b.mo8857b();
        this.f13429b.mo8857b();
        return kow.m13873a(Boolean.valueOf(true));
    }
}
