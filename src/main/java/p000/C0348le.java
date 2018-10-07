package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

/* compiled from: PG */
/* renamed from: le */
public final class C0348le extends MarginLayoutParams {
    /* renamed from: a */
    public int f9142a = 0;
    /* renamed from: b */
    public float f9143b;
    /* renamed from: c */
    public boolean f9144c;
    /* renamed from: d */
    public int f9145d;

    public C0348le() {
        super(-1, -1);
    }

    public C0348le(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0345kz.f9111a);
        this.f9142a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public C0348le(C0348le c0348le) {
        super(c0348le);
        this.f9142a = c0348le.f9142a;
    }

    public C0348le(LayoutParams layoutParams) {
        super(layoutParams);
    }

    public C0348le(MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }
}
