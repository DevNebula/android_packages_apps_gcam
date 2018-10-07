package p000;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.internal.zzbgq;

/* renamed from: idj */
final class idj extends ids {
    /* renamed from: b */
    private final /* synthetic */ idb f20954b;
    /* renamed from: c */
    private final /* synthetic */ zzbgq f20955c;

    idj(idq idq, idb idb, zzbgq zzbgq) {
        this.f20954b = idb;
        this.f20955c = zzbgq;
        super(idq);
    }

    /* renamed from: a */
    public final void mo8382a() {
        idb idb = this.f20954b;
        zzbgq zzbgq = this.f20955c;
        if (idb.mo13633b(0)) {
            ConnectionResult connectionResult = zzbgq.f23518a;
            if (connectionResult.mo14631b()) {
                zzaf zzaf = zzbgq.f23519b;
                connectionResult = zzaf.f23383b;
                if (connectionResult.mo14631b()) {
                    idb.f20928f = true;
                    idb.f20929g = hwl.m12250a(zzaf.f23382a);
                    idb.f20930h = zzaf.f23384c;
                    idb.f20931i = zzaf.f23385d;
                    idb.mo13635e();
                    return;
                }
                String valueOf = String.valueOf(connectionResult);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 48);
                stringBuilder.append("Sign-in succeeded with resolve account failure: ");
                stringBuilder.append(valueOf);
                Log.wtf("GoogleApiClientConnecting", stringBuilder.toString(), new Exception());
                idb.mo13631b(connectionResult);
            } else if (idb.mo13630a(connectionResult)) {
                idb.mo13636f();
                idb.mo13635e();
            } else {
                idb.mo13631b(connectionResult);
            }
        }
    }
}
