package p000;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kct */
abstract class kct extends kcp implements kgx {
    /* renamed from: a */
    private final Comparator f24905a;
    /* renamed from: b */
    private transient kgx f24906b;

    kct() {
        this(kgc.f21893a);
    }

    /* renamed from: h */
    abstract Iterator mo15078h();

    kct(Comparator comparator) {
        this.f24905a = (Comparator) jri.m13404b((Object) comparator);
    }

    /* renamed from: a */
    public Comparator mo14051a() {
        return this.f24905a;
    }

    /* renamed from: b */
    final /* synthetic */ Set mo13954b() {
        return new kha(this);
    }

    /* renamed from: i */
    public kgx mo14055i() {
        kgx kgx = this.f24906b;
        if (kgx != null) {
            return kgx;
        }
        kgx = new kcu(this);
        this.f24906b = kgx;
        return kgx;
    }

    /* renamed from: j */
    public NavigableSet mo9946e() {
        return (NavigableSet) super.mo9946e();
    }

    /* renamed from: k */
    public kfu mo14057k() {
        Iterator f = mo13957f();
        return f.hasNext() ? (kfu) f.next() : null;
    }

    /* renamed from: l */
    public kfu mo14058l() {
        Iterator h = mo15078h();
        return h.hasNext() ? (kfu) h.next() : null;
    }

    /* renamed from: m */
    public kfu mo14059m() {
        Iterator f = mo13957f();
        if (!f.hasNext()) {
            return null;
        }
        kfu kfu = (kfu) f.next();
        kfu = khb.m4951b(kfu.mo9987a(), kfu.mo9953a());
        f.remove();
        return kfu;
    }

    /* renamed from: n */
    public kfu mo14060n() {
        Iterator h = mo15078h();
        if (!h.hasNext()) {
            return null;
        }
        kfu kfu = (kfu) h.next();
        kfu = khb.m4951b(kfu.mo9987a(), kfu.mo9953a());
        h.remove();
        return kfu;
    }

    /* renamed from: a */
    public kgx mo14053a(Object obj, kcy kcy, Object obj2, kcy kcy2) {
        jri.m13404b((Object) kcy);
        jri.m13404b((Object) kcy2);
        return mo14054b(obj, kcy).mo14052a(obj2, kcy2);
    }
}
