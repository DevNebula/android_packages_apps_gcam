package p000;

import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.optionsbar.OptionsBarView;

/* renamed from: gas */
public final /* synthetic */ class gas implements Runnable {
    /* renamed from: a */
    private final gal f5247a;
    /* renamed from: b */
    private final boolean f5248b;

    public gas(gal gal, boolean z) {
        this.f5247a = gal;
        this.f5248b = z;
    }

    public final void run() {
        gal gal = this.f5247a;
        boolean z = this.f5248b;
        OptionsBarView optionsBarView = gal.f5222b;
        int a = z ? R.drawable.ic_hdr_auto_checkmark_active_24dp : gal.f5229i.mo6968a(fzp.HDR_AUTO);
        fzh fzh = optionsBarView.f23290d;
        fzo fzo = fzo.HDR;
        if (fzh.f5069b.containsKey(fzo)) {
            ((fzg) fzh.f5069b.get(fzo)).setImageResource(a);
        }
    }
}
