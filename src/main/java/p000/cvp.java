package p000;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.PeekableFilmstripLayout;

/* compiled from: PG */
/* renamed from: cvp */
public final class cvp implements kov {
    /* renamed from: a */
    private final /* synthetic */ PeekableFilmstripLayout f13301a;

    public cvp(PeekableFilmstripLayout peekableFilmstripLayout) {
        this.f13301a = peekableFilmstripLayout;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        throw new IllegalStateException("getImageViewFuture should not throw an exception.", th);
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        Bitmap a = PeekableFilmstripLayout.m8507a((ImageView) obj);
        jri.m13404b((Object) a);
        this.f13301a.f12806f.mo2615a(a);
    }
}
