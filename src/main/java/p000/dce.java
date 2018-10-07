package p000;

import android.content.Intent;

/* compiled from: PG */
/* renamed from: dce */
public final class dce extends dbx {
    public dce(dbx dbx) {
        super((bug) dbx);
    }

    /* renamed from: e */
    public final dbx mo2150b() {
        iut iut;
        iur iur;
        Intent E = ((dbu) mo2152d()).mo12975E();
        if (awl.m740c(E) && awl.m741d(E)) {
            iut = iut.FRONT;
        } else {
            iut = ((dbu) mo2152d()).mo13000g().mo6123a();
        }
        iur b = ((dbu) mo2152d()).mo12979I().mo9091b(iut);
        if (b == null) {
            b = ((dbu) mo2152d()).mo12979I().mo9093c();
            jri.m13391a((Object) b, (Object) "No cameras on the device!!!");
            iur = b;
        } else {
            iur = b;
        }
        return new dch(this, iut, iur, ((dbu) mo2152d()).mo12979I().mo13218b(iur));
    }
}
