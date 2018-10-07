package p000;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: kbt */
public abstract class kbt extends khy {
    /* renamed from: a */
    private int f21853a = C0252go.f5873bS;
    /* renamed from: b */
    private Object f21854b;

    protected kbt() {
    }

    /* renamed from: a */
    protected abstract Object mo13911a();

    /* renamed from: b */
    protected final Object mo13912b() {
        this.f21853a = C0252go.f5874bT;
        return null;
    }

    public final boolean hasNext() {
        boolean z;
        if (this.f21853a != C0252go.f5875bU) {
            z = true;
        } else {
            z = false;
        }
        jri.m13405b(z);
        switch (this.f21853a - 1) {
            case 0:
                return true;
            case 2:
                return false;
            default:
                this.f21853a = C0252go.f5875bU;
                this.f21854b = mo13911a();
                if (this.f21853a == C0252go.f5874bT) {
                    return false;
                }
                this.f21853a = C0252go.f5872bR;
                return true;
        }
    }

    public final Object next() {
        if (hasNext()) {
            this.f21853a = C0252go.f5873bS;
            Object obj = this.f21854b;
            this.f21854b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
