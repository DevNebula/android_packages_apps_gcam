package p000;

import android.graphics.Bitmap;
import android.util.Log;

/* compiled from: PG */
/* renamed from: dan */
public final class dan implements kov {
    /* renamed from: a */
    private final /* synthetic */ dak f13665a;

    public dan(dak dak) {
        this.f13665a = dak;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        Log.e("ImageIntModuleUI", "Failed to get screenshot.", th);
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            this.f13665a.mo5912a(bitmap, true);
        }
    }
}
