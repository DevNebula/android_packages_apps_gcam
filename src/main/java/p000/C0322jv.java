package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p001v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;

/* compiled from: PG */
/* renamed from: jv */
public final class C0322jv extends LayoutParams {
    /* renamed from: a */
    public boolean f8360a;
    /* renamed from: b */
    public int f8361b;
    /* renamed from: c */
    public float f8362c = 0.0f;
    /* renamed from: d */
    public boolean f8363d;
    /* renamed from: e */
    public int f8364e;
    /* renamed from: f */
    public int f8365f;

    public C0322jv() {
        super(-1, -1);
    }

    public C0322jv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f562a);
        this.f8361b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
    }
}
