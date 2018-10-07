package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;

/* compiled from: PG */
/* renamed from: cl */
public class C0650cl extends C0486sy {
    /* renamed from: a */
    private Drawable f12688a;
    /* renamed from: b */
    private final Rect f12689b;
    /* renamed from: c */
    private final Rect f12690c;
    /* renamed from: h */
    private int f12691h;
    /* renamed from: i */
    private boolean f12692i;
    /* renamed from: j */
    private boolean f12693j;

    public C0650cl(Context context) {
        this(context, null);
    }

    public C0650cl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0650cl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12689b = new Rect();
        this.f12690c = new Rect();
        this.f12691h = 119;
        this.f12692i = true;
        this.f12693j = false;
        TypedArray a = C0173cr.m1461a(context, attributeSet, C0077cn.f2373a, i, 0);
        this.f12691h = a.getInt(C0077cn.f2375c, this.f12691h);
        Drawable drawable = a.getDrawable(C0077cn.f2374b);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f12692i = a.getBoolean(C0077cn.f2376d, true);
        a.recycle();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f12688a;
        if (drawable != null) {
            if (this.f12693j) {
                this.f12693j = false;
                Rect rect = this.f12689b;
                Rect rect2 = this.f12690c;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f12692i) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f12691h, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f12688a;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f12688a;
        if (drawable != null && drawable.isStateful()) {
            this.f12688a.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f12688a;
    }

    public int getForegroundGravity() {
        return this.f12691h;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f12688a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f12693j |= z;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f12693j = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f12688a;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f12688a);
            }
            this.f12688a = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f12691h == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.f12691h != i) {
            int i2;
            if ((8388615 & i) == 0) {
                i2 = 8388611 | i;
            } else {
                i2 = i;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f12691h = i2;
            if (this.f12691h == 119 && this.f12688a != null) {
                this.f12688a.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f12688a;
    }
}
