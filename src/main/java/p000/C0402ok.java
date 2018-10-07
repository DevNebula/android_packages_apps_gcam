package p000;

import android.view.MenuItem;

/* compiled from: PG */
/* renamed from: ok */
final class C0402ok implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ C0403ol f9505a;
    /* renamed from: b */
    private final /* synthetic */ MenuItem f9506b;
    /* renamed from: c */
    private final /* synthetic */ C0734op f9507c;
    /* renamed from: d */
    private final /* synthetic */ C0732oj f9508d;

    C0402ok(C0732oj c0732oj, C0403ol c0403ol, MenuItem menuItem, C0734op c0734op) {
        this.f9508d = c0732oj;
        this.f9505a = c0403ol;
        this.f9506b = menuItem;
        this.f9507c = c0734op;
    }

    public final void run() {
        C0403ol c0403ol = this.f9505a;
        if (c0403ol != null) {
            this.f9508d.f22167a.f25390f = true;
            c0403ol.f9510b.mo14298a(false);
            this.f9508d.f22167a.f25390f = false;
        }
        if (this.f9506b.isEnabled() && this.f9506b.hasSubMenu()) {
            this.f9507c.mo14299a(this.f9506b, null, 4);
        }
    }
}
