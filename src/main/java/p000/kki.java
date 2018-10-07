package p000;

/* compiled from: PG */
/* renamed from: kki */
public final class kki extends kvf {
    /* renamed from: a */
    private int f25142a;
    /* renamed from: b */
    private int f25143b;
    /* renamed from: c */
    private int f25144c;
    /* renamed from: d */
    private int f25145d;
    /* renamed from: e */
    private float f25146e;

    public kki() {
        this.f25142a = 0;
        this.f25143b = 0;
        this.f25144c = 0;
        this.f25145d = 0;
        this.f25146e = 0.0f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f25142a;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(1, i);
        }
        i = this.f25143b;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(2, i);
        }
        i = this.f25144c;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(3, i);
        }
        i = this.f25145d;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(4, i);
        }
        if (Float.floatToIntBits(this.f25146e) == Float.floatToIntBits(0.0f)) {
            return computeSerializedSize;
        }
        return computeSerializedSize + (kvd.m5484b(40) + 4);
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.mo10488i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    this.f25142a = kvc.mo10485f();
                    continue;
                case 16:
                    this.f25143b = kvc.mo10485f();
                    continue;
                case 24:
                    this.f25144c = kvc.mo10485f();
                    continue;
                case 32:
                    this.f25145d = kvc.mo10485f();
                    continue;
                case 45:
                    this.f25146e = Float.intBitsToFloat(kvc.mo10481d());
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
        int i = this.f25142a;
        if (i != 0) {
            kvd.mo10493b(1, i);
        }
        i = this.f25143b;
        if (i != 0) {
            kvd.mo10493b(2, i);
        }
        i = this.f25144c;
        if (i != 0) {
            kvd.mo10493b(3, i);
        }
        i = this.f25145d;
        if (i != 0) {
            kvd.mo10493b(4, i);
        }
        if (Float.floatToIntBits(this.f25146e) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(5, this.f25146e);
        }
        super.writeTo(kvd);
    }
}
