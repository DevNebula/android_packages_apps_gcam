package p000;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.p005ui.views.CaptureAnimationOverlay;
import com.google.android.apps.camera.progressoverlay.ProgressOverlay;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: dak */
public final class dak {
    /* renamed from: a */
    public final ebd f3110a;
    /* renamed from: b */
    public final hfh f3111b;
    /* renamed from: c */
    public final Executor f3112c;
    /* renamed from: d */
    public final ImageView f3113d;
    /* renamed from: e */
    public final ProgressOverlay f3114e;
    /* renamed from: f */
    public final CaptureAnimationOverlay f3115f;
    /* renamed from: g */
    public final ham f3116g = new dam(this);
    /* renamed from: h */
    private final gyi f3117h;
    /* renamed from: i */
    private final View f3118i;

    public dak(ebd ebd, gyi gyi, View view, Executor executor) {
        this.f3110a = ebd;
        this.f3117h = gyi;
        this.f3112c = executor;
        this.f3118i = view;
        ((ViewStub) this.f3118i.findViewById(R.id.camera_intent_layout_stub)).inflate();
        this.f3113d = (ImageView) this.f3118i.findViewById(R.id.intent_review_imageview);
        this.f3111b = (hfh) hhz.m3217d(new hfh((FrameLayout) this.f3118i.findViewById(R.id.module_layout)));
        this.f3114e = (ProgressOverlay) this.f3118i.findViewById(R.id.intent_progress_bar);
        this.f3115f = (CaptureAnimationOverlay) this.f3118i.findViewById(R.id.intent_capture_animation_overlay);
    }

    /* renamed from: a */
    public final void mo5911a() {
        ikd.m12501a();
        this.f3111b.mo13529a();
    }

    /* renamed from: a */
    public final void mo5913a(hfk hfk) {
        this.f3111b.f20005b = hfk;
    }

    /* renamed from: a */
    public final void mo5914a(boolean z) {
        ikd.m12501a();
        this.f3110a.mo13122c(z);
    }

    /* renamed from: b */
    public final void mo5915b() {
        ikd.m12501a();
        this.f3113d.setVisibility(4);
        this.f3113d.setImageBitmap(null);
        this.f3114e.setVisibility(8);
        this.f3110a.mo13122c(true);
        this.f3110a.mo13133m();
        this.f3110a.mo13132l();
    }

    /* renamed from: a */
    public final void mo5912a(Bitmap bitmap, boolean z) {
        ikd.m12501a();
        if (z) {
            this.f3114e.setVisibility(0);
            this.f3114e.f2582a.start();
        } else {
            this.f3114e.f2582a.stop();
            this.f3114e.setVisibility(8);
        }
        this.f3116g.mo7598a(this.f3117h.mo7882a());
        this.f3113d.setImageBitmap(bitmap);
        this.f3113d.setVisibility(0);
    }
}
