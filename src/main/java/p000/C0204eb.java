package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PathMeasure;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;

/* compiled from: PG */
/* renamed from: eb */
final class C0204eb {
    /* renamed from: a */
    public static final Matrix f3687a = new Matrix();
    /* renamed from: b */
    public Paint f3688b;
    /* renamed from: c */
    public Paint f3689c;
    /* renamed from: d */
    public final C0201dz f3690d;
    /* renamed from: e */
    public float f3691e;
    /* renamed from: f */
    public float f3692f;
    /* renamed from: g */
    public float f3693g;
    /* renamed from: h */
    public float f3694h;
    /* renamed from: i */
    public String f3695i;
    /* renamed from: j */
    public final C0691ih f3696j;
    /* renamed from: k */
    private final Path f3697k;
    /* renamed from: l */
    private final Path f3698l;
    /* renamed from: m */
    private final Matrix f3699m;
    /* renamed from: n */
    private PathMeasure f3700n;
    /* renamed from: o */
    private int f3701o;
    /* renamed from: p */
    private int f3702p;

    public C0204eb() {
        this.f3699m = new Matrix();
        this.f3691e = 0.0f;
        this.f3692f = 0.0f;
        this.f3693g = 0.0f;
        this.f3694h = 0.0f;
        this.f3702p = Illuminant.kOther;
        this.f3695i = null;
        this.f3696j = new C0691ih();
        this.f3690d = new C0201dz();
        this.f3697k = new Path();
        this.f3698l = new Path();
    }

    public C0204eb(C0204eb c0204eb) {
        this.f3699m = new Matrix();
        this.f3691e = 0.0f;
        this.f3692f = 0.0f;
        this.f3693g = 0.0f;
        this.f3694h = 0.0f;
        this.f3702p = Illuminant.kOther;
        this.f3695i = null;
        this.f3696j = new C0691ih();
        this.f3690d = new C0201dz(c0204eb.f3690d, this.f3696j);
        this.f3697k = new Path(c0204eb.f3697k);
        this.f3698l = new Path(c0204eb.f3698l);
        this.f3691e = c0204eb.f3691e;
        this.f3692f = c0204eb.f3692f;
        this.f3693g = c0204eb.f3693g;
        this.f3694h = c0204eb.f3694h;
        this.f3701o = c0204eb.f3701o;
        this.f3702p = c0204eb.f3702p;
        this.f3695i = c0204eb.f3695i;
        String str = c0204eb.f3695i;
        if (str != null) {
            this.f3696j.put(str, this);
        }
    }

    /* renamed from: a */
    final void mo6183a(C0201dz c0201dz, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
        c0201dz.f3573a.set(matrix);
        c0201dz.f3573a.preConcat(c0201dz.f3582j);
        canvas.save();
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 < c0201dz.f3574b.size()) {
                Object obj = c0201dz.f3574b.get(i4);
                if (obj instanceof C0201dz) {
                    mo6183a((C0201dz) obj, c0201dz.f3573a, canvas, i, i2, colorFilter);
                } else if (obj instanceof C0203ea) {
                    C0203ea c0203ea = (C0203ea) obj;
                    float f = ((float) i) / this.f3693g;
                    float f2 = ((float) i2) / this.f3694h;
                    float min = Math.min(f, f2);
                    Matrix matrix2 = c0201dz.f3573a;
                    this.f3699m.set(matrix2);
                    this.f3699m.postScale(f, f2);
                    float[] fArr = new float[]{0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    double hypot = Math.hypot((double) fArr[0], (double) fArr[1]);
                    double hypot2 = Math.hypot((double) fArr[2], (double) fArr[3]);
                    f = (fArr[3] * fArr[0]) - (fArr[1] * fArr[2]);
                    f2 = Math.max((float) hypot, (float) hypot2);
                    if (f2 > 0.0f) {
                        f2 = Math.abs(f) / f2;
                    } else {
                        f2 = 0.0f;
                    }
                    if (f2 != 0.0f) {
                        Path path = this.f3697k;
                        path.reset();
                        C0438qt[] c0438qtArr = c0203ea.f3638n;
                        if (c0438qtArr != null) {
                            C0438qt.m5803a(c0438qtArr, path);
                        }
                        path = this.f3697k;
                        this.f3698l.reset();
                        if (c0203ea.mo6154a()) {
                            this.f3698l.addPath(path, this.f3699m);
                            canvas.clipPath(this.f3698l);
                        } else {
                            C0671dy c0671dy = (C0671dy) c0203ea;
                            float f3 = c0671dy.f16965h;
                            if (!(f3 == 0.0f && c0671dy.f16966i == 1.0f)) {
                                float f4 = c0671dy.f16967j;
                                f3 = (f3 + f4) % 1.0f;
                                f4 = (f4 + c0671dy.f16966i) % 1.0f;
                                if (this.f3700n == null) {
                                    this.f3700n = new PathMeasure();
                                }
                                this.f3700n.setPath(this.f3697k, false);
                                float length = this.f3700n.getLength();
                                f3 *= length;
                                f4 *= length;
                                path.reset();
                                if (f3 > f4) {
                                    this.f3700n.getSegment(f3, length, path, true);
                                    this.f3700n.getSegment(0.0f, f4, path, true);
                                } else {
                                    this.f3700n.getSegment(f3, f4, path, true);
                                }
                                path.rLineTo(0.0f, 0.0f);
                            }
                            this.f3698l.addPath(path, this.f3699m);
                            if (c0671dy.f16961d != 0) {
                                FillType fillType;
                                if (this.f3689c == null) {
                                    this.f3689c = new Paint();
                                    this.f3689c.setStyle(Style.FILL);
                                    this.f3689c.setAntiAlias(true);
                                }
                                Paint paint = this.f3689c;
                                paint.setColor(C0669dw.m9644a(c0671dy.f16961d, c0671dy.f16964g));
                                paint.setColorFilter(colorFilter);
                                Path path2 = this.f3698l;
                                if (c0671dy.f16963f != 0) {
                                    fillType = FillType.EVEN_ODD;
                                } else {
                                    fillType = FillType.WINDING;
                                }
                                path2.setFillType(fillType);
                                canvas.drawPath(this.f3698l, paint);
                            }
                            if (c0671dy.f16959b != 0) {
                                if (this.f3688b == null) {
                                    this.f3688b = new Paint();
                                    this.f3688b.setStyle(Style.STROKE);
                                    this.f3688b.setAntiAlias(true);
                                }
                                Paint paint2 = this.f3688b;
                                Join join = c0671dy.f16969l;
                                if (join != null) {
                                    paint2.setStrokeJoin(join);
                                }
                                Cap cap = c0671dy.f16968k;
                                if (cap != null) {
                                    paint2.setStrokeCap(cap);
                                }
                                paint2.setStrokeMiter(c0671dy.f16970m);
                                paint2.setColor(C0669dw.m9644a(c0671dy.f16959b, c0671dy.f16962e));
                                paint2.setColorFilter(colorFilter);
                                paint2.setStrokeWidth(c0671dy.f16960c * (f2 * min));
                                canvas.drawPath(this.f3698l, paint2);
                            }
                        }
                    }
                }
                i3 = i4 + 1;
            } else {
                canvas.restore();
                return;
            }
        }
    }

    public final float getAlpha() {
        return ((float) getRootAlpha()) / 255.0f;
    }

    public final int getRootAlpha() {
        return this.f3702p;
    }

    public final void setAlpha(float f) {
        setRootAlpha((int) (255.0f * f));
    }

    public final void setRootAlpha(int i) {
        this.f3702p = i;
    }
}
