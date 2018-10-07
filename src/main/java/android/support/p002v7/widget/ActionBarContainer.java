package android.support.p002v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.google.android.GoogleCamera.R;
import p000.C0315jm;
import p000.C0382ni;
import p000.C0418pr;
import p000.kvl;

/* compiled from: PG */
/* renamed from: android.support.v7.widget.ActionBarContainer */
public class ActionBarContainer extends FrameLayout {
    /* renamed from: a */
    public View f635a;
    /* renamed from: b */
    public Drawable f636b;
    /* renamed from: c */
    public Drawable f637c;
    /* renamed from: d */
    public Drawable f638d;
    /* renamed from: e */
    public boolean f639e;
    /* renamed from: f */
    public boolean f640f;
    /* renamed from: g */
    private boolean f641g;
    /* renamed from: h */
    private View f642h;
    /* renamed from: i */
    private View f643i;
    /* renamed from: j */
    private int f644j;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        boolean z = true;
        super(context, attributeSet);
        C0315jm.m4614a((View) this, new C0418pr(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0382ni.f9267a);
        this.f636b = obtainStyledAttributes.getDrawable(C0382ni.f9410d);
        this.f637c = obtainStyledAttributes.getDrawable(C0382ni.f9412f);
        this.f644j = obtainStyledAttributes.getDimensionPixelSize(C0382ni.f9418l, -1);
        if (getId() == R.id.split_action_bar) {
            this.f639e = true;
            this.f638d = obtainStyledAttributes.getDrawable(C0382ni.f9411e);
        }
        obtainStyledAttributes.recycle();
        if (this.f639e) {
            if (this.f638d != null) {
                z = false;
            }
        } else if (this.f636b != null) {
            z = false;
        } else if (this.f637c != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f636b;
        if (drawable != null && drawable.isStateful()) {
            this.f636b.setState(getDrawableState());
        }
        drawable = this.f637c;
        if (drawable != null && drawable.isStateful()) {
            this.f637c.setState(getDrawableState());
        }
        drawable = this.f638d;
        if (drawable != null && drawable.isStateful()) {
            this.f638d.setState(getDrawableState());
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f636b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        drawable = this.f637c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        drawable = this.f638d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f642h = findViewById(R.id.action_bar);
        this.f643i = findViewById(R.id.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f641g || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = true;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f639e) {
            Drawable drawable = this.f638d;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f636b == null) {
                z2 = false;
            } else if (this.f642h.getVisibility() == 0) {
                this.f636b.setBounds(this.f642h.getLeft(), this.f642h.getTop(), this.f642h.getRight(), this.f642h.getBottom());
            } else {
                View view = this.f643i;
                if (view == null || view.getVisibility() != 0) {
                    this.f636b.setBounds(0, 0, 0, 0);
                } else {
                    this.f636b.setBounds(this.f643i.getLeft(), this.f643i.getTop(), this.f643i.getRight(), this.f643i.getBottom());
                }
            }
            this.f640f = false;
        }
        if (z2) {
            invalidate();
        }
    }

    public void onMeasure(int i, int i2) {
        if (this.f642h == null && MeasureSpec.getMode(i2) == kvl.UNSET_ENUM_VALUE) {
            int i3 = this.f644j;
            if (i3 >= 0) {
                i2 = MeasureSpec.makeMeasureSpec(Math.min(i3, MeasureSpec.getSize(i2)), kvl.UNSET_ENUM_VALUE);
            }
        }
        super.onMeasure(i, i2);
        if (this.f642h != null) {
            MeasureSpec.getMode(i2);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    /* renamed from: a */
    public final void mo1088a(boolean z) {
        int i;
        this.f641g = z;
        if (z) {
            i = 393216;
        } else {
            i = 262144;
        }
        setDescendantFocusability(i);
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f636b;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        drawable = this.f637c;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        drawable = this.f638d;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, Callback callback, int i) {
        return i != 0 ? super.startActionModeForChild(view, callback, i) : null;
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f636b && !this.f639e) || ((drawable == this.f637c && this.f640f) || ((drawable == this.f638d && this.f639e) || super.verifyDrawable(drawable)));
    }
}
