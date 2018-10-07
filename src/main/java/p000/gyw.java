package p000;

import com.google.android.apps.camera.bottombar.BottomBarListener;

/* compiled from: PG */
/* renamed from: gyw */
final class gyw extends BottomBarListener {
    /* renamed from: a */
    private final /* synthetic */ irs f24457a;
    /* renamed from: b */
    private final /* synthetic */ gyz f24458b;

    gyw(gyz gyz, irs irs) {
        this.f24458b = gyz;
        this.f24457a = irs;
    }

    public final void onPhotoSwitchButtonClicked() {
        this.f24457a.mo8912c(1);
        this.f24458b.mo7565a(this.f24458b.mo7563a(C0252go.f5895bo));
        this.f24458b.mo7564a(0.0f, C0252go.f5895bo);
    }

    public final void onVideoSwitchButtonClicked() {
        this.f24457a.mo8912c(2);
        this.f24458b.mo7565a(this.f24458b.mo7563a(C0252go.f5894bn));
        this.f24458b.mo7564a(0.0f, C0252go.f5894bn);
    }
}
