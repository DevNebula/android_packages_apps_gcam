package p000;

/* compiled from: PG */
/* renamed from: kly */
public final class kly extends kvf {
    /* renamed from: a */
    public int f25319a;
    /* renamed from: b */
    public kma[] f25320b;
    /* renamed from: c */
    private int f25321c;
    /* renamed from: d */
    private int f25322d;
    /* renamed from: e */
    private int f25323e;

    public kly() {
        this.f25319a = 0;
        this.f25320b = kma.m16954a();
        this.f25321c = 0;
        this.f25322d = 0;
        this.f25323e = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f25319a;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(1, i);
        }
        kma[] kmaArr = this.f25320b;
        if (kmaArr != null && kmaArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                kma[] kmaArr2 = this.f25320b;
                if (computeSerializedSize >= kmaArr2.length) {
                    break;
                }
                kvl kvl = kmaArr2[computeSerializedSize];
                if (kvl != null) {
                    i += kvd.m5479a(2, kvl);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        i = this.f25321c;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(3, i);
        }
        i = this.f25322d;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(4, i);
        }
        i = this.f25323e;
        if (i != 0) {
            return computeSerializedSize + kvd.m5476a(5, i);
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
                    this.f25319a = kvc.mo10485f();
                    continue;
                case 18:
                    int a = kvn.m5518a(kvc, 18);
                    Object obj = this.f25320b;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    Object obj2 = new kma[(a + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length - 1) {
                        obj2[i] = new kma();
                        kvc.mo10474a(obj2[i]);
                        kvc.mo10488i();
                        i++;
                    }
                    obj2[i] = new kma();
                    kvc.mo10474a(obj2[i]);
                    this.f25320b = obj2;
                    continue;
                case 24:
                    this.f25321c = kvc.mo10485f();
                    continue;
                case 32:
                    this.f25322d = kvc.mo10485f();
                    continue;
                case 40:
                    this.f25323e = kvc.mo10485f();
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
        int i = this.f25319a;
        if (i != 0) {
            kvd.mo10493b(1, i);
        }
        kma[] kmaArr = this.f25320b;
        if (kmaArr != null && kmaArr.length > 0) {
            i = 0;
            while (true) {
                kma[] kmaArr2 = this.f25320b;
                if (i >= kmaArr2.length) {
                    break;
                }
                kvl kvl = kmaArr2[i];
                if (kvl != null) {
                    kvd.mo10496b(2, kvl);
                }
                i++;
            }
        }
        i = this.f25321c;
        if (i != 0) {
            kvd.mo10493b(3, i);
        }
        i = this.f25322d;
        if (i != 0) {
            kvd.mo10493b(4, i);
        }
        i = this.f25323e;
        if (i != 0) {
            kvd.mo10493b(5, i);
        }
        super.writeTo(kvd);
    }
}
