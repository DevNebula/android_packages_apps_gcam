package p000;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: coy */
public final class coy implements hfz {
    /* renamed from: a */
    public static final String f13070a = bli.m887a("CameraDataAdapter");
    /* renamed from: b */
    public final cpw f13071b = new cpw();
    /* renamed from: c */
    public final Context f13072c;
    /* renamed from: d */
    public final aws f13073d;
    /* renamed from: e */
    public final cqm f13074e;
    /* renamed from: f */
    public final cqx f13075f;
    /* renamed from: g */
    public final gsp f13076g;
    /* renamed from: h */
    public final cqf f13077h;
    /* renamed from: i */
    public crb f13078i;
    /* renamed from: j */
    public cqc f13079j;
    /* renamed from: k */
    public long f13080k = -1;
    /* renamed from: l */
    public final ird f13081l;
    /* renamed from: m */
    public cqo f13082m;
    /* renamed from: n */
    public AtomicBoolean f13083n;
    /* renamed from: o */
    private final ExecutorService f13084o;
    /* renamed from: p */
    private int f13085p = 1600;
    /* renamed from: q */
    private int f13086q = 1600;
    /* renamed from: r */
    private err f13087r;
    /* renamed from: s */
    private final ikd f13088s;
    /* renamed from: t */
    private final crj f13089t;

    static {
        bsb bsb = new bsb("camera.partial_load");
    }

    public coy(Context context, aws aws, cqm cqm, cqx cqx, gsp gsp, cqf cqf, ird ird, ExecutorService executorService, ikd ikd, bsn bsn, crj crj) {
        this.f13072c = context;
        this.f13073d = aws;
        this.f13074e = cqm;
        this.f13075f = cqx;
        this.f13076g = gsp;
        this.f13077h = cqf;
        this.f13081l = ird;
        this.f13084o = executorService;
        this.f13088s = ikd;
        this.f13078i = new crb();
        this.f13089t = crj;
        this.f13083n = new AtomicBoolean(false);
    }

    /* renamed from: a */
    public final void mo7822a(csj csj) {
        boolean z;
        String str = f13070a;
        String valueOf = String.valueOf(csj);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 32);
        stringBuilder.append("adding filmstrip data listener: ");
        stringBuilder.append(valueOf);
        bli.m896d(str, stringBuilder.toString());
        cpw cpw = this.f13071b;
        int size = cpw.f13133a.size();
        int i = cpw.f13134b;
        if (size < i) {
            z = true;
        } else {
            z = false;
        }
        stringBuilder = new StringBuilder(72);
        stringBuilder.append("More listeners added than is allowed in configured capacity: ");
        stringBuilder.append(i);
        jri.m13406b(z, stringBuilder.toString());
        cpw.f13133a.add(csj);
        if (this.f13078i.f2788d.f2781c != 0) {
            csj.mo5730a();
        }
    }

    /* renamed from: a */
    public final boolean mo7825a(err err, boolean z) {
        jri.m13404b((Object) err);
        String str = f13070a;
        String valueOf = String.valueOf(err);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 12);
        stringBuilder.append("addOrUpdate ");
        stringBuilder.append(valueOf);
        bli.m896d(str, stringBuilder.toString());
        Uri uri = err.mo6541g().f4384h;
        int a = mo7813a(uri);
        if (a != crb.f2784a) {
            String str2 = f13070a;
            str = String.valueOf(uri);
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 22);
            stringBuilder2.append("found duplicate data: ");
            stringBuilder2.append(str);
            bli.m896d(str2, stringBuilder2.toString());
            mo12889a(a, err);
            return false;
        }
        m8641a(err);
        return true;
    }

    /* renamed from: a */
    public final void mo7824a(List list) {
        for (AsyncTask asyncTask : list) {
            if (asyncTask != null) {
                asyncTask.cancel(false);
            }
        }
    }

    /* renamed from: a */
    public final void mo7818a() {
        mo12890a(new crb());
        this.f13071b.mo5730a();
    }

    /* renamed from: b */
    public final boolean mo7831b() {
        if (this.f13087r == null) {
            return false;
        }
        new cpg().execute(new err[]{this.f13087r});
        this.f13087r = null;
        return true;
    }

    /* renamed from: a */
    public final int mo7813a(Uri uri) {
        return this.f13078i.mo5684b(uri);
    }

    /* renamed from: b */
    public final cre mo7827b(Uri uri) {
        return this.f13078i.mo5682a(uri);
    }

    /* renamed from: c */
    public final int mo7832c() {
        return this.f13078i.f2788d.f2781c;
    }

    /* renamed from: a */
    public final err mo7816a(int i) {
        return m8642g(i);
    }

    /* renamed from: b */
    public final cre mo7826b(int i) {
        return mo7836d(i);
    }

    /* renamed from: a */
    public final int mo7814a(cre cre) {
        return mo7813a(cre.mo5692e().mo6541g().f4384h);
    }

    /* renamed from: g */
    private final err m8642g(int i) {
        if (i >= 0) {
            crb crb = this.f13078i;
            if (i < crb.f2788d.f2781c) {
                return crb.mo5681a(i).mo5692e();
            }
        }
        return null;
    }

    /* renamed from: c */
    public final int mo7833c(int i) {
        if (i >= 0) {
            crb crb = this.f13078i;
            if (i < crb.f2788d.f2781c) {
                return crb.mo5681a(i).mo5692e().mo6539e() - 1;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final List mo7817a(int i, int i2) {
        List arrayList = new ArrayList();
        for (int max = Math.max(0, i); max < i2; max++) {
            arrayList.add(Integer.valueOf(max));
        }
        return arrayList;
    }

    /* renamed from: d */
    public final cre mo7836d(int i) {
        return this.f13078i.mo5681a(i);
    }

    /* renamed from: d */
    public final int mo7835d() {
        return this.f13078i.f2788d.f2781c;
    }

    /* renamed from: a */
    public final View mo7815a(View view, cre cre, cpx cpx) {
        jri.m13404b((Object) cre);
        if (cre == cre.f2792c) {
            return null;
        }
        err e = cre.mo5692e();
        e.mo6534b(this.f13085p, this.f13086q);
        return e.mo6527a(kbg.m4803b(view), this, false, cpx);
    }

    /* renamed from: a */
    private final void m8641a(err err) {
        jri.m13404b((Object) err);
        cre a = this.f13078i.mo5683a(err);
        int b = this.f13078i.mo5684b(a.mo5692e().mo6541g().f4384h);
        cpd cpd = new cpd();
        err.mo6547m();
        this.f13071b.mo5731a(b, a);
    }

    /* renamed from: e */
    public final boolean mo7839e(int i) {
        if (i >= 0) {
            crb crb = this.f13078i;
            if (i < crb.f2788d.f2781c) {
                return crb.mo5681a(i).mo5692e().mo6545k().f4343b.f4344a;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final List mo7828b(List list) {
        List arrayList = new ArrayList();
        for (Integer num : list) {
            if (!mo7839e(num.intValue())) {
                arrayList.add(mo7840f(num.intValue()));
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final void mo7834c(Uri uri) {
        m8640a(uri, kpq.f8776a, kpq.f8776a);
    }

    /* renamed from: d */
    public final void mo7837d(Uri uri) {
        m8640a(uri, this.f13084o, this.f13088s);
    }

    /* renamed from: a */
    private final void m8640a(Uri uri, Executor executor, Executor executor2) {
        ikd.m12501a();
        int a = mo7813a(uri);
        if (a != crb.f2784a) {
            err e = this.f13078i.mo5681a(a).mo5692e();
            e.getClass();
            jli.m13190a(executor, new coz(e)).mo9275a(executor2, new cpb(this, uri));
        }
    }

    /* renamed from: b */
    public final void mo7830b(cre cre) {
        err e = cre.mo5692e();
        int a = mo7814a(cre);
        cre.mo5691d();
        mo7831b();
        if (!e.mo6540f().mo6552e()) {
            this.f13087r = e;
        }
        this.f13071b.mo5733b(a, cre);
    }

    /* renamed from: a */
    final void mo12890a(crb crb) {
        if (crb.f2788d.f2781c != 0 || this.f13078i.f2788d.f2781c != 0) {
            this.f13078i = crb;
            String str = f13070a;
            int i = crb.f2788d.f2781c;
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append("Replacing filmstrip item list with new list of size: ");
            stringBuilder.append(i);
            bli.m894c(str, stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public final void mo7823a(iqb iqb) {
        this.f13083n.set(true);
        bli.m888a(f13070a, "resetPartialLoading");
        Object crb = new crb();
        crj crj = this.f13089t;
        crj.f13199g.set(true);
        crj.f13200h.set(false);
        crj.f13203k = (crb) jri.m13404b(crb);
        crj.f13203k.f2786b = crj;
        jri.m13404b((Object) this);
        kpk d = kpw.m18486d();
        crj.f13201i.execute(new crk(crj, d));
        kow.m13878a(d, new cpe(this, crb, iqb), kpq.f8776a);
    }

    /* renamed from: e */
    public final kpk mo7838e() {
        kpk d = kpw.m18486d();
        new cph(this, this.f13080k, d).execute(new Void[0]);
        return d;
    }

    /* renamed from: f */
    public final void mo7841f() {
        cpj cpj = new cpj(this);
        cpj.execute(new crb[]{this.f13078i});
        this.f13073d.mo1824a().mo8557a(new cpa(cpj));
    }

    /* renamed from: a */
    public final void mo7820a(cqo cqo) {
        this.f13078i.mo5683a((err) cqo);
        this.f13082m = cqo;
    }

    /* renamed from: a */
    public final void mo7819a(cqc cqc) {
        this.f13079j = cqc;
    }

    /* renamed from: b */
    public final void mo7829b(int i, int i2) {
        this.f13085p = i;
        this.f13086q = i2;
    }

    /* renamed from: g */
    public final boolean mo7842g() {
        err err = this.f13087r;
        if (err == null) {
            return false;
        }
        this.f13087r = null;
        m8641a(err);
        return true;
    }

    /* renamed from: a */
    public final void mo12889a(int i, err err) {
        mo7821a(this.f13078i.mo5681a(i), err);
    }

    /* renamed from: f */
    public final AsyncTask mo7840f(int i) {
        return m8639a(m8642g(i).mo6541g().f4384h, false);
    }

    /* renamed from: a */
    private final AsyncTask m8639a(Uri uri, boolean z) {
        AsyncTask cpi = new cpi(this, z);
        cpi.execute(new Uri[]{uri});
        return cpi;
    }

    /* renamed from: a */
    public final void mo7821a(cre cre, err err) {
        jri.m13404b((Object) err);
        if (!cov.m8617a(err)) {
            cre.mo5687a(err);
            cpc cpc = new cpc();
            err.mo6547m();
            m8639a(err.mo6541g().f4384h, true);
        }
    }
}
