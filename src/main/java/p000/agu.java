package p000;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: agu */
public final class agu {
    /* renamed from: a */
    private final agz f445a;
    /* renamed from: b */
    private final ahd f446b;
    /* renamed from: c */
    private final Map f447c;
    /* renamed from: d */
    private final Map f448d;
    /* renamed from: e */
    private final int f449e;
    /* renamed from: f */
    private int f450f;

    public agu() {
        this.f445a = new agz();
        this.f446b = new ahd();
        this.f447c = new HashMap();
        this.f448d = new HashMap();
        this.f449e = 4194304;
    }

    public agu(int i) {
        this.f445a = new agz();
        this.f446b = new ahd();
        this.f447c = new HashMap();
        this.f448d = new HashMap();
        this.f449e = i;
    }

    /* renamed from: a */
    public final synchronized void mo274a() {
        m255b(0);
    }

    /* renamed from: b */
    private final void m256b(int i, Class cls) {
        NavigableMap c = m257c(cls);
        Integer valueOf = Integer.valueOf(i);
        Integer num = (Integer) c.get(valueOf);
        if (num == null) {
            String valueOf2 = String.valueOf(this);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf2).length() + 56);
            stringBuilder.append("Tried to decrement empty size, size: ");
            stringBuilder.append(i);
            stringBuilder.append(", this: ");
            stringBuilder.append(valueOf2);
            throw new NullPointerException(stringBuilder.toString());
        } else if (num.intValue() == 1) {
            c.remove(valueOf);
        } else {
            c.put(valueOf, Integer.valueOf(num.intValue() - 1));
        }
    }

    /* renamed from: b */
    private final void m255b(int i) {
        while (this.f450f > i) {
            Object a = this.f445a.mo286a();
            aqe.m610a(a, "Argument must not be null");
            agt b = m254b(a.getClass());
            this.f450f -= b.mo269a(a) * b.mo268a();
            m256b(b.mo269a(a), a.getClass());
            if (Log.isLoggable(b.mo271b(), 2)) {
                String b2 = b.mo271b();
                int a2 = b.mo269a(a);
                StringBuilder stringBuilder = new StringBuilder(20);
                stringBuilder.append("evicted: ");
                stringBuilder.append(a2);
                Log.v(b2, stringBuilder.toString());
            }
        }
    }

    /* renamed from: a */
    public final synchronized Object mo272a(int i, Class cls) {
        Object a;
        Object obj = null;
        synchronized (this) {
            ahc a2;
            Integer num = (Integer) m257c(cls).ceilingKey(Integer.valueOf(i));
            if (num != null) {
                Object obj2;
                int i2 = this.f450f;
                if (i2 == 0) {
                    i2 = 1;
                } else if (this.f449e / i2 < 2) {
                    obj2 = null;
                } else {
                    i2 = 1;
                }
                int obj3;
                if (obj2 != null) {
                    obj3 = 1;
                } else if (num.intValue() <= (i << 3)) {
                    obj3 = 1;
                }
            }
            if (obj3 != null) {
                a2 = this.f446b.mo11643a(num.intValue(), cls);
            } else {
                a2 = this.f446b.mo11643a(i, cls);
            }
            a = m253a(a2, cls);
        }
        return a;
    }

    /* renamed from: b */
    private final agt m254b(Class cls) {
        agt agt = (agt) this.f448d.get(cls);
        if (agt == null) {
            if (cls.equals(int[].class)) {
                agt = new ahb();
            } else if (cls.equals(byte[].class)) {
                agt = new agy();
            } else {
                String valueOf = String.valueOf(cls.getSimpleName());
                String str = "No array pool found for: ";
                throw new IllegalArgumentException(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
            }
            this.f448d.put(cls, agt);
        }
        return agt;
    }

    /* renamed from: a */
    public final synchronized Object mo273a(Class cls) {
        return m253a(this.f446b.mo11643a(8, cls), cls);
    }

    /* renamed from: a */
    private final Object m253a(ahc ahc, Class cls) {
        agt b = m254b(cls);
        Object a = this.f445a.mo287a((ahh) ahc);
        if (a != null) {
            this.f450f -= b.mo269a(a) * b.mo268a();
            m256b(b.mo269a(a), cls);
        }
        if (a != null) {
            return a;
        }
        if (Log.isLoggable(b.mo271b(), 2)) {
            String b2 = b.mo271b();
            int i = ahc.f10289a;
            StringBuilder stringBuilder = new StringBuilder(27);
            stringBuilder.append("Allocated ");
            stringBuilder.append(i);
            stringBuilder.append(" bytes");
            Log.v(b2, stringBuilder.toString());
        }
        return b.mo270a(ahc.f10289a);
    }

    /* renamed from: c */
    private final NavigableMap m257c(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.f447c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        navigableMap = new TreeMap();
        this.f447c.put(cls, navigableMap);
        return navigableMap;
    }

    /* renamed from: a */
    public final synchronized void mo276a(Object obj) {
        Class cls = obj.getClass();
        agt b = m254b(cls);
        int a = b.mo269a(obj);
        int a2 = b.mo268a() * a;
        if (a2 <= this.f449e / 2) {
            int intValue;
            ahc a3 = this.f446b.mo11643a(a, cls);
            this.f445a.mo288a(a3, obj);
            NavigableMap c = m257c(cls);
            Integer num = (Integer) c.get(Integer.valueOf(a3.f10289a));
            Integer valueOf = Integer.valueOf(a3.f10289a);
            if (num != null) {
                intValue = num.intValue() + 1;
            } else {
                intValue = 1;
            }
            c.put(valueOf, Integer.valueOf(intValue));
            this.f450f += a2;
            m255b(this.f449e);
        }
    }

    /* renamed from: a */
    public final synchronized void mo275a(int i) {
        if (i >= 40) {
            mo274a();
        } else if (i >= 20 || i == 15) {
            m255b(this.f449e / 2);
        }
    }
}
