package p000;

import android.view.accessibility.AccessibilityManager;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: dck */
final class dck implements dbw {
    /* renamed from: a */
    public final /* synthetic */ dch f23820a;

    dck(dch dch) {
        this.f23820a = dch;
    }

    /* renamed from: a */
    public final /* synthetic */ bug mo2146a(Object obj) {
        daw daw = (daw) obj;
        fbj fbj = daw.f3122a;
        bug bug = this.f23820a;
        if (bug.f23813h) {
            fbj.close();
            return new dbx(this.f23820a, (byte) 0);
        }
        ikb b = ((dbu) bug.mo2152d()).mo13005l().mo8941b();
        ((dbu) this.f23820a.mo2152d()).mo12977G().execute(new dcm(this, b));
        b.mo8557a(((dbu) this.f23820a.mo2152d()).mo12971A().mo1787a(fbj, this.f23820a.f23811f, fbj.mo13214a().f4684c, kbg.m4804c(fbj.mo13214a().f4686e), ilq.m3876a(Boolean.valueOf(false))));
        cwc cwc = daw.f3123b;
        AccessibilityManager a = ((dbu) this.f23820a.mo2152d()).mo12994a();
        bqq t = ((dbu) this.f23820a.mo2152d()).mo13013t();
        bug = this.f23820a;
        ffc ffc = bug.f23811f;
        gci L = ((dbu) bug.mo2152d()).mo12982L();
        brp brp = ((dbu) this.f23820a.mo2152d()).mo12998e().mo12481l().f17181m;
        ((dbu) this.f23820a.mo2152d()).mo13017x();
        ((dbu) this.f23820a.mo2152d()).mo13009p();
        Object czp = new czp(a, t, ffc, L, cwc, brp, false, this.f23820a.f23811f.mo9076o());
        b.mo8557a(fbj.mo13214a().f4686e.mo13672a(czp, ((dbu) this.f23820a.mo2152d()).mo12977G()));
        czp.mo12948a(cwc.f3023d.f6471a);
        b.mo8557a(fbj.mo13214a().f4689h.mo13672a(new dcl(this), Executors.newSingleThreadExecutor(iel.m3778c("IntHdrFl", 0))));
        dch dch = this.f23820a;
        iur iur = dch.f23810e;
        return new dei(this.f23820a, dbo.m15548a(new dbs(fbj, dch.f23809d, dch.f23811f, dch.f23812g, dch.f23814i, dch.f23816k, b), ((dbu) this.f23820a.mo2152d()).mo12996c(), ((dbu) this.f23820a.mo2152d()).mo13015v(), ((dbu) this.f23820a.mo2152d()).mo13016w(), ((dbu) this.f23820a.mo2152d()).mo12977G(), ((dbu) this.f23820a.mo2152d()).mo13004k(), ((dbu) this.f23820a.mo2152d()).mo12978H(), ((dbu) this.f23820a.mo2152d()).mo12976F(), ((dbu) this.f23820a.mo2152d()).mo12982L(), ((dbu) this.f23820a.mo2152d()).mo12997d(), ((dbu) this.f23820a.mo2152d()).mo12972B(), ((dbu) this.f23820a.mo2152d()).mo12990T(), ((dbu) this.f23820a.mo2152d()).mo13007n(), ((dbu) this.f23820a.mo2152d()).mo12987Q()));
    }
}
