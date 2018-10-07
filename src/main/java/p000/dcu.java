package p000;

/* compiled from: PG */
/* renamed from: dcu */
final class dcu implements dbw {
    /* renamed from: a */
    private final /* synthetic */ dcr f23833a;

    dcu(dcr dcr) {
        this.f23833a = dcr;
    }

    /* renamed from: a */
    public final /* synthetic */ bug mo2146a(Object obj) {
        dau dau = (dau) obj;
        switch (dau.f3120a) {
            case 27:
                dcr dcr = this.f23833a;
                if (!dcr.f23824e) {
                    if (dau.f3121b.getRepeatCount() == 0) {
                        bug bug = this.f23833a;
                        dbi dbi = new dbi(null, false);
                        ((dbu) bug.mo2152d()).mo12982L().mo7038c();
                        if (!bug.f23824e) {
                            int c = ((dbu) bug.mo2152d()).mo12989S().mo7299c("default_scope", "pref_camera_countdown_duration_key");
                            dbn dbn = new dbn(dbi, c);
                            if (c <= 0) {
                                bug.mo14841a(dbn);
                                break;
                            }
                            bug.f23824e = true;
                            ((dbu) bug.mo2152d()).mo12977G().execute(new ddg(bug, dbn, c));
                            break;
                        }
                        bug.mo14842f();
                        break;
                    }
                }
                dcr.mo14842f();
                break;
                break;
        }
        return null;
    }
}
