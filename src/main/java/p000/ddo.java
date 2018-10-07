package p000;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: ddo */
final class ddo implements dbw {
    /* renamed from: a */
    public final /* synthetic */ dcr f23841a;

    ddo(dcr dcr) {
        this.f23841a = dcr;
    }

    /* renamed from: a */
    public final /* synthetic */ bug mo2146a(Object obj) {
        dbb dbb = (dbb) obj;
        bug bug = this.f23841a;
        if (!bug.f23826g) {
            return null;
        }
        boolean z;
        bug.f23826g = false;
        ((dbu) bug.mo2152d()).mo12977G().execute(new ddp(this));
        dbx dbx = this.f23841a;
        Bitmap bitmap = dbb.f3130a;
        kbg c = kbg.m4804c(dbb.f3131b);
        if (((dbm) this.f23841a.f23823d.f11173a).mo12962c().mo12967d().f5009d.mo13673b() != fxj.OFF) {
            z = true;
        } else {
            z = false;
        }
        return new ddu(dbx, bitmap, c, z, this.f23841a.f23823d);
    }
}
