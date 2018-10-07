package p000;

import android.content.pm.PackageManager;
import android.content.res.Resources;

/* compiled from: PG */
/* renamed from: dzi */
public final class dzi {
    /* renamed from: a */
    private final kwk f3592a;
    /* renamed from: b */
    private final kwk f3593b;
    /* renamed from: c */
    private final kwk f3594c;
    /* renamed from: d */
    private final kwk f3595d;

    public dzi(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f3592a = (kwk) dzi.m1746a(kwk, 1);
        this.f3593b = (kwk) dzi.m1746a(kwk2, 2);
        this.f3594c = (kwk) dzi.m1746a(kwk3, 3);
        this.f3595d = (kwk) dzi.m1746a(kwk4, 4);
    }

    /* renamed from: a */
    private static Object m1746a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }

    /* renamed from: a */
    public final dzh mo6128a(String str) {
        Resources resources = (Resources) dzi.m1746a((Resources) this.f3592a.mo10566a(), 1);
        gos gos = (gos) dzi.m1746a((gos) this.f3593b.mo10566a(), 2);
        dzi.m1746a((hjf) this.f3594c.mo10566a(), 3);
        return new dzh(resources, gos, (PackageManager) dzi.m1746a((PackageManager) this.f3595d.mo10566a(), 4), (String) dzi.m1746a(str, 5));
    }
}
