package p000;

/* compiled from: PG */
/* renamed from: kjk */
public final class kjk extends kvf {
    /* renamed from: a */
    private int f24985a;

    public kjk() {
        this.f24985a = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f24985a;
        if (i != 0) {
            return computeSerializedSize + kvd.m5476a(1, i);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    private final kjk m16906a(kvc kvc) {
        while (true) {
            int i = kvc.mo10488i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    int b = kvc.mo10476b();
                    try {
                        this.f24985a = kjn.m16909a(kvc.mo10485f());
                        continue;
                    } catch (IllegalArgumentException e) {
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
        int i = this.f24985a;
        if (i != 0) {
            kvd.mo10493b(1, i);
        }
        super.writeTo(kvd);
    }
}
