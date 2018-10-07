package p000;

import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.io.Closeable;

/* compiled from: PG */
/* renamed from: izd */
public final class izd implements Closeable {
    /* renamed from: a */
    public final byte[] f7954a;
    /* renamed from: b */
    public int f7955b = 0;

    public izd(byte[] bArr) {
        this.f7954a = bArr;
    }

    public final void close() {
    }

    /* renamed from: a */
    public final int mo9212a() {
        int i = this.f7955b;
        byte[] bArr = this.f7954a;
        if (i >= bArr.length) {
            return -1;
        }
        this.f7955b = i + 1;
        return bArr[i] & Illuminant.kOther;
    }

    /* renamed from: a */
    public final izc mo9213a(int i, int i2) {
        int min = Math.min(i, mo9214b());
        izc izc = new izc(this.f7954a, i2, this.f7955b, min);
        this.f7955b = min + this.f7955b;
        return izc;
    }

    /* renamed from: b */
    public final int mo9214b() {
        return this.f7954a.length - this.f7955b;
    }
}
