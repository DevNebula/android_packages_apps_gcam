package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: kac */
abstract class kac implements kai {
    /* renamed from: a */
    private final kad f24893a;
    /* renamed from: b */
    private final AtomicInteger f24894b = new AtomicInteger(0);

    public kac(jzx jzx) {
        jri.m13404b((Object) jzx);
        this.f24893a = new kad(jzx);
        jzu.f8528a.mo9671b(this);
    }

    /* renamed from: a */
    protected abstract void mo15063a(jzx jzx);

    protected kac(kac kac) {
        if (kac.f24894b.get() != 0) {
            throw new IllegalStateException("Attempting to interact with an invalid handle!");
        }
        this.f24893a = kac.f24893a;
        this.f24893a.f8531a.incrementAndGet();
        jzu.f8528a.mo9671b(this);
    }

    public void close() {
        this.f24894b.compareAndSet(0, 1);
        if (this.f24894b.compareAndSet(1, 2)) {
            jzu.f8528a.mo9670a(this);
            kad kad = this.f24893a;
            int decrementAndGet = kad.f8531a.decrementAndGet();
            if (decrementAndGet == 0) {
                if (kad.f8533c) {
                    kad.f8532b.mo9673d();
                }
                mo15063a(kad.f8532b);
            } else if (decrementAndGet < 0) {
                throw new IllegalStateException("Reference count dropped below zero");
            }
        }
    }

    /* renamed from: d */
    public Object mo9673d() {
        if (this.f24894b.compareAndSet(0, 1)) {
            kad kad = this.f24893a;
            kad.f8533c = true;
            return kad.f8532b.mo9674e();
        }
        throw new IllegalStateException("Attempting to interact with an invalid handle!");
    }

    /* renamed from: e */
    public Object mo9674e() {
        if (this.f24894b.get() == 0) {
            return this.f24893a.f8532b.mo9674e();
        }
        throw new IllegalStateException("Attempting to interact with an invalid handle!");
    }

    public String toString() {
        String valueOf = String.valueOf(this.f24893a.f8532b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 13);
        stringBuilder.append("ref-counted[");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
