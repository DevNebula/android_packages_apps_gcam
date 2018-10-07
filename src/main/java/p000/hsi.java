package p000;

import android.support.p003v8.renderscript.Allocation;
import android.support.p003v8.renderscript.Element;
import android.support.p003v8.renderscript.RenderScript;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: hsi */
public final class hsi extends hsb {
    /* renamed from: d */
    public float f20799d;
    /* renamed from: e */
    public Allocation f20800e;
    /* renamed from: f */
    private float[] f20801f = new float[this.f6923b];

    public hsi(int i, hrz hrz, RenderScript renderScript) {
        super(i, hrz, renderScript);
        int b = hrz.mo8079b(i);
        this.f20799d = hrz.m3378a();
        for (int i2 = 0; i2 < b; i2++) {
            float a = hrz.mo8077a(hrz.mo8078a(i, i2));
            int i3 = ((int) a) + 1;
            int i4 = (i3 + i3) + 1;
            int i5 = i4 * i4;
            Object obj = new float[i5];
            Arrays.fill(obj, 0.0f);
            float f = a * a;
            float f2 = 0.0f;
            int i6 = 0;
            while (true) {
                int i7 = i6;
                if (i7 >= 5) {
                    break;
                }
                float f3 = (((float) i7) / 5.0f) - 11.2f;
                i6 = 0;
                while (true) {
                    int i8 = i6;
                    if (i8 >= 5) {
                        break;
                    }
                    float f4 = (((float) i8) / 5.0f) - 11.2f;
                    int i9 = 0;
                    while (i9 < i4) {
                        float f5 = ((float) (i9 - i3)) + f3;
                        float f6 = f2;
                        for (int i10 = 0; i10 < i4; i10++) {
                            float f7 = ((float) (i10 - i3)) + f4;
                            if ((f7 * f7) + (f5 * f5) <= f) {
                                int i11 = (i9 * i4) + i10;
                                obj[i11] = obj[i11] + 1.0f;
                                f6 += 1.0f;
                            }
                        }
                        i9++;
                        f2 = f6;
                    }
                    i6 = i8 + 1;
                }
                i6 = i7 + 1;
            }
            for (i6 = 0; i6 < i5; i6++) {
                obj[i6] = obj[i6] / f2;
            }
            System.arraycopy(obj, 0, this.f20801f, this.f6924c.mo13561a(i2), obj.length);
            this.f20799d = Math.min(this.f20799d, a);
        }
        this.f20800e = Allocation.createSized(renderScript, Element.F32(renderScript), this.f20801f.length);
        this.f20800e.copyFrom(this.f20801f);
    }
}
