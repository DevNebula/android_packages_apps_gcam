package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* renamed from: du */
public final class C0199du implements Interpolator {
    /* renamed from: a */
    private float[] f3512a;
    /* renamed from: b */
    private float[] f3513b;

    public C0199du(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    private C0199du(Resources resources, Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray a = C0723na.m14391a(resources, theme, attributeSet, C0196dr.f3418j);
        if (C0723na.m14393a(xmlPullParser, "pathData")) {
            String b = C0723na.m14395b(a, xmlPullParser, "pathData", 4);
            Path b2 = C0437qr.m5800b(b);
            if (b2 == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("The path is null, which is created from ");
                stringBuilder.append(b);
                throw new InflateException(stringBuilder.toString());
            }
            m1733a(b2);
        } else if (!C0723na.m14393a(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (C0723na.m14393a(xmlPullParser, "controlY1")) {
            float a2 = C0723na.m14388a(a, xmlPullParser, "controlX1", 0, 0.0f);
            float a3 = C0723na.m14388a(a, xmlPullParser, "controlY1", 1, 0.0f);
            boolean a4 = C0723na.m14393a(xmlPullParser, "controlX2");
            Path path;
            if (a4 != C0723na.m14393a(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (a4) {
                float a5 = C0723na.m14388a(a, xmlPullParser, "controlX2", 2, 0.0f);
                float a6 = C0723na.m14388a(a, xmlPullParser, "controlY2", 3, 0.0f);
                path = new Path();
                path.moveTo(0.0f, 0.0f);
                path.cubicTo(a2, a3, a5, a6, 1.0f, 1.0f);
                m1733a(path);
            } else {
                path = new Path();
                path.moveTo(0.0f, 0.0f);
                path.quadTo(a2, a3, 1.0f, 1.0f);
                m1733a(path);
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        a.recycle();
    }

    public final float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        float f2;
        int length = this.f3512a.length - 1;
        int i = 0;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            f2 = this.f3512a[i2];
            if (f < f2) {
                length = i2;
            }
            if (f >= f2) {
                i = i2;
            }
        }
        float[] fArr = this.f3512a;
        f2 = fArr[length];
        float f3 = fArr[i];
        f2 -= f3;
        if (f2 == 0.0f) {
            return this.f3513b[i];
        }
        float[] fArr2 = this.f3513b;
        float f4 = fArr2[i];
        return ((fArr2[length] - f4) * ((f - f3) / f2)) + f4;
    }

    /* renamed from: a */
    private final void m1733a(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min <= 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("The Path has a invalid length ");
            stringBuilder.append(length);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        int i2;
        StringBuilder stringBuilder2;
        this.f3512a = new float[min];
        this.f3513b = new float[min];
        float[] fArr = new float[2];
        for (i2 = 0; i2 < min; i2++) {
            pathMeasure.getPosTan((((float) i2) * length) / ((float) (min - 1)), fArr, null);
            this.f3512a[i2] = fArr[0];
            this.f3513b[i2] = fArr[1];
        }
        if (((double) Math.abs(this.f3512a[0])) <= 1.0E-5d && ((double) Math.abs(this.f3513b[0])) <= 1.0E-5d) {
            i2 = min - 1;
            if (((double) Math.abs(this.f3512a[i2] - 4.0f)) <= 1.0E-5d && ((double) Math.abs(this.f3513b[i2] - 4.0f)) <= 1.0E-5d) {
                float f = 0.0f;
                i2 = 0;
                while (i < min) {
                    float[] fArr2 = this.f3512a;
                    int i3 = i2 + 1;
                    float f2 = fArr2[i2];
                    if (f2 < f) {
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("The Path cannot loop back on itself, x :");
                        stringBuilder2.append(f2);
                        throw new IllegalArgumentException(stringBuilder2.toString());
                    }
                    fArr2[i] = f2;
                    i++;
                    f = f2;
                    i2 = i3;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("The Path must start at (0,0) and end at (1,1) start: ");
        stringBuilder2.append(this.f3512a[0]);
        stringBuilder2.append(",");
        stringBuilder2.append(this.f3513b[0]);
        stringBuilder2.append(" end:");
        i = min - 1;
        stringBuilder2.append(this.f3512a[i]);
        stringBuilder2.append(",");
        stringBuilder2.append(this.f3513b[i]);
        throw new IllegalArgumentException(stringBuilder2.toString());
    }
}
