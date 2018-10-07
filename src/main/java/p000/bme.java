package p000;

import android.content.SharedPreferences.Editor;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;

/* renamed from: bme */
public final /* synthetic */ class bme implements OnPreferenceChangeListener {
    /* renamed from: a */
    private final bvx f1338a;
    /* renamed from: b */
    private final String f1339b;

    public bme(bvx bvx, String str) {
        this.f1338a = bvx;
        this.f1339b = str;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        bvx bvx = this.f1338a;
        String str = this.f1339b;
        String str2 = (String) obj;
        preference.setSummary(str2);
        Editor edit = bvx.f11853a.edit();
        edit.putString(str, str2);
        edit.commit();
        return true;
    }
}
