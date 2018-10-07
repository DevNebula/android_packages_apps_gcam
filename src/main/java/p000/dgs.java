package p000;

import com.google.android.apps.camera.bottombar.BottomBarListener;

/* compiled from: PG */
/* renamed from: dgs */
final class dgs extends BottomBarListener {
    /* renamed from: a */
    private final /* synthetic */ dgl f23921a;

    dgs(dgl dgl) {
        this.f23921a = dgl;
    }

    public final void onCameraSwitch(int i) {
        dgl dgl = this.f23921a;
        if (!dgl.f23918x) {
            dgl.f23896b.mo6124a(i);
            czp czp = dgl.f23873E;
            if (czp != null) {
                czp.mo12949a(dgl.f23896b.mo6126c() ^ 1);
            }
            bli.m896d(dgl.f23868a, "Switching Camera...");
            dgl.mo14850g();
        }
    }

    public final void onThumbnailButtonClicked() {
    }
}
