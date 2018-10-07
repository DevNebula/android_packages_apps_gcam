package p000;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;

/* compiled from: PG */
/* renamed from: oe */
class C0731oe extends C0399of {
    /* renamed from: a */
    public final Context f22164a;
    /* renamed from: b */
    public Map f22165b;
    /* renamed from: c */
    public Map f22166c;

    C0731oe(Context context, Object obj) {
        super(obj);
        this.f22164a = context;
    }

    /* renamed from: a */
    final MenuItem mo14288a(MenuItem menuItem) {
        if (!(menuItem instanceof C0266hg)) {
            return menuItem;
        }
        C0266hg c0266hg = (C0266hg) menuItem;
        if (this.f22165b == null) {
            this.f22165b = new C0691ih();
        }
        MenuItem menuItem2 = (MenuItem) this.f22165b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        menuItem2 = C0261ha.m3013a(this.f22164a, c0266hg);
        this.f22165b.put(c0266hg, menuItem2);
        return menuItem2;
    }

    /* renamed from: a */
    final SubMenu mo14289a(SubMenu subMenu) {
        if (!(subMenu instanceof C0686hh)) {
            return subMenu;
        }
        C0686hh c0686hh = (C0686hh) subMenu;
        if (this.f22166c == null) {
            this.f22166c = new C0691ih();
        }
        SubMenu subMenu2 = (SubMenu) this.f22166c.get(c0686hh);
        if (subMenu2 != null) {
            return subMenu2;
        }
        subMenu2 = new C0847po(this.f22164a, c0686hh);
        this.f22166c.put(c0686hh, subMenu2);
        return subMenu2;
    }
}
