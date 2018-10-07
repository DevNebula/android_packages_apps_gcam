package p000;

/* compiled from: PG */
/* renamed from: cfi */
final class cfi implements gqd {
    /* renamed from: a */
    private final fbn f12326a;
    /* renamed from: b */
    private final ird f12327b;

    cfi(fbn fbn, ird ird) {
        this.f12326a = fbn;
        this.f12327b = ird;
    }

    public final void run() {
        this.f12327b.mo8856a("#cacheDeviceInfo");
        for (iur b : this.f12326a.mo9092b()) {
            this.f12326a.mo13218b(b).mo9078q();
        }
        this.f12327b.mo8857b();
    }
}
