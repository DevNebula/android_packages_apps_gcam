package p000;

import java.util.Collections;

/* compiled from: PG */
/* renamed from: drf */
public final class drf implements kwk {
    /* renamed from: a */
    private final kwk f16529a;
    /* renamed from: b */
    private final kwk f16530b;
    /* renamed from: c */
    private final kwk f16531c;

    private drf(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f16529a = kwk;
        this.f16530b = kwk2;
        this.f16531c = kwk3;
    }

    /* renamed from: a */
    public static drf m9440a(kwk kwk, kwk kwk2, kwk kwk3) {
        return new drf(kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f16529a;
        kwk kwk2 = this.f16530b;
        drg drg = (drg) kwk.mo10566a();
        dst dst = (dst) kwk2.mo10566a();
        dsq dsq = (dsq) this.f16531c.mo10566a();
        dsw dsw = new dsw(new drs(dsq.f3489a, dsq.f3490b, dsq.f3497i, dsq.f3491c, dsq.f3492d, dsq.f3493e, kny.m18475a(dsq.f3493e, new dsr(fds.m10411a()), kpq.f8776a), dsq.f3494f, dsq.f3495g, dsq.f3496h, dsq.f3498j, 1), 2, false);
        fdh fdh = fdh.ANY;
        fdg fdg = new fdg(fdh, fdh, fdh);
        if (dst.f3505g.mo9080s()) {
            fdg.mo6756b(fdh.LOCKED);
        }
        dsw dsw2 = dsw;
        return (fwl) ktm.m14219a(drg.mo6047a(new dsw(new dtx(dst.f3500b, dst.f3499a, dst.f3501c.mo6779a(1, new fju(dst.f3504f.mo6048a(100000000), new fjt())), dst.f3503e, dsw2, new dts(fdg), dst.f3506h, 1, 1, 100000000, Collections.emptySet(), dst.f3502d), 3, false)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
