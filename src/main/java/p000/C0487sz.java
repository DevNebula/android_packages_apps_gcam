package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

/* compiled from: PG */
/* renamed from: sz */
public class C0487sz extends MarginLayoutParams {
    /* renamed from: g */
    public float f9760g;
    /* renamed from: h */
    public int f9761h;

    public C0487sz(int i) {
        super(i, -2);
        this.f9761h = -1;
        this.f9760g = 0.0f;
    }

    public C0487sz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9761h = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0382ni.f9277aJ);
        this.f9760g = obtainStyledAttributes.getFloat(C0382ni.f9279aL, 0.0f);
        this.f9761h = obtainStyledAttributes.getInt(C0382ni.f9278aK, -1);
        obtainStyledAttributes.recycle();
    }

    public C0487sz(LayoutParams layoutParams) {
        super(layoutParams);
        this.f9761h = -1;
    }
}
