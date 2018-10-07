package p000;

import android.util.Log;
import com.google.android.libraries.smartburst.buffers.FeatureTable;
import com.google.android.libraries.smartburst.utils.Feature;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: jkx */
public final class jkx implements FeatureTable {
    /* renamed from: a */
    public final EnumSet f21602a;
    /* renamed from: b */
    private final int[] f21603b;
    /* renamed from: c */
    private final AtomicIntegerArray f21604c;
    /* renamed from: d */
    private final AtomicIntegerArray f21605d;
    /* renamed from: e */
    private final int f21606e;
    /* renamed from: f */
    private final int f21607f;
    /* renamed from: g */
    private final long f21608g;
    /* renamed from: h */
    private final AtomicLong f21609h = new AtomicLong();
    /* renamed from: i */
    private final AtomicBoolean f21610i = new AtomicBoolean(true);
    /* renamed from: j */
    private final AtomicIntegerArray f21611j;
    /* renamed from: k */
    private final float f21612k;

    public jkx(EnumSet enumSet, int i, float f) {
        boolean z;
        jza jza;
        boolean z2 = true;
        int i2 = 0;
        if (enumSet.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        if (i <= 0) {
            z2 = false;
        }
        jri.m13395a(z2);
        this.f21608g = (long) (1.0E9f / f);
        this.f21612k = f;
        Iterator it = enumSet.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            jza = (jza) it.next();
            if (jza.f8497z > i3) {
                i3 = jza.f8497z;
            }
        }
        int i4 = i3 + 1;
        this.f21603b = new int[i4];
        Arrays.fill(this.f21603b, -1);
        Iterator it2 = enumSet.iterator();
        i3 = 0;
        while (it2.hasNext()) {
            jza = (jza) it2.next();
            this.f21603b[jza.f8497z] = i3;
            i3 = jza.f8493A + i3;
        }
        this.f21606e = i3;
        this.f21607f = i;
        this.f21602a = enumSet;
        this.f21604c = new AtomicIntegerArray(this.f21606e * i);
        this.f21605d = new AtomicIntegerArray(i4);
        while (i2 < i4) {
            this.f21605d.set(i2, -1);
            i2++;
        }
        this.f21611j = new AtomicIntegerArray(i4);
    }

    /* renamed from: a */
    private final void m13170a(jza jza) {
        if (!this.f21602a.contains(jza)) {
            String name = jza.name();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(name).length() + 52);
            stringBuilder.append("Unknown feature '");
            stringBuilder.append(name);
            stringBuilder.append("': Feature is not tracked in table!");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public final int getAssignmentCount(jza jza) {
        return this.f21602a.contains(jza) ? this.f21611j.get(jza.f8497z) : 0;
    }

    public final int getCapacity() {
        return this.f21607f;
    }

    /* renamed from: a */
    private final int m13169a(jza jza, int i) {
        return (this.f21606e * i) + this.f21603b[jza.f8497z];
    }

    public final int getColumnCount() {
        return this.f21606e;
    }

    public final Feature[] getColumnValues(jza jza) {
        int i = 0;
        m13170a(jza);
        int i2 = this.f21605d.get(jza.f8497z);
        if (i2 < 0) {
            return new Feature[0];
        }
        Feature[] featureArr = new Feature[(i2 + 1)];
        while (i <= i2) {
            featureArr[i] = mo13811a(jza, i, i2);
            i++;
        }
        return featureArr;
    }

    public final long getEarliestTimestamp() {
        return this.f21609h.get();
    }

    public final Feature getFeature(long j, jza jza) {
        return getRowForTimestamp(j).mo9479a(jza);
    }

    /* renamed from: a */
    final Feature mo13811a(jza jza, int i, int i2) {
        int min;
        int i3 = 0;
        m13170a(jza);
        if (i >= 0) {
            min = Math.min(i, i2);
        } else {
            min = 0;
        }
        if (min < 0) {
            return new Feature(jza);
        }
        float[] fArr = new float[jza.f8493A];
        min = m13169a(jza, min);
        while (i3 < fArr.length) {
            fArr[i3] = Float.intBitsToFloat(this.f21604c.get(min + i3));
            i3++;
        }
        return new Feature(jza, fArr);
    }

    public final int getFeatureCount() {
        return this.f21602a.size();
    }

    public final EnumSet getFeatureTypes() {
        return this.f21602a;
    }

    public final float getFrameRate() {
        return this.f21612k;
    }

    public final long getLatestValidTimestamp() {
        Iterator it = this.f21602a.iterator();
        long j = Long.MAX_VALUE;
        while (it.hasNext()) {
            jza jza = (jza) it.next();
            int i = this.f21605d.get(jza.f8497z);
            if (i != -1) {
                long a = jza.f8496D + mo13810a(i);
                if (a >= j) {
                    a = j;
                }
                j = a;
            }
        }
        return j;
    }

    public final int getNumRowsWithData() {
        int i = -1;
        for (int i2 = 0; i2 < this.f21605d.length(); i2++) {
            if (this.f21605d.get(i2) > i) {
                i = this.f21605d.get(i2);
            }
        }
        if (i != -1) {
            return i + 1;
        }
        return 0;
    }

    public final int getRowCount() {
        return this.f21607f;
    }

    public final jky getRowForTimestamp(long j) {
        return (jky) getRowIterator(j).next();
    }

    public final jkz getRowIterator(long j) {
        return new jkz(this, this.f21605d, m13168a(j));
    }

    /* renamed from: a */
    private final int m13168a(long j) {
        long j2 = j - this.f21609h.get();
        long j3;
        if (j2 >= 0) {
            j3 = this.f21608g;
            j2 = (j2 + (j3 / 2)) / j3;
        } else {
            j3 = this.f21608g;
            j2 = (j2 - (j3 / 2)) / j3;
        }
        return (int) j2;
    }

    public final boolean setFeatureValue(long j, Feature feature) {
        m13170a(feature.getType());
        if (this.f21610i.compareAndSet(true, false)) {
            this.f21609h.set(j);
        }
        jza type = feature.getType();
        int i = type.f8497z;
        int a = m13168a(j);
        String name;
        StringBuilder stringBuilder;
        if (a >= this.f21607f || a < 0) {
            name = feature.getType().name();
            stringBuilder = new StringBuilder(String.valueOf(name).length() + 70);
            stringBuilder.append("Table has overflowed or timestamp is too far in the past for feature ");
            stringBuilder.append(name);
            stringBuilder.append("!");
            Log.w("DenseFeatureTable", stringBuilder.toString());
            return false;
        }
        int i2 = this.f21605d.get(i);
        if (i2 >= a) {
            name = feature.getType().name();
            stringBuilder = new StringBuilder(String.valueOf(name).length() + 51);
            stringBuilder.append("Target row is earlier than latest row for feature ");
            stringBuilder.append(name);
            stringBuilder.append("!");
            Log.w("DenseFeatureTable", stringBuilder.toString());
            return false;
        } else if (this.f21605d.compareAndSet(i, i2, LfuScheduler.MAX_PRIORITY)) {
            int a2 = m13169a(feature.getType(), a);
            float[] values = feature.getValues();
            for (int i3 = 0; i3 < values.length; i3++) {
                boolean z;
                int i4 = a2 + i3;
                this.f21604c.set(i4, Float.floatToIntBits(values[i3]));
                float f = values[i3];
                jzg jzg = type.f8494B;
                if (i2 >= -1) {
                    z = true;
                } else {
                    z = false;
                }
                jri.m13395a(z);
                int i5 = a - i2;
                if (i5 > 1) {
                    int i6 = i5 - 1;
                    if (i2 < 0) {
                        int floatToIntBits = Float.floatToIntBits(f);
                        for (i5 = 0; i5 < i6; i5++) {
                            i4 -= this.f21606e;
                            this.f21604c.set(i4, floatToIntBits);
                        }
                    } else {
                        float f2 = 1.0f / ((float) i5);
                        int i7 = this.f21606e;
                        float intBitsToFloat = Float.intBitsToFloat(this.f21604c.get(i4 - (i5 * i7)));
                        for (i5 = 0; i5 < i6; i5++) {
                            float a3 = jzg.mo9630a(intBitsToFloat, f, ((float) (i6 - i5)) * f2);
                            i4 -= this.f21606e;
                            this.f21604c.set(i4, Float.floatToIntBits(a3));
                        }
                    }
                }
            }
            this.f21611j.incrementAndGet(i);
            this.f21605d.set(i, a);
            return true;
        } else {
            Log.w("DenseFeatureTable", "Attempting to write to same feature column from multiple threads!");
            return false;
        }
    }

    /* renamed from: a */
    final long mo13810a(int i) {
        return this.f21609h.get() + (this.f21608g * ((long) i));
    }

    public final String toString() {
        long j = this.f21608g;
        String a = kaz.m4791a(",").mo9693a(this.f21602a);
        int i = this.f21607f;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(a).length() + 66);
        stringBuilder.append("DenseFeatureTable[rows=");
        stringBuilder.append(i);
        stringBuilder.append(",rate=");
        stringBuilder.append(1.0E9f / ((float) j));
        stringBuilder.append(",features=");
        stringBuilder.append(a);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
