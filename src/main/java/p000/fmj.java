package p000;

import android.view.Surface;

/* compiled from: PG */
/* renamed from: fmj */
public final class fmj implements fmm {
    /* renamed from: a */
    private fmd f18446a;
    /* renamed from: b */
    private fmp f18447b;
    /* renamed from: c */
    private fmo f18448c;
    /* renamed from: d */
    private kwk f18449d;
    /* renamed from: e */
    private kwk f18450e;
    /* renamed from: f */
    private kwk f18451f = new fml(this.f18450e);
    /* renamed from: g */
    private iqy f18452g = iqy.m12643a(this.f18451f);
    /* renamed from: h */
    private blg f18453h;
    /* renamed from: i */
    private kwk f18454i;
    /* renamed from: j */
    private kwk f18455j;
    /* renamed from: k */
    private kwk f18456k;
    /* renamed from: l */
    private kwk f18457l;
    /* renamed from: m */
    private kwk f18458m;
    /* renamed from: n */
    private fmq f18459n;
    /* renamed from: o */
    private kwk f18460o;

    fmj(fmk fmk) {
        this.f18446a = fmk.f4853a;
        this.f18447b = new fmp(fmk.f4854b);
        this.f18448c = new fmo(fmk.f4854b);
        this.f18449d = kwc.m14273b(new fme(fmk.f4853a));
        this.f18450e = kwh.m14279a(blf.m7599a(fmk.f4855c));
        this.f18453h = blg.m7601a(fmk.f4855c, this.f18452g);
        this.f18454i = kwh.m14279a(bcd.m7332a(fmk.f4856d));
        this.f18455j = kwh.m14279a(new fjy(this.f18453h, this.f18454i));
        this.f18456k = kwc.m14273b(new flm(this.f18447b, this.f18449d, this.f18455j));
        this.f18457l = kwc.m14273b(new flw(this.f18447b, this.f18448c, this.f18449d, this.f18456k));
        this.f18458m = kwc.m14273b(new flt(this.f18447b, this.f18448c, this.f18449d, this.f18456k));
        this.f18459n = new fmq(fmk.f4854b);
        this.f18460o = kwc.m14273b(new flo(fmk.f4857e, this.f18457l, this.f18458m, this.f18459n));
    }

    /* renamed from: a */
    public static fmk m10699a() {
        return new fmk();
    }

    /* renamed from: b */
    public final fjm mo6857b() {
        return (fjm) this.f18460o.mo10566a();
    }

    /* renamed from: c */
    public final Surface mo6858c() {
        return (Surface) ktm.m14219a(this.f18446a.f4850a.mo13753g(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
