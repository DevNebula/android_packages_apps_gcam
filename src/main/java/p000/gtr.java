package p000;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.Uri.Builder;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video;
import android.util.LruCache;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.UUID;

@TargetApi(11)
/* compiled from: PG */
/* renamed from: gtr */
public final class gtr implements gsp {
    /* renamed from: a */
    public static final String f19590a = bli.m887a("StrgImpl");
    /* renamed from: c */
    private static HashMap f19591c = new HashMap();
    /* renamed from: d */
    private static HashMap f19592d = new HashMap();
    /* renamed from: e */
    private static final LruCache f19593e = new gts();
    /* renamed from: f */
    private static HashMap f19594f = new HashMap();
    /* renamed from: g */
    private static HashMap f19595g = new HashMap();
    /* renamed from: h */
    private static HashMap f19596h = new HashMap();
    /* renamed from: b */
    public final epw f19597b;
    /* renamed from: i */
    private final gsi f19598i;
    /* renamed from: j */
    private final gtf f19599j;

    gtr(gsi gsi, epw epw, gtf gtf) {
        this.f19598i = gsi;
        this.f19597b = epw;
        this.f19599j = gtf;
    }

    /* renamed from: a */
    public final void mo7408a(iqp iqp, long j, Uri uri) {
        int intValue;
        f19594f.put(uri, new Point(iqp.f7695a, iqp.f7696b));
        f19593e.remove(uri);
        Integer num = (Integer) f19595g.get(uri);
        HashMap hashMap = f19595g;
        if (num != null) {
            intValue = num.intValue() + 1;
        } else {
            intValue = 0;
        }
        hashMap.put(uri, Integer.valueOf(intValue));
        f19596h.put(uri, Long.valueOf(j));
    }

    /* renamed from: a */
    public final Uri mo7402a(Context context, String str) {
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        Uri fromFile = Uri.fromFile(new File(str));
        intent.setData(fromFile);
        context.sendBroadcast(intent);
        return fromFile;
    }

    /* renamed from: a */
    private final Uri m11743a(ContentResolver contentResolver, String str, long j, kbg kbg, int i, String str2, int i2, int i3, ixx ixx) {
        File file = new File(str2);
        epy epy = new epy(this.f19597b);
        epy.f4296a = file;
        epy.f4297b = kbg;
        epy a = epy.mo6488a(ixx);
        a.f4298c = iqm.m4095a(i);
        try {
            return contentResolver.insert(Media.EXTERNAL_CONTENT_URI, a.mo6487a(new iqp(i2, i3)).mo6486a(j).mo6489a(str).mo6485a().f4295a);
        } catch (Throwable th) {
            String str3 = f19590a;
            String valueOf = String.valueOf(th);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 26);
            stringBuilder.append("Failed to write MediaStore");
            stringBuilder.append(valueOf);
            bli.m891b(str3, stringBuilder.toString());
            return null;
        }
    }

    /* renamed from: a */
    public final void mo7407a(anq anq, long j, Uri uri) {
        f19596h.put(uri, Long.valueOf(j));
        mo7406a(uri, anq);
    }

    /* renamed from: a */
    private final Uri m11744a(ContentResolver contentResolver, String str, long j, kbg kbg, long j2, String str2, int i, int i2, ixx ixx) {
        File file = new File(str2);
        eqt eqt = new eqt(this.f19597b);
        eqt.f4318a = file;
        eqt.f4319b = kbg;
        try {
            return contentResolver.insert(Video.Media.EXTERNAL_CONTENT_URI, eqt.mo6513a(ixx).mo6512a(new iqp(i, i2)).mo6511a(j2).mo6515b(j).mo6514a(str).mo6510a().f4295a);
        } catch (Throwable th) {
            String str3 = f19590a;
            String valueOf = String.valueOf(th);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 26);
            stringBuilder.append("Failed to write MediaStore");
            stringBuilder.append(valueOf);
            bli.m891b(str3, stringBuilder.toString());
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo7409a(Uri uri) {
        return f19594f.containsKey(uri);
    }

    /* renamed from: a */
    public final Uri mo7401a() {
        Builder builder = new Builder();
        builder.scheme("camera_session").authority("google.com").appendPath(UUID.randomUUID().toString());
        return builder.build();
    }

    /* renamed from: b */
    public final Uri mo7410b(Uri uri) {
        return (Uri) f19591c.get(uri);
    }

    /* renamed from: c */
    public final kbg mo7412c(Uri uri) {
        return kbg.m4803b((anq) f19593e.get(uri));
    }

    /* renamed from: d */
    public final Uri mo7413d(Uri uri) {
        return (Uri) f19592d.get(uri);
    }

    /* renamed from: e */
    public final Point mo7414e(Uri uri) {
        return (Point) f19594f.get(uri);
    }

    /* renamed from: f */
    public final long mo7415f(Uri uri) {
        if (!f19596h.containsKey(uri)) {
            String str = f19590a;
            String valueOf = String.valueOf(uri);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 32);
            stringBuilder.append("Using current time for session: ");
            stringBuilder.append(valueOf);
            bli.m891b(str, stringBuilder.toString());
            f19596h.put(uri, Long.valueOf(System.currentTimeMillis()));
        }
        return ((Long) f19596h.get(uri)).longValue();
    }

    /* renamed from: a */
    private static File m11745a(gtf gtf, String str, ixx ixx) {
        File a = gtf.mo7436a(str, ixx);
        int i = 1;
        while (a.exists()) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 12);
            stringBuilder.append(str);
            stringBuilder.append("_");
            stringBuilder.append(i);
            a = gtf.mo7436a(stringBuilder.toString(), ixx);
            i++;
        }
        return a;
    }

    /* renamed from: g */
    public final boolean mo7416g(Uri uri) {
        return uri.getScheme().equals("camera_session");
    }

    /* renamed from: b */
    public final gsq mo7411b() {
        return new gsq(this);
    }

    /* renamed from: h */
    public final void mo7417h(Uri uri) {
        f19594f.remove(uri);
        f19593e.remove(uri);
        f19595g.remove(uri);
    }

    /* renamed from: a */
    public final void mo7406a(Uri uri, anq anq) {
        String str = f19590a;
        int size = f19593e.size();
        StringBuilder stringBuilder = new StringBuilder(38);
        stringBuilder.append("session bitmap cache size: ");
        stringBuilder.append(size);
        bli.m896d(str, stringBuilder.toString());
        if (anq.sizeOf() > 20971520) {
            str = f19590a;
            size = anq.sizeOf();
            stringBuilder = new StringBuilder(89);
            stringBuilder.append("place holder is too large to fit into the cache: expected=20971520 but actual=");
            stringBuilder.append(size);
            bli.m894c(str, stringBuilder.toString());
            return;
        }
        int intValue;
        Drawable f = anq.mo262b();
        f19594f.put(uri, new Point(f.getIntrinsicWidth(), f.getIntrinsicHeight()));
        f19593e.remove(uri);
        f19593e.put(uri, anq);
        Integer num = (Integer) f19595g.get(uri);
        HashMap hashMap = f19595g;
        if (num != null) {
            intValue = num.intValue() + 1;
        } else {
            intValue = 0;
        }
        hashMap.put(uri, Integer.valueOf(intValue));
    }

    /* renamed from: a */
    public final void mo7405a(Uri uri, Uri uri2) {
        String str = f19590a;
        String valueOf = String.valueOf(uri);
        String valueOf2 = String.valueOf(uri2);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 8) + String.valueOf(valueOf2).length());
        stringBuilder.append("map ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" to ");
        stringBuilder.append(valueOf2);
        bli.m894c(str, stringBuilder.toString());
        f19591c.put(uri2, uri);
        f19592d.put(uri, uri2);
    }

    /* renamed from: a */
    public final Uri mo7403a(Uri uri, ContentResolver contentResolver, String str, long j, kbg kbg, int i, kbg kbg2, InputStream inputStream, int i2, int i3, ixx ixx) {
        File a = gtr.m11745a(this.f19599j, str, ixx);
        if (ixx == ixx.JPEG) {
            this.f19598i.mo7392a(a, inputStream, kbg2);
        } else {
            this.f19598i.mo7392a(a, inputStream, kau.f21835a);
        }
        String absolutePath = a.getAbsolutePath();
        if (mo7416g(uri)) {
            Uri a2 = m11743a(contentResolver, str, j, kbg, i, absolutePath, i2, i3, ixx);
            mo7405a(a2, uri);
            return a2;
        }
        epy epy = new epy(this.f19597b);
        epy.f4296a = new File(absolutePath);
        epy.f4297b = kbg;
        epy = epy.mo6488a(ixx);
        epy.f4298c = iqm.m4095a(i);
        contentResolver.update(uri, epy.mo6487a(new iqp(i2, i3)).mo6486a(j).mo6489a(str).mo6485a().f4295a, null, null);
        return uri;
    }

    /* renamed from: a */
    public final Uri mo7404a(Uri uri, ContentResolver contentResolver, String str, long j, kbg kbg, long j2, InputStream inputStream, int i, int i2, ixx ixx) {
        File a = gtr.m11745a(this.f19599j, str, ixx);
        this.f19598i.mo7391a(a, inputStream);
        String absolutePath = a.getAbsolutePath();
        if (mo7416g(uri)) {
            Uri a2 = m11744a(contentResolver, str, j, kbg, j2, absolutePath, i, i2, ixx);
            mo7405a(a2, uri);
            return a2;
        }
        eqt eqt = new eqt(this.f19597b);
        eqt.f4318a = new File(absolutePath);
        eqt.f4319b = kbg;
        contentResolver.update(uri, eqt.mo6513a(ixx).mo6512a(new iqp(i, i2)).mo6511a(j2).mo6515b(j).mo6514a(str).mo6510a().f4295a, null, null);
        return uri;
    }
}
