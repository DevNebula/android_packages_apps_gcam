package p000;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: cza */
public final class cza {
    /* renamed from: a */
    private final iur f3051a;
    /* renamed from: b */
    private final fxj f3052b = null;

    private cza(iur iur, fxj fxj) {
        this.f3051a = iur;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cza cza = (cza) obj;
        if (kbf.m16778b(this.f3051a, cza.f3051a) && kbf.m16778b(this.f3052b, cza.f3052b)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static cza m1600a(cwc cwc) {
        return new cza(cwc.f3020a, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3051a, this.f3052b});
    }

    public final String toString() {
        kbd b = jqk.m13350b((Object) this);
        b.mo9704a().f8551b = this.f3051a;
        b.mo9704a().f8551b = this.f3052b;
        return b.toString();
    }
}
