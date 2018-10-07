package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: rb */
public final class C0446rb extends RadioButton {
    /* renamed from: a */
    private final C0435qp f9606a;
    /* renamed from: b */
    private final C0454rm f9607b;

    public C0446rb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private C0446rb(Context context, AttributeSet attributeSet, byte b) {
        super(C0538vh.m6106a(context), attributeSet, R.attr.radioButtonStyle);
        this.f9606a = new C0435qp(this);
        this.f9606a.mo10930a(attributeSet, R.attr.radioButtonStyle);
        this.f9607b = new C0454rm(this);
        this.f9607b.mo11016a(attributeSet, (int) R.attr.radioButtonStyle);
    }

    public final int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        if (this.f9606a != null) {
        }
        return compoundPaddingLeft;
    }

    public final void setButtonDrawable(int i) {
        setButtonDrawable(C0383nj.m5682b(getContext(), i));
    }

    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0435qp c0435qp = this.f9606a;
        if (c0435qp != null) {
            c0435qp.mo10929a();
        }
    }
}
