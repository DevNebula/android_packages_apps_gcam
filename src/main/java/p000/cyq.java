package p000;

import android.view.accessibility.AccessibilityManager;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* renamed from: cyq */
final class cyq implements kov {
    /* renamed from: a */
    private final /* synthetic */ bcl f13481a;
    /* renamed from: b */
    private final /* synthetic */ ikb f13482b;
    /* renamed from: c */
    private final /* synthetic */ cyd f13483c;

    cyq(cyd cyd, bcl bcl, ikb ikb) {
        this.f13483c = cyd;
        this.f13481a = bcl;
        this.f13482b = ikb;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        if (th instanceof CancellationException) {
            bli.m894c(cyd.f25814c, "OneCamera open sequence was canceled, shutting down lifetime.");
        } else {
            bli.m899e(cyd.f25814c, "OneCamera failed to open, closing lifetime.", th);
        }
        this.f13482b.close();
        if (this.f13483c.f25889p.mo9709b()) {
            ((fbd) this.f13483c.f25889p.mo9706a()).mo6713a();
        }
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        fbj fbj = (fbj) obj;
        jri.m13404b((Object) fbj);
        bli.m894c(cyd.f25814c, "OneCamera started!");
        if (!this.f13481a.f11172a.get()) {
            bli.m894c(cyd.f25814c, "OneCamera started, updating UI!");
            cyd cyd = this.f13483c;
            ikb ikb = this.f13482b;
            jri.m13404b((Object) fbj);
            fbj fbj2 = cyd.f25896w;
            if (fbj2 == null || fbj2 != fbj || cyd.f25821G) {
                cyd.f25896w = fbj;
                cyd.mo15489o();
                if (cyd.f25877d.mo13673b() == fxj.AUTO) {
                    cyd.mo15490p();
                }
                cyd.f25821G = false;
                if (cyd.f25889p.mo9709b()) {
                    ((fbd) cyd.f25889p.mo9706a()).mo6714a(cyd.f25896w.mo13214a().f4689h);
                }
                cyd.f25895v = null;
                ikb.mo8557a(cyd.f25896w);
                fbp a = cyd.f25896w.mo13214a();
                ilp a2 = ilq.m3875a(ilq.m3880a(a.f4690i, a.f4682a, cyd.f25835U), new cyk(cyd));
                asu asu = cyd.f25837W;
                asn asn = cyd.f25896w;
                ikb.mo8557a(asu.mo1787a(asn, cyd.f25897x, asn.mo13214a().f4684c, kbg.m4804c(cyd.f25896w.mo13214a().f4686e), a2));
                bli.m894c(cyd.f25814c, "OneCamera created, preparing to start OneCamera");
                cyd.f25892s.mo12481l();
                ebd.m9761i();
                cyd.f25892s.mo12481l().mo13120c();
                cyd.f25892s.mo12481l().mo13119b(true);
                cyd.f25892s.mo12481l().mo13129h();
                cyd.f25892s.mo12481l().mo13128g();
                ((ayb) cyd.f25819E.mo10566a()).mo1842a(cyd.f25897x.mo9065d());
                a = cyd.f25896w.mo13214a();
                cyd.f25824J.mo14837c(a.f4682a);
                ikb.mo8557a(a2.mo13672a(new cyl(cyd), cyd.f25878e));
                ikb.mo8557a(a.f4685d.mo13672a(new cym(cyd), cyd.f25878e));
                ikb.mo8557a(a.f4683b.mo13672a(new cyn(cyd), cyd.f25878e));
                AccessibilityManager accessibilityManager = cyd.f25818D;
                bqq bqq = cyd.f25815A;
                ffc ffc = cyd.f25897x;
                gci gci = cyd.f25879f;
                cwc cwc = cyd.f25894u;
                brp brp = cyd.f25892s.mo12481l().f17181m;
                bsn bsn = cyd.f25817C;
                bmb bmb = cyd.f25887n;
                cyd.f25816B = new czp(accessibilityManager, bqq, ffc, gci, cwc, brp, false, cyd.f25897x.mo9076o());
                ikb.mo8557a(cyd.f25896w.mo13214a().f4686e.mo13672a(cyd.f25816B, cyd.f25878e));
                cyd.f25816B.mo12948a(cyd.f25894u.f3023d.f6471a);
                cyd.mo15487m();
                if (!((Boolean) cyd.f25836V.f24630c).booleanValue()) {
                    cyd.f25836V.mo8826a(Boolean.valueOf(true));
                }
            }
        }
    }
}
