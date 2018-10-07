package p000;

import com.google.android.apps.camera.p005ui.toyboxmenu.ToyboxMenuButton;

/* renamed from: hds */
public final /* synthetic */ class hds implements Runnable {
    /* renamed from: a */
    private final ToyboxMenuButton f6433a;

    public hds(ToyboxMenuButton toyboxMenuButton) {
        this.f6433a = toyboxMenuButton;
    }

    public final void run() {
        this.f6433a.setVisibility(0);
    }
}
