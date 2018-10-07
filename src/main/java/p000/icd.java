package p000;

import java.util.Arrays;

/* renamed from: icd */
public final class icd {
    /* renamed from: a */
    public final huh f7288a;
    /* renamed from: b */
    private final boolean f7289b = false;
    /* renamed from: c */
    private final int f7290c;
    /* renamed from: d */
    private final hui f7291d;

    public icd(huh huh, hui hui) {
        this.f7288a = huh;
        this.f7291d = hui;
        this.f7290c = Arrays.hashCode(new Object[]{this.f7288a, this.f7291d});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof icd)) {
            return false;
        }
        icd icd = (icd) obj;
        return htl.m3483a(this.f7288a, icd.f7288a) && htl.m3483a(this.f7291d, icd.f7291d);
    }

    public final int hashCode() {
        return this.f7290c;
    }
}
