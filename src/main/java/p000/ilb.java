package p000;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ilb */
public class ilb implements ilp {
    /* renamed from: a */
    private final Executor f24628a;
    /* renamed from: b */
    public final Set f24629b;
    /* renamed from: c */
    public volatile Object f24630c;

    public ilb(inc inc) {
        this((Object) inc);
    }

    public ilb(Object obj) {
        this.f24629b = new CopyOnWriteArraySet();
        this.f24630c = obj;
        this.f24628a = new imk();
    }

    /* renamed from: a */
    public final iqo mo13672a(iqt iqt, Executor executor) {
        ijp ijp = new ijp(iqt, executor);
        this.f24629b.add(ijp);
        this.f24628a.execute(new ild(this, ijp));
        return new ile(this, ijp);
    }

    /* renamed from: b */
    public final Object mo13673b() {
        return this.f24630c;
    }

    /* renamed from: a */
    public final void mo8826a(Object obj) {
        this.f24628a.execute(new ilc(this, obj));
    }
}
