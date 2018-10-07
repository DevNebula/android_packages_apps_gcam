package p000;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.p005ui.wirers.PreviewOverlay;

/* compiled from: PG */
/* renamed from: cze */
public final class cze {
    /* renamed from: a */
    public PreviewOverlay f3055a;
    /* renamed from: b */
    public hfl f3056b;
    /* renamed from: c */
    public hfh f3057c;
    /* renamed from: d */
    private final View f3058d;

    static {
        bli.m887a("CaptureModuleUI");
    }

    public cze(View view) {
        this.f3058d = view;
        mo5896a();
    }

    /* renamed from: a */
    public final void mo5896a() {
        hkg a = hkg.m3276a(this.f3058d);
        FrameLayout frameLayout = (FrameLayout) a.mo7919a((int) R.id.module_layout);
        frameLayout.removeAllViews();
        this.f3055a = (PreviewOverlay) a.mo7919a((int) R.id.preview_overlay);
        hfl hfl = (hfl) hhz.m3217d(new hfl(frameLayout.getContext()));
        frameLayout.addView(hfl);
        this.f3056b = hfl;
        this.f3057c = (hfh) hhz.m3217d(new hfh(frameLayout));
    }

    /* renamed from: a */
    public final void mo5898a(hfk hfk) {
        this.f3057c.f20005b = hfk;
    }

    /* renamed from: a */
    public final void mo5897a(int i) {
        this.f3057c.mo13530a(i);
    }
}
