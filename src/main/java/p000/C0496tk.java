package p000;

import android.database.DataSetObserver;

/* compiled from: PG */
/* renamed from: tk */
final class C0496tk extends DataSetObserver {
    /* renamed from: a */
    private final /* synthetic */ C0760tg f9788a;

    C0496tk(C0760tg c0760tg) {
        this.f9788a = c0760tg;
    }

    public final void onChanged() {
        if (this.f9788a.f22326r.isShowing()) {
            this.f9788a.m17118a();
        }
    }

    public final void onInvalidated() {
        this.f9788a.mo10860c();
    }
}
