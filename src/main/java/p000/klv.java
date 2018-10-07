package p000;

/* compiled from: PG */
/* renamed from: klv */
public final class klv extends kvf {
    /* renamed from: a */
    public kmb f25305a;
    /* renamed from: b */
    public kmb f25306b;
    /* renamed from: c */
    public kmb f25307c;
    /* renamed from: d */
    public kmb f25308d;
    /* renamed from: e */
    public kmb f25309e;

    public klv() {
        this.f25305a = null;
        this.f25306b = null;
        this.f25307c = null;
        this.f25308d = null;
        this.f25309e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        kvl kvl = this.f25305a;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(1, kvl);
        }
        kvl = this.f25306b;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(2, kvl);
        }
        kvl = this.f25307c;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(3, kvl);
        }
        kvl = this.f25308d;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(4, kvl);
        }
        kvl = this.f25309e;
        if (kvl != null) {
            return computeSerializedSize + kvd.m5479a(5, kvl);
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
                    if (this.f25305a == null) {
                        this.f25305a = new kmb();
                    }
                    kvc.mo10474a(this.f25305a);
                    continue;
                case 18:
                    if (this.f25306b == null) {
                        this.f25306b = new kmb();
                    }
                    kvc.mo10474a(this.f25306b);
                    continue;
                case 26:
                    if (this.f25307c == null) {
                        this.f25307c = new kmb();
                    }
                    kvc.mo10474a(this.f25307c);
                    continue;
                case 34:
                    if (this.f25308d == null) {
                        this.f25308d = new kmb();
                    }
                    kvc.mo10474a(this.f25308d);
                    continue;
                case 42:
                    if (this.f25309e == null) {
                        this.f25309e = new kmb();
                    }
                    kvc.mo10474a(this.f25309e);
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
        kvl kvl = this.f25305a;
        if (kvl != null) {
            kvd.mo10496b(1, kvl);
        }
        kvl = this.f25306b;
        if (kvl != null) {
            kvd.mo10496b(2, kvl);
        }
        kvl = this.f25307c;
        if (kvl != null) {
            kvd.mo10496b(3, kvl);
        }
        kvl = this.f25308d;
        if (kvl != null) {
            kvd.mo10496b(4, kvl);
        }
        kvl = this.f25309e;
        if (kvl != null) {
            kvd.mo10496b(5, kvl);
        }
        super.writeTo(kvd);
    }
}
