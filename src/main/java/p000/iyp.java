package p000;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: iyp */
public final class iyp extends kvf {
    /* renamed from: a */
    private int f24718a;
    /* renamed from: b */
    private int f24719b;
    /* renamed from: c */
    private byte[] f24720c;

    public iyp() {
        this.f24718a = 0;
        this.f24719b = 0;
        this.f24720c = kvn.f9034i;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f24718a;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(1, i);
        }
        i = this.f24719b;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(2, i);
        }
        if (Arrays.equals(this.f24720c, kvn.f9034i)) {
            return computeSerializedSize;
        }
        byte[] bArr = this.f24720c;
        int b = kvd.m5484b(24);
        i = bArr.length;
        return computeSerializedSize + ((i + kvd.m5484b(i)) + b);
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.mo10488i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    this.f24718a = kvc.mo10485f();
                    continue;
                case 16:
                    this.f24719b = kvc.mo10485f();
                    continue;
                case 26:
                    int f = kvc.mo10485f();
                    if (f < 0) {
                        throw kvk.m5516b();
                    }
                    byte[] bArr;
                    if (f == 0) {
                        bArr = kvn.f9034i;
                    } else {
                        i = kvc.f9003b;
                        int i2 = kvc.f9004c;
                        if (f > i - i2) {
                            throw kvk.m5517c();
                        }
                        bArr = new byte[f];
                        System.arraycopy(kvc.f9002a, i2, bArr, 0, f);
                        kvc.f9004c = f + kvc.f9004c;
                    }
                    this.f24720c = bArr;
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
        int i = this.f24718a;
        if (i != 0) {
            kvd.mo10493b(1, i);
        }
        i = this.f24719b;
        if (i != 0) {
            kvd.mo10493b(2, i);
        }
        if (!Arrays.equals(this.f24720c, kvn.f9034i)) {
            byte[] bArr = this.f24720c;
            kvd.mo10498c(3, 2);
            kvd.mo10501e(bArr.length);
            kvd.mo10492a(bArr);
        }
        super.writeTo(kvd);
    }
}
