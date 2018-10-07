package p000;

import android.os.SystemClock;
import android.view.MenuItem;

/* compiled from: PG */
/* renamed from: oj */
final class C0732oj implements C0500to {
    /* renamed from: a */
    public final /* synthetic */ C0829og f22167a;

    C0732oj(C0829og c0829og) {
        this.f22167a = c0829og;
    }

    /* renamed from: a */
    public final void mo11157a(C0734op c0734op, MenuItem menuItem) {
        int i;
        this.f22167a.f25385a.removeCallbacksAndMessages(null);
        int size = this.f22167a.f25386b.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (c0734op == ((C0403ol) this.f22167a.f25386b.get(i2)).f9510b) {
                i = i2;
                break;
            }
        }
        i = -1;
        if (i != -1) {
            C0403ol c0403ol;
            i++;
            if (i < this.f22167a.f25386b.size()) {
                c0403ol = (C0403ol) this.f22167a.f25386b.get(i);
            } else {
                c0403ol = null;
            }
            this.f22167a.f25385a.postAtTime(new C0402ok(this, c0403ol, menuItem, c0734op), c0734op, SystemClock.uptimeMillis() + 200);
        }
    }

    /* renamed from: b */
    public final void mo11158b(C0734op c0734op, MenuItem menuItem) {
        this.f22167a.f25385a.removeCallbacksAndMessages(c0734op);
    }
}
