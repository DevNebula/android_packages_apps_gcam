package p000;

/* compiled from: PG */
/* renamed from: iyo */
public final class iyo extends kvf {
    /* renamed from: a */
    public long f24714a;
    /* renamed from: b */
    public long f24715b;
    /* renamed from: c */
    public iyq f24716c;
    /* renamed from: d */
    private boolean f24717d;

    public iyo() {
        this.f24714a = 0;
        this.f24715b = 0;
        this.f24717d = false;
        this.f24716c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f24714a;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(1, j);
        }
        j = this.f24715b;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(2, j);
        }
        if (this.f24717d) {
            computeSerializedSize += kvd.m5484b(24) + 1;
        }
        kvl kvl = this.f24716c;
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
                case 8:
                    this.f24714a = kvc.mo10486g();
                    continue;
                case 16:
                    this.f24715b = kvc.mo10486g();
                    continue;
                case 24:
                    this.f24717d = kvc.mo10480c();
                    continue;
                case 34:
                    if (this.f24716c == null) {
                        this.f24716c = new iyq();
                    }
                    kvc.mo10474a(this.f24716c);
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
        long j = this.f24714a;
        if (j != 0) {
            kvd.mo10494b(1, j);
        }
        j = this.f24715b;
        if (j != 0) {
            kvd.mo10494b(2, j);
        }
        boolean z = this.f24717d;
        if (z) {
            kvd.mo10491a(3, z);
        }
        kvl kvl = this.f24716c;
        if (kvl != null) {
            kvd.mo10496b(4, kvl);
        }
        super.writeTo(kvd);
    }
}
