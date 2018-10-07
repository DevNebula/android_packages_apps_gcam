package p000;

import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import java.util.Objects;

/* compiled from: PG */
/* renamed from: bh */
public final class C0639bh implements C0313jk {
    /* renamed from: a */
    private final /* synthetic */ CoordinatorLayout f11358a;

    public C0639bh(CoordinatorLayout coordinatorLayout) {
        this.f11358a = coordinatorLayout;
    }

    /* renamed from: a */
    public final C0333kj mo9476a(View view, C0333kj c0333kj) {
        boolean z = true;
        int i = 0;
        CoordinatorLayout coordinatorLayout = this.f11358a;
        if (!Objects.equals(coordinatorLayout.f10468b, c0333kj)) {
            boolean z2;
            coordinatorLayout.f10468b = c0333kj;
            if (c0333kj == null) {
                z2 = false;
            } else if (c0333kj.mo10075d() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            coordinatorLayout.f10469c = z2;
            if (coordinatorLayout.f10469c) {
                z = false;
            } else if (coordinatorLayout.getBackground() != null) {
                z = false;
            }
            coordinatorLayout.setWillNotDraw(z);
            if (!c0333kj.mo10076e()) {
                int childCount = coordinatorLayout.getChildCount();
                while (i < childCount) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (C0315jm.m4632g(childAt) && ((C0192dm) childAt.getLayoutParams()).f3337a != null && c0333kj.mo10076e()) {
                        break;
                    }
                    i++;
                }
            }
            coordinatorLayout.requestLayout();
        }
        return c0333kj;
    }
}
