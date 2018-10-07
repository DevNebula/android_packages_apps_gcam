package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Images.Thumbnails;

/* compiled from: PG */
/* renamed from: aep */
public final class aep implements aer {
    /* renamed from: b */
    private static final String[] f10163b = new String[]{"_data"};
    /* renamed from: a */
    private final ContentResolver f10164a;

    public aep(ContentResolver contentResolver) {
        this.f10164a = contentResolver;
    }

    /* renamed from: a */
    public final Cursor mo205a(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return this.f10164a.query(Thumbnails.EXTERNAL_CONTENT_URI, f10163b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
    }
}
