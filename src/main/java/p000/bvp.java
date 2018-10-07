package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Files;
import java.io.File;

/* compiled from: PG */
/* renamed from: bvp */
public final class bvp {
    /* renamed from: a */
    private static final String f1657a = bli.m887a("SpecTypeMeta");
    /* renamed from: b */
    private final ContentResolver f1658b;
    /* renamed from: c */
    private final gsx f1659c;
    /* renamed from: d */
    private final ird f1660d;

    bvp(ContentResolver contentResolver, gsx gsx, ird ird) {
        this.f1658b = contentResolver;
        this.f1659c = gsx;
        this.f1660d = ird;
    }

    /* renamed from: a */
    public final kbg mo2176a(long j) {
        Object obj = 1;
        this.f1660d.mo8856a("SpecialType");
        try {
            kbg a = m1038a(Files.getContentUri("external").buildUpon().appendPath(Long.toString(j)).build());
            String str;
            if (a.mo9709b()) {
                str = (String) a.mo9706a();
                jri.m13404b((Object) str);
                String toLowerCase = str.toLowerCase();
                if (!(toLowerCase.endsWith("jpg") || toLowerCase.endsWith("jpeg") || toLowerCase.endsWith("rgbz"))) {
                    obj = null;
                }
                String str2;
                if (obj == null) {
                    str2 = f1657a;
                    toLowerCase = "Ignoring metadata for which is not an image ";
                    str = String.valueOf(str);
                    if (str.length() == 0) {
                        str = new String(toLowerCase);
                    } else {
                        str = toLowerCase.concat(str);
                    }
                    bli.m898e(str2, str);
                    a = kau.f21835a;
                    this.f1660d.mo8857b();
                } else if (m1039a(str)) {
                    str2 = f1657a;
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 38);
                    stringBuilder.append("file path for ");
                    stringBuilder.append(j);
                    stringBuilder.append(" is ");
                    stringBuilder.append(str);
                    bli.m888a(str2, stringBuilder.toString());
                    jri.m13404b((Object) str);
                    a = bve.m1025a(ern.m2080a(ern.m2085a(str)));
                    this.f1660d.mo8857b();
                } else {
                    str2 = f1657a;
                    toLowerCase = "Ignoring metadata for image that is not in DCIM/Camera: ";
                    str = String.valueOf(str);
                    if (str.length() == 0) {
                        str = new String(toLowerCase);
                    } else {
                        str = toLowerCase.concat(str);
                    }
                    bli.m898e(str2, str);
                    a = kau.f21835a;
                    this.f1660d.mo8857b();
                }
            } else {
                str = f1657a;
                StringBuilder stringBuilder2 = new StringBuilder(36);
                stringBuilder2.append("No metadata for ");
                stringBuilder2.append(j);
                bli.m898e(str, stringBuilder2.toString());
                a = kau.f21835a;
            }
            return a;
        } finally {
            this.f1660d.mo8857b();
        }
    }

    /* renamed from: a */
    private final kbg m1038a(Uri uri) {
        String str = null;
        jri.m13404b((Object) uri);
        Cursor query = this.f1658b.query(uri, new String[]{"_data"}, str, str, str);
        if (query == null || !query.moveToFirst()) {
            return kau.f21835a;
        }
        try {
            str = query.getString(0);
        } catch (Throwable e) {
            String str2 = f1657a;
            String valueOf = String.valueOf(uri);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 39);
            stringBuilder.append("Fail to find the file path for the uri ");
            stringBuilder.append(valueOf);
            bli.m892b(str2, stringBuilder.toString(), e);
        }
        query.close();
        if (str == null) {
            return kau.f21835a;
        }
        if (new File(str).exists()) {
            return kbg.m4804c(str);
        }
        return kau.f21835a;
    }

    /* renamed from: a */
    private final boolean m1039a(String str) {
        jri.m13404b((Object) str);
        try {
            return ((String) jri.m13404b(new File(str).getCanonicalPath())).startsWith(this.f1659c.mo7426b());
        } catch (Throwable e) {
            throw new IllegalStateException("Fails to obtain canonical path", e);
        }
    }
}
