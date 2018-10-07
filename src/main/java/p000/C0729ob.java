package p000;

import android.support.p002v7.view.menu.ActionMenuItemView;

/* compiled from: PG */
/* renamed from: ob */
public final class C0729ob extends C0480sp {
    /* renamed from: c */
    private final /* synthetic */ ActionMenuItemView f22155c;

    public C0729ob(ActionMenuItemView actionMenuItemView) {
        this.f22155c = actionMenuItemView;
        super(actionMenuItemView);
    }

    /* renamed from: a */
    public final C0414pj mo11103a() {
        C0398oc c0398oc = this.f22155c.f10514c;
        if (c0398oc == null) {
            return null;
        }
        C0743pz c0743pz = c0398oc.f9501a.f25441l;
        if (c0743pz != null) {
            return c0743pz.mo10841b();
        }
        return null;
    }

    /* renamed from: b */
    protected final boolean mo11104b() {
        ActionMenuItemView actionMenuItemView = this.f22155c;
        C0407or c0407or = actionMenuItemView.f10513b;
        if (c0407or == null || !c0407or.mo10836a(actionMenuItemView.f10512a)) {
            return false;
        }
        C0414pj a = mo11103a();
        if (a == null || !a.mo10862e()) {
            return false;
        }
        return true;
    }
}
