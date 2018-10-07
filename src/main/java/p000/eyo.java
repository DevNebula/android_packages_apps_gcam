package p000;

/* compiled from: PG */
/* renamed from: eyo */
public final class eyo implements eyt {
    /* renamed from: a */
    public final byte[] f18023a;
    /* renamed from: b */
    public final int f18024b;
    /* renamed from: c */
    public final int f18025c;
    /* renamed from: d */
    public final int f18026d;

    public eyo(byte[] bArr, int i, int i2, int i3) {
        boolean z;
        boolean z2 = true;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "offset must be >= 0");
        if (i3 > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "length must be > 0");
        if (i3 > bArr.length) {
            z2 = false;
        }
        jri.m13396a(z2, (Object) "length exceeds data length");
        this.f18023a = bArr;
        this.f18026d = i;
        this.f18024b = i2;
        this.f18025c = i3;
    }

    /* renamed from: a */
    public final long mo6681a() {
        eyv eyv = null;
        return eyv.mo6681a();
    }

    /* renamed from: a */
    public final void mo6682a(eyu eyu) {
        eyv eyv = null;
        eyv.mo6682a(new eyp(this, eyu));
    }
}
