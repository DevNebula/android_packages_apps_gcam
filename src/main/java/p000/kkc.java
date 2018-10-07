package p000;

/* compiled from: PG */
/* renamed from: kkc */
public final class kkc extends kvf {
    /* renamed from: a */
    private int f25064a;
    /* renamed from: b */
    private int[] f25065b;
    /* renamed from: c */
    private int[] f25066c;
    /* renamed from: d */
    private int f25067d;

    public kkc() {
        this.f25064a = 0;
        this.f25065b = kvn.f9030e;
        this.f25066c = kvn.f9030e;
        this.f25067d = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int i = 0;
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f25064a;
        if (i2 != 0) {
            computeSerializedSize += kvd.m5476a(1, i2);
        }
        int[] iArr = this.f25065b;
        if (iArr != null && iArr.length > 0) {
            i2 = 0;
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.f25065b;
                if (i2 >= iArr2.length) {
                    break;
                }
                i3 += kvd.m5475a(iArr2[i2]);
                i2++;
            }
            computeSerializedSize = ((computeSerializedSize + i3) + 1) + kvd.m5484b(i3);
        }
        iArr = this.f25066c;
        if (iArr != null && iArr.length > 0) {
            i2 = 0;
            while (true) {
                int[] iArr3 = this.f25066c;
                if (i >= iArr3.length) {
                    break;
                }
                i2 += kvd.m5475a(iArr3[i]);
                i++;
            }
            computeSerializedSize = ((computeSerializedSize + i2) + 1) + kvd.m5484b(i2);
        }
        i2 = this.f25067d;
        if (i2 != 0) {
            return computeSerializedSize + kvd.m5476a(4, i2);
        }
        return computeSerializedSize;
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.mo10488i();
            int a;
            Object obj;
            Object obj2;
            int c;
            Object obj3;
            Object obj4;
            switch (i) {
                case 0:
                    break;
                case 8:
                    this.f25064a = kvc.mo10485f();
                    continue;
                case 16:
                    a = kvn.m5518a(kvc, 16);
                    obj = this.f25065b;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    obj2 = new int[(a + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length - 1) {
                        obj2[i] = kvc.mo10485f();
                        kvc.mo10488i();
                        i++;
                    }
                    obj2[i] = kvc.mo10485f();
                    this.f25065b = obj2;
                    continue;
                case 18:
                    c = kvc.mo10479c(kvc.mo10485f());
                    a = kvc.mo10476b();
                    i = 0;
                    while (kvc.mo10472a() > 0) {
                        kvc.mo10485f();
                        i++;
                    }
                    kvc.mo10482d(a);
                    obj3 = this.f25065b;
                    if (obj3 != null) {
                        a = obj3.length;
                    } else {
                        a = 0;
                    }
                    obj4 = new int[(i + a)];
                    if (a != 0) {
                        System.arraycopy(obj3, 0, obj4, 0, a);
                    }
                    while (a < obj4.length) {
                        obj4[a] = kvc.mo10485f();
                        a++;
                    }
                    this.f25065b = obj4;
                    kvc.mo10477b(c);
                    continue;
                case 24:
                    a = kvn.m5518a(kvc, 24);
                    obj = this.f25066c;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    obj2 = new int[(a + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length - 1) {
                        obj2[i] = kvc.mo10485f();
                        kvc.mo10488i();
                        i++;
                    }
                    obj2[i] = kvc.mo10485f();
                    this.f25066c = obj2;
                    continue;
                case 26:
                    c = kvc.mo10479c(kvc.mo10485f());
                    a = kvc.mo10476b();
                    i = 0;
                    while (kvc.mo10472a() > 0) {
                        kvc.mo10485f();
                        i++;
                    }
                    kvc.mo10482d(a);
                    obj3 = this.f25066c;
                    if (obj3 != null) {
                        a = obj3.length;
                    } else {
                        a = 0;
                    }
                    obj4 = new int[(i + a)];
                    if (a != 0) {
                        System.arraycopy(obj3, 0, obj4, 0, a);
                    }
                    while (a < obj4.length) {
                        obj4[a] = kvc.mo10485f();
                        a++;
                    }
                    this.f25066c = obj4;
                    kvc.mo10477b(c);
                    continue;
                case 32:
                    this.f25067d = kvc.mo10485f();
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
        int i;
        int[] iArr;
        int i2 = 0;
        int i3 = this.f25064a;
        if (i3 != 0) {
            kvd.mo10493b(1, i3);
        }
        int[] iArr2 = this.f25065b;
        if (iArr2 != null && iArr2.length > 0) {
            i3 = 0;
            i = 0;
            while (true) {
                iArr = this.f25065b;
                if (i3 >= iArr.length) {
                    break;
                }
                i += kvd.m5475a(iArr[i3]);
                i3++;
            }
            kvd.mo10501e(18);
            kvd.mo10501e(i);
            i3 = 0;
            while (true) {
                int[] iArr3 = this.f25065b;
                if (i3 >= iArr3.length) {
                    break;
                }
                kvd.mo10497c(iArr3[i3]);
                i3++;
            }
        }
        iArr2 = this.f25066c;
        if (iArr2 != null && iArr2.length > 0) {
            i3 = 0;
            i = 0;
            while (true) {
                iArr = this.f25066c;
                if (i3 >= iArr.length) {
                    break;
                }
                i += kvd.m5475a(iArr[i3]);
                i3++;
            }
            kvd.mo10501e(26);
            kvd.mo10501e(i);
            while (true) {
                iArr2 = this.f25066c;
                if (i2 >= iArr2.length) {
                    break;
                }
                kvd.mo10497c(iArr2[i2]);
                i2++;
            }
        }
        i3 = this.f25067d;
        if (i3 != 0) {
            kvd.mo10493b(4, i3);
        }
        super.writeTo(kvd);
    }
}
