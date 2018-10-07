package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: qk */
public class C0430qk extends AutoCompleteTextView {
    /* renamed from: a */
    private static final int[] f9555a = new int[]{16843126};
    /* renamed from: b */
    private final C0431ql f9556b;
    /* renamed from: c */
    private final C0454rm f9557c;

    public C0430qk(Context context) {
        this(context, null);
    }

    public C0430qk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public C0430qk(Context context, AttributeSet attributeSet, int i) {
        super(C0538vh.m6106a(context), attributeSet, i);
        C0540vk a = C0540vk.m6109a(getContext(), attributeSet, f9555a, i, 0);
        if (a.mo11398f(0)) {
            setDropDownBackgroundDrawable(a.mo11390b(0));
        }
        a.f9927b.recycle();
        this.f9556b = new C0431ql(this);
        this.f9556b.mo10909a(attributeSet, i);
        this.f9557c = new C0454rm(this);
        this.f9557c.mo11016a(attributeSet, i);
        this.f9557c.mo11014a();
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0431ql c0431ql = this.f9556b;
        if (c0431ql != null) {
            c0431ql.mo10907a();
        }
        C0454rm c0454rm = this.f9557c;
        if (c0454rm != null) {
            c0454rm.mo11014a();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0261ha.m3014a(super.onCreateInputConnection(editorInfo), editorInfo, (View) this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0431ql c0431ql = this.f9556b;
        if (c0431ql != null) {
            c0431ql.mo10910b();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0431ql c0431ql = this.f9556b;
        if (c0431ql != null) {
            c0431ql.mo10908a(i);
        }
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0383nj.m5682b(getContext(), i));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0454rm c0454rm = this.f9557c;
        if (c0454rm != null) {
            c0454rm.mo11015a(context, i);
        }
    }
}
