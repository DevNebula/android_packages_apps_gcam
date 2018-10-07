package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* compiled from: PG */
/* renamed from: qo */
public final class C0434qo extends CheckedTextView {
    /* renamed from: a */
    private static final int[] f9567a = new int[]{16843016};
    /* renamed from: b */
    private final C0454rm f9568b;

    public C0434qo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private C0434qo(Context context, AttributeSet attributeSet, byte b) {
        super(C0538vh.m6106a(context), attributeSet, 16843720);
        this.f9568b = new C0454rm(this);
        this.f9568b.mo11016a(attributeSet, 16843720);
        this.f9568b.mo11014a();
        C0540vk a = C0540vk.m6109a(getContext(), attributeSet, f9567a, 16843720, 0);
        setCheckMarkDrawable(a.mo11390b(0));
        a.f9927b.recycle();
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        C0454rm c0454rm = this.f9568b;
        if (c0454rm != null) {
            c0454rm.mo11014a();
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0261ha.m3014a(super.onCreateInputConnection(editorInfo), editorInfo, (View) this);
    }

    public final void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C0383nj.m5682b(getContext(), i));
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0454rm c0454rm = this.f9568b;
        if (c0454rm != null) {
            c0454rm.mo11015a(context, i);
        }
    }
}
