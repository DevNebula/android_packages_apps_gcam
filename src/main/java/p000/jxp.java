package p000;

import java.util.Objects;

/* compiled from: PG */
/* renamed from: jxp */
public final class jxp extends jxn {
    /* renamed from: a */
    private final int f21794a;

    public jxp(String str, long j, int i, int i2, int i3) {
        this(str, j, i, i2, i3, (byte) 0);
    }

    private jxp(String str, long j, int i, int i2, int i3, byte b) {
        boolean z;
        super(str, j, i2, i3);
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        this.f21794a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxp)) {
            return false;
        }
        jxp jxp = (jxp) obj;
        if (this.f8436b.equals(jxp.f8436b) && this.f21794a == jxp.f21794a && this.f8437c == jxp.f8437c && this.f8439e == jxp.f8439e && this.f8438d == jxp.f8438d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f8436b, Long.valueOf(this.f8437c), Integer.valueOf(this.f21794a), Integer.valueOf(this.f8439e), Integer.valueOf(this.f8438d)});
    }
}
