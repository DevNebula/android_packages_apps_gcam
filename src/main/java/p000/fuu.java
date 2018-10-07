package p000;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: fuu */
public final class fuu implements fts {
    fuu() {
    }

    /* renamed from: a */
    public final void mo6906a(iwz iwz, OutputStream outputStream) {
        boolean z;
        if (iwz.mo13741c() == 35) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        try {
            int g = (iwz.mo13745g() / 2) * (iwz.mo13745g() / 2);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((iwz.mo13745g() * iwz.mo13742d()) + g) + g);
            ixa ixa = (ixa) iwz.mo13743e().get(0);
            int g2 = iwz.mo13745g();
            int d = iwz.mo13742d();
            ByteBuffer a = ixa.mo9144a();
            int b = ixa.mo9145b();
            byte[] bArr = new byte[(((g2 - 1) * ixa.mo9145b()) + 1)];
            for (g = 0; g < d; g++) {
                a.position(ixa.mo9146c() * g);
                a.get(bArr, 0, bArr.length);
                for (int i = 0; i < g2; i++) {
                    byteArrayOutputStream.write(bArr[i * b]);
                }
            }
            ixa = (ixa) iwz.mo13743e().get(1);
            ixa ixa2 = (ixa) iwz.mo13743e().get(2);
            d = iwz.mo13745g() / 2;
            int d2 = iwz.mo13742d() / 2;
            ByteBuffer a2 = ixa.mo9144a();
            ByteBuffer a3 = ixa2.mo9144a();
            ixa.mo9146c();
            ixa2.mo9146c();
            int b2 = ixa.mo9145b();
            int b3 = ixa2.mo9145b();
            g = d - 1;
            byte[] bArr2 = new byte[((ixa.mo9145b() * g) + 1)];
            byte[] bArr3 = new byte[((g * ixa2.mo9145b()) + 1)];
            for (g2 = 0; g2 < d2; g2++) {
                a2.position(ixa.mo9146c() * g2);
                a3.position(ixa2.mo9146c() * g2);
                a2.get(bArr2, 0, bArr2.length);
                a3.get(bArr3, 0, bArr3.length);
                for (g = 0; g < d; g++) {
                    byteArrayOutputStream.write(bArr3[g * b3]);
                    byteArrayOutputStream.write(bArr2[g * b2]);
                }
            }
            outputStream.write(byteArrayOutputStream.toByteArray());
        } finally {
            iwz.close();
        }
    }
}
