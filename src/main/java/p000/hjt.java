package p000;

import android.graphics.Point;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* renamed from: hjt */
public final class hjt {
    /* renamed from: a */
    private final MotionEvent f6644a;
    /* renamed from: b */
    private final View f6645b;

    public hjt(MotionEvent motionEvent, View view) {
        this.f6644a = motionEvent;
        this.f6645b = view;
    }

    /* renamed from: a */
    public final PointF mo7913a() {
        int[] iArr = new int[2];
        this.f6645b.getLocationOnScreen(iArr);
        Point point = new Point(iArr[0], iArr[1]);
        return new PointF(this.f6644a.getRawX() - ((float) point.x), this.f6644a.getRawY() - ((float) point.y));
    }
}
