package p000;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* compiled from: PG */
/* renamed from: au */
public final class C0049au implements TypeEvaluator {
    /* renamed from: a */
    private final float[] f993a = new float[9];
    /* renamed from: b */
    private final float[] f994b = new float[9];
    /* renamed from: c */
    private final Matrix f995c = new Matrix();

    public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        Matrix matrix = (Matrix) obj2;
        ((Matrix) obj).getValues(this.f993a);
        matrix.getValues(this.f994b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f994b;
            float f2 = fArr[i];
            float f3 = this.f993a[i];
            fArr[i] = ((f2 - f3) * f) + f3;
        }
        this.f995c.setValues(this.f994b);
        return this.f995c;
    }
}
