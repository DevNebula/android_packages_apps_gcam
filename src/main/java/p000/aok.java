package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: aok */
public final class aok implements aoo {
    /* renamed from: a */
    private final CompressFormat f10626a;
    /* renamed from: b */
    private final int f10627b;

    public aok() {
        this(CompressFormat.JPEG);
    }

    private aok(CompressFormat compressFormat) {
        this.f10626a = compressFormat;
        this.f10627b = 100;
    }

    /* renamed from: a */
    public final agn mo1636a(agn agn, adp adp) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) agn.mo262b()).compress(this.f10626a, this.f10627b, byteArrayOutputStream);
        agn.mo265e();
        return new ano(byteArrayOutputStream.toByteArray());
    }
}
