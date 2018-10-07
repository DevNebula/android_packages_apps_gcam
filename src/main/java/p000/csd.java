package p000;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PG */
/* renamed from: csd */
final class csd implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ crw f2843a;

    csd(crw crw) {
        this.f2843a = crw;
    }

    public final void onClick(View view) {
        crx crx = this.f2843a.f2819c;
        if (crx != null) {
            cre a = crx.mo5714a();
            if (a != cre.f2792c) {
                crx.f2836a.m15205b(r1);
                return;
            }
            bli.m898e(cfk.f23052a, "onProgressErrorClicked with INVALID node");
        }
    }
}
