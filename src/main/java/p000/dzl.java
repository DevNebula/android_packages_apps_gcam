package p000;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceFragment;
import android.preference.PreferenceGroup;
import android.preference.PreferenceScreen;
import android.widget.ListView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity;
import com.google.android.apps.camera.legacy.app.settings.ManagedSwitchPreference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: dzl */
public final class dzl extends PreferenceFragment implements OnSharedPreferenceChangeListener {
    /* renamed from: c */
    private static final String f3598c = bli.m887a("SettingsFragment");
    /* renamed from: a */
    public dzt f3599a;
    /* renamed from: b */
    public ManagedSwitchPreference f3600b;
    /* renamed from: d */
    private String[] f3601d;
    /* renamed from: e */
    private String f3602e;
    /* renamed from: f */
    private boolean f3603f;
    /* renamed from: g */
    private ManagedSwitchPreference f3604g;
    /* renamed from: h */
    private ead f3605h;
    /* renamed from: i */
    private ikb f3606i;

    /* renamed from: a */
    private final void m1749a(PreferenceGroup preferenceGroup) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < preferenceGroup.getPreferenceCount()) {
                Preference preference = preferenceGroup.getPreference(i2);
                if (preference instanceof PreferenceGroup) {
                    m1749a((PreferenceGroup) preference);
                }
                if (preference instanceof ListPreference) {
                    ListPreference listPreference = (ListPreference) preference;
                    if (listPreference.getKey().equals("pref_camera_picturesize_back_key")) {
                        m1752a(this.f3605h.f3645a, listPreference);
                    } else if (listPreference.getKey().equals("pref_camera_picturesize_front_key")) {
                        m1752a(this.f3605h.f3646b, listPreference);
                    } else if (listPreference.getKey().equals("pref_video_quality_back_key")) {
                        m1750a((eao) this.f3605h.f3647c.mo9710c(), listPreference);
                    } else if (listPreference.getKey().equals("pref_video_quality_front_key")) {
                        m1750a((eao) this.f3605h.f3648d.mo9710c(), listPreference);
                    }
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private final PreferenceScreen m1748a(PreferenceGroup preferenceGroup, String str) {
        int i = 0;
        if ((preferenceGroup instanceof PreferenceScreen) && str.equals(preferenceGroup.getKey())) {
            return (PreferenceScreen) preferenceGroup;
        }
        while (true) {
            int i2 = i;
            if (i2 >= preferenceGroup.getPreferenceCount()) {
                return null;
            }
            Preference preference = preferenceGroup.getPreference(i2);
            if (preference instanceof PreferenceGroup) {
                PreferenceScreen a = m1748a((PreferenceGroup) preference, str);
                if (a != null) {
                    return a;
                }
            }
            i = i2 + 1;
        }
    }

    public final PreferenceScreen getPreferenceScreen() {
        PreferenceScreen a;
        PreferenceGroup a2 = super.getPreferenceScreen();
        String str = this.f3602e;
        if (!(str == null || a2 == null)) {
            a2 = m1748a(a2, str);
            if (a2 == null) {
                str = this.f3602e;
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 14);
                stringBuilder.append("key ");
                stringBuilder.append(str);
                stringBuilder.append(" not found");
                throw new RuntimeException(stringBuilder.toString());
            }
        }
        return a2;
    }

    /* renamed from: c */
    private final void m1755c() {
        if (this.f3604g != null) {
            boolean z;
            if (((ListPreference) findPreference("pref_video_quality_back_key")).getEntry().toString().equals(getResources().getString(R.string.pref_video_quality_entry_2160p))) {
                hjf hjf = this.f3599a.f3614a;
                ivy ivy = hjf.f6633b;
                if (ivy.f7874d) {
                    z = true;
                } else if (ivy.f7875e) {
                    z = true;
                } else if (hjf.mo7905c()) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            if (z) {
                this.f3604g.setEnabled(true);
            } else {
                this.f3604g.setEnabled(false);
            }
        }
    }

    /* renamed from: a */
    final boolean mo6130a() {
        if (getActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 && getActivity().checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
            return true;
        }
        return false;
    }

    public final void onActivityCreated(Bundle bundle) {
        eac eac = this.f3599a.f3615b;
        this.f3605h = new ead(eac.mo6158a(iut.BACK), eac.mo6158a(iut.FRONT), eac.mo6159b(iut.BACK), eac.mo6159b(iut.FRONT));
        m1749a((PreferenceCategory) findPreference("pref_category_resolution_camera"));
        m1749a((PreferenceCategory) findPreference("pref_category_resolution_video"));
        ((ListView) getView().findViewById(16908298)).setDivider(null);
        super.onActivityCreated(bundle);
    }

    public final void onCreate(Bundle bundle) {
        String valueOf;
        super.onCreate(bundle);
        this.f3606i = new ikb();
        this.f3599a = dzw.m9737b().mo6150a(cbw.m1127a(getActivity().getApplication())).mo6149a().mo6148a();
        this.f3599a.mo6146a(getContext());
        List<String> a = this.f3599a.mo6145a();
        this.f3603f = false;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f3602e = arguments.getString("pref_screen_extra");
            this.f3603f = a.contains("pref_category_smartburst") ^ 1;
        }
        addPreferencesFromResource(R.xml.camera_preferences);
        PreferenceScreen preferenceScreen = (PreferenceScreen) findPreference("prefscreen_top");
        for (C0635ax c0635ax : this.f3599a.f3619f) {
            Preference dzm = new dzm(preferenceScreen.getContext());
            dzm.setTitle(c0635ax.mo12333g());
            dzm.setKey(c0635ax.mo12331e());
            dzm.setOrder(c0635ax.mo12332f());
            dzm.setLayoutResource(R.layout.preference_category_first_layout);
            dzm.setOrderingAsAdded(true);
            preferenceScreen.addPreference(dzm);
            if (c0635ax.mo12332f() < 0) {
                findPreference("pref_category_general").setLayoutResource(R.layout.preference_category_layout);
            }
            int size = c0635ax.mo12328b().size() - 1;
            int i = 0;
            for (gpb gpb : c0635ax.mo12328b()) {
                Preference dzn = new dzn(dzm.getContext(), i, size);
                i++;
                dzn.setTitle(gpb.mo7313e());
                dzn.setKey(gpb.mo7311c());
                dzn.setSummary(gpb.mo7312d());
                dzn.setIcon(gpb.mo7309a());
                dzn.setIntent(gpb.mo7310b());
                dzn.setLayoutResource(R.layout.preference_with_margin);
                dzm.addPreference(dzn);
            }
        }
        for (iqo a2 : (List) jri.m13391a(this.f3599a.f3621h, (Object) "Call initialize before getting closeablesToAdd")) {
            this.f3606i.mo8557a(a2);
        }
        this.f3600b = (ManagedSwitchPreference) findPreference("pref_camera_recordlocation_key");
        this.f3600b.setOnPreferenceChangeListener(new dzo(this));
        for (String valueOf2 : a) {
            m1751a(valueOf2);
        }
        if (!a.contains("pref_category_developer")) {
            this.f3599a.f3617d.mo12434a((PreferenceScreen) findPreference("pref_category_developer"));
        }
        if (((PreferenceScreen) findPreference("pref_category_advanced")).getPreferenceCount() <= 0) {
            m1751a("pref_category_advanced");
        }
        if (!a.contains("pref_video_stabilization_key")) {
            this.f3604g = (ManagedSwitchPreference) findPreference("pref_video_stabilization_key");
        }
        this.f3601d = getResources().getStringArray(R.array.camcorder_profile_names);
        if (arguments != null) {
            CharSequence string = arguments.getString("pref_open_setting_page", null);
            if (string != null) {
                preferenceScreen = (PreferenceScreen) findPreference("prefscreen_top");
                Preference findPreference = findPreference(string);
                if (findPreference != null) {
                    preferenceScreen.onItemClick(null, null, findPreference.getOrder(), 0);
                }
            }
        }
        kfr b = this.f3599a.mo6147b();
        for (String valueOf22 : b.mo9931n()) {
            PreferenceGroup preferenceGroup = (PreferenceGroup) findPreference(valueOf22);
            for (Preference preference : b.mo9924a(valueOf22)) {
                String str;
                StringBuilder stringBuilder;
                if (preferenceGroup.addPreference(preference)) {
                    str = f3598c;
                    valueOf22 = String.valueOf(preference.getTitle());
                    stringBuilder = new StringBuilder(String.valueOf(valueOf22).length() + 6);
                    stringBuilder.append("Added ");
                    stringBuilder.append(valueOf22);
                    bli.m896d(str, stringBuilder.toString());
                } else {
                    str = f3598c;
                    valueOf22 = String.valueOf(preference.getTitle());
                    stringBuilder = new StringBuilder(String.valueOf(valueOf22).length() + 14);
                    stringBuilder.append("Could not add ");
                    stringBuilder.append(valueOf22);
                    bli.m898e(str, stringBuilder.toString());
                }
            }
        }
        CameraSettingsActivity.m1314b(this.f3599a.f3620g, getPreferenceScreen());
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f3606i.close();
    }

    public final void onPause() {
        super.onPause();
        getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
    }

    public final void onResume() {
        super.onResume();
        Activity activity = getActivity();
        PreferenceGroup preferenceGroup = (PreferenceGroup) findPreference("pref_category_resolution_camera");
        if (this.f3605h.f3645a.isEmpty()) {
            m1753a(preferenceGroup, findPreference("pref_camera_picturesize_back_key"));
            m1753a(preferenceGroup, findPreference("pref_video_quality_back_key"));
        }
        if (this.f3605h.f3646b.isEmpty()) {
            m1753a(preferenceGroup, findPreference("pref_camera_picturesize_front_key"));
            m1753a(preferenceGroup, findPreference("pref_video_quality_front_key"));
        }
        m1754b("pref_category_advanced");
        m1754b("pref_category_gestures");
        m1754b("pref_category_developer");
        if (this.f3603f) {
            m1754b("pref_category_smartburst");
        }
        findPreference("pref_category_gestures").setSummary(getResources().getString(R.string.pref_gestures_summary, new Object[]{getResources().getString(R.string.pref_camera_volume_key_action_title), getResources().getString(R.string.pref_camera_double_tap_action_title)}));
        ListPreference listPreference = (ListPreference) findPreference("pref_camera_grid_lines_mode");
        listPreference.setSummary(listPreference.getEntries()[listPreference.findIndexOfValue(listPreference.getValue())]);
        listPreference.setOnPreferenceChangeListener(new dzp(this));
        findPreference("pref_launch_help").setOnPreferenceClickListener(new dzq(activity));
        findPreference("pref_launch_feedback").setOnPreferenceClickListener(new dzr(activity));
        getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
        if (!mo6130a()) {
            mo6131b();
        }
        m1755c();
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals("pref_video_quality_back_key")) {
            m1755c();
        }
    }

    /* renamed from: a */
    private final boolean m1753a(PreferenceGroup preferenceGroup, Preference preference) {
        if (preferenceGroup == null) {
            bli.m888a(f3598c, "attempting to delete from null preference group");
            return false;
        } else if (preference == null) {
            bli.m888a(f3598c, "attempting to delete null preference");
            return false;
        } else if (preferenceGroup.removePreference(preference)) {
            return true;
        } else {
            for (int i = 0; i < preferenceGroup.getPreferenceCount(); i++) {
                Preference preference2 = preferenceGroup.getPreference(i);
                if ((preference2 instanceof PreferenceGroup) && m1753a((PreferenceGroup) preference2, preference)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    private final void m1751a(String str) {
        Preference findPreference = findPreference(str);
        if (findPreference == null) {
            bli.m888a(f3598c, String.format("%s doesn't exist in current pref tree, perhaps it's parent was removed?", new Object[]{str}));
            return;
        }
        PreferenceGroup parent = findPreference.getParent();
        if (parent == null) {
            bli.m898e(f3598c, "Parent of preference 'pref_smartburst_classicburst' is already null, maybe this pref was already removed?");
        } else if (!parent.removePreference(findPreference)) {
            bli.m898e(f3598c, "Failed to remove preference :pref_smartburst_classicburst");
        }
    }

    /* renamed from: a */
    private final void m1750a(eao eao, ListPreference listPreference) {
        if (eao != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f3601d[eao.f3668a]);
            int i = eao.f3669b;
            if (i != eao.f3668a) {
                arrayList.add(this.f3601d[i]);
            }
            i = eao.f3670c;
            if (i != eao.f3669b) {
                arrayList.add(this.f3601d[i]);
            }
            listPreference.setEntries((CharSequence[]) arrayList.toArray(new String[0]));
        }
    }

    /* renamed from: a */
    private final void m1752a(List list, ListPreference listPreference) {
        if (list != null) {
            CharSequence[] charSequenceArr = new String[list.size()];
            CharSequence[] charSequenceArr2 = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                iqp iqp = (iqp) list.get(i);
                iqp c = eag.m1778c(iqp);
                String format = this.f3599a.f3616c.format(((double) (iqp.f7695a * iqp.f7696b)) / 1000000.0d);
                int b = eag.m1777b(c);
                int a = eag.m1774a(c);
                charSequenceArr[i] = getResources().getString(R.string.setting_summary_aspect_ratio_and_megapixels, new Object[]{Integer.valueOf(b), Integer.valueOf(a), format});
                charSequenceArr2[i] = ion.m4020b(iqp);
            }
            listPreference.setEntries(charSequenceArr);
            listPreference.setEntryValues(charSequenceArr2);
        }
    }

    /* renamed from: b */
    private final void m1754b(String str) {
        Preference findPreference = findPreference(str);
        if (findPreference != null && (findPreference instanceof PreferenceScreen)) {
            PreferenceScreen preferenceScreen = (PreferenceScreen) findPreference;
            Intent intent = new Intent(getActivity(), CameraSettingsActivity.class);
            intent.putExtra("pref_screen_extra", preferenceScreen.getKey());
            intent.putExtra("pref_screen_title", preferenceScreen.getTitle());
            preferenceScreen.setIntent(intent);
        }
    }

    /* renamed from: b */
    public final void mo6131b() {
        this.f3600b.persistBoolean(false);
        this.f3600b.setChecked(false);
    }
}
