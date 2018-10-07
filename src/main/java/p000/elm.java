package p000;

import android.preference.PreferenceManager;
import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle;

/* compiled from: PG */
/* renamed from: elm */
final class elm extends Thread {
    /* renamed from: a */
    private final /* synthetic */ eln f4162a;
    /* renamed from: b */
    private final /* synthetic */ elp f4163b;

    elm(eln eln, elp elp) {
        this.f4162a = eln;
        this.f4163b = elp;
    }

    public final void run() {
        ell.m9914a(this.f4162a);
        elp elp = this.f4163b;
        des des = elp.f4172b;
        if (des.f25924H) {
            float a = LightCycle.m1316a(elp.f4171a.f4166c);
            if (a > 0.0f) {
                bli.m888a(des.f25916c, "FOV Calibration Succeeded!");
                PreferenceManager.getDefaultSharedPreferences(elp.f4172b.f25981p.mo12475b()).edit().putFloat("photoSphereCalibratedFieldOfView", a).apply();
                return;
            }
            bli.m888a(des.f25916c, "FOV Calibration failed!");
            return;
        }
        gey gey = des.f25971f;
        eln eln = elp.f4171a;
        irs f = des.f25949ag;
        des des2 = elp.f4172b;
        gey.mo7093a(new ekw(eln, f, des2.f25922F, des2.f25923G));
    }
}
