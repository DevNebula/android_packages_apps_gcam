package p000;

import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: ftz */
public final class ftz implements fts {
    /* renamed from: a */
    private static final ken f18785a = ken.m13710a(Integer.valueOf(37), Integer.valueOf(38), Integer.valueOf(32));

    ftz() {
    }

    /* renamed from: a */
    public final void mo6906a(iwz iwz, OutputStream outputStream) {
        try {
            boolean contains = f18785a.contains(Integer.valueOf(iwz.mo13741c()));
            int c = iwz.mo13741c();
            StringBuilder stringBuilder = new StringBuilder(36);
            stringBuilder.append("Unsupported ImageFormat: ");
            stringBuilder.append(c);
            jri.m13396a(contains, stringBuilder.toString());
            ByteBuffer a = ((ixa) iwz.mo13743e().get(0)).mo9144a();
            byte[] bArr = new byte[a.capacity()];
            a.get(bArr);
            outputStream.write(bArr);
        } finally {
            iwz.close();
        }
    }
}
