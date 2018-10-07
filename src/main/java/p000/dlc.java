package p000;

import com.google.android.apps.camera.bottombar.BottomBarListener;

/* compiled from: PG */
/* renamed from: dlc */
final class dlc extends BottomBarListener {
    /* renamed from: a */
    private final /* synthetic */ dla f23978a;

    dlc(dla dla) {
        this.f23978a = dla;
    }

    public final void onCameraSwitch(int i) {
        this.f23978a.f26135d.mo2154a(new dbj());
    }

    public final void onRetakeButtonPressed() {
        this.f23978a.f26135d.mo2154a(new dlr());
    }

    public final void onReviewPlayButtonPressed() {
        this.f23978a.f26135d.mo2154a(new dls());
    }
}
