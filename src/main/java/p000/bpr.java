package p000;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: bpr */
public final class bpr {
    /* renamed from: a */
    public final Paint f1422a;
    /* renamed from: b */
    public final Paint f1423b;
    /* renamed from: c */
    public final Paint f1424c;
    /* renamed from: d */
    public final Drawable f1425d;
    /* renamed from: e */
    public final float f1426e;
    /* renamed from: f */
    public final float f1427f;
    /* renamed from: g */
    public final float f1428g;
    /* renamed from: h */
    public final float f1429h;
    /* renamed from: i */
    public final float f1430i;
    /* renamed from: j */
    public final float f1431j;
    /* renamed from: k */
    public final float f1432k;
    /* renamed from: l */
    public final float f1433l;
    /* renamed from: m */
    public final float f1434m;
    /* renamed from: n */
    public final float f1435n;
    /* renamed from: o */
    public final float f1436o;
    /* renamed from: p */
    public final float f1437p;
    /* renamed from: q */
    public final float f1438q;
    /* renamed from: r */
    public final float f1439r = (this.f1429h / 2.0f);
    /* renamed from: s */
    public int f1440s;
    /* renamed from: t */
    private final float f1441t;
    /* renamed from: u */
    private final float f1442u;

    public bpr(Resources resources) {
        this.f1426e = (float) resources.getDimensionPixelSize(R.dimen.evCompRulerWidth);
        this.f1427f = (float) resources.getDimensionPixelSize(R.dimen.evCompRulerMarginRight);
        this.f1432k = (float) resources.getDimensionPixelSize(R.dimen.evCompLeftMarkerMargin);
        this.f1434m = (float) resources.getDimensionPixelSize(R.dimen.evCompLeftMarkerWidth);
        this.f1433l = (float) resources.getDimensionPixelSize(R.dimen.evCompLeftMarkerHeight);
        this.f1435n = (float) resources.getDimensionPixelSize(R.dimen.evCompLeftMarkerTriangleWidth);
        this.f1436o = (float) resources.getDimensionPixelSize(R.dimen.evCompLeftMarkerBorderRadius);
        this.f1437p = (float) resources.getDimensionPixelSize(R.dimen.evCompLeftMarkerTextSize);
        this.f1428g = (float) resources.getDimensionPixelOffset(R.dimen.evCompRulerDotRadius);
        this.f1430i = (float) resources.getDimensionPixelSize(R.dimen.evCompRulerMarkerWidth);
        this.f1429h = (float) resources.getDimensionPixelSize(R.dimen.evCompRulerMarkerHeight);
        this.f1441t = (float) resources.getDimensionPixelSize(R.dimen.evCompMinVerticalPadding);
        this.f1442u = (float) resources.getDimensionPixelSize(R.dimen.evCompMaxHeight);
        this.f1425d = resources.getDrawable(R.drawable.ic_exposure, null);
        this.f1431j = (float) resources.getDimensionPixelSize(R.dimen.evCompRulerMarkerDistanceFromCenterX);
        this.f1438q = (float) resources.getDimensionPixelSize(R.dimen.evCompRulerDashThickness);
        Paint paint = new Paint();
        paint.setColor(resources.getColor(R.color.evCompRulerColor, null));
        paint.setStyle(Style.FILL);
        this.f1422a = paint;
        paint = new Paint();
        paint.setColor(resources.getColor(R.color.evCompTextColor, null));
        paint.setTextAlign(Align.CENTER);
        paint.setTypeface(Typeface.create("sans-serif-medium", 0));
        this.f1424c = paint;
        paint = new Paint();
        paint.setStyle(Style.STROKE);
        paint.setColor(resources.getColor(R.color.evCompStrokeColor, null));
        paint.setAntiAlias(true);
        paint.setStrokeWidth((float) resources.getDimensionPixelSize(R.dimen.evCompStrokeWidth));
        this.f1423b = paint;
    }

    /* renamed from: a */
    public final float mo2077a(int i, Canvas canvas) {
        int height = canvas.getHeight();
        int a = mo2078a(canvas.getHeight());
        float f = this.f1428g;
        f += f;
        int i2 = this.f1440s;
        float f2 = (float) a;
        float f3 = this.f1439r;
        float f4 = (float) (i2 - 1);
        return (((((float) height) - f2) / 2.0f) + f3) + (((((f2 - (f3 + f3)) - (f * f4)) / f4) + f) * ((float) i));
    }

    /* renamed from: a */
    public final int mo2079a(Canvas canvas) {
        return (canvas.getWidth() - ((int) this.f1427f)) - ((int) (this.f1426e / 2.0f));
    }

    /* renamed from: a */
    public final int mo2078a(int i) {
        int i2;
        double d = (double) i;
        float f = this.f1441t;
        if (0.15d * d >= ((double) f)) {
            i2 = (int) (d * 0.7d);
        } else {
            i2 = (int) (((float) i) - (f + f));
        }
        float f2 = this.f1442u;
        if (((float) i2) > f2) {
            return (int) f2;
        }
        return i2;
    }
}
