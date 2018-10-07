package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: bo */
public final class C0642bo extends C0432qm {
    /* renamed from: a */
    private final C0062bq f11628a;
    /* renamed from: b */
    private int f11629b;
    /* renamed from: c */
    private int f11630c;
    /* renamed from: d */
    private int f11631d;
    /* renamed from: e */
    private int f11632e;
    /* renamed from: f */
    private int f11633f;
    /* renamed from: g */
    private int f11634g;
    /* renamed from: h */
    private int f11635h;
    /* renamed from: i */
    private int f11636i;
    /* renamed from: j */
    private int f11637j;
    /* renamed from: k */
    private int f11638k;
    /* renamed from: l */
    private int f11639l;
    /* renamed from: m */
    private Mode f11640m;
    /* renamed from: n */
    private ColorStateList f11641n;
    /* renamed from: o */
    private Drawable f11642o;

    public C0642bo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private C0642bo(Context context, AttributeSet attributeSet, byte b) {
        Drawable c0061bp;
        Mode mode;
        int i = 0;
        super(context, attributeSet, R.attr.materialButtonStyle);
        TypedArray a = C0173cr.m1461a(context, attributeSet, C0063br.f1490a, R.attr.materialButtonStyle, R.style.Widget.MaterialComponents.Button);
        int dimensionPixelOffset = a.getDimensionPixelOffset(C0063br.f1497h, 0);
        this.f11629b = a.getDimensionPixelOffset(C0063br.f1500k, a.getDimensionPixelOffset(1, dimensionPixelOffset));
        this.f11630c = a.getDimensionPixelOffset(C0063br.f1499j, a.getDimensionPixelOffset(3, dimensionPixelOffset));
        this.f11631d = a.getDimensionPixelOffset(C0063br.f1501l, dimensionPixelOffset);
        this.f11632e = a.getDimensionPixelOffset(C0063br.f1498i, dimensionPixelOffset);
        this.f11633f = a.getDimensionPixelOffset(C0063br.f1494e, 0);
        this.f11634g = a.getDimensionPixelOffset(C0063br.f1495f, 0);
        this.f11635h = a.getDimensionPixelOffset(C0063br.f1496g, 0);
        this.f11636i = a.getDimensionPixelOffset(C0063br.f1493d, 0);
        this.f11637j = a.getDimensionPixelOffset(C0063br.f1492c, 0);
        this.f11638k = a.getDimensionPixelOffset(C0063br.f1491b, 0);
        this.f11639l = a.getDimensionPixelSize(C0063br.f1506q, 0);
        this.f11640m = C0186df.m1641a(a.getInt(C0063br.f1508s, -1), Mode.SRC_IN);
        this.f11641n = C0186df.m1640a(getContext(), a, C0063br.f1507r);
        this.f11642o = C0186df.m1655b(getContext(), a, C0063br.f1505p);
        this.f11628a = new C0062bq(this);
        C0062bq c0062bq = this.f11628a;
        c0062bq.f1456c = a.getDimensionPixelOffset(C0063br.f1494e, 0);
        c0062bq.f1457d = a.getDimensionPixelOffset(C0063br.f1495f, 0);
        c0062bq.f1458e = a.getDimensionPixelOffset(C0063br.f1496g, 0);
        c0062bq.f1459f = a.getDimensionPixelOffset(C0063br.f1493d, 0);
        c0062bq.f1460g = a.getDimensionPixelSize(C0063br.f1504o, 0);
        c0062bq.f1461h = a.getDimensionPixelSize(C0063br.f1510u, 0);
        c0062bq.f1462i = C0186df.m1641a(a.getInt(C0063br.f1503n, -1), Mode.SRC_IN);
        c0062bq.f1463j = C0186df.m1640a(c0062bq.f1455b.getContext(), a, C0063br.f1502m);
        c0062bq.f1464k = C0186df.m1640a(c0062bq.f1455b.getContext(), a, C0063br.f1509t);
        c0062bq.f1465l = C0186df.m1640a(c0062bq.f1455b.getContext(), a, 11);
        c0062bq.f1466m.setStyle(Style.STROKE);
        c0062bq.f1466m.setStrokeWidth((float) c0062bq.f1461h);
        Paint paint = c0062bq.f1466m;
        ColorStateList colorStateList = c0062bq.f1464k;
        if (colorStateList != null) {
            dimensionPixelOffset = colorStateList.getColorForState(c0062bq.f1455b.getDrawableState(), 0);
        } else {
            dimensionPixelOffset = 0;
        }
        paint.setColor(dimensionPixelOffset);
        C0432qm c0432qm = c0062bq.f1455b;
        if (C0062bq.f1454a) {
            c0062bq.f1471r = new GradientDrawable();
            c0062bq.f1471r.setCornerRadius(((float) c0062bq.f1460g) + 1.0E-5f);
            c0062bq.f1471r.setColor(-1);
            c0062bq.mo2085a();
            c0062bq.f1472s = new GradientDrawable();
            c0062bq.f1472s.setCornerRadius(((float) c0062bq.f1460g) + 1.0E-5f);
            c0062bq.f1472s.setColor(0);
            c0062bq.f1472s.setStroke(c0062bq.f1461h, c0062bq.f1464k);
            InsetDrawable a2 = c0062bq.mo2084a(new LayerDrawable(new Drawable[]{c0062bq.f1471r, c0062bq.f1472s}));
            c0062bq.f1473t = new GradientDrawable();
            c0062bq.f1473t.setCornerRadius(((float) c0062bq.f1460g) + 1.0E-5f);
            c0062bq.f1473t.setColor(-1);
            c0061bp = new C0061bp(C0175ct.m1540a(c0062bq.f1465l), a2, c0062bq.f1473t);
        } else {
            c0062bq.f1467n = new GradientDrawable();
            c0062bq.f1467n.setCornerRadius(((float) c0062bq.f1460g) + 1.0E-5f);
            c0062bq.f1467n.setColor(-1);
            c0062bq.f1468o = c0062bq.f1467n;
            c0062bq.f1468o.setTintList(c0062bq.f1463j);
            mode = c0062bq.f1462i;
            if (mode != null) {
                c0062bq.f1468o.setTintMode(mode);
            }
            c0062bq.f1469p = new GradientDrawable();
            c0062bq.f1469p.setCornerRadius(((float) c0062bq.f1460g) + 1.0E-5f);
            c0062bq.f1469p.setColor(-1);
            c0062bq.f1470q = c0062bq.f1469p;
            c0062bq.f1470q.setTintList(c0062bq.f1465l);
            c0061bp = c0062bq.mo2084a(new LayerDrawable(new Drawable[]{c0062bq.f1468o, c0062bq.f1470q}));
        }
        super.setBackgroundDrawable(c0061bp);
        a.recycle();
        setCompoundDrawablePadding(this.f11639l);
        c0061bp = this.f11642o;
        if (c0061bp != null) {
            this.f11642o = c0061bp.mutate();
            this.f11642o.setTintList(this.f11641n);
            mode = this.f11640m;
            if (mode != null) {
                this.f11642o.setTintMode(mode);
            }
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(this.f11642o, null, null, null);
        int i2 = this.f11629b;
        Drawable drawable = this.f11642o;
        if (drawable != null) {
            dimensionPixelOffset = this.f11637j;
        } else {
            dimensionPixelOffset = 0;
        }
        dimensionPixelOffset = (dimensionPixelOffset + i2) + this.f11633f;
        i2 = this.f11631d + this.f11635h;
        int i3 = this.f11630c;
        if (drawable != null) {
            i = this.f11638k;
        }
        C0315jm.m4610a(this, dimensionPixelOffset, i2, (i + i3) + this.f11634g, this.f11632e + this.f11636i);
    }

    public final ColorStateList getBackgroundTintList() {
        return mo10911a();
    }

    public final Mode getBackgroundTintMode() {
        return mo10914b();
    }

    /* renamed from: a */
    public final ColorStateList mo10911a() {
        if (m7726c()) {
            return this.f11628a.f1463j;
        }
        return super.mo10911a();
    }

    /* renamed from: b */
    public final Mode mo10914b() {
        if (m7726c()) {
            return this.f11628a.f1462i;
        }
        return super.mo10914b();
    }

    /* renamed from: c */
    private final boolean m7726c() {
        C0062bq c0062bq = this.f11628a;
        return (c0062bq == null || c0062bq.f1474u) ? false : true;
    }

    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public final void setBackgroundColor(int i) {
        if (m7726c()) {
            C0062bq c0062bq = this.f11628a;
            if (C0062bq.f1454a) {
                GradientDrawable gradientDrawable = c0062bq.f1471r;
                if (gradientDrawable != null) {
                    gradientDrawable.setColor(i);
                    return;
                }
            }
            if (!C0062bq.f1454a) {
                GradientDrawable gradientDrawable2 = c0062bq.f1467n;
                if (gradientDrawable2 != null) {
                    gradientDrawable2.setColor(i);
                    return;
                }
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        if (!m7726c()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.i("MaterialButton", "Setting a custom background is not supported.");
            C0062bq c0062bq = this.f11628a;
            c0062bq.f1474u = true;
            c0062bq.f1455b.mo10912a(c0062bq.f1463j);
            c0062bq.f1455b.mo10913a(c0062bq.f1462i);
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public final void setBackgroundResource(int i) {
        Drawable b;
        if (i != 0) {
            b = C0383nj.m5682b(getContext(), i);
        } else {
            b = null;
        }
        setBackgroundDrawable(b);
    }

    public final void setBackgroundTintList(ColorStateList colorStateList) {
        mo10912a(colorStateList);
    }

    public final void setBackgroundTintMode(Mode mode) {
        mo10913a(mode);
    }

    /* renamed from: a */
    public final void mo10912a(ColorStateList colorStateList) {
        if (m7726c()) {
            C0062bq c0062bq = this.f11628a;
            if (c0062bq.f1463j != colorStateList) {
                c0062bq.f1463j = colorStateList;
                if (C0062bq.f1454a) {
                    c0062bq.mo2085a();
                    return;
                }
                Drawable drawable = c0062bq.f1468o;
                if (drawable != null) {
                    drawable.setTintList(c0062bq.f1463j);
                }
            }
        } else if (this.f11628a != null) {
            super.mo10912a(colorStateList);
        }
    }

    /* renamed from: a */
    public final void mo10913a(Mode mode) {
        if (m7726c()) {
            C0062bq c0062bq = this.f11628a;
            if (c0062bq.f1462i != mode) {
                c0062bq.f1462i = mode;
                if (C0062bq.f1454a) {
                    c0062bq.mo2085a();
                    return;
                }
                Drawable drawable = c0062bq.f1468o;
                if (drawable != null) {
                    Mode mode2 = c0062bq.f1462i;
                    if (mode2 != null) {
                        drawable.setTintMode(mode2);
                    }
                }
            }
        } else if (this.f11628a != null) {
            super.mo10913a(mode);
        }
    }
}
