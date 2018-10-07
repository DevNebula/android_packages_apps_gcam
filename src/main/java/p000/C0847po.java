package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* renamed from: po */
public final class C0847po extends C0833pi implements SubMenu {
    public C0847po(Context context, C0686hh c0686hh) {
        super(context, c0686hh);
    }

    public final void clearHeader() {
        ((C0686hh) this.f9502d).clearHeader();
    }

    public final MenuItem getItem() {
        return mo14288a(((C0686hh) this.f9502d).getItem());
    }

    public final SubMenu setHeaderIcon(int i) {
        ((C0686hh) this.f9502d).setHeaderIcon(i);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        ((C0686hh) this.f9502d).setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        ((C0686hh) this.f9502d).setHeaderTitle(i);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        ((C0686hh) this.f9502d).setHeaderTitle(charSequence);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        ((C0686hh) this.f9502d).setHeaderView(view);
        return this;
    }

    public final SubMenu setIcon(int i) {
        ((C0686hh) this.f9502d).setIcon(i);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        ((C0686hh) this.f9502d).setIcon(drawable);
        return this;
    }
}
