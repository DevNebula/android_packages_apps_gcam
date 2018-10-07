package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: l */
abstract class C0706l implements Iterator, C0366m {
    /* renamed from: a */
    private C0302j f22025a;
    /* renamed from: b */
    private C0302j f22026b;

    C0706l(C0302j c0302j, C0302j c0302j2) {
        this.f22025a = c0302j2;
        this.f22026b = c0302j;
    }

    /* renamed from: a */
    abstract C0302j mo14207a(C0302j c0302j);

    /* renamed from: b */
    abstract C0302j mo14208b(C0302j c0302j);

    public boolean hasNext() {
        return this.f22026b != null;
    }

    public /* synthetic */ Object next() {
        C0302j c0302j = this.f22026b;
        this.f22026b = m14281a();
        return c0302j;
    }

    /* renamed from: a */
    private final C0302j m14281a() {
        C0302j c0302j = this.f22026b;
        C0302j c0302j2 = this.f22025a;
        if (c0302j == c0302j2 || c0302j2 == null) {
            return null;
        }
        return mo14208b(c0302j);
    }

    /* renamed from: a_ */
    public final void mo10664a_(C0302j c0302j) {
        if (this.f22025a == c0302j && c0302j == this.f22026b) {
            this.f22026b = null;
            this.f22025a = null;
        }
        C0302j c0302j2 = this.f22025a;
        if (c0302j2 == c0302j) {
            this.f22025a = mo14207a(c0302j2);
        }
        if (this.f22026b == c0302j) {
            this.f22026b = m14281a();
        }
    }
}
