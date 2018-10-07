package p000;

import android.util.Pair;
import android.widget.PopupWindow.OnDismissListener;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: hdh */
final /* synthetic */ class hdh implements OnDismissListener {
    /* renamed from: a */
    private final hde f6408a;

    hdh(hde hde) {
        this.f6408a = hde;
    }

    public final void onDismiss() {
        List<Pair> list = this.f6408a.f6399s;
        if (list != null) {
            for (Pair pair : list) {
                ((Executor) pair.second).execute((Runnable) pair.first);
            }
        }
    }
}
