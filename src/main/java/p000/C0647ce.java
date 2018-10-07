package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: ce */
public final class C0647ce extends C0066bu {
    /* renamed from: A */
    private InsetDrawable f12239A;

    public C0647ce(C0174cs c0174cs, C0176cv c0176cv) {
        super(c0174cs, c0176cv);
    }

    /* renamed from: a */
    private final Animator m8153a(float f, float f2) {
        Animator animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f1620x, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f1620x, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(f1591a);
        return animatorSet;
    }

    /* renamed from: a */
    final void mo2136a(Rect rect) {
        if (this.f1621y.f2985a.f10447b) {
            float a = this.f1621y.mo5836a();
            float elevation = this.f1620x.getElevation() + this.f1618p;
            int ceil = (int) Math.ceil((double) C0665cu.m8871a(elevation, a, false));
            int ceil2 = (int) Math.ceil((double) C0665cu.m8872b(elevation, a, false));
            rect.set(ceil, ceil2, ceil, ceil2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    /* renamed from: b */
    final void mo2138b() {
    }

    /* renamed from: c */
    final C0075ci mo2140c() {
        return new C0649cj();
    }

    /* renamed from: d */
    final GradientDrawable mo2141d() {
        return new C0073cf();
    }

    /* renamed from: a */
    final void mo2137a(int[] iArr) {
    }

    /* renamed from: a */
    final void mo2134a(float f, float f2, float f3) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(f1592r, m8153a(f, f3));
        stateListAnimator.addState(f1593s, m8153a(f, f2));
        stateListAnimator.addState(f1594t, m8153a(f, f2));
        stateListAnimator.addState(f1595u, m8153a(f, f2));
        Animator animatorSet = new AnimatorSet();
        List arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f1620x, "elevation", new float[]{f}).setDuration(0));
        arrayList.add(ObjectAnimator.ofFloat(this.f1620x, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(f1591a);
        stateListAnimator.addState(f1596v, animatorSet);
        stateListAnimator.addState(f1597w, m8153a(0.0f, 0.0f));
        this.f1620x.setStateListAnimator(stateListAnimator);
        if (this.f1621y.f2985a.f10447b) {
            mo2145h();
        }
    }

    /* renamed from: b */
    final void mo2139b(Rect rect) {
        if (this.f1621y.f2985a.f10447b) {
            this.f12239A = new InsetDrawable(this.f1613k, rect.left, rect.top, rect.right, rect.bottom);
            this.f1621y.mo5837a(this.f12239A);
            return;
        }
        this.f1621y.mo5837a(this.f1613k);
    }

    /* renamed from: e */
    final boolean mo2142e() {
        return false;
    }

    /* renamed from: a */
    final void mo2135a(ColorStateList colorStateList, Mode mode, ColorStateList colorStateList2, int i) {
        Drawable layerDrawable;
        this.f1612j = mo2131a();
        this.f1612j.setTintList(colorStateList);
        if (mode != null) {
            this.f1612j.setTintMode(mode);
        }
        if (i > 0) {
            this.f1614l = mo2132a(i, colorStateList);
            layerDrawable = new LayerDrawable(new Drawable[]{this.f1614l, this.f1612j});
        } else {
            this.f1614l = null;
            layerDrawable = this.f1612j;
        }
        this.f1613k = new RippleDrawable(C0175ct.m1540a(colorStateList2), layerDrawable, null);
        this.f1615m = this.f1613k;
        this.f1621y.mo5837a(this.f1613k);
    }
}
