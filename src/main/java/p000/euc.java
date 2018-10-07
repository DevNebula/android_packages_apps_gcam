package p000;

/* renamed from: euc */
final /* synthetic */ class euc implements Runnable {
    /* renamed from: a */
    private final eua f4474a;
    /* renamed from: b */
    private final eux f4475b;

    euc(eua eua, eux eux) {
        this.f4474a = eua;
        this.f4475b = eux;
    }

    public final void run() {
        eua eua = this.f4474a;
        eux eux = this.f4475b;
        synchronized (eua.f4463a) {
            eua.f4468f.put(eux, Boolean.valueOf(false));
            if (eua.mo6592a()) {
                eua.f4464b.mo6603b(false);
                if (eua.f4469g) {
                    eua.mo6593b();
                }
            }
        }
    }
}
