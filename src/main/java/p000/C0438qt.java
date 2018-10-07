package p000;

import android.graphics.Path;
import android.util.Log;

/* compiled from: PG */
/* renamed from: qt */
public final class C0438qt {
    /* renamed from: a */
    public char f9591a;
    /* renamed from: b */
    public float[] f9592b;

    C0438qt() {
    }

    public C0438qt(char c, float[] fArr) {
        this.f9591a = c;
        this.f9592b = fArr;
    }

    public C0438qt(C0438qt c0438qt) {
        this.f9591a = c0438qt.f9591a;
        float[] fArr = c0438qt.f9592b;
        this.f9592b = C0437qr.m5797a(fArr, fArr.length);
    }

    /* renamed from: a */
    private static void m5802a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        while (true) {
            double toRadians = Math.toRadians((double) f7);
            double cos = Math.cos(toRadians);
            double sin = Math.sin(toRadians);
            double d = (double) f;
            double d2 = (double) f2;
            double d3 = (double) f5;
            double d4 = ((d * cos) + (d2 * sin)) / d3;
            double d5 = (double) f6;
            double d6 = ((((double) (-f)) * sin) + (d2 * cos)) / d5;
            double d7 = (double) f4;
            double d8 = ((((double) f3) * cos) + (d7 * sin)) / d3;
            double d9 = ((d7 * cos) + (((double) (-f3)) * sin)) / d5;
            d7 = d4 - d8;
            double d10 = d6 - d9;
            double d11 = (d4 + d8) / 2.0d;
            double d12 = (d6 + d9) / 2.0d;
            double d13 = (d7 * d7) + (d10 * d10);
            if (d13 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d14 = (1.0d / d13) - 16.0d;
            if (d14 < 0.0d) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Points are too far apart ");
                stringBuilder.append(d13);
                Log.w("PathParser", stringBuilder.toString());
                float sqrt = (float) (Math.sqrt(d13) / 1.99999d);
                f5 *= sqrt;
                f6 *= sqrt;
            } else {
                boolean z3;
                d13 = Math.sqrt(d14);
                d7 *= d13;
                d10 *= d13;
                if (z == z2) {
                    d10 = d11 - d10;
                    d7 += d12;
                } else {
                    d10 += d11;
                    d7 = d12 - d7;
                }
                d6 = Math.atan2(d6 - d7, d4 - d10);
                d4 = Math.atan2(d9 - d7, d8 - d10) - d6;
                if (d4 < 0.0d) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z2 != z3) {
                    if (d4 > 0.0d) {
                        d4 -= 0.7146018366025517d;
                    } else {
                        d4 += 6.283185307179586d;
                    }
                }
                d10 *= d3;
                d7 *= d5;
                d9 = (d10 * cos) - (d7 * sin);
                d11 = (d10 * sin) + (d7 * cos);
                int ceil = (int) Math.ceil(Math.abs((4.0d * d4) / 3.141592653589793d));
                d13 = Math.cos(toRadians);
                d14 = Math.sin(toRadians);
                d7 = Math.cos(d6);
                d8 = Math.sin(d6);
                toRadians = -d3;
                double d15 = toRadians * d13;
                double d16 = d5 * d14;
                d10 = (d15 * d8) - (d16 * d7);
                double d17 = toRadians * d14;
                double d18 = d5 * d13;
                double d19 = d4 / ((double) ceil);
                cos = d;
                int i = 0;
                d4 = d6;
                d6 = d2;
                double d20 = (d7 * d18) + (d8 * d17);
                d7 = d10;
                d10 = d20;
                while (i < ceil) {
                    d8 = d4 + d19;
                    d2 = Math.sin(d8);
                    double cos2 = Math.cos(d8);
                    sin = (((d3 * d13) * cos2) + d9) - (d16 * d2);
                    toRadians = (d18 * d2) + (((d3 * d14) * cos2) + d11);
                    d = (d15 * d2) - (d16 * cos2);
                    d2 = (d2 * d17) + (cos2 * d18);
                    d4 = d8 - d4;
                    cos2 = Math.tan(d4 / 2.0d);
                    d4 = (Math.sin(d4) * (Math.sqrt((cos2 * (3.0d * cos2)) + 4.0d) - 4.0d)) / 3.0d;
                    path.rLineTo(0.0f, 0.0f);
                    path.cubicTo((float) ((d7 * d4) + cos), (float) ((d10 * d4) + d6), (float) (sin - (d4 * d)), (float) (toRadians - (d4 * d2)), (float) sin, (float) toRadians);
                    d10 = d2;
                    d4 = d8;
                    d6 = toRadians;
                    cos = sin;
                    i++;
                    d7 = d;
                }
                return;
            }
        }
    }

    /* renamed from: a */
    public static void m5803a(C0438qt[] c0438qtArr, Path path) {
        float[] fArr = new float[6];
        char c = 'm';
        int i = 0;
        while (true) {
            int i2 = i;
            char c2 = c;
            if (i2 < c0438qtArr.length) {
                int i3;
                float f;
                C0438qt c0438qt = c0438qtArr[i2];
                char c3 = c0438qt.f9591a;
                float[] fArr2 = c0438qt.f9592b;
                float f2 = fArr[0];
                float f3 = fArr[1];
                float f4 = fArr[2];
                float f5 = fArr[3];
                float f6 = fArr[4];
                float f7 = fArr[5];
                switch (c3) {
                    case 'A':
                    case 'a':
                        i3 = 7;
                        f = f2;
                        f2 = f3;
                        f3 = f4;
                        f4 = f5;
                        break;
                    case 'C':
                    case 'c':
                        i3 = 6;
                        f = f2;
                        f2 = f3;
                        f3 = f4;
                        f4 = f5;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i3 = 1;
                        f = f2;
                        f2 = f3;
                        f3 = f4;
                        f4 = f5;
                        break;
                    case 'L':
                    case 'M':
                    case 'T':
                    case 'l':
                    case 'm':
                    case 't':
                        i3 = 2;
                        f = f2;
                        f2 = f3;
                        f3 = f4;
                        f4 = f5;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i3 = 4;
                        f = f2;
                        f2 = f3;
                        f3 = f4;
                        f4 = f5;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path.moveTo(f6, f7);
                        f5 = f7;
                        f4 = f6;
                        f3 = f7;
                        f2 = f6;
                        break;
                }
                i3 = 2;
                f = f2;
                f2 = f3;
                f3 = f4;
                f4 = f5;
                int i4 = 0;
                float f8 = f7;
                float f9 = f6;
                float f10 = f2;
                float f11 = f;
                f5 = f3;
                char c4 = c2;
                while (true) {
                    float f12 = f4;
                    if (i4 < fArr2.length) {
                        int i5;
                        int i6;
                        boolean z;
                        boolean z2;
                        int i7;
                        int i8;
                        int i9;
                        int i10;
                        int i11;
                        switch (c3) {
                            case 'A':
                                i5 = i4 + 5;
                                f4 = fArr2[i5];
                                i6 = i4 + 6;
                                f6 = fArr2[i6];
                                f3 = fArr2[i4];
                                f2 = fArr2[i4 + 1];
                                f = fArr2[i4 + 2];
                                if (fArr2[i4 + 3] != 0.0f) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (fArr2[i4 + 4] != 0.0f) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                C0438qt.m5802a(path, f11, f10, f4, f6, f3, f2, f, z, z2);
                                f5 = fArr2[i5];
                                f12 = fArr2[i6];
                                f4 = f5;
                                f7 = f8;
                                f6 = f9;
                                f2 = f5;
                                f3 = f12;
                                f5 = f12;
                                break;
                            case 'C':
                                i7 = i4 + 2;
                                i8 = i4 + 3;
                                i9 = i4 + 4;
                                int i12 = i4 + 5;
                                path.cubicTo(fArr2[i4], fArr2[i4 + 1], fArr2[i7], fArr2[i8], fArr2[i9], fArr2[i12]);
                                f6 = fArr2[i9];
                                f7 = fArr2[i12];
                                f4 = fArr2[i7];
                                f2 = f6;
                                f3 = f7;
                                f6 = f9;
                                f5 = fArr2[i8];
                                f7 = f8;
                                break;
                            case 'H':
                                path.lineTo(fArr2[i4], f10);
                                f11 = fArr2[i4];
                                break;
                            case 'L':
                                i10 = i4 + 1;
                                path.lineTo(fArr2[i4], fArr2[i10]);
                                f4 = f5;
                                f2 = fArr2[i4];
                                f3 = fArr2[i10];
                                f6 = f9;
                                f5 = f12;
                                f7 = f8;
                                break;
                            case 'M':
                                f6 = fArr2[i4];
                                f7 = fArr2[i4 + 1];
                                if (i4 <= 0) {
                                    path.moveTo(f6, f7);
                                    f4 = f5;
                                    f2 = f6;
                                    f3 = f7;
                                    f5 = f12;
                                    break;
                                }
                                path.lineTo(f6, f7);
                                f4 = f5;
                                f2 = f6;
                                f3 = f7;
                                f6 = f9;
                                f5 = f12;
                                f7 = f8;
                                break;
                            case 'Q':
                                i = i4 + 1;
                                i10 = i4 + 2;
                                i11 = i4 + 3;
                                path.quadTo(fArr2[i4], fArr2[i], fArr2[i10], fArr2[i11]);
                                f5 = fArr2[i4];
                                f12 = fArr2[i];
                                f6 = fArr2[i10];
                                f7 = fArr2[i11];
                                f4 = f5;
                                f2 = f6;
                                f3 = f7;
                                f6 = f9;
                                f5 = f12;
                                f7 = f8;
                                break;
                            case 'S':
                                if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                    f5 = (f11 + f11) - f5;
                                    f7 = (f10 + f10) - f12;
                                } else {
                                    f7 = f10;
                                    f5 = f11;
                                }
                                i7 = i4 + 1;
                                i8 = i4 + 2;
                                i9 = i4 + 3;
                                path.cubicTo(f5, f7, fArr2[i4], fArr2[i7], fArr2[i8], fArr2[i9]);
                                f5 = fArr2[i4];
                                f12 = fArr2[i7];
                                f4 = f5;
                                f2 = fArr2[i8];
                                f3 = fArr2[i9];
                                f6 = f9;
                                f5 = f12;
                                f7 = f8;
                                break;
                            case 'T':
                                if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                    f11 = (f11 + f11) - f5;
                                    f10 = (f10 + f10) - f12;
                                }
                                i = i4 + 1;
                                path.quadTo(f11, f10, fArr2[i4], fArr2[i]);
                                f5 = f10;
                                f4 = f11;
                                f2 = fArr2[i4];
                                f3 = fArr2[i];
                                f7 = f8;
                                f6 = f9;
                                break;
                            case 'V':
                                path.lineTo(f11, fArr2[i4]);
                                f4 = f5;
                                f6 = f9;
                                f2 = f11;
                                f3 = fArr2[i4];
                                f7 = f8;
                                f5 = f12;
                                break;
                            case 'a':
                                i5 = i4 + 5;
                                f4 = fArr2[i5] + f11;
                                i6 = i4 + 6;
                                f6 = fArr2[i6] + f10;
                                f3 = fArr2[i4];
                                f2 = fArr2[i4 + 1];
                                f = fArr2[i4 + 2];
                                if (fArr2[i4 + 3] != 0.0f) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (fArr2[i4 + 4] != 0.0f) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                C0438qt.m5802a(path, f11, f10, f4, f6, f3, f2, f, z, z2);
                                f5 = f11 + fArr2[i5];
                                f12 = fArr2[i6] + f10;
                                f4 = f5;
                                f7 = f8;
                                f6 = f9;
                                f2 = f5;
                                f3 = f12;
                                f5 = f12;
                                break;
                            case 'c':
                                i7 = i4 + 2;
                                i8 = i4 + 3;
                                i9 = i4 + 4;
                                i5 = i4 + 5;
                                path.rCubicTo(fArr2[i4], fArr2[i4 + 1], fArr2[i7], fArr2[i8], fArr2[i9], fArr2[i5]);
                                f4 = f11 + fArr2[i7];
                                f2 = f11 + fArr2[i9];
                                f3 = fArr2[i5] + f10;
                                f6 = f9;
                                f5 = fArr2[i8] + f10;
                                f7 = f8;
                                break;
                            case 'h':
                                path.rLineTo(fArr2[i4], 0.0f);
                                f11 += fArr2[i4];
                                break;
                            case 'l':
                                i10 = i4 + 1;
                                path.rLineTo(fArr2[i4], fArr2[i10]);
                                f4 = f5;
                                f2 = f11 + fArr2[i4];
                                f3 = fArr2[i10] + f10;
                                f6 = f9;
                                f5 = f12;
                                f7 = f8;
                                break;
                            case 'm':
                                f4 = fArr2[i4];
                                f6 = f11 + f4;
                                f3 = fArr2[i4 + 1];
                                f7 = f10 + f3;
                                if (i4 <= 0) {
                                    path.rMoveTo(f4, f3);
                                    f4 = f5;
                                    f2 = f6;
                                    f3 = f7;
                                    f5 = f12;
                                    break;
                                }
                                path.rLineTo(f4, f3);
                                f4 = f5;
                                f2 = f6;
                                f3 = f7;
                                f6 = f9;
                                f5 = f12;
                                f7 = f8;
                                break;
                            case 'q':
                                i = i4 + 1;
                                i10 = i4 + 2;
                                i11 = i4 + 3;
                                path.rQuadTo(fArr2[i4], fArr2[i], fArr2[i10], fArr2[i11]);
                                f4 = fArr2[i4] + f11;
                                f2 = f11 + fArr2[i10];
                                f3 = fArr2[i11] + f10;
                                f6 = f9;
                                f5 = fArr2[i] + f10;
                                f7 = f8;
                                break;
                            case 's':
                                if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                    f5 = f11 - f5;
                                    f7 = f10 - f12;
                                } else {
                                    f5 = 0.0f;
                                    f7 = 0.0f;
                                }
                                i7 = i4 + 1;
                                i8 = i4 + 2;
                                i9 = i4 + 3;
                                path.rCubicTo(f5, f7, fArr2[i4], fArr2[i7], fArr2[i8], fArr2[i9]);
                                f4 = f11 + fArr2[i4];
                                f2 = f11 + fArr2[i8];
                                f3 = fArr2[i9] + f10;
                                f6 = f9;
                                f5 = fArr2[i7] + f10;
                                f7 = f8;
                                break;
                            case 't':
                                if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                    f5 = f11 - f5;
                                    f12 = f10 - f12;
                                } else {
                                    f5 = 0.0f;
                                    f12 = 0.0f;
                                }
                                i10 = i4 + 1;
                                path.rQuadTo(f5, f12, fArr2[i4], fArr2[i10]);
                                f4 = f5 + f11;
                                f2 = f11 + fArr2[i4];
                                f3 = fArr2[i10] + f10;
                                f6 = f9;
                                f5 = f12 + f10;
                                f7 = f8;
                                break;
                            case 'v':
                                path.rLineTo(0.0f, fArr2[i4]);
                                f4 = f5;
                                f6 = f9;
                                f2 = f11;
                                f3 = fArr2[i4] + f10;
                                f7 = f8;
                                f5 = f12;
                                break;
                        }
                        f4 = f5;
                        f7 = f8;
                        f6 = f9;
                        f2 = f11;
                        f3 = f10;
                        f5 = f12;
                        i4 += i3;
                        f8 = f7;
                        f9 = f6;
                        f10 = f3;
                        f11 = f2;
                        f12 = f5;
                        c4 = c3;
                    } else {
                        fArr[0] = f11;
                        fArr[1] = f10;
                        fArr[2] = f5;
                        fArr[3] = f12;
                        fArr[4] = f9;
                        fArr[5] = f8;
                        c = c0438qtArr[i2].f9591a;
                        i = i2 + 1;
                    }
                }
            } else {
                return;
            }
        }
    }
}
