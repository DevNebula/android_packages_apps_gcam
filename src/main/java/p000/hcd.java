package p000;

import com.google.android.apps.camera.p005ui.shutterbutton.ShutterButton;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: hcd */
public final class hcd {
    /* renamed from: a */
    public final ShutterButton f6321a;
    /* renamed from: b */
    public final Object f6322b;
    /* renamed from: c */
    public final List f6323c;
    /* renamed from: d */
    public hbf f6324d;
    /* renamed from: e */
    private final hbh f6325e;
    /* renamed from: f */
    private final hch f6326f = new hce(this);

    public hcd(ShutterButton shutterButton, boolean z) {
        this.f6321a = shutterButton;
        this.f6324d = shutterButton.getMode();
        this.f6323c = new ArrayList();
        this.f6322b = new Object();
        this.f6325e = new hbh(shutterButton, false);
        shutterButton.setListener(this.f6326f);
        mo7668a(new hcf(this));
    }

    /* renamed from: a */
    public final iqo mo7668a(hch hch) {
        synchronized (this.f6322b) {
            this.f6323c.add(hch);
        }
        return new hcg(this, hch);
    }

    /* renamed from: a */
    public final void mo7671a(boolean z) {
        this.f6321a.access$000(z, this.f6325e);
    }

    /* renamed from: a */
    public final void mo7670a(hbf hbf) {
        switch (hbf.ordinal()) {
            case 0:
            case 2:
            case 5:
                this.f6324d = hbf;
                break;
        }
        this.f6321a.setMode(hbf, this.f6325e);
    }

    /* renamed from: b */
    public final void mo7672b(boolean z) {
        this.f6321a.setClickEnabled(z);
    }

    /* renamed from: c */
    public final void mo7673c(boolean z) {
        if (this.f6321a.isEnabled() != z) {
            this.f6321a.setEnabled(z);
        }
    }

    /* renamed from: a */
    public final void mo7669a() {
        mo7670a(hbf.VIDEO_IDLE);
        this.f6321a.setVisibility(0);
    }
}
