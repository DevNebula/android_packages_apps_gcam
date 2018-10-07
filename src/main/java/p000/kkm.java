package p000;

/* compiled from: PG */
/* renamed from: kkm */
public final class kkm extends kvf {
    /* renamed from: a */
    private long f25156a;
    /* renamed from: b */
    private kkr f25157b;
    /* renamed from: c */
    private kkn f25158c;
    /* renamed from: d */
    private int f25159d;
    /* renamed from: e */
    private int f25160e;

    public kkm() {
        this.f25156a = 0;
        this.f25157b = null;
        this.f25158c = null;
        this.f25159d = 0;
        this.f25160e = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f25156a;
        if (j != 0) {
            computeSerializedSize += kvd.m5485b(j);
        }
        kvl kvl = this.f25157b;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(2, kvl);
        }
        kvl = this.f25158c;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(3, kvl);
        }
        int i = this.f25159d;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(4, i);
        }
        i = this.f25160e;
        if (i != 0) {
            return computeSerializedSize + kvd.m5476a(5, i);
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
                    this.f25156a = kvc.mo10486g();
                    continue;
                case 18:
                    if (this.f25157b == null) {
                        this.f25157b = new kkr();
                    }
                    kvc.mo10474a(this.f25157b);
                    continue;
                case 26:
                    if (this.f25158c == null) {
                        this.f25158c = new kkn();
                    }
                    kvc.mo10474a(this.f25158c);
                    continue;
                case 32:
                    this.f25159d = kvc.mo10485f();
                    continue;
                case 40:
                    this.f25160e = kvc.mo10485f();
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
        long j = this.f25156a;
        if (j != 0) {
            kvd.mo10499c(j);
        }
        kvl kvl = this.f25157b;
        if (kvl != null) {
            kvd.mo10496b(2, kvl);
        }
        kvl = this.f25158c;
        if (kvl != null) {
            kvd.mo10496b(3, kvl);
        }
        int i = this.f25159d;
        if (i != 0) {
            kvd.mo10493b(4, i);
        }
        i = this.f25160e;
        if (i != 0) {
            kvd.mo10493b(5, i);
        }
        super.writeTo(kvd);
    }
}
