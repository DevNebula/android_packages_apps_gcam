package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: ixh */
public final class ixh implements ixm {
    /* renamed from: a */
    private final ixk f21339a;
    /* renamed from: b */
    private final Object f21340b = this;
    /* renamed from: c */
    private final kgx f21341c = new kho(kgc.f21893a);
    /* renamed from: d */
    private final kcv f21342d = new kcv();

    public ixh(ixk ixk) {
        this.f21339a = ixk;
    }

    /* renamed from: a */
    public final int mo9153a() {
        int i;
        synchronized (this.f21340b) {
            if (this.f21339a.mo9150a() < 0) {
                i = this.f21342d.mo9929i() + 1;
            } else {
                i = this.f21339a.mo9150a();
            }
        }
        return i;
    }

    /* renamed from: a */
    private final void m12867a(Long l, iqo iqo) {
        this.f21342d.mo9928c(l, iqo);
        this.f21341c.remove(l);
    }

    /* renamed from: h */
    private final void m12869h() {
        if (!this.f21342d.mo13949m()) {
            while (this.f21339a.mo9152a(khb.m4934a(this.f21341c))) {
                Long l = (Long) this.f21341c.mo14057k().mo9954b();
                iqo iqo = (iqo) this.f21342d.mo15586b(l).get(0);
                m12867a(l, iqo);
                iqo.close();
            }
        }
    }

    /* renamed from: b */
    private final iqo m12868b(long j) {
        synchronized (this.f21340b) {
            kgx kgx = this.f21341c;
            Long valueOf = Long.valueOf(j);
            if (kgx.contains(valueOf)) {
                iqo iqo = (iqo) this.f21342d.mo15586b(valueOf).get(0);
                return iqo;
            }
            return null;
        }
    }

    /* renamed from: b */
    public final List mo9157b() {
        List arrayList;
        synchronized (this.f21340b) {
            arrayList = new ArrayList(this.f21342d.mo9929i());
            long j = -1;
            for (Long longValue : this.f21341c) {
                long longValue2 = longValue.longValue();
                if (j != longValue2) {
                    arrayList.addAll(this.f21342d.mo15586b(Long.valueOf(longValue2)));
                    j = longValue2;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    private final iqo m12870i() {
        synchronized (this.f21340b) {
            if (this.f21341c.isEmpty()) {
                return null;
            }
            iqo iqo = (iqo) this.f21342d.mo15586b((Long) this.f21341c.mo14057k().mo9954b()).get(0);
            return iqo;
        }
    }

    /* renamed from: j */
    private final iqo m12871j() {
        synchronized (this.f21340b) {
            if (this.f21341c.isEmpty()) {
                return null;
            }
            List b = this.f21342d.mo15586b((Long) this.f21341c.mo14058l().mo9954b());
            iqo iqo = (iqo) b.get(b.size() - 1);
            return iqo;
        }
    }

    /* renamed from: k */
    private final List m12872k() {
        List arrayList;
        synchronized (this.f21340b) {
            arrayList = new ArrayList(this.f21342d.mo9929i());
            long j = -1;
            for (Long longValue : this.f21341c) {
                long longValue2 = longValue.longValue();
                if (j != longValue2) {
                    arrayList.addAll(this.f21342d.mo15586b(Long.valueOf(longValue2)));
                    j = longValue2;
                }
            }
            this.f21342d.mo9927c();
            this.f21341c.clear();
        }
        return arrayList;
    }

    /* renamed from: l */
    private final iqo m12873l() {
        synchronized (this.f21340b) {
            if (this.f21341c.isEmpty()) {
                return null;
            }
            Long l = (Long) this.f21341c.mo14057k().mo9954b();
            iqo iqo = (iqo) this.f21342d.mo15586b(l).get(0);
            m12867a(l, iqo);
            return iqo;
        }
    }

    /* renamed from: a */
    public final boolean mo9156a(int i) {
        synchronized (this.f21340b) {
            if (this.f21339a.mo9151a(i)) {
                m12869h();
                return true;
            }
            return false;
        }
    }

    /* renamed from: g */
    public final int mo9162g() {
        int i;
        synchronized (this.f21340b) {
            i = this.f21342d.mo9929i();
        }
        return i;
    }
}
