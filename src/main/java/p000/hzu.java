package p000;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.Set;

/* renamed from: hzu */
public class hzu implements hvs {
    /* renamed from: a */
    public final huo f20848a;
    /* renamed from: b */
    public final icd f20849b;
    /* renamed from: c */
    public hwk f20850c;
    /* renamed from: d */
    public Set f20851d;
    /* renamed from: e */
    public boolean f20852e;
    /* renamed from: f */
    public final /* synthetic */ idv f20853f;

    /* renamed from: a */
    public void mo13607a(hwk hwk, Set set) {
        if (hwk == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            mo13608b(new ConnectionResult(4));
            return;
        }
        this.f20850c = hwk;
        this.f20851d = set;
        mo13606a();
    }

    /* renamed from: b */
    public void mo13608b(ConnectionResult connectionResult) {
        ief ief = (ief) this.f20853f.f7318g.get(this.f20849b);
        htl.m3462a(ief.f24621h.f7319h);
        ief.f24614a.mo13576c();
        ief.mo8150a(connectionResult);
    }

    public hzu(idv idv, huo huo, icd icd) {
        this.f20853f = idv;
        this.f20850c = null;
        this.f20851d = null;
        this.f20852e = false;
        this.f20848a = huo;
        this.f20849b = icd;
    }

    /* renamed from: a */
    public void mo8208a(ConnectionResult connectionResult) {
        this.f20853f.f7319h.post(new idz(this, connectionResult));
    }

    /* renamed from: a */
    public void mo13606a() {
        if (this.f20852e) {
            hwk hwk = this.f20850c;
            if (hwk != null) {
                this.f20848a.mo13574a(hwk, this.f20851d);
            }
        }
    }
}
