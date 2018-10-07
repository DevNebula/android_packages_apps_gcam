package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: cu */
public final class C0665cu extends C0384nk {
    /* renamed from: e */
    private static final double f13264e = Math.cos(Math.toRadians(45.0d));
    /* renamed from: a */
    public float f13265a;
    /* renamed from: b */
    public boolean f13266b = true;
    /* renamed from: c */
    public float f13267c;
    /* renamed from: f */
    private final Paint f13268f;
    /* renamed from: g */
    private final Paint f13269g;
    /* renamed from: h */
    private final RectF f13270h;
    /* renamed from: i */
    private float f13271i;
    /* renamed from: j */
    private Path f13272j;
    /* renamed from: k */
    private float f13273k;
    /* renamed from: l */
    private float f13274l;
    /* renamed from: m */
    private boolean f13275m = true;
    /* renamed from: n */
    private final int f13276n;
    /* renamed from: o */
    private final int f13277o;
    /* renamed from: p */
    private final int f13278p;
    /* renamed from: q */
    private boolean f13279q = false;

    public C0665cu(Context context, Drawable drawable, float f, float f2, float f3) {
        super(drawable);
        this.f13276n = C0242ge.getColor(context, R.color.design_fab_shadow_start_color);
        this.f13277o = C0242ge.getColor(context, R.color.design_fab_shadow_mid_color);
        this.f13278p = C0242ge.getColor(context, R.color.design_fab_shadow_end_color);
        this.f13268f = new Paint(5);
        this.f13268f.setStyle(Style.FILL);
        this.f13271i = (float) Math.round(f);
        this.f13270h = new RectF();
        this.f13269g = new Paint(this.f13268f);
        this.f13269g.setAntiAlias(false);
        mo12909a(f2, f3);
    }

    /* renamed from: a */
    public static float m8871a(float f, float f2, boolean z) {
        if (z) {
            return (float) (((double) f) + ((1.0d - f13264e) * ((double) f2)));
        }
        return f;
    }

    /* renamed from: b */
    public static float m8872b(float f, float f2, boolean z) {
        if (z) {
            return (float) (((double) (1.5f * f)) + ((1.0d - f13264e) * ((double) f2)));
        }
        return 1.5f * f;
    }

    public final void draw(Canvas canvas) {
        float f;
        float f2;
        if (this.f13275m) {
            Rect bounds = getBounds();
            float f3 = this.f13273k;
            f = 1.5f * f3;
            this.f13270h.set(((float) bounds.left) + f3, ((float) bounds.top) + f, ((float) bounds.right) - f3, ((float) bounds.bottom) - f);
            Drawable drawable = this.f9433d;
            RectF rectF = this.f13270h;
            drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            f2 = this.f13271i;
            f3 = -f2;
            RectF rectF2 = new RectF(f3, f3, f2, f2);
            RectF rectF3 = new RectF(rectF2);
            f2 = -this.f13274l;
            rectF3.inset(f2, f2);
            Path path = this.f13272j;
            if (path == null) {
                this.f13272j = new Path();
            } else {
                path.reset();
            }
            this.f13272j.setFillType(FillType.EVEN_ODD);
            this.f13272j.moveTo(-this.f13271i, 0.0f);
            this.f13272j.rLineTo(-this.f13274l, 0.0f);
            this.f13272j.arcTo(rectF3, 180.0f, 90.0f, false);
            this.f13272j.arcTo(rectF2, 270.0f, -90.0f, false);
            this.f13272j.close();
            float f4 = -rectF3.top;
            if (f4 > 0.0f) {
                f3 = this.f13271i / f4;
                this.f13268f.setShader(new RadialGradient(0.0f, 0.0f, f4, new int[]{0, this.f13276n, this.f13277o, this.f13278p}, new float[]{0.0f, f3, f3 + ((1.0f - f3) / 2.0f), 1.0f}, TileMode.CLAMP));
            }
            this.f13269g.setShader(new LinearGradient(0.0f, rectF2.top, 0.0f, rectF3.top, new int[]{this.f13276n, this.f13277o, this.f13278p}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP));
            this.f13269g.setAntiAlias(false);
            this.f13275m = false;
        }
        int save = canvas.save();
        canvas.rotate(this.f13267c, this.f13270h.centerX(), this.f13270h.centerY());
        float f5 = this.f13271i;
        f = (-f5) - this.f13274l;
        float f6 = f5 + f5;
        float width = this.f13270h.width() - f6;
        float height = this.f13270h.height() - f6;
        f2 = this.f13265a;
        float f7 = f5 / ((f2 - (0.5f * f2)) + f5);
        float f8 = f5 / ((f2 - (0.25f * f2)) + f5);
        float f9 = f5 / (0.0f + f5);
        int save2 = canvas.save();
        RectF rectF4 = this.f13270h;
        canvas.translate(rectF4.left + f5, rectF4.top + f5);
        canvas.scale(f7, f8);
        canvas.drawPath(this.f13272j, this.f13268f);
        if (width > 0.0f) {
            canvas.scale(1.0f / f7, 1.0f);
            canvas.drawRect(0.0f, f, this.f13270h.width() - f6, -this.f13271i, this.f13269g);
        }
        canvas.restoreToCount(save2);
        save2 = canvas.save();
        rectF4 = this.f13270h;
        canvas.translate(rectF4.right - f5, rectF4.bottom - f5);
        canvas.scale(f7, f9);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f13272j, this.f13268f);
        if (width > 0.0f) {
            canvas.scale(1.0f / f7, 1.0f);
            Canvas canvas2 = canvas;
            canvas2.drawRect(0.0f, f, this.f13270h.width() - f6, this.f13274l + (-this.f13271i), this.f13269g);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        rectF4 = this.f13270h;
        canvas.translate(rectF4.left + f5, rectF4.bottom - f5);
        canvas.scale(f7, f9);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f13272j, this.f13268f);
        if (height > 0.0f) {
            canvas.scale(1.0f / f9, 1.0f);
            canvas.drawRect(0.0f, f, this.f13270h.height() - f6, -this.f13271i, this.f13269g);
        }
        canvas.restoreToCount(save3);
        save3 = canvas.save();
        rectF4 = this.f13270h;
        canvas.translate(rectF4.right - f5, rectF4.top + f5);
        canvas.scale(f7, f8);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f13272j, this.f13268f);
        if (height > 0.0f) {
            canvas.scale(1.0f / f8, 1.0f);
            canvas.drawRect(0.0f, f, this.f13270h.height() - f6, -this.f13271i, this.f13269g);
        }
        canvas.restoreToCount(save3);
        canvas.restoreToCount(save);
        super.draw(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) C0665cu.m8872b(this.f13273k, this.f13271i, this.f13266b));
        int ceil2 = (int) Math.ceil((double) C0665cu.m8871a(this.f13273k, this.f13271i, this.f13266b));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    protected final void onBoundsChange(Rect rect) {
        this.f13275m = true;
    }

    public final void setAlpha(int i) {
        super.setAlpha(i);
        this.f13268f.setAlpha(i);
        this.f13269g.setAlpha(i);
    }

    /* renamed from: a */
    public final void mo12908a(float f) {
        mo12909a(f, this.f13273k);
    }

    /* renamed from: a */
    public final void mo12909a(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float b = (float) C0665cu.m8873b(f);
        float b2 = (float) C0665cu.m8873b(f2);
        if (b > b2) {
            if (this.f13279q) {
                b = b2;
            } else {
                this.f13279q = true;
                b = b2;
            }
        }
        if (this.f13265a != b || this.f13273k != b2) {
            this.f13265a = b;
            this.f13273k = b2;
            this.f13274l = (float) Math.round(b * 1.5f);
            this.f13275m = true;
            invalidateSelf();
        }
    }

    /* renamed from: b */
    private static int m8873b(float f) {
        int round = Math.round(f);
        return round % 2 == 1 ? round - 1 : round;
    }
}
