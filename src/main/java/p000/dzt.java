package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.preference.ListPreference;
import android.preference.SwitchPreference;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.app.settings.ManagedSwitchPreference;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: dzt */
public final class dzt {
    /* renamed from: i */
    private static final String f3613i = bli.m887a("CamSetActHelper");
    /* renamed from: a */
    public final hjf f3614a;
    /* renamed from: b */
    public final eac f3615b;
    /* renamed from: c */
    public final NumberFormat f3616c;
    /* renamed from: d */
    public final bvx f3617d;
    /* renamed from: e */
    public final fxe f3618e;
    /* renamed from: f */
    public final Set f3619f;
    /* renamed from: g */
    public final irs f3620g;
    /* renamed from: h */
    public List f3621h = null;
    /* renamed from: j */
    private final bmb f3622j;
    /* renamed from: k */
    private final fbn f3623k;
    /* renamed from: l */
    private final bkw f3624l;
    /* renamed from: m */
    private final cbu f3625m;
    /* renamed from: n */
    private final ikd f3626n;
    /* renamed from: o */
    private final kbg f3627o;
    /* renamed from: p */
    private final Set f3628p;
    /* renamed from: q */
    private final Set f3629q;
    /* renamed from: r */
    private final ilp f3630r;
    /* renamed from: s */
    private List f3631s = null;
    /* renamed from: t */
    private kfr f3632t = null;

    static {
        bsk bsk = new bsk("camera.developer.enable");
    }

    public dzt(bmb bmb, fbn fbn, bkw bkw, bsn bsn, cbu cbu, hjf hjf, eac eac, NumberFormat numberFormat, bvx bvx, ikd ikd, fxe fxe, kbg kbg, Set set, Set set2, Set set3, ilp ilp, irs irs, ilp ilp2, ilp ilp3) {
        this.f3622j = bmb;
        this.f3623k = fbn;
        this.f3624l = bkw;
        this.f3625m = cbu;
        this.f3614a = hjf;
        this.f3615b = eac;
        this.f3616c = numberFormat;
        this.f3617d = bvx;
        this.f3626n = ikd;
        this.f3618e = fxe;
        this.f3627o = kbg;
        this.f3628p = set;
        this.f3629q = set2;
        this.f3630r = ilp;
        this.f3620g = irs;
        this.f3619f = set3;
    }

    /* renamed from: a */
    public final List mo6145a() {
        return (List) jri.m13391a(this.f3631s, (Object) "Call initialize before getting keysToRemove");
    }

    /* renamed from: b */
    public final kfr mo6147b() {
        return (kfr) jri.m13391a(this.f3632t, (Object) "Call initialize before getting preferencesToAdd");
    }

    /* renamed from: a */
    public final void mo6146a(Context context) {
        int i;
        ManagedSwitchPreference a;
        int i2 = 1;
        if (!this.f3624l.mo2005h()) {
            i = 0;
        } else if (this.f3622j.mo2019a()) {
            i = 0;
        } else {
            i = 1;
        }
        boolean f = this.f3624l.mo2003f();
        int i3 = 0;
        for (iut iut : iut.values()) {
            if (this.f3623k.mo9094c(iut)) {
                ffc b = this.f3623k.mo13218b(this.f3623k.mo9091b(iut));
                if (i3 != 0) {
                    i3 = 1;
                } else if (b.mo9054A()) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
            }
        }
        this.f3631s = new ArrayList(10);
        this.f3621h = new ArrayList(10);
        if (i == 0) {
            this.f3631s.add("pref_category_smartburst");
            this.f3631s.add("pref_smartburst_classicburst");
        } else if (f) {
            this.f3631s.add("pref_smartburst_classicburst");
        }
        if (this.f3614a.mo7905c() || this.f3614a.mo7906d()) {
            this.f3621h.add(this.f3630r.mo13672a(new dzu(this), this.f3626n));
        } else {
            this.f3631s.add("pref_camera_hdrplus_option_available_key");
        }
        this.f3631s.add("pref_camera_raw_output_option_available_key");
        this.f3631s.add("pref_category_developer");
        if (i3 == 0) {
            this.f3631s.add("pref_video_stabilization_key");
        }
        if (!erz.m2145a(context, this.f3625m.mo2251b(), this.f3625m.mo2250a())) {
            this.f3631s.add("pref_lightcycle_quality_key");
        }
        if (!this.f3623k.mo9090a()) {
            this.f3631s.add("pref_camera_sounds_key");
        }
        PackageManager packageManager = context.getPackageManager();
        if (!(packageManager.isPermissionRevokedByPolicy("android.permission.ACCESS_COARSE_LOCATION", context.getPackageName()) || packageManager.isPermissionRevokedByPolicy("android.permission.ACCESS_FINE_LOCATION", context.getPackageName()))) {
            i2 = 0;
        }
        if (i2 != 0) {
            this.f3631s.add("pref_camera_recordlocation_key");
        }
        this.f3632t = kec.m18455q();
        if (this.f3627o.mo9709b()) {
            kbg a2 = ((cdc) this.f3627o.mo9706a()).mo2260a();
            if (a2.mo9709b()) {
                SwitchPreference switchPreference = (SwitchPreference) a2.mo9706a();
                switchPreference.setOrder(2);
                a = ManagedSwitchPreference.m1315a(context, switchPreference);
                a.setLayoutResource(R.layout.preference_with_margin);
                this.f3632t.mo9925a("pref_category_general", a);
            }
        }
        for (gpc gpc : this.f3628p) {
            if (((String) gpc.mo7317d().get(0)).equals("PhotoResolution")) {
                ListPreference listPreference = new ListPreference(context);
                listPreference.setTitle(gpc.mo7320g());
                listPreference.setEntries(gpc.mo7315b());
                listPreference.setEntryValues(gpc.mo7316c());
                listPreference.setKey(gpc.mo7319f());
                listPreference.setDefaultValue(gpc.mo7314a());
                listPreference.setIcon(gpc.mo7318e());
                listPreference.setLayoutResource(R.layout.preference_with_margin);
                listPreference.setOrder(3);
                this.f3632t.mo9925a("pref_category_resolution_camera", listPreference);
            }
        }
        for (gpd gpd : this.f3629q) {
            if (((String) gpd.mo7322b().get(0)).equals("Advanced")) {
                SwitchPreference switchPreference2 = new SwitchPreference(context);
                switchPreference2.setTitle(gpd.mo7325e());
                switchPreference2.setSummary(gpd.mo7324d());
                switchPreference2.setKey(gpd.mo7323c());
                switchPreference2.setDefaultValue(gpd.mo7321a());
                a = ManagedSwitchPreference.m1315a(context, switchPreference2);
                a.setLayoutResource(R.layout.preference_with_margin);
                this.f3632t.mo9925a("pref_category_advanced", a);
            }
        }
        String str = f3613i;
        String valueOf = String.valueOf(this.f3631s);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 36);
        stringBuilder.append("Keys to remove from CameraSettings: ");
        stringBuilder.append(valueOf);
        bli.m896d(str, stringBuilder.toString());
    }
}
