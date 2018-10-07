package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.support.design.floatingactionbutton.FloatingActionButton;
import android.util.StateSet;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.google.android.GoogleCamera.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: bu */
public class C0066bu {
    /* renamed from: a */
    public static final TimeInterpolator f1591a = C0047as.f957b;
    /* renamed from: r */
    public static final int[] f1592r = new int[]{16842919, 16842910};
    /* renamed from: s */
    public static final int[] f1593s = new int[]{16843623, 16842908, 16842910};
    /* renamed from: t */
    public static final int[] f1594t = new int[]{16842908, 16842910};
    /* renamed from: u */
    public static final int[] f1595u = new int[]{16843623, 16842910};
    /* renamed from: v */
    public static final int[] f1596v = new int[]{16842910};
    /* renamed from: w */
    public static final int[] f1597w = new int[0];
    /* renamed from: A */
    private final C0078co f1598A;
    /* renamed from: B */
    private float f1599B = 1.0f;
    /* renamed from: C */
    private final Rect f1600C = new Rect();
    /* renamed from: D */
    private final RectF f1601D = new RectF();
    /* renamed from: E */
    private final RectF f1602E = new RectF();
    /* renamed from: F */
    private final Matrix f1603F = new Matrix();
    /* renamed from: b */
    public int f1604b = 0;
    /* renamed from: c */
    public Animator f1605c;
    /* renamed from: d */
    public C0050av f1606d;
    /* renamed from: e */
    public C0050av f1607e;
    /* renamed from: f */
    public C0050av f1608f;
    /* renamed from: g */
    public C0050av f1609g;
    /* renamed from: h */
    public C0665cu f1610h;
    /* renamed from: i */
    public float f1611i;
    /* renamed from: j */
    public Drawable f1612j;
    /* renamed from: k */
    public Drawable f1613k;
    /* renamed from: l */
    public C0075ci f1614l;
    /* renamed from: m */
    public Drawable f1615m;
    /* renamed from: n */
    public float f1616n;
    /* renamed from: o */
    public float f1617o;
    /* renamed from: p */
    public float f1618p;
    /* renamed from: q */
    public int f1619q;
    /* renamed from: x */
    public final C0174cs f1620x;
    /* renamed from: y */
    public final C0176cv f1621y;
    /* renamed from: z */
    public OnPreDrawListener f1622z;

    C0066bu(C0174cs c0174cs, C0176cv c0176cv) {
        this.f1620x = c0174cs;
        this.f1621y = c0176cv;
        this.f1598A = new C0078co();
        this.f1598A.mo2413a(f1592r, C0066bu.m992a(new C0645ca(this)));
        this.f1598A.mo2413a(f1593s, C0066bu.m992a(new C0644bz(this)));
        this.f1598A.mo2413a(f1594t, C0066bu.m992a(new C0644bz(this)));
        this.f1598A.mo2413a(f1595u, C0066bu.m992a(new C0644bz(this)));
        this.f1598A.mo2413a(f1596v, C0066bu.m992a(new C0646cc(this)));
        this.f1598A.mo2413a(f1597w, C0066bu.m992a(new C0643by(this)));
        this.f1611i = this.f1620x.getRotation();
    }

    /* renamed from: a */
    private final void m993a(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f1620x.getDrawable();
        if (drawable != null && this.f1619q != 0) {
            RectF rectF = this.f1601D;
            RectF rectF2 = this.f1602E;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            float f2 = (float) this.f1619q;
            rectF2.set(0.0f, 0.0f, f2, f2);
            matrix.setRectToRect(rectF, rectF2, ScaleToFit.CENTER);
            f2 = ((float) this.f1619q) / 2.0f;
            matrix.postScale(f, f, f2, f2);
        }
    }

    /* renamed from: a */
    public final AnimatorSet mo2130a(C0050av c0050av, float f, float f2, float f3) {
        List arrayList = new ArrayList();
        Animator ofFloat = ObjectAnimator.ofFloat(this.f1620x, View.ALPHA, new float[]{f});
        c0050av.mo1805a("opacity").mo1810a(ofFloat);
        arrayList.add(ofFloat);
        ofFloat = ObjectAnimator.ofFloat(this.f1620x, View.SCALE_X, new float[]{f2});
        c0050av.mo1805a("scale").mo1810a(ofFloat);
        arrayList.add(ofFloat);
        ofFloat = ObjectAnimator.ofFloat(this.f1620x, View.SCALE_Y, new float[]{f2});
        c0050av.mo1805a("scale").mo1810a(ofFloat);
        arrayList.add(ofFloat);
        m993a(f3, this.f1603F);
        ofFloat = ObjectAnimator.ofObject(this.f1620x, new C0048at(), new C0049au(), new Matrix[]{new Matrix(this.f1603F)});
        c0050av.mo1805a("iconScale").mo1810a(ofFloat);
        arrayList.add(ofFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        C0186df.m1646a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: a */
    final C0075ci mo2132a(int i, ColorStateList colorStateList) {
        Context context = this.f1620x.getContext();
        C0075ci c = mo2140c();
        int color = C0242ge.getColor(context, R.color.design_fab_stroke_top_outer_color);
        int color2 = C0242ge.getColor(context, R.color.design_fab_stroke_top_inner_color);
        int color3 = C0242ge.getColor(context, R.color.design_fab_stroke_end_inner_color);
        int color4 = C0242ge.getColor(context, R.color.design_fab_stroke_end_outer_color);
        c.f2199d = color;
        c.f2200e = color2;
        c.f2201f = color3;
        c.f2202g = color4;
        float f = (float) i;
        if (c.f2198c != f) {
            c.f2198c = f;
            c.f2196a.setStrokeWidth(f * 1.3333f);
            c.f2203h = true;
            c.invalidateSelf();
        }
        c.mo2316a(colorStateList);
        return c;
    }

    /* renamed from: a */
    private static ValueAnimator m992a(C0072cd c0072cd) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f1591a);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(c0072cd);
        valueAnimator.addUpdateListener(c0072cd);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    /* renamed from: a */
    final GradientDrawable mo2131a() {
        GradientDrawable d = mo2141d();
        d.setShape(1);
        d.setColor(-1);
        return d;
    }

    /* renamed from: a */
    void mo2136a(Rect rect) {
        this.f1610h.getPadding(rect);
    }

    /* renamed from: b */
    public void mo2138b() {
        C0078co c0078co = this.f1598A;
        ValueAnimator valueAnimator = c0078co.f2407c;
        if (valueAnimator != null) {
            valueAnimator.end();
            c0078co.f2407c = null;
        }
    }

    /* renamed from: c */
    C0075ci mo2140c() {
        return new C0075ci();
    }

    /* renamed from: d */
    GradientDrawable mo2141d() {
        return new GradientDrawable();
    }

    /* renamed from: a */
    public void mo2137a(int[] iArr) {
        C0172cq c0172cq;
        C0078co c0078co = this.f1598A;
        int size = c0078co.f2405a.size();
        for (int i = 0; i < size; i++) {
            c0172cq = (C0172cq) c0078co.f2405a.get(i);
            if (StateSet.stateSetMatches(c0172cq.f2752a, iArr)) {
                break;
            }
        }
        c0172cq = null;
        C0172cq c0172cq2 = c0078co.f2406b;
        if (c0172cq != c0172cq2) {
            if (c0172cq2 != null) {
                ValueAnimator valueAnimator = c0078co.f2407c;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    c0078co.f2407c = null;
                }
            }
            c0078co.f2406b = c0172cq;
            if (c0172cq != null) {
                c0078co.f2407c = c0172cq.f2753b;
                c0078co.f2407c.start();
            }
        }
    }

    /* renamed from: a */
    public void mo2134a(float f, float f2, float f3) {
        C0665cu c0665cu = this.f1610h;
        if (c0665cu != null) {
            c0665cu.mo12909a(f, this.f1618p + f);
            mo2145h();
        }
    }

    /* renamed from: b */
    void mo2139b(Rect rect) {
    }

    /* renamed from: e */
    public boolean mo2142e() {
        return true;
    }

    /* renamed from: a */
    public void mo2135a(ColorStateList colorStateList, Mode mode, ColorStateList colorStateList2, int i) {
        Drawable[] drawableArr;
        this.f1612j = mo2131a();
        this.f1612j.setTintList(colorStateList);
        if (mode != null) {
            this.f1612j.setTintMode(mode);
        }
        this.f1613k = mo2131a();
        this.f1613k.setTintList(C0175ct.m1540a(colorStateList2));
        if (i > 0) {
            this.f1614l = mo2132a(i, colorStateList);
            drawableArr = new Drawable[]{this.f1614l, this.f1612j, this.f1613k};
        } else {
            this.f1614l = null;
            drawableArr = new Drawable[]{this.f1612j, this.f1613k};
        }
        this.f1615m = new LayerDrawable(drawableArr);
        Context context = this.f1620x.getContext();
        Drawable drawable = this.f1615m;
        float a = this.f1621y.mo5836a();
        float f = this.f1616n;
        this.f1610h = new C0665cu(context, drawable, a, f, this.f1618p + f);
        C0665cu c0665cu = this.f1610h;
        c0665cu.f13266b = false;
        c0665cu.invalidateSelf();
        this.f1621y.mo5837a(this.f1610h);
    }

    /* renamed from: a */
    public final void mo2133a(float f) {
        this.f1599B = f;
        Matrix matrix = this.f1603F;
        m993a(f, matrix);
        this.f1620x.setImageMatrix(matrix);
    }

    /* renamed from: f */
    public final boolean mo2143f() {
        return C0315jm.m4649x(this.f1620x) && !this.f1620x.isInEditMode();
    }

    /* renamed from: g */
    public final void mo2144g() {
        mo2133a(this.f1599B);
    }

    /* renamed from: h */
    public final void mo2145h() {
        Rect rect = this.f1600C;
        mo2136a(rect);
        mo2139b(rect);
        C0176cv c0176cv = this.f1621y;
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        c0176cv.f2985a.f10448c.set(i, i2, i3, i4);
        FloatingActionButton floatingActionButton = c0176cv.f2985a;
        int i5 = floatingActionButton.f10446a;
        floatingActionButton.setPadding(i + i5, i2 + i5, i3 + i5, i4 + i5);
    }
}
