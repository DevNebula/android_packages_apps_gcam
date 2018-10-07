package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.p005ui.tutorialoverlay.TutorialOverlayWrapper;

/* compiled from: PG */
/* renamed from: hdz */
public abstract class hdz {
    /* renamed from: a */
    private final int f6444a;
    /* renamed from: b */
    private final hea f6445b;
    /* renamed from: c */
    public final Context f6446c;
    /* renamed from: d */
    public final gvr f6447d;
    /* renamed from: e */
    public heb f6448e;
    /* renamed from: f */
    public LayoutInflater f6449f;
    /* renamed from: g */
    public TutorialOverlayWrapper f6450g;
    /* renamed from: h */
    public boolean f6451h;

    public hdz(Context context, int i, hea hea) {
        this.f6446c = context;
        this.f6444a = i;
        this.f6445b = hea;
        this.f6447d = new gvr((AccessibilityManager) cbu.m1124a(context, "accessibility"));
    }

    /* renamed from: a */
    public abstract void mo7756a(View view);

    /* renamed from: a */
    public final void mo7755a() {
        mo7758c();
        hea hea = this.f6445b;
        if (hea != null) {
            hea.mo7761a();
        }
    }

    /* renamed from: b */
    public final void mo7757b() {
        if (this.f6451h) {
            TutorialOverlayWrapper tutorialOverlayWrapper = this.f6450g;
            if (tutorialOverlayWrapper != null && this.f6449f != null) {
                tutorialOverlayWrapper = (TutorialOverlayWrapper) jqk.m13354c(tutorialOverlayWrapper);
                LayoutInflater layoutInflater = (LayoutInflater) jqk.m13354c(this.f6449f);
                tutorialOverlayWrapper.removeAllViews();
                tutorialOverlayWrapper.setVisibility(0);
                tutorialOverlayWrapper.f2613a = 0;
                mo7756a(layoutInflater.inflate(this.f6444a, (ViewGroup) layoutInflater.inflate(R.layout.tutorials_placeholder, tutorialOverlayWrapper).findViewById(R.id.tutorials_placeholder)));
            }
        }
    }

    /* renamed from: c */
    public void mo7758c() {
        TutorialOverlayWrapper tutorialOverlayWrapper = this.f6450g;
        if (tutorialOverlayWrapper != null) {
            tutorialOverlayWrapper.mo2737a();
        }
        this.f6451h = false;
        heb heb = this.f6448e;
        if (heb != null) {
            heb.f6452a.f17152O.mo6194a(0);
            heb.f6452a.f17174f.mo6370h();
            heb.f6452a.mo13120c();
            this.f6448e = null;
        }
    }
}
