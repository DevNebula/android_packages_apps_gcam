package p000;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: jzw */
public abstract class jzw implements jzx, kae {
    /* renamed from: a */
    private final AtomicReference f24891a;

    public jzw(Object obj) {
        jri.m13404b(obj);
        this.f24891a = new AtomicReference(obj);
        jzu.f8528a.mo9671b(this);
    }

    /* renamed from: a */
    public abstract void mo15061a(Object obj);

    public jzw(Object obj, byte b) {
        this(obj);
    }

    public void close() {
        Object andSet = this.f24891a.getAndSet(null);
        if (andSet != null) {
            jzu.f8528a.mo9670a(this);
            mo15061a(andSet);
        }
    }

    /* renamed from: d */
    public final Object mo9673d() {
        Object andSet = this.f24891a.getAndSet(null);
        if (andSet == null) {
            throw new IllegalStateException("Attempting to interact with disposed value!");
        }
        jzu.f8528a.mo9670a(this);
        return andSet;
    }

    /* renamed from: e */
    public final Object mo9674e() {
        Object obj = this.f24891a.get();
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Attempting to interact with disposed value!");
    }

    public String toString() {
        String valueOf = String.valueOf(this.f24891a.get());
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 14);
        stringBuilder.append("single-owner[");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
