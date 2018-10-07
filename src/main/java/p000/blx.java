package p000;

import android.net.Uri;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* renamed from: blx */
public final class blx implements kwk {
    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public static long m7624a(Uri uri) {
        return Long.parseLong(Uri.decode(uri.getLastPathSegment()));
    }

    /* renamed from: a */
    public static /* synthetic */ gfw m7625a(brj brj, gfw gfw) {
        try {
            ExifInterface exifInterface = gfw.f5393h;
            if (exifInterface != null) {
                String tagStringValue = exifInterface.getTagStringValue(ExifInterface.TAG_SOFTWARE);
                ExifInterface exifInterface2 = gfw.f5393h;
                int i = ExifInterface.TAG_SOFTWARE;
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(tagStringValue).length() + 1);
                stringBuilder.append(tagStringValue);
                stringBuilder.append('b');
                exifInterface2.mo12669a(exifInterface2.mo12668a(i, stringBuilder.toString()));
            }
            return (gfw) brj.mo2091a(gfw).get();
        } catch (InterruptedException e) {
            return gfw;
        } catch (ExecutionException e2) {
            return gfw;
        }
    }
}
