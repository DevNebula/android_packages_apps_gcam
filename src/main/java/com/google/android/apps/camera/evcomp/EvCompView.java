package com.google.android.apps.camera.evcomp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.google.android.GoogleCamera.R;
import p000.bpr;
import p000.jri;
import p000.kvl;

/* compiled from: PG */
public class EvCompView extends ViewGroup {
    /* renamed from: a */
    public final bpr f2465a;
    /* renamed from: b */
    public float f2466b;
    /* renamed from: c */
    public float f2467c;
    /* renamed from: d */
    public float f2468d;
    /* renamed from: e */
    public float f2469e;
    /* renamed from: f */
    public boolean f2470f;
    /* renamed from: g */
    public View f2471g;
    /* renamed from: h */
    private boolean f2472h;
    /* renamed from: i */
    private boolean f2473i;
    /* renamed from: j */
    private boolean f2474j;

    public EvCompView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        this.f2465a = new bpr(context.getResources());
    }

    public EvCompView(Context context, bpr bpr) {
        super(context);
        setWillNotDraw(false);
        this.f2465a = bpr;
        this.f2467c = (float) context.getResources().getDimensionPixelSize(R.dimen.evCompRulerShortDashLength);
    }

    /* renamed from: a */
    public static String m1254a(float f) {
        return String.format("%+.1f", new Object[]{Float.valueOf(f)}).replaceFirst("^[-+](0(\\.0*)?)$", "$1");
    }

    protected void onDraw(Canvas canvas) {
        bpr bpr = this.f2465a;
        if (bpr != null) {
            float a;
            int i;
            float a2;
            float f;
            float a3;
            float f2;
            int i2;
            boolean z;
            if (this.f2472h) {
                if (!this.f2473i) {
                    a = (float) bpr.mo2079a(canvas);
                    for (i = 0; i < bpr.f1440s; i++) {
                        if (i % 3 != 0) {
                            a2 = bpr.mo2077a(i, canvas);
                            canvas.drawCircle(a, a2, bpr.f1428g, bpr.f1422a);
                            canvas.drawCircle(a, a2, bpr.f1428g, bpr.f1423b);
                        }
                    }
                    bpr bpr2 = this.f2465a;
                    f = this.f2467c;
                    float a4 = ((float) bpr2.mo2079a(canvas)) - (f / 2.0f);
                    i = 0;
                    while (true) {
                        int i3 = i;
                        if (i3 >= bpr2.f1440s) {
                            break;
                        }
                        a3 = bpr2.mo2077a(i3, canvas);
                        a2 = bpr2.f1438q / 2.0f;
                        a = a3 - a2;
                        f2 = a3 + a2;
                        a2 = a4 + f;
                        canvas.drawRect(a4, a, a2, f2, bpr2.f1422a);
                        canvas.drawRect(a4, a, a2, f2, bpr2.f1423b);
                        i = i3 + 3;
                    }
                } else {
                    a = (float) bpr.mo2079a(canvas);
                    i2 = bpr.f1440s / 2;
                    for (i = 0; i < bpr.f1440s; i++) {
                        if (i != i2) {
                            f2 = bpr.mo2077a(i, canvas);
                            canvas.drawCircle(a, f2, bpr.f1428g, bpr.f1422a);
                            canvas.drawCircle(a, f2, bpr.f1428g, bpr.f1423b);
                        }
                    }
                    bpr bpr3 = this.f2465a;
                    int intrinsicWidth = bpr3.f1425d.getIntrinsicWidth();
                    int intrinsicHeight = bpr3.f1425d.getIntrinsicHeight();
                    i2 = (canvas.getHeight() - intrinsicHeight) / 2;
                    int a5 = bpr3.mo2079a(canvas) - (intrinsicWidth / 2);
                    bpr3.f1425d.setBounds(a5, i2, intrinsicWidth + a5, intrinsicHeight + i2);
                    bpr3.f1425d.draw(canvas);
                }
            }
            if (this.f2474j) {
                bpr = this.f2465a;
                a = this.f2466b;
                if (a >= 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                jri.m13406b(z, (Object) "position must be in the range (0, 1)");
                if (a <= 1.0f) {
                    z = true;
                } else {
                    z = false;
                }
                jri.m13406b(z, (Object) "position must be in the range (0, 1)");
                i = bpr.mo2078a(canvas.getHeight());
                i2 = canvas.getHeight();
                f2 = bpr.f1439r;
                a3 = (((float) ((i2 - i) / 2)) + ((1.0f - a) * (((float) i) - (f2 + f2)))) + f2;
                a = bpr.f1429h / 2.0f;
                a2 = ((float) bpr.mo2079a(canvas)) - bpr.f1431j;
                f2 = a2 - bpr.f1430i;
                Path path = new Path();
                path.moveTo(a2, a3);
                path.lineTo(f2, a3 - a);
                path.lineTo(f2, a + a3);
                path.lineTo(a2, a3);
                path.close();
                canvas.drawPath(path, bpr.f1422a);
                canvas.drawPath(path, bpr.f1423b);
            }
            if (this.f2470f) {
                bpr = this.f2465a;
                a = this.f2466b;
                a2 = this.f2468d;
                f2 = this.f2469e;
                if (a >= 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                jri.m13396a(z, (Object) "position must be in the range [0, 1]");
                if (a <= 1.0f) {
                    z = true;
                } else {
                    z = false;
                }
                jri.m13396a(z, (Object) "position must be in the range [0, 1]");
                if (a2 >= 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                jri.m13396a(z, (Object) "scale must be in the range [0, 1]");
                if (a2 <= 1.0f) {
                    z = true;
                } else {
                    z = false;
                }
                jri.m13396a(z, (Object) "scale must be in the range [0, 1]");
                if (a2 != 0.0f) {
                    i = bpr.mo2078a(canvas.getHeight());
                    int height = canvas.getHeight();
                    float f3 = bpr.f1434m;
                    float f4 = f3 * a2;
                    f = bpr.f1433l;
                    float f5 = bpr.f1435n;
                    float f6 = bpr.f1439r;
                    a3 = (((float) ((height - i) / 2)) + ((1.0f - a) * (((float) i) - (f6 + f6)))) + f6;
                    a = (f * a2) / 2.0f;
                    float f7 = (bpr.f1432k + f3) - f4;
                    f3 = f7 + f4;
                    f4 = f3 - (f5 * a2);
                    f = a3 - a;
                    a += a3;
                    f5 = bpr.f1436o;
                    Path path2 = new Path();
                    path2.moveTo(f3, a3);
                    path2.lineTo(f4, f);
                    f5 += f7;
                    path2.lineTo(f5, f);
                    path2.quadTo(f7, f, f7, bpr.f1436o + f);
                    path2.lineTo(f7, a - bpr.f1436o);
                    path2.quadTo(f7, a, f5, a);
                    path2.lineTo(f4, a);
                    path2.lineTo(f3, a3);
                    path2.close();
                    canvas.drawPath(path2, bpr.f1422a);
                    canvas.drawPath(path2, bpr.f1423b);
                    String a6 = m1254a(f2);
                    bpr.f1424c.setTextSize(a2 * bpr.f1437p);
                    Rect rect = new Rect();
                    bpr.f1424c.getTextBounds(a6, 0, a6.length(), rect);
                    canvas.drawText(a6, ((f4 - f7) / 2.0f) + f7, a3 + ((float) (rect.height() / 2)), bpr.f1424c);
                }
            }
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f2471g != null) {
            bpr bpr = this.f2465a;
            int i5 = i4 - i2;
            int a = bpr.mo2078a(i5);
            Point point = new Point(((i3 - i) - ((int) bpr.f1427f)) - ((int) (bpr.f1426e / 2.0f)), (i5 - a) / 2);
            point.y -= Math.round(TypedValue.applyDimension(1, 8.0f, getResources().getDisplayMetrics()));
            View view = this.f2471g;
            view.layout(point.x - (view.getMeasuredWidth() / 2), point.y - this.f2471g.getMeasuredHeight(), point.x + (this.f2471g.getMeasuredWidth() / 2), point.y);
        }
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View view = this.f2471g;
        if (view != null) {
            view.measure(MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i), kvl.UNSET_ENUM_VALUE), MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i2), kvl.UNSET_ENUM_VALUE));
        }
    }

    /* renamed from: a */
    public final void mo2587a(boolean z) {
        this.f2473i = z;
        invalidate();
    }

    /* renamed from: b */
    public final void mo2588b(boolean z) {
        this.f2474j = z;
        invalidate();
    }

    /* renamed from: a */
    public final void mo2586a() {
        this.f2472h = true;
        invalidate();
    }
}
