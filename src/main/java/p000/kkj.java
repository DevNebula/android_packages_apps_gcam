package p000;

/* compiled from: PG */
/* renamed from: kkj */
public final class kkj extends kvf {
    /* renamed from: a */
    private int f25147a;
    /* renamed from: b */
    private kki f25148b;

    public kkj() {
        this.f25147a = -1;
        this.f25147a = -1;
        this.f25148b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (this.f25147a == 0) {
            return computeSerializedSize + kvd.m5479a(1, this.f25148b);
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
                    if (this.f25148b == null) {
                        this.f25148b = new kki();
                    }
                    kvc.mo10474a(this.f25148b);
                    this.f25147a = 0;
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
        if (this.f25147a == 0) {
            kvd.mo10496b(1, this.f25148b);
        }
        super.writeTo(kvd);
    }
}
