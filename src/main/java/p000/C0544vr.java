package p000;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window.Callback;

/* compiled from: PG */
/* renamed from: vr */
final class C0544vr implements OnClickListener {
    /* renamed from: a */
    private final C0728oa f9931a = new C0728oa(this.f9932b.f9654a.getContext(), this.f9932b.f9657d);
    /* renamed from: b */
    private final /* synthetic */ C0462ru f9932b;

    C0544vr(C0462ru c0462ru) {
        this.f9932b = c0462ru;
    }

    public final void onClick(View view) {
        C0462ru c0462ru = this.f9932b;
        Callback callback = c0462ru.f9658e;
        if (callback != null && c0462ru.f9659f) {
            callback.onMenuItemSelected(0, this.f9931a);
        }
    }
}
