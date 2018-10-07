package p000;

/* compiled from: PG */
/* renamed from: jzc */
public final class jzc extends jzf {
    /* renamed from: a */
    private final float f21825a;

    public jzc(float f) {
        this.f21825a = f;
    }

    /* renamed from: a */
    private final int m13603a(jzf jzf) {
        if (this == jzf) {
            return 0;
        }
        float f = ((jzc) jzf).f21825a;
        float f2 = this.f21825a;
        if (f2 < f) {
            return -1;
        }
        if (f2 > f) {
            return 1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jzf) && m13603a((jzf) obj) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final float mo9629a() {
        return this.f21825a;
    }
}
