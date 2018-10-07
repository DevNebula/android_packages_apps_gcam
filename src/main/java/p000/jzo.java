package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: jzo */
public final class jzo implements jzt {
    /* renamed from: a */
    private final AtomicInteger f21826a = new AtomicInteger(0);
    /* renamed from: b */
    private final jzt f21827b;

    public jzo(jzt jzt) {
        jri.m13404b((Object) jzt);
        this.f21827b = jzt;
    }

    /* renamed from: a */
    public final void mo9668a(Exception exception) {
        this.f21827b.mo9668a(exception);
    }

    /* renamed from: a */
    public final void mo9667a() {
        if (this.f21826a.getAndIncrement() == 0) {
            this.f21827b.mo9667a();
        }
    }

    /* renamed from: b */
    public final void mo9669b() {
        if (this.f21826a.decrementAndGet() == 0) {
            this.f21827b.mo9669b();
        }
    }
}
