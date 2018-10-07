package p000;

import com.google.android.apps.camera.bottombar.RoundedThumbnailView.Callback;

/* compiled from: PG */
/* renamed from: gwc */
final class gwc implements Callback {
    /* renamed from: a */
    private final /* synthetic */ gwa f19721a;

    gwc(gwa gwa) {
        this.f19721a = gwa;
    }

    public final void onHitStateFinished() {
        gwa gwa = this.f19721a;
        if (gwa.f19715c) {
            gwa.f19713a.mo1815a();
            return;
        }
        for (gvu a : gwa.f19714b) {
            a.mo7476a();
        }
    }
}
