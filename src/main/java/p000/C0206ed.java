package p000;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;

/* compiled from: PG */
/* renamed from: ed */
final class C0206ed extends ConstantState {
    /* renamed from: a */
    private final ConstantState f3739a;

    public C0206ed(ConstantState constantState) {
        this.f3739a = constantState;
    }

    public final boolean canApplyTheme() {
        return this.f3739a.canApplyTheme();
    }

    public final int getChangingConfigurations() {
        return this.f3739a.getChangingConfigurations();
    }

    public final Drawable newDrawable() {
        Drawable c0669dw = new C0669dw();
        c0669dw.f3523a = (VectorDrawable) this.f3739a.newDrawable();
        return c0669dw;
    }

    public final Drawable newDrawable(Resources resources) {
        Drawable c0669dw = new C0669dw();
        c0669dw.f3523a = (VectorDrawable) this.f3739a.newDrawable(resources);
        return c0669dw;
    }

    public final Drawable newDrawable(Resources resources, Theme theme) {
        Drawable c0669dw = new C0669dw();
        c0669dw.f3523a = (VectorDrawable) this.f3739a.newDrawable(resources, theme);
        return c0669dw;
    }
}
