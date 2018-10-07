package p000;

import android.content.SharedPreferences;

/* compiled from: PG */
/* renamed from: eak */
public abstract class eak {
    /* renamed from: a */
    private static final String f3660a = bli.m887a("SettingsUpgrader");
    /* renamed from: b */
    private final String f3661b;
    /* renamed from: c */
    private final int f3662c;

    /* renamed from: a */
    public abstract void mo6165a(gos gos, fbn fbn, int i);

    public eak(String str, int i) {
        this.f3661b = str;
        this.f3662c = i;
    }

    /* renamed from: a */
    protected static boolean m1781a(SharedPreferences sharedPreferences, String str) {
        try {
            sharedPreferences.getString(str, null);
            return true;
        } catch (Throwable e) {
            bli.m892b(f3660a, "error reading old value", e);
            return false;
        }
    }

    /* renamed from: a */
    protected int mo6163a(gos gos) {
        return gos.mo7299c("default_scope", this.f3661b);
    }

    /* renamed from: b */
    public static boolean m1782b(SharedPreferences sharedPreferences, String str) {
        boolean z = false;
        try {
            z = sharedPreferences.getBoolean(str, false);
        } catch (Throwable e) {
            bli.m892b(f3660a, "error reading old value, removing and returning default", e);
        }
        sharedPreferences.edit().remove(str).apply();
        return z;
    }

    /* renamed from: c */
    protected static String m1783c(SharedPreferences sharedPreferences, String str) {
        String str2 = null;
        try {
            str2 = sharedPreferences.getString(str, null);
        } catch (Throwable e) {
            bli.m892b(f3660a, "error reading old value, removing and returning default", e);
        }
        sharedPreferences.edit().remove(str).apply();
        return str2;
    }

    /* renamed from: a */
    public final void mo6164a(gos gos, fbn fbn) {
        try {
            int a = mo6163a(gos);
            if (a != this.f3662c) {
                mo6165a(gos, fbn, a);
            }
            gos.mo7289a("default_scope", this.f3661b, this.f3662c);
        } catch (Throwable e) {
            bli.m892b(f3660a, "exception during upgrade", e);
            throw e;
        }
    }
}
