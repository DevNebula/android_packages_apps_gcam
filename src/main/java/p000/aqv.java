package p000;

/* compiled from: PG */
/* renamed from: aqv */
public final class aqv implements arc {
    /* renamed from: a */
    private final int f10671a;
    /* renamed from: b */
    private final boolean f10672b = false;
    /* renamed from: c */
    private aqx f10673c;

    public aqv(int i) {
        this.f10671a = i;
    }

    /* renamed from: a */
    public final ara mo1722a(adf adf) {
        if (adf == adf.MEMORY_CACHE) {
            return aqy.f10676a;
        }
        if (this.f10673c == null) {
            this.f10673c = new aqx(this.f10671a, false);
        }
        return this.f10673c;
    }
}
