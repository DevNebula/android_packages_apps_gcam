package p000;

import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import java.util.Date;
import java.util.Set;

/* compiled from: PG */
/* renamed from: eru */
public class eru {
    /* renamed from: a */
    private iqp f4377a;
    /* renamed from: b */
    public final long f4378b;
    /* renamed from: c */
    public final String f4379c;
    /* renamed from: d */
    public final String f4380d;
    /* renamed from: e */
    public final Date f4381e;
    /* renamed from: f */
    public final Date f4382f;
    /* renamed from: g */
    public final String f4383g;
    /* renamed from: h */
    public final Uri f4384h;
    /* renamed from: i */
    public final boolean f4385i;
    /* renamed from: j */
    public final long f4386j;
    /* renamed from: k */
    public final int f4387k;
    /* renamed from: l */
    public final erx f4388l;
    /* renamed from: m */
    public final boolean f4389m;

    public eru(long j, String str, String str2, Date date, Date date2, String str3, Uri uri, boolean z, kbg kbg, long j2, int i, erx erx, boolean z2) {
        this.f4378b = j;
        this.f4379c = str;
        this.f4380d = str2;
        this.f4381e = date;
        this.f4382f = date2;
        this.f4383g = str3;
        this.f4384h = uri;
        this.f4385i = z;
        this.f4377a = (iqp) kbg.mo9710c();
        this.f4386j = j2;
        this.f4387k = i;
        this.f4388l = erx;
        this.f4389m = z2;
    }

    /* renamed from: a */
    public boolean mo6554a(Set set) {
        return set.contains(this.f4384h);
    }

    /* renamed from: a */
    public ken mo6553a() {
        return ken.m13708a(Long.valueOf(this.f4378b));
    }

    /* renamed from: e_ */
    public Uri mo6555e_() {
        return Media.EXTERNAL_CONTENT_URI.buildUpon().appendPath(Long.toString(((Long) mo6553a().get(0)).longValue())).build();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* renamed from: g */
    public final p000.iqp mo6556g() {
        /*
        r6 = this;
        r2 = 0;
        r5 = 0;
        r0 = r6.f4377a;
        if (r0 != 0) goto L_0x0032;
    L_0x0006:
        r3 = r6.f4383g;
        r1 = new android.graphics.BitmapFactory$Options;
        r1.<init>();
        r0 = 1;
        r1.inJustDecodeBounds = r0;
        android.graphics.BitmapFactory.decodeFile(r3, r1);
        r0 = r1.outWidth;
        if (r0 <= 0) goto L_0x003b;
    L_0x0017:
        r0 = r1.outHeight;
        if (r0 <= 0) goto L_0x003b;
    L_0x001b:
        r0 = r1.outWidth;
        r1 = r1.outHeight;
    L_0x001f:
        r2 = new iqp;
        r2.<init>(r0, r1);
        r0 = r2;
    L_0x0025:
        r6.f4377a = r0;
        r0 = r6.f4377a;
        if (r0 != 0) goto L_0x0032;
    L_0x002b:
        r0 = new iqp;
        r0.<init>(r5, r5);
        r6.f4377a = r0;
    L_0x0032:
        r0 = r6.f4377a;
        r0 = p000.jri.m13404b(r0);
        r0 = (p000.iqp) r0;
        return r0;
    L_0x003b:
        r0 = java.lang.String.valueOf(r3);
        r1 = "Dimension decode failed for ";
        r4 = r0.length();
        if (r4 != 0) goto L_0x00a7;
    L_0x0047:
        r0 = new java.lang.String;
        r0.<init>(r1);
    L_0x004c:
        r1 = "FilmstripItemData";
        p000.bli.m898e(r1, r0);
        r1 = android.graphics.BitmapFactory.decodeFile(r3);
        if (r1 != 0) goto L_0x007e;
    L_0x0057:
        r0 = java.lang.String.valueOf(r3);
        r0 = r0.length();
        r1 = new java.lang.StringBuilder;
        r0 = r0 + 36;
        r1.<init>(r0);
        r0 = "PhotoData skipped. Decoding ";
        r1.append(r0);
        r1.append(r3);
        r0 = " failed.";
        r1.append(r0);
        r0 = "FilmstripItemData";
        r1 = r1.toString();
        p000.bli.m898e(r0, r1);
        r0 = r2;
        goto L_0x0025;
    L_0x007e:
        r0 = r1.getWidth();
        r1 = r1.getHeight();
        if (r0 == 0) goto L_0x008a;
    L_0x0088:
        if (r1 != 0) goto L_0x001f;
    L_0x008a:
        r0 = java.lang.String.valueOf(r3);
        r1 = "PhotoData skipped. Bitmap size 0 for ";
        r3 = r0.length();
        if (r3 != 0) goto L_0x00a2;
    L_0x0096:
        r0 = new java.lang.String;
        r0.<init>(r1);
    L_0x009b:
        r1 = "FilmstripItemData";
        p000.bli.m898e(r1, r0);
        r0 = r2;
        goto L_0x0025;
    L_0x00a2:
        r0 = r1.concat(r0);
        goto L_0x009b;
    L_0x00a7:
        r0 = r1.concat(r0);
        goto L_0x004c;
        */
        throw new UnsupportedOperationException("Method not decompiled: eru.g():iqp");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FilmstripItemData {");
        stringBuilder.append("id:");
        stringBuilder.append(this.f4378b);
        stringBuilder.append(",title:");
        stringBuilder.append(this.f4379c);
        stringBuilder.append(",mimeType:");
        stringBuilder.append(this.f4380d);
        stringBuilder.append(",creationDate:");
        stringBuilder.append(this.f4381e);
        stringBuilder.append(",lastModifiedDate:");
        stringBuilder.append(this.f4382f);
        stringBuilder.append(",filePath:");
        stringBuilder.append(this.f4383g);
        stringBuilder.append(",uri:");
        stringBuilder.append(this.f4384h);
        stringBuilder.append(",inProgress:");
        stringBuilder.append(this.f4385i);
        stringBuilder.append(",dimensions:");
        stringBuilder.append(this.f4377a);
        stringBuilder.append(",sizeInBytes:");
        stringBuilder.append(this.f4386j);
        stringBuilder.append(",orientation:");
        stringBuilder.append(this.f4387k);
        stringBuilder.append(",location:");
        stringBuilder.append(this.f4388l);
        stringBuilder.append(",cancellable:");
        stringBuilder.append(this.f4389m);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
