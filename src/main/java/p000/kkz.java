package p000;

/* compiled from: PG */
/* renamed from: kkz */
public final class kkz extends kvf {
    /* renamed from: f */
    private static volatile kkz[] f25202f;
    /* renamed from: a */
    public int f25203a;
    /* renamed from: b */
    public float f25204b;
    /* renamed from: c */
    public float f25205c;
    /* renamed from: d */
    public float f25206d;
    /* renamed from: e */
    public long f25207e;
    /* renamed from: g */
    private kkb[] f25208g;

    public kkz() {
        this.f25203a = 0;
        this.f25204b = 0.0f;
        this.f25205c = 0.0f;
        this.f25206d = 0.0f;
        this.f25207e = 0;
        this.f25208g = kkb.m16921a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f25203a;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(1, i);
        }
        if (Float.floatToIntBits(this.f25204b) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(16) + 4;
        }
        if (Float.floatToIntBits(this.f25205c) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(24) + 4;
        }
        if (Float.floatToIntBits(this.f25206d) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(32) + 4;
        }
        long j = this.f25207e;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(5, j);
        }
        kkb[] kkbArr = this.f25208g;
        if (kkbArr == null || kkbArr.length <= 0) {
            return computeSerializedSize;
        }
        i = computeSerializedSize;
        computeSerializedSize = 0;
        while (true) {
            kkb[] kkbArr2 = this.f25208g;
            if (computeSerializedSize >= kkbArr2.length) {
                return i;
            }
            kvl kvl = kkbArr2[computeSerializedSize];
            if (kvl != null) {
                i += kvd.m5479a(6, kvl);
            }
            computeSerializedSize++;
        }
    }

    /* renamed from: a */
    public static kkz[] m16933a() {
        if (f25202f == null) {
            synchronized (kvj.f9023b) {
                if (f25202f == null) {
                    f25202f = new kkz[0];
                }
            }
        }
        return f25202f;
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.mo10488i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    this.f25203a = kvc.mo10485f();
                    continue;
                case 21:
                    this.f25204b = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 29:
                    this.f25205c = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 37:
                    this.f25206d = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 40:
                    this.f25207e = kvc.mo10486g();
                    continue;
                case 50:
                    int a = kvn.m5518a(kvc, 50);
                    Object obj = this.f25208g;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    Object obj2 = new kkb[(a + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length - 1) {
                        obj2[i] = new kkb();
                        kvc.mo10474a(obj2[i]);
                        kvc.mo10488i();
                        i++;
                    }
                    obj2[i] = new kkb();
                    kvc.mo10474a(obj2[i]);
                    this.f25208g = obj2;
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
        int i = this.f25203a;
        if (i != 0) {
            kvd.mo10493b(1, i);
        }
        if (Float.floatToIntBits(this.f25204b) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(2, this.f25204b);
        }
        if (Float.floatToIntBits(this.f25205c) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(3, this.f25205c);
        }
        if (Float.floatToIntBits(this.f25206d) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(4, this.f25206d);
        }
        long j = this.f25207e;
        if (j != 0) {
            kvd.mo10494b(5, j);
        }
        kkb[] kkbArr = this.f25208g;
        if (kkbArr != null && kkbArr.length > 0) {
            i = 0;
            while (true) {
                kkb[] kkbArr2 = this.f25208g;
                if (i >= kkbArr2.length) {
                    break;
                }
                kvl kvl = kkbArr2[i];
                if (kvl != null) {
                    kvd.mo10496b(6, kvl);
                }
                i++;
            }
        }
        super.writeTo(kvd);
    }
}
