package p000;

/* compiled from: PG */
/* renamed from: brv */
final class brv {
    /* renamed from: a */
    public final iwc f1531a;

    brv(iwc iwc) {
        jri.m13404b((Object) iwc);
        this.f1531a = iwc;
    }

    /* renamed from: a */
    public final String mo2104a(bry bry) {
        jri.m13404b((Object) bry);
        String a = this.f1531a.mo9116a(bry.f1532b);
        if (a != null) {
            return a;
        }
        iwc iwc = this.f1531a;
        String valueOf = String.valueOf("persist.");
        a = String.valueOf(bry.f1532b);
        return iwc.mo9116a(a.length() == 0 ? new String(valueOf) : valueOf.concat(a));
    }
}
