package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: fpf */
final class fpf implements fuw {
    /* renamed from: a */
    public final Set f18564a;
    /* renamed from: b */
    private final fuw f18565b;

    fpf(fuw fuw, Set set) {
        this.f18565b = fuw;
        this.f18564a = set;
    }

    /* renamed from: a */
    public final fux mo6915a(fwa fwa) {
        return new fpg(this, this.f18565b.mo6915a(fwa));
    }

    /* renamed from: a */
    public final ilp mo6916a() {
        return this.f18565b.mo6916a();
    }

    /* renamed from: b */
    public final fuy mo6918b() {
        return this.f18565b.mo6918b();
    }

    /* renamed from: b */
    public final fux mo6917b(fwa fwa) {
        fux b = this.f18565b.mo6917b(fwa);
        if (b == null) {
            return null;
        }
        return new fpg(this, b);
    }
}
