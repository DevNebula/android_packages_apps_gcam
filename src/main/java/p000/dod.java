package p000;

/* compiled from: PG */
/* renamed from: dod */
public final class dod extends imq {
    /* renamed from: b */
    private final boolean f26159b;

    public dod(boolean z, ilp ilp) {
        super(ilp);
        this.f26159b = z;
    }

    /* renamed from: b */
    protected final /* synthetic */ Object mo15010b(Object obj) {
        Boolean bool = (Boolean) obj;
        if (this.f26159b) {
            return jmr.HYBRID_BURST;
        }
        if (bool.booleanValue()) {
            return jmr.SMART_BURST;
        }
        return jmr.FIXED_FPS;
    }
}
