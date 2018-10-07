package p000;

/* compiled from: PG */
/* renamed from: kma */
public final class kma extends kvf {
    /* renamed from: c */
    private static volatile kma[] f25327c;
    /* renamed from: a */
    public String f25328a;
    /* renamed from: b */
    public int f25329b;

    public kma() {
        this.f25328a = "";
        this.f25329b = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.f25328a;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5478a(1, this.f25328a);
        }
        int i = this.f25329b;
        if (i != 0) {
            return computeSerializedSize + kvd.m5476a(2, i);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    public static kma[] m16954a() {
        if (f25327c == null) {
            synchronized (kvj.f9023b) {
                if (f25327c == null) {
                    f25327c = new kma[0];
                }
            }
        }
        return f25327c;
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.mo10488i();
            switch (i) {
                case 0:
                    break;
                case 10:
                    this.f25328a = kvc.mo10487h();
                    continue;
                case 16:
                    this.f25329b = kvc.mo10485f();
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
        String str = this.f25328a;
        if (!(str == null || str.equals(""))) {
            kvd.mo10495b(1, this.f25328a);
        }
        int i = this.f25329b;
        if (i != 0) {
            kvd.mo10493b(2, i);
        }
        super.writeTo(kvd);
    }
}
