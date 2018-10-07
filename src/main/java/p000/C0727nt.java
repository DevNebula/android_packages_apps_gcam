package p000;

import android.content.Context;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: nt */
public final class C0727nt implements C0388no {
    /* renamed from: a */
    private final Callback f22134a;
    /* renamed from: b */
    private final Context f22135b;
    /* renamed from: c */
    private final ArrayList f22136c = new ArrayList();
    /* renamed from: d */
    private final C0301iz f22137d = new C0301iz();

    public C0727nt(Context context, Callback callback) {
        this.f22135b = context;
        this.f22134a = callback;
    }

    /* renamed from: b */
    public final ActionMode mo14247b(C0387nn c0387nn) {
        int size = this.f22136c.size();
        for (int i = 0; i < size; i++) {
            C0391ns c0391ns = (C0391ns) this.f22136c.get(i);
            if (c0391ns != null && c0391ns.f9449a == c0387nn) {
                return c0391ns;
            }
        }
        ActionMode c0391ns2 = new C0391ns(this.f22135b, c0387nn);
        this.f22136c.add(c0391ns2);
        return c0391ns2;
    }

    /* renamed from: a */
    private final Menu m14456a(Menu menu) {
        Menu menu2 = (Menu) this.f22137d.get(menu);
        if (menu2 != null) {
            return menu2;
        }
        menu2 = C0261ha.m3012a(this.f22135b, (C0265hf) menu);
        this.f22137d.put(menu, menu2);
        return menu2;
    }

    /* renamed from: a */
    public final boolean mo10753a(C0387nn c0387nn, MenuItem menuItem) {
        return this.f22134a.onActionItemClicked(mo14247b(c0387nn), C0261ha.m3013a(this.f22135b, (C0266hg) menuItem));
    }

    /* renamed from: a */
    public final boolean mo10752a(C0387nn c0387nn, Menu menu) {
        return this.f22134a.onCreateActionMode(mo14247b(c0387nn), m14456a(menu));
    }

    /* renamed from: a */
    public final void mo10751a(C0387nn c0387nn) {
        this.f22134a.onDestroyActionMode(mo14247b(c0387nn));
    }

    /* renamed from: b */
    public final boolean mo10754b(C0387nn c0387nn, Menu menu) {
        return this.f22134a.onPrepareActionMode(mo14247b(c0387nn), m14456a(menu));
    }
}
