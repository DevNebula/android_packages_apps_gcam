package p000;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: ddq */
final class ddq implements dbw {
    /* renamed from: a */
    public final /* synthetic */ dcr f23842a;

    ddq(dcr dcr) {
        this.f23842a = dcr;
    }

    /* renamed from: a */
    public final /* synthetic */ bug mo2146a(Object obj) {
        dat dat = (dat) obj;
        bug bug = this.f23842a;
        if (!bug.f23825f || bug.f23826g) {
            return null;
        }
        boolean z;
        ((dbu) bug.mo2152d()).mo12977G().execute(new ddr(this));
        dbx dbx = this.f23842a;
        Bitmap bitmap = dat.f3119a;
        kbg kbg = kau.f21835a;
        if (((dbm) this.f23842a.f23823d.f11173a).mo12962c().mo12967d().f5009d.mo13673b() != fxj.OFF) {
            z = true;
        } else {
            z = false;
        }
        return new ddu(dbx, bitmap, kbg, z, this.f23842a.f23823d);
    }
}
