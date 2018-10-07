package p000;

import java.util.concurrent.Callable;

/* renamed from: eqc */
final /* synthetic */ class eqc implements Callable {
    /* renamed from: a */
    private final eqb f4306a;
    /* renamed from: b */
    private final epv f4307b;

    eqc(eqb eqb, epv epv) {
        this.f4306a = eqb;
        this.f4307b = epv;
    }

    public final Object call() {
        eqb eqb = this.f4306a;
        return eqb.f17623b.insert(eqb.f17622a, this.f4307b.f4295a);
    }
}
