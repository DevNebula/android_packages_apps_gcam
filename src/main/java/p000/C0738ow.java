package p000;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* renamed from: ow */
final class C0738ow extends FrameLayout implements C0389np {
    /* renamed from: a */
    public final CollapsibleActionView f22234a;

    C0738ow(View view) {
        super(view.getContext());
        this.f22234a = (CollapsibleActionView) view;
        addView(view);
    }

    /* renamed from: a */
    public final void mo10755a() {
        this.f22234a.onActionViewCollapsed();
    }

    /* renamed from: b */
    public final void mo10756b() {
        this.f22234a.onActionViewExpanded();
    }
}
