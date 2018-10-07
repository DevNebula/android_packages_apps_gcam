package p000;

import java.util.Objects;

/* compiled from: PG */
/* renamed from: jsp */
public final class jsp implements Comparable {
    /* renamed from: a */
    public final jiq f8312a;
    /* renamed from: b */
    public final juh f8313b;

    public jsp(jiq jiq, juh juh) {
        jri.m13404b((Object) jiq);
        jri.m13404b((Object) juh);
        this.f8312a = jiq;
        this.f8313b = juh;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(((jsp) obj).f8312a.mo9460a(), this.f8312a.mo9460a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        jsp jsp = (jsp) obj;
        if (this.f8312a.equals(jsp.f8312a) && this.f8313b.equals(jsp.f8313b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f8312a, this.f8313b});
    }
}
