package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* compiled from: PG */
/* renamed from: qz */
final class C0444qz extends PopupWindow {
    public C0444qz(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C0540vk a = C0540vk.m6109a(context, attributeSet, C0382ni.f9328bH, i, i2);
        if (a.mo11398f(C0382ni.f9330bJ)) {
            setOverlapAnchor(a.mo11388a(C0382ni.f9330bJ, false));
        }
        setBackgroundDrawable(a.mo11390b(C0382ni.f9329bI));
        a.f9927b.recycle();
    }

    public final void showAsDropDown(View view, int i, int i2) {
        super.showAsDropDown(view, i, i2);
    }

    public final void showAsDropDown(View view, int i, int i2, int i3) {
        super.showAsDropDown(view, i, i2, i3);
    }

    public final void update(View view, int i, int i2, int i3, int i4) {
        super.update(view, i, i2, i3, i4);
    }
}
