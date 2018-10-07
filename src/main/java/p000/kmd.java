package p000;

/* compiled from: PG */
/* renamed from: kmd */
public final class kmd extends kvf {
    /* renamed from: a */
    public kme f25335a;
    /* renamed from: b */
    public float f25336b;
    /* renamed from: c */
    public boolean f25337c;
    /* renamed from: d */
    private kkb[] f25338d;
    /* renamed from: e */
    private kls f25339e;

    public kmd() {
        this.f25335a = null;
        this.f25336b = 0.0f;
        this.f25338d = kkb.m16921a();
        this.f25339e = null;
        this.f25337c = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        kvl kvl = this.f25335a;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(1, kvl);
        }
        if (Float.floatToIntBits(this.f25336b) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(16) + 4;
        }
        kkb[] kkbArr = this.f25338d;
        if (kkbArr != null && kkbArr.length > 0) {
            int i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                kkb[] kkbArr2 = this.f25338d;
                if (computeSerializedSize >= kkbArr2.length) {
                    break;
                }
                kvl kvl2 = kkbArr2[computeSerializedSize];
                if (kvl2 != null) {
                    i += kvd.m5479a(3, kvl2);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        kvl = this.f25339e;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(4, kvl);
        }
        if (this.f25337c) {
            return computeSerializedSize + (kvd.m5484b(40) + 1);
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
                    if (this.f25335a == null) {
                        this.f25335a = new kme();
                    }
                    kvc.mo10474a(this.f25335a);
                    continue;
                case 21:
                    this.f25336b = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 26:
                    int a = kvn.m5518a(kvc, 26);
                    Object obj = this.f25338d;
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
                    this.f25338d = obj2;
                    continue;
                case 34:
                    if (this.f25339e == null) {
                        this.f25339e = new kls();
                    }
                    kvc.mo10474a(this.f25339e);
                    continue;
                case 40:
                    this.f25337c = kvc.mo10480c();
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
        kvl kvl = this.f25335a;
        if (kvl != null) {
            kvd.mo10496b(1, kvl);
        }
        if (Float.floatToIntBits(this.f25336b) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(2, this.f25336b);
        }
        kkb[] kkbArr = this.f25338d;
        if (kkbArr != null && kkbArr.length > 0) {
            int i = 0;
            while (true) {
                kkb[] kkbArr2 = this.f25338d;
                if (i >= kkbArr2.length) {
                    break;
                }
                kvl kvl2 = kkbArr2[i];
                if (kvl2 != null) {
                    kvd.mo10496b(3, kvl2);
                }
                i++;
            }
        }
        kvl = this.f25339e;
        if (kvl != null) {
            kvd.mo10496b(4, kvl);
        }
        boolean z = this.f25337c;
        if (z) {
            kvd.mo10491a(5, z);
        }
        super.writeTo(kvd);
    }
}
