package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.view.Gravity;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: any */
public class any extends Drawable implements Animatable, aof {
    /* renamed from: a */
    public final anz f10612a;
    /* renamed from: b */
    public boolean f10613b;
    /* renamed from: c */
    private boolean f10614c;
    /* renamed from: d */
    private boolean f10615d;
    /* renamed from: e */
    private boolean f10616e;
    /* renamed from: f */
    private int f10617f;
    /* renamed from: g */
    private int f10618g;
    /* renamed from: h */
    private boolean f10619h;
    /* renamed from: i */
    private Paint f10620i;
    /* renamed from: j */
    private Rect f10621j;

    public any(Context context, ada ada, ads ads, int i, int i2, Bitmap bitmap) {
        this(new anz(new aod(acc.m98a(context), ada, i, i2, ads, bitmap)));
    }

    any(anz anz) {
        this.f10616e = true;
        this.f10618g = -1;
        this.f10612a = (anz) aqe.m610a((Object) anz, "Argument must not be null");
    }

    public void draw(Canvas canvas) {
        if (!this.f10613b) {
            if (this.f10619h) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m6928d());
                this.f10619h = false;
            }
            canvas.drawBitmap(this.f10612a.f824a.mo1628a(), null, m6928d(), m6929e());
        }
    }

    /* renamed from: a */
    public final ByteBuffer mo12284a() {
        return this.f10612a.f824a.f826a.mo159e().asReadOnlyBuffer();
    }

    public ConstantState getConstantState() {
        return this.f10612a;
    }

    /* renamed from: d */
    private final Rect m6928d() {
        if (this.f10621j == null) {
            this.f10621j = new Rect();
        }
        return this.f10621j;
    }

    /* renamed from: b */
    public final Bitmap mo12285b() {
        return this.f10612a.f824a.f833h;
    }

    public int getIntrinsicHeight() {
        return this.f10612a.f824a.mo1628a().getHeight();
    }

    public int getIntrinsicWidth() {
        return this.f10612a.f824a.mo1628a().getWidth();
    }

    public int getOpacity() {
        return -2;
    }

    /* renamed from: e */
    private final Paint m6929e() {
        if (this.f10620i == null) {
            this.f10620i = new Paint(2);
        }
        return this.f10620i;
    }

    public boolean isRunning() {
        return this.f10614c;
    }

    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f10619h = true;
    }

    /* renamed from: c */
    public final void mo1634c() {
        Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        int i;
        invalidateSelf();
        aod aod = this.f10612a.f824a;
        aoe aoe = aod.f830e;
        if (aoe != null) {
            i = aoe.f26614a;
        } else {
            i = -1;
        }
        if (i == aod.mo1631b() - 1) {
            this.f10617f++;
        }
        i = this.f10618g;
        if (i != -1 && this.f10617f >= i) {
            stop();
        }
    }

    public void setAlpha(int i) {
        m6929e().setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        m6929e().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        aqe.m613a(this.f10613b ^ 1, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f10616e = z;
        if (!z) {
            m6931g();
        } else if (this.f10615d) {
            m6930f();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.f10615d = true;
        this.f10617f = 0;
        if (this.f10616e) {
            m6930f();
        }
    }

    /* renamed from: f */
    private final void m6930f() {
        aqe.m613a(this.f10613b ^ 1, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f10612a.f824a.mo1631b() == 1) {
            invalidateSelf();
        } else if (!this.f10614c) {
            this.f10614c = true;
            aod aod = this.f10612a.f824a;
            if (aod.f831f) {
                throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
            } else if (aod.f827b.contains(this)) {
                throw new IllegalStateException("Cannot subscribe twice in a row");
            } else {
                boolean isEmpty = aod.f827b.isEmpty();
                aod.f827b.add(this);
                if (isEmpty && !aod.f829d) {
                    aod.f829d = true;
                    aod.f831f = false;
                    aod.mo1632c();
                }
                invalidateSelf();
            }
        }
    }

    public void stop() {
        this.f10615d = false;
        m6931g();
    }

    /* renamed from: g */
    private final void m6931g() {
        this.f10614c = false;
        aod aod = this.f10612a.f824a;
        aod.f827b.remove(this);
        if (aod.f827b.isEmpty()) {
            aod.f829d = false;
        }
    }
}
