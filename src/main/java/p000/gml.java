package p000;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: gml */
final class gml implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ gmi f5677a;

    gml(gmi gmi) {
        this.f5677a = gmi;
    }

    public final void run() {
        if (this.f5677a.f26435b.mo7274b()) {
            try {
                ExifInterface exifInterface;
                gmi gmi = this.f5677a;
                byte[] d = gmi.f26436c.mo7399d(gmi.f26435b.mo7273a());
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeByteArray(d, 0, d.length, options);
                int i = options.outWidth;
                int i2 = options.outHeight;
                try {
                    exifInterface = new ExifInterface();
                    exifInterface.mo12673a(d);
                } catch (IOException e) {
                    gmi gmi2 = this.f5677a;
                    String valueOf = String.valueOf(e.getMessage());
                    String str = "Could not read exif: ";
                    if (valueOf.length() == 0) {
                        valueOf = new String(str);
                    } else {
                        valueOf = str.concat(valueOf);
                    }
                    gmi2.mo14922b(valueOf);
                    exifInterface = null;
                }
                this.f5677a.mo7074a(new ByteArrayInputStream(d), new glz(new iqp(i, i2), ixx.JPEG).mo7221a(exifInterface).mo7222a(Integer.valueOf(0)));
            } catch (IOException e2) {
            }
        }
    }
}
