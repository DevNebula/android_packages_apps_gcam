package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import com.google.android.apps.camera.backup.CameraBackupAgent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: got */
public final class got extends gos {
    /* renamed from: a */
    private static final String f19425a = bli.m887a("SettingsManager");
    /* renamed from: b */
    private final Object f19426b = new Object();
    /* renamed from: c */
    private final Context f19427c;
    /* renamed from: d */
    private final String f19428d;
    /* renamed from: e */
    private final SharedPreferences f19429e;
    /* renamed from: f */
    private SharedPreferences f19430f;
    /* renamed from: g */
    private String f19431g = null;
    /* renamed from: h */
    private final List f19432h = new ArrayList();
    /* renamed from: i */
    private final List f19433i = new ArrayList();

    public got(Context context, SharedPreferences sharedPreferences, irs irs) {
        goh goh = new goh();
        this.f19427c = context;
        this.f19428d = this.f19427c.getPackageName();
        this.f19429e = sharedPreferences;
        CameraBackupAgent.f12767a = irs;
        mo7287a(new gou(context));
    }

    /* renamed from: a */
    public final void mo7287a(gol gol) {
        jqk.m13354c(this.f19426b);
        jqk.m13354c(this.f19433i);
        jqk.m13354c(this.f19429e);
        synchronized (this.f19426b) {
            if (this.f19432h.contains(gol)) {
                return;
            }
            this.f19432h.add(gol);
            OnSharedPreferenceChangeListener gov = new gov(gol);
            this.f19433i.add(gov);
            this.f19429e.registerOnSharedPreferenceChangeListener(gov);
            SharedPreferences sharedPreferences = this.f19430f;
            if (sharedPreferences != null) {
                sharedPreferences.registerOnSharedPreferenceChangeListener(gov);
            }
            String str = f19425a;
            String valueOf = String.valueOf(this.f19432h);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 11);
            stringBuilder.append("listeners: ");
            stringBuilder.append(valueOf);
            bli.m896d(str, stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public final boolean mo7293a(String str, String str2) {
        boolean a;
        synchronized (this.f19426b) {
            a = mo7294a(str, str2, m11466d(str2));
        }
        return a;
    }

    /* renamed from: a */
    public final boolean mo7294a(String str, String str2, boolean z) {
        synchronized (this.f19426b) {
            String str3;
            if (z) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            str3 = m11465b(str, str2, str3);
            if (str3 == null) {
            } else {
                z = Integer.parseInt(str3) != 0;
            }
        }
        return z;
    }

    /* renamed from: d */
    private final boolean m11466d(String str) {
        boolean z = false;
        synchronized (this.f19426b) {
            String a = goh.m2708a(str);
            if (!(a == null || Integer.parseInt(a) == 0)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final SharedPreferences mo7286a() {
        SharedPreferences sharedPreferences;
        synchronized (this.f19426b) {
            sharedPreferences = this.f19429e;
        }
        return sharedPreferences;
    }

    /* renamed from: b */
    public final int mo7295b(String str, String str2) {
        int i;
        synchronized (this.f19426b) {
            String[] b = goh.m2710b(str2);
            StringBuilder stringBuilder;
            if (b == null || b.length == 0) {
                stringBuilder = new StringBuilder((String.valueOf(str).length() + 34) + String.valueOf(str2).length());
                stringBuilder.append("No possible values for scope=");
                stringBuilder.append(str);
                stringBuilder.append(" key=");
                stringBuilder.append(str2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            String d = mo7301d(str, str2);
            i = 0;
            while (i < b.length) {
                if (d == null || !d.equals(b[i])) {
                    i++;
                }
            }
            stringBuilder = new StringBuilder((String.valueOf(str).length() + 60) + String.valueOf(str2).length());
            stringBuilder.append("Current value for scope=");
            stringBuilder.append(str);
            stringBuilder.append(" key=");
            stringBuilder.append(str2);
            stringBuilder.append(" not in list of possible values");
            throw new IllegalStateException(stringBuilder.toString());
        }
        return i;
    }

    /* renamed from: c */
    public final int mo7299c(String str, String str2) {
        int a;
        synchronized (this.f19426b) {
            a = mo7285a(str, str2, m11467e(str2));
        }
        return a;
    }

    /* renamed from: a */
    public final int mo7285a(String str, String str2, Integer num) {
        int intValue;
        synchronized (this.f19426b) {
            String b = m11465b(str, str2, Integer.toString(num.intValue()));
            if (b == null) {
                intValue = num.intValue();
            } else {
                intValue = Integer.parseInt(b);
            }
        }
        return intValue;
    }

    /* renamed from: e */
    private final Integer m11467e(String str) {
        Integer valueOf;
        synchronized (this.f19426b) {
            String a = goh.m2708a(str);
            valueOf = Integer.valueOf(a != null ? Integer.parseInt(a) : 0);
        }
        return valueOf;
    }

    /* renamed from: f */
    private final SharedPreferences m11468f(String str) {
        SharedPreferences sharedPreferences;
        synchronized (this.f19426b) {
            if (str.equals("default_scope")) {
                sharedPreferences = this.f19429e;
            } else if (str.equals(this.f19431g)) {
                sharedPreferences = this.f19430f;
            } else {
                SharedPreferences sharedPreferences2 = this.f19430f;
                if (sharedPreferences2 != null) {
                    synchronized (this.f19426b) {
                        for (OnSharedPreferenceChangeListener unregisterOnSharedPreferenceChangeListener : this.f19433i) {
                            sharedPreferences2.unregisterOnSharedPreferenceChangeListener(unregisterOnSharedPreferenceChangeListener);
                        }
                        this.f19431g = null;
                    }
                }
                this.f19430f = mo7300c(str);
                sharedPreferences = this.f19430f;
            }
        }
        return sharedPreferences;
    }

    /* renamed from: d */
    public final String mo7301d(String str, String str2) {
        String b;
        synchronized (this.f19426b) {
            b = m11465b(str, str2, m11469g(str2));
        }
        return b;
    }

    /* renamed from: b */
    private final String m11465b(String str, String str2, String str3) {
        synchronized (this.f19426b) {
            SharedPreferences f = m11468f(str);
            try {
                str3 = f.getString(str2, str3);
            } catch (Throwable e) {
                bli.m899e(f19425a, "existing preference with invalid type, removing and returning default", e);
                f.edit().remove(str2).apply();
            }
        }
        return str3;
    }

    /* renamed from: g */
    private final String m11469g(String str) {
        String a;
        synchronized (this.f19426b) {
            a = goh.m2708a(str);
        }
        return a;
    }

    /* renamed from: e */
    public final boolean mo7302e(String str, String str2) {
        boolean contains;
        synchronized (this.f19426b) {
            contains = m11468f(str).contains(str2);
        }
        return contains;
    }

    /* renamed from: c */
    public final SharedPreferences mo7300c(String str) {
        SharedPreferences sharedPreferences;
        synchronized (this.f19426b) {
            Context context = this.f19427c;
            String valueOf = String.valueOf(this.f19428d);
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() == 0) {
                valueOf2 = new String(valueOf);
            } else {
                valueOf2 = valueOf.concat(valueOf2);
            }
            sharedPreferences = context.getSharedPreferences(valueOf2, 0);
            for (OnSharedPreferenceChangeListener registerOnSharedPreferenceChangeListener : this.f19433i) {
                sharedPreferences.registerOnSharedPreferenceChangeListener(registerOnSharedPreferenceChangeListener);
            }
            this.f19431g = str;
        }
        return sharedPreferences;
    }

    /* renamed from: f */
    public final void mo7303f(String str, String str2) {
        synchronized (this.f19426b) {
            m11468f(str).edit().remove(str2).apply();
        }
    }

    /* JADX WARNING: Missing block: B:18:?, code:
            return;
     */
    /* renamed from: b */
    public final void mo7296b(p000.gol r5) {
        /*
        r4 = this;
        r0 = r4.f19426b;
        p000.jqk.m13354c(r0);
        r0 = r4.f19433i;
        p000.jqk.m13354c(r0);
        r0 = r4.f19429e;
        p000.jqk.m13354c(r0);
        r1 = r4.f19426b;
        monitor-enter(r1);
        if (r5 != 0) goto L_0x001d;
    L_0x0014:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x001a }
        r0.<init>();	 Catch:{ all -> 0x001a }
        throw r0;	 Catch:{ all -> 0x001a }
    L_0x001a:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
        throw r0;
    L_0x001d:
        r0 = r4.f19432h;	 Catch:{ all -> 0x001a }
        r0 = r0.contains(r5);	 Catch:{ all -> 0x001a }
        if (r0 != 0) goto L_0x0027;
    L_0x0025:
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
    L_0x0026:
        return;
    L_0x0027:
        r0 = r4.f19432h;	 Catch:{ all -> 0x001a }
        r2 = r0.indexOf(r5);	 Catch:{ all -> 0x001a }
        r0 = r4.f19432h;	 Catch:{ all -> 0x001a }
        r0.remove(r5);	 Catch:{ all -> 0x001a }
        r0 = r4.f19433i;	 Catch:{ all -> 0x001a }
        r0 = r0.get(r2);	 Catch:{ all -> 0x001a }
        r0 = (android.content.SharedPreferences.OnSharedPreferenceChangeListener) r0;	 Catch:{ all -> 0x001a }
        r3 = r4.f19433i;	 Catch:{ all -> 0x001a }
        r3.remove(r2);	 Catch:{ all -> 0x001a }
        r2 = r4.f19429e;	 Catch:{ all -> 0x001a }
        r2.unregisterOnSharedPreferenceChangeListener(r0);	 Catch:{ all -> 0x001a }
        r2 = r4.f19430f;	 Catch:{ all -> 0x001a }
        if (r2 == 0) goto L_0x004b;
    L_0x0048:
        r2.unregisterOnSharedPreferenceChangeListener(r0);	 Catch:{ all -> 0x001a }
    L_0x004b:
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: got.b(gol):void");
    }

    /* renamed from: a */
    public final void mo7289a(String str, String str2, int i) {
        synchronized (this.f19426b) {
            mo7290a(str, str2, Integer.toString(i));
        }
    }

    /* renamed from: a */
    public final void mo7290a(String str, String str2, String str3) {
        synchronized (this.f19426b) {
            m11468f(str).edit().putString(str2, str3).apply();
        }
    }

    /* renamed from: b */
    public final void mo7298b(String str, String str2, boolean z) {
        synchronized (this.f19426b) {
            mo7290a(str, str2, gos.m2722a(z));
        }
    }

    /* renamed from: a */
    public final void mo7288a(String str, int i, int[] iArr) {
        synchronized (this.f19426b) {
            String num = Integer.toString(i);
            String[] strArr = new String[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                strArr[i2] = Integer.toString(iArr[i2]);
            }
            goh.m2709a(str, num, strArr);
        }
    }

    /* renamed from: a */
    public final void mo7291a(String str, String str2, String[] strArr) {
        synchronized (this.f19426b) {
            goh.m2709a(str, str2, strArr);
        }
    }

    /* renamed from: a */
    public final void mo7292a(String str, boolean z) {
        synchronized (this.f19426b) {
            String str2;
            if (z) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            goh.m2709a(str, str2, new String[]{"0", "1"});
        }
    }

    /* renamed from: g */
    public final void mo7304g(String str, String str2) {
        synchronized (this.f19426b) {
            String g = m11469g(str2);
            if (g != null) {
                mo7290a(str, str2, g);
            }
        }
    }

    /* renamed from: b */
    public final void mo7297b(String str, String str2, int i) {
        synchronized (this.f19426b) {
            StringBuilder stringBuilder;
            String[] b = goh.m2710b(str2);
            if (b != null) {
                int length = b.length;
                if (length != 0) {
                    if (i < 0 || i >= length) {
                        stringBuilder = new StringBuilder((String.valueOf(str).length() + 34) + String.valueOf(str2).length());
                        stringBuilder.append("For possible values of scope=");
                        stringBuilder.append(str);
                        stringBuilder.append(" key=");
                        stringBuilder.append(str2);
                        throw new IndexOutOfBoundsException(stringBuilder.toString());
                    }
                    mo7290a(str, str2, b[i]);
                }
            }
            stringBuilder = new StringBuilder((String.valueOf(str).length() + 34) + String.valueOf(str2).length());
            stringBuilder.append("No possible values for scope=");
            stringBuilder.append(str);
            stringBuilder.append(" key=");
            stringBuilder.append(str2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
