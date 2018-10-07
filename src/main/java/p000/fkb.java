package p000;

/* compiled from: PG */
/* renamed from: fkb */
final class fkb implements kov {
    /* renamed from: a */
    private final /* synthetic */ fjz f18352a;

    fkb(fjz fjz) {
        this.f18352a = fjz;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        throw new AssertionError(th);
    }

    /* renamed from: b_ */
    public final void mo10186b_(Object obj) {
        synchronized (this.f18352a.f18342c) {
            this.f18352a.f18345f = true;
        }
        this.f18352a.mo13256a();
    }
}
