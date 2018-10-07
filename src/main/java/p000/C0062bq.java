package p000;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;

/* compiled from: PG */
/* renamed from: bq */
final class C0062bq {
    /* renamed from: a */
    public static final boolean f1454a = true;
    /* renamed from: b */
    public final C0642bo f1455b;
    /* renamed from: c */
    public int f1456c;
    /* renamed from: d */
    public int f1457d;
    /* renamed from: e */
    public int f1458e;
    /* renamed from: f */
    public int f1459f;
    /* renamed from: g */
    public int f1460g;
    /* renamed from: h */
    public int f1461h;
    /* renamed from: i */
    public Mode f1462i;
    /* renamed from: j */
    public ColorStateList f1463j;
    /* renamed from: k */
    public ColorStateList f1464k;
    /* renamed from: l */
    public ColorStateList f1465l;
    /* renamed from: m */
    public final Paint f1466m = new Paint(1);
    /* renamed from: n */
    public GradientDrawable f1467n;
    /* renamed from: o */
    public Drawable f1468o;
    /* renamed from: p */
    public GradientDrawable f1469p;
    /* renamed from: q */
    public Drawable f1470q;
    /* renamed from: r */
    public GradientDrawable f1471r;
    /* renamed from: s */
    public GradientDrawable f1472s;
    /* renamed from: t */
    public GradientDrawable f1473t;
    /* renamed from: u */
    public boolean f1474u;

    public C0062bq(C0642bo c0642bo) {
        Rect rect = new Rect();
        RectF rectF = new RectF();
        this.f1474u = false;
        this.f1455b = c0642bo;
    }

    /* renamed from: a */
    final void mo2085a() {
        Drawable drawable = this.f1471r;
        if (drawable != null) {
            drawable.setTintList(this.f1463j);
            Mode mode = this.f1462i;
            if (mode != null) {
                this.f1471r.setTintMode(mode);
            }
        }
    }

    /* renamed from: a */
    final InsetDrawable mo2084a(Drawable drawable) {
        return new InsetDrawable(drawable, this.f1456c, this.f1458e, this.f1457d, this.f1459f);
    }
}
