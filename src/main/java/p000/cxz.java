package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: cxz */
public final class cxz extends bcs {
    /* renamed from: d */
    public static final String f23711d = bli.m887a("CaptureUiStartup");
    /* renamed from: e */
    public final kwa f23712e;
    /* renamed from: f */
    public final ird f23713f;
    /* renamed from: g */
    private final kwa f23714g;
    /* renamed from: h */
    private final kpw f23715h;
    /* renamed from: i */
    private final kpk f23716i;
    /* renamed from: j */
    private final ikd f23717j;
    /* renamed from: k */
    private final hek f23718k;
    /* renamed from: l */
    private final Executor f23719l;
    /* renamed from: m */
    private final hjf f23720m;

    public cxz(aws aws, kwa kwa, kwa kwa2, kpw kpw, kpk kpk, hek hek, ikd ikd, Executor executor, ird ird, hjf hjf) {
        super(aws);
        this.f23714g = kwa;
        this.f23712e = kwa2;
        this.f23715h = kpw;
        this.f23716i = kpk;
        this.f23717j = ikd;
        this.f23718k = hek;
        this.f23719l = executor;
        this.f23713f = ird;
        this.f23720m = hjf;
    }

    /* renamed from: c */
    protected final void mo12354c() {
        this.f23713f.mo8856a("CaptureModuleInit#initialize");
        this.f23719l.execute(new cya(this));
        this.f23713f.mo8856a("CameraActivityUi#inflate");
        this.f23714g.mo10562a();
        this.f23713f.mo8857b();
        kow.m13878a(this.f23716i, new cyb(this), this.f23717j);
        this.f23715h.mo15641a(this.f23718k);
        this.f23713f.mo8857b();
        if (this.f23720m.mo7905c() || this.f23720m.mo7906d()) {
            mo12353b();
        }
    }
}
