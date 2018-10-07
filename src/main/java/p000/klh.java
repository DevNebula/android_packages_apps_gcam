package p000;

/* compiled from: PG */
/* renamed from: klh */
public final class klh extends kvf {
    /* renamed from: a */
    public int f25248a;
    /* renamed from: b */
    public int f25249b;
    /* renamed from: c */
    public int f25250c;
    /* renamed from: d */
    public float f25251d;
    /* renamed from: e */
    public long f25252e;
    /* renamed from: f */
    public long f25253f;

    public klh() {
        this.f25248a = 0;
        this.f25249b = 0;
        this.f25250c = 0;
        this.f25251d = 0.0f;
        this.f25252e = 0;
        this.f25253f = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    /* renamed from: a */
    public static int m16939a(int i) {
        if (i >= 0 && i <= 6) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(48);
        stringBuilder.append(i);
        stringBuilder.append(" is not a valid enum InteractionCause");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: b */
    public static int m16941b(int i) {
        if ((i >= 0 && i <= 2) || ((i >= 5 && i <= 15) || (i >= 17 && i <= 22))) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(36);
        stringBuilder.append(i);
        stringBuilder.append(" is not a valid enum Mode");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f25248a;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(1, i);
        }
        i = this.f25249b;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(2, i);
        }
        i = this.f25250c;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(3, i);
        }
        if (Float.floatToIntBits(this.f25251d) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(32) + 4;
        }
        long j = this.f25252e;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(5, j);
        }
        j = this.f25253f;
        if (j != 0) {
            return computeSerializedSize + kvd.m5477a(6, j);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    private final klh m16940a(kvc kvc) {
        int b;
        while (true) {
            int i = kvc.mo10488i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    b = kvc.mo10476b();
                    try {
                        this.f25248a = klh.m16941b(kvc.mo10485f());
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.mo10482d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 16:
                    b = kvc.mo10476b();
                    try {
                        this.f25249b = klh.m16941b(kvc.mo10485f());
                        continue;
                    } catch (IllegalArgumentException e2) {
                        kvc.mo10482d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 24:
                    b = kvc.mo10476b();
                    try {
                        this.f25250c = klh.m16939a(kvc.mo10485f());
                        continue;
                    } catch (IllegalArgumentException e3) {
                        kvc.mo10482d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 37:
                    this.f25251d = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 40:
                    this.f25252e = kvc.mo10486g();
                    continue;
                case 48:
                    this.f25253f = kvc.mo10486g();
                    continue;
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
        int i = this.f25248a;
        if (i != 0) {
            kvd.mo10493b(1, i);
        }
        i = this.f25249b;
        if (i != 0) {
            kvd.mo10493b(2, i);
        }
        i = this.f25250c;
        if (i != 0) {
            kvd.mo10493b(3, i);
        }
        if (Float.floatToIntBits(this.f25251d) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(4, this.f25251d);
        }
        long j = this.f25252e;
        if (j != 0) {
            kvd.mo10494b(5, j);
        }
        j = this.f25253f;
        if (j != 0) {
            kvd.mo10494b(6, j);
        }
        super.writeTo(kvd);
    }
}
