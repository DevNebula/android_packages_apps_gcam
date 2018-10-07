package p000;

import android.content.Intent;

/* compiled from: PG */
/* renamed from: dmd */
public final class dmd extends doc {
    static {
        bli.m887a("VidIntForegroundST");
    }

    public dmd(doc doc) {
        super((bug) doc);
    }

    /* renamed from: e */
    public final doc mo2150b() {
        iut iut;
        iur iur;
        Intent intent = ((doa) mo2152d()).f14234a;
        if (awl.m740c(intent) && awl.m741d(intent)) {
            iut = iut.FRONT;
        } else {
            iut = ((doa) mo2152d()).f14241h.mo6123a();
        }
        iur b = ((doa) mo2152d()).f14238e.mo9091b(iut);
        if (b == null) {
            b = ((doa) mo2152d()).f14238e.mo9093c();
            jri.m13391a((Object) b, (Object) "No cameras on the device!!!");
            iur = b;
        } else {
            iur = b;
        }
        return new dmf(this, iut, iur, ((doa) mo2152d()).f14238e.mo13218b(iur));
    }
}
