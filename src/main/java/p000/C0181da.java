package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

@Deprecated
/* compiled from: PG */
/* renamed from: da */
public class C0181da extends FrameLayout {
    public C0181da(Context context) {
        this(context, null);
    }

    public C0181da(Context context, byte b) {
        this(context);
    }

    public C0181da(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0182db.f3124a);
        if (obtainStyledAttributes.hasValue(C0182db.f3126c)) {
            C0315jm.m4608a((View) this, (float) obtainStyledAttributes.getDimensionPixelSize(C0182db.f3126c, 0));
        }
        obtainStyledAttributes.recycle();
        setClickable(true);
    }

    public C0181da(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0315jm.m4602B(this);
    }
}
