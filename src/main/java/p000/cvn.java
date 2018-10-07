package p000;

import android.graphics.Bitmap;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.PeekableFilmstripLayout;

/* compiled from: PG */
/* renamed from: cvn */
public final class cvn implements kov {
    /* renamed from: a */
    private final /* synthetic */ Bitmap f13298a;
    /* renamed from: b */
    private final /* synthetic */ PeekableFilmstripLayout f13299b;

    public cvn(PeekableFilmstripLayout peekableFilmstripLayout, Bitmap bitmap) {
        this.f13299b = peekableFilmstripLayout;
        this.f13298a = bitmap;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        bli.m889a(PeekableFilmstripLayout.f12801a, "Exception waiting to show filmstrip", th);
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        bli.m888a(PeekableFilmstripLayout.f12801a, "Filmstrip is ready to show.");
        PeekableFilmstripLayout peekableFilmstripLayout = this.f13299b;
        Bitmap bitmap = this.f13298a;
        if (peekableFilmstripLayout.f12812l.mo5750j()) {
            bli.m888a(PeekableFilmstripLayout.f12801a, "Activity paused/finishing. Aborting filmstrip show animation.");
            peekableFilmstripLayout.f12813m.set(false);
            return;
        }
        bli.m888a(PeekableFilmstripLayout.f12801a, "Running filmstrip show animation.");
        peekableFilmstripLayout.f12810j.mo13455w();
        peekableFilmstripLayout.f12806f.setVisibility(0);
        peekableFilmstripLayout.setVisibility(0);
        peekableFilmstripLayout.f12803c.setTranslationX((float) peekableFilmstripLayout.getMeasuredWidth());
        peekableFilmstripLayout.f12804d.f2536k.mo5761c();
        peekableFilmstripLayout.f12806f.mo2617a(peekableFilmstripLayout.f12807g);
        peekableFilmstripLayout.f12806f.mo2616a(bitmap, new cvo(peekableFilmstripLayout));
    }
}
