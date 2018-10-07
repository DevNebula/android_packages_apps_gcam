package p000;

/* compiled from: PG */
/* renamed from: elc */
public final class elc {
    /* renamed from: A */
    private eji f4091A = new eji();
    /* renamed from: B */
    private eji f4092B = new eji();
    /* renamed from: C */
    private eji f4093C = new eji();
    /* renamed from: D */
    private eji f4094D = new eji();
    /* renamed from: E */
    private eji f4095E = new eji();
    /* renamed from: F */
    private eji f4096F = new eji();
    /* renamed from: G */
    private ejl f4097G = new ejl();
    /* renamed from: H */
    private ejl f4098H = new ejl();
    /* renamed from: I */
    private ejl f4099I = new ejl();
    /* renamed from: J */
    private eji f4100J;
    /* renamed from: K */
    private eji f4101K;
    /* renamed from: L */
    private eji f4102L;
    /* renamed from: a */
    public double[] f4103a = new double[16];
    /* renamed from: b */
    public eji f4104b = new eji();
    /* renamed from: c */
    public long f4105c;
    /* renamed from: d */
    private eji f4106d = new eji();
    /* renamed from: e */
    private eji f4107e = new eji();
    /* renamed from: f */
    private eji f4108f = new eji();
    /* renamed from: g */
    private eji f4109g = new eji();
    /* renamed from: h */
    private eji f4110h = new eji();
    /* renamed from: i */
    private eji f4111i = new eji();
    /* renamed from: j */
    private eji f4112j = new eji();
    /* renamed from: k */
    private eji f4113k = new eji();
    /* renamed from: l */
    private ejl f4114l = new ejl();
    /* renamed from: m */
    private ejl f4115m = new ejl();
    /* renamed from: n */
    private ejl f4116n = new ejl();
    /* renamed from: o */
    private ejl f4117o = new ejl();
    /* renamed from: p */
    private ejl f4118p = new ejl();
    /* renamed from: q */
    private ejl f4119q = new ejl();
    /* renamed from: r */
    private ejl f4120r = new ejl();
    /* renamed from: s */
    private final elg f4121s = new elg();
    /* renamed from: t */
    private long f4122t;
    /* renamed from: u */
    private float f4123u;
    /* renamed from: v */
    private boolean f4124v = false;
    /* renamed from: w */
    private int f4125w;
    /* renamed from: x */
    private boolean f4126x = true;
    /* renamed from: y */
    private eji f4127y = new eji();
    /* renamed from: z */
    private eji f4128z = new eji();

    public elc() {
        ejl ejl = new ejl();
        ejl = new ejl();
        ejl = new ejl();
        ejl = new ejl();
        ejl = new ejl();
        eji eji = new eji();
        eji = new eji();
        eji = new eji();
        eji = new eji();
        eji = new eji();
        this.f4100J = new eji();
        this.f4101K = new eji();
        this.f4102L = new eji();
        eji = new eji();
        mo6297b();
    }

    /* renamed from: a */
    private final void m1896a(eji eji, ejl ejl) {
        eji.m1821a(eji, this.f4119q, this.f4116n);
        this.f4121s.mo6307a(this.f4116n, this.f4115m, this.f4102L);
        elg elg = this.f4121s;
        eji eji2 = this.f4102L;
        double a = (((eji2.mo6234a(0, 0) + eji2.mo6234a(1, 1)) + eji2.mo6234a(2, 2)) - 4.0d) * 0.5d;
        ejl.mo6248a((eji2.mo6234a(2, 1) - eji2.mo6234a(1, 2)) / 2.0d, (eji2.mo6234a(0, 2) - eji2.mo6234a(2, 0)) / 2.0d, (eji2.mo6234a(1, 0) - eji2.mo6234a(0, 1)) / 2.0d);
        double a2 = ejl.mo6246a();
        if (a > 0.7071067811865476d) {
            if (a2 > 0.0d) {
                ejl.mo6247a(Math.asin(a2) / a2);
            }
        } else if (a > -0.7071067811865476d) {
            ejl.mo6247a(Math.acos(a) / a2);
        } else {
            double asin = 3.141592653589793d - Math.asin(a2);
            a2 = eji2.mo6234a(0, 0) - a;
            double a3 = eji2.mo6234a(1, 1) - a;
            double a4 = eji2.mo6234a(2, 2) - a;
            ejl ejl2 = elg.f4155a;
            a = a2 * a2;
            double d = a3 * a3;
            if (a > d && a > a4 * a4) {
                ejl2.mo6248a(a2, (eji2.mo6234a(1, 0) + eji2.mo6234a(0, 1)) / 2.0d, (eji2.mo6234a(0, 2) + eji2.mo6234a(2, 0)) / 2.0d);
            } else if (d > a4 * a4) {
                ejl2.mo6248a((eji2.mo6234a(1, 0) + eji2.mo6234a(0, 1)) / 2.0d, a3, (eji2.mo6234a(2, 1) + eji2.mo6234a(1, 2)) / 2.0d);
            } else {
                ejl2.mo6248a((eji2.mo6234a(0, 2) + eji2.mo6234a(2, 0)) / 2.0d, (eji2.mo6234a(2, 1) + eji2.mo6234a(1, 2)) / 2.0d, a4);
            }
            if (ejl.m1833a(ejl2, ejl) < 0.0d) {
                ejl2.mo6247a(-1.0d);
            }
            ejl2.mo6250b();
            ejl2.mo6247a(asin);
            ejl.mo6249a(ejl2);
        }
    }

    /* renamed from: a */
    public final double mo6294a() {
        double a = this.f4104b.mo6234a(2, 0);
        double a2 = this.f4104b.mo6234a(2, 1);
        if (Math.sqrt((a * a) + (a2 * a2)) < 0.1d) {
            return 0.0d;
        }
        double d;
        a = -90.0d - ((Math.atan2(a2, a) / 3.141592653589793d) * 180.0d);
        if (a < 0.0d) {
            d = a + 360.0d;
        } else {
            d = a;
        }
        if (d >= 360.0d) {
            return d - 0.012451171875d;
        }
        return d;
    }

    /* renamed from: a */
    public final synchronized void mo6296a(float[] fArr, long j) {
        this.f4115m.mo6248a((double) fArr[0], (double) fArr[1], (double) fArr[2]);
        if (this.f4105c != 0) {
            m1896a(this.f4104b, this.f4114l);
            for (int i = 0; i < 3; i++) {
                ejl ejl = this.f4099I;
                ejl.mo6251c();
                if (i == 0) {
                    ejl.f3883a = 1.0E-7d;
                } else if (i == 1) {
                    ejl.f3884b = 1.0E-7d;
                } else {
                    ejl.f3885c = 1.0E-7d;
                }
                elg.m1909a(ejl, this.f4092B);
                eji.m1820a(this.f4092B, this.f4104b, this.f4093C);
                m1896a(this.f4093C, this.f4097G);
                ejl ejl2 = this.f4097G;
                ejl ejl3 = this.f4114l;
                this.f4098H.mo6248a(ejl3.f3883a - ejl2.f3883a, ejl3.f3884b - ejl2.f3884b, ejl3.f3885c - ejl2.f3885c);
                this.f4098H.mo6247a(1.0E7d);
                this.f4112j.mo6239a(i, this.f4098H);
            }
            this.f4112j.mo6242b(this.f4094D);
            eji.m1820a(this.f4107e, this.f4094D, this.f4095E);
            eji.m1820a(this.f4112j, this.f4095E, this.f4096F);
            eji eji = this.f4096F;
            eji eji2 = this.f4110h;
            eji eji3 = this.f4111i;
            double[] dArr = eji3.f3875a;
            double[] dArr2 = eji.f3875a;
            double d = dArr2[0];
            double[] dArr3 = eji2.f3875a;
            dArr[0] = d + dArr3[0];
            dArr[1] = dArr2[1] + dArr3[1];
            dArr[2] = dArr2[2] + dArr3[2];
            dArr[3] = dArr2[3] + dArr3[3];
            dArr[4] = dArr2[4] + dArr3[4];
            dArr[5] = dArr2[5] + dArr3[5];
            dArr[6] = dArr2[6] + dArr3[6];
            dArr[7] = dArr2[7] + dArr3[7];
            dArr[8] = dArr3[8] + dArr2[8];
            eji2 = this.f4094D;
            d = ((eji3.mo6234a(0, 0) * ((eji3.mo6234a(1, 1) * eji3.mo6234a(2, 2)) - (eji3.mo6234a(2, 1) * eji3.mo6234a(1, 2)))) - (eji3.mo6234a(0, 1) * ((eji3.mo6234a(1, 0) * eji3.mo6234a(2, 2)) - (eji3.mo6234a(1, 2) * eji3.mo6234a(2, 0))))) + (eji3.mo6234a(0, 2) * ((eji3.mo6234a(1, 0) * eji3.mo6234a(2, 1)) - (eji3.mo6234a(1, 1) * eji3.mo6234a(2, 0))));
            if (d != 0.0d) {
                double d2 = 1.0d / d;
                dArr2 = eji3.f3875a;
                double d3 = dArr2[4];
                double d4 = dArr2[8];
                double d5 = dArr2[7];
                double d6 = dArr2[5];
                double d7 = dArr2[1];
                double d8 = dArr2[2];
                double d9 = dArr2[3];
                double d10 = dArr2[6];
                double d11 = dArr2[0];
                eji2.mo6237a(((d3 * d4) - (d5 * d6)) * d2, (-((d7 * d4) - (d8 * d5))) * d2, ((d7 * d6) - (d8 * d3)) * d2, (-((d9 * d4) - (d6 * d10))) * d2, ((d4 * d11) - (d8 * d10)) * d2, (-((d6 * d11) - (d8 * d9))) * d2, ((d9 * d5) - (d10 * d3)) * d2, (-((d5 * d11) - (d10 * d7))) * d2, d2 * ((d3 * d11) - (d7 * d9)));
            }
            this.f4112j.mo6242b(this.f4095E);
            eji.m1820a(this.f4095E, this.f4094D, this.f4096F);
            eji.m1820a(this.f4107e, this.f4096F, this.f4113k);
            eji.m1821a(this.f4113k, this.f4114l, this.f4118p);
            eji.m1820a(this.f4113k, this.f4112j, this.f4094D);
            this.f4095E.mo6235a();
            eji = this.f4095E;
            eji2 = this.f4094D;
            double[] dArr4 = eji.f3875a;
            d = dArr4[0];
            dArr = eji2.f3875a;
            dArr4[0] = d - dArr[0];
            dArr4[1] = dArr4[1] - dArr[1];
            dArr4[2] = dArr4[2] - dArr[2];
            dArr4[3] = dArr4[3] - dArr[3];
            dArr4[4] = dArr4[4] - dArr[4];
            dArr4[5] = dArr4[5] - dArr[5];
            dArr4[6] = dArr4[6] - dArr[6];
            dArr4[7] = dArr4[7] - dArr[7];
            dArr4[8] = dArr4[8] - dArr[8];
            eji.m1820a(eji, this.f4107e, eji2);
            this.f4107e.mo6240a(this.f4094D);
            elg.m1909a(this.f4118p, this.f4106d);
            eji = this.f4106d;
            eji2 = this.f4104b;
            eji.m1820a(eji, eji2, eji2);
            m1897c();
        } else {
            this.f4121s.mo6307a(this.f4119q, this.f4115m, this.f4104b);
        }
        this.f4105c = j;
    }

    /* renamed from: b */
    public final synchronized void mo6298b(float[] fArr, long j) {
        long j2 = this.f4122t;
        if (j2 != 0) {
            float f = ((float) (j - j2)) * 1.0E-9f;
            if (f > 0.04f) {
                f = this.f4126x ? this.f4123u : 0.01f;
            } else if (this.f4124v) {
                this.f4123u = (this.f4123u * 0.95f) + (0.050000012f * f);
                int i = this.f4125w + 1;
                this.f4125w = i;
                if (((float) i) > 10.0f) {
                    this.f4126x = true;
                }
            } else {
                this.f4123u = f;
                this.f4125w = 1;
                this.f4124v = true;
            }
            float f2 = -f;
            this.f4117o.mo6248a((double) (fArr[0] * f2), (double) (fArr[1] * f2), (double) (f2 * fArr[2]));
            elg.m1909a(this.f4117o, this.f4106d);
            this.f4128z.mo6240a(this.f4104b);
            eji.m1820a(this.f4106d, this.f4104b, this.f4128z);
            this.f4104b.mo6240a(this.f4128z);
            m1897c();
            this.f4091A.mo6240a(this.f4108f);
            double d = (double) (f * f);
            double[] dArr = this.f4091A.f3875a;
            dArr[0] = dArr[0] * d;
            dArr[1] = dArr[1] * d;
            dArr[2] = dArr[2] * d;
            dArr[3] = dArr[3] * d;
            dArr[4] = dArr[4] * d;
            dArr[5] = dArr[5] * d;
            dArr[6] = dArr[6] * d;
            dArr[7] = dArr[7] * d;
            dArr[8] = d * dArr[8];
            double[] dArr2 = this.f4107e.f3875a;
            dArr2[0] = dArr2[0] + dArr[0];
            dArr2[1] = dArr2[1] + dArr[1];
            dArr2[2] = dArr2[2] + dArr[2];
            dArr2[3] = dArr2[3] + dArr[3];
            dArr2[4] = dArr2[4] + dArr[4];
            dArr2[5] = dArr2[5] + dArr[5];
            dArr2[6] = dArr2[6] + dArr[6];
            dArr2[7] = dArr2[7] + dArr[7];
            dArr2[8] = dArr[8] + dArr2[8];
        }
        this.f4122t = j;
    }

    /* renamed from: b */
    public final void mo6297b() {
        this.f4122t = 0;
        this.f4105c = 0;
        this.f4104b.mo6235a();
        this.f4106d.mo6235a();
        this.f4107e.mo6241b();
        this.f4107e.mo6236a(25.0d);
        this.f4108f.mo6241b();
        this.f4108f.mo6236a(1.0d);
        this.f4109g.mo6241b();
        this.f4109g.mo6236a(0.0625d);
        this.f4110h.mo6241b();
        this.f4110h.mo6236a(0.5625d);
        this.f4111i.mo6241b();
        this.f4112j.mo6241b();
        this.f4113k.mo6241b();
        this.f4114l.mo6251c();
        this.f4115m.mo6251c();
        this.f4116n.mo6251c();
        this.f4117o.mo6251c();
        this.f4118p.mo6251c();
        this.f4119q.mo6248a(0.0d, 0.0d, 9.81d);
        this.f4120r.mo6248a(0.0d, 1.0d, 0.0d);
    }

    /* renamed from: a */
    public final synchronized void mo6295a(double d) {
        double a = ((d - mo6294a()) / 180.0d) * 3.141592653589793d;
        double sin = Math.sin(a);
        a = Math.cos(a);
        r16 = new double[3][];
        r16[0] = new double[]{a, -sin, 0.0d};
        r16[1] = new double[]{sin, a, 0.0d};
        r16[2] = new double[]{0.0d, 0.0d, 1.0d};
        eji eji = this.f4127y;
        double[] dArr = r16[0];
        sin = dArr[0];
        double d2 = dArr[1];
        double d3 = dArr[2];
        dArr = r16[1];
        double d4 = dArr[0];
        double d5 = dArr[1];
        double d6 = dArr[2];
        dArr = r16[2];
        eji.mo6237a(sin, d2, d3, d4, d5, d6, dArr[0], dArr[1], dArr[2]);
        eji eji2 = this.f4104b;
        eji.m1820a(eji2, this.f4127y, eji2);
    }

    /* renamed from: c */
    private final void m1897c() {
        this.f4106d.mo6242b(this.f4100J);
        eji.m1820a(this.f4107e, this.f4100J, this.f4101K);
        eji.m1820a(this.f4106d, this.f4101K, this.f4107e);
        this.f4106d.mo6235a();
    }
}
