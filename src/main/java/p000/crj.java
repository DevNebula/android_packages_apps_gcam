package p000;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: crj */
public final class crj implements crd {
    /* renamed from: a */
    public static final String f13193a = bli.m887a("OnDemandLoader");
    /* renamed from: b */
    public final int f13194b;
    /* renamed from: c */
    public final kwk f13195c;
    /* renamed from: d */
    public crg f13196d;
    /* renamed from: e */
    public final ikb f13197e;
    /* renamed from: f */
    public final ird f13198f;
    /* renamed from: g */
    public AtomicBoolean f13199g = new AtomicBoolean(true);
    /* renamed from: h */
    public AtomicBoolean f13200h = new AtomicBoolean(false);
    /* renamed from: i */
    public ijx f13201i;
    /* renamed from: j */
    public ArrayList f13202j = new ArrayList();
    /* renamed from: k */
    public crb f13203k;

    public crj(kwk kwk, aws aws, bmb bmb, ird ird) {
        int i;
        this.f13195c = (kwk) jri.m13404b((Object) kwk);
        this.f13197e = aws.mo1824a().mo8558b();
        this.f13201i = new ijx(ijy.m3846a(this.f13197e, "OnDemandLoader"));
        this.f13198f = (ird) jri.m13404b((Object) ird);
        if (bmb.mo2020b()) {
            i = 1;
        } else {
            i = 20;
        }
        this.f13194b = i;
    }

    /* renamed from: a */
    final void mo12898a(kpw kpw) {
        this.f13201i.execute(new crl(this, kpw));
    }

    /* renamed from: a */
    public final void mo5685a(cre cre) {
        if (!this.f13199g.get() && !this.f13200h.get() && this.f13202j.contains(cre) && this.f13199g.compareAndSet(false, true)) {
            int b = this.f13203k.mo5684b(cre.mo5692e().mo6541g().f4384h);
            String str = f13193a;
            int i = this.f13203k.f2788d.f2781c;
            StringBuilder stringBuilder = new StringBuilder(79);
            stringBuilder.append("Node at index: ");
            stringBuilder.append(b);
            stringBuilder.append(" triggering load. Current filmstrip size: ");
            stringBuilder.append(i);
            bli.m888a(str, stringBuilder.toString());
            mo12898a(null);
        }
    }
}
