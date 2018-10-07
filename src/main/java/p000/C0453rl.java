package p000;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.PopupWindow.OnDismissListener;

/* compiled from: PG */
/* renamed from: rl */
final class C0453rl implements OnDismissListener {
    /* renamed from: a */
    private final /* synthetic */ OnGlobalLayoutListener f9623a;
    /* renamed from: b */
    private final /* synthetic */ C0838ri f9624b;

    C0453rl(C0838ri c0838ri, OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f9624b = c0838ri;
        this.f9623a = onGlobalLayoutListener;
    }

    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f9624b.f25453d.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f9623a);
        }
    }
}
