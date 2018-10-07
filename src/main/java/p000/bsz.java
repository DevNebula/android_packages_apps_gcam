package p000;

import android.graphics.drawable.GradientDrawable;

/* compiled from: PG */
/* renamed from: bsz */
public final class bsz {
    /* renamed from: a */
    public final GradientDrawable f1540a;
    /* renamed from: b */
    public float f1541b;

    public bsz(bsy bsy) {
        this(new GradientDrawable());
    }

    private bsz(GradientDrawable gradientDrawable) {
        this.f1540a = gradientDrawable;
        gradientDrawable.setShape(0);
    }

    /* renamed from: a */
    public final void mo2108a(float f) {
        this.f1540a.setCornerRadius(f);
    }

    /* renamed from: b */
    public final void mo2109b(float f) {
        boolean z;
        if (f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        this.f1541b = f;
    }

    /* renamed from: c */
    public final void mo2110c(float f) {
        this.f1540a.setAlpha((int) (255.0f * f));
    }

    /* renamed from: d */
    public final void mo2111d(float f) {
        this.f1540a.setStroke((int) f, -1);
    }
}
