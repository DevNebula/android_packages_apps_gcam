package p000;

import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jrj */
public class jrj {
    /* renamed from: a */
    private final Map f8306a = new HashMap();
    /* renamed from: b */
    private final Set f8307b = new HashSet();
    /* renamed from: c */
    private final Map f8308c = new HashMap();

    /* renamed from: a */
    public final void mo9537a(long j, jaq jaq, int i, int i2, boolean z) {
        Map map = this.f8306a;
        Long valueOf = Long.valueOf(j);
        map.put(valueOf, jaq);
        this.f8308c.put(valueOf, jzp.m4772a(i, i2));
        if (z) {
            this.f8307b.add(valueOf);
        }
    }

    /* renamed from: a */
    public final void mo9538a(long j, jqw jqw, boolean z) {
        mo9539a(j, jqk.m13340a((AutoCloseable) jqw), z);
    }

    /* renamed from: a */
    public final void mo9539a(long j, kah kah, boolean z) {
        mo9537a(j, jli.m13199b((Object) kah), ((jqw) kah.mo9674e()).mo9534b(), ((jqw) kah.mo9674e()).mo9533a(), z);
    }

    /* renamed from: a */
    public final synchronized jrg mo9536a() {
        jzp a;
        Map hashMap;
        if (this.f8306a.size() <= 0) {
            a = jzp.m4772a(0, 0);
        } else {
            Map hashMap2 = new HashMap();
            jzp a2 = jzp.m4772a(0, 0);
            a = a2;
            int i = 0;
            for (jzp a22 : this.f8308c.values()) {
                int intValue;
                Integer num = (Integer) hashMap2.get(a22);
                if (num != null) {
                    intValue = num.intValue() + 1;
                } else {
                    intValue = 1;
                }
                hashMap2.put(a22, Integer.valueOf(intValue));
                if (intValue <= i) {
                    a22 = a;
                }
                if (intValue > i) {
                    a = a22;
                    i = intValue;
                } else {
                    a = a22;
                }
            }
        }
        hashMap = new HashMap();
        for (Entry entry : this.f8306a.entrySet()) {
            jzp jzp = (jzp) this.f8308c.get(entry.getKey());
            if (jzp.equals(a)) {
                hashMap.put((Long) entry.getKey(), (jaq) entry.getValue());
            } else {
                String valueOf = String.valueOf(jzp);
                String valueOf2 = String.valueOf(a);
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 86) + String.valueOf(valueOf2).length());
                stringBuilder.append("Bitmap has different dimensions ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" than stack mode ");
                stringBuilder.append(valueOf2);
                stringBuilder.append(", so skipping and closing this image.");
                Log.w("SummaryBuilder", stringBuilder.toString());
                ((jaq) entry.getValue()).mo9275a(jlk.f8281a, ion.m4002a()).mo9282a(izw.f21401a);
            }
        }
        return new jrg(hashMap, a.f8515a, a.f8516b, this.f8307b);
    }
}
