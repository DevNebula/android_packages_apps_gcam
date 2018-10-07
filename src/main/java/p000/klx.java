package p000;

/* compiled from: PG */
/* renamed from: klx */
public final class klx extends kvf {
    /* renamed from: a */
    public float f25313a;
    /* renamed from: b */
    public int f25314b;
    /* renamed from: c */
    public klz f25315c;
    /* renamed from: d */
    public klt[] f25316d;
    /* renamed from: e */
    public klv f25317e;
    /* renamed from: f */
    public kly f25318f;

    public klx() {
        this.f25313a = 0.0f;
        this.f25314b = 0;
        this.f25315c = null;
        this.f25316d = klt.m16952a();
        this.f25317e = null;
        this.f25318f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (Float.floatToIntBits(this.f25313a) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(8) + 4;
        }
        int i = this.f25314b;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(2, i);
        }
        kvl kvl = this.f25315c;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(3, kvl);
        }
        klt[] kltArr = this.f25316d;
        if (kltArr != null && kltArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                klt[] kltArr2 = this.f25316d;
                if (computeSerializedSize >= kltArr2.length) {
                    break;
                }
                kvl kvl2 = kltArr2[computeSerializedSize];
                if (kvl2 != null) {
                    i += kvd.m5479a(4, kvl2);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        kvl = this.f25317e;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(5, kvl);
        }
        kvl = this.f25318f;
        if (kvl != null) {
            return computeSerializedSize + kvd.m5479a(6, kvl);
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
                    this.f25313a = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 16:
                    this.f25314b = kvc.mo10485f();
                    continue;
                case 26:
                    if (this.f25315c == null) {
                        this.f25315c = new klz();
                    }
                    kvc.mo10474a(this.f25315c);
                    continue;
                case 34:
                    int a = kvn.m5518a(kvc, 34);
                    Object obj = this.f25316d;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    Object obj2 = new klt[(a + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length - 1) {
                        obj2[i] = new klt();
                        kvc.mo10474a(obj2[i]);
                        kvc.mo10488i();
                        i++;
                    }
                    obj2[i] = new klt();
                    kvc.mo10474a(obj2[i]);
                    this.f25316d = obj2;
                    continue;
                case 42:
                    if (this.f25317e == null) {
                        this.f25317e = new klv();
                    }
                    kvc.mo10474a(this.f25317e);
                    continue;
                case 50:
                    if (this.f25318f == null) {
                        this.f25318f = new kly();
                    }
                    kvc.mo10474a(this.f25318f);
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
        if (Float.floatToIntBits(this.f25313a) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(1, this.f25313a);
        }
        int i = this.f25314b;
        if (i != 0) {
            kvd.mo10493b(2, i);
        }
        kvl kvl = this.f25315c;
        if (kvl != null) {
            kvd.mo10496b(3, kvl);
        }
        klt[] kltArr = this.f25316d;
        if (kltArr != null && kltArr.length > 0) {
            i = 0;
            while (true) {
                klt[] kltArr2 = this.f25316d;
                if (i >= kltArr2.length) {
                    break;
                }
                kvl kvl2 = kltArr2[i];
                if (kvl2 != null) {
                    kvd.mo10496b(4, kvl2);
                }
                i++;
            }
        }
        kvl = this.f25317e;
        if (kvl != null) {
            kvd.mo10496b(5, kvl);
        }
        kvl = this.f25318f;
        if (kvl != null) {
            kvd.mo10496b(6, kvl);
        }
        super.writeTo(kvd);
    }
}
