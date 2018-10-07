package p000;

/* compiled from: PG */
/* renamed from: iry */
final class iry extends iwq {
    /* renamed from: a */
    private final irx f26531a;
    /* renamed from: b */
    private boolean f26532b = false;

    iry(iwl iwl, irx irx) {
        super(iwl);
        this.f26531a = irx;
    }

    public final void close() {
        synchronized (this) {
            if (this.f26532b) {
                return;
            }
            this.f26532b = true;
            this.f26531a.close();
            super.close();
        }
    }
}
