package p000;

/* compiled from: PG */
/* renamed from: vu */
final class C0546vu {
    /* renamed from: a */
    public int f9935a = 0;
    /* renamed from: b */
    private int f9936b;
    /* renamed from: c */
    private int f9937c;
    /* renamed from: d */
    private int f9938d;
    /* renamed from: e */
    private int f9939e;

    C0546vu() {
    }

    /* renamed from: a */
    final void mo11408a(int i) {
        this.f9935a |= i;
    }

    /* renamed from: a */
    final boolean mo11410a() {
        int i = this.f9935a;
        if ((i & 7) != 0 && (i & C0546vu.m6126a(this.f9938d, this.f9936b)) == 0) {
            return false;
        }
        i = this.f9935a;
        if ((i & 112) != 0 && (i & (C0546vu.m6126a(this.f9938d, this.f9937c) << 4)) == 0) {
            return false;
        }
        i = this.f9935a;
        if ((i & 1792) != 0 && (i & (C0546vu.m6126a(this.f9939e, this.f9936b) << 8)) == 0) {
            return false;
        }
        i = this.f9935a;
        if ((i & 28672) == 0 || (i & (C0546vu.m6126a(this.f9939e, this.f9937c) << 12)) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static int m6126a(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        if (i == i2) {
            return 2;
        }
        return 4;
    }

    /* renamed from: a */
    final void mo11409a(int i, int i2, int i3, int i4) {
        this.f9936b = i;
        this.f9937c = i2;
        this.f9938d = i3;
        this.f9939e = i4;
    }
}
