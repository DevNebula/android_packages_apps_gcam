package p000;

/* compiled from: PG */
/* renamed from: dec */
final class dec implements dbw {
    /* renamed from: a */
    public final /* synthetic */ ddu f23854a;

    dec(ddu ddu) {
        this.f23854a = ddu;
    }

    /* renamed from: a */
    public final /* synthetic */ bug mo2146a(Object obj) {
        dba dba = (dba) obj;
        dbx dbx = this.f23854a;
        if (dbx.f23848g) {
            return new deh(dbx, dba.f3128a);
        }
        if ((dbx.f23847f.mo9709b() ^ 1) != 0) {
            ((dbu) this.f23854a.mo2152d()).mo13002i().post(new ded(this, dba.f3128a, dba.f3129b));
        }
        return null;
    }
}
