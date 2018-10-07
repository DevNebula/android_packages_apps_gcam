package p000;

/* compiled from: PG */
/* renamed from: kmf */
public final class kmf extends kvf {
    /* renamed from: a */
    public float f25344a;
    /* renamed from: b */
    public long f25345b;
    /* renamed from: c */
    public int f25346c;
    /* renamed from: d */
    public int f25347d;
    /* renamed from: e */
    public float f25348e;
    /* renamed from: f */
    public boolean f25349f;
    /* renamed from: g */
    public int f25350g;

    public kmf() {
        this.f25344a = 0.0f;
        this.f25345b = 0;
        this.f25346c = 0;
        this.f25347d = 0;
        this.f25348e = 0.0f;
        this.f25349f = false;
        this.f25350g = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (Float.floatToIntBits(this.f25344a) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(8) + 4;
        }
        long j = this.f25345b;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(2, j);
        }
        int i = this.f25346c;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(3, i);
        }
        i = this.f25347d;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(4, i);
        }
        if (Float.floatToIntBits(this.f25348e) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(40) + 4;
        }
        if (this.f25349f) {
            computeSerializedSize += kvd.m5484b(48) + 1;
        }
        i = this.f25350g;
        if (i != 0) {
            return computeSerializedSize + kvd.m5476a(7, i);
        }
        return computeSerializedSize;
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.mo10488i();
            switch (i) {
                case 0:
                    break;
                case 13:
                    this.f25344a = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 16:
                    this.f25345b = kvc.mo10486g();
                    continue;
                case 24:
                    this.f25346c = kvc.mo10485f();
                    continue;
                case 32:
                    this.f25347d = kvc.mo10485f();
                    continue;
                case 45:
                    this.f25348e = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 48:
                    this.f25349f = kvc.mo10480c();
                    continue;
                case 56:
                    this.f25350g = kvc.mo10485f();
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
        if (Float.floatToIntBits(this.f25344a) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(1, this.f25344a);
        }
        long j = this.f25345b;
        if (j != 0) {
            kvd.mo10494b(2, j);
        }
        int i = this.f25346c;
        if (i != 0) {
            kvd.mo10493b(3, i);
        }
        i = this.f25347d;
        if (i != 0) {
            kvd.mo10493b(4, i);
        }
        if (Float.floatToIntBits(this.f25348e) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(5, this.f25348e);
        }
        boolean z = this.f25349f;
        if (z) {
            kvd.mo10491a(6, z);
        }
        i = this.f25350g;
        if (i != 0) {
            kvd.mo10493b(7, i);
        }
        super.writeTo(kvd);
    }
}
