package p000;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* renamed from: ek */
final class C0212ek extends Property {
    C0212ek(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        PointF pointF = (PointF) obj2;
        int round = Math.round(pointF.x);
        int round2 = Math.round(pointF.y);
        C0231fo.m2406a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
    }
}
