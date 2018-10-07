package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: qu */
public final class C0439qu extends EditText {
    /* renamed from: a */
    private final C0431ql f9593a;
    /* renamed from: b */
    private final C0454rm f9594b;

    public C0439qu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private C0439qu(Context context, AttributeSet attributeSet, byte b) {
        super(C0538vh.m6106a(context), attributeSet, R.attr.editTextStyle);
        this.f9593a = new C0431ql(this);
        this.f9593a.mo10909a(attributeSet, R.attr.editTextStyle);
        this.f9594b = new C0454rm(this);
        this.f9594b.mo11016a(attributeSet, (int) R.attr.editTextStyle);
        this.f9594b.mo11014a();
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        C0431ql c0431ql = this.f9593a;
        if (c0431ql != null) {
            c0431ql.mo10907a();
        }
        C0454rm c0454rm = this.f9594b;
        if (c0454rm != null) {
            c0454rm.mo11014a();
        }
    }

    public final /* bridge */ /* synthetic */ CharSequence getText() {
        return getText();
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0261ha.m3014a(super.onCreateInputConnection(editorInfo), editorInfo, (View) this);
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0431ql c0431ql = this.f9593a;
        if (c0431ql != null) {
            c0431ql.mo10910b();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0431ql c0431ql = this.f9593a;
        if (c0431ql != null) {
            c0431ql.mo10908a(i);
        }
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0454rm c0454rm = this.f9594b;
        if (c0454rm != null) {
            c0454rm.mo11015a(context, i);
        }
    }
}
