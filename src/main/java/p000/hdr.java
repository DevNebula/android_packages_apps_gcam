package p000;

import com.google.android.apps.camera.p005ui.toyboxmenu.ToyboxMenuButton;

/* renamed from: hdr */
public final /* synthetic */ class hdr implements Runnable {
    /* renamed from: a */
    private final ToyboxMenuButton f6431a;
    /* renamed from: b */
    private final boolean f6432b;

    public hdr(ToyboxMenuButton toyboxMenuButton, boolean z) {
        this.f6431a = toyboxMenuButton;
        this.f6432b = z;
    }

    public final void run() {
        ToyboxMenuButton toyboxMenuButton = this.f6431a;
        if (this.f6432b) {
            toyboxMenuButton.setClickable(true);
        } else {
            toyboxMenuButton.setVisibility(8);
        }
    }
}
