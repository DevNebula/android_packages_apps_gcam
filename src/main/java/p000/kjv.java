package p000;

/* compiled from: PG */
/* renamed from: kjv */
public final class kjv extends kvf {
    /* renamed from: a */
    public kjj f25021a;
    /* renamed from: b */
    public long f25022b;

    public kjv() {
        this.f25021a = null;
        this.f25022b = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        kvl kvl = this.f25021a;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(1, kvl);
        }
        long j = this.f25022b;
        if (j != 0) {
            return computeSerializedSize + kvd.m5477a(2, j);
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
                    if (this.f25021a == null) {
                        this.f25021a = new kjj();
                    }
                    kvc.mo10474a(this.f25021a);
                    continue;
                case 16:
                    this.f25022b = kvc.mo10486g();
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
        kvl kvl = this.f25021a;
        if (kvl != null) {
            kvd.mo10496b(1, kvl);
        }
        long j = this.f25022b;
        if (j != 0) {
            kvd.mo10494b(2, j);
        }
        super.writeTo(kvd);
    }
}
