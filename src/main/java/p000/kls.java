package p000;

/* compiled from: PG */
/* renamed from: kls */
public final class kls extends kvf {
    /* renamed from: a */
    private long f25290a;
    /* renamed from: b */
    private float f25291b;
    /* renamed from: c */
    private float f25292c;
    /* renamed from: d */
    private float f25293d;

    public kls() {
        this.f25290a = 0;
        this.f25291b = 0.0f;
        this.f25292c = 0.0f;
        this.f25293d = 0.0f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f25290a;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(1, j);
        }
        if (Float.floatToIntBits(this.f25291b) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(16) + 4;
        }
        if (Float.floatToIntBits(this.f25292c) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(24) + 4;
        }
        if (Float.floatToIntBits(this.f25293d) == Float.floatToIntBits(0.0f)) {
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
                case 8:
                    this.f25290a = kvc.mo10486g();
                    continue;
                case 21:
                    this.f25291b = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 29:
                    this.f25292c = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 37:
                    this.f25293d = Float.intBitsToFloat(kvc.mo10481d());
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
        long j = this.f25290a;
        if (j != 0) {
            kvd.mo10494b(1, j);
        }
        if (Float.floatToIntBits(this.f25291b) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(2, this.f25291b);
        }
        if (Float.floatToIntBits(this.f25292c) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(3, this.f25292c);
        }
        if (Float.floatToIntBits(this.f25293d) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(4, this.f25293d);
        }
        super.writeTo(kvd);
    }
}
