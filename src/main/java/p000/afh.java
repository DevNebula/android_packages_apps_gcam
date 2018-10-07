package p000;

/* compiled from: PG */
/* renamed from: afh */
final class afh {
    /* renamed from: a */
    private boolean f391a;
    /* renamed from: b */
    private boolean f392b;
    /* renamed from: c */
    private boolean f393c;

    afh() {
    }

    /* renamed from: a */
    private final boolean m215a(boolean z) {
        return (this.f393c || this.f392b) && this.f391a;
    }

    /* renamed from: a */
    final synchronized boolean mo229a() {
        this.f392b = true;
        return m215a(false);
    }

    /* renamed from: b */
    final synchronized boolean mo230b() {
        this.f393c = true;
        return m215a(false);
    }

    /* renamed from: c */
    final synchronized boolean mo231c() {
        this.f391a = true;
        return m215a(false);
    }

    /* renamed from: d */
    final synchronized void mo232d() {
        this.f392b = false;
        this.f391a = false;
        this.f393c = false;
    }
}
