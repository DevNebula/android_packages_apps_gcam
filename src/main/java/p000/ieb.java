package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: ieb */
public final class ieb extends BroadcastReceiver {
    /* renamed from: a */
    public Context f7333a;
    /* renamed from: b */
    private final iec f7334b;

    public ieb(iec iec) {
        this.f7334b = iec;
    }

    /* renamed from: a */
    public final synchronized void mo8391a() {
        Context context = this.f7333a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f7333a = null;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f7334b.mo8393a();
            mo8391a();
        }
    }
}
