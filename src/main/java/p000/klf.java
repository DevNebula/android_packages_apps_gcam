package p000;

/* compiled from: PG */
/* renamed from: klf */
public final class klf extends kvf {
    /* renamed from: b */
    private static volatile klf[] f25235b;
    /* renamed from: a */
    public float f25236a;
    /* renamed from: c */
    private float f25237c;
    /* renamed from: d */
    private float f25238d;
    /* renamed from: e */
    private boolean f25239e;
    /* renamed from: f */
    private float f25240f;

    public klf() {
        this.f25236a = 0.0f;
        this.f25237c = 0.0f;
        this.f25238d = 0.0f;
        this.f25239e = false;
        this.f25240f = 0.0f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (Float.floatToIntBits(this.f25236a) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(8) + 4;
        }
        if (Float.floatToIntBits(this.f25237c) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(16) + 4;
        }
        if (Float.floatToIntBits(this.f25238d) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(24) + 4;
        }
        if (this.f25239e) {
            computeSerializedSize += kvd.m5484b(32) + 1;
        }
        if (Float.floatToIntBits(this.f25240f) == Float.floatToIntBits(0.0f)) {
            return computeSerializedSize;
        }
        return computeSerializedSize + (kvd.m5484b(40) + 4);
    }

    /* renamed from: a */
    public static klf[] m16937a() {
        if (f25235b == null) {
            synchronized (kvj.f9023b) {
                if (f25235b == null) {
                    f25235b = new klf[0];
                }
            }
        }
        return f25235b;
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.mo10488i();
            switch (i) {
                case 0:
                    break;
                case 13:
                    this.f25236a = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 21:
                    this.f25237c = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 29:
                    this.f25238d = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 32:
                    this.f25239e = kvc.mo10480c();
                    continue;
                case 45:
                    this.f25240f = Float.intBitsToFloat(kvc.mo10481d());
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
        if (Float.floatToIntBits(this.f25236a) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(1, this.f25236a);
        }
        if (Float.floatToIntBits(this.f25237c) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(2, this.f25237c);
        }
        if (Float.floatToIntBits(this.f25238d) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(3, this.f25238d);
        }
        boolean z = this.f25239e;
        if (z) {
            kvd.mo10491a(4, z);
        }
        if (Float.floatToIntBits(this.f25240f) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(5, this.f25240f);
        }
        super.writeTo(kvd);
    }
}
