package p000;

import com.google.googlex.gcam.DngColorCalibration.Illuminant;

/* compiled from: PG */
/* renamed from: ero */
final class ero implements erq {
    /* renamed from: a */
    private final byte[] f17691a;
    /* renamed from: b */
    private int f17692b = 0;

    ero(byte[] bArr) {
        this.f17691a = bArr;
    }

    public final void close() {
    }

    /* renamed from: a */
    public final int mo6523a() {
        int i = this.f17692b;
        byte[] bArr = this.f17691a;
        if (i >= bArr.length) {
            return -1;
        }
        this.f17692b = i + 1;
        return bArr[i] & Illuminant.kOther;
    }

    /* renamed from: a */
    public final eyo mo6525a(int i, int i2) {
        int min = Math.min(i, m10023b());
        eyo eyo = new eyo(this.f17691a, i2, this.f17692b, min);
        this.f17692b = min + this.f17692b;
        return eyo;
    }

    /* renamed from: a */
    public final eyo mo6524a(int i) {
        return mo6525a(this.f17691a.length - this.f17692b, i);
    }

    /* renamed from: b */
    private final int m10023b() {
        return this.f17691a.length - this.f17692b;
    }

    /* renamed from: b */
    public final void mo6526b(int i) {
        this.f17692b += Math.min(i, m10023b());
    }
}
