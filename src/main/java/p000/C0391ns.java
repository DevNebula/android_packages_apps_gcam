package p000;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* compiled from: PG */
/* renamed from: ns */
public final class C0391ns extends ActionMode {
    /* renamed from: a */
    public final C0387nn f9449a;
    /* renamed from: b */
    private final Context f9450b;

    public C0391ns(Context context, C0387nn c0387nn) {
        this.f9450b = context;
        this.f9449a = c0387nn;
    }

    public final void finish() {
        this.f9449a.mo10741b();
    }

    public final View getCustomView() {
        return this.f9449a.mo10744c();
    }

    public final Menu getMenu() {
        return C0261ha.m3012a(this.f9450b, (C0265hf) this.f9449a.mo10745d());
    }

    public final MenuInflater getMenuInflater() {
        return this.f9449a.mo10746e();
    }

    public final CharSequence getSubtitle() {
        return this.f9449a.mo10747f();
    }

    public final Object getTag() {
        return this.f9449a.f9443b;
    }

    public final CharSequence getTitle() {
        return this.f9449a.mo10748g();
    }

    public final boolean getTitleOptionalHint() {
        return this.f9449a.f9444c;
    }

    public final void invalidate() {
        this.f9449a.mo10749h();
    }

    public final boolean isTitleOptional() {
        return this.f9449a.mo10750i();
    }

    public final void setCustomView(View view) {
        this.f9449a.mo10738a(view);
    }

    public final void setSubtitle(int i) {
        this.f9449a.mo10737a(i);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.f9449a.mo10739a(charSequence);
    }

    public final void setTag(Object obj) {
        this.f9449a.f9443b = obj;
    }

    public final void setTitle(int i) {
        this.f9449a.mo10742b(i);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f9449a.mo10743b(charSequence);
    }

    public final void setTitleOptionalHint(boolean z) {
        this.f9449a.mo10740a(z);
    }
}
