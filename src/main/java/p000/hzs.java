package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.internal.zzbgq;
import java.util.Set;

/* renamed from: hzs */
public final class hzs extends iaz implements hus, hut {
    /* renamed from: i */
    private static huk f24529i = iaq.f7241a;
    /* renamed from: a */
    public final Context f24530a;
    /* renamed from: b */
    public final Handler f24531b;
    /* renamed from: c */
    public final huk f24532c = f24529i;
    /* renamed from: d */
    public final boolean f24533d = true;
    /* renamed from: e */
    public Set f24534e;
    /* renamed from: f */
    public hvx f24535f;
    /* renamed from: g */
    public iau f24536g;
    /* renamed from: h */
    public hzu f24537h;

    public hzs(Context context, Handler handler) {
        super((byte) 0);
        this.f24530a = context;
        this.f24531b = handler;
    }

    /* renamed from: a */
    static /* synthetic */ void m16280a(hzs hzs, zzbgq zzbgq) {
        ConnectionResult connectionResult = zzbgq.f23518a;
        if (connectionResult.mo14631b()) {
            zzaf zzaf = zzbgq.f23519b;
            ConnectionResult connectionResult2 = zzaf.f23383b;
            if (connectionResult2.mo14631b()) {
                hzs.f24537h.mo13607a(hwl.m12250a(zzaf.f23382a), hzs.f24534e);
            } else {
                String valueOf = String.valueOf(connectionResult2);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 48);
                stringBuilder.append("Sign-in succeeded with resolve account failure: ");
                stringBuilder.append(valueOf);
                Log.wtf("SignInCoordinator", stringBuilder.toString(), new Exception());
                hzs.f24537h.mo13608b(connectionResult2);
                hzs.f24536g.mo13576c();
                return;
            }
        }
        hzs.f24537h.mo13608b(connectionResult);
        hzs.f24536g.mo13576c();
    }

    /* renamed from: a */
    public final void mo8148a(int i) {
        this.f24536g.mo13576c();
    }

    /* renamed from: a */
    public final void mo8149a(Bundle bundle) {
        this.f24536g.mo14963a(this);
    }

    /* renamed from: a */
    public final void mo8150a(ConnectionResult connectionResult) {
        this.f24537h.mo13608b(connectionResult);
    }

    /* renamed from: a */
    public final void mo8314a(zzbgq zzbgq) {
        this.f24531b.post(new hzt(this, zzbgq));
    }
}
