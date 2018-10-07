package p000;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: rf */
public final class C0449rf extends Spinner {
    /* renamed from: d */
    private static final int[] f9610d = new int[]{16843505};
    /* renamed from: a */
    public C0838ri f9611a;
    /* renamed from: b */
    public int f9612b;
    /* renamed from: c */
    public final Rect f9613c;
    /* renamed from: e */
    private final C0431ql f9614e;
    /* renamed from: f */
    private final Context f9615f;
    /* renamed from: g */
    private C0480sp f9616g;
    /* renamed from: h */
    private SpinnerAdapter f9617h;
    /* renamed from: i */
    private final boolean f9618i;

    public C0449rf(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private C0449rf(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (int) R.attr.spinnerStyle);
    }

    private C0449rf(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, R.attr.spinnerStyle, -1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c8  */
    private C0449rf(android.content.Context r10, android.util.AttributeSet r11, int r12, int r13) {
        /*
        r9 = this;
        r7 = 1;
        r2 = 0;
        r6 = 0;
        r9.<init>(r10, r11, r12);
        r0 = new android.graphics.Rect;
        r0.<init>();
        r9.f9613c = r0;
        r0 = p000.C0382ni.f9334bN;
        r3 = p000.C0540vk.m6109a(r10, r11, r0, r12, r6);
        r0 = new ql;
        r0.<init>(r9);
        r9.f9614e = r0;
        r0 = p000.C0382ni.f9338bR;
        r0 = r3.mo11399g(r0, r6);
        if (r0 == 0) goto L_0x00b0;
    L_0x0022:
        r1 = new nq;
        r1.<init>(r10, r0);
        r9.f9615f = r1;
    L_0x0029:
        r0 = r9.f9615f;
        if (r0 != 0) goto L_0x005c;
    L_0x002d:
        r0 = r3.f9927b;
        r0 = r0.getTextArray(r6);
        if (r0 == 0) goto L_0x0046;
    L_0x0035:
        r1 = new android.widget.ArrayAdapter;
        r4 = 17367048; // 0x1090008 float:2.5162948E-38 double:8.580462E-317;
        r1.<init>(r10, r4, r0);
        r0 = 2130968684; // 0x7f04006c float:1.7546029E38 double:1.052838419E-314;
        r1.setDropDownViewResource(r0);
        r9.setAdapter(r1);
    L_0x0046:
        r0 = r3.f9927b;
        r0.recycle();
        r9.f9618i = r7;
        r0 = r9.f9617h;
        if (r0 == 0) goto L_0x0056;
    L_0x0051:
        r9.setAdapter(r0);
        r9.f9617h = r2;
    L_0x0056:
        r0 = r9.f9614e;
        r0.mo10909a(r11, r12);
        return;
    L_0x005c:
        r0 = f9610d;	 Catch:{ Exception -> 0x00b4, all -> 0x00c3 }
        r1 = 0;
        r1 = r10.obtainStyledAttributes(r11, r0, r12, r1);	 Catch:{ Exception -> 0x00b4, all -> 0x00c3 }
        r0 = 0;
        r0 = r1.hasValue(r0);	 Catch:{ Exception -> 0x00d6, all -> 0x00cc }
        if (r0 == 0) goto L_0x0070;
    L_0x006a:
        r0 = 0;
        r4 = 0;
        r13 = r1.getInt(r0, r4);	 Catch:{ Exception -> 0x00d6, all -> 0x00cc }
    L_0x0070:
        if (r1 == 0) goto L_0x0075;
    L_0x0072:
        r1.recycle();
    L_0x0075:
        if (r13 != r7) goto L_0x002d;
    L_0x0077:
        r0 = new ri;
        r1 = r9.f9615f;
        r0.<init>(r9, r1, r11, r12);
        r1 = r9.f9615f;
        r4 = p000.C0382ni.f9334bN;
        r1 = p000.C0540vk.m6109a(r1, r11, r4, r12, r6);
        r4 = p000.C0382ni.f9335bO;
        r5 = -2;
        r4 = r1.mo11397f(r4, r5);
        r9.f9612b = r4;
        r4 = p000.C0382ni.f9336bP;
        r4 = r1.mo11390b(r4);
        r0.mo14428a(r4);
        r4 = p000.C0382ni.f9337bQ;
        r4 = r3.mo11394d(r4);
        r0.f25450a = r4;
        r1 = r1.f9927b;
        r1.recycle();
        r9.f9611a = r0;
        r1 = new rg;
        r1.<init>(r9, r9, r0);
        r9.f9616g = r1;
        goto L_0x002d;
    L_0x00b0:
        r9.f9615f = r2;
        goto L_0x0029;
    L_0x00b4:
        r0 = move-exception;
        r1 = r2;
    L_0x00b6:
        r4 = "AppCompatSpinner";
        r5 = "Could not read android:spinnerMode";
        android.util.Log.i(r4, r5, r0);	 Catch:{ all -> 0x00d1 }
        if (r1 == 0) goto L_0x0075;
    L_0x00bf:
        r1.recycle();
        goto L_0x0075;
    L_0x00c3:
        r0 = move-exception;
        r1 = r0;
        r0 = r2;
    L_0x00c6:
        if (r0 == 0) goto L_0x00cb;
    L_0x00c8:
        r0.recycle();
    L_0x00cb:
        throw r1;
    L_0x00cc:
        r0 = move-exception;
        r8 = r1;
        r1 = r0;
        r0 = r8;
        goto L_0x00c6;
    L_0x00d1:
        r0 = move-exception;
        r8 = r1;
        r1 = r0;
        r0 = r8;
        goto L_0x00c6;
    L_0x00d6:
        r0 = move-exception;
        goto L_0x00b6;
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    /* renamed from: a */
    final int mo10976a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        int max2 = Math.max(0, max - (15 - (min - max)));
        int i = 0;
        max = 0;
        View view = null;
        while (max2 < min) {
            int i2;
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                i2 = itemViewType;
            } else {
                i2 = i;
            }
            if (itemViewType != i) {
                view = null;
            }
            View view2 = spinnerAdapter.getView(max2, view, this);
            if (view2.getLayoutParams() == null) {
                view2.setLayoutParams(new LayoutParams(-2, -2));
            }
            view2.measure(makeMeasureSpec, makeMeasureSpec2);
            max = Math.max(max, view2.getMeasuredWidth());
            max2++;
            i = i2;
            view = view2;
        }
        if (drawable == null) {
            return max;
        }
        drawable.getPadding(this.f9613c);
        Rect rect = this.f9613c;
        return (rect.right + rect.left) + max;
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        C0431ql c0431ql = this.f9614e;
        if (c0431ql != null) {
            c0431ql.mo10907a();
        }
    }

    public final int getDropDownHorizontalOffset() {
        C0760tg c0760tg = this.f9611a;
        if (c0760tg == null) {
            return super.getDropDownHorizontalOffset();
        }
        return c0760tg.f22315g;
    }

    public final int getDropDownVerticalOffset() {
        C0838ri c0838ri = this.f9611a;
        if (c0838ri != null) {
            return c0838ri.mo14433g();
        }
        return super.getDropDownVerticalOffset();
    }

    public final int getDropDownWidth() {
        if (this.f9611a != null) {
            return this.f9612b;
        }
        return super.getDropDownWidth();
    }

    public final Drawable getPopupBackground() {
        C0760tg c0760tg = this.f9611a;
        if (c0760tg == null) {
            return super.getPopupBackground();
        }
        return c0760tg.f22326r.getBackground();
    }

    public final Context getPopupContext() {
        if (this.f9611a != null) {
            return this.f9615f;
        }
        return super.getPopupContext();
    }

    public final CharSequence getPrompt() {
        C0838ri c0838ri = this.f9611a;
        return c0838ri == null ? super.getPrompt() : c0838ri.f25450a;
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0760tg c0760tg = this.f9611a;
        if (c0760tg != null && c0760tg.f22326r.isShowing()) {
            this.f9611a.mo10860c();
        }
    }

    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f9611a != null && MeasureSpec.getMode(i) == kvl.UNSET_ENUM_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo10976a(getAdapter(), getBackground())), MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0480sp c0480sp = this.f9616g;
        if (c0480sp == null || !c0480sp.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final boolean performClick() {
        C0760tg c0760tg = this.f9611a;
        if (c0760tg == null) {
            return super.performClick();
        }
        if (!c0760tg.f22326r.isShowing()) {
            this.f9611a.mo10863f();
        }
        return true;
    }

    public final void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (this.f9618i) {
            super.setAdapter(spinnerAdapter);
            if (this.f9611a != null) {
                Context context = this.f9615f;
                if (context == null) {
                    context = getContext();
                }
                this.f9611a.mo14429a(new C0450rh(spinnerAdapter, context.getTheme()));
                return;
            }
            return;
        }
        this.f9617h = spinnerAdapter;
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0431ql c0431ql = this.f9614e;
        if (c0431ql != null) {
            c0431ql.mo10910b();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0431ql c0431ql = this.f9614e;
        if (c0431ql != null) {
            c0431ql.mo10908a(i);
        }
    }

    public final void setDropDownHorizontalOffset(int i) {
        C0760tg c0760tg = this.f9611a;
        if (c0760tg == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            c0760tg.f22315g = i;
        }
    }

    public final void setDropDownVerticalOffset(int i) {
        C0838ri c0838ri = this.f9611a;
        if (c0838ri != null) {
            c0838ri.mo14432b(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    public final void setDropDownWidth(int i) {
        if (this.f9611a != null) {
            this.f9612b = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    public final void setPopupBackgroundDrawable(Drawable drawable) {
        C0838ri c0838ri = this.f9611a;
        if (c0838ri != null) {
            c0838ri.mo14428a(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public final void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C0383nj.m5682b(getPopupContext(), i));
    }

    public final void setPrompt(CharSequence charSequence) {
        C0838ri c0838ri = this.f9611a;
        if (c0838ri == null) {
            super.setPrompt(charSequence);
        } else {
            c0838ri.f25450a = charSequence;
        }
    }
}
