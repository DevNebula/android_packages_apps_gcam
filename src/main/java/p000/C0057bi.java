package p000;

import android.support.design.behavior.SwipeDismissBehavior;
import android.view.View;

/* compiled from: PG */
/* renamed from: bi */
public final class C0057bi implements Runnable {
    /* renamed from: a */
    private final View f1207a;
    /* renamed from: b */
    private final boolean f1208b;
    /* renamed from: c */
    private final /* synthetic */ SwipeDismissBehavior f1209c;

    C0057bi(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.f1209c = swipeDismissBehavior;
        this.f1207a = view;
        this.f1208b = z;
    }

    public final void run() {
        C0354lo c0354lo = this.f1209c.f10412a;
        if (c0354lo == null || !c0354lo.mo10625b()) {
            if (this.f1208b) {
            }
        } else {
            C0315jm.m4615a(this.f1207a, (Runnable) this);
        }
    }
}
