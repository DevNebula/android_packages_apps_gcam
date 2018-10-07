package p000;

import android.content.ContentResolver;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: eqm */
public final class eqm {
    /* renamed from: a */
    private final kwk f4311a;
    /* renamed from: b */
    private final kwk f4312b;
    /* renamed from: c */
    private final kwk f4313c;

    public eqm(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f4311a = (kwk) eqm.m2054a(kwk, 1);
        this.f4312b = (kwk) eqm.m2054a(kwk2, 2);
        this.f4313c = (kwk) eqm.m2054a(kwk3, 3);
    }

    /* renamed from: a */
    private static Object m2054a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }

    /* renamed from: a */
    public final eql mo6502a(Uri uri, long j, String str, glw glw) {
        return new eql((ContentResolver) eqm.m2054a((ContentResolver) this.f4311a.mo10566a(), 1), (Uri) eqm.m2054a((Uri) this.f4312b.mo10566a(), 2), this.f4313c, (Uri) eqm.m2054a(uri, 4), j, (String) eqm.m2054a(str, 6), (glw) eqm.m2054a(glw, 7));
    }
}
