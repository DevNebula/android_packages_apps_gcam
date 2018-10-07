package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: rm */
public final class C0454rm {
    /* renamed from: a */
    public int f9625a = 0;
    /* renamed from: b */
    public Typeface f9626b;
    /* renamed from: c */
    public boolean f9627c;
    /* renamed from: d */
    private final TextView f9628d;
    /* renamed from: e */
    private C0539vi f9629e;
    /* renamed from: f */
    private C0539vi f9630f;
    /* renamed from: g */
    private C0539vi f9631g;
    /* renamed from: h */
    private C0539vi f9632h;
    /* renamed from: i */
    private C0539vi f9633i;
    /* renamed from: j */
    private C0539vi f9634j;
    /* renamed from: k */
    private final C0456ro f9635k;

    C0454rm(TextView textView) {
        this.f9628d = textView;
        this.f9635k = new C0456ro(this.f9628d);
    }

    /* renamed from: a */
    private final void m5813a(Drawable drawable, C0539vi c0539vi) {
        if (drawable != null && c0539vi != null) {
            C0436qq.m5789a(drawable, c0539vi, this.f9628d.getDrawableState());
        }
    }

    /* renamed from: a */
    final void mo11014a() {
        Drawable[] compoundDrawables;
        if (!(this.f9629e == null && this.f9630f == null && this.f9631g == null && this.f9632h == null)) {
            compoundDrawables = this.f9628d.getCompoundDrawables();
            m5813a(compoundDrawables[0], this.f9629e);
            m5813a(compoundDrawables[1], this.f9630f);
            m5813a(compoundDrawables[2], this.f9631g);
            m5813a(compoundDrawables[3], this.f9632h);
        }
        if (this.f9633i != null || this.f9634j != null) {
            compoundDrawables = this.f9628d.getCompoundDrawablesRelative();
            m5813a(compoundDrawables[0], this.f9633i);
            m5813a(compoundDrawables[2], this.f9634j);
        }
    }

    /* renamed from: a */
    private static C0539vi m5811a(Context context, C0436qq c0436qq, int i) {
        ColorStateList a = c0436qq.mo10931a(context, i);
        if (a == null) {
            return null;
        }
        C0539vi c0539vi = new C0539vi();
        c0539vi.f9925d = true;
        c0539vi.f9922a = a;
        return c0539vi;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    final void mo11016a(AttributeSet attributeSet, int i) {
        boolean z;
        Object obj;
        ColorStateList a;
        ColorStateList a2;
        ColorStateList a3;
        float dimension;
        float dimension2;
        float dimension3;
        int resourceId;
        boolean z2;
        int i2;
        Context context = this.f9628d.getContext();
        C0436qq a4 = C0436qq.m5787a();
        C0540vk a5 = C0540vk.m6109a(context, attributeSet, C0382ni.f9259S, i, 0);
        int g = a5.mo11399g(C0382ni.f9266Z, -1);
        if (a5.mo11398f(C0382ni.f9262V)) {
            this.f9629e = C0454rm.m5811a(context, a4, a5.mo11399g(C0382ni.f9262V, 0));
        }
        if (a5.mo11398f(C0382ni.f9265Y)) {
            this.f9630f = C0454rm.m5811a(context, a4, a5.mo11399g(C0382ni.f9265Y, 0));
        }
        if (a5.mo11398f(C0382ni.f9263W)) {
            this.f9631g = C0454rm.m5811a(context, a4, a5.mo11399g(C0382ni.f9263W, 0));
        }
        if (a5.mo11398f(C0382ni.f9260T)) {
            this.f9632h = C0454rm.m5811a(context, a4, a5.mo11399g(C0382ni.f9260T, 0));
        }
        if (a5.mo11398f(C0382ni.f9264X)) {
            this.f9633i = C0454rm.m5811a(context, a4, a5.mo11399g(C0382ni.f9264X, 0));
        }
        if (a5.mo11398f(C0382ni.f9261U)) {
            this.f9634j = C0454rm.m5811a(context, a4, a5.mo11399g(C0382ni.f9261U, 0));
        }
        a5.f9927b.recycle();
        boolean z3 = this.f9628d.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (g != -1) {
            C0540vk a6 = C0540vk.m6107a(context, g, C0382ni.f9339bS);
            if (z3) {
                z = false;
                obj = null;
            } else if (a6.mo11398f(C0382ni.f9385cb)) {
                z = a6.mo11388a(C0382ni.f9385cb, false);
                obj = 1;
            } else {
                z = false;
                obj = null;
            }
            m5812a(context, a6);
            a6.f9927b.recycle();
        } else {
            z = false;
            obj = null;
        }
        C0540vk a7 = C0540vk.m6109a(context, attributeSet, C0382ni.f9339bS, i, 0);
        if (!z3 && a7.mo11398f(C0382ni.f9385cb)) {
            z = a7.mo11388a(C0382ni.f9385cb, false);
            obj = 1;
        }
        if (VERSION.SDK_INT < 23) {
            if (a7.mo11398f(C0382ni.f9341bU)) {
                a = a7.mo11387a(C0382ni.f9341bU);
            } else {
                a = null;
            }
            if (a7.mo11398f(C0382ni.f9342bV)) {
                a2 = a7.mo11387a(C0382ni.f9342bV);
            } else {
                a2 = null;
            }
            if (a7.mo11398f(C0382ni.f9343bW)) {
                a3 = a7.mo11387a(C0382ni.f9343bW);
            } else {
                a3 = null;
            }
        } else {
            a3 = null;
            a = null;
            a2 = null;
        }
        m5812a(context, a7);
        a7.f9927b.recycle();
        if (a != null) {
            this.f9628d.setTextColor(a);
        }
        if (a2 != null) {
            this.f9628d.setHintTextColor(a2);
        }
        if (a3 != null) {
            this.f9628d.setLinkTextColor(a3);
        }
        if (!(z3 || r0 == null)) {
            m5814a(z);
        }
        Typeface typeface = this.f9626b;
        if (typeface != null) {
            this.f9628d.setTypeface(typeface, this.f9625a);
        }
        C0456ro c0456ro = this.f9635k;
        TypedArray obtainStyledAttributes = c0456ro.f9645h.obtainStyledAttributes(attributeSet, C0382ni.f9294aa, i, 0);
        if (obtainStyledAttributes.hasValue(C0382ni.f9299af)) {
            c0456ro.f9638a = obtainStyledAttributes.getInt(C0382ni.f9299af, 0);
        }
        if (obtainStyledAttributes.hasValue(C0382ni.f9298ae)) {
            dimension = obtainStyledAttributes.getDimension(C0382ni.f9298ae, -1.0f);
        } else {
            dimension = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(C0382ni.f9296ac)) {
            dimension2 = obtainStyledAttributes.getDimension(C0382ni.f9296ac, -1.0f);
        } else {
            dimension2 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(C0382ni.f9295ab)) {
            dimension3 = obtainStyledAttributes.getDimension(C0382ni.f9295ab, -1.0f);
        } else {
            dimension3 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(C0382ni.f9297ad)) {
            resourceId = obtainStyledAttributes.getResourceId(C0382ni.f9297ad, 0);
            if (resourceId > 0) {
                TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
                int length = obtainTypedArray.length();
                int[] iArr = new int[length];
                if (length > 0) {
                    for (resourceId = 0; resourceId < length; resourceId++) {
                        iArr[resourceId] = obtainTypedArray.getDimensionPixelSize(resourceId, -1);
                    }
                    c0456ro.f9643f = C0456ro.m5818a(iArr);
                    int[] iArr2 = c0456ro.f9643f;
                    int length2 = iArr2.length;
                    if (length2 > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c0456ro.f9644g = z2;
                    if (c0456ro.f9644g) {
                        c0456ro.f9638a = 1;
                        c0456ro.f9641d = (float) iArr2[0];
                        c0456ro.f9642e = (float) iArr2[length2 - 1];
                        c0456ro.f9640c = -1.0f;
                    }
                }
                obtainTypedArray.recycle();
            }
        }
        obtainStyledAttributes.recycle();
        if (!c0456ro.mo11026a()) {
            c0456ro.f9638a = 0;
        } else if (c0456ro.f9638a == 1) {
            if (!c0456ro.f9644g) {
                DisplayMetrics displayMetrics = c0456ro.f9645h.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                StringBuilder stringBuilder;
                if (dimension2 <= 0.0f) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Minimum auto-size text size (");
                    stringBuilder.append(dimension2);
                    stringBuilder.append("px) is less or equal to (0px)");
                    throw new IllegalArgumentException(stringBuilder.toString());
                } else if (dimension3 <= dimension2) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Maximum auto-size text size (");
                    stringBuilder.append(dimension3);
                    stringBuilder.append("px) is less or equal to minimum auto-size ");
                    stringBuilder.append("text size (");
                    stringBuilder.append(dimension2);
                    stringBuilder.append("px)");
                    throw new IllegalArgumentException(stringBuilder.toString());
                } else if (dimension <= 0.0f) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("The auto-size step granularity (");
                    stringBuilder2.append(dimension);
                    stringBuilder2.append("px) is less or equal to (0px)");
                    throw new IllegalArgumentException(stringBuilder2.toString());
                } else {
                    c0456ro.f9638a = 1;
                    c0456ro.f9641d = dimension2;
                    c0456ro.f9642e = dimension3;
                    c0456ro.f9640c = dimension;
                    c0456ro.f9644g = false;
                }
            }
            if (c0456ro.mo11026a() && c0456ro.f9638a == 1) {
                if (!c0456ro.f9644g || c0456ro.f9643f.length == 0) {
                    i2 = 1;
                    for (float round = (float) Math.round(c0456ro.f9641d); Math.round(c0456ro.f9640c + round) <= Math.round(c0456ro.f9642e); round += c0456ro.f9640c) {
                        i2++;
                    }
                    int[] iArr3 = new int[i2];
                    dimension2 = c0456ro.f9641d;
                    for (resourceId = 0; resourceId < i2; resourceId++) {
                        iArr3[resourceId] = Math.round(dimension2);
                        dimension2 += c0456ro.f9640c;
                    }
                    c0456ro.f9643f = C0456ro.m5818a(iArr3);
                }
                c0456ro.f9639b = true;
            } else {
                c0456ro.f9639b = false;
            }
            z2 = c0456ro.f9639b;
        }
        C0456ro c0456ro2 = this.f9635k;
        if (c0456ro2.f9638a != 0) {
            int[] iArr4 = c0456ro2.f9643f;
            if (iArr4.length > 0) {
                if (((float) this.f9628d.getAutoSizeStepGranularity()) != -1.0f) {
                    this.f9628d.setAutoSizeTextTypeUniformWithConfiguration(Math.round(this.f9635k.f9641d), Math.round(this.f9635k.f9642e), Math.round(this.f9635k.f9640c), 0);
                } else {
                    this.f9628d.setAutoSizeTextTypeUniformWithPresetSizes(iArr4, 0);
                }
            }
        }
        C0540vk a8 = C0540vk.m6108a(context, attributeSet, C0382ni.f9294aa);
        i2 = a8.mo11391c(C0382ni.f9300ag, -1);
        g = a8.mo11391c(C0382ni.f9301ah, -1);
        int c = a8.mo11391c(C0382ni.f9302ai, -1);
        a8.f9927b.recycle();
        if (i2 != -1) {
            TextView textView = this.f9628d;
            C0261ha.m3010a(i2);
            textView.setFirstBaselineToTopHeight(i2);
        }
        if (g != -1) {
            TextView textView2 = this.f9628d;
            C0261ha.m3010a(g);
            FontMetricsInt fontMetricsInt = textView2.getPaint().getFontMetricsInt();
            if (textView2.getIncludeFontPadding()) {
                resourceId = fontMetricsInt.bottom;
            } else {
                resourceId = fontMetricsInt.descent;
            }
            if (g > Math.abs(resourceId)) {
                textView2.setPadding(textView2.getPaddingLeft(), textView2.getPaddingTop(), textView2.getPaddingRight(), g - resourceId);
            }
        }
        if (c != -1) {
            C0261ha.m3022a(this.f9628d, c);
        }
    }

    /* renamed from: a */
    final void mo11015a(Context context, int i) {
        C0540vk a = C0540vk.m6107a(context, i, C0382ni.f9339bS);
        if (a.mo11398f(C0382ni.f9385cb)) {
            m5814a(a.mo11388a(C0382ni.f9385cb, false));
        }
        m5812a(context, a);
        a.f9927b.recycle();
        Typeface typeface = this.f9626b;
        if (typeface != null) {
            this.f9628d.setTypeface(typeface, this.f9625a);
        }
    }

    /* renamed from: a */
    private final void m5814a(boolean z) {
        this.f9628d.setAllCaps(z);
    }

    /* renamed from: a */
    private final void m5812a(Context context, C0540vk c0540vk) {
        this.f9625a = c0540vk.mo11393d(C0382ni.f9345bY, this.f9625a);
        if (c0540vk.mo11398f(C0382ni.f9340bT) || c0540vk.mo11398f(C0382ni.f9384ca)) {
            int i;
            this.f9626b = null;
            if (c0540vk.mo11398f(C0382ni.f9384ca)) {
                i = C0382ni.f9384ca;
            } else {
                i = C0382ni.f9340bT;
            }
            if (!context.isRestricted()) {
                C0722mz c0722mz = new C0722mz(this, new WeakReference(this.f9628d));
                try {
                    Typeface typeface;
                    boolean z;
                    int i2 = this.f9625a;
                    int resourceId = c0540vk.f9927b.getResourceId(i, 0);
                    if (resourceId != 0) {
                        if (c0540vk.f9928c == null) {
                            c0540vk.f9928c = new TypedValue();
                        }
                        Context context2 = c0540vk.f9926a;
                        TypedValue typedValue = c0540vk.f9928c;
                        if (context2.isRestricted()) {
                            typeface = null;
                        } else {
                            Resources resources = context2.getResources();
                            resources.getValue(resourceId, typedValue, true);
                            typeface = C0351ll.m5567a(context2, resources, typedValue, resourceId, i2, c0722mz);
                            if (typeface == null) {
                            }
                        }
                    } else {
                        typeface = null;
                    }
                    this.f9626b = typeface;
                    if (this.f9626b == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f9627c = z;
                } catch (UnsupportedOperationException e) {
                } catch (NotFoundException e2) {
                }
            }
            if (this.f9626b == null) {
                String d = c0540vk.mo11394d(i);
                if (d != null) {
                    this.f9626b = Typeface.create(d, this.f9625a);
                }
            }
        } else if (c0540vk.mo11398f(C0382ni.f9346bZ)) {
            this.f9627c = false;
            switch (c0540vk.mo11393d(C0382ni.f9346bZ, 1)) {
                case 1:
                    this.f9626b = Typeface.SANS_SERIF;
                    return;
                case 2:
                    this.f9626b = Typeface.SERIF;
                    return;
                case 3:
                    this.f9626b = Typeface.MONOSPACE;
                    return;
                default:
                    return;
            }
        }
    }
}
