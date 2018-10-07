package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: bda */
final class bda implements fyr {
    /* renamed from: a */
    private final AtomicBoolean f22575a = new AtomicBoolean(false);
    /* renamed from: b */
    private final /* synthetic */ bcz f22576b;

    bda(bcz bcz) {
        this.f22576b = bcz;
    }

    public final void close() {
        if (!this.f22575a.getAndSet(true)) {
            ilb ilb = this.f22576b;
            synchronized (ilb.f25502a) {
                ilb.mo8826a(Integer.valueOf(((Integer) ilb.f24630c).intValue() - 1));
            }
        }
    }
}
