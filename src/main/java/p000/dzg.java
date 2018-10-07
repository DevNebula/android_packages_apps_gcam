package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.camera2.CameraCharacteristics;
import com.google.android.GoogleCamera.R;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: dzg */
public final class dzg extends eak {
    /* renamed from: a */
    private static final String f17016a = bli.m887a("AppUpgrader");
    /* renamed from: b */
    private final Context f17017b;
    /* renamed from: c */
    private final fbn f17018c;

    public dzg(Context context, fbn fbn) {
        super("pref_upgrade_version", 11);
        this.f17017b = context;
        this.f17018c = fbn;
    }

    /* renamed from: a */
    protected final int mo6163a(gos gos) {
        SharedPreferences a = gos.mo7286a();
        if (a.contains("pref_strict_upgrade_version")) {
            Object obj = a.getAll().get("pref_strict_upgrade_version");
            a.edit().remove("pref_strict_upgrade_version").apply();
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            if (obj instanceof String) {
                return Integer.parseInt((String) obj);
            }
        }
        return super.mo6163a(gos);
    }

    /* renamed from: a */
    public final void mo6165a(gos gos, fbn fbn, int i) {
        SharedPreferences a;
        String valueOf;
        Context context = this.f17017b;
        if (i < 5) {
            a = gos.mo7286a();
            SharedPreferences c = gos.mo7300c("_preferences_camera");
            if (a.contains("pref_camera_recordlocation_key") && !eak.m1781a(gos.mo7300c("default_scope"), "pref_camera_recordlocation_key")) {
                gos.mo7298b("default_scope", "pref_camera_recordlocation_key", eak.m1782b(a, "pref_camera_recordlocation_key"));
            }
            if (a.contains("pref_user_selected_aspect_ratio")) {
                gos.mo7298b("default_scope", "pref_user_selected_aspect_ratio", eak.m1782b(a, "pref_user_selected_aspect_ratio"));
            }
            if (a.contains("pref_camera_exposure_compensation_key")) {
                gos.mo7298b("default_scope", "pref_camera_exposure_compensation_key", eak.m1782b(a, "pref_camera_exposure_compensation_key"));
            }
            if (a.contains("pref_camera_first_use_hint_shown_key")) {
                gos.mo7298b("default_scope", "pref_camera_first_use_hint_shown_key", eak.m1782b(a, "pref_camera_first_use_hint_shown_key"));
            }
            if (c.contains("pref_flash_supported_back_camera")) {
                boolean b = eak.m1782b(c, "pref_flash_supported_back_camera");
                if (b) {
                    gos.mo7298b("default_scope", "pref_flash_supported_back_camera", b);
                }
            }
            if (a.contains("pref_should_show_refocus_viewer_cling")) {
                gos.mo7298b("default_scope", "pref_should_show_refocus_viewer_cling", eak.m1782b(a, "pref_should_show_refocus_viewer_cling"));
            }
            if (a.contains("pref_should_show_settings_button_cling")) {
                gos.mo7298b("default_scope", "pref_should_show_settings_button_cling", eak.m1782b(a, "pref_should_show_settings_button_cling"));
            }
            if (c.contains("pref_camera_hdr_plus_key") && "on".equals(eak.m1783c(c, "pref_camera_hdr_plus_key"))) {
                gos.mo7298b("default_scope", "pref_camera_hdr_plus_key", true);
            }
            if (c.contains("pref_camera_hdr_key") && "on".equals(eak.m1783c(c, "pref_camera_hdr_key"))) {
                gos.mo7298b("default_scope", "pref_camera_hdr_key", true);
            }
            if (c.contains("pref_camera_grid_lines") && "on".equals(eak.m1783c(c, "pref_camera_grid_lines"))) {
                gos.mo7298b("default_scope", "pref_camera_grid_lines", true);
            }
        }
        if (i < 2) {
            a = gos.mo7300c("_preferences_camera");
            if (gos.mo7302e("default_scope", "pref_camera_recordlocation_key")) {
                if (!gos.mo7293a("default_scope", "pref_camera_recordlocation_key")) {
                    gos.mo7303f("default_scope", "pref_camera_recordlocation_key");
                }
            } else if (a.contains("pref_camera_recordlocation_key") && "on".equals(eak.m1783c(a, "pref_camera_recordlocation_key"))) {
                gos.mo7298b("default_scope", "pref_camera_recordlocation_key", true);
            }
        }
        if (i < 3) {
            m9732a(gos, iut.FRONT);
            m9732a(gos, iut.BACK);
        }
        if (i < 6) {
            String[] stringArray = context.getResources().getStringArray(R.array.camera_id_entryvalues);
            for (int i2 = 0; i2 < stringArray.length; i2++) {
                String valueOf2 = String.valueOf("_preferences_");
                valueOf = String.valueOf(stringArray[i2]);
                if (valueOf.length() == 0) {
                    valueOf = new String(valueOf2);
                } else {
                    valueOf = valueOf2.concat(valueOf);
                }
                SharedPreferences c2 = gos.mo7300c(valueOf);
                SharedPreferences c3 = gos.mo7300c(gos.m2721a(stringArray[i2]));
                for (Entry entry : c2.getAll().entrySet()) {
                    valueOf = (String) entry.getKey();
                    Object value = entry.getValue();
                    String str;
                    StringBuilder stringBuilder;
                    if (value == null) {
                        str = f17016a;
                        valueOf2 = String.valueOf(valueOf);
                        String str2 = "skipped upgrade and removing entry for null key ";
                        if (valueOf2.length() == 0) {
                            valueOf2 = new String(str2);
                        } else {
                            valueOf2 = str2.concat(valueOf2);
                        }
                        bli.m898e(str, valueOf2);
                        c3.edit().remove(valueOf).apply();
                    } else if (value instanceof Boolean) {
                        c3.edit().putString(valueOf, gos.m2722a(((Boolean) value).booleanValue())).apply();
                    } else if (value instanceof Integer) {
                        c3.edit().putString(valueOf, Integer.toString(((Integer) value).intValue())).apply();
                    } else if (value instanceof Long) {
                        long longValue = ((Long) value).longValue();
                        if (longValue > 2147483647L || longValue < -2147483648L) {
                            valueOf2 = f17016a;
                            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 66);
                            stringBuilder.append("skipped upgrade for out of bounds long key ");
                            stringBuilder.append(valueOf);
                            stringBuilder.append(" : ");
                            stringBuilder.append(longValue);
                            bli.m898e(valueOf2, stringBuilder.toString());
                        } else {
                            c3.edit().putString(valueOf, Integer.toString((int) longValue)).apply();
                        }
                    } else if (value instanceof String) {
                        c3.edit().putString(valueOf, (String) value).apply();
                    } else {
                        str = f17016a;
                        valueOf2 = String.valueOf(value.getClass());
                        stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 64) + String.valueOf(valueOf2).length());
                        stringBuilder.append("skipped upgrade and removing entry for unrecognized key type ");
                        stringBuilder.append(valueOf);
                        stringBuilder.append(" : ");
                        stringBuilder.append(valueOf2);
                        bli.m898e(str, stringBuilder.toString());
                        c3.edit().remove(valueOf).apply();
                    }
                }
            }
        }
        if (i < 8 && gos.mo7302e("default_scope", "pref_camera_hdr_plus_key")) {
            Boolean bool;
            valueOf = gos.mo7301d("default_scope", "pref_camera_hdr_plus_key");
            if ("1".equals(valueOf)) {
                bool = Boolean.TRUE;
            } else if ("0".equals(valueOf)) {
                bool = Boolean.FALSE;
            } else {
                bool = null;
            }
            if (bool != null) {
                if (bool.booleanValue()) {
                    valueOf = "on";
                } else {
                    valueOf = "off";
                }
                gos.mo7290a("default_scope", "pref_camera_hdr_plus_key", valueOf);
            }
        }
        if (i < 9 && gos.mo7302e("default_scope", "pref_camera_hdr_plus_key")) {
            valueOf = gos.mo7301d("default_scope", "pref_camera_hdr_plus_key");
            if (!(valueOf == null || valueOf.equals("on") || valueOf.equals("off") || valueOf.equals("auto"))) {
                gos.mo7303f("default_scope", "pref_camera_hdr_plus_key");
            }
        }
        if (i < 11 && fbn != null) {
            for (iur iur : fbn.mo9092b()) {
                boolean z;
                Boolean bool2 = (Boolean) fbn.mo13218b(iur).mo9056a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                if (bool2 == null) {
                    z = false;
                } else if (bool2.booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    valueOf = gos.m2721a(iur.f7848b);
                    if (gos.mo7302e(valueOf, "pref_camera_flashmode_key")) {
                        gos.mo7290a("default_scope", "pref_camera_flashmode_key", gos.mo7301d(valueOf, "pref_camera_flashmode_key"));
                        gos.mo7303f(valueOf, "pref_camera_flashmode_key");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final void m9732a(gos gos, iut iut) {
        String str;
        jri.m13404b((Object) gos);
        jri.m13404b((Object) iut);
        if (iut == iut.FRONT) {
            str = "pref_camera_picturesize_front_key";
        } else if (iut == iut.BACK) {
            str = "pref_camera_picturesize_back_key";
        } else {
            bli.m898e(f17016a, "Ignoring attempt to upgrade size of unhandled camera facing direction");
            return;
        }
        iur b = this.f17018c.mo9091b(iut);
        if (b == null) {
            String str2 = f17016a;
            String valueOf = String.valueOf(iut);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 43);
            stringBuilder.append("Failed to retrieve a camera id for facing: ");
            stringBuilder.append(valueOf);
            bli.m898e(str2, stringBuilder.toString());
            gos.mo7303f("default_scope", str);
            return;
        }
        ffc b2 = this.f17018c.mo13218b(b);
        gos.mo7290a("default_scope", str, ion.m4020b(eal.m1788a(gos.mo7301d("default_scope", str), b2.mo9063b(256), b2.mo9064c())));
    }
}
