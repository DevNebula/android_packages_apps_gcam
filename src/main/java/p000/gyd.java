package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: PG */
/* renamed from: gyd */
public class gyd {
    /* renamed from: a */
    public int f6154a;
    /* renamed from: b */
    public boolean f6155b;
    /* renamed from: c */
    public final Paint f6156c;

    public gyd(Paint paint) {
        this.f6156c = paint;
    }

    public gyd(Paint paint, byte b) {
        this(paint);
    }

    /* renamed from: a */
    public void mo7538a(Canvas canvas, RectF rectF) {
        if (!this.f6155b) {
            float f = (float) this.f6154a;
            Canvas canvas2 = canvas;
            canvas2.drawLine(rectF.left, rectF.top + f, rectF.right, f + rectF.top, this.f6156c);
        }
    }

    /* renamed from: a */
    public final void mo7537a(int i) {
        this.f6156c.setAlpha(i);
    }
}
