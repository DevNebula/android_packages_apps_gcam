package p000;

/* compiled from: PG */
/* renamed from: dmi */
final class dmi implements dob {
    /* renamed from: a */
    public final /* synthetic */ dmf f24004a;

    dmi(dmf dmf) {
        this.f24004a = dmf;
    }

    /* renamed from: a */
    public final /* synthetic */ bug mo2146a(Object obj) {
        dlo dlo = (dlo) obj;
        bfe bfe = dlo.f3332a;
        iwl iwl = dlo.f3333b;
        bug bug = this.f24004a;
        if (bug.f23996g) {
            bfe.close();
            return new dlx(this.f24004a);
        }
        ((doa) bug.mo2152d()).f14236c.execute(new dmj(this));
        doc doc = this.f24004a;
        return new dnt(doc, bfe, doc.f23994e, doc.f23993d, doc.f23995f, doc.f23997h, iwl);
    }
}
