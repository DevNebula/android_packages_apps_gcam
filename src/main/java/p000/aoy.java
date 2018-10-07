package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: PG */
/* renamed from: aoy */
final class aoy extends BroadcastReceiver {
    /* renamed from: a */
    private final /* synthetic */ aox f847a;

    aoy(aox aox) {
        this.f847a = aox;
    }

    public final void onReceive(Context context, Intent intent) {
        aox aox = this.f847a;
        boolean z = aox.f22499b;
        aox.f22499b = aox.m14939a(context);
        if (z != this.f847a.f22499b) {
            if (Log.isLoggable("ConnectivityMonitor", 3)) {
                boolean z2 = this.f847a.f22499b;
                StringBuilder stringBuilder = new StringBuilder(40);
                stringBuilder.append("connectivity changed, isConnected: ");
                stringBuilder.append(z2);
                Log.d("ConnectivityMonitor", stringBuilder.toString());
            }
            aox = this.f847a;
            aov aov = aox.f22498a;
            if (aox.f22499b) {
                C0043api c0043api = aov.f846a;
                for (aqb aqb : arq.m676a(c0043api.f859a)) {
                    if (!(aqb.mo1680e() || aqb.mo1679d())) {
                        aqb.mo1683h();
                        if (c0043api.f861c) {
                            c0043api.f860b.add(aqb);
                        } else {
                            aqb.mo1677b();
                        }
                    }
                }
            }
        }
    }
}
