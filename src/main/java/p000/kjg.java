package p000;

/* compiled from: PG */
/* renamed from: kjg */
public final class kjg extends kvf {
    /* renamed from: a */
    private float f24963a;
    /* renamed from: b */
    private float f24964b;
    /* renamed from: c */
    private kjh[] f24965c;

    public kjg() {
        this.f24963a = 0.0f;
        this.f24964b = 0.0f;
        this.f24965c = kjh.m16901a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (Float.floatToIntBits(this.f24963a) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(8) + 4;
        }
        if (Float.floatToIntBits(this.f24964b) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(16) + 4;
        }
        kjh[] kjhArr = this.f24965c;
        if (kjhArr == null || kjhArr.length <= 0) {
            return computeSerializedSize;
        }
        int i = computeSerializedSize;
        computeSerializedSize = 0;
        while (true) {
            kjh[] kjhArr2 = this.f24965c;
            if (computeSerializedSize >= kjhArr2.length) {
                return i;
            }
            kvl kvl = kjhArr2[computeSerializedSize];
            if (kvl != null) {
                i += kvd.m5479a(10, kvl);
            }
            computeSerializedSize++;
        }
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.mo10488i();
            switch (i) {
                case 0:
                    break;
                case 13:
                    this.f24963a = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 21:
                    this.f24964b = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 82:
                    int a = kvn.m5518a(kvc, 82);
                    Object obj = this.f24965c;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    Object obj2 = new kjh[(a + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length - 1) {
                        obj2[i] = new kjh();
                        kvc.mo10474a(obj2[i]);
                        kvc.mo10488i();
                        i++;
                    }
                    obj2[i] = new kjh();
                    kvc.mo10474a(obj2[i]);
                    this.f24965c = obj2;
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
        if (Float.floatToIntBits(this.f24963a) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(1, this.f24963a);
        }
        if (Float.floatToIntBits(this.f24964b) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(2, this.f24964b);
        }
        kjh[] kjhArr = this.f24965c;
        if (kjhArr != null && kjhArr.length > 0) {
            int i = 0;
            while (true) {
                kjh[] kjhArr2 = this.f24965c;
                if (i >= kjhArr2.length) {
                    break;
                }
                kvl kvl = kjhArr2[i];
                if (kvl != null) {
                    kvd.mo10496b(10, kvl);
                }
                i++;
            }
        }
        super.writeTo(kvd);
    }
}
