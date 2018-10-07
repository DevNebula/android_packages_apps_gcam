package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: cyk */
final class cyk implements kaw {
    /* renamed from: a */
    private final /* synthetic */ cyd f13477a;

    cyk(cyd cyd) {
        this.f13477a = cyd;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9689a(Object obj) {
        boolean z;
        boolean z2 = false;
        obj = (List) obj;
        jri.m13404b(obj);
        if (obj.size() == 3) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        boolean booleanValue = ((Boolean) obj.get(0)).booleanValue();
        boolean booleanValue2 = ((Boolean) obj.get(1)).booleanValue();
        z = ((Boolean) obj.get(2)).booleanValue();
        if (!(booleanValue || booleanValue2 || z || this.f13477a.f25877d.mo13673b() != fxj.ON)) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}
