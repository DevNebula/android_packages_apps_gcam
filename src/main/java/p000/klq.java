package p000;

/* compiled from: PG */
/* renamed from: klq */
public final class klq extends kvf {
    /* renamed from: h */
    private static volatile klq[] f25278h;
    /* renamed from: a */
    public kke f25279a;
    /* renamed from: b */
    public kke f25280b;
    /* renamed from: c */
    public kke[] f25281c;
    /* renamed from: d */
    public kke[] f25282d;
    /* renamed from: e */
    public int f25283e;
    /* renamed from: f */
    public int f25284f;
    /* renamed from: g */
    public int f25285g;
    /* renamed from: i */
    private int f25286i;
    /* renamed from: j */
    private kke[] f25287j;

    public klq() {
        this.f25286i = 0;
        this.f25279a = null;
        this.f25280b = null;
        this.f25281c = kke.m16923a();
        this.f25287j = kke.m16923a();
        this.f25282d = kke.m16923a();
        this.f25283e = 0;
        this.f25284f = 0;
        this.f25285g = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        kke[] kkeArr;
        kvl kvl;
        int i = 0;
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f25286i;
        if (i2 != 0) {
            computeSerializedSize += kvd.m5476a(1, i2);
        }
        kvl kvl2 = this.f25279a;
        if (kvl2 != null) {
            computeSerializedSize += kvd.m5479a(2, kvl2);
        }
        kvl2 = this.f25280b;
        if (kvl2 != null) {
            computeSerializedSize += kvd.m5479a(3, kvl2);
        }
        kke[] kkeArr2 = this.f25281c;
        if (kkeArr2 != null && kkeArr2.length > 0) {
            i2 = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                kkeArr = this.f25281c;
                if (computeSerializedSize >= kkeArr.length) {
                    break;
                }
                kvl = kkeArr[computeSerializedSize];
                if (kvl != null) {
                    i2 += kvd.m5479a(10, kvl);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i2;
        }
        kkeArr2 = this.f25287j;
        if (kkeArr2 != null && kkeArr2.length > 0) {
            i2 = 0;
            while (true) {
                kkeArr = this.f25287j;
                if (i2 >= kkeArr.length) {
                    break;
                }
                kvl = kkeArr[i2];
                if (kvl != null) {
                    computeSerializedSize += kvd.m5479a(11, kvl);
                }
                i2++;
            }
        }
        kkeArr2 = this.f25282d;
        if (kkeArr2 != null && kkeArr2.length > 0) {
            while (true) {
                kkeArr2 = this.f25282d;
                if (i >= kkeArr2.length) {
                    break;
                }
                kvl2 = kkeArr2[i];
                if (kvl2 != null) {
                    computeSerializedSize += kvd.m5479a(12, kvl2);
                }
                i++;
            }
        }
        i = this.f25283e;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(22, i);
        }
        i = this.f25284f;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(23, i);
        }
        i = this.f25285g;
        if (i != 0) {
            return computeSerializedSize + kvd.m5476a(24, i);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    public static klq[] m16949a() {
        if (f25278h == null) {
            synchronized (kvj.f9023b) {
                if (f25278h == null) {
                    f25278h = new klq[0];
                }
            }
        }
        return f25278h;
    }

    /* renamed from: a */
    private final klq m16948a(kvc kvc) {
        int b;
        while (true) {
            int i = kvc.mo10488i();
            Object obj;
            Object obj2;
            switch (i) {
                case 0:
                    break;
                case 8:
                    b = kvc.mo10476b();
                    try {
                        this.f25286i = kjj.m16905b(kvc.mo10485f());
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.mo10482d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 18:
                    if (this.f25279a == null) {
                        this.f25279a = new kke();
                    }
                    kvc.mo10474a(this.f25279a);
                    continue;
                case 26:
                    if (this.f25280b == null) {
                        this.f25280b = new kke();
                    }
                    kvc.mo10474a(this.f25280b);
                    continue;
                case 82:
                    b = kvn.m5518a(kvc, 82);
                    obj = this.f25281c;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    obj2 = new kke[(b + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length - 1) {
                        obj2[i] = new kke();
                        kvc.mo10474a(obj2[i]);
                        kvc.mo10488i();
                        i++;
                    }
                    obj2[i] = new kke();
                    kvc.mo10474a(obj2[i]);
                    this.f25281c = obj2;
                    continue;
                case 90:
                    b = kvn.m5518a(kvc, 90);
                    obj = this.f25287j;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    obj2 = new kke[(b + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length - 1) {
                        obj2[i] = new kke();
                        kvc.mo10474a(obj2[i]);
                        kvc.mo10488i();
                        i++;
                    }
                    obj2[i] = new kke();
                    kvc.mo10474a(obj2[i]);
                    this.f25287j = obj2;
                    continue;
                case 98:
                    b = kvn.m5518a(kvc, 98);
                    obj = this.f25282d;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    obj2 = new kke[(b + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length - 1) {
                        obj2[i] = new kke();
                        kvc.mo10474a(obj2[i]);
                        kvc.mo10488i();
                        i++;
                    }
                    obj2[i] = new kke();
                    kvc.mo10474a(obj2[i]);
                    this.f25282d = obj2;
                    continue;
                case 176:
                    this.f25283e = kvc.mo10485f();
                    continue;
                case 184:
                    this.f25284f = kvc.mo10485f();
                    continue;
                case 192:
                    this.f25285g = kvc.mo10485f();
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
        kke[] kkeArr;
        kvl kvl;
        int i = 0;
        int i2 = this.f25286i;
        if (i2 != 0) {
            kvd.mo10493b(1, i2);
        }
        kvl kvl2 = this.f25279a;
        if (kvl2 != null) {
            kvd.mo10496b(2, kvl2);
        }
        kvl2 = this.f25280b;
        if (kvl2 != null) {
            kvd.mo10496b(3, kvl2);
        }
        kke[] kkeArr2 = this.f25281c;
        if (kkeArr2 != null && kkeArr2.length > 0) {
            i2 = 0;
            while (true) {
                kkeArr = this.f25281c;
                if (i2 >= kkeArr.length) {
                    break;
                }
                kvl = kkeArr[i2];
                if (kvl != null) {
                    kvd.mo10496b(10, kvl);
                }
                i2++;
            }
        }
        kkeArr2 = this.f25287j;
        if (kkeArr2 != null && kkeArr2.length > 0) {
            i2 = 0;
            while (true) {
                kkeArr = this.f25287j;
                if (i2 >= kkeArr.length) {
                    break;
                }
                kvl = kkeArr[i2];
                if (kvl != null) {
                    kvd.mo10496b(11, kvl);
                }
                i2++;
            }
        }
        kkeArr2 = this.f25282d;
        if (kkeArr2 != null && kkeArr2.length > 0) {
            while (true) {
                kkeArr2 = this.f25282d;
                if (i >= kkeArr2.length) {
                    break;
                }
                kvl2 = kkeArr2[i];
                if (kvl2 != null) {
                    kvd.mo10496b(12, kvl2);
                }
                i++;
            }
        }
        i2 = this.f25283e;
        if (i2 != 0) {
            kvd.mo10493b(22, i2);
        }
        i2 = this.f25284f;
        if (i2 != 0) {
            kvd.mo10493b(23, i2);
        }
        i2 = this.f25285g;
        if (i2 != 0) {
            kvd.mo10493b(24, i2);
        }
        super.writeTo(kvd);
    }
}
