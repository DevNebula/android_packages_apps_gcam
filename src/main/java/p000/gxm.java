package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: PG */
/* renamed from: gxm */
public final class gxm extends gyd {
    public gxm(Paint paint) {
        super(paint);
    }

    /* renamed from: a */
    public final void mo7538a(Canvas canvas, RectF rectF) {
        if (!this.f6155b) {
            float f = (float) this.f6154a;
            Canvas canvas2 = canvas;
            canvas2.drawLine(rectF.left + f, rectF.top, f + rectF.left, rectF.bottom, this.f6156c);
        }
    }
}
