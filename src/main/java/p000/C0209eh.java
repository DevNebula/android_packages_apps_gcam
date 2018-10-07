package p000;

import android.graphics.PointF;
import android.util.Property;

/* compiled from: PG */
/* renamed from: eh */
final class C0209eh extends Property {
    C0209eh(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        C0214en c0214en = (C0214en) obj;
        PointF pointF = (PointF) obj2;
        c0214en.f4200c = Math.round(pointF.x);
        c0214en.f4201d = Math.round(pointF.y);
        c0214en.f4203f++;
        if (c0214en.f4202e == c0214en.f4203f) {
            c0214en.mo6347a();
        }
    }
}
