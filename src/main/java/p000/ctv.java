package p000;

import android.annotation.TargetApi;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.SizeF;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: ctv */
public final class ctv {
    /* renamed from: a */
    public float f2926a;
    /* renamed from: b */
    public float f2927b;
    /* renamed from: c */
    public PointF f2928c;
    /* renamed from: d */
    public PointF f2929d;
    /* renamed from: e */
    public float f2930e;
    /* renamed from: f */
    public float f2931f;
    /* renamed from: g */
    public float f2932g;
    /* renamed from: h */
    private float f2933h;

    public ctv(SizeF sizeF, RectF rectF, RectF rectF2, RectF rectF3, float f) {
        if (!rectF.contains(rectF2)) {
            bli.m891b("FilmstripTransitionTransformBuilder", "Expected that the photos target area is contained in the camera window area.");
        }
        RectF rectF4 = new RectF(rectF2);
        rectF4.intersect(rectF);
        SizeF sizeF2 = new SizeF(rectF4.width(), rectF4.height());
        PointF pointF = new PointF(rectF4.left - rectF.left, rectF4.top - rectF.top);
        float width = sizeF.getWidth();
        float height = sizeF.getHeight();
        float width2 = sizeF2.getWidth();
        float height2 = sizeF2.getHeight();
        if (width / height > width2 / height2) {
            width = width2 / width;
        } else {
            width = height2 / height;
        }
        this.f2926a = width;
        width = sizeF.getWidth();
        height = sizeF.getHeight();
        if (width < height) {
            width = f / width;
        } else {
            width = f / height;
        }
        this.f2927b = width;
        float f2 = this.f2926a;
        float width3 = sizeF.getWidth();
        float height3 = sizeF.getHeight();
        height2 = sizeF2.getWidth();
        float height4 = sizeF2.getHeight();
        float f3 = height2 / height4;
        float f4 = width3 / height3;
        if (f4 > f3) {
            height = height2 / f4;
            width2 = height2;
        } else {
            height = height4;
            width2 = height4 * f4;
        }
        if (f4 > f3) {
            width = (height4 - height) / 2.0f;
            height4 = 0.0f;
        } else {
            height4 = (height2 - width2) / 2.0f;
            width = 0.0f;
        }
        height4 += pointF.x;
        width += pointF.y;
        if (f2 != 1.0f) {
            height4 += (width2 - width3) / 2.0f;
            width += (height - height3) / 2.0f;
        }
        this.f2928c = new PointF(height4, width);
        height = this.f2927b;
        width2 = sizeF.getWidth();
        height2 = sizeF.getHeight();
        width = rectF3.left;
        f2 = (rectF3.width() - f) / 2.0f;
        height4 = width + f2;
        width = rectF3.top + f2;
        if (height != 1.0f) {
            height4 += (f - width2) / 2.0f;
            width += (f - height2) / 2.0f;
        }
        this.f2929d = new PointF(height4, width);
        width = sizeF.getWidth() / 2.0f;
        height4 = sizeF.getHeight() / 2.0f;
        this.f2933h = (float) Math.sqrt((double) ((width * width) + (height4 * height4)));
        this.f2930e = Math.min(sizeF.getWidth() / 2.0f, sizeF.getHeight() / 2.0f);
        this.f2931f = 1.0f;
        this.f2932g = 0.0f;
    }

    /* renamed from: a */
    public final ctu mo5815a() {
        return new ctu(this.f2926a, this.f2927b, this.f2928c, this.f2929d, this.f2933h, this.f2930e, this.f2931f, this.f2932g);
    }
}
