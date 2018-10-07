package p000;

/* compiled from: PG */
/* renamed from: bjm */
final class bjm implements kov {
    /* renamed from: a */
    private final /* synthetic */ iop f11469a;
    /* renamed from: b */
    private final /* synthetic */ kpw f11470b;
    /* renamed from: c */
    private final /* synthetic */ bjl f11471c;

    bjm(bjl bjl, iop iop, kpw kpw) {
        this.f11471c = bjl;
        this.f11469a = iop;
        this.f11470b = kpw;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        this.f11470b.mo15642a(th);
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        try {
            synchronized (this.f11471c.f22788b) {
                if (this.f11471c.f22789c) {
                    return;
                }
                this.f11471c.f22787a.mo1968a(this.f11469a);
                this.f11470b.mo15641a(null);
            }
        } catch (Throwable e) {
            this.f11470b.mo15642a(e);
        }
    }
}
