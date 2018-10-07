package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* compiled from: PG */
/* renamed from: cs */
public class C0174cs extends ImageButton {
    /* renamed from: d */
    public int f2839d;

    public C0174cs(Context context) {
        this(context, null);
    }

    public C0174cs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0174cs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2839d = getVisibility();
    }

    /* renamed from: a */
    public final void mo5718a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f2839d = i;
        }
    }

    public void setVisibility(int i) {
        mo5718a(i, true);
    }
}
