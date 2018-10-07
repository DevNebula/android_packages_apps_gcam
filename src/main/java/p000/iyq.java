package p000;

/* compiled from: PG */
/* renamed from: iyq */
public final class iyq extends kvf {
    /* renamed from: a */
    public iyp f24721a;

    public iyq() {
        this.f24721a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        kvl kvl = this.f24721a;
        if (kvl != null) {
            return computeSerializedSize + kvd.m5479a(1, kvl);
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
                    if (this.f24721a == null) {
                        this.f24721a = new iyp();
                    }
                    kvc.mo10474a(this.f24721a);
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
        kvl kvl = this.f24721a;
        if (kvl != null) {
            kvd.mo10496b(1, kvl);
        }
        super.writeTo(kvd);
    }
}
