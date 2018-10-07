package p000;

import android.util.LongSparseArray;
import java.io.Writer;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: jyy */
public final class jyy implements jyv {
    /* renamed from: a */
    private final Map f21823a = new TreeMap();
    /* renamed from: b */
    private final boolean f21824b = true;

    /* renamed from: a */
    public final void mo13890a(String str, long j, float f) {
        LongSparseArray longSparseArray = (LongSparseArray) this.f21823a.get(str);
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray();
            this.f21823a.put(str, longSparseArray);
        }
        if (!this.f21824b || longSparseArray.get(j) == null) {
            longSparseArray.put(j, Float.valueOf(f));
        }
    }

    /* renamed from: a */
    public final void mo9620a(Writer writer) {
        int i;
        Set keySet = this.f21823a.keySet();
        String[] strArr = (String[]) keySet.toArray(new String[keySet.size()]);
        LongSparseArray longSparseArray = new LongSparseArray();
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            LongSparseArray longSparseArray2 = (LongSparseArray) this.f21823a.get(strArr[i2]);
            for (i = 0; i < longSparseArray2.size(); i++) {
                long keyAt = longSparseArray2.keyAt(i);
                Object obj = (float[]) longSparseArray.get(keyAt);
                if (obj == null) {
                    obj = new float[strArr.length];
                    Arrays.fill(obj, Float.NaN);
                    longSparseArray.put(keyAt, obj);
                }
                obj[i2] = ((Float) longSparseArray2.valueAt(i)).floatValue();
            }
            i2++;
        }
        writer.write("timestamp");
        for (Object valueOf : strArr) {
            String valueOf2 = String.valueOf(valueOf);
            String str = ",";
            if (valueOf2.length() == 0) {
                valueOf2 = new String(str);
            } else {
                valueOf2 = str.concat(valueOf2);
            }
            writer.write(valueOf2);
        }
        writer.write("\n");
        for (int i3 = 0; i3 < longSparseArray.size(); i3++) {
            float[] fArr = (float[]) longSparseArray.valueAt(i3);
            writer.write(String.valueOf(longSparseArray.keyAt(i3)));
            for (float f : fArr) {
                if (Float.isNaN(f)) {
                    writer.write(",");
                } else {
                    StringBuilder stringBuilder = new StringBuilder(16);
                    stringBuilder.append(",");
                    stringBuilder.append(f);
                    writer.write(stringBuilder.toString());
                }
            }
            writer.write("\n");
        }
    }
}
