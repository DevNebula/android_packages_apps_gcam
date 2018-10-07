package p000;

/* compiled from: PG */
/* renamed from: iyn */
public final class iyn extends kvf {
    /* renamed from: a */
    private int f24710a;
    /* renamed from: b */
    private int f24711b;
    /* renamed from: c */
    private int f24712c;
    /* renamed from: d */
    private int f24713d;

    public iyn() {
        this.f24710a = 0;
        this.f24711b = 0;
        this.f24712c = 0;
        this.f24713d = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f24710a;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(1, i);
        }
        i = this.f24711b;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(2, i);
        }
        i = this.f24712c;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(3, i);
        }
        i = this.f24713d;
        if (i != 0) {
            return computeSerializedSize + kvd.m5476a(4, i);
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
                    this.f24710a = kvc.mo10485f();
                    continue;
                case 16:
                    this.f24711b = kvc.mo10485f();
                    continue;
                case 24:
                    this.f24712c = kvc.mo10485f();
                    continue;
                case 32:
                    this.f24713d = kvc.mo10485f();
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
        int i = this.f24710a;
        if (i != 0) {
            kvd.mo10493b(1, i);
        }
        i = this.f24711b;
        if (i != 0) {
            kvd.mo10493b(2, i);
        }
        i = this.f24712c;
        if (i != 0) {
            kvd.mo10493b(3, i);
        }
        i = this.f24713d;
        if (i != 0) {
            kvd.mo10493b(4, i);
        }
        super.writeTo(kvd);
    }
}
