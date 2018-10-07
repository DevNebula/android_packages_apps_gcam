package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: jtw */
public final class jtw implements jtv {
    /* renamed from: a */
    private final Map f21744a;
    /* renamed from: b */
    private final float f21745b = 0.0f;

    public jtw(Map map) {
        this.f21744a = Collections.unmodifiableMap(new HashMap(map));
    }

    /* renamed from: a */
    public final jzf mo9554a(long j) {
        Iterator it = this.f21744a.entrySet().iterator();
        float f = 0.0f;
        while (true) {
            float f2 = f;
            if (!it.hasNext()) {
                return new jzc(f2);
            }
            Entry entry = (Entry) it.next();
            f = (((Float) entry.getValue()).floatValue() * ((jtv) entry.getKey()).mo9554a(j).mo9629a()) + f2;
        }
    }

    /* renamed from: b */
    public static jtx m13464b() {
        return new jtx();
    }

    /* renamed from: b */
    public final void mo9556b(long j) {
        for (jtv b : this.f21744a.keySet()) {
            b.mo9556b(j);
        }
    }

    /* renamed from: c */
    public final void mo9557c(long j) {
        for (jtv c : this.f21744a.keySet()) {
            c.mo9557c(j);
        }
    }

    /* renamed from: a */
    public final void mo9555a() {
        for (jtv a : this.f21744a.keySet()) {
            a.mo9555a();
        }
    }

    public final String toString() {
        String valueOf;
        Iterable b = khb.m4945b();
        b.add("0.0");
        for (Entry entry : this.f21744a.entrySet()) {
            String valueOf2 = String.valueOf(entry.getValue());
            valueOf = String.valueOf(entry.getKey());
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf2).length() + 3) + String.valueOf(valueOf).length());
            stringBuilder.append(valueOf2);
            stringBuilder.append(" * ");
            stringBuilder.append(valueOf);
            b.add(stringBuilder.toString());
        }
        valueOf = kaz.m4791a(" + ").mo9693a(b);
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 27);
        stringBuilder2.append("LinearWeightedFrameScorer[");
        stringBuilder2.append(valueOf);
        stringBuilder2.append("]");
        return stringBuilder2.toString();
    }
}
