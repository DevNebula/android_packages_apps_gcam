package p000;

/* compiled from: PG */
/* renamed from: kkb */
public final class kkb extends kvf {
    /* renamed from: h */
    private static volatile kkb[] f25056h;
    /* renamed from: a */
    public float f25057a;
    /* renamed from: b */
    public float f25058b;
    /* renamed from: c */
    public float f25059c;
    /* renamed from: d */
    public float f25060d;
    /* renamed from: e */
    public float f25061e;
    /* renamed from: f */
    public float f25062f;
    /* renamed from: g */
    public float f25063g;

    public kkb() {
        this.f25057a = 0.0f;
        this.f25058b = 0.0f;
        this.f25059c = 0.0f;
        this.f25060d = 0.0f;
        this.f25061e = 0.0f;
        this.f25062f = 0.0f;
        this.f25063g = 0.0f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (Float.floatToIntBits(this.f25057a) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(8) + 4;
        }
        if (Float.floatToIntBits(this.f25058b) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(16) + 4;
        }
        if (Float.floatToIntBits(this.f25059c) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(24) + 4;
        }
        if (Float.floatToIntBits(this.f25060d) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(32) + 4;
        }
        if (Float.floatToIntBits(this.f25061e) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(40) + 4;
        }
        if (Float.floatToIntBits(this.f25062f) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(48) + 4;
        }
        if (Float.floatToIntBits(this.f25063g) == Float.floatToIntBits(0.0f)) {
            return computeSerializedSize;
        }
        return computeSerializedSize + (kvd.m5484b(56) + 4);
    }

    /* renamed from: a */
    public static kkb[] m16921a() {
        if (f25056h == null) {
            synchronized (kvj.f9023b) {
                if (f25056h == null) {
                    f25056h = new kkb[0];
                }
            }
        }
        return f25056h;
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.mo10488i();
            switch (i) {
                case 0:
                    break;
                case 13:
                    this.f25057a = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 21:
                    this.f25058b = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 29:
                    this.f25059c = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 37:
                    this.f25060d = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 45:
                    this.f25061e = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 53:
                    this.f25062f = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 61:
                    this.f25063g = Float.intBitsToFloat(kvc.mo10481d());
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
        if (Float.floatToIntBits(this.f25057a) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(1, this.f25057a);
        }
        if (Float.floatToIntBits(this.f25058b) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(2, this.f25058b);
        }
        if (Float.floatToIntBits(this.f25059c) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(3, this.f25059c);
        }
        if (Float.floatToIntBits(this.f25060d) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(4, this.f25060d);
        }
        if (Float.floatToIntBits(this.f25061e) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(5, this.f25061e);
        }
        if (Float.floatToIntBits(this.f25062f) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(6, this.f25062f);
        }
        if (Float.floatToIntBits(this.f25063g) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(7, this.f25063g);
        }
        super.writeTo(kvd);
    }
}
