package p000;

import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.widget.OverScroller;

/* compiled from: PG */
/* renamed from: bb */
final class C0054bb implements Runnable {
    /* renamed from: a */
    private final CoordinatorLayout f1085a;
    /* renamed from: b */
    private final View f1086b;
    /* renamed from: c */
    private final /* synthetic */ C0809ba f1087c;

    C0054bb(C0809ba c0809ba, CoordinatorLayout coordinatorLayout, View view) {
        this.f1087c = c0809ba;
        this.f1085a = coordinatorLayout;
        this.f1086b = view;
    }

    public final void run() {
        if (this.f1086b != null) {
            OverScroller overScroller = this.f1087c.f22548a;
            if (overScroller == null) {
                return;
            }
            if (overScroller.computeScrollOffset()) {
                C0809ba c0809ba = this.f1087c;
                c0809ba.mo399a(c0809ba.f22548a.getCurrY(), (int) kvl.UNSET_ENUM_VALUE, (int) LfuScheduler.MAX_PRIORITY);
                C0315jm.m4615a(this.f1086b, (Runnable) this);
                return;
            }
            this.f1087c.mo410a_(this.f1086b);
        }
    }
}
