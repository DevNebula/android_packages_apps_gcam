package p000;

/* compiled from: PG */
/* renamed from: kju */
public final class kju extends kvf {
    /* renamed from: a */
    public kjj f25017a;
    /* renamed from: b */
    public long f25018b;
    /* renamed from: c */
    public long f25019c;
    /* renamed from: d */
    public kjw f25020d;

    public kju() {
        this.f25017a = null;
        this.f25018b = 0;
        this.f25019c = 0;
        this.f25020d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        kvl kvl = this.f25017a;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(1, kvl);
        }
        long j = this.f25018b;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(2, j);
        }
        j = this.f25019c;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(3, j);
        }
        kvl = this.f25020d;
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
                    if (this.f25017a == null) {
                        this.f25017a = new kjj();
                    }
                    kvc.mo10474a(this.f25017a);
                    continue;
                case 16:
                    this.f25018b = kvc.mo10486g();
                    continue;
                case 24:
                    this.f25019c = kvc.mo10486g();
                    continue;
                case 34:
                    if (this.f25020d == null) {
                        this.f25020d = new kjw();
                    }
                    kvc.mo10474a(this.f25020d);
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
        kvl kvl = this.f25017a;
        if (kvl != null) {
            kvd.mo10496b(1, kvl);
        }
        long j = this.f25018b;
        if (j != 0) {
            kvd.mo10494b(2, j);
        }
        j = this.f25019c;
        if (j != 0) {
            kvd.mo10494b(3, j);
        }
        kvl = this.f25020d;
        if (kvl != null) {
            kvd.mo10496b(4, kvl);
        }
        super.writeTo(kvd);
    }
}
