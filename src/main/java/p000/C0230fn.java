package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* compiled from: PG */
/* renamed from: fn */
public final class C0230fn {
    /* renamed from: a */
    public final ViewGroupOverlay f4861a;

    public C0230fn(ViewGroup viewGroup) {
        this.f4861a = viewGroup.getOverlay();
    }

    /* renamed from: a */
    public final void mo6860a(View view) {
        this.f4861a.remove(view);
    }
}
