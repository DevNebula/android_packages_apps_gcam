package p000;

import android.widget.ImageButton;

/* renamed from: hgr */
final /* synthetic */ class hgr implements Runnable {
    /* renamed from: a */
    private final hgo f6556a;

    hgr(hgo hgo) {
        this.f6556a = hgo;
    }

    public final void run() {
        hgo hgo = this.f6556a;
        if (hgo.f20079c.mo9709b()) {
            ImageButton imageButton = (ImageButton) hgo.f20085i.get();
            if (imageButton != null) {
                imageButton.performClick();
            }
        }
    }
}
