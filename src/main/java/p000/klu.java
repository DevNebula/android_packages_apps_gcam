package p000;

/* compiled from: PG */
/* renamed from: klu */
public final class klu extends kvf {
    /* renamed from: a */
    public boolean f25297a;
    /* renamed from: b */
    public boolean f25298b;
    /* renamed from: c */
    public boolean f25299c;
    /* renamed from: d */
    public boolean f25300d;
    /* renamed from: e */
    public boolean f25301e;
    /* renamed from: f */
    public boolean f25302f;
    /* renamed from: g */
    public float f25303g;
    /* renamed from: h */
    private boolean f25304h;

    public klu() {
        this.f25297a = false;
        this.f25304h = false;
        this.f25298b = false;
        this.f25299c = false;
        this.f25300d = false;
        this.f25301e = false;
        this.f25302f = false;
        this.f25303g = 0.0f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (this.f25297a) {
            computeSerializedSize += kvd.m5484b(8) + 1;
        }
        if (this.f25304h) {
            computeSerializedSize += kvd.m5484b(16) + 1;
        }
        if (this.f25298b) {
            computeSerializedSize += kvd.m5484b(24) + 1;
        }
        if (this.f25299c) {
            computeSerializedSize += kvd.m5484b(32) + 1;
        }
        if (this.f25300d) {
            computeSerializedSize += kvd.m5484b(40) + 1;
        }
        if (this.f25301e) {
            computeSerializedSize += kvd.m5484b(48) + 1;
        }
        if (this.f25302f) {
            computeSerializedSize += kvd.m5484b(56) + 1;
        }
        if (Float.floatToIntBits(this.f25303g) == Float.floatToIntBits(0.0f)) {
            return computeSerializedSize;
        }
        return computeSerializedSize + (kvd.m5484b(64) + 4);
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.mo10488i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    this.f25297a = kvc.mo10480c();
                    continue;
                case 16:
                    this.f25304h = kvc.mo10480c();
                    continue;
                case 24:
                    this.f25298b = kvc.mo10480c();
                    continue;
                case 32:
                    this.f25299c = kvc.mo10480c();
                    continue;
                case 40:
                    this.f25300d = kvc.mo10480c();
                    continue;
                case 48:
                    this.f25301e = kvc.mo10480c();
                    continue;
                case 56:
                    this.f25302f = kvc.mo10480c();
                    continue;
                case 69:
                    this.f25303g = Float.intBitsToFloat(kvc.mo10481d());
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
        boolean z = this.f25297a;
        if (z) {
            kvd.mo10491a(1, z);
        }
        z = this.f25304h;
        if (z) {
            kvd.mo10491a(2, z);
        }
        z = this.f25298b;
        if (z) {
            kvd.mo10491a(3, z);
        }
        z = this.f25299c;
        if (z) {
            kvd.mo10491a(4, z);
        }
        z = this.f25300d;
        if (z) {
            kvd.mo10491a(5, z);
        }
        z = this.f25301e;
        if (z) {
            kvd.mo10491a(6, z);
        }
        z = this.f25302f;
        if (z) {
            kvd.mo10491a(7, z);
        }
        if (Float.floatToIntBits(this.f25303g) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(8, this.f25303g);
        }
        super.writeTo(kvd);
    }
}
