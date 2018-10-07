package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

/* compiled from: PG */
/* renamed from: kvr */
public final class kvr extends ImageView {
    /* renamed from: a */
    public float f9042a;
    /* renamed from: b */
    public Matrix f9043b;
    /* renamed from: c */
    public int f9044c;
    /* renamed from: d */
    public float f9045d;
    /* renamed from: e */
    public float f9046e;
    /* renamed from: f */
    public float[] f9047f;
    /* renamed from: g */
    public Context f9048g;
    /* renamed from: h */
    public kvv f9049h;
    /* renamed from: i */
    public int f9050i;
    /* renamed from: j */
    public int f9051j;
    /* renamed from: k */
    public ScaleGestureDetector f9052k;
    /* renamed from: l */
    public GestureDetector f9053l;
    /* renamed from: m */
    public OnTouchListener f9054m = null;
    /* renamed from: n */
    private Matrix f9055n;
    /* renamed from: o */
    private float f9056o;
    /* renamed from: p */
    private float f9057p;
    /* renamed from: q */
    private ScaleType f9058q;
    /* renamed from: r */
    private boolean f9059r;
    /* renamed from: s */
    private boolean f9060s;
    /* renamed from: t */
    private kvz f9061t;
    /* renamed from: u */
    private int f9062u;
    /* renamed from: v */
    private int f9063v;
    /* renamed from: w */
    private float f9064w;
    /* renamed from: x */
    private float f9065x;
    /* renamed from: y */
    private float f9066y;
    /* renamed from: z */
    private float f9067z;

    public kvr(Context context) {
        super(context);
        super.setClickable(true);
        this.f9048g = context;
        this.f9052k = new ScaleGestureDetector(context, new kvy(this));
        this.f9053l = new GestureDetector(context, new kvw(this));
        this.f9043b = new Matrix();
        this.f9055n = new Matrix();
        this.f9047f = new float[9];
        this.f9042a = 1.0f;
        if (this.f9058q == null) {
            this.f9058q = ScaleType.FIT_CENTER;
        }
        this.f9045d = 1.0f;
        this.f9046e = 3.0f;
        this.f9056o = this.f9045d * 0.75f;
        this.f9057p = this.f9046e * 1.25f;
        setImageMatrix(this.f9043b);
        setScaleType(ScaleType.MATRIX);
        this.f9044c = C0252go.f5913cf;
        this.f9060s = false;
        super.setOnTouchListener(new kvx(this));
    }

    public final boolean canScrollHorizontally(int i) {
        this.f9043b.getValues(this.f9047f);
        float f = this.f9047f[2];
        if (mo10535d() < ((float) this.f9050i)) {
            return false;
        }
        if (f >= -1.0f && i < 0) {
            return false;
        }
        if ((Math.abs(f) + ((float) this.f9050i)) + 1.0f < mo10535d() || i <= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private final void m5526f() {
        Drawable drawable = getDrawable();
        if (drawable != null && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0 && this.f9043b != null && this.f9055n != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            float f = (float) intrinsicWidth;
            float f2 = ((float) this.f9050i) / f;
            float f3 = (float) intrinsicHeight;
            float f4 = ((float) this.f9051j) / f3;
            switch (kvs.f9068a[this.f9058q.ordinal()]) {
                case 1:
                    f4 = 1.0f;
                    f2 = 1.0f;
                    break;
                case 2:
                    f4 = Math.max(f2, f4);
                    f2 = f4;
                    break;
                case 3:
                    f4 = Math.min(1.0f, Math.min(f2, f4));
                    f2 = f4;
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    throw new UnsupportedOperationException("TouchImageView does not support FIT_START or FIT_END");
            }
            f4 = Math.min(f2, f4);
            f2 = f4;
            float f5 = (float) this.f9050i;
            float f6 = f5 - (f2 * f);
            float f7 = (float) this.f9051j;
            float f8 = f7 - (f4 * f3);
            this.f9064w = f5 - f6;
            this.f9065x = f7 - f8;
            if (this.f9042a != 1.0f || this.f9059r) {
                if (this.f9066y == 0.0f || this.f9067z == 0.0f) {
                    m5527g();
                }
                this.f9055n.getValues(this.f9047f);
                float[] fArr = this.f9047f;
                float f9 = this.f9064w;
                f2 = this.f9042a;
                fArr[0] = (f9 / f) * f2;
                fArr[4] = (this.f9065x / f3) * f2;
                f9 = fArr[2];
                f6 = fArr[5];
                m5524a(2, f9, f2 * this.f9066y, mo10535d(), this.f9062u, this.f9050i, intrinsicWidth);
                m5524a(5, f6, this.f9067z * this.f9042a, mo10533c(), this.f9063v, this.f9051j, intrinsicHeight);
                this.f9043b.setValues(this.f9047f);
            } else {
                this.f9043b.setScale(f2, f4);
                this.f9043b.postTranslate(f6 / 2.0f, f8 / 2.0f);
                this.f9042a = 1.0f;
            }
            mo10532b();
            setImageMatrix(this.f9043b);
        }
    }

    /* renamed from: a */
    final void mo10531a() {
        mo10532b();
        this.f9043b.getValues(this.f9047f);
        float f = (float) this.f9050i;
        if (mo10535d() < f) {
            this.f9047f[2] = (f - mo10535d()) / 2.0f;
        }
        f = (float) this.f9051j;
        if (mo10533c() < f) {
            this.f9047f[5] = (f - mo10533c()) / 2.0f;
        }
        this.f9043b.setValues(this.f9047f);
    }

    /* renamed from: b */
    final void mo10532b() {
        this.f9043b.getValues(this.f9047f);
        float[] fArr = this.f9047f;
        float f = fArr[2];
        float f2 = fArr[5];
        f = kvr.m5520a(f, (float) this.f9050i, mo10535d());
        f2 = kvr.m5520a(f2, (float) this.f9051j, mo10533c());
        if (f != 0.0f || f2 != 0.0f) {
            this.f9043b.postTranslate(f, f2);
        }
    }

    /* renamed from: a */
    private static float m5520a(float f, float f2, float f3) {
        float f4;
        float f5;
        if (f3 <= f2) {
            f4 = f2 - f3;
            f5 = 0.0f;
        } else {
            f5 = f2 - f3;
            f4 = 0.0f;
        }
        if (f < f5) {
            return (-f) + f5;
        }
        if (f > f4) {
            return (-f) + f4;
        }
        return 0.0f;
    }

    /* renamed from: c */
    final float mo10533c() {
        return this.f9065x * this.f9042a;
    }

    /* renamed from: d */
    final float mo10535d() {
        return this.f9064w * this.f9042a;
    }

    public final ScaleType getScaleType() {
        return this.f9058q;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m5527g();
    }

    protected final void onDraw(Canvas canvas) {
        this.f9060s = true;
        this.f9059r = true;
        kvz kvz = this.f9061t;
        if (kvz != null) {
            m5523a(kvz.f9088a, kvz.f9089b, kvz.f9090c, kvz.f9091d);
            this.f9061t = null;
        }
        super.onDraw(canvas);
    }

    protected final void onMeasure(int i, int i2) {
        Drawable drawable = getDrawable();
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int size = MeasureSpec.getSize(i);
        int mode = MeasureSpec.getMode(i);
        int size2 = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i2);
        this.f9050i = kvr.m5521a(mode, size, intrinsicWidth);
        this.f9051j = kvr.m5521a(mode2, size2, intrinsicHeight);
        setMeasuredDimension(this.f9050i, this.f9051j);
        m5526f();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f9042a = bundle.getFloat("saveScale");
            this.f9047f = bundle.getFloatArray("matrix");
            this.f9055n.setValues(this.f9047f);
            this.f9067z = bundle.getFloat("matchViewHeight");
            this.f9066y = bundle.getFloat("matchViewWidth");
            this.f9063v = bundle.getInt("viewHeight");
            this.f9062u = bundle.getInt("viewWidth");
            this.f9059r = bundle.getBoolean("imageRendered");
            super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putFloat("saveScale", this.f9042a);
        bundle.putFloat("matchViewHeight", this.f9065x);
        bundle.putFloat("matchViewWidth", this.f9064w);
        bundle.putInt("viewWidth", this.f9050i);
        bundle.putInt("viewHeight", this.f9051j);
        this.f9043b.getValues(this.f9047f);
        bundle.putFloatArray("matrix", this.f9047f);
        bundle.putBoolean("imageRendered", this.f9059r);
        return bundle;
    }

    /* renamed from: e */
    public final void mo10536e() {
        this.f9042a = 1.0f;
        m5526f();
    }

    /* renamed from: g */
    private final void m5527g() {
        Matrix matrix = this.f9043b;
        if (matrix != null && this.f9051j != 0 && this.f9050i != 0) {
            matrix.getValues(this.f9047f);
            this.f9055n.setValues(this.f9047f);
            this.f9067z = this.f9065x;
            this.f9066y = this.f9064w;
            this.f9063v = this.f9051j;
            this.f9062u = this.f9050i;
        }
    }

    /* renamed from: a */
    private final void m5522a(double d, float f, float f2, boolean z) {
        float f3;
        float f4;
        if (z) {
            f3 = this.f9056o;
            f4 = this.f9057p;
        } else {
            f3 = this.f9045d;
            f4 = this.f9046e;
        }
        float f5 = this.f9042a;
        this.f9042a = (float) (((double) f5) * d);
        float f6 = this.f9042a;
        if (f6 > f4) {
            this.f9042a = f4;
            d = (double) (f4 / f5);
        } else if (f6 < f3) {
            this.f9042a = f3;
            d = (double) (f3 / f5);
        }
        f4 = (float) d;
        this.f9043b.postScale(f4, f4, f, f2);
        mo10531a();
    }

    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m5527g();
        m5526f();
    }

    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m5527g();
        m5526f();
    }

    public final void setImageResource(int i) {
        super.setImageResource(i);
        m5527g();
        m5526f();
    }

    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m5527g();
        m5526f();
    }

    public final void setOnTouchListener(OnTouchListener onTouchListener) {
        this.f9054m = onTouchListener;
    }

    public final void setScaleType(ScaleType scaleType) {
        if (scaleType == ScaleType.FIT_START || scaleType == ScaleType.FIT_END) {
            throw new UnsupportedOperationException("TouchImageView does not support FIT_START or FIT_END");
        } else if (scaleType == ScaleType.MATRIX) {
            super.setScaleType(ScaleType.MATRIX);
        } else {
            this.f9058q = scaleType;
            if (this.f9060s) {
                PointF a;
                Drawable drawable = getDrawable();
                if (drawable != null) {
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    a = mo10530a((float) (this.f9050i / 2), (float) (this.f9051j / 2), true);
                    a.x /= (float) intrinsicWidth;
                    a.y /= (float) intrinsicHeight;
                } else {
                    a = null;
                }
                m5523a(this.f9042a, a.x, a.y, getScaleType());
            }
        }
    }

    /* renamed from: a */
    private static int m5521a(int i, int i2, int i3) {
        switch (i) {
            case kvl.UNSET_ENUM_VALUE /*-2147483648*/:
                return Math.min(i3, i2);
            case 0:
                return i3;
            default:
                return i2;
        }
    }

    /* renamed from: a */
    private final void m5523a(float f, float f2, float f3, ScaleType scaleType) {
        if (this.f9060s) {
            if (scaleType != this.f9058q) {
                setScaleType(scaleType);
            }
            mo10536e();
            m5522a((double) f, (float) (this.f9050i / 2), (float) (this.f9051j / 2), true);
            this.f9043b.getValues(this.f9047f);
            this.f9047f[2] = -((mo10535d() * f2) - (((float) this.f9050i) * 0.5f));
            this.f9047f[5] = -((mo10533c() * f3) - (((float) this.f9051j) * 0.5f));
            this.f9043b.setValues(this.f9047f);
            mo10532b();
            setImageMatrix(this.f9043b);
            return;
        }
        this.f9061t = new kvz(f, f2, f3, scaleType);
    }

    /* renamed from: a */
    final PointF mo10530a(float f, float f2, boolean z) {
        this.f9043b.getValues(this.f9047f);
        float intrinsicWidth = (float) getDrawable().getIntrinsicWidth();
        float intrinsicHeight = (float) getDrawable().getIntrinsicHeight();
        float[] fArr = this.f9047f;
        float f3 = fArr[2];
        f3 = ((f - f3) * intrinsicWidth) / mo10535d();
        float c = ((f2 - fArr[5]) * intrinsicHeight) / mo10533c();
        if (z) {
            f3 = Math.min(Math.max(f3, 0.0f), intrinsicWidth);
            c = Math.min(Math.max(c, 0.0f), intrinsicHeight);
        }
        return new PointF(f3, c);
    }

    /* renamed from: a */
    private final void m5524a(int i, float f, float f2, float f3, int i2, int i3, int i4) {
        float f4 = (float) i3;
        if (f3 < f4) {
            float[] fArr = this.f9047f;
            fArr[i] = (f4 - (((float) i4) * fArr[0])) * 0.5f;
        } else if (f > 0.0f) {
            this.f9047f[i] = -((f3 - f4) * 0.5f);
        } else {
            this.f9047f[i] = -((((Math.abs(f) + (((float) i2) * 0.5f)) / f2) * f3) - (f4 * 0.5f));
        }
    }
}
