package p000;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: ixr */
public final class ixr {
    /* renamed from: a */
    private final int f7892a = 200;
    /* renamed from: b */
    private final NavigableMap f7893b = new TreeMap();
    /* renamed from: c */
    private final float[] f7894c = new float[600];
    /* renamed from: d */
    private int f7895d = 0;

    /* renamed from: a */
    private final synchronized Entry m4381a(long j) {
        return ixr.m4382a(this.f7893b.ceilingEntry(Long.valueOf(j)), j);
    }

    /* renamed from: a */
    private static Entry m4382a(Entry entry, long j) {
        if (entry == null) {
            return null;
        }
        if (Math.abs(((Long) entry.getKey()).longValue() - j) >= 3000000) {
            return null;
        }
        return entry;
    }

    /* renamed from: b */
    private final synchronized Entry m4385b(long j) {
        return ixr.m4382a(this.f7893b.floorEntry(Long.valueOf(j)), j);
    }

    /* renamed from: a */
    private final synchronized void m4383a(int i, float[] fArr) {
        for (int i2 = 0; i2 < 3; i2++) {
            fArr[i2] = this.f7894c[(i * 3) + i2];
        }
    }

    /* renamed from: a */
    public final synchronized void mo9164a(long j, float f, float f2, float f3) {
        float[] fArr = this.f7894c;
        int i = this.f7895d;
        int i2 = i * 3;
        fArr[i2] = f;
        fArr[i2 + 1] = f2;
        fArr[i2 + 2] = f3;
        this.f7893b.put(Long.valueOf(j), Integer.valueOf(i));
        this.f7895d = (this.f7895d + 1) % this.f7892a;
        while (this.f7893b.size() > this.f7892a) {
            NavigableMap navigableMap = this.f7893b;
            navigableMap.remove(navigableMap.firstKey());
        }
    }

    /* renamed from: a */
    private final synchronized void m4384a(long j, Entry entry, Entry entry2, float[] fArr) {
        if (((Long) entry.getKey()).equals(entry2.getKey())) {
            m4383a(((Integer) entry.getValue()).intValue(), fArr);
        } else {
            float longValue = (float) (((Long) entry2.getKey()).longValue() - ((Long) entry.getKey()).longValue());
            float longValue2 = ((float) (((Long) entry2.getKey()).longValue() - j)) / longValue;
            longValue = ((float) (j - ((Long) entry.getKey()).longValue())) / longValue;
            int intValue = ((Integer) entry.getValue()).intValue();
            int intValue2 = ((Integer) entry2.getValue()).intValue();
            for (int i = 0; i < 3; i++) {
                float[] fArr2 = this.f7894c;
                fArr[i] = (fArr2[(intValue2 * 3) + i] * longValue) + (fArr2[(intValue * 3) + i] * longValue2);
            }
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo9165a(long j, float[] fArr) {
        boolean z;
        Entry b = m4385b(j);
        Entry a = m4381a(j);
        if (b != null && a != null) {
            m4384a(j, b, a, fArr);
            z = true;
        } else if (b != null) {
            m4383a(((Integer) b.getValue()).intValue(), fArr);
            z = true;
        } else if (a != null) {
            m4383a(((Integer) a.getValue()).intValue(), fArr);
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}
