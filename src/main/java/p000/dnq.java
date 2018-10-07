package p000;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: dnq */
final class dnq implements dob {
    /* renamed from: a */
    public final /* synthetic */ dnl f24035a;

    dnq(dnl dnl) {
        this.f24035a = dnl;
    }

    /* renamed from: a */
    public final /* synthetic */ bug mo2146a(Object obj) {
        ((doa) this.f24035a.mo2152d()).f14235b.f3329c.f23982a.setVisibility(8);
        bug bug = this.f24035a;
        bgl bgl = bug.f24029d;
        if (bgl != null) {
            bgl.f1161a.delete();
            if (((doa) bug.mo2152d()).f14230I.mo9709b()) {
                ((doa) bug.mo2152d()).f14248o.delete((Uri) ((doa) bug.mo2152d()).f14230I.mo9706a(), null, null);
            }
        }
        ((doa) bug.mo2152d()).mo13044a(null);
        ((doa) this.f24035a.mo2152d()).f14259z.mo6731a();
        ((doa) this.f24035a.mo2152d()).f14235b.mo6014a();
        ((doa) this.f24035a.mo2152d()).f14236c.execute(new dnr(this));
        return new dmd(this.f24035a);
    }
}
