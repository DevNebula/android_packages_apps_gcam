package p000;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: kqd */
final class kqd extends kpi {
    /* renamed from: c */
    private final Callable f21949c;
    /* renamed from: d */
    private final /* synthetic */ kqb f21950d;

    kqd(kqb kqb, Callable callable) {
        this.f21950d = kqb;
        this.f21949c = (Callable) jri.m13404b((Object) callable);
    }

    /* renamed from: a */
    final void mo10193a(Object obj, Throwable th) {
        if (th == null) {
            this.f21950d.mo15641a(obj);
        } else {
            this.f21950d.mo15642a(th);
        }
    }

    /* renamed from: a */
    final boolean mo10194a() {
        return this.f21950d.isDone();
    }

    /* renamed from: b */
    final Object mo10195b() {
        return this.f21949c.call();
    }

    /* renamed from: c */
    final String mo10196c() {
        return this.f21949c.toString();
    }
}
