package p000;

import java.io.File;

/* compiled from: PG */
/* renamed from: cot */
public final class cot extends cqn implements Comparable {
    /* renamed from: a */
    public kbg f23657a = kau.f21835a;
    /* renamed from: b */
    public Boolean f23658b;
    /* renamed from: d */
    private int f23659d = -1;

    public cot(cql cql) {
        super((cql) jri.m13404b((Object) cql));
    }

    /* renamed from: a */
    private final int m15402a(cot cot) {
        int d_;
        int i = LfuScheduler.MAX_PRIORITY;
        try {
            d_ = mo14823d_();
        } catch (jya e) {
            d_ = i;
        }
        try {
            i = cot.mo14823d_();
        } catch (jya e2) {
        }
        if (d_ != i) {
            return Integer.compare(d_, i);
        }
        String str = this.f13151c.f13139e.f4383g;
        return str.compareTo(str);
    }

    /* renamed from: d_ */
    public final int mo14823d_() {
        if (this.f23659d == -1) {
            this.f23659d = jxr.m4737a().mo9609a(new File(this.f13151c.f13139e.f4383g));
        }
        return this.f23659d;
    }

    /* renamed from: b */
    public final cot mo6536c() {
        err c = this.f13151c.mo6536c();
        if (c == null) {
            return null;
        }
        if (c instanceof cot) {
            return (cot) c;
        }
        return new cot((cql) c);
    }
}
