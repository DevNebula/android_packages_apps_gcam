package p000;

import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/* compiled from: PG */
/* renamed from: dlf */
final class dlf implements Runnable {
    /* renamed from: a */
    public final /* synthetic */ dla f3325a;

    dlf(dla dla) {
        this.f3325a = dla;
    }

    public final void run() {
        dla dla = this.f3325a;
        if (dla.f26139h == null) {
            dla.f26139h = dla.f26137f.mo7444d(new dlg(this));
            this.f3325a.f26139h.show();
            ((TextView) this.f3325a.f26139h.findViewById(16908299)).setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
}
