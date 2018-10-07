package p000;

/* compiled from: PG */
/* renamed from: kle */
public final class kle extends kvf {
    /* renamed from: a */
    private String f25230a;
    /* renamed from: b */
    private float f25231b;
    /* renamed from: c */
    private long f25232c;
    /* renamed from: d */
    private long f25233d;
    /* renamed from: e */
    private long[] f25234e;

    public kle() {
        this.f25230a = "";
        this.f25231b = 0.0f;
        this.f25232c = 0;
        this.f25233d = 0;
        this.f25234e = kvn.f9031f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int i = 0;
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.f25230a;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5478a(1, this.f25230a);
        }
        if (Float.floatToIntBits(this.f25231b) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(16) + 4;
        }
        long j = this.f25232c;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(3, j);
        }
        j = this.f25233d;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(4, j);
        }
        long[] jArr = this.f25234e;
        if (jArr == null || jArr.length <= 0) {
            return computeSerializedSize;
        }
        int i2 = 0;
        while (true) {
            long[] jArr2 = this.f25234e;
            int length = jArr2.length;
            if (i >= length) {
                return (computeSerializedSize + i2) + length;
            }
            i2 += kvd.m5480a(jArr2[i]);
            i++;
        }
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.mo10488i();
            int a;
            switch (i) {
                case 0:
                    break;
                case 10:
                    this.f25230a = kvc.mo10487h();
                    continue;
                case 21:
                    this.f25231b = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 24:
                    this.f25232c = kvc.mo10486g();
                    continue;
                case 32:
                    this.f25233d = kvc.mo10486g();
                    continue;
                case 40:
                    a = kvn.m5518a(kvc, 40);
                    Object obj = this.f25234e;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    Object obj2 = new long[(a + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length - 1) {
                        obj2[i] = kvc.mo10486g();
                        kvc.mo10488i();
                        i++;
                    }
                    obj2[i] = kvc.mo10486g();
                    this.f25234e = obj2;
                    continue;
                case 42:
                    int c = kvc.mo10479c(kvc.mo10485f());
                    a = kvc.mo10476b();
                    i = 0;
                    while (kvc.mo10472a() > 0) {
                        kvc.mo10486g();
                        i++;
                    }
                    kvc.mo10482d(a);
                    Object obj3 = this.f25234e;
                    if (obj3 != null) {
                        a = obj3.length;
                    } else {
                        a = 0;
                    }
                    Object obj4 = new long[(i + a)];
                    if (a != 0) {
                        System.arraycopy(obj3, 0, obj4, 0, a);
                    }
                    while (a < obj4.length) {
                        obj4[a] = kvc.mo10486g();
                        a++;
                    }
                    this.f25234e = obj4;
                    kvc.mo10477b(c);
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
        String str = this.f25230a;
        if (!(str == null || str.equals(""))) {
            kvd.mo10495b(1, this.f25230a);
        }
        if (Float.floatToIntBits(this.f25231b) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(2, this.f25231b);
        }
        long j = this.f25232c;
        if (j != 0) {
            kvd.mo10494b(3, j);
        }
        j = this.f25233d;
        if (j != 0) {
            kvd.mo10494b(4, j);
        }
        long[] jArr = this.f25234e;
        if (jArr != null && jArr.length > 0) {
            int i = 0;
            while (true) {
                long[] jArr2 = this.f25234e;
                if (i >= jArr2.length) {
                    break;
                }
                kvd.mo10494b(5, jArr2[i]);
                i++;
            }
        }
        super.writeTo(kvd);
    }
}
