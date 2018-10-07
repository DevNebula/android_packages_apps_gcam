package p000;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: aos */
final class aos implements apa {
    /* renamed from: a */
    private final Set f10633a = Collections.newSetFromMap(new WeakHashMap());
    /* renamed from: b */
    private boolean f10634b;
    /* renamed from: c */
    private boolean f10635c;

    aos() {
    }

    /* renamed from: a */
    public final void mo1643a(apb apb) {
        this.f10633a.add(apb);
        if (this.f10635c) {
            apb.mo1645b();
        } else if (this.f10634b) {
            apb.mo1646c();
        } else {
            apb.mo1647d();
        }
    }

    /* renamed from: a */
    final void mo12298a() {
        this.f10635c = true;
        for (apb b : arq.m676a(this.f10633a)) {
            b.mo1645b();
        }
    }

    /* renamed from: b */
    final void mo12299b() {
        this.f10634b = true;
        for (apb c : arq.m676a(this.f10633a)) {
            c.mo1646c();
        }
    }

    /* renamed from: c */
    final void mo12300c() {
        this.f10634b = false;
        for (apb d : arq.m676a(this.f10633a)) {
            d.mo1647d();
        }
    }

    /* renamed from: b */
    public final void mo1644b(apb apb) {
        this.f10633a.remove(apb);
    }
}
