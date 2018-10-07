package p000;

import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;

/* compiled from: PG */
/* renamed from: dzp */
final class dzp implements OnPreferenceChangeListener {
    /* renamed from: a */
    private final /* synthetic */ dzl f3610a;

    dzp(dzl dzl) {
        this.f3610a = dzl;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        ListPreference listPreference = (ListPreference) preference;
        int findIndexOfValue = listPreference.findIndexOfValue(listPreference.getValue());
        int findIndexOfValue2 = listPreference.findIndexOfValue((String) obj);
        listPreference.setSummary(listPreference.getEntries()[findIndexOfValue2]);
        this.f3610a.f3599a.f3620g.mo8899a(preference.getKey(), listPreference.getEntries()[findIndexOfValue], listPreference.getEntries()[findIndexOfValue2]);
        return true;
    }
}
