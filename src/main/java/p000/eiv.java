package p000;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PG */
/* renamed from: eiv */
final class eiv implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ eiu f3854a;

    eiv(eiu eiu) {
        this.f3854a = eiu;
    }

    public final void onClick(View view) {
        if (this.f3854a.f3851c != null) {
            view.setEnabled(false);
            chc chc = this.f3854a.f3851c;
            che che = new che(view);
            if (chc.f2157b == C0252go.f5778D) {
                chc.f2160e = che;
                chc.f2156a.mo2306a(chw.A11Y_BUTTON);
                chc.f2158c.postDelayed(chc.f2159d, 5000);
            }
            chc.f2157b = C0252go.f5779E;
        }
    }
}
