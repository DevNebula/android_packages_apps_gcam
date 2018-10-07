package p000;

/* compiled from: PG */
/* renamed from: kkl */
public final class kkl extends kvf {
    /* renamed from: a */
    private kkm f25152a;
    /* renamed from: b */
    private kkk f25153b;
    /* renamed from: c */
    private kkp f25154c;
    /* renamed from: d */
    private kks f25155d;

    public kkl() {
        this.f25152a = null;
        this.f25153b = null;
        this.f25154c = null;
        this.f25155d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        kvl kvl = this.f25152a;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(1, kvl);
        }
        kvl = this.f25153b;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(2, kvl);
        }
        kvl = this.f25154c;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(3, kvl);
        }
        kvl = this.f25155d;
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
                    if (this.f25152a == null) {
                        this.f25152a = new kkm();
                    }
                    kvc.mo10474a(this.f25152a);
                    continue;
                case 18:
                    if (this.f25153b == null) {
                        this.f25153b = new kkk();
                    }
                    kvc.mo10474a(this.f25153b);
                    continue;
                case 26:
                    if (this.f25154c == null) {
                        this.f25154c = new kkp();
                    }
                    kvc.mo10474a(this.f25154c);
                    continue;
                case 34:
                    if (this.f25155d == null) {
                        this.f25155d = new kks();
                    }
                    kvc.mo10474a(this.f25155d);
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
        kvl kvl = this.f25152a;
        if (kvl != null) {
            kvd.mo10496b(1, kvl);
        }
        kvl = this.f25153b;
        if (kvl != null) {
            kvd.mo10496b(2, kvl);
        }
        kvl = this.f25154c;
        if (kvl != null) {
            kvd.mo10496b(3, kvl);
        }
        kvl = this.f25155d;
        if (kvl != null) {
            kvd.mo10496b(4, kvl);
        }
        super.writeTo(kvd);
    }
}
