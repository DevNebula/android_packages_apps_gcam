package p000;

/* compiled from: PG */
/* renamed from: klb */
public final class klb extends kvf {
    /* renamed from: c */
    private static volatile klb[] f25211c;
    /* renamed from: a */
    public long f25212a;
    /* renamed from: b */
    public long f25213b;

    public klb() {
        this.f25212a = 0;
        this.f25213b = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f25212a;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(1, j);
        }
        j = this.f25213b;
        if (j != 0) {
            return computeSerializedSize + kvd.m5477a(2, j);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    public static klb[] m16935a() {
        if (f25211c == null) {
            synchronized (kvj.f9023b) {
                if (f25211c == null) {
                    f25211c = new klb[0];
                }
            }
        }
        return f25211c;
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.mo10488i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    this.f25212a = kvc.mo10486g();
                    continue;
                case 16:
                    this.f25213b = kvc.mo10486g();
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
        long j = this.f25212a;
        if (j != 0) {
            kvd.mo10494b(1, j);
        }
        j = this.f25213b;
        if (j != 0) {
            kvd.mo10494b(2, j);
        }
        super.writeTo(kvd);
    }
}
