package p000;

/* compiled from: PG */
/* renamed from: fls */
final class fls implements fkz {
    /* renamed from: a */
    private final /* synthetic */ fly f18421a;
    /* renamed from: b */
    private final /* synthetic */ int f18422b;
    /* renamed from: c */
    private final /* synthetic */ flr f18423c;

    fls(flr flr, fly fly, int i) {
        this.f18423c = flr;
        this.f18421a = fly;
        this.f18422b = i;
    }

    /* renamed from: a */
    public final boolean mo6844a() {
        int intValue = ((Integer) this.f18423c.f18418a.mo6949c().mo13673b()).intValue();
        int intValue2 = ((Integer) this.f18421a.f26360a.mo13673b()).intValue();
        if (intValue > intValue2) {
            return true;
        }
        if (intValue2 > this.f18422b) {
            return true;
        }
        return false;
    }
}
