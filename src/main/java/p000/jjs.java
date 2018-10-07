package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jjs */
final class jjs implements jau {
    /* renamed from: a */
    public final jrg f21558a;
    /* renamed from: b */
    public final float f21559b;
    /* renamed from: c */
    public final jqo f21560c;
    /* renamed from: d */
    public final jqr f21561d;

    public jjs(jrg jrg, float f, jqo jqo, jqr jqr) {
        jri.m13404b((Object) jrg);
        jri.m13404b((Object) jqo);
        jri.m13404b((Object) jqr);
        this.f21558a = jrg;
        this.f21559b = f;
        this.f21560c = jqo;
        this.f21561d = jqr;
    }

    /* renamed from: a */
    public final /* synthetic */ jaq mo9286a(Object obj, Executor executor) {
        obj = (jkq) obj;
        jri.m13404b(obj);
        return jli.m13199b(Long.valueOf(obj.f8261b)).mo9277a(executor, new jjt(this)).mo9275a(executor, new jju(this, obj));
    }
}
