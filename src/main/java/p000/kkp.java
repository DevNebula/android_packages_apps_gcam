package p000;

/* compiled from: PG */
/* renamed from: kkp */
public final class kkp extends kvf {
    /* renamed from: a */
    private int f25164a;
    /* renamed from: b */
    private kkt f25165b;

    public kkp() {
        this.f25164a = 0;
        this.f25165b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f25164a;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(1, i);
        }
        kvl kvl = this.f25165b;
        if (kvl != null) {
            return computeSerializedSize + kvd.m5479a(2, kvl);
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
                    this.f25164a = kvc.mo10485f();
                    continue;
                case 18:
                    if (this.f25165b == null) {
                        this.f25165b = new kkt();
                    }
                    kvc.mo10474a(this.f25165b);
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
        int i = this.f25164a;
        if (i != 0) {
            kvd.mo10493b(1, i);
        }
        kvl kvl = this.f25165b;
        if (kvl != null) {
            kvd.mo10496b(2, kvl);
        }
        super.writeTo(kvd);
    }
}
