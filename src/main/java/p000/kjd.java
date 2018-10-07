package p000;

/* compiled from: PG */
/* renamed from: kjd */
public final class kjd extends kvf {
    /* renamed from: a */
    private float f24957a;

    public kjd() {
        this.f24957a = 0.0f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (Float.floatToIntBits(this.f24957a) == Float.floatToIntBits(0.0f)) {
            return computeSerializedSize;
        }
        return computeSerializedSize + (kvd.m5484b(8) + 4);
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.mo10488i();
            switch (i) {
                case 0:
                    break;
                case 13:
                    this.f24957a = Float.intBitsToFloat(kvc.mo10481d());
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
        if (Float.floatToIntBits(this.f24957a) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(1, this.f24957a);
        }
        super.writeTo(kvd);
    }
}
