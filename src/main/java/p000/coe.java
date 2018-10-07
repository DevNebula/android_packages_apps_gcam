package p000;

import android.util.LongSparseArray;
import java.util.List;

/* compiled from: PG */
/* renamed from: coe */
final class coe {
    /* renamed from: a */
    public final LongSparseArray f2411a = new LongSparseArray();
    /* renamed from: b */
    public final long f2412b;
    /* renamed from: c */
    public final long f2413c;

    public coe(List list, long j) {
        jri.m13404b((Object) list);
        jri.m13396a(list.isEmpty() ^ 1, (Object) "Summary timestamps should not be empty");
        long longValue = ((Long) list.get(0)).longValue();
        for (Long longValue2 : list) {
            long longValue3 = longValue2.longValue();
            this.f2411a.put(longValue3, Long.valueOf(((longValue3 - longValue) / 1000000) + j));
        }
        this.f2412b = ((Long) this.f2411a.valueAt(list.size() - 1)).longValue() + 1000;
        this.f2413c = j;
    }
}
