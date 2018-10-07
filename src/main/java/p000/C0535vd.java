package p000;

import android.support.p002v7.widget.SearchView.SearchAutoComplete;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: PG */
/* renamed from: vd */
public final class C0535vd implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ SearchAutoComplete f9914a;

    public C0535vd(SearchAutoComplete searchAutoComplete) {
        this.f9914a = searchAutoComplete;
    }

    public final void run() {
        View view = this.f9914a;
        if (view.f10588a) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
            view.f10588a = false;
        }
    }
}
