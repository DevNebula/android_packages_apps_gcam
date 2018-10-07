package p000;

import java.io.File;

/* compiled from: PG */
/* renamed from: cip */
final class cip implements kaw {
    /* renamed from: a */
    private final kpw f12583a;
    /* renamed from: b */
    private final /* synthetic */ cig f12584b;

    public cip(cig cig, kpw kpw) {
        this.f12584b = cig;
        jri.m13404b((Object) kpw);
        this.f12583a = kpw;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9689a(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null || !bool.booleanValue()) {
            return Boolean.valueOf(false);
        }
        String format = String.format("burst-%d", new Object[]{Long.valueOf(System.currentTimeMillis())});
        Object file = new File(m8327a(), format);
        if (file.mkdirs() || file.exists()) {
            this.f12583a.mo15641a(file);
            return Boolean.valueOf(true);
        }
        String str = cig.f2211a;
        String valueOf = String.valueOf(format);
        String str2 = "Unable to create burst session directory: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        bli.m898e(str, valueOf);
        this.f12584b.f2221c.f2189e.mo12420e();
        valueOf = String.valueOf(format);
        format = "Unable to create burst session directory: ";
        if (valueOf.length() == 0) {
            valueOf = new String(format);
        } else {
            valueOf = format.concat(valueOf);
        }
        throw new IllegalStateException(valueOf);
    }

    /* renamed from: a */
    private final File m8327a() {
        cig cig = this.f12584b;
        try {
            return gnv.m11435a(cig.f2220b, cig.f2235q).mo7265a("burst");
        } catch (Throwable e) {
            kqg.f8786a.mo10213b(e);
            throw new RuntimeException(e);
        }
    }
}
