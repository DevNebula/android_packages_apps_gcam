package p000;

/* compiled from: PG */
/* renamed from: fkn */
final class fkn implements kov {
    /* renamed from: a */
    private final /* synthetic */ long f18372a;
    /* renamed from: b */
    private final /* synthetic */ fkm f18373b;

    fkn(fkm fkm, long j) {
        this.f18373b = fkm;
        this.f18372a = j;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        synchronized (this.f18373b.f18371b) {
            this.f18373b.f18370a.remove(Long.valueOf(this.f18372a));
        }
    }
}
