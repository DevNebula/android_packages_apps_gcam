package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Video.Thumbnails;

/* compiled from: PG */
/* renamed from: aeq */
public final class aeq implements aer {
    /* renamed from: b */
    private static final String[] f10165b = new String[]{"_data"};
    /* renamed from: a */
    private final ContentResolver f10166a;

    public aeq(ContentResolver contentResolver) {
        this.f10166a = contentResolver;
    }

    /* renamed from: a */
    public final Cursor mo205a(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return this.f10166a.query(Thumbnails.EXTERNAL_CONTENT_URI, f10165b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
    }
}
