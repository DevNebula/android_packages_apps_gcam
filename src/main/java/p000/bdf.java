package p000;

import java.io.ByteArrayInputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: bdf */
public final class bdf {
    /* renamed from: a */
    private static final byte[] f1110a = new byte[]{(byte) 33, (byte) -1, (byte) 11, (byte) 88, (byte) 77, (byte) 80, (byte) 32, (byte) 68, (byte) 97, (byte) 116, (byte) 97, (byte) 88, (byte) 77, (byte) 80};

    /* renamed from: a */
    public static void m825a(byte[] bArr, OutputStream outputStream, C0556wd c0556wd) {
        C0783xk c0783xk = new C0783xk();
        c0783xk.mo14464f();
        try {
            byte[] a = C0557we.m6183a(c0556wd, c0783xk);
            try {
                outputStream.write(bArr, 0, bArr.length - 1);
                outputStream.write(f1110a);
                outputStream.write(a);
                a = new byte[258];
                a[0] = (byte) 1;
                for (int i = 0; i < 256; i++) {
                    a[i + 1] = (byte) (255 - i);
                }
                a[257] = (byte) 0;
                outputStream.write(a);
                outputStream.write(59);
            } finally {
                outputStream.close();
            }
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public static void m826b(byte[] bArr, OutputStream outputStream, C0556wd c0556wd) {
        ern.m2090a(new ByteArrayInputStream(bArr), outputStream, c0556wd);
    }
}
