package p000;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.File;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: gob */
public final class gob implements get {
    /* renamed from: a */
    public static final String f19411a = bli.m887a("StckdCptrSession");
    /* renamed from: b */
    public final Uri f19412b;
    /* renamed from: c */
    public final kbg f19413c;
    /* renamed from: d */
    public final god f19414d;
    /* renamed from: e */
    private final grg f19415e = new goc();
    /* renamed from: f */
    private final gtf f19416f;
    /* renamed from: g */
    private final gsl f19417g;
    /* renamed from: h */
    private final ContentResolver f19418h;
    /* renamed from: i */
    private final gsq f19419i;

    public gob(Uri uri, gtf gtf, gsl gsl, ContentResolver contentResolver, kbg kbg, god god, gsq gsq) {
        this.f19412b = (Uri) jri.m13404b((Object) uri);
        this.f19416f = (gtf) jri.m13404b((Object) gtf);
        this.f19417g = (gsl) jri.m13404b((Object) gsl);
        this.f19418h = (ContentResolver) jri.m13404b((Object) contentResolver);
        this.f19413c = kbg;
        this.f19414d = (god) jri.m13404b((Object) god);
        this.f19419i = (gsq) jri.m13404b((Object) gsq);
    }

    /* renamed from: a */
    public final void mo7076a(hec hec, boolean z, String str) {
        this.f19414d.mo7270a();
    }

    /* renamed from: h */
    public final grg mo7077h() {
        return this.f19415e;
    }

    /* renamed from: a */
    public final synchronized void mo13389a(File file, String str, int i, int i2, long j) {
        File a = this.f19416f.mo7436a(str, ixx.JPEG);
        String str2 = f19411a;
        String valueOf = String.valueOf(a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 32);
        stringBuilder.append("Saving using stack image saver: ");
        stringBuilder.append(valueOf);
        bli.m888a(str2, stringBuilder.toString());
        try {
            this.f19417g.mo7396a(file, a);
            if (a.length() > 0) {
                this.f19419i.mo7419a(this.f19418h, str, j, this.f19413c, 0, a.getAbsolutePath(), i, i2, ixx.JPEG);
            }
        } catch (Throwable e) {
            bli.m892b(f19411a, String.format("Unable to rename file from %s to %s.", new Object[]{file.getPath(), a.getPath()}), e);
        }
        return;
    }

    /* renamed from: a */
    public final kpk mo7074a(InputStream inputStream, glz glz) {
        throw new RuntimeException("Not implemented yet");
    }

    /* renamed from: a */
    public final void mo7075a(gew gew) {
    }
}
