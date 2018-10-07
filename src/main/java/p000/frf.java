package p000;

import android.annotation.TargetApi;
import java.util.Collection;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: frf */
public final class frf implements fre {
    /* renamed from: a */
    private final fre f18698a;
    /* renamed from: b */
    private final Collection f18699b;

    private frf(fre fre) {
        this.f18698a = fre;
    }

    public frf(fre fre, Collection collection) {
        this(fre);
        this.f18699b = collection;
    }

    /* renamed from: b */
    public final ilp mo6873b() {
        return this.f18698a.mo6873b();
    }

    /* renamed from: a */
    public final kpk mo6872a(Object obj) {
        boolean z;
        fre fre = this.f18698a;
        obj = (gfw) obj;
        jri.m13404b(obj);
        if (obj.f5387b.mo13741c() == 35) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "Invalid image format.");
        frj a = fri.m10893a(obj.f5387b, obj.f5389d).mo6876a(this.f18699b);
        a.f4895a = obj.f5388c;
        return fre.mo6872a(a.mo6875a());
    }
}
