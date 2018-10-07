package p000;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* renamed from: eqb */
public final class eqb implements eqa {
    /* renamed from: e */
    private static final String f17621e = bli.m887a("MediaStoreManager");
    /* renamed from: a */
    public final Uri f17622a;
    /* renamed from: b */
    public final ContentResolver f17623b;
    /* renamed from: c */
    public final eqm f17624c;
    /* renamed from: d */
    public final kpm f17625d;
    /* renamed from: f */
    private final gtf f17626f;
    /* renamed from: g */
    private final eqq f17627g;
    /* renamed from: h */
    private final kwk f17628h;
    /* renamed from: i */
    private final ird f17629i;

    eqb(Uri uri, ContentResolver contentResolver, gtf gtf, eqm eqm, eqq eqq, kwk kwk, ird ird, kpm kpm) {
        this.f17622a = uri;
        this.f17623b = contentResolver;
        this.f17626f = gtf;
        this.f17624c = eqm;
        this.f17627g = eqq;
        this.f17628h = kwk;
        this.f17629i = ird;
        this.f17625d = kpm;
    }

    /* renamed from: a */
    public final kpk mo6493a(long j, String str, glw glw, kpk kpk, ixx ixx) {
        this.f17629i.mo8856a("insertProcessingImage");
        File a = this.f17626f.mo7436a(str, ixx);
        eqj eqj = (eqj) this.f17628h.mo10566a();
        eqj.f4308a = a.getAbsolutePath();
        epv a2 = eqj.mo6501a(j).mo6500a();
        String str2 = f17621e;
        String valueOf = String.valueOf(a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 61);
        stringBuilder.append("insertProcessingImg: filePath=");
        stringBuilder.append(valueOf);
        stringBuilder.append(" takenTime=");
        stringBuilder.append(j);
        bli.m888a(str2, stringBuilder.toString());
        kpk a3 = kny.m18475a(this.f17625d.mo10202a(new eqc(this, a2)), new eqd(this, j, str, glw, kpk), this.f17625d);
        this.f17629i.mo8857b();
        return a3;
    }

    /* renamed from: b */
    public final /* synthetic */ eqi mo6494b(long j, String str, glw glw, kpk kpk, ixx ixx) {
        this.f17629i.mo8856a("insertProcessingVideo");
        eqj eqj = (eqj) this.f17628h.mo10566a();
        eqj.f4308a = this.f17626f.mo7436a(str, ixx).getAbsolutePath();
        Uri insert = this.f17623b.insert(this.f17622a, eqj.mo6501a(j).mo6500a().f4295a);
        eqq eqq = this.f17627g;
        Object eqp = new eqp((ContentResolver) eqq.m2062a((ContentResolver) eqq.f4314a.mo10566a(), 1), (Uri) eqq.m2062a((Uri) eqq.f4315b.mo10566a(), 2), eqq.f4316c, (Uri) eqq.m2062a(insert, 4), j, (String) eqq.m2062a(str, 6), (glw) eqq.m2062a(glw, 7));
        kow.m13878a(kpk, eqp, kpq.f8776a);
        this.f17629i.mo8857b();
        return eqp;
    }

    /* renamed from: a */
    public final eql mo6492a(Uri uri, long j, String str, glw glw, kpk kpk) {
        this.f17629i.mo8856a("updateProcessingImage");
        jri.m13395a("content".equals(uri.getScheme()));
        Object a = this.f17624c.mo6502a(uri, j, str, glw);
        kow.m13878a(kpk, a, kpq.f8776a);
        this.f17629i.mo8857b();
        return a;
    }
}
