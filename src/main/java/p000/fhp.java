package p000;

/* compiled from: PG */
/* renamed from: fhp */
public final class fhp implements fhg {
    /* renamed from: a */
    private final kpk f18292a;
    /* renamed from: b */
    private final ilp f18293b;

    public fhp(kpk kpk) {
        this.f18292a = kpk;
        ilp a = ilq.m3879a(kpk);
        kow.m13878a(kpk, new fmx(new ilb(ilq.m3876a(Boolean.valueOf(false)))), kpq.f8776a);
        this.f18293b = ilq.m3892b(a, ilq.m3872a(r1));
    }

    /* renamed from: a */
    public final fhh mo6790a() {
        try {
            return ((fhg) this.f18292a.get()).mo6790a();
        } catch (Throwable e) {
            throw new isr(e);
        }
    }

    /* renamed from: b */
    public final ilp mo6791b() {
        return this.f18293b;
    }
}
