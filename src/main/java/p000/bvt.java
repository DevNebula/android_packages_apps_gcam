package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import java.io.ByteArrayOutputStream;

/* compiled from: PG */
/* renamed from: bvt */
public final class bvt implements bvs {
    /* renamed from: a */
    private final kwk f11847a;

    public bvt(kwk kwk) {
        this.f11847a = kwk;
    }

    /* renamed from: a */
    public final ByteArrayOutputStream mo2177a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f11847a.mo10566a();
        bitmap.compress(CompressFormat.JPEG, 90, byteArrayOutputStream);
        return byteArrayOutputStream;
    }
}
