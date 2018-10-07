package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

/* compiled from: PG */
/* renamed from: lu */
public class C0360lu extends MarginLayoutParams {
    /* renamed from: a */
    public int f9176a;

    public C0360lu() {
        super(-2, -2);
        this.f9176a = 0;
        this.f9176a = 8388627;
    }

    public C0360lu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9176a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0382ni.f9320b);
        this.f9176a = obtainStyledAttributes.getInt(C0382ni.f9373c, 0);
        obtainStyledAttributes.recycle();
    }

    public C0360lu(C0360lu c0360lu) {
        super(c0360lu);
        this.f9176a = 0;
        this.f9176a = c0360lu.f9176a;
    }

    public C0360lu(LayoutParams layoutParams) {
        super(layoutParams);
        this.f9176a = 0;
    }
}
