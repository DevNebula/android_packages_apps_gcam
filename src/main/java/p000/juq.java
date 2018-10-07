package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* renamed from: juq */
public final class juq extends jul {
    /* renamed from: a */
    private final FeatureTable f24810a;
    /* renamed from: b */
    private final float f24811b = 0.8f;

    public juq(FeatureTable featureTable) {
        this.f24810a = featureTable;
    }

    /* renamed from: a */
    public final Set mo13867a(juh juh) {
        if (juh.mo9563b()) {
            return Collections.emptySet();
        }
        long a = juh.mo9561a();
        Iterator it = juh.iterator();
        float f = 0.0f;
        long j = a;
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            if (longValue != juh.mo9561a()) {
                int i;
                jkz rowIterator = this.f24810a.getRowIterator(j);
                float[] fArr = new float[]{0.0f, 0.0f};
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    i = i2;
                    if (!rowIterator.mo9482a()) {
                        break;
                    }
                    jky jky = (jky) rowIterator.next();
                    if (jky.mo9481b() > longValue) {
                        break;
                    }
                    float[] values = jky.mo9479a(jza.CAMERA_MOTION).getValues();
                    float f2 = values[0];
                    if (f2 >= 0.2f || values[1] >= 0.2f) {
                        i2 = i3 + 1;
                        i3 = 4;
                        if (i2 > 4) {
                            i2 = i + 1;
                            i3 = 0;
                        }
                    } else {
                        fArr[0] = f2 + fArr[0];
                        i3 = 1;
                        fArr[1] = values[1] + fArr[1];
                        i2 = 0;
                    }
                }
                float f3 = fArr[0];
                float f4 = fArr[1];
                j = longValue;
                f = (((float) Math.sqrt((double) ((f3 * f3) + (f4 * f4)))) + (((float) i) * 0.1f)) + f;
            }
        }
        if (f > this.f24811b) {
            return khb.m4932a(jui.CAMERA_PANNING, new jui[0]);
        }
        return Collections.emptySet();
    }

    public final String toString() {
        float f = this.f24811b;
        StringBuilder stringBuilder = new StringBuilder(59);
        stringBuilder.append("[CameraPanningSegmentClassifier threshold: ");
        stringBuilder.append(f);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
