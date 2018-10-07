package p000;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: gne */
final class gne implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ gmz f5723a;

    gne(gmz gmz) {
        this.f5723a = gmz;
    }

    public final void run() {
        if (this.f5723a.f26438b.mo7274b()) {
            try {
                ExifInterface exifInterface;
                gmz gmz = this.f5723a;
                byte[] d = gmz.f26439c.mo7399d(gmz.f26438b.mo7273a());
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeByteArray(d, 0, d.length, options);
                int i = options.outWidth;
                int i2 = options.outHeight;
                try {
                    exifInterface = new ExifInterface();
                    exifInterface.mo12673a(d);
                } catch (IOException e) {
                    gmz gmz2 = this.f5723a;
                    String valueOf = String.valueOf(e.getMessage());
                    String str = "Could not read exif: ";
                    if (valueOf.length() == 0) {
                        valueOf = new String(str);
                    } else {
                        valueOf = str.concat(valueOf);
                    }
                    gmz2.mo14922b(valueOf);
                    exifInterface = null;
                }
                this.f5723a.mo7074a(new ByteArrayInputStream(d), new glz(new iqp(i, i2), ixx.JPEG).mo7221a(exifInterface).mo7222a(Integer.valueOf(0)));
            } catch (IOException e2) {
            }
        }
    }
}
