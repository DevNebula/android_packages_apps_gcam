package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: ci */
public class C0075ci extends Drawable {
    /* renamed from: a */
    public final Paint f2196a = new Paint(1);
    /* renamed from: b */
    public final Rect f2197b = new Rect();
    /* renamed from: c */
    public float f2198c;
    /* renamed from: d */
    public int f2199d;
    /* renamed from: e */
    public int f2200e;
    /* renamed from: f */
    public int f2201f;
    /* renamed from: g */
    public int f2202g;
    /* renamed from: h */
    public boolean f2203h = true;
    /* renamed from: i */
    public float f2204i;
    /* renamed from: j */
    private final RectF f2205j = new RectF();
    /* renamed from: k */
    private ColorStateList f2206k;
    /* renamed from: l */
    private int f2207l;

    public C0075ci() {
        this.f2196a.setStyle(Style.STROKE);
    }

    public void draw(Canvas canvas) {
        float height;
        if (this.f2203h) {
            Paint paint = this.f2196a;
            Rect rect = this.f2197b;
            copyBounds(rect);
            height = this.f2198c / ((float) rect.height());
            float f = 0.0f;
            paint.setShader(new LinearGradient(0.0f, (float) rect.top, f, (float) rect.bottom, new int[]{C0258gu.m2881a(this.f2199d, this.f2207l), C0258gu.m2881a(this.f2200e, this.f2207l), C0258gu.m2881a(C0258gu.m2883b(this.f2200e, 0), this.f2207l), C0258gu.m2881a(C0258gu.m2883b(this.f2202g, 0), this.f2207l), C0258gu.m2881a(this.f2202g, this.f2207l), C0258gu.m2881a(this.f2201f, this.f2207l)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, TileMode.CLAMP));
            this.f2203h = false;
        }
        height = this.f2196a.getStrokeWidth() / 2.0f;
        RectF rectF = this.f2205j;
        copyBounds(this.f2197b);
        rectF.set(this.f2197b);
        rectF.left += height;
        rectF.top += height;
        rectF.right -= height;
        rectF.bottom -= height;
        canvas.save();
        canvas.rotate(this.f2204i, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, this.f2196a);
        canvas.restore();
    }

    public int getOpacity() {
        return this.f2198c > 0.0f ? -3 : -2;
    }

    public boolean getPadding(Rect rect) {
        int round = Math.round(this.f2198c);
        rect.set(round, round, round, round);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f2206k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    protected void onBoundsChange(Rect rect) {
        this.f2203h = true;
    }

    protected boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f2206k;
        if (colorStateList != null) {
            int colorForState = colorStateList.getColorForState(iArr, this.f2207l);
            if (colorForState != this.f2207l) {
                this.f2203h = true;
                this.f2207l = colorForState;
            }
        }
        if (this.f2203h) {
            invalidateSelf();
        }
        return this.f2203h;
    }

    public void setAlpha(int i) {
        this.f2196a.setAlpha(i);
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo2316a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f2207l = colorStateList.getColorForState(getState(), this.f2207l);
        }
        this.f2206k = colorStateList;
        this.f2203h = true;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2196a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
