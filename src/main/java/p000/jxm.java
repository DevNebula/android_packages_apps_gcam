package p000;

import android.util.LongSparseArray;
import java.util.List;

/* compiled from: PG */
/* renamed from: jxm */
public class jxm {
    /* renamed from: a */
    private final LongSparseArray f8435a = new LongSparseArray();

    /* renamed from: a */
    public final synchronized jxa mo9599a(long j) {
        jxa jxa;
        jxa = (jxa) this.f8435a.get(j);
        if (jxa == null) {
            StringBuilder stringBuilder = new StringBuilder(57);
            stringBuilder.append("No such timestamp in MetaDataStore: ");
            stringBuilder.append(j);
            stringBuilder.append(".");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return jxa;
    }

    /* renamed from: a */
    public final synchronized List mo9598a() {
        List b;
        b = khb.m4945b();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f8435a.size()) {
                b.add((jxa) this.f8435a.valueAt(i2));
                i = i2 + 1;
            }
        }
        return b;
    }

    /* renamed from: a */
    public final synchronized void mo9600a(jxa jxa) {
        this.f8435a.put(((Long) jxa.mo9589a(jxa.f8410a)).longValue(), jxa);
    }
}
