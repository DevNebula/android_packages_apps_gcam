package p000;

/* compiled from: PG */
/* renamed from: kjj */
public final class kjj extends kvf {
    /* renamed from: a */
    public int f24983a;
    /* renamed from: b */
    private int f24984b;

    public kjj() {
        this.f24984b = 0;
        this.f24983a = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    /* renamed from: a */
    public static int m16903a(int i) {
        if (i >= 0 && i <= 2) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(47);
        stringBuilder.append(i);
        stringBuilder.append(" is not a valid enum CameraDirection");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: b */
    public static int m16905b(int i) {
        if ((i >= 0 && i <= 1) || (i >= 9 && i <= 14)) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(43);
        stringBuilder.append(i);
        stringBuilder.append(" is not a valid enum CaptureMode");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f24984b;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(1, i);
        }
        i = this.f24983a;
        if (i != 0) {
            return computeSerializedSize + kvd.m5476a(2, i);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    private final kjj m16904a(kvc kvc) {
        int b;
        while (true) {
            int i = kvc.mo10488i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    b = kvc.mo10476b();
                    try {
                        this.f24984b = kjj.m16903a(kvc.mo10485f());
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.mo10482d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 16:
                    b = kvc.mo10476b();
                    try {
                        this.f24983a = kjj.m16905b(kvc.mo10485f());
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
        int i = this.f24984b;
        if (i != 0) {
            kvd.mo10493b(1, i);
        }
        i = this.f24983a;
        if (i != 0) {
            kvd.mo10493b(2, i);
        }
        super.writeTo(kvd);
    }
}
