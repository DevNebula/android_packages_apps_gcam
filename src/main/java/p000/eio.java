package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.File;
import java.util.UUID;

/* compiled from: PG */
/* renamed from: eio */
public final class eio {
    /* renamed from: a */
    public static ell f3848a;

    public eio(Context context) {
        context.getSharedPreferences(String.valueOf(context.getPackageName()).concat("_media"), 0).edit().clear().apply();
    }

    /* renamed from: a */
    public static void m1804a(ikd ikd, enr enr, eol eol) {
        jri.m13404b((Object) ikd);
        jri.m13404b((Object) enr);
        jri.m13404b((Object) eol);
        if (ikd.m12502b()) {
            enr.mo6355a(eol);
        } else {
            ikd.execute(new eop(enr, eol));
        }
    }

    /* renamed from: a */
    public static kbg m1803a(File file) {
        C0556wd b = ern.m2094b(file.getAbsolutePath());
        if (b == null) {
            return kau.f21835a;
        }
        try {
            C0557we.f9955a.mo11459a("http://ns.google.com/photos/1.0/creations/", "GCreations");
            String j = b.mo11458j("http://ns.google.com/photos/1.0/creations/", "CameraBurstID");
            if (j != null) {
                return kbg.m4804c(UUID.fromString(j));
            }
            return kau.f21835a;
        } catch (C0554wb e) {
            return kau.f21835a;
        }
    }

    /* renamed from: a */
    public static String m1802a(ContentResolver contentResolver, Uri uri) {
        String str = null;
        Cursor query = contentResolver.query(uri, new String[]{"_data"}, null, null, null);
        if (query != null) {
            try {
                int columnIndexOrThrow = query.getColumnIndexOrThrow("_data");
                if (query.moveToFirst()) {
                    str = query.getString(columnIndexOrThrow);
                } else {
                    query.close();
                }
            } finally {
                query.close();
            }
        }
        return str;
    }

    /* renamed from: a */
    public static boolean m1805a(String str) {
        C0556wd b = ern.m2094b(str);
        if (b == null) {
            return false;
        }
        try {
            C0557we.f9955a.mo11459a("http://ns.google.com/photos/1.0/creations/", "GCreations");
            if (b.mo11449b("http://ns.google.com/photos/1.0/creations/", "Type")) {
                return b.mo11458j("http://ns.google.com/photos/1.0/creations/", "Type").equals("GCameraCollage");
            }
            return false;
        } catch (Throwable e) {
            Throwable th = e;
            String valueOf = String.valueOf(str);
            String str2 = "Could not fetch XMP_TYPE_BURST_COLLAGE TAG from ";
            throw new RuntimeException(valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf), th);
        }
    }

    /* renamed from: a */
    public final synchronized void mo6227a() {
    }

    /* renamed from: b */
    public final synchronized void mo6228b() {
    }

    /* renamed from: c */
    public final synchronized epn mo6229c() {
        return null;
    }
}
