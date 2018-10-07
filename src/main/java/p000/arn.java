package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: arn */
public class arn {
    /* renamed from: a */
    private final Map f944a = new LinkedHashMap(100, 0.75f, true);
    /* renamed from: b */
    private final long f945b;
    /* renamed from: c */
    private long f946c;
    /* renamed from: d */
    private long f947d;

    public arn(long j) {
        this.f945b = j;
        this.f946c = j;
    }

    /* renamed from: a */
    public final void mo1745a() {
        mo1747a(0);
    }

    /* renamed from: c */
    private final void m656c() {
        mo1747a(this.f946c);
    }

    /* renamed from: b */
    public final synchronized Object mo1750b(Object obj) {
        return this.f944a.get(obj);
    }

    /* renamed from: b */
    public final synchronized long mo1749b() {
        return this.f946c;
    }

    /* renamed from: a */
    public int mo1744a(Object obj) {
        return 1;
    }

    /* renamed from: a */
    public void mo1748a(Object obj, Object obj2) {
    }

    /* renamed from: b */
    public final synchronized Object mo1751b(Object obj, Object obj2) {
        Object obj3;
        long a = (long) mo1744a(obj2);
        if (a >= this.f946c) {
            mo1748a(obj, obj2);
            obj3 = null;
        } else {
            if (obj2 != null) {
                this.f947d = a + this.f947d;
            }
            obj3 = this.f944a.put(obj, obj2);
            if (obj3 != null) {
                this.f947d -= (long) mo1744a(obj3);
                if (!obj3.equals(obj2)) {
                    mo1748a(obj, obj3);
                }
            }
            m656c();
        }
        return obj3;
    }

    /* renamed from: c */
    public final synchronized Object mo1752c(Object obj) {
        Object remove;
        remove = this.f944a.remove(obj);
        if (remove != null) {
            this.f947d -= (long) mo1744a(remove);
        }
        return remove;
    }

    /* renamed from: a */
    public final synchronized void mo1746a(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Multiplier must be >= 0");
        }
        this.f946c = (long) Math.round(((float) this.f945b) * f);
        m656c();
    }

    /* renamed from: a */
    public final synchronized void mo1747a(long j) {
        while (this.f947d > j) {
            Iterator it = this.f944a.entrySet().iterator();
            Entry entry = (Entry) it.next();
            Object value = entry.getValue();
            this.f947d -= (long) mo1744a(value);
            Object key = entry.getKey();
            it.remove();
            mo1748a(key, value);
        }
    }
}
