package p000;

import android.content.SharedPreferences;

/* compiled from: PG */
/* renamed from: gos */
public abstract class gos {
    /* renamed from: a */
    public abstract int mo7285a(String str, String str2, Integer num);

    /* renamed from: a */
    public abstract SharedPreferences mo7286a();

    /* renamed from: a */
    public abstract void mo7287a(gol gol);

    /* renamed from: a */
    public abstract void mo7288a(String str, int i, int[] iArr);

    /* renamed from: a */
    public abstract void mo7289a(String str, String str2, int i);

    /* renamed from: a */
    public abstract void mo7290a(String str, String str2, String str3);

    /* renamed from: a */
    public abstract void mo7291a(String str, String str2, String[] strArr);

    /* renamed from: a */
    public abstract void mo7292a(String str, boolean z);

    /* renamed from: a */
    public abstract boolean mo7293a(String str, String str2);

    /* renamed from: a */
    public abstract boolean mo7294a(String str, String str2, boolean z);

    /* renamed from: b */
    public abstract int mo7295b(String str, String str2);

    /* renamed from: b */
    public abstract void mo7296b(gol gol);

    /* renamed from: b */
    public abstract void mo7297b(String str, String str2, int i);

    /* renamed from: b */
    public abstract void mo7298b(String str, String str2, boolean z);

    /* renamed from: c */
    public abstract int mo7299c(String str, String str2);

    /* renamed from: c */
    public abstract SharedPreferences mo7300c(String str);

    /* renamed from: d */
    public abstract String mo7301d(String str, String str2);

    /* renamed from: e */
    public abstract boolean mo7302e(String str, String str2);

    /* renamed from: f */
    public abstract void mo7303f(String str, String str2);

    /* renamed from: g */
    public abstract void mo7304g(String str, String str2);

    /* renamed from: a */
    public static String m2722a(boolean z) {
        return !z ? "0" : "1";
    }

    /* renamed from: a */
    public static String m2721a(String str) {
        String valueOf = String.valueOf("_preferences_camera_");
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    /* renamed from: b */
    public static String m2723b(String str) {
        String valueOf = String.valueOf("_preferences_camera_");
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }
}
