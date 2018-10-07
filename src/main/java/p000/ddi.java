package p000;

/* compiled from: PG */
/* renamed from: ddi */
final class ddi implements dbw {
    /* renamed from: a */
    private final /* synthetic */ dcr f23836a;

    ddi(dcr dcr) {
        this.f23836a = dcr;
    }

    /* renamed from: a */
    public final /* synthetic */ bug mo2146a(Object obj) {
        dbi dbi = (dbi) obj;
        bug bug = this.f23836a;
        ((dbu) bug.mo2152d()).mo12982L().mo7038c();
        if (bug.f23824e) {
            bug.mo14842f();
        } else {
            int c = ((dbu) bug.mo2152d()).mo12989S().mo7299c("default_scope", "pref_camera_countdown_duration_key");
            dbn dbn = new dbn(dbi, c);
            if (c > 0) {
                bug.f23824e = true;
                ((dbu) bug.mo2152d()).mo12977G().execute(new ddg(bug, dbn, c));
            } else {
                bug.mo14841a(dbn);
            }
        }
        return null;
    }
}
