package p000;

import android.support.design.internal.CheckableImageButton;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* renamed from: ch */
public final class C0648ch extends C0306jd {
    /* renamed from: c */
    private final /* synthetic */ CheckableImageButton f12477c;

    public C0648ch(CheckableImageButton checkableImageButton) {
        this.f12477c = checkableImageButton;
    }

    /* renamed from: a */
    public final void mo9324a(View view, AccessibilityEvent accessibilityEvent) {
        super.mo9324a(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f12477c.isChecked());
    }

    /* renamed from: a */
    public final void mo9325a(View view, C0334kk c0334kk) {
        super.mo9325a(view, c0334kk);
        c0334kk.mo10084a(true);
        c0334kk.f8693a.setChecked(this.f12477c.isChecked());
    }
}
