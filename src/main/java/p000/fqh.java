package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: fqh */
final class fqh implements fux {
    /* renamed from: a */
    public final fwb f24290a;
    /* renamed from: b */
    public final ikb f24291b;
    /* renamed from: c */
    public final grg f24292c;
    /* renamed from: d */
    public iqm f24293d;
    /* renamed from: e */
    public final /* synthetic */ fqg f24294e;
    /* renamed from: f */
    private final fsa f24295f;
    /* renamed from: g */
    private final List f24296g;
    /* renamed from: h */
    private final fbk f24297h;

    private fqh(fqg fqg, fsa fsa, fwb fwb, grg grg, fbk fbk) {
        this.f24294e = fqg;
        this.f24295f = fsa;
        this.f24290a = fwb;
        this.f24292c = grg;
        this.f24297h = fbk;
        this.f24296g = new ArrayList();
        this.f24291b = new ikb();
        this.f24291b.mo8557a(this.f24290a);
    }

    /* synthetic */ fqh(fqg fqg, fsa fsa, fwb fwb, grg grg, fbk fbk, byte b) {
        this(fqg, fsa, fwb, grg, fbk);
    }

    /* renamed from: a */
    private final void m16018a() {
        this.f24291b.close();
        for (iwz close : this.f24296g) {
            close.close();
        }
    }

    /* renamed from: a */
    public final void mo13282a(iwz iwz, kpk kpk) {
        this.f24293d = iqm.m4095a(((Integer) this.f24294e.f18639e.mo1837b().mo13673b()).intValue());
        this.f24296g.add(new fkp(iwz, kpk));
    }

    public final void close() {
        Object obj = null;
        if (this.f24296g.isEmpty()) {
            this.f24291b.close();
            return;
        }
        boolean z;
        if (this.f24296g.size() == this.f24294e.f18641g) {
            z = true;
        } else {
            z = false;
        }
        jri.m13405b(z);
        jri.m13404b(this.f24293d);
        try {
            this.f24292c.mo7371a((iwp) ((kpk) jri.m13404b(((fkp) this.f24296g.get(0)).mo15529h())).get((long) fqg.f18635a, TimeUnit.MILLISECONDS));
            List arrayList = new ArrayList();
            for (fkp fkp : this.f24296g) {
                if (fkp.mo15530i()) {
                    arrayList.add(new iuz(fkp, 3));
                } else {
                    iqz iqz = this.f24294e.f18636b;
                    String valueOf = String.valueOf(fkp.mo15528a(fkr.f4831b));
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
                    stringBuilder.append("Ignoring and closing image ");
                    stringBuilder.append(valueOf);
                    iqz.mo8838f(stringBuilder.toString());
                    fkp.close();
                }
            }
            List a = m16016a(arrayList);
            List a2 = m16016a(arrayList);
            arrayList = m16016a(arrayList);
            kpk a3 = this.f24295f.mo6881a(a, (iqm) jri.m13404b(this.f24293d));
            if (this.f24293d != null) {
                z = true;
            } else {
                z = false;
            }
            jri.m13405b(z);
            kpk a4 = kny.m18475a(a3, new fqm(this, a2), kpq.f8776a);
            jri.m13404b(this.f24293d);
            kow.m13878a(a4, new fqp(this), kpq.f8776a);
            kpk a5 = kny.m18475a(a3, new fqi(this, arrayList), kpq.f8776a);
            if (((Boolean) this.f24294e.f18644j.mo13673b()).booleanValue() && this.f24294e.f18643i.mo9709b() && this.f24297h.f4678e == iut.FRONT) {
                obj = 1;
            }
            if (obj == null) {
                a4 = m16017a(a5);
            } else {
                a4 = m16017a(kny.m18476a(a5, new fqk(this), kpq.f8776a));
            }
            a4 = kny.m18476a(a4, new fqj(this), kpq.f8776a);
            kow.m13878a(a4, new fqs(this), kpq.f8776a);
            kow.m13878a(a4, new fqo(this), kpq.f8776a);
        } catch (Throwable e) {
            this.f24294e.f18636b.mo8835c("Unable to save image.  Camera likely shutdown.", e);
            m16018a();
        } catch (Throwable e2) {
            this.f24294e.f18636b.mo8835c("Interrupted before image could be saved", e2);
            m16018a();
            Thread.currentThread().interrupt();
        } catch (Throwable e22) {
            this.f24294e.f18636b.mo8835c("Timeout retrieving image metadata, aborting the shot", e22);
            m16018a();
        }
    }

    /* renamed from: a */
    private final kpk m16017a(kpk kpk) {
        return kny.m18476a(kpk, new fql(this), kpq.f8776a);
    }

    /* renamed from: a */
    private final List m16016a(List list) {
        boolean z;
        int i = 0;
        if (list.size() == this.f24296g.size()) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        List arrayList = new ArrayList();
        while (i < list.size()) {
            arrayList.add(new fkp(new iva((iwz) list.get(i)), ((fkp) this.f24296g.get(i)).mo15529h()));
            i++;
        }
        return arrayList;
    }
}
