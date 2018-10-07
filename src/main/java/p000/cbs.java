package p000;

import android.util.DisplayMetrics;
import android.view.WindowManager;

/* compiled from: PG */
/* renamed from: cbs */
public final class cbs implements kwk {
    /* renamed from: a */
    private final kwk f12131a;

    public cbs(kwk kwk) {
        this.f12131a = kwk;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        WindowManager windowManager = (WindowManager) this.f12131a.mo10566a();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return (DisplayMetrics) ktm.m14219a(displayMetrics, "Cannot return null from a non-@Nullable @Provides method");
    }
}
