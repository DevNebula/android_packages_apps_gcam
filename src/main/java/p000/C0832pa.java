package p000;

import android.content.Context;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

/* compiled from: PG */
/* renamed from: pa */
final class C0832pa extends C0737ov implements VisibilityListener {
    /* renamed from: c */
    private C0309jg f25411c;

    public C0832pa(C0846oz c0846oz, Context context, ActionProvider actionProvider) {
        super(c0846oz, actionProvider);
    }

    /* renamed from: b */
    public final boolean mo9369b() {
        return this.f22232b.isVisible();
    }

    public final void onActionProviderVisibilityChanged(boolean z) {
        C0309jg c0309jg = this.f25411c;
        if (c0309jg != null) {
            c0309jg.f8161a.f22209d.mo14330j();
        }
    }

    /* renamed from: a */
    public final View mo9365a(MenuItem menuItem) {
        return this.f22232b.onCreateActionView(menuItem);
    }

    /* renamed from: e */
    public final boolean mo9372e() {
        return this.f22232b.overridesItemVisibility();
    }

    /* renamed from: a */
    public final void mo9367a(C0309jg c0309jg) {
        this.f25411c = c0309jg;
        this.f22232b.setVisibilityListener(this);
    }
}
