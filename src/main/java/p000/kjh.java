package p000;

/* compiled from: PG */
/* renamed from: kjh */
public final class kjh extends kvf {
    /* renamed from: a */
    private static volatile kjh[] f24966a;
    /* renamed from: b */
    private long f24967b;
    /* renamed from: c */
    private long f24968c;
    /* renamed from: d */
    private float f24969d;
    /* renamed from: e */
    private float f24970e;
    /* renamed from: f */
    private float f24971f;
    /* renamed from: g */
    private float f24972g;
    /* renamed from: h */
    private int f24973h;
    /* renamed from: i */
    private int f24974i;
    /* renamed from: j */
    private int f24975j;
    /* renamed from: k */
    private int f24976k;
    /* renamed from: l */
    private kls f24977l;
    /* renamed from: m */
    private float f24978m;
    /* renamed from: n */
    private float f24979n;

    public kjh() {
        this.f24967b = 0;
        this.f24968c = 0;
        this.f24969d = 0.0f;
        this.f24970e = 0.0f;
        this.f24971f = 0.0f;
        this.f24972g = 0.0f;
        this.f24973h = 0;
        this.f24974i = 0;
        this.f24975j = 0;
        this.f24976k = 0;
        this.f24977l = null;
        this.f24978m = 0.0f;
        this.f24979n = 0.0f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f24967b;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(1, j);
        }
        j = this.f24968c;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(2, j);
        }
        if (Float.floatToIntBits(this.f24969d) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(24) + 4;
        }
        if (Float.floatToIntBits(this.f24970e) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(32) + 4;
        }
        if (Float.floatToIntBits(this.f24971f) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(40) + 4;
        }
        if (Float.floatToIntBits(this.f24972g) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(48) + 4;
        }
        int i = this.f24973h;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(7, i);
        }
        i = this.f24974i;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(8, i);
        }
        i = this.f24975j;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(9, i);
        }
        i = this.f24976k;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(10, i);
        }
        kvl kvl = this.f24977l;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(20, kvl);
        }
        if (Float.floatToIntBits(this.f24978m) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(168) + 4;
        }
        if (Float.floatToIntBits(this.f24979n) == Float.floatToIntBits(0.0f)) {
            return computeSerializedSize;
        }
        return computeSerializedSize + (kvd.m5484b(176) + 4);
    }

    /* renamed from: a */
    public static kjh[] m16901a() {
        if (f24966a == null) {
            synchronized (kvj.f9023b) {
                if (f24966a == null) {
                    f24966a = new kjh[0];
                }
            }
        }
        return f24966a;
    }

    /* renamed from: a */
    private final kjh m16900a(kvc kvc) {
        while (true) {
            int i = kvc.mo10488i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    this.f24967b = kvc.mo10486g();
                    continue;
                case 16:
                    this.f24968c = kvc.mo10486g();
                    continue;
                case 29:
                    this.f24969d = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 37:
                    this.f24970e = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 45:
                    this.f24971f = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 53:
                    this.f24972g = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 56:
                    this.f24973h = kvc.mo10485f();
                    continue;
                case 64:
                    this.f24974i = kvc.mo10485f();
                    continue;
                case 72:
                    this.f24975j = kvc.mo10485f();
                    continue;
                case 80:
                    int b = kvc.mo10476b();
                    try {
                        this.f24976k = klh.m16941b(kvc.mo10485f());
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.mo10482d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 162:
                    if (this.f24977l == null) {
                        this.f24977l = new kls();
                    }
                    kvc.mo10474a(this.f24977l);
                    continue;
                case 173:
                    this.f24978m = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 181:
                    this.f24979n = Float.intBitsToFloat(kvc.mo10481d());
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
        long j = this.f24967b;
        if (j != 0) {
            kvd.mo10494b(1, j);
        }
        j = this.f24968c;
        if (j != 0) {
            kvd.mo10494b(2, j);
        }
        if (Float.floatToIntBits(this.f24969d) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(3, this.f24969d);
        }
        if (Float.floatToIntBits(this.f24970e) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(4, this.f24970e);
        }
        if (Float.floatToIntBits(this.f24971f) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(5, this.f24971f);
        }
        if (Float.floatToIntBits(this.f24972g) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(6, this.f24972g);
        }
        int i = this.f24973h;
        if (i != 0) {
            kvd.mo10493b(7, i);
        }
        i = this.f24974i;
        if (i != 0) {
            kvd.mo10493b(8, i);
        }
        i = this.f24975j;
        if (i != 0) {
            kvd.mo10493b(9, i);
        }
        i = this.f24976k;
        if (i != 0) {
            kvd.mo10493b(10, i);
        }
        kvl kvl = this.f24977l;
        if (kvl != null) {
            kvd.mo10496b(20, kvl);
        }
        if (Float.floatToIntBits(this.f24978m) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(21, this.f24978m);
        }
        if (Float.floatToIntBits(this.f24979n) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(22, this.f24979n);
        }
        super.writeTo(kvd);
    }
}
