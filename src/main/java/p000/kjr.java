package p000;

/* compiled from: PG */
/* renamed from: kjr */
public final class kjr extends kvf {
    /* renamed from: a */
    public kjj f25006a;
    /* renamed from: b */
    public long f25007b;
    /* renamed from: c */
    public long f25008c;
    /* renamed from: d */
    public kjw f25009d;

    public kjr() {
        this.f25006a = null;
        this.f25007b = 0;
        this.f25008c = 0;
        this.f25009d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        kvl kvl = this.f25006a;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(1, kvl);
        }
        long j = this.f25007b;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(2, j);
        }
        j = this.f25008c;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(3, j);
        }
        kvl = this.f25009d;
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
                    if (this.f25006a == null) {
                        this.f25006a = new kjj();
                    }
                    kvc.mo10474a(this.f25006a);
                    continue;
                case 16:
                    this.f25007b = kvc.mo10486g();
                    continue;
                case 24:
                    this.f25008c = kvc.mo10486g();
                    continue;
                case 34:
                    if (this.f25009d == null) {
                        this.f25009d = new kjw();
                    }
                    kvc.mo10474a(this.f25009d);
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
        kvl kvl = this.f25006a;
        if (kvl != null) {
            kvd.mo10496b(1, kvl);
        }
        long j = this.f25007b;
        if (j != 0) {
            kvd.mo10494b(2, j);
        }
        j = this.f25008c;
        if (j != 0) {
            kvd.mo10494b(3, j);
        }
        kvl = this.f25009d;
        if (kvl != null) {
            kvd.mo10496b(4, kvl);
        }
        super.writeTo(kvd);
    }
}
