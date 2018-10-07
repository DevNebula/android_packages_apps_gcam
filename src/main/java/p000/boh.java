package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;

/* compiled from: PG */
/* renamed from: boh */
final class boh implements ServiceConnection {
    /* renamed from: a */
    private final /* synthetic */ bog f1393a;

    boh(bog bog) {
        this.f1393a = bog;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f1393a.f1386b) {
            kaq kaq;
            bog bog = this.f1393a;
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.systemui.elmyra.IElmyraService");
                if (queryLocalInterface instanceof kaq) {
                    kaq = (kaq) queryLocalInterface;
                } else {
                    kaq = new kar(iBinder);
                }
            } else {
                kaq = null;
            }
            bog.f1389e = kaq;
            bog bog2 = this.f1393a;
            if (bog2.f1390f != null) {
                try {
                    bog2.f1389e.mo9688a(bog2.f1391g, (IBinder) bog2.f1388d);
                } catch (Throwable e) {
                    Log.e("ElmyraClient", "registerSettingsListener()", e);
                }
            }
            Log.i("ElmyraClient", "Elmyra service connected.");
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f1393a.f1386b) {
            this.f1393a.f1389e = null;
        }
    }
}
