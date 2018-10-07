package p000;

import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.PointF;
import android.graphics.RectF;

/* compiled from: PG */
/* renamed from: cwd */
public final class cwd {
    /* renamed from: b */
    private static final String f3025b = bli.m887a("PviewTransfmCal");
    /* renamed from: a */
    public iqp f3026a;
    /* renamed from: c */
    private final gci f3027c;
    /* renamed from: d */
    private final gyi f3028d;

    public cwd(gci gci) {
        this.f3027c = gci;
        this.f3028d = null;
    }

    public cwd(gci gci, gyi gyi) {
        this.f3027c = gci;
        this.f3028d = gyi;
    }

    /* renamed from: a */
    public final Matrix mo5875a(iqp iqp, iqp iqp2) {
        Matrix matrix;
        gyi gyi = this.f3028d;
        iqp f;
        RectF rectF;
        Matrix matrix2;
        float min;
        if (gyi == null || !gyi.f19825a.isInMultiWindowMode()) {
            RectF rectF2 = new RectF(0.0f, 0.0f, (float) iqp.f7695a, (float) iqp.f7696b);
            PointF pointF = new PointF(rectF2.centerX(), rectF2.centerY());
            if (this.f3027c.mo7037b()) {
                f = iqp2.mo8819f();
            } else {
                f = iqp2;
            }
            RectF rectF3 = new RectF(0.0f, 0.0f, (float) f.f7695a, (float) f.f7696b);
            PointF pointF2 = new PointF(rectF3.centerX(), rectF3.centerY());
            rectF = new RectF(rectF3);
            rectF.offset(pointF.x - pointF2.x, pointF.y - pointF2.y);
            matrix2 = new Matrix();
            matrix2.setRectToRect(rectF2, rectF, ScaleToFit.FILL);
            matrix2.postRotate((float) this.f3027c.mo7041f().f7692e, pointF.x, pointF.y);
            if (this.f3027c.mo7037b()) {
                f = iqp2.mo8819f();
            } else {
                f = iqp2;
            }
            min = Math.min(((float) iqp.f7695a) / ((float) f.f7695a), ((float) iqp.f7696b) / ((float) f.f7696b));
            matrix2.postScale(min, min, pointF.x, pointF.y);
            rectF2 = new RectF(0.0f, 0.0f, ((float) iqp2.f7695a) * min, min * ((float) iqp2.f7696b));
            pointF2 = new PointF(rectF2.centerX(), rectF2.centerY());
            matrix2.postTranslate(pointF2.x - pointF.x, pointF2.y - pointF.y);
            matrix = matrix2;
        } else {
            float f2;
            rectF = new RectF(0.0f, 0.0f, (float) iqp.f7695a, (float) iqp.f7696b);
            float f3 = ((float) iqp2.f7695a) / ((float) iqp2.f7696b);
            if (this.f3027c.mo7037b()) {
                f = iqp2.mo8819f();
            } else {
                f = iqp2;
            }
            RectF rectF4 = new RectF(0.0f, 0.0f, (float) f.f7695a, (float) f.f7696b);
            float min2 = Math.min(rectF4.width(), rectF4.height());
            RectF rectF5 = new RectF();
            int d = this.f3027c.mo7039d();
            if (d == gcb.f5289a || d == gcb.f5290b) {
                min = (float) ((int) (rectF.width() * f3));
                rectF5.set(0.0f, 0.0f, rectF.width(), min);
                rectF5.offset(0.0f, (-(min - rectF.height())) / 2.0f);
                min /= rectF.height();
                f3 = rectF5.width() / min2;
            } else {
                min = (float) ((int) (rectF.height() * f3));
                rectF5.set(0.0f, 0.0f, min, rectF.height());
                rectF5.offset((-(min - rectF.width())) / 2.0f, 0.0f);
                min /= rectF.width();
                f3 = rectF5.height() / min2;
            }
            String str = f3025b;
            String valueOf = String.valueOf(rectF5);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 46);
            stringBuilder.append("Creating cropping matrix for full Viewfinder: ");
            stringBuilder.append(valueOf);
            bli.m888a(str, stringBuilder.toString());
            RectF rectF6 = new RectF(0.0f, 0.0f, rectF4.width() * f3, f3 * rectF4.height());
            rectF6.offset(rectF5.centerX() - rectF6.centerX(), rectF5.centerY() - rectF6.centerY());
            matrix2 = new Matrix();
            matrix2.setRectToRect(rectF5, rectF6, ScaleToFit.FILL);
            matrix2.postRotate((float) this.f3027c.mo7041f().f7692e, rectF.centerX(), rectF.centerY());
            boolean b = this.f3027c.mo7037b();
            if (b) {
                f2 = min;
            } else {
                f2 = 1.0f;
            }
            if (b) {
                min = 1.0f;
            }
            matrix2.postScale(min, f2, rectF.centerX(), rectF.centerY());
            matrix = matrix2;
        }
        this.f3026a = iqp2;
        return matrix;
    }
}
