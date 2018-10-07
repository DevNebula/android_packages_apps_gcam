package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.view.LayoutInflater;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: nq */
public final class C0390nq extends ContextWrapper {
    /* renamed from: a */
    public int f9445a;
    /* renamed from: b */
    private Theme f9446b;
    /* renamed from: c */
    private LayoutInflater f9447c;
    /* renamed from: d */
    private Resources f9448d;

    public C0390nq() {
        super(null);
    }

    public C0390nq(Context context, int i) {
        super(context);
        this.f9445a = i;
    }

    public C0390nq(Context context, Theme theme) {
        super(context);
        this.f9446b = theme;
    }

    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    public final Resources getResources() {
        if (this.f9448d == null) {
            this.f9448d = super.getResources();
        }
        return this.f9448d;
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f9447c == null) {
            this.f9447c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f9447c;
    }

    public final Theme getTheme() {
        Theme theme = this.f9446b;
        if (theme != null) {
            return theme;
        }
        if (this.f9445a == 0) {
            this.f9445a = R.style.Theme.AppCompat.Light;
        }
        m5706a();
        return this.f9446b;
    }

    /* renamed from: a */
    private final void m5706a() {
        if (this.f9446b == null) {
            this.f9446b = getResources().newTheme();
            Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f9446b.setTo(theme);
            }
        }
        this.f9446b.applyStyle(this.f9445a, true);
    }

    public final void setTheme(int i) {
        if (this.f9445a != i) {
            this.f9445a = i;
            m5706a();
        }
    }
}
