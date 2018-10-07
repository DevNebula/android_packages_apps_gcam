package p000;

/* compiled from: PG */
/* renamed from: klk */
public final class klk extends kvf {
    /* renamed from: a */
    public boolean f25257a;
    /* renamed from: b */
    public boolean f25258b;
    /* renamed from: c */
    public long f25259c;

    public klk() {
        this.f25257a = false;
        this.f25258b = false;
        this.f25259c = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (this.f25257a) {
            computeSerializedSize += kvd.m5484b(64) + 1;
        }
        if (this.f25258b) {
            computeSerializedSize += kvd.m5484b(72) + 1;
        }
        long j = this.f25259c;
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
                case 64:
                    this.f25257a = kvc.mo10480c();
                    continue;
                case 72:
                    this.f25258b = kvc.mo10480c();
                    continue;
                case 80:
                    this.f25259c = kvc.mo10486g();
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
        boolean z = this.f25257a;
        if (z) {
            kvd.mo10491a(8, z);
        }
        z = this.f25258b;
        if (z) {
            kvd.mo10491a(9, z);
        }
        long j = this.f25259c;
        if (j != 0) {
            kvd.mo10494b(10, j);
        }
        super.writeTo(kvd);
    }
}
