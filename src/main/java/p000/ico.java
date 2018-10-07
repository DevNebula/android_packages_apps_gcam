package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: ico */
public final class ico implements hus, hut {
    /* renamed from: a */
    public final huh f20872a;
    /* renamed from: b */
    public icp f20873b;
    /* renamed from: c */
    private final boolean f20874c;

    public ico(huh huh, boolean z) {
        this.f20872a = huh;
        this.f20874c = z;
    }

    /* renamed from: a */
    private final void m12310a() {
        htl.m3489b(this.f20873b, (Object) "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }

    /* renamed from: a */
    public final void mo8148a(int i) {
        m12310a();
        this.f20873b.mo8148a(i);
    }

    /* renamed from: a */
    public final void mo8149a(Bundle bundle) {
        m12310a();
        this.f20873b.mo8149a(bundle);
    }

    /* renamed from: a */
    public final void mo8150a(ConnectionResult connectionResult) {
        m12310a();
        this.f20873b.mo13627a(connectionResult, this.f20872a, this.f20874c);
    }
}
