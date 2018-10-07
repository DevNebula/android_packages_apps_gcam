package p000;

import android.util.Pair;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jjm */
final class jjm implements jau {
    /* renamed from: a */
    private final jrg f21549a;
    /* renamed from: b */
    private final jqo f21550b;
    /* renamed from: c */
    private final List f21551c;

    public jjm(jrg jrg, jqo jqo, List list) {
        this.f21549a = jrg;
        this.f21550b = jqo;
        this.f21551c = list;
    }

    /* renamed from: a */
    public final /* synthetic */ jaq mo9286a(Object obj, Executor executor) {
        Pair pair = (Pair) obj;
        long longValue = ((Long) pair.second).longValue();
        List list = this.f21551c;
        int i = -1;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (((jjl) list.get(i2)).f8249a == longValue) {
                i = i2;
            }
        }
        if (i == -1) {
            StringBuilder stringBuilder = new StringBuilder(58);
            stringBuilder.append("No face crop data found for timestamp ");
            stringBuilder.append(longValue);
            throw new RuntimeException(stringBuilder.toString());
        }
        return this.f21549a.mo13829b(longValue).mo9275a(executor, new jjn(this.f21550b)).mo9275a(executor, new jjo((jqr) pair.first, ((jjl) list.get(i)).f8250b));
    }
}
