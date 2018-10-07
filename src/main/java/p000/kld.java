package p000;

/* compiled from: PG */
/* renamed from: kld */
public final class kld extends kvf {
    /* renamed from: a */
    public String f25220a;
    /* renamed from: b */
    public long f25221b;
    /* renamed from: c */
    public long f25222c;
    /* renamed from: d */
    public long f25223d;
    /* renamed from: e */
    public long f25224e;
    /* renamed from: f */
    public long f25225f;
    /* renamed from: g */
    public long f25226g;
    /* renamed from: h */
    public long f25227h;
    /* renamed from: i */
    public long f25228i;
    /* renamed from: j */
    public long f25229j;

    public kld() {
        this.f25220a = "";
        this.f25221b = 0;
        this.f25222c = 0;
        this.f25223d = 0;
        this.f25224e = 0;
        this.f25225f = 0;
        this.f25226g = 0;
        this.f25227h = 0;
        this.f25228i = 0;
        this.f25229j = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.f25220a;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5478a(1, this.f25220a);
        }
        long j = this.f25221b;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(2, j);
        }
        j = this.f25222c;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(3, j);
        }
        j = this.f25223d;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(4, j);
        }
        j = this.f25224e;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(5, j);
        }
        j = this.f25225f;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(6, j);
        }
        j = this.f25226g;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(7, j);
        }
        j = this.f25227h;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(8, j);
        }
        j = this.f25228i;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(9, j);
        }
        j = this.f25229j;
        if (j != 0) {
            return computeSerializedSize + kvd.m5477a(10, j);
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
                    this.f25220a = kvc.mo10487h();
                    continue;
                case 16:
                    this.f25221b = kvc.mo10486g();
                    continue;
                case 24:
                    this.f25222c = kvc.mo10486g();
                    continue;
                case 32:
                    this.f25223d = kvc.mo10486g();
                    continue;
                case 40:
                    this.f25224e = kvc.mo10486g();
                    continue;
                case 48:
                    this.f25225f = kvc.mo10486g();
                    continue;
                case 56:
                    this.f25226g = kvc.mo10486g();
                    continue;
                case 64:
                    this.f25227h = kvc.mo10486g();
                    continue;
                case 72:
                    this.f25228i = kvc.mo10486g();
                    continue;
                case 80:
                    this.f25229j = kvc.mo10486g();
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
        String str = this.f25220a;
        if (!(str == null || str.equals(""))) {
            kvd.mo10495b(1, this.f25220a);
        }
        long j = this.f25221b;
        if (j != 0) {
            kvd.mo10494b(2, j);
        }
        j = this.f25222c;
        if (j != 0) {
            kvd.mo10494b(3, j);
        }
        j = this.f25223d;
        if (j != 0) {
            kvd.mo10494b(4, j);
        }
        j = this.f25224e;
        if (j != 0) {
            kvd.mo10494b(5, j);
        }
        j = this.f25225f;
        if (j != 0) {
            kvd.mo10494b(6, j);
        }
        j = this.f25226g;
        if (j != 0) {
            kvd.mo10494b(7, j);
        }
        j = this.f25227h;
        if (j != 0) {
            kvd.mo10494b(8, j);
        }
        j = this.f25228i;
        if (j != 0) {
            kvd.mo10494b(9, j);
        }
        j = this.f25229j;
        if (j != 0) {
            kvd.mo10494b(10, j);
        }
        super.writeTo(kvd);
    }
}
