package p000;

import java.util.Objects;

/* compiled from: PG */
/* renamed from: jwx */
public final class jwx extends jxn {
    /* renamed from: a */
    public final String f21791a;

    public jwx(String str, String str2, long j, int i, int i2) {
        this(str, str2, j, i, i2, 0);
    }

    public jwx(String str, String str2, long j, int i, int i2, long j2) {
        super(str2, j, i, i2, j2);
        jri.m13404b((Object) str);
        this.f21791a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwx)) {
            return false;
        }
        jwx jwx = (jwx) obj;
        if (Objects.equals(this.f21791a, jwx.f21791a) && Objects.equals(this.f8436b, jwx.f8436b) && this.f8437c == jwx.f8437c && this.f8439e == jwx.f8439e && this.f8438d == jwx.f8438d && this.f8440f == jwx.f8440f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f21791a, this.f8436b, Long.valueOf(this.f8437c), Integer.valueOf(this.f8439e), Integer.valueOf(this.f8438d), Long.valueOf(this.f8440f)});
    }
}
