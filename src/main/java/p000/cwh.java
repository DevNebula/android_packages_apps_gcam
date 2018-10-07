package p000;

/* compiled from: PG */
/* renamed from: cwh */
public final class cwh implements fbj {
    /* renamed from: a */
    public final ikb f23699a;
    /* renamed from: b */
    public final cwc f23700b;
    /* renamed from: c */
    public final ffc f23701c;
    /* renamed from: d */
    private final fbj f23702d;

    public cwh(fbj fbj, ikb ikb, cwc cwc, ffc ffc) {
        jri.m13404b((Object) fbj);
        jri.m13404b((Object) ikb);
        jri.m13404b((Object) cwc);
        jri.m13404b((Object) ffc);
        this.f23702d = fbj;
        this.f23699a = ikb;
        this.f23700b = cwc;
        this.f23701c = ffc;
    }

    public final void close() {
        this.f23702d.close();
        this.f23699a.close();
    }

    /* renamed from: a */
    public final fbp mo13214a() {
        return this.f23702d.mo13214a();
    }

    /* renamed from: b */
    public final ilp mo14832b() {
        return this.f23702d.mo13214a().f4682a;
    }

    /* renamed from: c */
    public final boolean mo13216c() {
        return this.f23699a.mo13666a();
    }

    /* renamed from: d */
    public final kpk mo13217d() {
        return this.f23702d.mo13217d();
    }

    /* renamed from: a */
    public final kpk mo13215a(fbk fbk, gkr gkr) {
        return this.f23702d.mo13215a(fbk, gkr);
    }

    /* renamed from: a */
    public final aub mo1782a(asw asw) {
        return this.f23702d.mo1782a(asw);
    }
}
