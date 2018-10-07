package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* compiled from: PG */
/* renamed from: vk */
public final class C0540vk {
    /* renamed from: a */
    public final Context f9926a;
    /* renamed from: b */
    public final TypedArray f9927b;
    /* renamed from: c */
    public TypedValue f9928c;

    private C0540vk(Context context, TypedArray typedArray) {
        this.f9926a = context;
        this.f9927b = typedArray;
    }

    /* renamed from: a */
    public final boolean mo11388a(int i, boolean z) {
        return this.f9927b.getBoolean(i, z);
    }

    /* renamed from: a */
    public final int mo11386a(int i, int i2) {
        return this.f9927b.getColor(i, i2);
    }

    /* renamed from: a */
    public final ColorStateList mo11387a(int i) {
        if (this.f9927b.hasValue(i)) {
            int resourceId = this.f9927b.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList a = C0383nj.m5681a(this.f9926a, resourceId);
                if (a != null) {
                    return a;
                }
            }
        }
        return this.f9927b.getColorStateList(i);
    }

    /* renamed from: b */
    public final int mo11389b(int i, int i2) {
        return this.f9927b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: c */
    public final int mo11391c(int i, int i2) {
        return this.f9927b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: b */
    public final Drawable mo11390b(int i) {
        if (this.f9927b.hasValue(i)) {
            int resourceId = this.f9927b.getResourceId(i, 0);
            if (resourceId != 0) {
                return C0383nj.m5682b(this.f9926a, resourceId);
            }
        }
        return this.f9927b.getDrawable(i);
    }

    /* renamed from: c */
    public final Drawable mo11392c(int i) {
        if (this.f9927b.hasValue(i)) {
            int resourceId = this.f9927b.getResourceId(i, 0);
            if (resourceId != 0) {
                return C0436qq.m5787a().mo10932a(this.f9926a, resourceId, true);
            }
        }
        return null;
    }

    /* renamed from: d */
    public final int mo11393d(int i, int i2) {
        return this.f9927b.getInt(i, i2);
    }

    /* renamed from: e */
    public final int mo11395e(int i, int i2) {
        return this.f9927b.getInteger(i, i2);
    }

    /* renamed from: f */
    public final int mo11397f(int i, int i2) {
        return this.f9927b.getLayoutDimension(i, i2);
    }

    /* renamed from: g */
    public final int mo11399g(int i, int i2) {
        return this.f9927b.getResourceId(i, i2);
    }

    /* renamed from: d */
    public final String mo11394d(int i) {
        return this.f9927b.getString(i);
    }

    /* renamed from: e */
    public final CharSequence mo11396e(int i) {
        return this.f9927b.getText(i);
    }

    /* renamed from: f */
    public final boolean mo11398f(int i) {
        return this.f9927b.hasValue(i);
    }

    /* renamed from: a */
    public static C0540vk m6107a(Context context, int i, int[] iArr) {
        return new C0540vk(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: a */
    public static C0540vk m6108a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0540vk(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: a */
    public static C0540vk m6109a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0540vk(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }
}
