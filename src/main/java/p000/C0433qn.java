package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: qn */
public final class C0433qn extends CheckBox {
    /* renamed from: a */
    private final C0435qp f9566a;

    public C0433qn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private C0433qn(Context context, AttributeSet attributeSet, byte b) {
        super(C0538vh.m6106a(context), attributeSet, R.attr.checkboxStyle);
        this.f9566a = new C0435qp(this);
        this.f9566a.mo10930a(attributeSet, R.attr.checkboxStyle);
    }

    public final int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        if (this.f9566a != null) {
        }
        return compoundPaddingLeft;
    }

    public final void setButtonDrawable(int i) {
        setButtonDrawable(C0383nj.m5682b(getContext(), i));
    }

    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0435qp c0435qp = this.f9566a;
        if (c0435qp != null) {
            c0435qp.mo10929a();
        }
    }
}
