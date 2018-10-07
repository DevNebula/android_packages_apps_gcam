package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.PeekableFilmstripLayout;

/* compiled from: PG */
/* renamed from: cvl */
public final class cvl implements OnTouchListener {
    /* renamed from: a */
    private final /* synthetic */ PeekableFilmstripLayout f3012a;

    public cvl(PeekableFilmstripLayout peekableFilmstripLayout) {
        this.f3012a = peekableFilmstripLayout;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        motionEvent.setLocation(motionEvent.getX() + this.f3012a.f12803c.getX(), motionEvent.getY() + this.f3012a.f12803c.getY());
        return this.f3012a.f12805e.f13254a.mo5770a(motionEvent);
    }
}
