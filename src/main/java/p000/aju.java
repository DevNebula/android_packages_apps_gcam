package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* renamed from: aju */
final class aju implements adw {
    /* renamed from: a */
    private static final String[] f10352a = new String[]{"_data"};
    /* renamed from: b */
    private final Context f10353b;
    /* renamed from: c */
    private final Uri f10354c;

    aju(Context context, Uri uri) {
        this.f10353b = context;
        this.f10354c = uri;
    }

    /* renamed from: b */
    public final void mo188b() {
    }

    /* renamed from: c */
    public final void mo189c() {
    }

    /* renamed from: a */
    public final Class mo186a() {
        return File.class;
    }

    /* renamed from: d */
    public final adf mo190d() {
        return adf.LOCAL;
    }

    /* renamed from: a */
    public final void mo187a(acg acg, adx adx) {
        Object obj = null;
        Cursor query = this.f10353b.getContentResolver().query(this.f10354c, f10352a, null, null, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    obj = query.getString(query.getColumnIndexOrThrow("_data"));
                }
                query.close();
            } catch (Throwable th) {
                query.close();
            }
        }
        if (TextUtils.isEmpty(obj)) {
            String valueOf = String.valueOf(this.f10354c);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 30);
            stringBuilder.append("Failed to find file path for: ");
            stringBuilder.append(valueOf);
            adx.mo191a(new FileNotFoundException(stringBuilder.toString()));
            return;
        }
        adx.mo192a(new File(obj));
    }
}
