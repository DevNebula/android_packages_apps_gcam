package p000;

import android.graphics.PointF;
import android.util.Property;

/* compiled from: PG */
/* renamed from: eg */
final class C0208eg extends Property {
    C0208eg(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        C0214en c0214en = (C0214en) obj;
        PointF pointF = (PointF) obj2;
        c0214en.f4198a = Math.round(pointF.x);
        c0214en.f4199b = Math.round(pointF.y);
        c0214en.f4202e++;
        if (c0214en.f4202e == c0214en.f4203f) {
            c0214en.mo6347a();
        }
    }
}
