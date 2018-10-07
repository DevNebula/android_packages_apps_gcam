package p000;

import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: jms */
public final class jms {
    /* renamed from: a */
    public final Map f8292a = khb.m4959d();
    /* renamed from: b */
    public final Map f8293b = khb.m4959d();
    /* renamed from: c */
    public boolean f8294c = true;
    /* renamed from: d */
    private final List f8295d = khb.m4945b();
    /* renamed from: e */
    private final HashSet f8296e = khb.m4963e();

    /* renamed from: a */
    final void mo9521a(String str) {
        Map map = this.f8292a;
        jnp jnp = (jnp) map.get(str);
        if (jnp == null) {
            return;
        }
        if (this.f8294c) {
            String concat = String.valueOf(str).concat(":original");
            mo9521a(concat);
            map.put(concat, jnp);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 60);
        stringBuilder.append("Attempting to override ");
        stringBuilder.append(str);
        stringBuilder.append(", but overrides have been disallowed!");
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: a */
    public final jyv mo9519a() {
        return new jmt(this);
    }

    /* renamed from: a */
    static String m4653a(kmq kmq, String str) {
        String kmq2 = kmq.toString();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(kmq2).length() + 1) + String.valueOf(str).length());
        stringBuilder.append(kmq2);
        stringBuilder.append(":");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final Object mo9518a(Class cls, String str) {
        String a;
        kmq a2 = kmq.m13827a(cls);
        while (true) {
            a = jms.m4653a(a2, str);
            if (!this.f8296e.contains(a)) {
                break;
            }
            str = String.valueOf(str).concat(":original");
        }
        this.f8296e.add(a);
        Object obj = this.f8293b.get(a);
        if (obj == null) {
            jnp jnp = (jnp) this.f8292a.get(a);
            StringBuilder stringBuilder;
            if (jnp == null) {
                stringBuilder = new StringBuilder(String.valueOf(a).length() + 33);
                stringBuilder.append("Unable to find instantiator for ");
                stringBuilder.append(a);
                stringBuilder.append(".");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            Object a3 = jnp.mo9526a(this);
            if (a3 == null) {
                stringBuilder = new StringBuilder(String.valueOf(a).length() + 43);
                stringBuilder.append("Instantiator for ");
                stringBuilder.append(a);
                stringBuilder.append(" returns a null reference!");
                throw new NullPointerException(stringBuilder.toString());
            }
            Class cls2 = a3.getClass();
            obj = a3;
            for (jmw jmw : this.f8295d) {
                if (jmw.f8300a.isAssignableFrom(cls2)) {
                    obj = jmw.f8301b.mo9523a(obj, str);
                }
            }
            this.f8293b.put(a, obj);
        }
        this.f8296e.remove(a);
        return obj;
    }

    /* renamed from: b */
    public final jmv mo9522b(Class cls, String str) {
        return new jmv(this, kmq.m13827a(cls), str);
    }

    /* renamed from: a */
    public final void mo9520a(Class cls, jmu jmu) {
        int i;
        int size = this.f8295d.size();
        int i2 = 0;
        while (true) {
            i = i2;
            if (i < this.f8295d.size()) {
                if (((jmw) this.f8295d.get(i)).f8300a.isAssignableFrom(cls)) {
                    break;
                }
                i2 = i + 1;
            } else {
                i = size;
                break;
            }
        }
        this.f8295d.add(i, new jmw(cls, jmu));
    }
}
