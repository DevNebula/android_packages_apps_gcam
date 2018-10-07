package p000;

import android.animation.TypeEvaluator;

/* compiled from: PG */
/* renamed from: ds */
public final class C0197ds implements TypeEvaluator {
    /* renamed from: a */
    private C0438qt[] f3449a;

    public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        C0438qt[] c0438qtArr = (C0438qt[]) obj;
        C0438qt[] c0438qtArr2 = (C0438qt[]) obj2;
        if (C0437qr.m5796a(c0438qtArr, c0438qtArr2)) {
            int i;
            C0438qt[] c0438qtArr3 = this.f3449a;
            if (c0438qtArr3 == null || !C0437qr.m5796a(c0438qtArr3, c0438qtArr)) {
                this.f3449a = C0437qr.m5799a(c0438qtArr);
                i = 0;
            } else {
                i = 0;
            }
            while (i < c0438qtArr.length) {
                C0438qt c0438qt = this.f3449a[i];
                C0438qt c0438qt2 = c0438qtArr[i];
                C0438qt c0438qt3 = c0438qtArr2[i];
                int i2 = 0;
                while (true) {
                    float[] fArr = c0438qt2.f9592b;
                    if (i2 >= fArr.length) {
                        break;
                    }
                    c0438qt.f9592b[i2] = (fArr[i2] * (1.0f - f)) + (c0438qt3.f9592b[i2] * f);
                    i2++;
                }
                i++;
            }
            return this.f3449a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
