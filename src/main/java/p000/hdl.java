package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: hdl */
public final class hdl extends Drawable {
    /* renamed from: c */
    private static final float f6417c = ((float) Math.toRadians(45.0d));
    /* renamed from: a */
    public float f6418a;
    /* renamed from: b */
    private final Paint f6419b;
    /* renamed from: d */
    private float f6420d;
    /* renamed from: e */
    private float f6421e;
    /* renamed from: f */
    private float f6422f;
    /* renamed from: g */
    private float f6423g;
    /* renamed from: h */
    private boolean f6424h;
    /* renamed from: i */
    private final Path f6425i;
    /* renamed from: j */
    private final int f6426j;
    /* renamed from: k */
    private boolean f6427k;
    /* renamed from: l */
    private float f6428l;
    /* renamed from: m */
    private int f6429m;

    private hdl(Context context) {
        this.f6419b = new Paint();
        this.f6425i = new Path();
        this.f6427k = false;
        this.f6429m = 2;
        this.f6419b.setStyle(Style.STROKE);
        this.f6419b.setStrokeJoin(Join.MITER);
        this.f6419b.setStrokeCap(Cap.BUTT);
        this.f6419b.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, C0382ni.f9319az, R.attr.drawerArrowStyle, R.style.Base.Widget.AppCompat.DrawerArrowToggle);
        m3135a(obtainStyledAttributes.getColor(C0382ni.f9271aD, 0));
        float dimension = obtainStyledAttributes.getDimension(C0382ni.f9275aH, 0.0f);
        if (this.f6419b.getStrokeWidth() != dimension) {
            this.f6419b.setStrokeWidth(dimension);
            this.f6428l = (float) (((double) (dimension / 2.0f)) * Math.cos((double) f6417c));
            invalidateSelf();
        }
        boolean z = obtainStyledAttributes.getBoolean(C0382ni.f9274aG, true);
        if (this.f6424h != z) {
            this.f6424h = z;
            invalidateSelf();
        }
        dimension = (float) Math.round(obtainStyledAttributes.getDimension(C0382ni.f9273aF, 0.0f));
        if (dimension != this.f6423g) {
            this.f6423g = dimension;
            invalidateSelf();
        }
        this.f6426j = obtainStyledAttributes.getDimensionPixelSize(C0382ni.f9272aE, 0);
        this.f6421e = (float) Math.round(obtainStyledAttributes.getDimension(C0382ni.f9270aC, 0.0f));
        this.f6420d = (float) Math.round(obtainStyledAttributes.getDimension(C0382ni.f9268aA, 0.0f));
        this.f6422f = obtainStyledAttributes.getDimension(C0382ni.f9269aB, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public hdl(Context context, byte b) {
        this(context);
        m3135a(-1);
    }

    public final void draw(Canvas canvas) {
        int i;
        Rect bounds = getBounds();
        switch (this.f6429m) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 3:
                if (getLayoutDirection() != 0) {
                    i = 0;
                    break;
                } else {
                    i = 1;
                    break;
                }
            default:
                if (getLayoutDirection() != 1) {
                    i = 0;
                    break;
                } else {
                    i = 1;
                    break;
                }
        }
        float f = this.f6420d;
        f *= f;
        double sqrt = Math.sqrt((double) (f + f));
        f = this.f6421e;
        float f2 = this.f6418a;
        float f3 = ((((float) sqrt) - f) * f2) + f;
        float f4 = ((this.f6422f - f) * f2) + f;
        float round = (float) Math.round(((this.f6428l + 0.0f) * f2) + 0.0f);
        f = f6417c;
        float f5 = this.f6418a;
        float f6 = ((f + 0.0f) * f5) + 0.0f;
        if (i == 0) {
            f2 = -180.0f;
        } else {
            f2 = 0.0f;
        }
        if (i == 0) {
            f = 0.0f;
        } else {
            f = 180.0f;
        }
        f = ((f - f2) * f5) + f2;
        double d = (double) f3;
        double d2 = (double) f6;
        f2 = (float) Math.round(Math.cos(d2) * d);
        f3 = (float) Math.round(Math.sin(d2) * d);
        this.f6425i.rewind();
        f5 = this.f6423g + this.f6419b.getStrokeWidth();
        f5 += ((-this.f6428l) - f5) * this.f6418a;
        f6 = (-f4) / 2.0f;
        this.f6425i.moveTo(f6 + round, 0.0f);
        this.f6425i.rLineTo(f4 - (round + round), 0.0f);
        this.f6425i.moveTo(f6, f5);
        this.f6425i.rLineTo(f2, f3);
        this.f6425i.moveTo(f6, -f5);
        this.f6425i.rLineTo(f2, -f3);
        this.f6425i.close();
        canvas.save();
        f2 = this.f6419b.getStrokeWidth();
        int height = bounds.height();
        f4 = this.f6423g;
        height = ((int) ((((float) height) - (3.0f * f2)) - (f4 + f4))) / 4;
        canvas.translate((float) bounds.centerX(), (float) ((((double) f4) + (((double) f2) * 1.5d)) + ((double) ((float) (height + height)))));
        if (this.f6424h) {
            if ((i ^ this.f6427k) == 0) {
                i = 1;
            } else {
                i = -1;
            }
            canvas.rotate(((float) i) * f);
        } else if (i != 0) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f6425i, this.f6419b);
        canvas.restore();
    }

    public final int getIntrinsicHeight() {
        return this.f6426j;
    }

    public final int getIntrinsicWidth() {
        return this.f6426j;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        if (i != this.f6419b.getAlpha()) {
            this.f6419b.setAlpha(i);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    private final void m3135a(int i) {
        if (i != this.f6419b.getColor()) {
            this.f6419b.setColor(i);
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f6419b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo7740a(boolean z) {
        if (this.f6427k != z) {
            this.f6427k = z;
            invalidateSelf();
        }
    }
}
