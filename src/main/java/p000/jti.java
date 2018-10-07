package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: jti */
public final class jti implements jtv {
    /* renamed from: a */
    private final float f21727a;
    /* renamed from: b */
    private final List f21728b;
    /* renamed from: c */
    private final float[] f21729c;
    /* renamed from: d */
    private final float[] f21730d;
    /* renamed from: e */
    private final float[] f21731e;
    /* renamed from: f */
    private jtv[] f21732f;
    /* renamed from: g */
    private final List f21733g;

    jti(List list, float f, List list2, float[] fArr, float[] fArr2, float[] fArr3) {
        this.f21733g = list;
        this.f21727a = f;
        this.f21729c = fArr;
        this.f21730d = fArr2;
        this.f21731e = fArr3;
        this.f21728b = ken.m13713a((Collection) list2);
        if (this.f21730d.length != this.f21731e.length) {
            throw new IllegalStateException(String.format(Locale.ENGLISH, "Dimensionality of normalization means doesn't match standard deviations: %d vs. %d", new Object[]{Integer.valueOf(this.f21730d.length), Integer.valueOf(this.f21731e.length)}));
        }
        int size = this.f21733g.size();
        if (size != this.f21730d.length) {
            throw new IllegalStateException(String.format(Locale.ENGLISH, "Dimensionality of features doesn't match normalization data: %d vs. %d", new Object[]{Integer.valueOf(this.f21733g.size()), Integer.valueOf(this.f21730d.length)}));
        } else if (this.f21729c.length != this.f21728b.size() + size) {
            throw new IllegalStateException(String.format(Locale.ENGLISH, "Dimensionality of weight vector does not match total number of features: %d vs. %d", new Object[]{Integer.valueOf(this.f21729c.length), Integer.valueOf(size + this.f21728b.size())}));
        }
    }

    /* renamed from: a */
    public static jtj m13447a(jtl jtl) {
        return new jtj(jtl);
    }

    /* renamed from: a */
    public final jzf mo9554a(long j) {
        int i;
        jri.m13404b(this.f21729c);
        jri.m13404b(this.f21730d);
        jri.m13404b(this.f21731e);
        if (this.f21732f == null) {
            this.f21732f = new jtv[this.f21733g.size()];
            Iterator it = this.f21733g.iterator();
            i = 0;
            while (true) {
                int i2 = i;
                if (!it.hasNext()) {
                    break;
                }
                this.f21732f[i2] = (jtv) ((kbn) it.next()).mo9715b();
                i = i2 + 1;
            }
        }
        float[] fArr = new float[this.f21729c.length];
        i = 0;
        while (true) {
            jtv[] jtvArr = this.f21732f;
            if (i >= jtvArr.length) {
                break;
            }
            fArr[i] = (jtvArr[i].mo9554a(j).mo9629a() - this.f21730d[i]) / this.f21731e[i];
            i++;
        }
        i = 0;
        while (true) {
            int i3 = i;
            float f;
            if (i3 < this.f21728b.size()) {
                int length = this.f21732f.length + i3;
                jto jto = (jto) this.f21728b.get(i3);
                boolean z = jto.f8334a == jtp.ABS ? jto.f8337d : true;
                jri.m13395a(z);
                f = fArr[jto.f8335b];
                if (jto.f8337d) {
                    f = Math.abs(f);
                }
                switch (jto.f8334a.ordinal()) {
                    case 0:
                        f *= fArr[jto.f8336c];
                        break;
                    case 1:
                        f = (float) ((2.0d / (Math.exp((double) ((jto.f8338e - f) * jto.f8339f)) + 1.0d)) - 4.0d);
                        break;
                    default:
                        break;
                }
                fArr[length] = f;
                i = i3 + 1;
            } else {
                f = this.f21727a;
                for (i = 0; i < fArr.length; i++) {
                    f += fArr[i] * this.f21729c[i];
                }
                return new jzc(f);
            }
        }
    }

    /* renamed from: b */
    public final void mo9556b(long j) {
    }

    /* renamed from: c */
    public final void mo9557c(long j) {
    }

    /* renamed from: a */
    public final void mo9555a() {
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f21732f);
        float f = this.f21727a;
        String arrays2 = Arrays.toString(this.f21729c);
        String arrays3 = Arrays.toString(this.f21730d);
        String arrays4 = Arrays.toString(this.f21731e);
        String valueOf = String.valueOf(this.f21728b);
        int length = String.valueOf(arrays).length();
        int length2 = String.valueOf(arrays2).length();
        int length3 = String.valueOf(arrays3).length();
        StringBuilder stringBuilder = new StringBuilder(((((length + 101) + length2) + length3) + String.valueOf(arrays4).length()) + String.valueOf(valueOf).length());
        stringBuilder.append("ExplicitNonlinearScorer[scorers=");
        stringBuilder.append(arrays);
        stringBuilder.append(", bias=");
        stringBuilder.append(f);
        stringBuilder.append(", weights=");
        stringBuilder.append(arrays2);
        stringBuilder.append(", normMeans=");
        stringBuilder.append(arrays3);
        stringBuilder.append(", normDevs=");
        stringBuilder.append(arrays4);
        stringBuilder.append(", transforms=");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
