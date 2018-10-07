package p000;

import java.io.IOException;

/* compiled from: PG */
/* renamed from: gti */
public final class gti {
    /* renamed from: a */
    private static final String f6052a = bli.m887a("FileNamerModule");

    /* renamed from: a */
    public static gtf m2868a(gtg gtg, gsx gsx) {
        try {
            return gtg.mo7440a(gsx);
        } catch (IOException e) {
            String str = f6052a;
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 25);
            stringBuilder.append("Unable to get FileNamer: ");
            stringBuilder.append(valueOf);
            bli.m891b(str, stringBuilder.toString());
            throw new AssertionError(e);
        }
    }
}
