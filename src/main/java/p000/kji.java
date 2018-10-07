package p000;

/* compiled from: PG */
/* renamed from: kji */
public final class kji extends kvf {
    /* renamed from: a */
    public long f24980a;
    /* renamed from: b */
    public long f24981b;
    /* renamed from: c */
    public int f24982c;

    public kji() {
        this.f24980a = 0;
        this.f24981b = 0;
        this.f24982c = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f24980a;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(1, j);
        }
        j = this.f24981b;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(2, j);
        }
        int i = this.f24982c;
        if (i != 0) {
            return computeSerializedSize + kvd.m5476a(3, i);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    private final kji m16902a(kvc kvc) {
        while (true) {
            int i = kvc.mo10488i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    this.f24980a = kvc.mo10486g();
                    continue;
                case 16:
                    this.f24981b = kvc.mo10486g();
                    continue;
                case 24:
                    int b = kvc.mo10476b();
                    try {
                        this.f24982c = klh.m16941b(kvc.mo10485f());
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
        long j = this.f24980a;
        if (j != 0) {
            kvd.mo10494b(1, j);
        }
        j = this.f24981b;
        if (j != 0) {
            kvd.mo10494b(2, j);
        }
        int i = this.f24982c;
        if (i != 0) {
            kvd.mo10493b(3, i);
        }
        super.writeTo(kvd);
    }
}
