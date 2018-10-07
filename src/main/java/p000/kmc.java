package p000;

/* compiled from: PG */
/* renamed from: kmc */
public final class kmc extends kvf {
    /* renamed from: a */
    public long f25334a;

    public kmc() {
        this.f25334a = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f25334a;
        if (j != 0) {
            return computeSerializedSize + kvd.m5477a(1, j);
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
                    this.f25334a = kvc.mo10486g();
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
        long j = this.f25334a;
        if (j != 0) {
            kvd.mo10494b(1, j);
        }
        super.writeTo(kvd);
    }
}
