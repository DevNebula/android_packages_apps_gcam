package p000;

import android.support.design.bottomsheet.BottomSheetBehavior;
import android.view.View;

/* compiled from: PG */
/* renamed from: bm */
public final class C0059bm implements Runnable {
    /* renamed from: a */
    private final View f1297a;
    /* renamed from: b */
    private final int f1298b;
    /* renamed from: c */
    private final /* synthetic */ BottomSheetBehavior f1299c;

    public C0059bm(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f1299c = bottomSheetBehavior;
        this.f1297a = view;
        this.f1298b = i;
    }

    public final void run() {
        C0354lo c0354lo = this.f1299c.f10425g;
        if (c0354lo == null || !c0354lo.mo10625b()) {
            this.f1299c.mo11660b(this.f1298b);
        } else {
            C0315jm.m4615a(this.f1297a, (Runnable) this);
        }
    }
}
