package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* renamed from: bvx */
public final class bvx implements kwk {
    /* renamed from: a */
    public final SharedPreferences f11853a = PreferenceManager.getDefaultSharedPreferences(this.f11855c);
    /* renamed from: b */
    public PreferenceScreen f11854b;
    /* renamed from: c */
    private final Context f11855c;
    /* renamed from: d */
    private final bkw f11856d;
    /* renamed from: e */
    private final bsn f11857e;
    /* renamed from: f */
    private final Set f11858f;
    /* renamed from: g */
    private final Set f11859g;
    /* renamed from: h */
    private final Set f11860h;
    /* renamed from: i */
    private final Set f11861i;
    /* renamed from: j */
    private final Set f11862j;
    /* renamed from: k */
    private final Set f11863k;
    /* renamed from: l */
    private final Set f11864l;
    /* renamed from: m */
    private final hjf f11865m;
    /* renamed from: n */
    private final boolean f11866n;

    public bvx(Context context, bkw bkw, bsn bsn, Set set, Set set2, Set set3, Set set4, Set set5, Set set6, Set set7, bul bul, hjf hjf) {
        this.f11855c = context;
        this.f11856d = bkw;
        this.f11857e = bsn;
        this.f11858f = set;
        this.f11859g = set2;
        this.f11860h = set3;
        this.f11861i = set4;
        this.f11862j = set5;
        this.f11864l = set7;
        this.f11863k = set6;
        this.f11866n = bul.mo2156a();
        this.f11865m = hjf;
    }

    /* renamed from: a */
    private final Preference m7903a(bsa bsa) {
        return m7907a(bsa.f1532b, this.f11857e.mo2106a((bry) bsa), false);
    }

    /* renamed from: a */
    private final Preference m7904a(bsb bsb) {
        return m7907a(bsb.f1532b, this.f11857e.mo2106a((bry) bsb), true);
    }

    /* renamed from: a */
    private final Preference m7905a(bsc bsc) {
        return m7907a(bsc.f1532b, this.f11857e.mo2106a((bry) bsc), false);
    }

    /* renamed from: a */
    private final Preference m7906a(bsk bsk) {
        return m7907a(bsk.f1532b, this.f11857e.mo2106a((bry) bsk), false);
    }

    /* renamed from: a */
    private final Preference m7907a(String str, boolean z, boolean z2) {
        Preference bmg = new bmg(this.f11855c, str);
        if (z) {
            bmg.setSummary("Property cannot be changed, already set via setprop!");
            if (z2) {
                bmg.setEnabled(false);
                bmg.f1340a = true;
            } else {
                bmg.setEnabled(false);
            }
        } else if (z2) {
            bmg.setChecked(true);
        }
        this.f11854b.addPreference(bmg);
        return bmg;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public final void mo12434a(PreferenceScreen preferenceScreen) {
        boolean z;
        this.f11854b = preferenceScreen;
        Preference preference = new Preference(this.f11855c);
        preference.setTitle("Reset to default values");
        preference.setOnPreferenceClickListener(new bmd(this));
        this.f11854b.addPreference(preference);
        m7903a(bmb.f1308c);
        m7903a(bmb.f1309d).setDependency(bmb.f1308c.f1532b);
        Preference editTextPreference = new EditTextPreference(this.f11854b.getContext());
        String str = "camera.onscreen_logcat_filter";
        editTextPreference.setTitle(str);
        this.f11854b.addPreference(editTextPreference);
        CharSequence charSequence = "Gca";
        if (this.f11853a.contains(str)) {
            charSequence = this.f11853a.getString(str, charSequence);
        }
        editTextPreference.setText(charSequence);
        editTextPreference.setSummary(charSequence);
        editTextPreference.setOnPreferenceChangeListener(new bme(this, str));
        editTextPreference.setDependency(bmb.f1309d.f1532b);
        m7903a(bmb.f1310e);
        String str2 = bmb.f1302C.f1532b;
        if (this.f11857e.mo2106a(bmb.f1302C)) {
            z = true;
        } else if (this.f11866n) {
            z = false;
        } else {
            z = true;
        }
        m7907a(str2, z, this.f11866n);
        m7904a(bmb.f1303D);
        m7903a(bmb.f1311f);
        m7903a(bmb.f1313h);
        m7903a(bmb.f1314i);
        m7906a(bin.f1217a);
        m7903a(bin.f1218b);
        m7903a(bmb.f1304E);
        m7903a(bmb.f1320o);
        m7903a(bmb.f1321p);
        m7903a(bmb.f1322q);
        m7903a(bmb.f1323r);
        m7903a(bmb.f1324s);
        m7904a(bmb.f1325t);
        m7904a(bmb.f1326u);
        m7906a(bmb.f1327v);
        m7903a(bmb.f1328w);
        m7903a(bmb.f1331z);
        m7904a(bmb.f1329x);
        m7903a(bmb.f1330y);
        z = this.f11856d.mo2002e();
        str2 = "camera:gcam_enabled";
        Preference bmg = new bmg(this.f11855c, str2);
        this.f11854b.addPreference(bmg);
        if (!this.f11853a.contains(str2)) {
            bmg.setChecked(z);
        }
        m7904a(bmb.f1319n);
        m7904a(bmb.f1300A);
        m7904a(bmb.f1301B);
        m7905a(hju.f6646a);
        if (this.f11865m.mo7905c() || this.f11865m.mo7906d()) {
            m7904a(bmb.f1317l);
            m7904a(bmb.f1318m).setDependency(bmb.f1317l.f1532b);
            m7903a(bmb.f1315j);
            m7906a(bmb.f1316k);
            m7904a(bmb.f1306G);
        }
        if (this.f11865m.mo7906d()) {
            m7904a(bmb.f1307H);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f11858f);
        arrayList.addAll(this.f11859g);
        arrayList.addAll(this.f11860h);
        arrayList.addAll(this.f11861i);
        arrayList.addAll(this.f11862j);
        arrayList.addAll(this.f11863k);
        arrayList.addAll(this.f11864l);
        Collections.sort(arrayList, new bmf());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            brx brx = (brx) arrayList.get(i);
            if (brx instanceof bsa) {
                m7903a((bsa) brx);
                i = i2;
            } else if (brx instanceof bsb) {
                m7904a((bsb) brx);
                i = i2;
            } else if (brx instanceof bsj) {
                bry bry = (bsj) brx;
                m7907a(bry.f1532b, this.f11857e.mo2106a(bry), false);
                i = i2;
            } else if (brx instanceof bsk) {
                m7906a((bsk) brx);
                i = i2;
            } else if (brx instanceof bsc) {
                m7905a((bsc) brx);
                i = i2;
            } else if (brx instanceof bsq) {
                bsq bsq = (bsq) brx;
                m7907a(bsq.f1532b, this.f11857e.mo2106a((bry) bsq), this.f11857e.mo2107a(bsq));
                i = i2;
            } else {
                String valueOf = String.valueOf(brx);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 19);
                stringBuilder.append("Unknown flag type: ");
                stringBuilder.append(valueOf);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }
}
