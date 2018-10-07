package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: qy */
public final class C0443qy extends MultiAutoCompleteTextView {
    /* renamed from: a */
    private static final int[] f9600a = new int[]{16843126};
    /* renamed from: b */
    private final C0431ql f9601b;
    /* renamed from: c */
    private final C0454rm f9602c;

    public C0443qy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private C0443qy(Context context, AttributeSet attributeSet, byte b) {
        super(C0538vh.m6106a(context), attributeSet, R.attr.autoCompleteTextViewStyle);
        C0540vk a = C0540vk.m6109a(getContext(), attributeSet, f9600a, R.attr.autoCompleteTextViewStyle, 0);
        if (a.mo11398f(0)) {
            setDropDownBackgroundDrawable(a.mo11390b(0));
        }
        a.f9927b.recycle();
        this.f9601b = new C0431ql(this);
        this.f9601b.mo10909a(attributeSet, R.attr.autoCompleteTextViewStyle);
        this.f9602c = new C0454rm(this);
        this.f9602c.mo11016a(attributeSet, (int) R.attr.autoCompleteTextViewStyle);
        this.f9602c.mo11014a();
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        C0431ql c0431ql = this.f9601b;
        if (c0431ql != null) {
            c0431ql.mo10907a();
        }
        C0454rm c0454rm = this.f9602c;
        if (c0454rm != null) {
            c0454rm.mo11014a();
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0261ha.m3014a(super.onCreateInputConnection(editorInfo), editorInfo, (View) this);
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0431ql c0431ql = this.f9601b;
        if (c0431ql != null) {
            c0431ql.mo10910b();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0431ql c0431ql = this.f9601b;
        if (c0431ql != null) {
            c0431ql.mo10908a(i);
        }
    }

    public final void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0383nj.m5682b(getContext(), i));
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0454rm c0454rm = this.f9602c;
        if (c0454rm != null) {
            c0454rm.mo11015a(context, i);
        }
    }
}
