package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;

/* compiled from: PG */
/* renamed from: gyc */
public final class gyc extends LayoutParams {
    /* renamed from: a */
    public int f6153a;

    public gyc(int i) {
        super(-1, -1);
        this.f6153a = i;
    }

    public gyc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gyg.f6166a);
        if (obtainStyledAttributes.hasValue(gyg.f6167b)) {
            this.f6153a = C0252go.m2701x3675987a()[obtainStyledAttributes.getInt(0, 0)];
        }
        obtainStyledAttributes.recycle();
    }

    public gyc(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
