package p000;

/* compiled from: PG */
/* renamed from: kjw */
public final class kjw extends kvf {
    /* renamed from: a */
    public int f25023a;
    /* renamed from: b */
    public int f25024b;

    public kjw() {
        this.f25023a = 0;
        this.f25024b = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    /* renamed from: a */
    private static int m16914a(int i) {
        if (i >= 0 && i <= 7) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(46);
        stringBuilder.append(i);
        stringBuilder.append(" is not a valid enum CaptureCommand");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f25023a;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(1, i);
        }
        i = this.f25024b;
        if (i != 0) {
            return computeSerializedSize + kvd.m5476a(2, i);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    private final kjw m16915a(kvc kvc) {
        int b;
        while (true) {
            int i = kvc.mo10488i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    b = kvc.mo10476b();
                    try {
                        this.f25023a = kjw.m16914a(kvc.mo10485f());
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.mo10482d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 16:
                    b = kvc.mo10476b();
                    try {
                        this.f25024b = kjw.m16914a(kvc.mo10485f());
                        continue;
                    } catch (IllegalArgumentException e2) {
                        kvc.mo10482d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                default:
                    if (!super.storeUnknownField(kvc, i)) {
                        break;
                    }
                    continue;
            }
        }
        return this;
    }

    public final void writeTo(kvd kvd) {
        int i = this.f25023a;
        if (i != 0) {
            kvd.mo10493b(1, i);
        }
        i = this.f25024b;
        if (i != 0) {
            kvd.mo10493b(2, i);
        }
        super.writeTo(kvd);
    }
}
