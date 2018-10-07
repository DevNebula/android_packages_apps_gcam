package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

/* compiled from: PG */
/* renamed from: ec */
final class C0205ec extends ConstantState {
    /* renamed from: a */
    public int f3727a;
    /* renamed from: b */
    public C0204eb f3728b;
    /* renamed from: c */
    public ColorStateList f3729c;
    /* renamed from: d */
    public Mode f3730d;
    /* renamed from: e */
    public boolean f3731e;
    /* renamed from: f */
    public Bitmap f3732f;
    /* renamed from: g */
    public ColorStateList f3733g;
    /* renamed from: h */
    public Mode f3734h;
    /* renamed from: i */
    public int f3735i;
    /* renamed from: j */
    public boolean f3736j;
    /* renamed from: k */
    public boolean f3737k;
    /* renamed from: l */
    public Paint f3738l;

    public C0205ec() {
        this.f3729c = null;
        this.f3730d = C0669dw.f16878b;
        this.f3728b = new C0204eb();
    }

    public C0205ec(C0205ec c0205ec) {
        this.f3729c = null;
        this.f3730d = C0669dw.f16878b;
        if (c0205ec != null) {
            this.f3727a = c0205ec.f3727a;
            this.f3728b = new C0204eb(c0205ec.f3728b);
            Paint paint = c0205ec.f3728b.f3689c;
            if (paint != null) {
                this.f3728b.f3689c = new Paint(paint);
            }
            paint = c0205ec.f3728b.f3688b;
            if (paint != null) {
                this.f3728b.f3688b = new Paint(paint);
            }
            this.f3729c = c0205ec.f3729c;
            this.f3730d = c0205ec.f3730d;
            this.f3731e = c0205ec.f3731e;
        }
    }

    public final int getChangingConfigurations() {
        return this.f3727a;
    }

    public final Drawable newDrawable() {
        return new C0669dw(this);
    }

    public final Drawable newDrawable(Resources resources) {
        return new C0669dw(this);
    }

    /* renamed from: a */
    public final void mo6204a(int i, int i2) {
        this.f3732f.eraseColor(0);
        Canvas canvas = new Canvas(this.f3732f);
        C0204eb c0204eb = this.f3728b;
        c0204eb.mo6183a(c0204eb.f3690d, C0204eb.f3687a, canvas, i, i2, null);
    }
}
