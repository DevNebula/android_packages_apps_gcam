package p000;

import com.google.android.gms.common.ConnectionResult;
import java.util.Map;

/* renamed from: ide */
final class ide extends idl {
    /* renamed from: a */
    public final /* synthetic */ idb f20947a;
    /* renamed from: b */
    private final Map f20948b;

    public ide(idb idb, Map map) {
        this.f20947a = idb;
        super(idb);
        this.f20948b = map;
    }

    /* renamed from: a */
    public final void mo8371a() {
        int i;
        int i2 = 1;
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        for (huo huo : this.f20948b.keySet()) {
            if (huo.mo13581h()) {
                if (!((idd) this.f20948b.get(huo)).f20944a) {
                    i = 1;
                    break;
                } else {
                    i = i4;
                    i4 = 1;
                }
            } else {
                i = 0;
                i4 = i5;
            }
            i5 = i4;
            i4 = i;
        }
        i2 = i5;
        i = 0;
        if (i2 != 0) {
            i3 = huc.m3510a(this.f20947a.f20925c);
        }
        if (i3 == 0 || (i == 0 && i4 == 0)) {
            idb idb = this.f20947a;
            if (idb.f20927e) {
                idb.f20926d.mo14964i();
            }
            for (huo huo2 : this.f20948b.keySet()) {
                hvs hvs = (hvs) this.f20948b.get(huo2);
                if (huo2.mo13581h() && i3 != 0) {
                    idq idq = this.f20947a;
                    idq.f20923a.mo14989a(new idg(idq, hvs));
                } else {
                    huo2.mo13573a(hvs);
                }
            }
            return;
        }
        ConnectionResult connectionResult = new ConnectionResult(i3, null);
        idq idq2 = this.f20947a;
        idq2.f20923a.mo14989a(new idf(this, idq2, connectionResult));
    }
}
