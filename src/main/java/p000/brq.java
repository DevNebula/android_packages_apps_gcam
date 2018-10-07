package p000;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.hardware.camera2.params.Face;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: brq */
public final class brq {
    /* renamed from: a */
    public final hjm f1516a = new hjm(5);
    /* renamed from: b */
    public final hjm f1517b = new hjm(5);
    /* renamed from: c */
    public final hjm f1518c = new hjm(5);
    /* renamed from: d */
    public final Handler f1519d;
    /* renamed from: e */
    public float f1520e;
    /* renamed from: f */
    public int f1521f;
    /* renamed from: g */
    public boolean f1522g;
    /* renamed from: h */
    public ValueAnimator f1523h;
    /* renamed from: i */
    public final Runnable f1524i = new bru(this);
    /* renamed from: j */
    private final Matrix f1525j;
    /* renamed from: k */
    private ValueAnimator f1526k;

    public brq(Face face, Matrix matrix) {
        this.f1525j = matrix;
        mo2098a(face);
        this.f1526k = ValueAnimator.ofFloat(new float[]{1.0f, 1.2f});
        this.f1526k.setInterpolator(new C0704ks());
        this.f1526k.setDuration(250);
        this.f1526k.addUpdateListener(new brr(this));
        this.f1526k.addListener(new brt(this));
        this.f1523h = ValueAnimator.ofInt(new int[]{204, 0});
        this.f1523h.setInterpolator(new C0704ks());
        this.f1523h.setDuration(500);
        this.f1523h.addUpdateListener(new brs(this));
        this.f1519d = new Handler();
    }

    /* renamed from: a */
    public final void mo2097a() {
        if (!this.f1526k.isStarted()) {
            this.f1521f = 204;
            this.f1520e = this.f1518c.f6640a;
            this.f1526k.start();
            this.f1522g = true;
        }
    }

    public final String toString() {
        return String.format("ViewfinderFace: Center: %f,%f / Radius: %f", new Object[]{Float.valueOf(this.f1516a.f6640a), Float.valueOf(this.f1517b.f6640a), Float.valueOf(this.f1518c.f6640a)});
    }

    /* renamed from: a */
    public final void mo2098a(Face face) {
        Object obj = 1;
        RectF rectF = new RectF(face.getBounds());
        this.f1525j.mapRect(rectF);
        this.f1516a.mo7911a(rectF.centerX());
        this.f1517b.mo7911a(rectF.centerY());
        float width = rectF.width() * 0.5f;
        this.f1518c.mo7911a(width);
        float f = this.f1518c.f6640a;
        float f2 = width * 0.5f;
        if (width >= f - f2 && width <= f + f2) {
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (this.f1522g) {
            this.f1519d.removeCallbacks(this.f1524i);
            this.f1519d.postDelayed(this.f1524i, 1000);
            return;
        }
        mo2097a();
    }
}
