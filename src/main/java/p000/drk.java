package p000;

/* compiled from: PG */
/* renamed from: drk */
public final class drk extends imq {
    /* renamed from: b */
    private final fwl f26160b;
    /* renamed from: c */
    private final fwl f26161c;
    /* renamed from: d */
    private final fwl f26162d;
    /* renamed from: e */
    private final fwl f26163e;
    /* renamed from: f */
    private final fwl f26164f;

    static {
        bli.m887a("ZslHdrPSelect");
    }

    public drk(ilp ilp, fwl fwl, fwl fwl2, fwl fwl3, fwl fwl4, fwl fwl5) {
        super(ilp);
        this.f26160b = fwl;
        this.f26161c = fwl2;
        this.f26162d = fwl3;
        this.f26163e = fwl4;
        this.f26164f = fwl5;
    }

    /* renamed from: b */
    protected final /* synthetic */ Object mo15010b(Object obj) {
        fxo fxo = (fxo) obj;
        switch (fxo.ordinal()) {
            case 0:
                return this.f26160b;
            case 1:
                return this.f26161c;
            case 2:
                return this.f26162d;
            case 3:
                return this.f26163e;
            case 4:
                return this.f26164f;
            default:
                String valueOf = String.valueOf(fxo);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 48);
                stringBuilder.append("Invalid AutoHdrPlusRecommendation enum instance:");
                stringBuilder.append(valueOf);
                throw new AssertionError(stringBuilder.toString());
        }
    }
}
