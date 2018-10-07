package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* renamed from: pn */
public final class C0835pn extends C0734op implements SubMenu {
    /* renamed from: k */
    public C0734op f25433k;
    /* renamed from: l */
    private C0736ot f25434l;

    public C0835pn(Context context, C0734op c0734op, C0736ot c0736ot) {
        super(context);
        this.f25433k = c0734op;
        this.f25434l = c0736ot;
    }

    /* renamed from: a */
    public final boolean mo14301a(C0736ot c0736ot) {
        return this.f25433k.mo14301a(c0736ot);
    }

    /* renamed from: a */
    final boolean mo14300a(C0734op c0734op, MenuItem menuItem) {
        return super.mo14300a(c0734op, menuItem) || this.f25433k.mo14300a(c0734op, menuItem);
    }

    /* renamed from: b */
    public final boolean mo14315b(C0736ot c0736ot) {
        return this.f25433k.mo14315b(c0736ot);
    }

    /* renamed from: b */
    public final String mo14311b() {
        int itemId;
        C0736ot c0736ot = this.f25434l;
        if (c0736ot != null) {
            itemId = c0736ot.getItemId();
        } else {
            itemId = 0;
        }
        if (itemId == 0) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.mo14311b());
        stringBuilder.append(":");
        stringBuilder.append(itemId);
        return stringBuilder.toString();
    }

    public final MenuItem getItem() {
        return this.f25434l;
    }

    /* renamed from: d */
    public final C0734op mo14320d() {
        return this.f25433k.mo14320d();
    }

    /* renamed from: f */
    public final boolean mo14322f() {
        return this.f25433k.mo14322f();
    }

    /* renamed from: g */
    public final boolean mo14324g() {
        return this.f25433k.mo14324g();
    }

    /* renamed from: h */
    public final boolean mo14326h() {
        return this.f25433k.mo14326h();
    }

    /* renamed from: a */
    public final void mo14295a(C0406oq c0406oq) {
        this.f25433k.mo14295a(c0406oq);
    }

    public final void setGroupDividerEnabled(boolean z) {
        this.f25433k.setGroupDividerEnabled(z);
    }

    public final SubMenu setHeaderIcon(int i) {
        super.mo14293a(0, null, i, null, null);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        super.mo14293a(0, null, 0, drawable, null);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        super.mo14293a(i, null, 0, null, null);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        super.mo14293a(0, charSequence, 0, null, null);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        super.mo14293a(0, null, 0, null, view);
        return this;
    }

    public final SubMenu setIcon(int i) {
        this.f25434l.setIcon(i);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.f25434l.setIcon(drawable);
        return this;
    }

    public final void setQwertyMode(boolean z) {
        this.f25433k.setQwertyMode(z);
    }
}
