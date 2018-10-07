package p000;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: ive */
public final class ive {
    /* renamed from: a */
    public final int f7860a;
    /* renamed from: b */
    public final iqp f7861b;

    public ive(int i, iqp iqp) {
        this.f7860a = i;
        this.f7861b = iqp;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ive)) {
            ive ive = (ive) obj;
            if (ive.f7860a == this.f7860a && ive.f7861b.equals(this.f7861b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7860a), this.f7861b});
    }

    public final String toString() {
        return jqk.m13351b("ImageReaderFormat").mo9703a("ImageFormat", ion.m4019b(this.f7860a)).mo9703a("Size", this.f7861b).toString();
    }
}
