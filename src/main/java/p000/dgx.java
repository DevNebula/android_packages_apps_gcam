package p000;

import android.view.accessibility.AccessibilityManager;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: dgx */
final class dgx implements kov {
    /* renamed from: a */
    public final /* synthetic */ dgl f13809a;

    dgx(dgl dgl) {
        this.f13809a = dgl;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        cwh cwh = (cwh) obj;
        dgl dgl = this.f13809a;
        dgl.f23920z = cwh;
        dgl.f23897c.mo12481l();
        ebd.m9761i();
        this.f13809a.f23897c.mo12481l().mo13120c();
        this.f13809a.f23897c.mo12481l().mo13129h();
        this.f13809a.f23869A.mo8557a(cwh.mo14832b().mo13672a(new dgy(this), this.f13809a.f23898d));
        dgl dgl2 = this.f13809a;
        dgl2.f23869A.mo8557a(dgl2.f23920z.mo13214a().f4686e.mo13672a(dgl2.f23879K, Executors.newSingleThreadExecutor(iel.m3778c("PortFcDet", 0))));
        dgl2.f23874F = dgl2.f23920z.mo13214a().f4687f;
        cwh cwh2 = dgl2.f23920z;
        cwc cwc = cwh2.f23700b;
        AccessibilityManager accessibilityManager = dgl2.f23912r;
        bqq bqq = dgl2.f23913s;
        ffc ffc = cwh2.f23701c;
        gci gci = dgl2.f23911q;
        brp brp = dgl2.f23914t;
        bsn bsn = dgl2.f23910p;
        bmb bmb = dgl2.f23909o;
        dgl2.f23873E = new czp(accessibilityManager, bqq, ffc, gci, cwc, brp, false, ffc.mo9076o());
        dgl2.f23869A.mo8557a(dgl2.f23920z.mo13214a().f4686e.mo13672a(dgl2.f23873E, dgl2.f23898d));
        dgl2.f23873E.mo12948a(cwc.f3023d.f6471a);
        iqo a = this.f13809a.f23902h.mo1787a(cwh, cwh.f23701c, cwh.mo13214a().f4684c, kbg.m4804c(cwh.mo13214a().f4686e), this.f13809a.f23906l);
        this.f13809a.f23869A.mo8557a(cwh.mo13214a().f4684c.mo13672a(new dgz(this), Executors.newSingleThreadExecutor(iel.m3778c("PortAfCb", 0))));
        this.f13809a.f23869A.mo8557a(a);
        if (cwh != null && this.f13809a.f23905k.mo9709b()) {
            ((fbd) this.f13809a.f23905k.mo9706a()).mo6714a(cwh.mo13214a().f4689h);
        }
        dgl = this.f13809a;
        dgl.f23898d.execute(new dgr(dgl));
    }
}
