package p000;

import android.annotation.TargetApi;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLES31;
import com.google.googlex.gcam.androidutils.gles30.GLSamplerObject.FilterModes;
import com.google.googlex.gcam.androidutils.gles30.GLSamplerObject.WrapAxes;
import com.google.googlex.gcam.androidutils.gles30.GLSamplerObject.WrapModes;
import java.math.RoundingMode;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: jfe */
public final class jfe extends jfa implements jfb {
    /* renamed from: a */
    private final jfj f26731a;
    /* renamed from: b */
    private final int f26732b;
    /* renamed from: c */
    private final int f26733c;
    /* renamed from: d */
    private final int f26734d;
    /* renamed from: f */
    private final jdc f26735f;
    /* renamed from: g */
    private final jen f26736g;
    /* renamed from: h */
    private boolean f26737h;

    jfe(jfj jfj, int i, int i2, jdc jdc) {
        this(jfj, i, i2, jdc, (byte) 0);
    }

    private jfe(jfj jfj, int i, int i2, jdc jdc, byte b) {
        int i3 = 1;
        super(i);
        this.f26737h = false;
        jri.m13395a(true);
        this.f26731a = jfj;
        this.f26735f = jdc;
        this.f26732b = i2;
        this.f26736g = jen.m4490a(jdc);
        this.f26734d = 1;
        if (this.f26736g.mo9358a()) {
            int i4;
            izu izu = jdc.f21429a;
            int i5 = izu.f7958a[0];
            int i6 = 1;
            while (true) {
                int[] iArr = izu.f7958a;
                if (i6 >= iArr.length) {
                    break;
                }
                i4 = iArr[i6];
                if (i4 <= i5) {
                    i4 = i5;
                }
                i6++;
                i5 = i4;
            }
            RoundingMode roundingMode = RoundingMode.DOWN;
            if (i5 > 0) {
                switch (kmg.f8698a[roundingMode.ordinal()]) {
                    case 1:
                        if (i5 > 0) {
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        if (((i5 - 1) & i5) != 0) {
                            i3 = 0;
                        }
                        if ((i4 & i3) == 0) {
                            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                        }
                        break;
                    case 2:
                    case 3:
                        break;
                    case 4:
                    case 5:
                        i4 = 32 - Integer.numberOfLeadingZeros(i5 - 1);
                        break;
                    case 6:
                    case 7:
                    case 8:
                        i4 = Integer.numberOfLeadingZeros(i5);
                        i4 = (((((-1257966797 >>> i4) - i5) ^ -1) ^ -1) >>> 31) + (31 - i4);
                        break;
                    default:
                        throw new AssertionError();
                }
                i4 = 31 - Integer.numberOfLeadingZeros(i5);
                this.f26733c = i4 + 1;
                return;
            }
            String str = "x";
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 26);
            stringBuilder.append(str);
            stringBuilder.append(" (");
            stringBuilder.append(i5);
            stringBuilder.append(") must be > 0");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f26733c = 1;
    }

    /* renamed from: b */
    public final void mo15575b() {
        mo15576c();
        int i;
        int i2;
        int i3;
        if (this.f26731a.mo9376b(jfj.f8124b)) {
            jri.m13405b(this.f26737h ^ 1);
            i = this.f26732b;
            if (i == 37120) {
                i2 = this.f26734d;
                i3 = this.f26736g.f8114a;
                izu izu = this.f26735f.f21429a;
                GLES31.glTexStorage2DMultisample(i, i2, i3, izu.f7958a[0], izu.mo9245b(), true);
            } else {
                i2 = this.f26733c;
                i3 = this.f26736g.f8114a;
                izu izu2 = this.f26735f.f21429a;
                GLES30.glTexStorage2D(i, i2, i3, izu2.f7958a[0], izu2.mo9245b());
            }
        } else {
            int i4;
            int i5;
            jri.m13405b(this.f26737h ^ 1);
            i = this.f26732b;
            i3 = this.f26736g.f8114a;
            izu izu3 = this.f26735f.f21429a;
            int i6 = izu3.f7958a[0];
            int b = izu3.mo9245b();
            i2 = this.f26736g.f8114a;
            switch (i2) {
                case 32849:
                case 34837:
                case 34843:
                case 35898:
                case 35901:
                case 35905:
                case 36194:
                case 36758:
                    i4 = 6407;
                    break;
                case 32854:
                case 32855:
                case 32856:
                case 32857:
                case 34836:
                case 34842:
                case 35907:
                case 36759:
                    i4 = 6408;
                    break;
                case 33321:
                case 33325:
                case 33326:
                case 36756:
                    i4 = 6403;
                    break;
                case 33323:
                case 33327:
                case 33328:
                case 36757:
                    i4 = 33319;
                    break;
                case 33329:
                case 33330:
                case 33331:
                case 33332:
                case 33333:
                case 33334:
                    i4 = 36244;
                    break;
                case 33335:
                case 33336:
                case 33337:
                case 33338:
                case 33339:
                case 33340:
                    i4 = 33320;
                    break;
                case 36208:
                case 36214:
                case 36220:
                case 36226:
                case 36232:
                case 36238:
                case 36975:
                    i4 = 36249;
                    break;
                case 36209:
                case 36215:
                case 36221:
                case 36227:
                case 36233:
                case 36239:
                    i4 = 36248;
                    break;
                default:
                    throw new IllegalStateException("Cannot extract structure from GLFormat!");
            }
            switch (i2) {
                case 32849:
                case 32854:
                case 32855:
                case 32856:
                case 33321:
                case 33323:
                case 33330:
                case 33336:
                case 35905:
                case 35907:
                case 36194:
                case 36220:
                case 36221:
                    i5 = 5121;
                    break;
                case 32857:
                case 36975:
                    i5 = 33640;
                    break;
                case 33325:
                case 33327:
                case 34842:
                case 34843:
                    i5 = 5131;
                    break;
                case 33326:
                case 33328:
                case 34836:
                case 34837:
                    i5 = 5126;
                    break;
                case 33329:
                case 33335:
                case 36238:
                case 36239:
                case 36756:
                case 36757:
                case 36758:
                case 36759:
                    i5 = 5120;
                    break;
                case 33331:
                case 33337:
                case 36232:
                case 36233:
                    i5 = 5122;
                    break;
                case 33332:
                case 33338:
                case 36214:
                case 36215:
                    i5 = 5123;
                    break;
                case 33333:
                case 33339:
                case 36226:
                case 36227:
                    i5 = 5124;
                    break;
                case 33334:
                case 33340:
                case 36208:
                case 36209:
                    i5 = 5125;
                    break;
                case 35898:
                    i5 = 35899;
                    break;
                case 35901:
                    i5 = 35902;
                    break;
                default:
                    throw new IllegalStateException("Cannot extract type from GLFormat!");
            }
            GLES20.glTexImage2D(i, 0, i3, i6, b, 0, i4, i5, null);
        }
        this.f26737h = true;
        if (this.f26736g.mo9358a()) {
            GLES30.glTexParameteri(3553, 10240, FilterModes.LINEAR);
            GLES30.glTexParameteri(3553, 10241, FilterModes.LINEAR);
        } else {
            GLES30.glTexParameteri(3553, 10240, FilterModes.NEAREST);
            GLES30.glTexParameteri(3553, 10241, FilterModes.NEAREST);
        }
        GLES30.glTexParameteri(3553, WrapAxes.f2676S, WrapModes.CLAMP_TO_EDGE);
        GLES30.glTexParameteri(3553, WrapAxes.f2677T, WrapModes.CLAMP_TO_EDGE);
        this.f26737h = true;
    }

    /* renamed from: c */
    public final void mo15576c() {
        GLES30.glBindTexture(this.f26732b, this.f26563e);
    }

    public final void close() {
        GLES30.glDeleteTextures(1, new int[]{this.f26563e}, 0);
    }

    /* renamed from: f */
    static int m18391f() {
        int[] iArr = new int[1];
        GLES30.glGenTextures(1, iArr, 0);
        return iArr[0];
    }

    /* renamed from: d */
    public final jdc mo15577d() {
        return this.f26735f;
    }

    /* renamed from: e */
    public final int mo15578e() {
        return this.f26732b;
    }
}
