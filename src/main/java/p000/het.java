package p000;

import android.view.ViewStub;
import android.widget.FrameLayout;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBar;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import com.google.android.apps.camera.p005ui.views.MainActivityLayout;

/* compiled from: PG */
/* renamed from: het */
public final class het {
    /* renamed from: a */
    public final ViewStub f6487a;
    /* renamed from: b */
    public final ViewStub f6488b;
    /* renamed from: c */
    public final MainActivityLayout f6489c;
    /* renamed from: d */
    public final FrameLayout f6490d;
    /* renamed from: e */
    public final FrameLayout f6491e;
    /* renamed from: f */
    public final BottomBar f6492f;
    /* renamed from: g */
    public final RoundedThumbnailView f6493g = this.f6492f.getThumbnailButton();
    /* renamed from: h */
    public final hkg f6494h;

    public het(hkg hkg) {
        ikd.m12501a();
        this.f6494h = (hkg) jri.m13404b((Object) hkg);
        this.f6489c = (MainActivityLayout) hkg.mo7919a((int) R.id.activity_root_view);
        this.f6487a = (ViewStub) hkg.mo7919a((int) R.id.camera_frame_bottom_layout_stub);
        this.f6488b = (ViewStub) hkg.mo7919a((int) R.id.camera_frame_overlay_layout_stub);
        this.f6490d = (FrameLayout) hkg.mo7919a((int) R.id.viewfinder_frame);
        this.f6491e = (FrameLayout) hkg.mo7919a((int) R.id.viewfinder_cover);
        hkg.mo7919a((int) R.id.mode_switcher_ui_hold);
        this.f6492f = (BottomBar) hkg.mo7919a((int) R.id.bottom_bar);
    }
}
