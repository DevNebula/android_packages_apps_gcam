package p000;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PG */
/* renamed from: elt */
final class elt implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ els f4176a;

    elt(els els) {
        this.f4176a = els;
    }

    public final void onClick(View view) {
        els els = this.f4176a;
        int i = els.f17546a + 1;
        if (i >= els.f17547b.length) {
            els.mo7755a();
        } else {
            els.mo13162a(i);
        }
    }
}
