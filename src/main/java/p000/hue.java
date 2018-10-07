package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.GoogleCamera.R;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: hue */
public class hue {
    @Deprecated
    /* renamed from: a */
    public static final int f7034a = 10298000;
    /* renamed from: b */
    public static final AtomicBoolean f7035b = new AtomicBoolean();
    /* renamed from: c */
    private static boolean f7036c = false;
    /* renamed from: d */
    private static boolean f7037d = false;
    /* renamed from: e */
    private static final AtomicBoolean f7038e = new AtomicBoolean();

    @Deprecated
    /* renamed from: a */
    public static String m3518a(int i) {
        return ConnectionResult.m15360a(i);
    }

    @Deprecated
    /* renamed from: a */
    public static boolean m3519a(Context context, int i) {
        return i != 18 ? i == 1 ? hue.m3520a(context, "com.google.android.gms") : false : true;
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m3521b(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 9:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: c */
    public static Resources m3522c(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    /* renamed from: d */
    public static boolean m3523d(Context context) {
        if (!f7037d) {
            try {
                PackageInfo b = iad.f7237a.mo8300a(context).mo8299b("com.google.android.gms", 64);
                if (b != null) {
                    huf.m3525a(context);
                    if (huf.m3526a(b, hxd.f7157a[1]) != null) {
                        f7036c = true;
                        f7037d = true;
                    }
                }
                f7036c = false;
                f7037d = true;
            } catch (Throwable e) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
                f7037d = true;
            } catch (Throwable th) {
                f7037d = true;
                throw th;
            }
        }
        return f7036c || !"user".equals(Build.TYPE);
    }

    @Deprecated
    /* renamed from: e */
    public static int m3524e(Context context) {
        int i;
        int i2;
        PackageInfo packageInfo;
        PackageManager packageManager = context.getPackageManager();
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable th) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!("com.google.android.gms".equals(context.getPackageName()) || f7038e.get())) {
            int a = hws.m3623a(context);
            if (a == 0) {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            } else if (a != f7034a) {
                i = f7034a;
                String valueOf = String.valueOf("com.google.android.gms.version");
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 290);
                stringBuilder.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                stringBuilder.append(i);
                stringBuilder.append(" but found ");
                stringBuilder.append(a);
                stringBuilder.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"");
                stringBuilder.append(valueOf);
                stringBuilder.append("\" android:value=\"@integer/google_play_services_version\" />");
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        if (htl.m3481a(context)) {
            i2 = 0;
        } else {
            if (htl.f7018a == null) {
                htl.f7018a = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
            }
            i2 = !htl.f7018a.booleanValue() ? 1 : 0;
        }
        if (i2 != 0) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (NameNotFoundException e) {
                Log.w("GooglePlayServicesUtil", "Google Play Store is missing.");
                return 9;
            }
        }
        packageInfo = null;
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            huf.m3525a(context);
            if (i2 != 0) {
                if (huf.m3526a(packageInfo, hxd.f7157a) != null) {
                    if (huf.m3526a(packageInfo2, huf.m3526a(packageInfo, hxd.f7157a)) == null) {
                        Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                        return 9;
                    }
                }
                Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
                return 9;
            } else if (huf.m3526a(packageInfo2, hxd.f7157a) == null) {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            }
            if (packageInfo2.versionCode / 1000 < f7034a / 1000) {
                int i3 = f7034a;
                i = packageInfo2.versionCode;
                StringBuilder stringBuilder2 = new StringBuilder(77);
                stringBuilder2.append("Google Play services out of date.  Requires ");
                stringBuilder2.append(i3);
                stringBuilder2.append(" but found ");
                stringBuilder2.append(i);
                Log.w("GooglePlayServicesUtil", stringBuilder2.toString());
                return 2;
            }
            ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
            if (applicationInfo == null) {
                try {
                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                } catch (Throwable e2) {
                    Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", e2);
                    return 1;
                }
            }
            return !applicationInfo.enabled ? 3 : 0;
        } catch (NameNotFoundException e3) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
    }

    @TargetApi(21)
    /* renamed from: a */
    static boolean m3520a(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        for (SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
            if (str.equals(appPackageName.getAppPackageName())) {
                return true;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (equals) {
                return applicationInfo.enabled;
            }
            if (applicationInfo.enabled) {
                Bundle applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName());
                Object obj = applicationRestrictions != null ? "true".equals(applicationRestrictions.getString("restricted_profile")) ? 1 : null : null;
                if (obj == null) {
                    return true;
                }
            }
            return false;
        } catch (NameNotFoundException e) {
            return false;
        }
    }
}
