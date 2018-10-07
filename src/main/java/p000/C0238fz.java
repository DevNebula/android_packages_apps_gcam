package p000;

import android.view.View;
import android.view.WindowId;

/* compiled from: PG */
/* renamed from: fz */
final class C0238fz {
    /* renamed from: a */
    private final WindowId f5065a;

    C0238fz(View view) {
        this.f5065a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0238fz) && ((C0238fz) obj).f5065a.equals(this.f5065a);
    }

    public final int hashCode() {
        return this.f5065a.hashCode();
    }
}
