package p000;

/* compiled from: PG */
/* renamed from: fxd */
public final class fxd extends imt {
    /* renamed from: a */
    private final fxi f26384a;
    /* renamed from: b */
    private boolean f26385b;

    public fxd(ilp ilp, ffc ffc, fxi fxi) {
        super(ilp);
        this.f26385b = ffc.mo9082u();
        this.f26384a = fxi;
    }

    /* renamed from: b */
    protected final /* synthetic */ Object mo15011b(Object obj) {
        String str = (String) obj;
        if (this.f26385b) {
            return fxi.m2463a(str, this.f26384a);
        }
        return fxi.OFF;
    }

    /* renamed from: c */
    protected final /* synthetic */ Object mo15012c(Object obj) {
        return ((fxi) obj).f5016d;
    }
}
