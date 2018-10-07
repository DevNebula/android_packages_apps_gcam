package p000;

import android.util.Pair;

/* compiled from: PG */
/* renamed from: fvl */
final class fvl extends fvr {
    /* renamed from: a */
    private final Float f18822a;
    /* renamed from: b */
    private final Pair f18823b;

    fvl(Float f, Pair pair) {
        this.f18822a = f;
        this.f18823b = pair;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fvr)) {
            return false;
        }
        fvr fvr = (fvr) obj;
        Float f = this.f18822a;
        if (f == null ? fvr.mo6920a() != null : !f.equals(fvr.mo6920a())) {
            Pair pair = this.f18823b;
            if (pair != null) {
                if (pair.equals(fvr.mo6921b())) {
                    return true;
                }
            } else if (fvr.mo6921b() == null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final Float mo6920a() {
        return this.f18822a;
    }

    /* renamed from: b */
    public final Pair mo6921b() {
        return this.f18823b;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        Float f = this.f18822a;
        if (f != null) {
            hashCode = f.hashCode();
        } else {
            hashCode = 0;
        }
        hashCode = (hashCode ^ 1000003) * 1000003;
        Pair pair = this.f18823b;
        if (pair != null) {
            i = pair.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f18822a);
        String valueOf2 = String.valueOf(this.f18823b);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 48) + String.valueOf(valueOf2).length());
        stringBuilder.append("FocusDistanceResult{focusDistance=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", focusRange=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
