package p000;

import android.content.Context;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dbo */
public final class dbo implements dbm {
    /* renamed from: b */
    private static final String f23732b = bli.m887a("ResCapTools");
    /* renamed from: a */
    public final dak f23733a;
    /* renamed from: c */
    private final dbr f23734c;
    /* renamed from: d */
    private final gke f23735d;
    /* renamed from: e */
    private final gpn f23736e;
    /* renamed from: f */
    private final Context f23737f;
    /* renamed from: g */
    private final gtf f23738g;
    /* renamed from: h */
    private final ikd f23739h;
    /* renamed from: i */
    private final hjw f23740i;
    /* renamed from: j */
    private final gci f23741j;
    /* renamed from: k */
    private final ilp f23742k;
    /* renamed from: l */
    private final irs f23743l;
    /* renamed from: m */
    private final grg f23744m;
    /* renamed from: n */
    private final gnh f23745n;
    /* renamed from: o */
    private final fbm f23746o = new dbq();

    private dbo(dbr dbr, gke gke, gpn gpn, Context context, gtf gtf, ikd ikd, dak dak, hjw hjw, gci gci, ilp ilp, grg grg, gnh gnh, irs irs) {
        this.f23734c = dbr;
        this.f23735d = gke;
        this.f23735d.mo7163a();
        this.f23736e = gpn;
        this.f23737f = context;
        this.f23738g = gtf;
        this.f23739h = ikd;
        this.f23733a = dak;
        this.f23740i = hjw;
        this.f23741j = gci;
        this.f23742k = ilp;
        this.f23744m = grg;
        this.f23745n = gnh;
        this.f23743l = irs;
    }

    public final void close() {
        bli.m888a(f23732b, "close");
        this.f23734c.close();
        this.f23735d.mo7164b();
    }

    /* renamed from: a */
    public static bco m15548a(dbr dbr, Context context, gtf gtf, gsl gsl, ikd ikd, gpn gpn, dak dak, hjw hjw, gci gci, cbu cbu, ilp ilp, irs irs, grg grg, gnh gnh) {
        glo glo = new glo(gnv.m11435a(context, gsl), ikd, new iya(), irs);
        return new bco(new dbo(dbr, new gke(cbu.mo2251b()), gpn, context, gtf, ikd, dak, hjw, gci, ilp, grg, gnh, irs));
    }

    /* renamed from: a */
    public final gpn mo12958a() {
        return this.f23736e;
    }

    /* renamed from: b */
    public final ffc mo12961b() {
        return this.f23734c.mo12965b();
    }

    /* renamed from: c */
    public final dbr mo12962c() {
        return this.f23734c;
    }

    /* renamed from: a */
    public final void mo12959a(int i) {
        if (i == 1) {
            this.f23736e.mo7328a(R.raw.timer_final);
        } else if (i == 2 || i == 3) {
            this.f23736e.mo7328a(R.raw.timer_increment);
        }
    }

    /* renamed from: d */
    public final void mo12963d() {
        this.f23736e.mo7328a(R.raw.timer_start);
    }

    /* renamed from: a */
    public final void mo12960a(fbl fbl, dbn dbn) {
        boolean z;
        iut c;
        boolean z2 = true;
        this.f23739h.execute(new dbp(this));
        long currentTimeMillis = System.currentTimeMillis();
        gkr dap = new dap(this.f23738g.mo7437a(currentTimeMillis), currentTimeMillis, this.f23740i.mo7915d(), this.f23745n, this.f23744m);
        ((grg) jri.m13404b(dap.mo7077h())).mo7370a(new grj(this.f23743l, new iya()));
        dap.mo13371a(this.f23734c.mo12968e(), glw.IMAGE_INTENT);
        float floatValue = ((Float) this.f23734c.mo12969f().mo13673b()).floatValue();
        if (((Integer) this.f23742k.mo13673b()).intValue() != gxk.OFF.f6131e) {
            z = true;
        } else {
            z = false;
        }
        grg h = dap.mo7077h();
        eps a = epr.m2002o().mo6467a(19).mo6470a(String.valueOf(dap.mo13385n()).concat(".jpg"));
        if (this.f23734c.mo12966c() != iut.FRONT) {
            z2 = false;
        }
        h.mo7368a(a.mo6472a(z2).mo6479c(false).mo6473b(floatValue).mo6475b(((fxi) this.f23734c.mo12967d().f5007b.mo13673b()).f5016d).mo6478c(((fxj) this.f23734c.mo12967d().f5009d.mo13673b()).f5022d).mo6477b(z).mo6466a((float) dbn.f3136b).mo6476b(kbg.m4803b(dbn.f3135a.f3132a)).mo6474b(Boolean.valueOf(dbn.f3135a.f3133b)).mo6468a(this.f23734c.mo12965b().mo9075n()).mo6471a(kau.f21835a).mo6469a((Boolean) this.f23734c.mo12967d().f5010e.mo13673b()).mo6465a());
        ffc b = mo12961b();
        int i = this.f23741j.mo7034a().f7692e;
        this.f23737f.getExternalCacheDir();
        fbm fbm = this.f23746o;
        int i2 = this.f23735d.f5535a;
        if (b != null) {
            c = b.mo9064c();
        } else {
            c = iut.BACK;
        }
        this.f23734c.mo12964a().mo13215a(new fbk(i, fbl, fbm, i2, c, mo12961b().mo9074m(), imh.m3903a(Boolean.valueOf(false))), dap);
    }
}
