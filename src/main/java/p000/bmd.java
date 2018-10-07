package p000;

import android.content.SharedPreferences.Editor;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

/* renamed from: bmd */
public final /* synthetic */ class bmd implements OnPreferenceClickListener {
    /* renamed from: a */
    private final bvx f1337a;

    public bmd(bvx bvx) {
        this.f1337a = bvx;
    }

    public final boolean onPreferenceClick(Preference preference) {
        bvx bvx = this.f1337a;
        int preferenceCount = bvx.f11854b.getPreferenceCount();
        Editor edit = bvx.f11853a.edit();
        for (int i = 0; i < preferenceCount; i++) {
            edit.remove(bvx.f11854b.getPreference(i).getKey());
        }
        edit.commit();
        bvx.f11854b.removeAll();
        bvx.mo12434a(bvx.f11854b);
        return true;
    }
}
