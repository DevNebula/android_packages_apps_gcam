package p000;

/* compiled from: PG */
/* renamed from: kku */
public final class kku extends kvf {
    /* renamed from: a */
    private static volatile kku[] f25178a;
    /* renamed from: b */
    private String f25179b;
    /* renamed from: c */
    private String f25180c;

    public kku() {
        this.f25179b = "";
        this.f25180c = "";
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.f25179b;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5478a(1, this.f25179b);
        }
        str = this.f25180c;
        if (str == null || str.equals("")) {
            return computeSerializedSize;
        }
        return computeSerializedSize + kvd.m5478a(2, this.f25180c);
    }

    /* renamed from: a */
    public static kku[] m16928a() {
        if (f25178a == null) {
            synchronized (kvj.f9023b) {
                if (f25178a == null) {
                    f25178a = new kku[0];
                }
            }
        }
        return f25178a;
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.mo10488i();
            switch (i) {
                case 0:
                    break;
                case 10:
                    this.f25179b = kvc.mo10487h();
                    continue;
                case 18:
                    this.f25180c = kvc.mo10487h();
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
        String str = this.f25179b;
        if (!(str == null || str.equals(""))) {
            kvd.mo10495b(1, this.f25179b);
        }
        str = this.f25180c;
        if (!(str == null || str.equals(""))) {
            kvd.mo10495b(2, this.f25180c);
        }
        super.writeTo(kvd);
    }
}
