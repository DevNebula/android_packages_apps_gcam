package p000;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.Set;

/* compiled from: PG */
/* renamed from: euh */
public final class euh {
    /* renamed from: a */
    public static boolean m2180a(bmb bmb, etg etg) {
        if (euh.m2182b(bmb, etg) || bmb.mo2021c()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static Handler m2175a(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }

    /* renamed from: b */
    public static boolean m2182b(bmb bmb, etg etg) {
        return bmb.mo2022d() && etg.f4446a;
    }

    /* renamed from: a */
    public static Set m2177a(Integer num, kwk kwk, bmb bmb, etg etg, ird ird) {
        if (!bmb.mo2022d() || !etg.f4446a || num.intValue() >= 0) {
            return kgn.f24941a;
        }
        try {
            ird.mo8856a("MICRO_GyroModule#provideRequestTransformer");
            Set a = keu.m13727a(fds.m10416a(ken.m13708a((fiw) kwk.mo10566a())));
            return a;
        } finally {
            ird.mo8857b();
        }
    }

    /* renamed from: b */
    public static Set m2181b(Integer num, kwk kwk, bmb bmb, etg etg, ird ird) {
        if (!bmb.mo2022d() || !etg.f4446a || num.intValue() < 0) {
            return kgn.f24941a;
        }
        try {
            ird.mo8856a("MICRO_GyroModule#provideRequestListener");
            Set a = keu.m13727a((fiw) kwk.mo10566a());
            return a;
        } finally {
            ird.mo8857b();
        }
    }

    /* renamed from: a */
    public static Set m2176a(bmb bmb, kwk kwk, kwk kwk2, kwk kwk3, etg etg, ird ird) {
        try {
            Set a;
            ird.mo8856a("MICRO_EncoderModule#providesShutdownTasks");
            if (bmb.mo2022d()) {
                if (etg.f4446a) {
                    a = keu.m13727a(new ewa(ird, kwk2, kwk3, kwk));
                    ird.mo8857b();
                    return a;
                }
            }
            a = kgn.f24941a;
            return a;
        } finally {
            ird.mo8857b();
        }
    }

    /* renamed from: a */
    public static Set m2178a(kwk kwk, bmb bmb, etg etg, ird ird) {
        try {
            Set a;
            ird.mo8856a("MICRO_GyroModule#providesShutdownTasks");
            if (bmb.mo2022d()) {
                if (etg.f4446a) {
                    a = keu.m13727a(new ewm(ird, kwk));
                    ird.mo8857b();
                    return a;
                }
            }
            a = kgn.f24941a;
            return a;
        } finally {
            ird.mo8857b();
        }
    }

    /* renamed from: a */
    public static Set m2179a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, bmb bmb, etg etg, ird ird) {
        ezt.f4615a = bmb;
        try {
            Set a;
            ird.mo8856a("MICRO_EncoderModule#providesStartupTasks");
            if (bmb.mo2022d()) {
                if (etg.f4446a) {
                    a = keu.m13727a(new evz(ird, kwk3, kwk6, kwk, kwk2, kwk4, kwk5));
                    ird.mo8857b();
                    return a;
                }
            }
            a = kgn.f24941a;
            return a;
        } finally {
            ird.mo8857b();
        }
    }

    /* renamed from: a */
    public static long m2174a(long j) {
        return ((500000 + j) / 1000000) * 1000000;
    }
}
