package p000;

/* compiled from: PG */
/* renamed from: hra */
public final class hra extends kvf implements Cloneable {
    /* renamed from: a */
    public String f24513a;
    /* renamed from: b */
    public String f24514b;
    /* renamed from: c */
    public int f24515c;
    /* renamed from: d */
    public int f24516d;

    public hra() {
        this.f24513a = "";
        this.f24514b = "";
        this.f24515c = -1;
        this.f24516d = -1;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    /* renamed from: a */
    private static int m16255a(int i) {
        if (i >= -1 && i <= 6) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(54);
        stringBuilder.append(i);
        stringBuilder.append(" is not a valid enum LensAvailabilityStatus");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    public final hra clone() {
        try {
            return (hra) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.f24513a;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5478a(1, this.f24513a);
        }
        str = this.f24514b;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5478a(2, this.f24514b);
        }
        int i = this.f24515c;
        if (i != -1) {
            computeSerializedSize += kvd.m5476a(3, i);
        }
        i = this.f24516d;
        if (i != -1) {
            return computeSerializedSize + kvd.m5476a(4, i);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    private final hra m16256a(kvc kvc) {
        int b;
        while (true) {
            int i = kvc.mo10488i();
            switch (i) {
                case 0:
                    break;
                case 10:
                    this.f24513a = kvc.mo10487h();
                    continue;
                case 18:
                    this.f24514b = kvc.mo10487h();
                    continue;
                case 24:
                    b = kvc.mo10476b();
                    try {
                        this.f24515c = hra.m16255a(kvc.mo10485f());
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.mo10482d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 32:
                    b = kvc.mo10476b();
                    try {
                        this.f24516d = hra.m16255a(kvc.mo10485f());
                        continue;
                    } catch (IllegalArgumentException e2) {
                        kvc.mo10482d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
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
        String str = this.f24513a;
        if (!(str == null || str.equals(""))) {
            kvd.mo10495b(1, this.f24513a);
        }
        str = this.f24514b;
        if (!(str == null || str.equals(""))) {
            kvd.mo10495b(2, this.f24514b);
        }
        int i = this.f24515c;
        if (i != -1) {
            kvd.mo10493b(3, i);
        }
        i = this.f24516d;
        if (i != -1) {
            kvd.mo10493b(4, i);
        }
        super.writeTo(kvd);
    }
}
