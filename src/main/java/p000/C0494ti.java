package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

/* compiled from: PG */
/* renamed from: ti */
final class C0494ti implements OnItemSelectedListener {
    /* renamed from: a */
    private final /* synthetic */ C0760tg f9786a;

    C0494ti(C0760tg c0760tg) {
        this.f9786a = c0760tg;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (i != -1) {
            C0475sh c0475sh = this.f9786a.f22313e;
            if (c0475sh != null) {
                c0475sh.f9709a = false;
            }
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
