package p000;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;

/* renamed from: huc */
public class huc {
    /* renamed from: c */
    public static final int f7033c = hue.f7034a;

    static {
        huc huc = new huc();
    }

    huc() {
    }

    /* renamed from: a */
    public static int m3510a(Context context) {
        int e = hue.m3524e(context);
        return hue.m3519a(context, e) ? 18 : e;
    }

    /* renamed from: a */
    public static PendingIntent m3511a(Context context, int i, int i2, String str) {
        Intent a = huc.m3512a(context, i, str);
        return a != null ? PendingIntent.getActivity(context, 0, a, 268435456) : null;
    }

    /* renamed from: a */
    public static Intent m3512a(Context context, int i, String str) {
        switch (i) {
            case 1:
            case 2:
                return (context == null || !htl.m3481a(context)) ? hwj.m3619a("com.google.android.gms", huc.m3514a(context, str)) : hwj.m3617a();
            case 3:
                return hwj.m3618a("com.google.android.gms");
            default:
                return null;
        }
    }

    /* renamed from: a */
    public static String m3513a(int i) {
        return hue.m3518a(i);
    }

    /* renamed from: a */
    private static String m3514a(Context context, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("gcore_");
        stringBuilder.append(f7033c);
        stringBuilder.append("-");
        if (!TextUtils.isEmpty(str)) {
            stringBuilder.append(str);
        }
        stringBuilder.append("-");
        if (context != null) {
            stringBuilder.append(context.getPackageName());
        }
        stringBuilder.append("-");
        if (context != null) {
            try {
                stringBuilder.append(iad.f7237a.mo8300a(context).mo8299b(context.getPackageName(), 0).versionCode);
            } catch (NameNotFoundException e) {
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static boolean m3515a(Context context, int i) {
        return hue.m3519a(context, i);
    }

    /* renamed from: b */
    public static boolean m3517b(int i) {
        return hue.m3521b(i);
    }

    /* renamed from: b */
    public static void m3516b(Context context) {
        if (!hue.f7035b.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException e) {
            }
        }
    }
}
