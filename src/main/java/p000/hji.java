package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Timer;

/* compiled from: PG */
/* renamed from: hji */
public final class hji implements hus, hut {
    /* renamed from: a */
    public final huq f20167a;
    /* renamed from: b */
    public kpw f20168b;

    public hji(huq huq) {
        this.f20167a = huq;
    }

    /* renamed from: a */
    public final kpk mo13541a() {
        this.f20167a.mo8137a((hut) this);
        this.f20167a.mo8136a((hus) this);
        this.f20168b = kpw.m18486d();
        this.f20167a.mo8139b();
        new Timer().schedule(new hjj(this), 500);
        return (kpk) jri.m13404b(this.f20168b);
    }

    /* renamed from: a */
    public final void mo8149a(Bundle bundle) {
        ((kpw) jri.m13404b(this.f20168b)).mo15641a(new hjk(this));
    }

    /* renamed from: a */
    public final void mo8150a(ConnectionResult connectionResult) {
        kpw kpw = (kpw) jri.m13404b(this.f20168b);
        String valueOf = String.valueOf(connectionResult);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 16);
        stringBuilder.append("Fail to connect ");
        stringBuilder.append(valueOf);
        kpw.mo15642a(new IllegalStateException(stringBuilder.toString()));
    }

    /* renamed from: a */
    public final void mo8148a(int i) {
        kpw kpw = (kpw) jri.m13404b(this.f20168b);
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Connection gets suspended ");
        stringBuilder.append(i);
        kpw.mo15642a(new IllegalStateException(stringBuilder.toString()));
    }
}
