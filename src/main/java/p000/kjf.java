package p000;

/* compiled from: PG */
/* renamed from: kjf */
public final class kjf extends kvf {
    /* renamed from: a */
    private float f24959a;
    /* renamed from: b */
    private int f24960b;
    /* renamed from: c */
    private int f24961c;
    /* renamed from: d */
    private float f24962d;

    public kjf() {
        this.f24959a = 0.0f;
        this.f24960b = 0;
        this.f24961c = 0;
        this.f24962d = 0.0f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (Float.floatToIntBits(this.f24959a) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(8) + 4;
        }
        int i = this.f24960b;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(2, i);
        }
        i = this.f24961c;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(3, i);
        }
        if (Float.floatToIntBits(this.f24962d) == Float.floatToIntBits(0.0f)) {
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
                    this.f24959a = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 16:
                    this.f24960b = kvc.mo10485f();
                    continue;
                case 24:
                    this.f24961c = kvc.mo10485f();
                    continue;
                case 37:
                    this.f24962d = Float.intBitsToFloat(kvc.mo10481d());
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
        if (Float.floatToIntBits(this.f24959a) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(1, this.f24959a);
        }
        int i = this.f24960b;
        if (i != 0) {
            kvd.mo10493b(2, i);
        }
        i = this.f24961c;
        if (i != 0) {
            kvd.mo10493b(3, i);
        }
        if (Float.floatToIntBits(this.f24962d) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(4, this.f24962d);
        }
        super.writeTo(kvd);
    }
}
