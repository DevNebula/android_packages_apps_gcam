package p000;

/* compiled from: PG */
/* renamed from: kkw */
public final class kkw extends kvf {
    /* renamed from: a */
    public String f25185a;
    /* renamed from: b */
    public boolean f25186b;
    /* renamed from: c */
    public int f25187c;

    public kkw() {
        this.f25185a = "";
        this.f25186b = false;
        this.f25187c = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.f25185a;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5478a(1, this.f25185a);
        }
        if (this.f25186b) {
            computeSerializedSize += kvd.m5484b(16) + 1;
        }
        int i = this.f25187c;
        if (i != 0) {
            return computeSerializedSize + kvd.m5476a(3, i);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    private final kkw m16930a(kvc kvc) {
        while (true) {
            int i = kvc.mo10488i();
            switch (i) {
                case 0:
                    break;
                case 10:
                    this.f25185a = kvc.mo10487h();
                    continue;
                case 16:
                    this.f25186b = kvc.mo10480c();
                    continue;
                case 24:
                    int b = kvc.mo10476b();
                    try {
                        this.f25187c = kjn.m16909a(kvc.mo10485f());
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.mo10482d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
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
        String str = this.f25185a;
        if (!(str == null || str.equals(""))) {
            kvd.mo10495b(1, this.f25185a);
        }
        boolean z = this.f25186b;
        if (z) {
            kvd.mo10491a(2, z);
        }
        int i = this.f25187c;
        if (i != 0) {
            kvd.mo10493b(3, i);
        }
        super.writeTo(kvd);
    }
}
