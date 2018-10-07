package p000;

/* compiled from: PG */
/* renamed from: kmb */
public final class kmb extends kvf {
    /* renamed from: a */
    public float f25330a;
    /* renamed from: b */
    public float f25331b;
    /* renamed from: c */
    public float f25332c;
    /* renamed from: d */
    public float f25333d;

    public kmb() {
        this.f25330a = 0.0f;
        this.f25331b = 0.0f;
        this.f25332c = 0.0f;
        this.f25333d = 0.0f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (Float.floatToIntBits(this.f25330a) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(8) + 4;
        }
        if (Float.floatToIntBits(this.f25331b) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(16) + 4;
        }
        if (Float.floatToIntBits(this.f25332c) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(24) + 4;
        }
        if (Float.floatToIntBits(this.f25333d) == Float.floatToIntBits(0.0f)) {
            return computeSerializedSize;
        }
        return computeSerializedSize + (kvd.m5484b(32) + 4);
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.mo10488i();
            switch (i) {
                case 0:
                    break;
                case 13:
                    this.f25330a = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 21:
                    this.f25331b = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 29:
                    this.f25332c = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 37:
                    this.f25333d = Float.intBitsToFloat(kvc.mo10481d());
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
        if (Float.floatToIntBits(this.f25330a) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(1, this.f25330a);
        }
        if (Float.floatToIntBits(this.f25331b) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(2, this.f25331b);
        }
        if (Float.floatToIntBits(this.f25332c) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(3, this.f25332c);
        }
        if (Float.floatToIntBits(this.f25333d) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(4, this.f25333d);
        }
        super.writeTo(kvd);
    }
}
