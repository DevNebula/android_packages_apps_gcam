package p000;

import android.app.ActivityManager;

/* compiled from: PG */
/* renamed from: eqy */
public final class eqy {
    /* renamed from: b */
    private static String f4331b = bli.m887a("MaxNativeMemory");
    /* renamed from: a */
    public final long f4332a;
    /* renamed from: c */
    private final hjf f4333c;
    /* renamed from: d */
    private final cbu f4334d;

    public eqy(bkw bkw, hjf hjf, cbu cbu) {
        long j;
        int i = -1;
        this.f4333c = hjf;
        this.f4334d = cbu;
        int a = ije.m3829a(bkw.f1283a, "camera:max_allowed_native_memory_mb", -1);
        String str;
        if (a > 0) {
            str = f4331b;
            StringBuilder stringBuilder = new StringBuilder(53);
            stringBuilder.append("Max native memory overridden (gservices): ");
            stringBuilder.append(a);
            bli.m894c(str, stringBuilder.toString());
            j = (long) a;
        } else {
            hjf hjf2 = this.f4333c;
            ivy ivy = hjf2.f6633b;
            if (ivy.f7874d) {
                i = 420;
            } else if (ivy.f7875e) {
                i = 420;
            } else if (hjf2.mo7905c()) {
                i = 420;
            } else if (this.f4333c.mo7906d()) {
                i = 420;
            }
            if (i > 0) {
                str = f4331b;
                StringBuilder stringBuilder2 = new StringBuilder(50);
                stringBuilder2.append("Max native memory overridden (device): ");
                stringBuilder2.append(420);
                bli.m894c(str, stringBuilder2.toString());
                j = 420;
            } else {
                ActivityManager a2 = this.f4334d.mo2250a();
                j = (long) ((int) (((float) Math.max(a2.getMemoryClass(), a2.getLargeMemoryClass())) * 0.8f));
            }
        }
        this.f4332a = (j * 1000) * 1000;
    }
}
