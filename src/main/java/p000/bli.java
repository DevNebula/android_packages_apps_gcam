package p000;

import android.os.Build;
import android.util.Log;

/* compiled from: PG */
/* renamed from: bli */
public final class bli {
    /* renamed from: a */
    private static final int f1292a = 19;

    /* renamed from: a */
    public static void m888a(String str, String str2) {
        if (bli.m890a(str, 3)) {
            Log.d(str, str2);
        }
    }

    /* renamed from: a */
    public static void m889a(String str, String str2, Throwable th) {
        if (bli.m890a(str, 3)) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: b */
    public static void m891b(String str, String str2) {
        if (bli.m890a(str, 6)) {
            Log.e(str, str2);
        }
    }

    /* renamed from: b */
    public static void m892b(String str, String str2, Throwable th) {
        if (bli.m890a(str, 6)) {
            Log.e(str, str2, th);
        }
    }

    /* renamed from: c */
    public static void m894c(String str, String str2) {
        if (bli.m890a(str, 4)) {
            Log.i(str, str2);
        }
    }

    /* renamed from: c */
    public static void m895c(String str, String str2, Throwable th) {
        if (bli.m890a(str, 4)) {
            Log.i(str, str2, th);
        }
    }

    /* renamed from: a */
    public static boolean m890a(String str, int i) {
        try {
            if (blj.f1293a == 0) {
                if (i == 2) {
                    return bli.m893b(str, i);
                }
                boolean z = !"userdebug".equals(Build.TYPE) ? "eng".equals(Build.TYPE) : true;
                if (z || bli.m893b(str, i)) {
                    return true;
                }
                return false;
            } else if (blj.f1293a > i) {
                return false;
            } else {
                return true;
            }
        } catch (IllegalArgumentException e) {
            String valueOf = String.valueOf(str);
            String str2 = "String too long:";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m891b("CAM_Log", valueOf);
            return false;
        }
    }

    /* renamed from: a */
    public static String m887a(String str) {
        Object str2;
        int length = str2.length() - f1292a;
        if (length > 0) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 44);
            stringBuilder.append("Tag ");
            stringBuilder.append(str2);
            stringBuilder.append(" is ");
            stringBuilder.append(length);
            stringBuilder.append(" chars longer than limit.");
            bli.m898e("CAM_Log", stringBuilder.toString());
        }
        String valueOf = String.valueOf("CAM_");
        if (length > 0) {
            str2 = str2.substring(0, f1292a);
        }
        String valueOf2 = String.valueOf(str2);
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    /* renamed from: b */
    private static boolean m893b(String str, int i) {
        if (Log.isLoggable("CAM_", i) || Log.isLoggable(str, i)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static void m896d(String str, String str2) {
        if (bli.m890a(str, 2)) {
            Log.v(str, str2);
        }
    }

    /* renamed from: d */
    public static void m897d(String str, String str2, Throwable th) {
        if (bli.m890a(str, 2)) {
            Log.v(str, str2, th);
        }
    }

    /* renamed from: e */
    public static void m898e(String str, String str2) {
        if (bli.m890a(str, 5)) {
            Log.w(str, str2);
        }
    }

    /* renamed from: e */
    public static void m899e(String str, String str2, Throwable th) {
        if (bli.m890a(str, 5)) {
            Log.w(str, str2, th);
        }
    }
}
