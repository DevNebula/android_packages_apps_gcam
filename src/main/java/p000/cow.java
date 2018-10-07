package p000;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* renamed from: cow */
public final class cow {
    /* renamed from: a */
    public static final String f2732a = bli.m887a("BurstItemFactory");
    /* renamed from: b */
    public final Context f2733b;
    /* renamed from: c */
    public final gln f2734c;
    /* renamed from: d */
    public final cqb f2735d;
    /* renamed from: e */
    public final gev f2736e;
    /* renamed from: f */
    public final gsp f2737f;

    public cow(Context context, gln gln, gev gev, cqb cqb, gsp gsp) {
        this.f2733b = (Context) jri.m13404b((Object) context);
        this.f2734c = (gln) jri.m13404b((Object) gln);
        this.f2736e = (gev) jri.m13404b((Object) gev);
        this.f2735d = (cqb) jri.m13404b((Object) cqb);
        this.f2737f = (gsp) jri.m13404b((Object) gsp);
    }

    /* renamed from: a */
    public static boolean m1438a(err err) {
        return cov.m8619a(new File(err.mo6541g().f4383g).getName());
    }
}
