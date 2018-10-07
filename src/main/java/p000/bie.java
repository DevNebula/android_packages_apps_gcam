package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: bie */
public final class bie implements bhe {
    /* renamed from: a */
    public static final String f11428a = bli.m887a("CdrAfScanner");
    /* renamed from: b */
    public final ikp f11429b;
    /* renamed from: c */
    public final iqt f11430c;
    /* renamed from: d */
    public final iqt f11431d;
    /* renamed from: e */
    public final ilp f11432e;
    /* renamed from: f */
    public final ilp f11433f;
    /* renamed from: g */
    public final iqt f11434g;
    /* renamed from: h */
    public final aug f11435h;
    /* renamed from: i */
    public Runnable f11436i;
    /* renamed from: j */
    public kpw f11437j;
    /* renamed from: k */
    public final Runnable f11438k = new bih(this);
    /* renamed from: l */
    private final bgw f11439l;
    /* renamed from: m */
    private final fcm f11440m;

    public bie(bgw bgw, fcm fcm, ikp ikp, iqt iqt, iqt iqt2, ilp ilp, ilp ilp2, iqt iqt3, aug aug) {
        this.f11439l = bgw;
        this.f11440m = fcm;
        this.f11429b = ikp;
        this.f11430c = iqt;
        this.f11431d = iqt2;
        this.f11432e = ilp;
        this.f11433f = ilp2;
        this.f11435h = aug;
        this.f11434g = iqt3;
    }

    /* renamed from: a */
    public final aub mo1949a(bhj bhj, bhs bhs, boolean z, asw asw, List list, Runnable runnable) {
        this.f11429b.mo13668a();
        this.f11436i = runnable;
        this.f11434g.mo8826a(Boolean.valueOf(false));
        bhs.mo12380a(this.f11435h);
        kpk a = this.f11439l.mo1946a(bhj, bhs, z, asw.f977a, list);
        jqk.m13354c(a);
        kow.m13878a(a, new bif(this), kpq.f8776a);
        kpw d = kpw.m18486d();
        this.f11437j = d;
        return new big(this, a, d, asw);
    }
}
