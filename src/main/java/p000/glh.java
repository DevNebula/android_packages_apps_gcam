package p000;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: glh */
final class glh implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ glf f5605a;

    glh(glf glf) {
        this.f5605a = glf;
    }

    public final void run() {
        if (this.f5605a.f24412b.mo7274b()) {
            try {
                ExifInterface exifInterface;
                glf glf = this.f5605a;
                byte[] d = glf.f24413c.mo7399d(glf.f24412b.mo7273a());
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeByteArray(d, 0, d.length, options);
                int i = options.outWidth;
                int i2 = options.outHeight;
                try {
                    exifInterface = new ExifInterface();
                    exifInterface.mo12673a(d);
                } catch (IOException e) {
                    glf glf2 = this.f5605a;
                    String valueOf = String.valueOf(e.getMessage());
                    String str = "Could not read exif: ";
                    if (valueOf.length() == 0) {
                        valueOf = new String(str);
                    } else {
                        valueOf = str.concat(valueOf);
                    }
                    glf2.mo14930b(valueOf);
                    exifInterface = null;
                }
                glx.m11388a(this.f5605a, new ByteArrayInputStream(d), i, i2, 0, exifInterface);
            } catch (IOException e2) {
            }
        }
    }
}
