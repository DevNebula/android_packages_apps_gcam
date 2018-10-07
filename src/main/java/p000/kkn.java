package p000;

/* compiled from: PG */
/* renamed from: kkn */
public final class kkn extends kvf {
    /* renamed from: a */
    private float f25161a;
    /* renamed from: b */
    private float f25162b;

    public kkn() {
        this.f25161a = 0.0f;
        this.f25162b = 0.0f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (Float.floatToIntBits(this.f25161a) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(8) + 4;
        }
        if (Float.floatToIntBits(this.f25162b) == Float.floatToIntBits(0.0f)) {
            return computeSerializedSize;
        }
        return computeSerializedSize + (kvd.m5484b(16) + 4);
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.mo10488i();
            switch (i) {
                case 0:
                    break;
                case 13:
                    this.f25161a = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 21:
                    this.f25162b = Float.intBitsToFloat(kvc.mo10481d());
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
        if (Float.floatToIntBits(this.f25161a) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(1, this.f25161a);
        }
        if (Float.floatToIntBits(this.f25162b) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(2, this.f25162b);
        }
        super.writeTo(kvd);
    }
}
