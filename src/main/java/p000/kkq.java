package p000;

/* compiled from: PG */
/* renamed from: kkq */
public final class kkq extends kvf {
    /* renamed from: a */
    private kkj f25166a;
    /* renamed from: b */
    private float f25167b;
    /* renamed from: c */
    private int f25168c;

    public kkq() {
        this.f25166a = null;
        this.f25167b = 0.0f;
        this.f25168c = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        kvl kvl = this.f25166a;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(1, kvl);
        }
        if (Float.floatToIntBits(this.f25167b) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(16) + 4;
        }
        int i = this.f25168c;
        if (i != 0) {
            return computeSerializedSize + kvd.m5476a(3, i);
        }
        return computeSerializedSize;
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.mo10488i();
            switch (i) {
                case 0:
                    break;
                case 10:
                    if (this.f25166a == null) {
                        this.f25166a = new kkj();
                    }
                    kvc.mo10474a(this.f25166a);
                    continue;
                case 21:
                    this.f25167b = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 24:
                    this.f25168c = kvc.mo10485f();
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
        kvl kvl = this.f25166a;
        if (kvl != null) {
            kvd.mo10496b(1, kvl);
        }
        if (Float.floatToIntBits(this.f25167b) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(2, this.f25167b);
        }
        int i = this.f25168c;
        if (i != 0) {
            kvd.mo10493b(3, i);
        }
        super.writeTo(kvd);
    }
}
