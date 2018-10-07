package p000;

import android.content.ContentResolver;
import android.net.Uri;
import android.net.Uri.Builder;
import java.util.UUID;

/* compiled from: PG */
/* renamed from: goa */
public final class goa implements gnx {
    /* renamed from: a */
    private static final String f19405a = bli.m887a("StackSaverImpl");
    /* renamed from: b */
    private final gkr f19406b;
    /* renamed from: c */
    private final gtf f19407c;
    /* renamed from: d */
    private final gsl f19408d;
    /* renamed from: e */
    private final ContentResolver f19409e;
    /* renamed from: f */
    private final kbg f19410f;

    public goa(gkr gkr, gtf gtf, gsl gsl, kbg kbg, ContentResolver contentResolver) {
        this.f19406b = (gkr) jri.m13404b((Object) gkr);
        this.f19407c = (gtf) jri.m13404b((Object) gtf);
        this.f19408d = (gsl) jri.m13404b((Object) gsl);
        this.f19410f = kbg;
        this.f19409e = (ContentResolver) jri.m13404b((Object) contentResolver);
    }

    /* renamed from: a */
    public final gob mo7268a(gsq gsq, god god) {
        Uri o = this.f19406b.mo13386o();
        Builder builder = new Builder();
        builder.scheme(o.getScheme()).authority(o.getAuthority()).appendPath(o.getLastPathSegment()).appendPath(UUID.randomUUID().toString());
        Uri build = builder.build();
        String str = f19405a;
        String valueOf = String.valueOf(build);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 22);
        stringBuilder.append("Stacked ID generated: ");
        stringBuilder.append(valueOf);
        bli.m888a(str, stringBuilder.toString());
        return new gob(build, this.f19407c, this.f19408d, this.f19409e, this.f19410f, god, gsq);
    }
}
