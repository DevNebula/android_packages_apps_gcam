package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;

/* compiled from: PG */
/* renamed from: rn */
public class C0455rn extends TextView {
    /* renamed from: a */
    private final C0431ql f9636a;
    /* renamed from: b */
    private final C0454rm f9637b;

    public C0455rn(Context context) {
        this(context, null);
    }

    public C0455rn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public C0455rn(Context context, AttributeSet attributeSet, int i) {
        super(C0538vh.m6106a(context), attributeSet, i);
        this.f9636a = new C0431ql(this);
        this.f9636a.mo10909a(attributeSet, i);
        this.f9637b = new C0454rm(this);
        this.f9637b.mo11016a(attributeSet, i);
        this.f9637b.mo11014a();
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0431ql c0431ql = this.f9636a;
        if (c0431ql != null) {
            c0431ql.mo10907a();
        }
        C0454rm c0454rm = this.f9637b;
        if (c0454rm != null) {
            c0454rm.mo11014a();
        }
    }

    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() != 1 ? 0 : 1;
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0261ha.m3014a(super.onCreateInputConnection(editorInfo), editorInfo, (View) this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0431ql c0431ql = this.f9636a;
        if (c0431ql != null) {
            c0431ql.mo10910b();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0431ql c0431ql = this.f9636a;
        if (c0431ql != null) {
            c0431ql.mo10908a(i);
        }
    }

    public void setLineHeight(int i) {
        C0261ha.m3022a((TextView) this, i);
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0454rm c0454rm = this.f9637b;
        if (c0454rm != null) {
            c0454rm.mo11015a(context, i);
        }
    }
}
