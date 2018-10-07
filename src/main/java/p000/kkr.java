package p000;

/* compiled from: PG */
/* renamed from: kkr */
public final class kkr extends kvf {
    /* renamed from: a */
    private int f25169a;
    /* renamed from: b */
    private long f25170b;
    /* renamed from: c */
    private kkh f25171c;
    /* renamed from: d */
    private kkv f25172d;
    /* renamed from: e */
    private kkq f25173e;
    /* renamed from: f */
    private kko f25174f;

    public kkr() {
        this.f25169a = -1;
        this.f25170b = 0;
        this.f25169a = -1;
        this.f25171c = null;
        this.f25169a = -1;
        this.f25172d = null;
        this.f25169a = -1;
        this.f25173e = null;
        this.f25169a = -1;
        this.f25174f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f25170b;
        if (j != 0) {
            computeSerializedSize += kvd.m5485b(j);
        }
        if (this.f25169a == 0) {
            computeSerializedSize += kvd.m5479a(2, this.f25171c);
        }
        if (this.f25169a == 1) {
            computeSerializedSize += kvd.m5479a(3, this.f25172d);
        }
        if (this.f25169a == 2) {
            computeSerializedSize += kvd.m5479a(4, this.f25173e);
        }
        if (this.f25169a == 3) {
            return computeSerializedSize + kvd.m5479a(5, this.f25174f);
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
                    this.f25170b = kvc.mo10486g();
                    continue;
                case 18:
                    if (this.f25171c == null) {
                        this.f25171c = new kkh();
                    }
                    kvc.mo10474a(this.f25171c);
                    this.f25169a = 0;
                    continue;
                case 26:
                    if (this.f25172d == null) {
                        this.f25172d = new kkv();
                    }
                    kvc.mo10474a(this.f25172d);
                    this.f25169a = 1;
                    continue;
                case 34:
                    if (this.f25173e == null) {
                        this.f25173e = new kkq();
                    }
                    kvc.mo10474a(this.f25173e);
                    this.f25169a = 2;
                    continue;
                case 42:
                    if (this.f25174f == null) {
                        this.f25174f = new kko();
                    }
                    kvc.mo10474a(this.f25174f);
                    this.f25169a = 3;
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
        long j = this.f25170b;
        if (j != 0) {
            kvd.mo10499c(j);
        }
        if (this.f25169a == 0) {
            kvd.mo10496b(2, this.f25171c);
        }
        if (this.f25169a == 1) {
            kvd.mo10496b(3, this.f25172d);
        }
        if (this.f25169a == 2) {
            kvd.mo10496b(4, this.f25173e);
        }
        if (this.f25169a == 3) {
            kvd.mo10496b(5, this.f25174f);
        }
        super.writeTo(kvd);
    }
}
