package p000;

import android.graphics.Rect;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: fyy */
public final class fyy {
    /* renamed from: a */
    public final ive f5059a;
    /* renamed from: b */
    public final ive f5060b;
    /* renamed from: c */
    public final kbg f5061c;
    /* renamed from: d */
    public final iqp f5062d;
    /* renamed from: e */
    public final Rect f5063e;

    public fyy(ive ive, ive ive2, kbg kbg, iqp iqp, Rect rect) {
        this.f5059a = ive;
        this.f5060b = ive2;
        this.f5061c = kbg;
        this.f5062d = iqp;
        this.f5063e = rect;
    }

    /* renamed from: a */
    public static fyy m2475a(ffc ffc, iqp iqp, int i) {
        gcu gcu = new gcu(ffc, iqp, i);
        List<iqp> b = gcu.f19021a.mo9063b(gcu.f19023c);
        if (b.isEmpty()) {
            int i2 = gcu.f19023c;
            StringBuilder stringBuilder = new StringBuilder(50);
            stringBuilder.append("No picture sizes supported for format: ");
            stringBuilder.append(i2);
            throw new fyx(stringBuilder.toString());
        }
        iqp a;
        iqp iqp2 = gcu.f19022b;
        jri.m13405b(b.isEmpty() ^ 1);
        iqp iqp3 = null;
        long j = Long.MAX_VALUE;
        for (iqp a2 : b) {
            iqp iqp4;
            long j2;
            long a3 = a2.mo8812a();
            long j3;
            if (a2.f7695a < iqp2.f7695a) {
                j3 = j;
                iqp4 = iqp3;
                j2 = j3;
            } else if (a2.f7696b < iqp2.f7696b) {
                j3 = j;
                iqp4 = iqp3;
                j2 = j3;
            } else if (a3 < j) {
                iqp4 = a2;
                j2 = a3;
            } else {
                j3 = j;
                iqp4 = iqp3;
                j2 = j3;
            }
            iqp3 = iqp4;
            j = j2;
        }
        if (iqp3 == null) {
            a2 = ion.m3998a((List) b);
        } else {
            a2 = iqp3;
        }
        return new fyy(new ive(gcu.f19023c, a2), new ive(gcu.f19023c, ion.m3998a((List) b)), kau.f21835a, gcu.f19022b, ipz.m4077b(gcu.f19022b).mo8749a(a2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fyy)) {
            return false;
        }
        fyy fyy = (fyy) obj;
        if (this.f5062d.equals(fyy.f5062d) && this.f5061c.equals(fyy.f5061c) && this.f5060b.equals(fyy.f5060b) && this.f5059a.equals(fyy.f5059a) && this.f5063e.equals(fyy.f5063e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5062d, this.f5061c, this.f5060b, this.f5059a, this.f5063e});
    }

    public final String toString() {
        return jqk.m13351b("PictureSizeCalculator.Configuration").mo9703a("desired size", this.f5062d).mo9703a("large image reader", this.f5059a).mo9703a("full-size image reader", this.f5060b).mo9703a("reprocessing output image reader", this.f5061c).mo9703a("crop", this.f5063e).toString();
    }
}
