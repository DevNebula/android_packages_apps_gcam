package p000;

import android.content.Intent;
import android.util.Log;

/* renamed from: hqy */
final /* synthetic */ class hqy implements hqr {
    /* renamed from: a */
    private final hqx f20784a;

    hqy(hqx hqx) {
        this.f20784a = hqx;
    }

    /* renamed from: a */
    public final void mo8034a(hra hra) {
        hqx hqx = this.f20784a;
        if (hra.f24515c == 0) {
            Intent intent = new Intent("com.google.android.apps.gsa.publicsearch.IPublicSearchService");
            intent.setPackage("com.google.android.googlequicksearchbox");
            try {
                if (hqx.f24505a.bindService(intent, hqx, 65)) {
                    hqx.mo14952a(2);
                    return;
                }
                Log.e("LensServiceConnImpl", "Unable to bind Lens service.");
                hqx.mo14952a(5);
                return;
            } catch (Throwable e) {
                Log.e("LensServiceConnImpl", "Unable to bind Lens service due to security exception.", e);
                hqx.mo14952a(5);
                return;
            }
        }
        hqx.mo14952a(4);
    }
}
