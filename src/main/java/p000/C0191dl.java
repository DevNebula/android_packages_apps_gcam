package p000;

import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;

/* compiled from: PG */
/* renamed from: dl */
public final class C0191dl implements OnHierarchyChangeListener {
    /* renamed from: a */
    private final /* synthetic */ CoordinatorLayout f3324a;

    public C0191dl(CoordinatorLayout coordinatorLayout) {
        this.f3324a = coordinatorLayout;
    }

    public final void onChildViewAdded(View view, View view2) {
        OnHierarchyChangeListener onHierarchyChangeListener = this.f3324a.f10470d;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    public final void onChildViewRemoved(View view, View view2) {
        this.f3324a.mo11686a(2);
        OnHierarchyChangeListener onHierarchyChangeListener = this.f3324a.f10470d;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
