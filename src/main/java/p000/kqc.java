package p000;

/* compiled from: PG */
/* renamed from: kqc */
final class kqc extends kpi {
    /* renamed from: c */
    private final koi f21947c;
    /* renamed from: d */
    private final /* synthetic */ kqb f21948d;

    kqc(kqb kqb, koi koi) {
        this.f21948d = kqb;
        this.f21947c = (koi) jri.m13404b((Object) koi);
    }

    /* renamed from: a */
    final /* synthetic */ void mo10193a(Object obj, Throwable th) {
        kpk kpk = (kpk) obj;
        if (th == null) {
            this.f21948d.mo15644b(kpk);
        } else {
            this.f21948d.mo15642a(th);
        }
    }

    /* renamed from: a */
    final boolean mo10194a() {
        return this.f21948d.isDone();
    }

    /* renamed from: b */
    final /* synthetic */ Object mo10195b() {
        return (kpk) jri.m13391a(this.f21947c.mo10182a(), (Object) "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)?");
    }

    /* renamed from: c */
    final String mo10196c() {
        return this.f21947c.toString();
    }
}
