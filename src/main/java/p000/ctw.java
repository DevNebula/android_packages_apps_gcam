package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.FilmstripShortTallBottomBarBackground;

/* compiled from: PG */
/* renamed from: ctw */
public final class ctw {
    /* renamed from: a */
    public final FrameLayout f2934a;
    /* renamed from: b */
    public final LinearLayout f2935b;
    /* renamed from: c */
    public final LinearLayout f2936c;
    /* renamed from: d */
    public final ImageView f2937d;
    /* renamed from: e */
    public final TextView f2938e;
    /* renamed from: f */
    public final ProgressBar f2939f;
    /* renamed from: g */
    public final ViewGroup f2940g;
    /* renamed from: h */
    public final View f2941h;
    /* renamed from: i */
    public final TextView f2942i;
    /* renamed from: j */
    public final View f2943j;
    /* renamed from: k */
    public final FilmstripShortTallBottomBarBackground f2944k;

    public ctw(hkg hkg) {
        hkg.mo7919a((int) R.id.peekable_filmstrip_layout);
        hkg.mo7919a((int) R.id.filmstrip_view);
        this.f2934a = (FrameLayout) hkg.mo7919a((int) R.id.camera_filmstrip_content_layout);
        this.f2935b = (LinearLayout) hkg.mo7919a((int) R.id.filmstrip_bottom_panel);
        this.f2936c = (LinearLayout) hkg.mo7919a((int) R.id.filmstrip_badge);
        this.f2937d = (ImageView) hkg.mo7919a((int) R.id.filmstrip_badge_icon);
        this.f2938e = (TextView) hkg.mo7919a((int) R.id.filmstrip_badge_text);
        this.f2939f = (ProgressBar) hkg.mo7919a((int) R.id.filmstrip_badge_progress_bar);
        this.f2940g = (ViewGroup) hkg.mo7919a((int) R.id.camera_undo_deletion_bar);
        this.f2941h = (View) hkg.mo7919a((int) R.id.camera_undo_deletion_button);
        this.f2942i = (TextView) hkg.mo7919a((int) R.id.no_photos_text);
        this.f2943j = (View) hkg.mo7919a((int) R.id.filmstrip_top_bar_gradient);
        this.f2944k = (FilmstripShortTallBottomBarBackground) hkg.mo7919a((int) R.id.filmstrip_short_tall_bottom_bar_background);
    }
}
