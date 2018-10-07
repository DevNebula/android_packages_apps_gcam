package p000;

/* compiled from: PG */
/* renamed from: kjs */
public final class kjs extends kvf {
    /* renamed from: a */
    public kjj f25010a;
    /* renamed from: b */
    public long f25011b;
    /* renamed from: c */
    public long f25012c;

    public kjs() {
        this.f25010a = null;
        this.f25011b = 0;
        this.f25012c = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        kvl kvl = this.f25010a;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(1, kvl);
        }
        long j = this.f25011b;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(2, j);
        }
        j = this.f25012c;
        if (j != 0) {
            return computeSerializedSize + kvd.m5477a(3, j);
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
                    if (this.f25010a == null) {
                        this.f25010a = new kjj();
                    }
                    kvc.mo10474a(this.f25010a);
                    continue;
                case 16:
                    this.f25011b = kvc.mo10486g();
                    continue;
                case 24:
                    this.f25012c = kvc.mo10486g();
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
        kvl kvl = this.f25010a;
        if (kvl != null) {
            kvd.mo10496b(1, kvl);
        }
        long j = this.f25011b;
        if (j != 0) {
            kvd.mo10494b(2, j);
        }
        j = this.f25012c;
        if (j != 0) {
            kvd.mo10494b(3, j);
        }
        super.writeTo(kvd);
    }
}
