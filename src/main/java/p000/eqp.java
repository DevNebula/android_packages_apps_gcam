package p000;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: eqp */
public final class eqp implements eqi, kov {
    /* renamed from: a */
    private static final String f17660a = bli.m887a("ProcessingVid");
    /* renamed from: b */
    private final ContentResolver f17661b;
    /* renamed from: c */
    private final Uri f17662c;
    /* renamed from: d */
    private final kwk f17663d;
    /* renamed from: e */
    private final Uri f17664e;
    /* renamed from: f */
    private final long f17665f;
    /* renamed from: g */
    private final String f17666g;
    /* renamed from: h */
    private final glw f17667h;
    /* renamed from: i */
    private final kpw f17668i = kpw.m18486d();
    /* renamed from: j */
    private boolean f17669j;

    eqp(ContentResolver contentResolver, Uri uri, kwk kwk, Uri uri2, long j, String str, glw glw) {
        this.f17661b = contentResolver;
        this.f17662c = uri;
        this.f17663d = kwk;
        this.f17664e = uri2;
        this.f17665f = j;
        this.f17666g = str;
        this.f17667h = glw;
    }

    /* renamed from: a */
    public final kpk mo6496a() {
        return this.f17668i;
    }

    /* renamed from: b */
    public final long mo6497b() {
        return Long.parseLong(this.f17664e.getLastPathSegment());
    }

    /* renamed from: c */
    public final Uri mo6498c() {
        return this.f17664e;
    }

    /* renamed from: d */
    public final glw mo6499d() {
        return this.f17667h;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        if (this.f17669j) {
            bli.m898e(f17660a, "Was deleted already");
        } else {
            boolean z;
            if (this.f17661b.delete(this.f17664e, null, null) == 1) {
                z = true;
            } else {
                z = false;
            }
            jri.m13395a(z);
            this.f17669j = true;
        }
        this.f17668i.mo15642a(th);
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        eqr eqr = (eqr) obj;
        String str;
        String valueOf;
        if (this.f17669j) {
            str = f17660a;
            valueOf = String.valueOf(this.f17664e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 21);
            stringBuilder.append("item already deleted ");
            stringBuilder.append(valueOf);
            bli.m891b(str, stringBuilder.toString());
            return;
        }
        if (eqr.mo6509a().mo9709b()) {
            valueOf = (String) eqr.mo6509a().mo9706a();
        } else {
            valueOf = this.f17666g;
        }
        eqt eqt = (eqt) this.f17663d.mo10566a();
        bgl bgl = eqr.f4317a;
        eqt.f4318a = bgl.f1161a;
        eqt.f4319b = bgl.f1163c;
        eqt = eqt.mo6513a(bgl.mo1943b()).mo6512a(eqr.f4317a.f1162b.mo8649g().mo8639c()).mo6515b(this.f17665f).mo6514a(valueOf).mo6511a(eqr.f4317a.f1165e);
        eqt.f4320c = true;
        ContentValues contentValues = eqt.mo6510a().f4295a;
        Object build = this.f17662c.buildUpon().appendPath(this.f17664e.getLastPathSegment()).build();
        try {
            if (this.f17661b.update(build, contentValues, null, null) == 1) {
                this.f17668i.mo15641a(build);
            } else {
                this.f17668i.mo15642a(new IOException());
            }
        } catch (Throwable e) {
            Throwable th = e;
            String str2 = f17660a;
            str = String.valueOf(th.getMessage());
            String str3 = "Cannot update ";
            if (str.length() == 0) {
                str = new String(str3);
            } else {
                str = str3.concat(str);
            }
            bli.m891b(str2, str);
            this.f17668i.mo15642a(th);
        }
    }
}
