package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jrg */
public class jrg implements AutoCloseable, jqw {
    /* renamed from: a */
    public final int f21668a;
    /* renamed from: b */
    public final int f21669b;
    /* renamed from: c */
    public Set f21670c;
    /* renamed from: d */
    private final Map f21671d;
    /* renamed from: e */
    private final Executor f21672e;
    /* renamed from: f */
    private final List f21673f;

    public jrg(Map map, int i, int i2, Set set) {
        this(map, i, i2, khx.m5000a(), set);
    }

    private jrg(Map map, int i, int i2, Executor executor, Set set) {
        this.f21673f = new ArrayList();
        this.f21671d = map;
        this.f21668a = i;
        this.f21669b = i2;
        this.f21672e = executor;
        this.f21670c = set;
    }

    public synchronized void close() {
        izi a = ion.m4002a();
        izi a2 = ion.m3999a(this.f21671d.values());
        jli.m13188a(this.f21673f).mo9276a(this.f21672e, a2, a2).mo9277a(this.f21672e, new jbd(a)).mo9282a(izw.f21401a);
    }

    /* renamed from: a */
    public final int mo9533a() {
        return this.f21669b;
    }

    /* renamed from: a */
    public final jaq mo13827a(long j) {
        jaq jaq = (jaq) this.f21671d.get(Long.valueOf(j));
        if (jaq != null) {
            return jaq;
        }
        StringBuilder stringBuilder = new StringBuilder(33);
        stringBuilder.append("No image at ");
        stringBuilder.append(j);
        stringBuilder.append("!");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: b */
    public final jaq mo13829b(long j) {
        return mo13827a(j).mo9275a(this.f21672e, jrh.f21674a);
    }

    /* renamed from: c */
    public final List mo13832c() {
        List d = mo13834d();
        d.removeAll(this.f21670c);
        return d;
    }

    /* renamed from: d */
    public final List mo13834d() {
        List arrayList = new ArrayList(this.f21671d.keySet());
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: e */
    public final Set mo13835e() {
        return this.f21671d.keySet();
    }

    /* renamed from: b */
    public final int mo9534b() {
        return this.f21668a;
    }

    /* renamed from: a */
    public final void mo13828a(Set set) {
        this.f21670c = new HashSet(mo13835e());
        this.f21670c.retainAll(set);
    }

    /* renamed from: c */
    public final synchronized jaq mo13831c(long j) {
        jaq a;
        a = mo13827a(j).mo9275a(this.f21672e, new jri());
        this.f21673f.add(a);
        return a;
    }

    /* renamed from: b */
    public final synchronized jrg mo13830b(Set set) {
        jrj jrj;
        jrj = new jrj();
        for (Long longValue : mo13835e()) {
            long longValue2 = longValue.longValue();
            Long longValue3 = Long.valueOf(longValue2);
            if (set.contains(longValue3)) {
                jrj.mo9537a(longValue2, mo13831c(longValue2), this.f21668a, this.f21669b, this.f21670c.contains(longValue3));
            }
        }
        return jrj.mo9536a();
    }

    /* renamed from: f */
    public final int mo13836f() {
        return this.f21671d.size();
    }
}
