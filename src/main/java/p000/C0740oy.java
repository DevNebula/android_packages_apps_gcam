package p000;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

/* compiled from: PG */
/* renamed from: oy */
final class C0740oy extends C0399of implements OnMenuItemClickListener {
    /* renamed from: a */
    private final /* synthetic */ C0830ou f22236a;

    C0740oy(C0830ou c0830ou, OnMenuItemClickListener onMenuItemClickListener) {
        this.f22236a = c0830ou;
        super(onMenuItemClickListener);
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return ((OnMenuItemClickListener) this.f9502d).onMenuItemClick(this.f22236a.mo14288a(menuItem));
    }
}
