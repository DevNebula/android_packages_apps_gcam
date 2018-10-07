package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jsy */
public final class jsy implements jau {
    /* renamed from: a */
    private final jqo f21713a;
    /* renamed from: b */
    private final /* synthetic */ jsw f21714b;

    public jsy(jsw jsw, jqo jqo) {
        this.f21714b = jsw;
        this.f21713a = jqo;
    }

    /* renamed from: a */
    public final /* synthetic */ jaq mo9286a(Object obj, Executor executor) {
        Long l = (Long) obj;
        return this.f21714b.f8320d.mo13829b(l.longValue()).mo9275a(executor, new jsz(this.f21714b, l.longValue(), this.f21713a));
    }
}
