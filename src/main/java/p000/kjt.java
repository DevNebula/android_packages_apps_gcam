package p000;

/* compiled from: PG */
/* renamed from: kjt */
public final class kjt extends kvf {
    /* renamed from: a */
    public kjj f25013a;
    /* renamed from: b */
    public long f25014b;
    /* renamed from: c */
    public long f25015c;
    /* renamed from: d */
    public kjw f25016d;

    public kjt() {
        this.f25013a = null;
        this.f25014b = 0;
        this.f25015c = 0;
        this.f25016d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        kvl kvl = this.f25013a;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(1, kvl);
        }
        long j = this.f25014b;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(2, j);
        }
        j = this.f25015c;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(3, j);
        }
        kvl = this.f25016d;
        if (kvl != null) {
            return computeSerializedSize + kvd.m5479a(4, kvl);
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
                    if (this.f25013a == null) {
                        this.f25013a = new kjj();
                    }
                    kvc.mo10474a(this.f25013a);
                    continue;
                case 16:
                    this.f25014b = kvc.mo10486g();
                    continue;
                case 24:
                    this.f25015c = kvc.mo10486g();
                    continue;
                case 34:
                    if (this.f25016d == null) {
                        this.f25016d = new kjw();
                    }
                    kvc.mo10474a(this.f25016d);
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
        kvl kvl = this.f25013a;
        if (kvl != null) {
            kvd.mo10496b(1, kvl);
        }
        long j = this.f25014b;
        if (j != 0) {
            kvd.mo10494b(2, j);
        }
        j = this.f25015c;
        if (j != 0) {
            kvd.mo10494b(3, j);
        }
        kvl = this.f25016d;
        if (kvl != null) {
            kvd.mo10496b(4, kvl);
        }
        super.writeTo(kvd);
    }
}
