package p000;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PG */
/* renamed from: cry */
final class cry implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ crw f2837a;

    cry(crw crw) {
        this.f2837a = crw;
    }

    public final void onClick(View view) {
        crw crw = this.f2837a;
        if (crw.f2825i) {
            Activity activity = (Activity) crw.f2817a.get();
            if (activity != null) {
                activity.openContextMenu(view);
                return;
            }
            return;
        }
        crx crx = crw.f2819c;
        if (crx != null) {
            crx.mo5715b();
        }
    }
}
