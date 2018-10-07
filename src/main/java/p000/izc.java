package p000;

/* compiled from: PG */
/* renamed from: izc */
public final class izc {
    /* renamed from: a */
    public final byte[] f7950a;
    /* renamed from: b */
    public final int f7951b;
    /* renamed from: c */
    public final int f7952c;
    /* renamed from: d */
    public final int f7953d;

    public izc(byte[] bArr, int i, int i2, int i3) {
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
        this.f7950a = bArr;
        this.f7953d = i;
        this.f7951b = i2;
        this.f7952c = i3;
    }
}
