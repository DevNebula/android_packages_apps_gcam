package p000;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* renamed from: fmg */
public final class fmg {
    /* renamed from: a */
    public final fjk f4851a;
    /* renamed from: b */
    private final fjm f4852b;

    public fmg(fjm fjm) {
        this.f4852b = fjm;
        this.f4851a = fjm.mo6835a(new fjm[0]);
    }

    /* renamed from: a */
    public final fko mo6850a(int i) {
        Throwable e;
        fjl a = this.f4851a.mo6830a();
        try {
            a.mo14893a(i).get();
            return new fmi(a);
        } catch (InterruptedException e2) {
            e = e2;
            a.close();
            throw new isr(e);
        } catch (ExecutionException e3) {
            e = e3;
            a.close();
            throw new isr(e);
        }
    }

    /* renamed from: a */
    public final ilp mo6851a() {
        return this.f4851a.mo6832b();
    }

    /* renamed from: b */
    public final int mo6852b() {
        return this.f4852b.mo6834a();
    }
}
