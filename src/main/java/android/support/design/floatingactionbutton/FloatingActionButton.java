package android.support.design.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.appbar.AppBarLayout;
import android.support.design.bottomsheet.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.ImageView.ScaleType;
import com.google.android.GoogleCamera.R;
import java.util.List;
import p000.C0050av;
import p000.C0065bt;
import p000.C0066bu;
import p000.C0067bv;
import p000.C0068bw;
import p000.C0069bx;
import p000.C0074cg;
import p000.C0075ci;
import p000.C0076ck;
import p000.C0173cr;
import p000.C0174cs;
import p000.C0176cv;
import p000.C0186df;
import p000.C0189dj;
import p000.C0190dk;
import p000.C0192dm;
import p000.C0301iz;
import p000.C0315jm;
import p000.C0441qw;
import p000.C0647ce;
import p000.C0667dg;
import p000.kvl;

@C0190dk(a = Behavior.class)
/* compiled from: PG */
public class FloatingActionButton extends C0174cs {
    /* renamed from: a */
    public int f10446a;
    /* renamed from: b */
    public boolean f10447b;
    /* renamed from: c */
    public final Rect f10448c;
    /* renamed from: e */
    private ColorStateList f10449e;
    /* renamed from: f */
    private Mode f10450f;
    /* renamed from: g */
    private int f10451g;
    /* renamed from: h */
    private ColorStateList f10452h;
    /* renamed from: i */
    private int f10453i;
    /* renamed from: j */
    private int f10454j;
    /* renamed from: k */
    private int f10455k;
    /* renamed from: l */
    private final Rect f10456l;
    /* renamed from: m */
    private final C0441qw f10457m;
    /* renamed from: n */
    private final C0065bt f10458n;
    /* renamed from: o */
    private C0066bu f10459o;

    /* compiled from: PG */
    public class BaseBehavior extends C0189dj {
        /* renamed from: a */
        private Rect f10444a;
        /* renamed from: b */
        private boolean f10445b;

        public BaseBehavior() {
            this.f10445b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0074cg.f2116b);
            this.f10445b = obtainStyledAttributes.getBoolean(C0074cg.f2117c, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private static boolean m6762a(View view) {
            LayoutParams layoutParams = view.getLayoutParams();
            return layoutParams instanceof C0192dm ? ((C0192dm) layoutParams).f3337a instanceof BottomSheetBehavior : false;
        }

        /* renamed from: a */
        public final void mo5978a(C0192dm c0192dm) {
            if (c0192dm.f3344h == 0) {
                c0192dm.f3344h = 80;
            }
        }

        /* renamed from: a */
        private final boolean m6761a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            int i2;
            int i3 = 0;
            List a = coordinatorLayout.mo11685a((View) floatingActionButton);
            int size = a.size();
            for (i2 = 0; i2 < size; i2++) {
                View view = (View) a.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m6762a(view) && m6764b(view, floatingActionButton)) {
                        break;
                    }
                }
                m6760a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
            }
            coordinatorLayout.mo11687a((View) floatingActionButton, i);
            Rect rect = floatingActionButton.f10448c;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                C0192dm c0192dm = (C0192dm) floatingActionButton.getLayoutParams();
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - c0192dm.rightMargin) {
                    i2 = rect.right;
                } else if (floatingActionButton.getLeft() > c0192dm.leftMargin) {
                    i2 = 0;
                } else {
                    i2 = -rect.left;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - c0192dm.bottomMargin) {
                    i3 = rect.bottom;
                } else if (floatingActionButton.getTop() <= c0192dm.topMargin) {
                    i3 = -rect.top;
                }
                if (i3 != 0) {
                    C0315jm.m4624b((View) floatingActionButton, i3);
                }
                if (i2 != 0) {
                    C0315jm.m4609a((View) floatingActionButton, i2);
                }
            }
            return true;
        }

        /* renamed from: a */
        private final boolean m6763a(View view, FloatingActionButton floatingActionButton) {
            C0192dm c0192dm = (C0192dm) floatingActionButton.getLayoutParams();
            if (!this.f10445b) {
                return false;
            }
            if (c0192dm.f3342f != view.getId()) {
                return false;
            }
            if (floatingActionButton.f2839d != 0) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private final boolean m6760a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m6763a((View) appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f10444a == null) {
                this.f10444a = new Rect();
            }
            Rect rect = this.f10444a;
            C0076ck.m1191a((ViewGroup) coordinatorLayout, (View) appBarLayout, rect);
            int i = rect.bottom;
            throw new NoSuchMethodError();
        }

        /* renamed from: b */
        private final boolean m6764b(View view, FloatingActionButton floatingActionButton) {
            if (!m6763a(view, floatingActionButton)) {
                return false;
            }
            C0066bu a;
            boolean z;
            Animator animator;
            C0050av c0050av;
            AnimatorSet a2;
            if (view.getTop() >= ((C0192dm) floatingActionButton.getLayoutParams()).topMargin + (floatingActionButton.getHeight() / 2)) {
                a = floatingActionButton.mo11661a();
                if (a.f1620x.getVisibility() != 0) {
                    if (a.f1604b == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (a.f1604b != 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    animator = a.f1605c;
                    if (animator != null) {
                        animator.cancel();
                    }
                    if (a.mo2143f()) {
                        if (a.f1620x.getVisibility() != 0) {
                            a.f1620x.setAlpha(0.0f);
                            a.f1620x.setScaleY(0.0f);
                            a.f1620x.setScaleX(0.0f);
                            a.mo2133a(0.0f);
                        }
                        c0050av = a.f1606d;
                        if (c0050av == null) {
                            if (a.f1608f == null) {
                                a.f1608f = C0050av.m726a(a.f1620x.getContext(), R.animator.design_fab_show_motion_spec);
                            }
                            c0050av = a.f1608f;
                        }
                        a2 = a.mo2130a(c0050av, 1.0f, 1.0f, 1.0f);
                        a2.addListener(new C0068bw(a, null));
                        a2.start();
                    } else {
                        a.f1620x.mo5718a(0, false);
                        a.f1620x.setAlpha(1.0f);
                        a.f1620x.setScaleY(1.0f);
                        a.f1620x.setScaleX(1.0f);
                        a.mo2133a(1.0f);
                        if (null != null) {
                            C0186df.m1659c();
                        }
                    }
                }
            } else {
                a = floatingActionButton.mo11661a();
                if (a.f1620x.getVisibility() == 0) {
                    if (a.f1604b == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (a.f1604b != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    animator = a.f1605c;
                    if (animator != null) {
                        animator.cancel();
                    }
                    if (a.mo2143f()) {
                        c0050av = a.f1607e;
                        if (c0050av == null) {
                            if (a.f1609g == null) {
                                a.f1609g = C0050av.m726a(a.f1620x.getContext(), R.animator.design_fab_hide_motion_spec);
                            }
                            c0050av = a.f1609g;
                        }
                        a2 = a.mo2130a(c0050av, 0.0f, 0.0f, 0.0f);
                        a2.addListener(new C0067bv(a, null));
                        a2.start();
                    } else {
                        a.f1620x.mo5718a(4, false);
                        if (null != null) {
                            C0186df.m1657b();
                        }
                    }
                }
            }
            return true;
        }
    }

    /* compiled from: PG */
    public class Behavior extends BaseBehavior {
        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10448c = new Rect();
        this.f10456l = new Rect();
        TypedArray a = C0173cr.m1461a(context, attributeSet, C0074cg.f2115a, i, R.style.Widget.Design.FloatingActionButton);
        this.f10449e = C0186df.m1640a(context, a, C0074cg.f2118d);
        this.f10450f = C0186df.m1641a(a.getInt(C0074cg.f2119e, -1), null);
        this.f10452h = C0186df.m1640a(context, a, C0074cg.f2124j);
        this.f10453i = a.getInt(C0074cg.f2122h, -1);
        this.f10454j = a.getDimensionPixelSize(C0074cg.f2121g, 0);
        this.f10451g = a.getDimensionPixelSize(C0074cg.f2120f, 0);
        float dimension = a.getDimension(3, 0.0f);
        float dimension2 = a.getDimension(6, 0.0f);
        float dimension3 = a.getDimension(7, 0.0f);
        this.f10447b = a.getBoolean(C0074cg.f2125k, false);
        this.f10455k = a.getDimensionPixelSize(C0074cg.f2123i, 0);
        C0050av a2 = C0050av.m727a(context, a, 2);
        C0050av a3 = C0050av.m727a(context, a, 0);
        a.recycle();
        this.f10457m = new C0441qw(this);
        this.f10457m.mo10949a(attributeSet, i);
        this.f10458n = new C0065bt(this);
        mo11661a().mo2135a(this.f10449e, this.f10450f, this.f10452h, this.f10451g);
        C0066bu a4 = mo11661a();
        if (a4.f1616n != dimension) {
            a4.f1616n = dimension;
            a4.mo2134a(a4.f1616n, a4.f1617o, a4.f1618p);
        }
        a4 = mo11661a();
        if (a4.f1617o != dimension2) {
            a4.f1617o = dimension2;
            a4.mo2134a(a4.f1616n, a4.f1617o, a4.f1618p);
        }
        a4 = mo11661a();
        if (a4.f1618p != dimension3) {
            a4.f1618p = dimension3;
            a4.mo2134a(a4.f1616n, a4.f1617o, a4.f1618p);
        }
        a4 = mo11661a();
        int i2 = this.f10455k;
        if (a4.f1619q != i2) {
            a4.f1619q = i2;
            a4.mo2144g();
        }
        mo11661a().f1606d = a2;
        mo11661a().f1607e = a3;
        setScaleType(ScaleType.MATRIX);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        mo11661a().mo2137a(getDrawableState());
    }

    public ColorStateList getBackgroundTintList() {
        return this.f10449e;
    }

    public Mode getBackgroundTintMode() {
        return this.f10450f;
    }

    /* renamed from: a */
    final C0066bu mo11661a() {
        if (this.f10459o == null) {
            this.f10459o = new C0647ce(this, new C0176cv(this));
        }
        return this.f10459o;
    }

    /* renamed from: b */
    public final int mo11662b() {
        return m6769a(this.f10453i);
    }

    /* renamed from: a */
    private final int m6769a(int i) {
        int i2 = this.f10454j;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        switch (i) {
            case -1:
                if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
                    return m6769a(1);
                }
                return m6769a(0);
            case 1:
                return resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
            default:
                return resources.getDimensionPixelSize(R.dimen.design_fab_size_normal);
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        mo11661a().mo2138b();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0066bu a = mo11661a();
        if (a.mo2142e()) {
            if (a.f1622z == null) {
                a.f1622z = new C0069bx(a);
            }
            a.f1620x.getViewTreeObserver().addOnPreDrawListener(a.f1622z);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0066bu a = mo11661a();
        if (a.f1622z != null) {
            a.f1620x.getViewTreeObserver().removeOnPreDrawListener(a.f1622z);
            a.f1622z = null;
        }
    }

    protected void onMeasure(int i, int i2) {
        int b = mo11662b();
        this.f10446a = (b - this.f10455k) / 2;
        mo11661a().mo2145h();
        b = Math.min(m6770a(b, i), m6770a(b, i2));
        Rect rect = this.f10448c;
        setMeasuredDimension((rect.left + b) + rect.right, (b + rect.top) + rect.bottom);
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        boolean z = false;
        if (parcelable instanceof C0667dg) {
            C0667dg c0667dg = (C0667dg) parcelable;
            super.onRestoreInstanceState(c0667dg.f7997e);
            C0065bt c0065bt = this.f10458n;
            Bundle bundle = (Bundle) c0667dg.f13738a.get("expandableWidgetHelper");
            c0065bt.f1543b = bundle.getBoolean("expanded", false);
            c0065bt.f1544c = bundle.getInt("expandedComponentIdHint", 0);
            if (c0065bt.f1543b) {
                ViewParent parent = c0065bt.f1542a.getParent();
                if (parent instanceof CoordinatorLayout) {
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                    View view = c0065bt.f1542a;
                    List list = (List) coordinatorLayout.f10467a.f9108b.get(view);
                    if (list != null && !list.isEmpty()) {
                        while (true) {
                            boolean z2 = z;
                            if (z2 < list.size()) {
                                View view2 = (View) list.get(z2);
                                C0189dj c0189dj = ((C0192dm) view2.getLayoutParams()).f3337a;
                                if (c0189dj != null) {
                                    c0189dj.mo416a(coordinatorLayout, view2, view);
                                }
                                z = z2 + 1;
                            } else {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable c0667dg = new C0667dg(super.onSaveInstanceState());
        C0301iz c0301iz = c0667dg.f13738a;
        C0065bt c0065bt = this.f10458n;
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", c0065bt.f1543b);
        bundle.putInt("expandedComponentIdHint", c0065bt.f1544c);
        c0301iz.put("expandableWidgetHelper", bundle);
        return c0667dg;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            boolean z;
            Rect rect = this.f10456l;
            if (C0315jm.m4649x(this)) {
                rect.set(0, 0, getWidth(), getHeight());
                int i = rect.left;
                Rect rect2 = this.f10448c;
                rect.left = i + rect2.left;
                rect.top += rect2.top;
                rect.right -= rect2.right;
                rect.bottom -= rect2.bottom;
                z = true;
            } else {
                z = false;
            }
            if (z && !this.f10456l.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private static int m6770a(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        switch (mode) {
            case kvl.UNSET_ENUM_VALUE /*-2147483648*/:
                return Math.min(i, size);
            case 0:
                return i;
            case 1073741824:
                return size;
            default:
                throw new IllegalArgumentException();
        }
    }

    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f10449e != colorStateList) {
            this.f10449e = colorStateList;
            C0066bu a = mo11661a();
            Drawable drawable = a.f1612j;
            if (drawable != null) {
                drawable.setTintList(colorStateList);
            }
            C0075ci c0075ci = a.f1614l;
            if (c0075ci != null) {
                c0075ci.mo2316a(colorStateList);
            }
        }
    }

    public void setBackgroundTintMode(Mode mode) {
        if (this.f10450f != mode) {
            this.f10450f = mode;
            Drawable drawable = mo11661a().f1612j;
            if (drawable != null) {
                drawable.setTintMode(mode);
            }
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        mo11661a().mo2144g();
    }

    public void setImageResource(int i) {
        this.f10457m.mo10948a(i);
    }
}
