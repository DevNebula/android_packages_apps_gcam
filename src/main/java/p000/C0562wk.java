package p000;

import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: wk */
public final class C0562wk extends OutputStream {
    /* renamed from: a */
    public int f9966a = 0;
    /* renamed from: b */
    private final OutputStream f9967b;

    public C0562wk(OutputStream outputStream) {
        this.f9967b = outputStream;
    }

    public final void write(int i) {
        this.f9967b.write(i);
        this.f9966a++;
    }

    public final void write(byte[] bArr) {
        this.f9967b.write(bArr);
        this.f9966a += bArr.length;
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.f9967b.write(bArr, i, i2);
        this.f9966a += i2;
    }
}
