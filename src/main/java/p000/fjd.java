package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: fjd */
public final class fjd implements ilp {
    /* renamed from: a */
    private final ilb f24265a = new ilb(fds.m10411a());
    /* renamed from: b */
    private final List f24266b = new ArrayList();

    /* renamed from: a */
    public final iqo mo13672a(iqt iqt, Executor executor) {
        return this.f24265a.mo13672a(iqt, executor);
    }

    /* renamed from: a */
    public final synchronized void mo14892a(fiw fiw) {
        this.f24266b.add(fiw);
        this.f24265a.mo8826a(fds.m10416a(this.f24266b));
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo13673b() {
        return (fis) this.f24265a.mo13673b();
    }
}
