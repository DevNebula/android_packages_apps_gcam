package p000;

import android.graphics.Rect;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ggq */
public class ggq extends ggr {
    /* renamed from: b */
    private static final String f19161b = bli.m887a("TaskRGBPreview");
    /* renamed from: a */
    public final iqp f19162a;
    /* renamed from: i */
    private final int f19163i;
    /* renamed from: j */
    private final ird f19164j;

    ggq(gfw gfw, Executor executor, gfv gfv, int i, get get, iqp iqp, int i2, ird ird) {
        super(gfw, executor, gfv, i, get);
        this.f19162a = iqp;
        this.f19163i = i2;
        this.f19164j = ird;
    }

    /* renamed from: a */
    protected static ggt m11272a(gfw gfw) {
        return new ggt(gfw.f5388c, gfw.f5387b.mo13745g(), gfw.f5387b.mo13742d());
    }

    /* renamed from: a */
    private static int m11271a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return ((((i5 / i3) * i8) + ((i6 / i3) * i7)) + ((i2 / i4) * i5)) + ((i / i4) * i6);
    }

    /* renamed from: a */
    protected final ggt mo13345a(gfw gfw, int i) {
        int width;
        int height;
        Rect a = ggr.m2597a(gfw.f5387b, gfw.f5391f);
        if (this.f19163i == C0252go.f5819aR) {
            width = a.width() / i;
            height = a.height() / i;
        } else {
            height = ggq.m11270a(a.width() / i, a.height() / i);
            height += height;
            width = height;
        }
        return new ggt(gfw.f5388c, width, height);
    }

    /* renamed from: a */
    private final int[] m11273a(iwz iwz, Rect rect, int i, boolean z) {
        Rect a = ggr.m2597a(iwz, rect);
        List e = iwz.mo13743e();
        int size;
        StringBuilder stringBuilder;
        if (e.size() != 3) {
            size = e.size();
            stringBuilder = new StringBuilder(57);
            stringBuilder.append("Incorrect number planes (");
            stringBuilder.append(size);
            stringBuilder.append(") in YUV Image Object");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int width = a.width() / i;
        size = a.height() / i;
        ByteBuffer a2 = ((ixa) e.get(0)).mo9144a();
        ByteBuffer a3 = ((ixa) e.get(1)).mo9144a();
        ByteBuffer a4 = ((ixa) e.get(2)).mo9144a();
        int c = ((ixa) e.get(0)).mo9146c() * i;
        int c2 = ((ixa) e.get(1)).mo9146c() * i;
        int c3 = ((ixa) e.get(2)).mo9146c() * i;
        int b = ((ixa) e.get(0)).mo9145b() * i;
        int b2 = ((ixa) e.get(1)).mo9145b() * i;
        int b3 = ((ixa) e.get(2)).mo9145b() * i;
        int i11 = a.top / 2;
        int i12 = i11 + i11;
        i11 = a.left / 2;
        int i13 = i11 + i11;
        if (z) {
            i11 = ggq.m11270a(width, size);
            i2 = (i11 * i11) << 2;
            i3 = i11 + i11;
            if (width > size) {
                i4 = width / 2;
                i5 = (i4 - i11) / 2;
                i11 = (i11 + i4) / 2;
                i6 = i5 + i5;
                i5 = i11 + i11;
                i4 = 0;
                i11 = size;
            } else {
                i5 = size / 2;
                i4 = (i5 - i11) / 2;
                i4 += i4;
                i11 = (i11 + i5) / 2;
                i11 += i11;
                i6 = 0;
                i5 = width;
            }
            i7 = i11;
            i8 = i4;
            i9 = i5;
            i10 = i3;
            i4 = i2;
            i11 = i6;
        } else {
            i11 = width / 2;
            i5 = i11 + i11;
            i11 = size / 2;
            i7 = i11 + i11;
            i8 = 0;
            i9 = i5;
            i10 = width;
            i4 = width * size;
            i11 = 0;
        }
        int[] iArr = new int[i4];
        mo13347a("TIMER_BEGIN Starting Native Java YUV420-to-RGB Rectangular Conversion");
        stringBuilder = new StringBuilder(38);
        stringBuilder.append("\t Y-Plane Size=");
        stringBuilder.append(width);
        stringBuilder.append("x");
        stringBuilder.append(size);
        mo13347a(stringBuilder.toString());
        i4 = ((ixa) e.get(1)).mo9146c();
        size = ((ixa) e.get(1)).mo9145b();
        StringBuilder stringBuilder2 = new StringBuilder(51);
        stringBuilder2.append("\t U-Plane Size=");
        stringBuilder2.append(i4);
        stringBuilder2.append(" Pixel Stride=");
        stringBuilder2.append(size);
        mo13347a(stringBuilder2.toString());
        i4 = ((ixa) e.get(2)).mo9146c();
        size = ((ixa) e.get(2)).mo9145b();
        stringBuilder2 = new StringBuilder(51);
        stringBuilder2.append("\t V-Plane Size=");
        stringBuilder2.append(i4);
        stringBuilder2.append(" Pixel Stride=");
        stringBuilder2.append(size);
        mo13347a(stringBuilder2.toString());
        for (size = i8; size < i7; size += 2) {
            int i14 = (size - i8) * i10;
            int a5 = ggq.m11271a(i11, size, i, 1, c, b, i13, i12);
            int i15 = i13 / 2;
            int i16 = i12 / 2;
            i5 = ggq.m11271a(i11, size, i, 2, c2, b2, i15, i16);
            i6 = i11;
            i2 = ggq.m11271a(i11, size, i, 2, c3, b3, i15, i16);
            i3 = i5;
            i15 = a5;
            i16 = i14;
            while (i6 < i9) {
                i4 = (a3.get(i3) & Illuminant.kOther) - 128;
                i5 = (a4.get(i2) & Illuminant.kOther) - 128;
                int i17 = (i5 * 358) >> 8;
                int i18 = ((i5 * -182) + (i4 * -88)) >> 8;
                int i19 = (i4 * 453) >> 8;
                i5 = a2.get(i15) & Illuminant.kOther;
                width = i5 + i18;
                i4 = i5 + i19;
                i5 += i17;
                if (width < 0) {
                    width = 0;
                }
                if (i5 < 0) {
                    i5 = 0;
                }
                if (i4 < 0) {
                    i4 = 0;
                }
                if (width > 255) {
                    width = Illuminant.kOther;
                }
                if (i5 > 255) {
                    i5 = Illuminant.kOther;
                }
                if (i4 > 255) {
                    i4 = Illuminant.kOther;
                }
                iArr[i16] = ((i4 & Illuminant.kOther) | (((i5 & Illuminant.kOther) << 16) | ((width & Illuminant.kOther) << 8))) | -16777216;
                i5 = a2.get(i15 + b) & Illuminant.kOther;
                width = i5 + i18;
                i4 = i5 + i19;
                i5 += i17;
                if (width < 0) {
                    width = 0;
                }
                if (i5 < 0) {
                    i5 = 0;
                }
                if (i4 < 0) {
                    i4 = 0;
                }
                if (width > 255) {
                    width = Illuminant.kOther;
                }
                if (i5 > 255) {
                    i5 = Illuminant.kOther;
                }
                if (i4 > 255) {
                    i4 = Illuminant.kOther;
                }
                iArr[i16 + 1] = ((i4 & Illuminant.kOther) | (((i5 & Illuminant.kOther) << 16) | ((width & Illuminant.kOther) << 8))) | -16777216;
                int i20 = i15 + c;
                i5 = a2.get(i20) & Illuminant.kOther;
                width = i5 + i18;
                i4 = i5 + i19;
                i5 += i17;
                if (width < 0) {
                    width = 0;
                }
                if (i5 < 0) {
                    i5 = 0;
                }
                if (i4 < 0) {
                    i4 = 0;
                }
                if (width > 255) {
                    width = Illuminant.kOther;
                }
                if (i5 > 255) {
                    i5 = Illuminant.kOther;
                }
                if (i4 > 255) {
                    i4 = Illuminant.kOther;
                }
                int i21 = i16 + i10;
                iArr[i21] = ((i4 & Illuminant.kOther) | (((i5 & Illuminant.kOther) << 16) | ((width & Illuminant.kOther) << 8))) | -16777216;
                i5 = a2.get(i20 + b) & Illuminant.kOther;
                width = i5 + i18;
                i4 = i5 + i19;
                i5 += i17;
                if (width < 0) {
                    width = 0;
                }
                if (i5 < 0) {
                    i5 = 0;
                }
                if (i4 < 0) {
                    i4 = 0;
                }
                if (width > 255) {
                    width = Illuminant.kOther;
                }
                if (i5 > 255) {
                    i5 = Illuminant.kOther;
                }
                if (i4 > 255) {
                    i4 = Illuminant.kOther;
                }
                iArr[i21 + 1] = ((i4 & Illuminant.kOther) | (((i5 & Illuminant.kOther) << 16) | ((width & Illuminant.kOther) << 8))) | -16777216;
                i4 = i6 + 2;
                i2 += b3;
                i3 += b2;
                i16 += 2;
                i15 += b + b;
                i6 = i4;
            }
        }
        mo13347a("TIMER_END Starting Native Java YUV420-to-RGB Rectangular Conversion");
        return iArr;
    }

    /* renamed from: a */
    private static int m11270a(int i, int i2) {
        return (Math.min(i2, i) / 2) + 1;
    }

    /* renamed from: a */
    public void mo13347a(String str) {
        bli.m896d(f19161b, str);
    }

    /* renamed from: a */
    public final void mo13346a(ggt ggt, int[] iArr, int i) {
        this.f5401c.mo7118b().mo7115a(new ggu(this.f5403e, ggt, i), new ggv(iArr));
    }

    public void run() {
        int min;
        int min2;
        this.f19164j.mo8856a(f19161b);
        gfw gfw = (gfw) jri.m13404b(this.f5405g);
        Rect a = ggr.m2597a(gfw.f5387b, gfw.f5391f);
        ggq.m11272a(gfw);
        iqp iqp = new iqp(a.width(), a.height());
        if (this.f19163i == C0252go.f5817aP || this.f19163i == C0252go.f5818aQ) {
            iqp iqp2 = this.f19162a;
            min = Math.min(iqp.f7695a / iqp2.f7695a, iqp.f7696b / iqp2.f7696b);
            if (min > 0) {
                min2 = Math.min(iqp.f7695a, iqp.f7696b);
                while (min >= 2) {
                    if (fzb.m11106a(min2, min)) {
                        break;
                    }
                    min--;
                }
                min = 2;
            } else {
                min = 1;
            }
        } else {
            min = fzb.m11105a(iqp, this.f19162a);
        }
        ggt a2 = mo13345a(gfw, min);
        try {
            mo7122a(this.f5403e, a2, C0252go.f5823aV);
            min2 = gfw.f5387b.mo13745g() / min;
            int d = gfw.f5387b.mo13742d() / min;
            StringBuilder stringBuilder = new StringBuilder(102);
            stringBuilder.append("TIMER_END Rendering preview YUV buffer available, w=");
            stringBuilder.append(min2);
            stringBuilder.append(" h=");
            stringBuilder.append(d);
            stringBuilder.append(" of subsample ");
            stringBuilder.append(min);
            mo13347a(stringBuilder.toString());
            int[] a3 = mo13348a(gfw.f5387b, a, min);
            mo13346a(a2, a3, C0252go.f5823aV);
            this.f19164j.mo8857b();
        } finally {
            a2 = this.f5401c;
            a2.mo7116a(gfw.f5387b, this.f5402d);
        }
    }

    /* renamed from: a */
    protected final int[] mo13348a(iwz iwz, Rect rect, int i) {
        int a;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        Rect a2;
        StringBuilder stringBuilder;
        int a3;
        switch (this.f19163i - 1) {
            case 0:
                mo13347a("RUNNING DUMMY dummyColorInscribedDataCircleFromYuvImage");
                a = ggq.m11270a(iwz.mo13745g() / i, iwz.mo13742d() / i);
                i2 = (a * a) << 2;
                iArr = new int[i2];
                for (i3 = 0; i3 < i2; i3++) {
                    i4 = a + a;
                    iArr[i3] = (((i3 / i4) & Illuminant.kOther) << 8) | ((((i3 % i4) & Illuminant.kOther) << 16) | -16777216);
                }
                return iArr;
            case 1:
                a2 = ggr.m2597a(iwz, rect);
                List e = iwz.mo13743e();
                if (e.size() != 3) {
                    i3 = e.size();
                    stringBuilder = new StringBuilder(57);
                    stringBuilder.append("Incorrect number planes (");
                    stringBuilder.append(i3);
                    stringBuilder.append(") in YUV Image Object");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                mo13347a("TIMER_BEGIN Starting Native JNI YUV420-to-RGB Circular Conversion");
                a3 = ggq.m11270a(a2.width() / i, a2.height() / i);
                iArr = new int[((a3 * a3) << 2)];
                mo13347a("TIMER_END Starting Native JNI YUV420-to-RGB Circular Conversion");
                return iArr;
            case 2:
                a2 = ggr.m2597a(iwz, rect);
                List e2 = iwz.mo13743e();
                if (e2.size() != 3) {
                    i3 = e2.size();
                    stringBuilder = new StringBuilder(57);
                    stringBuilder.append("Incorrect number planes (");
                    stringBuilder.append(i3);
                    stringBuilder.append(") in YUV Image Object");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                int i5;
                int i6;
                int i7;
                i2 = a2.width() / i;
                a = a2.height() / i;
                int a4 = ggq.m11270a(i2, a);
                i3 = a2.top / 2;
                int i8 = i3 + i3;
                a3 = a2.left / 2;
                int i9 = a3 + a3;
                if (i2 > a) {
                    a3 = i2 / 2;
                    i3 = (a3 - a4) / 2;
                    a3 = (a3 + a4) / 2;
                    i5 = a;
                    i6 = 0;
                    i7 = a3 + a3;
                    a3 = i3 + i3;
                } else {
                    a3 = a / 2;
                    i3 = (a3 - a4) / 2;
                    a3 = (a3 + a4) / 2;
                    i5 = a3 + a3;
                    i6 = i3 + i3;
                    i7 = i2;
                    a3 = 0;
                }
                ByteBuffer a5 = ((ixa) e2.get(0)).mo9144a();
                ByteBuffer a6 = ((ixa) e2.get(1)).mo9144a();
                ByteBuffer a7 = ((ixa) e2.get(2)).mo9144a();
                int c = ((ixa) e2.get(0)).mo9146c() * i;
                i4 = ((ixa) e2.get(1)).mo9146c() * i;
                int c2 = ((ixa) e2.get(2)).mo9146c() * i;
                int b = ((ixa) e2.get(0)).mo9145b() * i;
                int b2 = ((ixa) e2.get(1)).mo9145b() * i;
                int b3 = ((ixa) e2.get(2)).mo9145b() * i;
                int i10 = a4 + a4;
                int i11 = a / 2;
                int i12 = i2 / 2;
                int i13 = a4 * a4;
                int[] iArr2 = new int[(i13 << 2)];
                mo13347a("TIMER_BEGIN Starting Native Java YUV420-to-RGB Circular Conversion");
                StringBuilder stringBuilder2 = new StringBuilder(38);
                stringBuilder2.append("\t Y-Plane Size=");
                stringBuilder2.append(i2);
                stringBuilder2.append("x");
                stringBuilder2.append(a);
                mo13347a(stringBuilder2.toString());
                a = ((ixa) e2.get(1)).mo9146c();
                i3 = ((ixa) e2.get(1)).mo9145b();
                StringBuilder stringBuilder3 = new StringBuilder(51);
                stringBuilder3.append("\t U-Plane Size=");
                stringBuilder3.append(a);
                stringBuilder3.append(" Pixel Stride=");
                stringBuilder3.append(i3);
                mo13347a(stringBuilder3.toString());
                a = ((ixa) e2.get(2)).mo9146c();
                i3 = ((ixa) e2.get(2)).mo9145b();
                stringBuilder3 = new StringBuilder(51);
                stringBuilder3.append("\t V-Plane Size=");
                stringBuilder3.append(a);
                stringBuilder3.append(" Pixel Stride=");
                stringBuilder3.append(i3);
                mo13347a(stringBuilder3.toString());
                for (i3 = i6; i3 < i5; i3 += 2) {
                    int i14 = (i3 - i6) * i10;
                    int a8 = ggq.m11271a(a3, i3, i, 1, c, b, i9, i8);
                    int i15 = i9 / 2;
                    a4 = i8 / 2;
                    i2 = ggq.m11271a(a3, i3, i, 2, i4, b2, i15, a4);
                    a = ggq.m11271a(a3, i3, i, 2, c2, b3, i15, a4);
                    i15 = i3 - i11;
                    i15 = (int) (Math.sqrt((double) ((float) (i13 - (i15 * i15)))) + 0.5d);
                    int i16 = i12 - i15;
                    int i17 = i12 + i15;
                    i15 = (i3 + 1) - i11;
                    i15 = (int) (Math.sqrt((double) ((float) (i13 - (i15 * i15)))) + 0.5d);
                    int i18 = i12 - i15;
                    int i19 = i12 + i15;
                    int i20 = a3;
                    int i21 = a;
                    int i22 = i2;
                    int i23 = a8;
                    int i24 = i14;
                    while (i20 < i7) {
                        if (i20 <= i17 || i20 <= i19) {
                            a8 = i20 + 1;
                            if (a8 >= i16 || i20 >= i18) {
                                a = (a6.get(i22) & Illuminant.kOther) - 128;
                                i2 = (a7.get(i21) & Illuminant.kOther) - 128;
                                i14 = (i2 * 358) >> 8;
                                int i25 = ((i2 * -182) + (a * -88)) >> 8;
                                int i26 = (a * 453) >> 8;
                                if (i20 > i17 || i20 < i16) {
                                    iArr2[i24] = 0;
                                } else {
                                    a = i20 == i17 ? kvl.UNSET_ENUM_VALUE : i20 != i16 ? -16777216 : kvl.UNSET_ENUM_VALUE;
                                    i15 = a5.get(i23) & Illuminant.kOther;
                                    a4 = i15 + i25;
                                    i2 = i15 + i26;
                                    i15 += i14;
                                    if (a4 < 0) {
                                        a4 = 0;
                                    }
                                    if (i15 < 0) {
                                        i15 = 0;
                                    }
                                    if (i2 < 0) {
                                        i2 = 0;
                                    }
                                    if (a4 > 255) {
                                        a4 = Illuminant.kOther;
                                    }
                                    if (i15 > 255) {
                                        i15 = Illuminant.kOther;
                                    }
                                    if (i2 > 255) {
                                        i2 = Illuminant.kOther;
                                    }
                                    iArr2[i24] = a | ((i2 & Illuminant.kOther) | (((i15 & Illuminant.kOther) << 16) | ((a4 & Illuminant.kOther) << 8)));
                                }
                                if (a8 > i17 || a8 < i16) {
                                    iArr2[i24 + 1] = 0;
                                } else {
                                    if (a8 == i17) {
                                        a = kvl.UNSET_ENUM_VALUE;
                                    } else if (a8 != i16) {
                                        a = -16777216;
                                    } else {
                                        a = kvl.UNSET_ENUM_VALUE;
                                    }
                                    i15 = a5.get(i23 + b) & Illuminant.kOther;
                                    a4 = i15 + i25;
                                    i2 = i15 + i26;
                                    i15 += i14;
                                    if (a4 < 0) {
                                        a4 = 0;
                                    }
                                    if (i15 < 0) {
                                        i15 = 0;
                                    }
                                    if (i2 < 0) {
                                        i2 = 0;
                                    }
                                    if (a4 > 255) {
                                        a4 = Illuminant.kOther;
                                    }
                                    if (i15 > 255) {
                                        i15 = Illuminant.kOther;
                                    }
                                    if (i2 > 255) {
                                        i2 = Illuminant.kOther;
                                    }
                                    iArr2[i24 + 1] = a | ((i2 & Illuminant.kOther) | (((i15 & Illuminant.kOther) << 16) | ((a4 & Illuminant.kOther) << 8)));
                                }
                                if (i20 > i19 || i20 < i18) {
                                    iArr2[i24 + i10] = 0;
                                } else {
                                    if (i20 == i19) {
                                        a = kvl.UNSET_ENUM_VALUE;
                                    } else if (i20 != i18) {
                                        a = -16777216;
                                    } else {
                                        a = kvl.UNSET_ENUM_VALUE;
                                    }
                                    i15 = a5.get(i23 + c) & Illuminant.kOther;
                                    a4 = i15 + i25;
                                    i2 = i15 + i26;
                                    i15 += i14;
                                    if (a4 < 0) {
                                        a4 = 0;
                                    }
                                    if (i15 < 0) {
                                        i15 = 0;
                                    }
                                    if (i2 < 0) {
                                        i2 = 0;
                                    }
                                    if (a4 > 255) {
                                        a4 = Illuminant.kOther;
                                    }
                                    if (i15 > 255) {
                                        i15 = Illuminant.kOther;
                                    }
                                    if (i2 > 255) {
                                        i2 = Illuminant.kOther;
                                    }
                                    iArr2[i24 + i10] = a | ((i2 & Illuminant.kOther) | (((i15 & Illuminant.kOther) << 16) | ((a4 & Illuminant.kOther) << 8)));
                                }
                                if (a8 > i19 || a8 < i18) {
                                    iArr2[(i24 + i10) + 1] = 0;
                                    i21 += b3;
                                    i22 += b2;
                                    i23 += b + b;
                                    i24 += 2;
                                    i20 += 2;
                                } else {
                                    if (a8 == i19) {
                                        a = kvl.UNSET_ENUM_VALUE;
                                    } else if (a8 != i18) {
                                        a = -16777216;
                                    } else {
                                        a = kvl.UNSET_ENUM_VALUE;
                                    }
                                    i15 = a5.get((i23 + c) + b) & Illuminant.kOther;
                                    a4 = i15 + i25;
                                    i2 = i15 + i26;
                                    i15 += i14;
                                    if (a4 < 0) {
                                        a4 = 0;
                                    }
                                    if (i15 < 0) {
                                        i15 = 0;
                                    }
                                    if (i2 < 0) {
                                        i2 = 0;
                                    }
                                    if (a4 > 255) {
                                        a4 = Illuminant.kOther;
                                    }
                                    if (i15 > 255) {
                                        i15 = Illuminant.kOther;
                                    }
                                    if (i2 > 255) {
                                        i2 = Illuminant.kOther;
                                    }
                                    iArr2[(i24 + i10) + 1] = a | ((i2 & Illuminant.kOther) | (((i15 & Illuminant.kOther) << 16) | ((a4 & Illuminant.kOther) << 8)));
                                    i21 += b3;
                                    i22 += b2;
                                    i23 += b + b;
                                    i24 += 2;
                                    i20 += 2;
                                }
                            }
                        }
                        iArr2[i24] = 0;
                        iArr2[i24 + 1] = 0;
                        a = i24 + i10;
                        iArr2[a] = 0;
                        iArr2[a + 1] = 0;
                        i21 += b3;
                        i22 += b2;
                        i23 += b + b;
                        i24 += 2;
                        i20 += 2;
                    }
                }
                mo13347a("TIMER_END Starting Native Java YUV420-to-RGB Circular Conversion");
                return iArr2;
            case 3:
                return m11273a(iwz, rect, i, true);
            case 4:
                return m11273a(iwz, rect, i, false);
            default:
                throw new IllegalStateException("Unreachable.  All ThumbnailShapes have been enumerated");
        }
    }
}
