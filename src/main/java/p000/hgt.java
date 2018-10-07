package p000;

import android.widget.ImageButton;

/* renamed from: hgt */
final /* synthetic */ class hgt implements Runnable {
    /* renamed from: a */
    private final hgo f6557a;

    hgt(hgo hgo) {
        this.f6557a = hgo;
    }

    public final void run() {
        hgo hgo = this.f6557a;
        hgo.f20080d.mo7307b("ext_mic_tutorial_dismiss");
        ImageButton imageButton = (ImageButton) hgo.f20086j.get();
        if (imageButton != null) {
            imageButton.performClick();
        }
    }
}
