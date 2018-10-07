package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.optionsbar.view.ViewMagnet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: fzz */
public final class fzz {
    /* renamed from: a */
    public final ShapeDrawable f5166a;
    /* renamed from: b */
    public final gbt f5167b;
    /* renamed from: c */
    public final Animator f5168c;
    /* renamed from: d */
    public final Animator f5169d;
    /* renamed from: e */
    public final ViewMagnet f5170e;
    /* renamed from: f */
    private final ViewGroup f5171f;
    /* renamed from: g */
    private final int f5172g;
    /* renamed from: h */
    private final float f5173h;

    public fzz(ViewGroup viewGroup, View view, ViewMagnet viewMagnet) {
        this.f5171f = viewGroup;
        this.f5170e = viewMagnet;
        this.f5168c = fzz.m2495b(viewGroup);
        this.f5169d = fzz.m2493a(viewGroup);
        Resources resources = view.getResources();
        this.f5173h = resources.getDimension(R.dimen.max_options_translation_distance);
        this.f5172g = resources.getColor(R.color.optionsbar_background_opened, null);
        this.f5167b = new gbt((int) resources.getDimension(R.dimen.optionsbar_bubble_initial_size), view);
        Shape shape = this.f5167b;
        this.f5166a = new ShapeDrawable(shape);
        this.f5166a.getPaint().setColor(this.f5172g);
        view.setBackground(this.f5166a);
    }

    /* renamed from: a */
    public final ValueAnimator mo6981a(View view, boolean z) {
        ValueAnimator ofFloat;
        this.f5167b.f5273a = view;
        if (z) {
            ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        } else {
            ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        }
        ofFloat.setDuration(267).setInterpolator(new C0704ks());
        ofFloat.addUpdateListener(new gae(this));
        if (z) {
            ofFloat.addListener(new gaf(this));
        } else {
            ofFloat.addListener(new gag(this));
        }
        return ofFloat;
    }

    /* renamed from: a */
    private final void m2494a(boolean z, int i, List list, float f, View view, gak gak) {
        ValueAnimator duration;
        float f2 = (((float) (fzz.m2496c(view).x - i)) / f) * this.f5173h;
        if (z) {
            duration = ValueAnimator.ofFloat(new float[]{0.0f, f2}).setDuration(267);
        } else {
            duration = ValueAnimator.ofFloat(new float[]{f2, 0.0f}).setDuration(267);
        }
        duration.setInterpolator(new C0704ks());
        duration.addUpdateListener(new gad(gak));
        list.add(duration);
    }

    /* renamed from: b */
    public final Animator mo6982b(View view, boolean z) {
        float f;
        int i = fzz.m2496c(view).x;
        Collection arrayList = new ArrayList();
        if (i > this.f5171f.getWidth() / 2) {
            f = (float) i;
        } else {
            f = (float) (this.f5171f.getWidth() - i);
        }
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < this.f5171f.getChildCount()) {
                View childAt = this.f5171f.getChildAt(i3);
                if (childAt != view) {
                    m2494a(z, i, arrayList, f, childAt, new gaa(childAt));
                }
                i2 = i3 + 1;
            } else {
                gak gac = new gac(this);
                m2494a(z, i, arrayList, f, this.f5170e.getMagnetView(), gac);
                Animator animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                return animatorSet;
            }
        }
    }

    /* renamed from: a */
    public static ValueAnimator m2493a(View view) {
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(100);
        duration.setInterpolator(new C0704ks());
        duration.addUpdateListener(new gah(view));
        duration.addListener(new gai(view));
        return duration;
    }

    /* renamed from: b */
    public static ValueAnimator m2495b(View view) {
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f}).setDuration(100);
        duration.setInterpolator(new C0704ks());
        duration.addUpdateListener(new gaj(view));
        duration.addListener(new gab(view));
        return duration;
    }

    /* renamed from: c */
    private static Point m2496c(View view) {
        int top = view.getTop();
        int paddingTop = view.getPaddingTop();
        int width = view.getWidth();
        int paddingRight = view.getPaddingRight();
        int paddingLeft = view.getPaddingLeft();
        return new Point((((width - paddingRight) - paddingLeft) / 2) + (view.getLeft() + view.getPaddingLeft()), (top + paddingTop) + (((view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop()) / 2));
    }
}
