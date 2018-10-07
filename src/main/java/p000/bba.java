package p000;

/* compiled from: PG */
/* renamed from: bba */
final class bba implements kov {
    /* renamed from: a */
    private final /* synthetic */ bax f11150a;

    bba(bax bax) {
        this.f11150a = bax;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        iks iks = this.f11150a.f1082d;
        if (iks != null) {
            iks.mo8593b(th);
        }
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        Boolean bool = (Boolean) obj;
        if (!(this.f11150a.f1081c == null || bool == null || !bool.booleanValue())) {
            this.f11150a.f1081c.mo8836d("Initialization completed.");
        }
        if (this.f11150a.f1081c != null && bool != null && !bool.booleanValue()) {
            this.f11150a.f1081c.mo8838f("Initialization failed! One of the tasks did not succeed.");
        }
    }
}
