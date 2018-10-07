package p000;

import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;

/* compiled from: PG */
/* renamed from: ox */
final class C0739ox extends C0399of implements OnActionExpandListener {
    /* renamed from: a */
    private final /* synthetic */ C0830ou f22235a;

    C0739ox(C0830ou c0830ou, OnActionExpandListener onActionExpandListener) {
        this.f22235a = c0830ou;
        super(onActionExpandListener);
    }

    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return ((OnActionExpandListener) this.f9502d).onMenuItemActionCollapse(this.f22235a.mo14288a(menuItem));
    }

    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return ((OnActionExpandListener) this.f9502d).onMenuItemActionExpand(this.f22235a.mo14288a(menuItem));
    }
}
