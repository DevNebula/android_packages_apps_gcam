package p000;

/* compiled from: PG */
/* renamed from: kjq */
public final class kjq extends kvf {
    /* renamed from: a */
    public int f25002a;
    /* renamed from: b */
    public kkx f25003b;
    /* renamed from: c */
    public kll f25004c;
    /* renamed from: d */
    public klu f25005d;

    public kjq() {
        this.f25002a = 0;
        this.f25003b = null;
        this.f25004c = null;
        this.f25005d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f25002a;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(1, i);
        }
        kvl kvl = this.f25003b;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(2, kvl);
        }
        kvl = this.f25004c;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(3, kvl);
        }
        kvl = this.f25005d;
        if (kvl != null) {
            return computeSerializedSize + kvd.m5479a(4, kvl);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    private final kjq m16913a(kvc kvc) {
        while (true) {
            int i = kvc.mo10488i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    int b = kvc.mo10476b();
                    try {
                        this.f25002a = klh.m16941b(kvc.mo10485f());
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.mo10482d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 18:
                    if (this.f25003b == null) {
                        this.f25003b = new kkx();
                    }
                    kvc.mo10474a(this.f25003b);
                    continue;
                case 26:
                    if (this.f25004c == null) {
                        this.f25004c = new kll();
                    }
                    kvc.mo10474a(this.f25004c);
                    continue;
                case 34:
                    if (this.f25005d == null) {
                        this.f25005d = new klu();
                    }
                    kvc.mo10474a(this.f25005d);
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
        int i = this.f25002a;
        if (i != 0) {
            kvd.mo10493b(1, i);
        }
        kvl kvl = this.f25003b;
        if (kvl != null) {
            kvd.mo10496b(2, kvl);
        }
        kvl = this.f25004c;
        if (kvl != null) {
            kvd.mo10496b(3, kvl);
        }
        kvl = this.f25005d;
        if (kvl != null) {
            kvd.mo10496b(4, kvl);
        }
        super.writeTo(kvd);
    }
}
