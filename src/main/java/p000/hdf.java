package p000;

import android.util.Pair;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.concurrent.Executor;

/* renamed from: hdf */
final /* synthetic */ class hdf implements OnClickListener {
    /* renamed from: a */
    private final hde f6407a;

    hdf(hde hde) {
        this.f6407a = hde;
    }

    public final void onClick(View view) {
        hde hde = this.f6407a;
        hde.mo7731a();
        for (Pair pair : hde.f6384d) {
            ((Executor) pair.second).execute((Runnable) pair.first);
        }
    }
}
