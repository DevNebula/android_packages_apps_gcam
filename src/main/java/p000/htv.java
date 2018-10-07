package p000;

import android.content.ContentResolver;
import android.content.Context;

/* renamed from: htv */
final class htv {
    /* renamed from: a */
    public final ContentResolver f7022a;

    htv(Context context) {
        if (context != null) {
            if (htu.f20811a == null) {
                htu.f20811a = Boolean.valueOf(iad.f7237a.mo8300a(context).f7236a.checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
            }
            if (htu.f20811a.booleanValue()) {
                this.f7022a = context.getContentResolver();
                ibj.m3667a(this.f7022a, "gms:playlog:service:sampling_");
                return;
            }
        }
        this.f7022a = null;
    }
}
