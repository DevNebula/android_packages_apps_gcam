package p000;

import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dzh */
public final class dzh {
    /* renamed from: a */
    public final int f3586a;
    /* renamed from: b */
    public final int f3587b;
    /* renamed from: c */
    private final gos f3588c;
    /* renamed from: d */
    private final String f3589d;
    /* renamed from: e */
    private final String f3590e = "pref_camera_id_key";
    /* renamed from: f */
    private final int f3591f;

    dzh(Resources resources, gos gos, PackageManager packageManager, String str) {
        Object obj = null;
        this.f3588c = gos;
        this.f3589d = gos.m2723b(str);
        this.f3586a = Integer.parseInt(resources.getString(R.string.pref_camera_id_entry_back_value));
        this.f3587b = Integer.parseInt(resources.getString(R.string.pref_camera_id_entry_front_value));
        for (FeatureInfo featureInfo : packageManager.getSystemAvailableFeatures()) {
            if (featureInfo.name != null && featureInfo.name.equals("org.chromium.arc")) {
                obj = 1;
                break;
            }
        }
        if (obj != null) {
            this.f3591f = Integer.parseInt(resources.getString(R.string.pref_camera_id_default_arc));
        } else {
            this.f3591f = Integer.parseInt(resources.getString(R.string.pref_camera_id_default));
        }
    }

    /* renamed from: a */
    public final iut mo6123a() {
        int a = this.f3588c.mo7285a(this.f3589d, this.f3590e, Integer.valueOf(-1));
        int i = this.f3586a;
        if (a == i) {
            return iut.BACK;
        }
        if (a == this.f3587b) {
            return iut.FRONT;
        }
        if (this.f3591f == i) {
            return iut.BACK;
        }
        return iut.FRONT;
    }

    /* renamed from: b */
    public final iut mo6125b() {
        int a = this.f3588c.mo7285a("default_scope", "pref_mode_switch_camera_id_key", Integer.valueOf(-1));
        if (a != -1) {
            this.f3588c.mo7303f("default_scope", "pref_mode_switch_camera_id_key");
            this.f3588c.mo7289a(this.f3589d, "pref_camera_id_key", a);
        }
        return mo6123a();
    }

    /* renamed from: c */
    public final boolean mo6126c() {
        return mo6123a() == iut.BACK;
    }

    /* renamed from: a */
    public final void mo6124a(int i) {
        this.f3588c.mo7289a(this.f3589d, this.f3590e, i);
    }

    public final String toString() {
        return !mo6126c() ? "Front Camera" : "Back Camera";
    }
}
