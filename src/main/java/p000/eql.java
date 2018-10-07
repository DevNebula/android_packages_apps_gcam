package p000;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: eql */
public final class eql implements eqi, kov {
    /* renamed from: b */
    private static final String f17647b = bli.m887a("ProcessingImg");
    /* renamed from: a */
    public final kpw f17648a = kpw.m18486d();
    /* renamed from: c */
    private final ContentResolver f17649c;
    /* renamed from: d */
    private final Uri f17650d;
    /* renamed from: e */
    private final kwk f17651e;
    /* renamed from: f */
    private final Uri f17652f;
    /* renamed from: g */
    private final long f17653g;
    /* renamed from: h */
    private final String f17654h;
    /* renamed from: i */
    private final glw f17655i;
    /* renamed from: j */
    private boolean f17656j;

    eql(ContentResolver contentResolver, Uri uri, kwk kwk, Uri uri2, long j, String str, glw glw) {
        this.f17649c = contentResolver;
        this.f17650d = uri;
        this.f17651e = kwk;
        this.f17652f = uri2;
        this.f17653g = j;
        this.f17654h = str;
        this.f17655i = glw;
    }

    /* renamed from: e */
    public final synchronized boolean mo13171e() {
        boolean z = false;
        synchronized (this) {
            if (this.f17656j) {
                bli.m898e(f17647b, "Was deleted already");
            } else {
                if (this.f17649c.delete(this.f17652f, null, null) == 1) {
                    z = true;
                }
                this.f17656j = z;
                z = this.f17656j;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final kpk mo6496a() {
        return this.f17648a;
    }

    /* renamed from: b */
    public final long mo6497b() {
        return Long.parseLong(this.f17652f.getLastPathSegment());
    }

    /* renamed from: c */
    public final Uri mo6498c() {
        return this.f17652f;
    }

    /* renamed from: d */
    public final glw mo6499d() {
        return this.f17655i;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        mo13171e();
        this.f17648a.mo15642a(th);
    }

    /* renamed from: a */
    private final synchronized void m9995a(eqn eqn) {
        String valueOf;
        if (this.f17656j) {
            String str = f17647b;
            valueOf = String.valueOf(this.f17652f);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 21);
            stringBuilder.append("item already deleted ");
            stringBuilder.append(valueOf);
            bli.m891b(str, stringBuilder.toString());
        } else {
            if (eqn.mo6508f().mo9709b()) {
                valueOf = (String) eqn.mo6508f().mo9706a();
            } else {
                valueOf = this.f17654h;
            }
            epy epy = (epy) this.f17651e.mo10566a();
            epy.f4296a = eqn.mo6506d();
            epy.f4297b = eqn.mo6503a();
            epy = epy.mo6488a(eqn.mo6504b());
            epy.f4298c = eqn.mo6505c();
            ContentValues contentValues = epy.mo6487a(eqn.mo6507e()).mo6486a(this.f17653g).mo6489a(valueOf).mo6485a().f4295a;
            Object build = this.f17650d.buildUpon().appendPath(this.f17652f.getLastPathSegment()).build();
            try {
                if (this.f17649c.update(build, contentValues, null, null) == 1) {
                    this.f17648a.mo15641a(build);
                } else {
                    this.f17648a.mo15642a(new IOException());
                }
            } catch (Throwable e) {
                String str2 = f17647b;
                valueOf = String.valueOf(e.getMessage());
                String str3 = "Cannot update ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str3);
                } else {
                    valueOf = str3.concat(valueOf);
                }
                bli.m891b(str2, valueOf);
                this.f17648a.mo15642a(e);
            }
        }
    }
}
