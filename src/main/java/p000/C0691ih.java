package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ih */
public class C0691ih extends C0301iz implements Map {
    /* renamed from: c */
    private C0293ip f20997c;

    public C0691ih(int i) {
        super(i);
    }

    public C0691ih(C0301iz c0301iz) {
        super(c0301iz);
    }

    public Set entrySet() {
        C0293ip a = m12454a();
        if (a.f7629a == null) {
            a.f7629a = new C0295ir(a);
        }
        return a.f7629a;
    }

    /* renamed from: a */
    private final C0293ip m12454a() {
        if (this.f20997c == null) {
            this.f20997c = new C0692ii(this);
        }
        return this.f20997c;
    }

    public Set keySet() {
        return m12454a().mo8704d();
    }

    public void putAll(Map map) {
        mo9192a(this.f7944b + map.size());
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Collection values() {
        C0293ip a = m12454a();
        if (a.f7630b == null) {
            a.f7630b = new C0298iu(a);
        }
        return a.f7630b;
    }
}
