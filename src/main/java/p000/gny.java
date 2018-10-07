package p000;

import android.content.ContentResolver;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: gny */
public final class gny {
    /* renamed from: a */
    private static final String f5770a = bli.m887a("StackSaverFactory");
    /* renamed from: b */
    private final ContentResolver f5771b;
    /* renamed from: c */
    private final gsx f5772c;
    /* renamed from: d */
    private final gtg f5773d;
    /* renamed from: e */
    private final gsl f5774e;

    public gny(ContentResolver contentResolver, gsx gsx, gtg gtg, gsl gsl) {
        this.f5771b = (ContentResolver) jri.m13404b((Object) contentResolver);
        this.f5772c = (gsx) jri.m13404b((Object) gsx);
        this.f5773d = (gtg) jri.m13404b((Object) gtg);
        this.f5774e = (gsl) jri.m13404b((Object) gsl);
    }

    /* renamed from: a */
    public final gnx mo7269a(gkr gkr, String str, kbg kbg) {
        try {
            return new goa(gkr, this.f5773d.mo7440a(this.f5772c.mo7424a(str)), this.f5774e, kbg, this.f5771b);
        } catch (IOException e) {
            String str2 = f5770a;
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 25);
            stringBuilder.append("Failed to get FileNamer: ");
            stringBuilder.append(valueOf);
            bli.m891b(str2, stringBuilder.toString());
            return null;
        }
    }
}
