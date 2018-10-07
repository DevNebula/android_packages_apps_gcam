package p000;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;

/* compiled from: PG */
/* renamed from: dzo */
final class dzo implements OnPreferenceChangeListener {
    /* renamed from: a */
    private final /* synthetic */ dzl f3609a;

    dzo(dzl dzl) {
        this.f3609a = dzl;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        Object obj2;
        irs irs = this.f3609a.f3599a.f3620g;
        String key = preference.getKey();
        if (this.f3609a.f3600b.isChecked()) {
            obj2 = Boolean.TRUE;
        } else {
            obj2 = Boolean.FALSE;
        }
        irs.mo8899a(key, obj2, obj);
        if (((Boolean) obj).booleanValue()) {
            dzl dzl = this.f3609a;
            if (!dzl.mo6130a()) {
                dzl.getActivity().requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 1);
            }
        }
        return true;
    }
}
