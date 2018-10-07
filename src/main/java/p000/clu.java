package p000;

import android.app.Dialog;
import android.content.Context;

/* compiled from: PG */
/* renamed from: clu */
final class clu extends Dialog {
    /* renamed from: a */
    private final /* synthetic */ cls f2317a;

    clu(cls cls, Context context, int i) {
        this.f2317a = cls;
        super(context, i);
    }

    public final void onBackPressed() {
        if (this.f2317a.f12704b.mo2407a()) {
            this.f2317a.mo12534d();
            return;
        }
        cmp cmp = this.f2317a.f12713k;
        if (cmp.f2347c) {
            cmp.mo2388a();
        } else {
            super.onBackPressed();
        }
    }
}
