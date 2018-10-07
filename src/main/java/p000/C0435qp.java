package p000;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* compiled from: PG */
/* renamed from: qp */
final class C0435qp {
    /* renamed from: a */
    private final CompoundButton f9569a;
    /* renamed from: b */
    private boolean f9570b;

    C0435qp(CompoundButton compoundButton) {
        this.f9569a = compoundButton;
    }

    /* renamed from: a */
    final void mo10930a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f9569a.getContext().obtainStyledAttributes(attributeSet, C0382ni.f9318ay, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(0)) {
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId != 0) {
                    CompoundButton compoundButton = this.f9569a;
                    compoundButton.setButtonDrawable(C0383nj.m5682b(compoundButton.getContext(), resourceId));
                }
            }
            if (obtainStyledAttributes.hasValue(1)) {
                this.f9569a.setButtonTintList(obtainStyledAttributes.getColorStateList(1));
            }
            if (obtainStyledAttributes.hasValue(2)) {
                this.f9569a.setButtonTintMode(C0474sg.m5866a(obtainStyledAttributes.getInt(2, -1), null));
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    final void mo10929a() {
        if (this.f9570b) {
            this.f9570b = false;
            return;
        }
        this.f9570b = true;
        this.f9569a.getButtonDrawable();
    }
}
