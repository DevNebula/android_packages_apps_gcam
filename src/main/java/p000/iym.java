package p000;

/* compiled from: PG */
/* renamed from: iym */
public final class iym extends kvf {
    /* renamed from: a */
    private long f24696a;
    /* renamed from: b */
    private long f24697b;
    /* renamed from: c */
    private long f24698c;
    /* renamed from: d */
    private float f24699d;
    /* renamed from: e */
    private float f24700e;
    /* renamed from: f */
    private long f24701f;
    /* renamed from: g */
    private iyn f24702g;
    /* renamed from: h */
    private float f24703h;
    /* renamed from: i */
    private int f24704i;
    /* renamed from: j */
    private int f24705j;
    /* renamed from: k */
    private int f24706k;
    /* renamed from: l */
    private iyn f24707l;
    /* renamed from: m */
    private int f24708m;
    /* renamed from: n */
    private int f24709n;

    public iym() {
        this.f24696a = 0;
        this.f24697b = 0;
        this.f24698c = 0;
        this.f24699d = 0.0f;
        this.f24700e = 0.0f;
        this.f24701f = 0;
        this.f24702g = null;
        this.f24703h = 0.0f;
        this.f24704i = 0;
        this.f24705j = 0;
        this.f24706k = 0;
        this.f24707l = null;
        this.f24708m = 0;
        this.f24709n = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f24696a;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(1, j);
        }
        j = this.f24697b;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(2, j);
        }
        j = this.f24698c;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(3, j);
        }
        if (Float.floatToIntBits(this.f24699d) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(32) + 4;
        }
        if (Float.floatToIntBits(this.f24700e) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(40) + 4;
        }
        j = this.f24701f;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(6, j);
        }
        kvl kvl = this.f24702g;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(7, kvl);
        }
        if (Float.floatToIntBits(this.f24703h) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(64) + 4;
        }
        int i = this.f24704i;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(9, i);
        }
        i = this.f24705j;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(10, i);
        }
        i = this.f24706k;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(11, i);
        }
        kvl = this.f24707l;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(12, kvl);
        }
        i = this.f24708m;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(13, i);
        }
        i = this.f24709n;
        if (i != 0) {
            return computeSerializedSize + kvd.m5476a(14, i);
        }
        return computeSerializedSize;
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.mo10488i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    this.f24696a = kvc.mo10486g();
                    continue;
                case 16:
                    this.f24697b = kvc.mo10486g();
                    continue;
                case 24:
                    this.f24698c = kvc.mo10486g();
                    continue;
                case 37:
                    this.f24699d = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 45:
                    this.f24700e = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 48:
                    this.f24701f = kvc.mo10486g();
                    continue;
                case 58:
                    if (this.f24702g == null) {
                        this.f24702g = new iyn();
                    }
                    kvc.mo10474a(this.f24702g);
                    continue;
                case 69:
                    this.f24703h = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 72:
                    this.f24704i = kvc.mo10485f();
                    continue;
                case 80:
                    this.f24705j = kvc.mo10485f();
                    continue;
                case 88:
                    this.f24706k = kvc.mo10485f();
                    continue;
                case 98:
                    if (this.f24707l == null) {
                        this.f24707l = new iyn();
                    }
                    kvc.mo10474a(this.f24707l);
                    continue;
                case 104:
                    this.f24708m = kvc.mo10485f();
                    continue;
                case 112:
                    this.f24709n = kvc.mo10485f();
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
        long j = this.f24696a;
        if (j != 0) {
            kvd.mo10494b(1, j);
        }
        j = this.f24697b;
        if (j != 0) {
            kvd.mo10494b(2, j);
        }
        j = this.f24698c;
        if (j != 0) {
            kvd.mo10494b(3, j);
        }
        if (Float.floatToIntBits(this.f24699d) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(4, this.f24699d);
        }
        if (Float.floatToIntBits(this.f24700e) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(5, this.f24700e);
        }
        j = this.f24701f;
        if (j != 0) {
            kvd.mo10494b(6, j);
        }
        kvl kvl = this.f24702g;
        if (kvl != null) {
            kvd.mo10496b(7, kvl);
        }
        if (Float.floatToIntBits(this.f24703h) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(8, this.f24703h);
        }
        int i = this.f24704i;
        if (i != 0) {
            kvd.mo10493b(9, i);
        }
        i = this.f24705j;
        if (i != 0) {
            kvd.mo10493b(10, i);
        }
        i = this.f24706k;
        if (i != 0) {
            kvd.mo10493b(11, i);
        }
        kvl = this.f24707l;
        if (kvl != null) {
            kvd.mo10496b(12, kvl);
        }
        i = this.f24708m;
        if (i != 0) {
            kvd.mo10493b(13, i);
        }
        i = this.f24709n;
        if (i != 0) {
            kvd.mo10493b(14, i);
        }
        super.writeTo(kvd);
    }
}
