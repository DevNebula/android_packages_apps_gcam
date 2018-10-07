package p000;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* compiled from: PG */
/* renamed from: hfv */
final class hfv implements OnLayoutChangeListener {
    /* renamed from: a */
    private final /* synthetic */ hfu f6542a;

    hfv(hfu hfu) {
        this.f6542a = hfu;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i3 - i;
        int i10 = i4 - i2;
        hfu hfu = this.f6542a;
        if (hfu.f6538c != i10 || hfu.f6537b != i9) {
            hfu.f6537b = i9;
            hfu.f6538c = i10;
        }
    }
}
