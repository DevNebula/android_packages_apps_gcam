package p000;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: cqz */
public final class cqz implements cra {
    /* renamed from: a */
    public cqz f13171a = null;
    /* renamed from: b */
    public cqz f13172b = null;
    /* renamed from: c */
    private Object f13173c = null;
    /* renamed from: d */
    private boolean f13174d = false;
    /* renamed from: e */
    private final /* synthetic */ cqy f13175e;

    cqz(cqy cqy, Object obj) {
        this.f13175e = cqy;
        this.f13173c = jri.m13404b(obj);
    }

    /* renamed from: a */
    public final boolean mo5673a() {
        return this.f13171a != null;
    }

    /* renamed from: b */
    public final boolean mo5674b() {
        return this.f13172b != null;
    }

    /* renamed from: c */
    public final boolean mo5675c() {
        return this.f13174d;
    }

    /* renamed from: d */
    public final cqy mo5676d() {
        return this.f13175e;
    }

    /* renamed from: e */
    public final cra mo5677e() {
        if (mo5673a()) {
            return this.f13171a;
        }
        throw new NoSuchElementException("Trying to access non-existent next node.");
    }

    /* renamed from: f */
    public final cra mo5678f() {
        if (mo5674b()) {
            return this.f13172b;
        }
        throw new NoSuchElementException("Trying to access non-existent previous node.");
    }

    /* renamed from: g */
    public final void mo5679g() {
        jri.m13406b(this.f13174d ^ 1, (Object) "Cannot delete already deleted node.");
        cqy cqy = this.f13175e;
        cqz cqz = this.f13171a;
        cqz cqz2 = this.f13172b;
        if (cqz2 != null) {
            cqz2.f13171a = cqz;
        }
        if (cqz != null) {
            cqz.f13172b = cqz2;
        }
        if (cqy.f2779a == this) {
            cqy.f2779a = cqz;
        }
        if (cqy.f2780b == this) {
            cqy.f2780b = cqz2;
        }
        cqy.f2781c--;
        this.f13174d = true;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f13173c);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
        stringBuilder.append("DoublyLinkedNodeImpl{ ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

    /* renamed from: h */
    public final Object mo5680h() {
        return this.f13173c;
    }
}
