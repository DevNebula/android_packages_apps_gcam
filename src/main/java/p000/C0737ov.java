package p000;

import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* renamed from: ov */
class C0737ov extends C0308jf {
    /* renamed from: b */
    public final ActionProvider f22232b;
    /* renamed from: c */
    private final /* synthetic */ C0830ou f22233c;

    public C0737ov(C0830ou c0830ou, ActionProvider actionProvider) {
        this.f22233c = c0830ou;
        this.f22232b = actionProvider;
    }

    /* renamed from: a */
    public final boolean mo9368a() {
        return this.f22232b.hasSubMenu();
    }

    /* renamed from: c */
    public final View mo9370c() {
        return this.f22232b.onCreateActionView();
    }

    /* renamed from: d */
    public final boolean mo9371d() {
        return this.f22232b.onPerformDefaultAction();
    }

    /* renamed from: a */
    public final void mo9366a(SubMenu subMenu) {
        this.f22232b.onPrepareSubMenu(this.f22233c.mo14289a(subMenu));
    }
}
