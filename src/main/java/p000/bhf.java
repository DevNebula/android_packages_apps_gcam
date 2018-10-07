package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: bhf */
public final class bhf implements bhe {
    /* renamed from: a */
    public static final String f11372a = bli.m887a("CdrAfScanner");
    /* renamed from: b */
    public final ikp f11373b;
    /* renamed from: c */
    public final iqt f11374c;
    /* renamed from: d */
    public final iqt f11375d;
    /* renamed from: e */
    private final bgw f11376e;

    public bhf(bgw bgw, ikp ikp, iqt iqt, iqt iqt2) {
        this.f11376e = bgw;
        this.f11373b = ikp;
        this.f11374c = iqt;
        this.f11375d = iqt2;
    }

    /* renamed from: a */
    public final aub mo1949a(bhj bhj, bhs bhs, boolean z, asw asw, List list, Runnable runnable) {
        boolean z2;
        this.f11373b.mo13668a();
        kpk a = this.f11376e.mo1946a(bhj, bhs, z, asw.f977a, list);
        if (a != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        jri.m13395a(z2);
        kpw d = kpw.m18486d();
        kow.m13878a(a, new bhg(this, d, runnable), kpq.f8776a);
        return new bhi(this, a, d, runnable, asw);
    }
}
