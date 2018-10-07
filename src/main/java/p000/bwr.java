package p000;

/* compiled from: PG */
/* renamed from: bwr */
public final class bwr {
    /* renamed from: a */
    public int f1685a;
    /* renamed from: b */
    public int f1686b;
    /* renamed from: c */
    public int f1687c;
    /* renamed from: d */
    public long f1688d;
    /* renamed from: e */
    public long f1689e;
    /* renamed from: f */
    public float f1690f;
    /* renamed from: g */
    public float f1691g;
    /* renamed from: h */
    public float f1692h;

    public bwr() {
        this(0, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f);
    }

    public bwr(int i, int i2, int i3, long j, long j2, float f, float f2, float f3) {
        this.f1685a = i;
        this.f1686b = i2;
        this.f1687c = i3;
        this.f1688d = j;
        this.f1689e = j2;
        this.f1690f = f;
        this.f1691g = f2;
        this.f1692h = f3;
    }

    public final /* synthetic */ Object clone() {
        return new bwr(this.f1685a, this.f1686b, this.f1687c, this.f1688d, this.f1689e, this.f1690f, this.f1691g, this.f1692h);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        bwr bwr = (bwr) obj;
        if (this.f1685a == bwr.f1685a && this.f1686b == bwr.f1686b && this.f1687c == bwr.f1687c && this.f1688d == bwr.f1688d && this.f1689e == bwr.f1689e && this.f1690f == bwr.f1690f && this.f1691g == bwr.f1691g && this.f1692h == bwr.f1692h) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo2189a(bwr bwr) {
        this.f1685a = bwr.f1685a;
        this.f1686b = bwr.f1686b;
        this.f1687c = bwr.f1687c;
        this.f1688d = bwr.f1688d;
        this.f1689e = bwr.f1689e;
        this.f1690f = bwr.f1690f;
        this.f1691g = bwr.f1691g;
        this.f1692h = bwr.f1692h;
    }
}
