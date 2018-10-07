package p000;

/* compiled from: PG */
/* renamed from: klz */
public final class klz extends kvf {
    /* renamed from: a */
    public int f25324a;
    /* renamed from: b */
    public int f25325b;
    /* renamed from: c */
    public int f25326c;

    public klz() {
        this.f25324a = 0;
        this.f25325b = 0;
        this.f25326c = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f25324a;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(1, i);
        }
        i = this.f25325b;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(2, i);
        }
        i = this.f25326c;
        if (i != 0) {
            return computeSerializedSize + kvd.m5476a(3, i);
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
                    this.f25324a = kvc.mo10485f();
                    continue;
                case 16:
                    this.f25325b = kvc.mo10485f();
                    continue;
                case 24:
                    this.f25326c = kvc.mo10485f();
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
        int i = this.f25324a;
        if (i != 0) {
            kvd.mo10493b(1, i);
        }
        i = this.f25325b;
        if (i != 0) {
            kvd.mo10493b(2, i);
        }
        i = this.f25326c;
        if (i != 0) {
            kvd.mo10493b(3, i);
        }
        super.writeTo(kvd);
    }
}
