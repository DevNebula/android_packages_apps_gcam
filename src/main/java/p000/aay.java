package p000;

import android.content.Context;

/* compiled from: PG */
/* renamed from: aay */
public final class aay {
    /* renamed from: a */
    private static final aby f41a = new aby("CamAgntFact");
    /* renamed from: b */
    private static final String f42b = abz.m92a("camera2.portability.force_api", "0");
    /* renamed from: c */
    private static C0619zs f43c;
    /* renamed from: d */
    private static C0619zs f44d;
    /* renamed from: e */
    private static int f45e;
    /* renamed from: f */
    private static int f46f;

    /* renamed from: a */
    public static synchronized C0619zs m28a(Context context, int i) {
        C0619zs c0619zs;
        synchronized (aay.class) {
            if (aay.m30b(i) == C0252go.f5933e) {
                if (f43c == null) {
                    f43c = new C0796yo();
                    f45e = 1;
                } else {
                    f45e++;
                }
                c0619zs = f43c;
            } else if (C0252go.f5934f == C0252go.f5933e) {
                throw new UnsupportedOperationException("Camera API_2 unavailable on this device");
            } else {
                if (f44d == null) {
                    f44d = new C0785xq(context);
                    f46f = 1;
                } else {
                    f46f++;
                }
                c0619zs = f44d;
            }
        }
        return c0619zs;
    }

    /* renamed from: a */
    public static synchronized void m29a(int i) {
        synchronized (aay.class) {
            int i2;
            if (aay.m30b(i) == C0252go.f5933e) {
                i2 = f45e - 1;
                f45e = i2;
                if (i2 == 0 && f43c != null) {
                    f43c.mo11596f();
                    f43c = null;
                }
            } else if (C0252go.f5934f == C0252go.f5933e) {
                throw new UnsupportedOperationException("Camera API_2 unavailable on this device");
            } else {
                i2 = f46f - 1;
                f46f = i2;
                if (i2 == 0 && f44d != null) {
                    f44d.mo11596f();
                    f44d = null;
                }
            }
        }
    }

    /* renamed from: b */
    private static int m30b(int i) {
        if (f42b.equals("1")) {
            abx.m84a(f41a, "API level overridden by system property: forced to 1");
            return C0252go.f5933e;
        } else if (f42b.equals("2")) {
            abx.m84a(f41a, "API level overridden by system property: forced to 2");
            return C0252go.f5934f;
        } else {
            if (i == 0) {
                abx.m91e(f41a, "null API level request, so assuming AUTO");
                i = C0252go.f5932d;
            }
            if (i == C0252go.f5932d) {
                return C0252go.f5934f;
            }
            return i;
        }
    }
}
