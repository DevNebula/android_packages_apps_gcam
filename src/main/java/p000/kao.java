package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: kao */
final /* synthetic */ class kao implements OnItemClickListener {
    /* renamed from: a */
    private final kan f8542a;

    kao(kan kan) {
        this.f8542a = kan;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        kaj kaj = (kaj) adapterView.getItemAtPosition(i);
        kap kap = this.f8542a.f24897a;
        if (kap != null) {
            kap.mo9687a(kaj);
        }
    }
}
