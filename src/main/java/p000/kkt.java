package p000;

/* compiled from: PG */
/* renamed from: kkt */
public final class kkt extends kvf {
    /* renamed from: a */
    private kku[] f25177a;

    public kkt() {
        this.f25177a = kku.m16928a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        kku[] kkuArr = this.f25177a;
        if (kkuArr != null && kkuArr.length > 0) {
            int i = 0;
            while (true) {
                kku[] kkuArr2 = this.f25177a;
                if (i >= kkuArr2.length) {
                    break;
                }
                kvl kvl = kkuArr2[i];
                if (kvl != null) {
                    computeSerializedSize += kvd.m5479a(1, kvl);
                }
                i++;
            }
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
                    int a = kvn.m5518a(kvc, 10);
                    Object obj = this.f25177a;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    Object obj2 = new kku[(a + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length - 1) {
                        obj2[i] = new kku();
                        kvc.mo10474a(obj2[i]);
                        kvc.mo10488i();
                        i++;
                    }
                    obj2[i] = new kku();
                    kvc.mo10474a(obj2[i]);
                    this.f25177a = obj2;
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
        kku[] kkuArr = this.f25177a;
        if (kkuArr != null && kkuArr.length > 0) {
            int i = 0;
            while (true) {
                kku[] kkuArr2 = this.f25177a;
                if (i >= kkuArr2.length) {
                    break;
                }
                kvl kvl = kkuArr2[i];
                if (kvl != null) {
                    kvd.mo10496b(1, kvl);
                }
                i++;
            }
        }
        super.writeTo(kvd);
    }
}
