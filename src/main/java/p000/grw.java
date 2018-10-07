package p000;

import java.io.File;

/* compiled from: PG */
/* renamed from: grw */
public final class grw {
    /* renamed from: a */
    public final klx f6021a = new klx();
    /* renamed from: b */
    public File f6022b;

    /* renamed from: a */
    public static kmb m2816a(jzr jzr) {
        kmb kmb = new kmb();
        kmb.f25330a = (float) jzr.f8518a;
        kmb.f25331b = (float) jzr.f8519b;
        kmb.f25332c = (float) jzr.f8520c;
        kmb.f25333d = (float) Math.sqrt(jzr.f8521d);
        return kmb;
    }

    /* renamed from: a */
    public static kma m2815a(String str, int i) {
        boolean z;
        jri.m13404b((Object) str);
        if (str.length() == 4) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        kma kma = new kma();
        kma.f25328a = str;
        kma.f25329b = i;
        return kma;
    }

    /* renamed from: a */
    public final klv mo7382a() {
        klx klx = this.f6021a;
        if (klx.f25317e == null) {
            klx.f25317e = new klv();
        }
        return this.f6021a.f25317e;
    }

    /* renamed from: b */
    public final kly mo7385b() {
        klx klx = this.f6021a;
        if (klx.f25318f == null) {
            klx.f25318f = new kly();
        }
        return this.f6021a.f25318f;
    }

    /* renamed from: c */
    private final klz m2817c() {
        klx klx = this.f6021a;
        if (klx.f25315c == null) {
            klx.f25315c = new klz();
        }
        return this.f6021a.f25315c;
    }

    /* renamed from: a */
    public final void mo7383a(int i) {
        m2817c().f25324a = i;
    }

    /* renamed from: a */
    public final void mo7384a(int i, int i2) {
        klz c = m2817c();
        c.f25325b = i;
        c.f25326c = i2;
    }
}
