package p000;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

/* compiled from: PG */
/* renamed from: aox */
public final class aox implements aou {
    /* renamed from: a */
    public final aov f22498a;
    /* renamed from: b */
    public boolean f22499b;
    /* renamed from: c */
    private final Context f22500c;
    /* renamed from: d */
    private boolean f22501d;
    /* renamed from: e */
    private final BroadcastReceiver f22502e = new aoy(this);

    public aox(Context context, aov aov) {
        this.f22500c = context.getApplicationContext();
        this.f22498a = aov;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    static boolean m14939a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) aqe.m610a((ConnectivityManager) context.getSystemService("connectivity"), "Argument must not be null")).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (Throwable e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
            }
            return true;
        }
    }

    /* renamed from: b */
    public final void mo1645b() {
    }

    /* renamed from: c */
    public final void mo1646c() {
        if (!this.f22501d) {
            this.f22499b = aox.m14939a(this.f22500c);
            try {
                this.f22500c.registerReceiver(this.f22502e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f22501d = true;
            } catch (Throwable e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", e);
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo1647d() {
        if (this.f22501d) {
            this.f22500c.unregisterReceiver(this.f22502e);
            this.f22501d = false;
        }
    }
}
