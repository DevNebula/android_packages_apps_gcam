package p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.FilmstripView;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* renamed from: cvf */
public final class cvf {
    /* renamed from: a */
    public final FilmstripView f2996a;
    /* renamed from: b */
    public final View f2997b;
    /* renamed from: c */
    public final RectF f2998c = new RectF();
    /* renamed from: d */
    public Point f2999d;
    /* renamed from: e */
    public int f3000e;
    /* renamed from: f */
    public int f3001f;
    /* renamed from: g */
    public cre f3002g;
    /* renamed from: h */
    public err f3003h;
    /* renamed from: i */
    public int f3004i;
    /* renamed from: j */
    public ValueAnimator f3005j;
    /* renamed from: k */
    public boolean f3006k;
    /* renamed from: l */
    private ValueAnimator f3007l;
    /* renamed from: m */
    private ValueAnimator f3008m;

    public cvf(int i, View view, cre cre, FilmstripView filmstripView) {
        this.f2996a = filmstripView;
        this.f2997b = view;
        this.f3000e = i;
        this.f3002g = (cre) jri.m13404b((Object) cre);
        this.f3003h = cre.mo5692e();
        this.f2999d = hjg.m3257a(this.f3003h.mo6542h().f7695a, this.f3003h.mo6542h().f7696b, this.f3003h.mo6546l(), filmstripView.getMeasuredWidth(), filmstripView.getMeasuredHeight());
        this.f3001f = kvl.UNSET_ENUM_VALUE;
        this.f3004i = C0252go.f5799Y;
        this.f3006k = false;
        this.f2997b.setPivotX(0.0f);
        this.f2997b.setPivotY(0.0f);
    }

    /* renamed from: a */
    public final void mo5850a(float f, TimeInterpolator timeInterpolator) {
        if (this.f3008m == null) {
            this.f3008m = new ValueAnimator();
            this.f3008m.addUpdateListener(new cvi(this));
        }
        cvf.m1574a(this.f3008m, this.f2997b.getAlpha(), f, timeInterpolator);
    }

    /* renamed from: b */
    public final void mo5855b(float f, TimeInterpolator timeInterpolator) {
        if (this.f3007l == null) {
            this.f3007l = new ValueAnimator();
            this.f3007l.addUpdateListener(new cvh(this));
        }
        cvf.m1574a(this.f3007l, mo5856c(), f, timeInterpolator);
    }

    /* renamed from: a */
    public final int mo5846a() {
        return this.f3001f + (this.f2999d.x / 2);
    }

    /* renamed from: b */
    public final float mo5853b() {
        return this.f2997b.getTranslationX() / this.f2996a.f2535j;
    }

    /* renamed from: c */
    public final float mo5856c() {
        return this.f2997b.getTranslationY() / this.f2996a.f2535j;
    }

    /* renamed from: d */
    public final boolean mo5858d() {
        return this.f3002g.mo5690c() == cre.f2792c;
    }

    /* renamed from: a */
    public final void mo5852a(Rect rect, int i, float f) {
        float f2 = 0.0f;
        ValueAnimator valueAnimator = this.f3005j;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            f2 = ((Float) this.f3005j.getAnimatedValue()).floatValue();
        }
        int centerX = (int) (((f2 + ((float) (this.f3001f - i))) * f) + ((float) rect.centerX()));
        int centerY = (int) (((float) rect.centerY()) - (((float) (this.f2997b.getMeasuredHeight() / 2)) * f));
        View view = this.f2997b;
        view.layout(centerX, centerY, view.getMeasuredWidth() + centerX, this.f2997b.getMeasuredHeight() + centerY);
        this.f2997b.setScaleX(f);
        this.f2997b.setScaleY(f);
        f2 = (float) this.f2997b.getLeft();
        float top = (float) this.f2997b.getTop();
        this.f2998c.set(f2, top, (((float) this.f2997b.getMeasuredWidth()) * f) + f2, (((float) this.f2997b.getMeasuredHeight()) * f) + top);
    }

    /* renamed from: a */
    final void mo5849a(float f, float f2, float f3, int i, int i2) {
        float translationX = this.f2997b.getTranslationX();
        float f4 = f3 - 4.0f;
        mo5848a(translationX - ((f - this.f2997b.getX()) * f4), this.f2997b.getTranslationY() - ((f2 - this.f2997b.getY()) * f4), this.f2997b.getScaleX() * f3, this.f2997b.getScaleY() * f3, i, i2);
    }

    /* renamed from: e */
    public final void mo5859e() {
        this.f2996a.removeView(this.f2997b);
        this.f3003h.mo6529a(this.f2997b);
        FilmstripView filmstripView = this.f2996a;
        View view = this.f2997b;
        bli.m896d(FilmstripView.f2524a, "recycleView");
        int intValue = ((Integer) view.getTag(R.id.mediadata_tag_viewtype)).intValue();
        if (intValue > 0) {
            Queue queue = (Queue) filmstripView.f2547v.get(intValue);
            if (queue == null) {
                queue = new ArrayDeque();
                filmstripView.f2547v.put(intValue, queue);
            }
            queue.offer(view);
        }
    }

    /* renamed from: f */
    public final void mo5860f() {
        this.f2997b.setScaleX(1.0f);
        this.f2997b.setScaleY(1.0f);
        this.f2997b.setTranslationX(0.0f);
        this.f2997b.setTranslationY(0.0f);
    }

    /* renamed from: a */
    public static void m1574a(ValueAnimator valueAnimator, float f, float f2, TimeInterpolator timeInterpolator) {
        if (f != f2) {
            valueAnimator.setInterpolator(timeInterpolator);
            valueAnimator.setDuration(400);
            valueAnimator.setFloatValues(new float[]{f, f2});
            valueAnimator.start();
        }
    }

    /* renamed from: a */
    public final void mo5847a(float f) {
        if (!this.f3006k) {
            this.f2997b.setAlpha(f);
        }
    }

    /* renamed from: b */
    public final void mo5854b(float f) {
        this.f2997b.setTranslationX(this.f2996a.f2535j * f);
    }

    /* renamed from: c */
    public final void mo5857c(float f) {
        this.f2997b.setTranslationY(this.f2996a.f2535j * f);
    }

    /* renamed from: a */
    public final void mo5851a(int i) {
        this.f2997b.setVisibility(i);
    }

    public final String toString() {
        int i = this.f3000e;
        int i2 = this.f3001f;
        String valueOf = String.valueOf(this.f2998c);
        int a = mo5846a();
        int measuredWidth = this.f2997b.getMeasuredWidth();
        int measuredHeight = this.f2997b.getMeasuredHeight();
        int width = this.f2997b.getWidth();
        int height = this.f2997b.getHeight();
        float scaleX = this.f2997b.getScaleX();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 200);
        stringBuilder.append("AdapterIndex = ");
        stringBuilder.append(i);
        stringBuilder.append("\n\t left = ");
        stringBuilder.append(i2);
        stringBuilder.append("\n\t viewArea = ");
        stringBuilder.append(valueOf);
        stringBuilder.append("\n\t centerX = ");
        stringBuilder.append(a);
        stringBuilder.append("\n\t view MeasuredSize = ");
        stringBuilder.append(measuredWidth);
        stringBuilder.append(',');
        stringBuilder.append(measuredHeight);
        stringBuilder.append("\n\t view Size = ");
        stringBuilder.append(width);
        stringBuilder.append(',');
        stringBuilder.append(height);
        stringBuilder.append("\n\t view scale = ");
        stringBuilder.append(scaleX);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    final void mo5848a(float f, float f2, float f3, float f4, int i, int i2) {
        float left = ((float) this.f2997b.getLeft()) + f;
        float top = ((float) this.f2997b.getTop()) + f2;
        RectF a = hfu.m3162a(new RectF(left, top, (((float) this.f2997b.getWidth()) * f3) + left, (((float) this.f2997b.getHeight()) * f4) + top), i, i2);
        this.f2997b.setScaleX(f3);
        this.f2997b.setScaleY(f4);
        top = a.left;
        int left2 = this.f2997b.getLeft();
        left = a.top;
        int top2 = this.f2997b.getTop();
        this.f2997b.setTranslationX(top - ((float) left2));
        this.f2997b.setTranslationY(left - ((float) top2));
    }
}
