package p000;

import android.view.View.OnClickListener;
import android.widget.Button;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.FilmstripView;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.PeekableFilmstripLayout;

/* compiled from: PG */
/* renamed from: crq */
public final class crq {
    /* renamed from: a */
    public final FilmstripView f2799a;
    /* renamed from: b */
    public final Button f2800b;
    /* renamed from: c */
    public final Button f2801c;
    /* renamed from: d */
    private final PeekableFilmstripLayout f2802d;
    /* renamed from: e */
    private final OnClickListener f2803e = new crr(this);
    /* renamed from: f */
    private final OnClickListener f2804f = new crs(this);

    public crq(FilmstripView filmstripView, PeekableFilmstripLayout peekableFilmstripLayout) {
        this.f2799a = filmstripView;
        this.f2802d = peekableFilmstripLayout;
        hkg a = hkg.m3276a(this.f2802d);
        this.f2800b = (Button) a.mo7919a((int) R.id.accessibility_last_filmstrip_item_button);
        this.f2801c = (Button) a.mo7919a((int) R.id.accessibility_next_filmstrip_item_button);
        this.f2800b.setOnClickListener(this.f2803e);
        this.f2801c.setOnClickListener(this.f2804f);
    }

    /* renamed from: a */
    public final void mo5696a() {
        this.f2800b.setVisibility(8);
        this.f2801c.setVisibility(8);
    }
}
