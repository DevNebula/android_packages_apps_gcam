package p000;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.GoogleCamera.R;

/* renamed from: hvz */
public final class hvz {
    /* renamed from: a */
    private static final C0301iz f7120a = new C0301iz();

    /* renamed from: a */
    private static String m3594a(Context context) {
        Object obj = context.getApplicationInfo().name;
        if (!TextUtils.isEmpty(obj)) {
            return obj;
        }
        String packageName = context.getPackageName();
        try {
            iac a = iad.f7237a.mo8300a(context);
            return a.f7236a.getPackageManager().getApplicationLabel(a.f7236a.getPackageManager().getApplicationInfo(context.getPackageName(), 0)).toString();
        } catch (NameNotFoundException e) {
            return packageName;
        }
    }

    /* renamed from: a */
    public static String m3595a(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return hvz.m3596a(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return hvz.m3596a(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return hvz.m3596a(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return hvz.m3596a(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder stringBuilder = new StringBuilder(33);
                stringBuilder.append("Unexpected error code ");
                stringBuilder.append(i);
                Log.e("GoogleApiAvailability", stringBuilder.toString());
                return null;
        }
    }

    /* renamed from: a */
    private static String m3596a(Context context, String str) {
        synchronized (f7120a) {
            String str2 = (String) f7120a.get(str);
            if (str2 == null) {
                Resources a = hud.m12225a(context);
                if (a != null) {
                    int identifier = a.getIdentifier(str, "string", "com.google.android.gms");
                    String str3;
                    String str4;
                    if (identifier != 0) {
                        Object string = a.getString(identifier);
                        if (TextUtils.isEmpty(string)) {
                            str3 = "GoogleApiAvailability";
                            str4 = "Got empty resource: ";
                            str2 = String.valueOf(str);
                            Log.w(str3, str2.length() == 0 ? new String(str4) : str4.concat(str2));
                            return null;
                        }
                        f7120a.put(str, string);
                        return string;
                    }
                    str3 = "GoogleApiAvailability";
                    str4 = "Missing resource: ";
                    str2 = String.valueOf(str);
                    Log.w(str3, str2.length() == 0 ? new String(str4) : str4.concat(str2));
                    return null;
                }
                return null;
            }
            return str2;
        }
    }

    /* renamed from: a */
    private static String m3597a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String a = hvz.m3596a(context, str);
        if (a == null) {
            a = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, a, new Object[]{str2});
    }

    /* renamed from: b */
    public static String m3598b(Context context, int i) {
        String a = i == 6 ? hvz.m3596a(context, "common_google_play_services_resolution_required_title") : hvz.m3595a(context, i);
        return a == null ? context.getResources().getString(R.string.common_google_play_services_notification_ticker) : a;
    }

    /* renamed from: c */
    public static String m3599c(Context context, int i) {
        Resources resources = context.getResources();
        String a = hvz.m3594a(context);
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_text, new Object[]{a});
            case 2:
                if (htl.m3481a(context)) {
                    return resources.getString(R.string.common_google_play_services_wear_update_text);
                }
                return resources.getString(R.string.common_google_play_services_update_text, new Object[]{a});
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_text, new Object[]{a});
            case 5:
                return hvz.m3597a(context, "common_google_play_services_invalid_account_text", a);
            case 7:
                return hvz.m3597a(context, "common_google_play_services_network_error_text", a);
            case 9:
                return resources.getString(R.string.common_google_play_services_unsupported_text, new Object[]{a});
            case 16:
                return hvz.m3597a(context, "common_google_play_services_api_unavailable_text", a);
            case 17:
                return hvz.m3597a(context, "common_google_play_services_sign_in_failed_text", a);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, new Object[]{a});
            case 20:
                return hvz.m3597a(context, "common_google_play_services_restricted_profile_text", a);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, new Object[]{a});
        }
    }

    /* renamed from: d */
    public static String m3600d(Context context, int i) {
        return i == 6 ? hvz.m3597a(context, "common_google_play_services_resolution_required_text", hvz.m3594a(context)) : hvz.m3599c(context, i);
    }

    /* renamed from: e */
    public static String m3601e(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_button);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_button);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_button);
            default:
                return resources.getString(17039370);
        }
    }
}
