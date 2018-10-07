package p000;

/* compiled from: PG */
/* renamed from: kke */
public final class kke extends kvf {
    /* renamed from: h */
    private static volatile kke[] f25080h;
    /* renamed from: a */
    public long f25081a;
    /* renamed from: b */
    public long f25082b;
    /* renamed from: c */
    public long f25083c;
    /* renamed from: d */
    public int f25084d;
    /* renamed from: e */
    public int f25085e;
    /* renamed from: f */
    public int f25086f;
    /* renamed from: g */
    public int f25087g;

    public kke() {
        this.f25081a = 0;
        this.f25082b = 0;
        this.f25083c = 0;
        this.f25084d = 0;
        this.f25085e = 0;
        this.f25086f = 0;
        this.f25087g = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f25081a;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(1, j);
        }
        j = this.f25082b;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(2, j);
        }
        j = this.f25083c;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(3, j);
        }
        int i = this.f25084d;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(4, i);
        }
        i = this.f25085e;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(5, i);
        }
        i = this.f25086f;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(6, i);
        }
        i = this.f25087g;
        if (i != 0) {
            return computeSerializedSize + kvd.m5476a(7, i);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    public static kke[] m16923a() {
        if (f25080h == null) {
            synchronized (kvj.f9023b) {
                if (f25080h == null) {
                    f25080h = new kke[0];
                }
            }
        }
        return f25080h;
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.mo10488i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    this.f25081a = kvc.mo10486g();
                    continue;
                case 16:
                    this.f25082b = kvc.mo10486g();
                    continue;
                case 24:
                    this.f25083c = kvc.mo10486g();
                    continue;
                case 32:
                    this.f25084d = kvc.mo10485f();
                    continue;
                case 40:
                    this.f25085e = kvc.mo10485f();
                    continue;
                case 48:
                    this.f25086f = kvc.mo10485f();
                    continue;
                case 56:
                    this.f25087g = kvc.mo10485f();
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
        long j = this.f25081a;
        if (j != 0) {
            kvd.mo10494b(1, j);
        }
        j = this.f25082b;
        if (j != 0) {
            kvd.mo10494b(2, j);
        }
        j = this.f25083c;
        if (j != 0) {
            kvd.mo10494b(3, j);
        }
        int i = this.f25084d;
        if (i != 0) {
            kvd.mo10493b(4, i);
        }
        i = this.f25085e;
        if (i != 0) {
            kvd.mo10493b(5, i);
        }
        i = this.f25086f;
        if (i != 0) {
            kvd.mo10493b(6, i);
        }
        i = this.f25087g;
        if (i != 0) {
            kvd.mo10493b(7, i);
        }
        super.writeTo(kvd);
    }
}
