package p000;

import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* renamed from: jf */
public abstract class C0308jf {
    /* renamed from: a */
    public C0309jg f8119a;

    /* renamed from: c */
    public abstract View mo9370c();

    /* renamed from: a */
    public boolean mo9368a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo9369b() {
        return true;
    }

    /* renamed from: a */
    public View mo9365a(MenuItem menuItem) {
        return mo9370c();
    }

    /* renamed from: d */
    public boolean mo9371d() {
        return false;
    }

    /* renamed from: a */
    public void mo9366a(SubMenu subMenu) {
    }

    /* renamed from: e */
    public boolean mo9372e() {
        return false;
    }

    /* renamed from: a */
    public void mo9367a(C0309jg c0309jg) {
        if (this.f8119a != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            stringBuilder.append(getClass().getSimpleName());
            stringBuilder.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", stringBuilder.toString());
        }
        this.f8119a = c0309jg;
    }
}
