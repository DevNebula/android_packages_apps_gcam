package p000;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* renamed from: ei */
final class C0210ei extends Property {
    C0210ei(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        PointF pointF = (PointF) obj2;
        C0231fo.m2406a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
    }
}
