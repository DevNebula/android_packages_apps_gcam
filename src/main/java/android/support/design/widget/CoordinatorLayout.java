package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.refocus.processing.DepthmapTask;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.C0046ar;
import p000.C0188di;
import p000.C0189dj;
import p000.C0190dk;
import p000.C0191dl;
import p000.C0192dm;
import p000.C0193dn;
import p000.C0195dq;
import p000.C0261ha;
import p000.C0300iw;
import p000.C0311ji;
import p000.C0312jj;
import p000.C0313jk;
import p000.C0315jm;
import p000.C0333kj;
import p000.C0344ky;
import p000.C0358ls;
import p000.C0639bh;
import p000.C0668do;
import p000.C0821iy;

/* compiled from: PG */
public class CoordinatorLayout extends ViewGroup implements C0311ji {
    /* renamed from: e */
    private static final String f10462e;
    /* renamed from: f */
    private static final Class[] f10463f = new Class[]{Context.class, AttributeSet.class};
    /* renamed from: g */
    private static final ThreadLocal f10464g = new ThreadLocal();
    /* renamed from: h */
    private static final Comparator f10465h = new C0195dq();
    /* renamed from: i */
    private static final C0300iw f10466i = new C0821iy(12);
    /* renamed from: a */
    public final C0344ky f10467a;
    /* renamed from: b */
    public C0333kj f10468b;
    /* renamed from: c */
    public boolean f10469c;
    /* renamed from: d */
    public OnHierarchyChangeListener f10470d;
    /* renamed from: j */
    private final List f10471j;
    /* renamed from: k */
    private final List f10472k;
    /* renamed from: l */
    private final List f10473l;
    /* renamed from: m */
    private final int[] f10474m;
    /* renamed from: n */
    private boolean f10475n;
    /* renamed from: o */
    private boolean f10476o;
    /* renamed from: p */
    private int[] f10477p;
    /* renamed from: q */
    private View f10478q;
    /* renamed from: r */
    private View f10479r;
    /* renamed from: s */
    private C0193dn f10480s;
    /* renamed from: t */
    private boolean f10481t;
    /* renamed from: u */
    private Drawable f10482u;
    /* renamed from: v */
    private C0313jk f10483v;
    /* renamed from: w */
    private final C0312jj f10484w;

    static {
        String name;
        Package packageR = CoordinatorLayout.class.getPackage();
        if (packageR != null) {
            name = packageR.getName();
        } else {
            name = null;
        }
        f10462e = name;
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes;
        int i2 = 0;
        super(context, attributeSet, i);
        this.f10471j = new ArrayList();
        this.f10467a = new C0344ky();
        this.f10472k = new ArrayList();
        this.f10473l = new ArrayList();
        this.f10474m = new int[2];
        this.f10484w = new C0312jj();
        if (i == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0046ar.f922a, 0, R.style.Widget.Support.CoordinatorLayout);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0046ar.f922a, i, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(C0046ar.f931j, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f10477p = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f10477p.length;
            while (i2 < length) {
                int[] iArr = this.f10477p;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
                i2++;
            }
        }
        this.f10482u = obtainStyledAttributes.getDrawable(C0046ar.f932k);
        obtainStyledAttributes.recycle();
        m6786b();
        super.setOnHierarchyChangeListener(new C0191dl(this));
    }

    /* renamed from: a */
    private static Rect m6776a() {
        Rect rect = (Rect) f10466i.mo9113a();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C0192dm) && super.checkLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private final void m6781a(C0192dm c0192dm, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        width = Math.max(getPaddingLeft() + c0192dm.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - c0192dm.rightMargin));
        height = Math.max(getPaddingTop() + c0192dm.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - c0192dm.bottomMargin));
        rect.set(width, height, width + i, height + i2);
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        view.getLayoutParams();
        return super.drawChild(canvas, view, j);
    }

    protected void drawableStateChanged() {
        boolean z = false;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f10482u;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return new C0192dm();
    }

    /* renamed from: a */
    private final void m6780a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            C0358ls.m5608a((ViewGroup) this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: a */
    public final List mo11685a(View view) {
        C0344ky c0344ky = this.f10467a;
        int size = c0344ky.f9108b.size();
        Collection collection = null;
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) c0344ky.f9108b.mo9200d(i);
            if (arrayList != null && arrayList.contains(view)) {
                if (collection == null) {
                    arrayList = new ArrayList();
                } else {
                    Collection collection2 = collection;
                }
                arrayList.add(c0344ky.f9108b.mo9195b(i));
                collection = arrayList;
            }
        }
        this.f10473l.clear();
        if (collection != null) {
            this.f10473l.addAll(collection);
        }
        return this.f10473l;
    }

    /* renamed from: a */
    private static void m6778a(int i, Rect rect, Rect rect2, C0192dm c0192dm, int i2, int i3) {
        int i4 = c0192dm.f3339c;
        if (i4 == 0) {
            i4 = 17;
        }
        i4 = Gravity.getAbsoluteGravity(i4, i);
        int absoluteGravity = Gravity.getAbsoluteGravity(m6787c(c0192dm.f3340d), i);
        int i5 = i4 & 7;
        int i6 = i4 & 112;
        i4 = absoluteGravity & 112;
        switch (absoluteGravity & 7) {
            case 1:
                absoluteGravity = rect.left + (rect.width() / 2);
                break;
            case 5:
                absoluteGravity = rect.right;
                break;
            default:
                absoluteGravity = rect.left;
                break;
        }
        switch (i4) {
            case 16:
                i4 = rect.top + (rect.height() / 2);
                break;
            case 80:
                i4 = rect.bottom;
                break;
            default:
                i4 = rect.top;
                break;
        }
        switch (i5) {
            case 1:
                absoluteGravity -= i2 / 2;
                break;
            case 5:
                break;
            default:
                absoluteGravity -= i2;
                break;
        }
        switch (i6) {
            case 16:
                i4 -= i3 / 2;
                break;
            case 80:
                break;
            default:
                i4 -= i3;
                break;
        }
        rect2.set(absoluteGravity, i4, absoluteGravity + i2, i4 + i3);
    }

    /* renamed from: b */
    private final int m6784b(int i) {
        int[] iArr = this.f10477p;
        StringBuilder stringBuilder;
        if (iArr == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("No keylines defined for ");
            stringBuilder.append(this);
            stringBuilder.append(" - attempted index lookup ");
            stringBuilder.append(i);
            Log.e("CoordinatorLayout", stringBuilder.toString());
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Keyline index ");
            stringBuilder.append(i);
            stringBuilder.append(" out of range for ");
            stringBuilder.append(this);
            Log.e("CoordinatorLayout", stringBuilder.toString());
            return 0;
        }
    }

    public int getNestedScrollAxes() {
        return this.f10484w.f8242a;
    }

    /* renamed from: b */
    private static C0192dm m6785b(View view) {
        C0192dm c0192dm = (C0192dm) view.getLayoutParams();
        if (!c0192dm.f3338b) {
            if (view instanceof C0188di) {
                C0189dj a = ((C0188di) view).mo5971a();
                if (a == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                c0192dm.mo6018a(a);
                c0192dm.f3338b = true;
            } else {
                C0190dk c0190dk;
                C0190dk c0190dk2 = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    c0190dk2 = (C0190dk) cls.getAnnotation(C0190dk.class);
                    if (c0190dk2 != null) {
                        c0190dk = c0190dk2;
                        break;
                    }
                }
                c0190dk = c0190dk2;
                if (c0190dk != null) {
                    try {
                        c0192dm.mo6018a((C0189dj) c0190dk.mo5995a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Throwable e) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Default behavior class ");
                        stringBuilder.append(c0190dk.mo5995a().getName());
                        stringBuilder.append(" could not be instantiated. Did you forget");
                        stringBuilder.append(" a default constructor?");
                        Log.e("CoordinatorLayout", stringBuilder.toString(), e);
                    }
                }
                c0192dm.f3338b = true;
            }
        }
        return c0192dm;
    }

    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* renamed from: a */
    public final boolean mo11689a(View view, int i, int i2) {
        Rect a = m6776a();
        C0358ls.m5608a((ViewGroup) this, view, a);
        try {
            boolean contains = a.contains(i, i2);
            return contains;
        } finally {
            m6779a(a);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m6782a(false);
        if (this.f10481t) {
            if (this.f10480s == null) {
                this.f10480s = new C0193dn(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f10480s);
        }
        if (this.f10468b == null && C0315jm.m4632g(this)) {
            C0315jm.m4602B(this);
        }
        this.f10476o = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010b  */
    /* renamed from: a */
    public final void mo11686a(int r20) {
        /*
        r19 = this;
        r2 = p000.C0315jm.m4635j(r19);
        r0 = r19;
        r3 = r0.f10471j;
        r13 = r3.size();
        r14 = m6776a();
        r15 = m6776a();
        r16 = m6776a();
        r3 = 0;
        r12 = r3;
    L_0x001a:
        if (r12 >= r13) goto L_0x02b2;
    L_0x001c:
        r0 = r19;
        r3 = r0.f10471j;
        r3 = r3.get(r12);
        r8 = r3;
        r8 = (android.view.View) r8;
        r3 = r8.getLayoutParams();
        r9 = r3;
        r9 = (p000.C0192dm) r9;
        if (r20 != 0) goto L_0x02ae;
    L_0x0030:
        r3 = r8.getVisibility();
        r4 = 8;
        if (r3 != r4) goto L_0x003c;
    L_0x0038:
        r3 = r12 + 1;
        r12 = r3;
        goto L_0x001a;
    L_0x003c:
        r3 = 0;
        r11 = r3;
    L_0x003e:
        if (r11 >= r12) goto L_0x00d7;
    L_0x0040:
        r0 = r19;
        r3 = r0.f10471j;
        r3 = r3.get(r11);
        r3 = (android.view.View) r3;
        r4 = r9.f3348l;
        if (r4 == r3) goto L_0x0052;
    L_0x004e:
        r3 = r11 + 1;
        r11 = r3;
        goto L_0x003e;
    L_0x0052:
        r5 = r8.getLayoutParams();
        r5 = (p000.C0192dm) r5;
        r3 = r5.f3347k;
        if (r3 == 0) goto L_0x004e;
    L_0x005c:
        r3 = m6776a();
        r17 = m6776a();
        r4 = m6776a();
        r6 = r5.f3347k;
        r0 = r19;
        p000.C0358ls.m5608a(r0, r6, r3);
        r6 = 0;
        r0 = r19;
        r1 = r17;
        r0.m6780a(r8, r6, r1);
        r6 = r8.getMeasuredWidth();
        r7 = r8.getMeasuredHeight();
        m6778a(r2, r3, r4, r5, r6, r7);
        r10 = r4.left;
        r0 = r17;
        r0 = r0.left;
        r18 = r0;
        r0 = r18;
        if (r10 != r0) goto L_0x00d5;
    L_0x008e:
        r10 = r4.top;
        r0 = r17;
        r0 = r0.top;
        r18 = r0;
        r0 = r18;
        if (r10 != r0) goto L_0x00d3;
    L_0x009a:
        r10 = 0;
    L_0x009b:
        r0 = r19;
        r0.m6781a(r5, r4, r6, r7);
        r6 = r4.left;
        r0 = r17;
        r7 = r0.left;
        r6 = r6 - r7;
        r7 = r4.top;
        r0 = r17;
        r0 = r0.top;
        r18 = r0;
        r7 = r7 - r18;
        if (r6 == 0) goto L_0x00b6;
    L_0x00b3:
        p000.C0315jm.m4609a(r8, r6);
    L_0x00b6:
        if (r7 == 0) goto L_0x00bb;
    L_0x00b8:
        p000.C0315jm.m4624b(r8, r7);
    L_0x00bb:
        if (r10 == 0) goto L_0x00c8;
    L_0x00bd:
        r6 = r5.f3337a;
        if (r6 == 0) goto L_0x00c8;
    L_0x00c1:
        r5 = r5.f3347k;
        r0 = r19;
        r6.mo416a(r0, r8, r5);
    L_0x00c8:
        m6779a(r3);
        m6779a(r17);
        m6779a(r4);
        goto L_0x004e;
    L_0x00d3:
        r10 = 1;
        goto L_0x009b;
    L_0x00d5:
        r10 = 1;
        goto L_0x009b;
    L_0x00d7:
        r3 = 1;
        r0 = r19;
        r0.m6780a(r8, r3, r15);
        r3 = r9.f3343g;
        if (r3 == 0) goto L_0x00f7;
    L_0x00e1:
        r3 = r15.isEmpty();
        if (r3 != 0) goto L_0x00f7;
    L_0x00e7:
        r3 = r9.f3343g;
        r3 = android.view.Gravity.getAbsoluteGravity(r3, r2);
        r4 = r3 & 112;
        switch(r4) {
            case 48: goto L_0x02a2;
            case 80: goto L_0x0291;
            default: goto L_0x00f2;
        };
    L_0x00f2:
        r3 = r3 & 7;
        switch(r3) {
            case 3: goto L_0x0285;
            case 4: goto L_0x00f7;
            case 5: goto L_0x0274;
            default: goto L_0x00f7;
        };
    L_0x00f7:
        r3 = r9.f3344h;
        if (r3 == 0) goto L_0x0101;
    L_0x00fb:
        r3 = r8.getVisibility();
        if (r3 == 0) goto L_0x0167;
    L_0x0101:
        r3 = 2;
        r0 = r20;
        if (r0 != r3) goto L_0x0146;
    L_0x0106:
        r3 = r12 + 1;
        r5 = r3;
    L_0x0109:
        if (r5 >= r13) goto L_0x0038;
    L_0x010b:
        r0 = r19;
        r3 = r0.f10471j;
        r3 = r3.get(r5);
        r3 = (android.view.View) r3;
        r4 = r3.getLayoutParams();
        r4 = (p000.C0192dm) r4;
        r6 = r4.f3337a;
        if (r6 == 0) goto L_0x0135;
    L_0x011f:
        r7 = r6.mo418c(r8);
        if (r7 == 0) goto L_0x0135;
    L_0x0125:
        if (r20 == 0) goto L_0x013e;
    L_0x0127:
        switch(r20) {
            case 2: goto L_0x0139;
            default: goto L_0x012a;
        };
    L_0x012a:
        r0 = r19;
        r3 = r6.mo416a(r0, r3, r8);
    L_0x0130:
        r6 = 1;
        r0 = r20;
        if (r0 == r6) goto L_0x013b;
    L_0x0135:
        r3 = r5 + 1;
        r5 = r3;
        goto L_0x0109;
    L_0x0139:
        r3 = 1;
        goto L_0x0130;
    L_0x013b:
        r4.f3350n = r3;
        goto L_0x0135;
    L_0x013e:
        r7 = r4.f3350n;
        if (r7 == 0) goto L_0x0127;
    L_0x0142:
        r3 = 0;
        r4.f3350n = r3;
        goto L_0x0135;
    L_0x0146:
        r3 = r8.getLayoutParams();
        r3 = (p000.C0192dm) r3;
        r3 = r3.f3351o;
        r0 = r16;
        r0.set(r3);
        r0 = r16;
        r3 = r0.equals(r15);
        if (r3 != 0) goto L_0x0038;
    L_0x015b:
        r3 = r8.getLayoutParams();
        r3 = (p000.C0192dm) r3;
        r3 = r3.f3351o;
        r3.set(r15);
        goto L_0x0106;
    L_0x0167:
        r3 = p000.C0315jm.m4649x(r8);
        if (r3 == 0) goto L_0x0101;
    L_0x016d:
        r3 = r8.getWidth();
        if (r3 <= 0) goto L_0x0101;
    L_0x0173:
        r3 = r8.getHeight();
        if (r3 <= 0) goto L_0x0101;
    L_0x0179:
        r3 = r8.getLayoutParams();
        r3 = (p000.C0192dm) r3;
        r4 = r3.f3337a;
        r5 = m6776a();
        r6 = m6776a();
        r7 = r8.getLeft();
        r9 = r8.getTop();
        r10 = r8.getRight();
        r11 = r8.getBottom();
        r6.set(r7, r9, r10, r11);
        if (r4 == 0) goto L_0x01d1;
    L_0x019e:
        r4 = r4.mo5981a(r8, r5);
        if (r4 == 0) goto L_0x01d1;
    L_0x01a4:
        r4 = r6.contains(r5);
        if (r4 != 0) goto L_0x01d4;
    L_0x01aa:
        r2 = new java.lang.IllegalArgumentException;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Rect should be within the child's bounds. Rect:";
        r3.append(r4);
        r4 = r5.toShortString();
        r3.append(r4);
        r4 = " | Bounds:";
        r3.append(r4);
        r4 = r6.toShortString();
        r3.append(r4);
        r3 = r3.toString();
        r2.<init>(r3);
        throw r2;
    L_0x01d1:
        r5.set(r6);
    L_0x01d4:
        m6779a(r6);
        r4 = r5.isEmpty();
        if (r4 == 0) goto L_0x01e2;
    L_0x01dd:
        m6779a(r5);
        goto L_0x0101;
    L_0x01e2:
        r4 = r3.f3344h;
        r6 = android.view.Gravity.getAbsoluteGravity(r4, r2);
        r4 = r6 & 48;
        r7 = 48;
        if (r4 != r7) goto L_0x0272;
    L_0x01ee:
        r4 = r5.top;
        r7 = r3.topMargin;
        r4 = r4 - r7;
        r7 = r3.f3346j;
        r4 = r4 - r7;
        r7 = r14.top;
        if (r4 >= r7) goto L_0x0270;
    L_0x01fa:
        r7 = r14.top;
        r4 = r7 - r4;
        m6790d(r8, r4);
        r4 = 1;
    L_0x0202:
        r7 = r6 & 80;
        r9 = 80;
        if (r7 != r9) goto L_0x0221;
    L_0x0208:
        r7 = r19.getHeight();
        r9 = r5.bottom;
        r7 = r7 - r9;
        r9 = r3.bottomMargin;
        r7 = r7 - r9;
        r9 = r3.f3346j;
        r7 = r7 + r9;
        r9 = r14.bottom;
        if (r7 >= r9) goto L_0x0221;
    L_0x0219:
        r4 = r14.bottom;
        r4 = r7 - r4;
        m6790d(r8, r4);
        r4 = 1;
    L_0x0221:
        if (r4 != 0) goto L_0x0227;
    L_0x0223:
        r4 = 0;
        m6790d(r8, r4);
    L_0x0227:
        r4 = r6 & 3;
        r7 = 3;
        if (r4 != r7) goto L_0x026e;
    L_0x022c:
        r4 = r5.left;
        r7 = r3.leftMargin;
        r4 = r4 - r7;
        r7 = r3.f3345i;
        r4 = r4 - r7;
        r7 = r14.left;
        if (r4 >= r7) goto L_0x026c;
    L_0x0238:
        r7 = r14.left;
        r4 = r7 - r4;
        m6788c(r8, r4);
        r4 = 1;
    L_0x0240:
        r6 = r6 & 5;
        r7 = 5;
        if (r6 != r7) goto L_0x026a;
    L_0x0245:
        r6 = r19.getWidth();
        r7 = r5.right;
        r6 = r6 - r7;
        r7 = r3.rightMargin;
        r6 = r6 - r7;
        r3 = r3.f3345i;
        r3 = r3 + r6;
        r6 = r14.right;
        if (r3 >= r6) goto L_0x0268;
    L_0x0256:
        r4 = r14.right;
        r3 = r3 - r4;
        m6788c(r8, r3);
        r3 = 1;
    L_0x025d:
        if (r3 != 0) goto L_0x0263;
    L_0x025f:
        r3 = 0;
        m6788c(r8, r3);
    L_0x0263:
        m6779a(r5);
        goto L_0x0101;
    L_0x0268:
        r3 = r4;
        goto L_0x025d;
    L_0x026a:
        r3 = r4;
        goto L_0x025d;
    L_0x026c:
        r4 = 0;
        goto L_0x0240;
    L_0x026e:
        r4 = 0;
        goto L_0x0240;
    L_0x0270:
        r4 = 0;
        goto L_0x0202;
    L_0x0272:
        r4 = 0;
        goto L_0x0202;
    L_0x0274:
        r3 = r14.right;
        r4 = r19.getWidth();
        r5 = r15.left;
        r4 = r4 - r5;
        r3 = java.lang.Math.max(r3, r4);
        r14.right = r3;
        goto L_0x00f7;
    L_0x0285:
        r3 = r14.left;
        r4 = r15.right;
        r3 = java.lang.Math.max(r3, r4);
        r14.left = r3;
        goto L_0x00f7;
    L_0x0291:
        r4 = r14.bottom;
        r5 = r19.getHeight();
        r6 = r15.top;
        r5 = r5 - r6;
        r4 = java.lang.Math.max(r4, r5);
        r14.bottom = r4;
        goto L_0x00f2;
    L_0x02a2:
        r4 = r14.top;
        r5 = r15.bottom;
        r4 = java.lang.Math.max(r4, r5);
        r14.top = r4;
        goto L_0x00f2;
    L_0x02ae:
        r3 = 0;
        r11 = r3;
        goto L_0x003e;
    L_0x02b2:
        m6779a(r14);
        m6779a(r15);
        m6779a(r16);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.a(int):void");
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m6782a(false);
        if (this.f10481t && this.f10480s != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f10480s);
        }
        View view = this.f10479r;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f10476o = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f10469c && this.f10482u != null) {
            int d;
            C0333kj c0333kj = this.f10468b;
            if (c0333kj != null) {
                d = c0333kj.mo10075d();
            } else {
                d = 0;
            }
            if (d > 0) {
                this.f10482u.setBounds(0, 0, getWidth(), d);
                this.f10482u.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m6782a(true);
        }
        boolean a = m6783a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m6782a(true);
        }
        return a;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int j = C0315jm.m4635j(this);
        int size = this.f10471j.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.f10471j.get(i5);
            if (view.getVisibility() != 8) {
                C0189dj c0189dj = ((C0192dm) view.getLayoutParams()).f3337a;
                if (c0189dj == null || !c0189dj.mo408a(this, view, j)) {
                    mo11687a(view, j);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo11687a(View view, int i) {
        Object obj;
        C0192dm c0192dm = (C0192dm) view.getLayoutParams();
        View view2 = c0192dm.f3347k;
        if (view2 != null) {
            obj = null;
        } else if (c0192dm.f3342f != -1) {
            obj = 1;
        } else {
            obj = null;
        }
        int i2;
        int i3;
        if (obj != null) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (view2 == null) {
            int i4 = c0192dm.f3341e;
            if (i4 >= 0) {
                c0192dm = (C0192dm) view.getLayoutParams();
                int absoluteGravity = Gravity.getAbsoluteGravity(m6789d(c0192dm.f3339c), i);
                i2 = absoluteGravity & 7;
                int i5 = absoluteGravity & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth = view.getMeasuredWidth();
                absoluteGravity = view.getMeasuredHeight();
                if (i == 1) {
                    i4 = width - i4;
                }
                i4 = m6784b(i4) - measuredWidth;
                switch (i2) {
                    case 1:
                        i3 = i4 + (measuredWidth / 2);
                        break;
                    case 5:
                        i3 = i4 + measuredWidth;
                        break;
                    default:
                        i3 = i4;
                        break;
                }
                switch (i5) {
                    case 16:
                        i4 = absoluteGravity / 2;
                        break;
                    case 80:
                        i4 = absoluteGravity;
                        break;
                    default:
                        i4 = 0;
                        break;
                }
                int max = Math.max(getPaddingLeft() + c0192dm.leftMargin, Math.min(i3, ((width - getPaddingRight()) - measuredWidth) - c0192dm.rightMargin));
                int max2 = Math.max(getPaddingTop() + c0192dm.topMargin, Math.min(i4, ((height - getPaddingBottom()) - absoluteGravity) - c0192dm.bottomMargin));
                view.layout(max, max2, max + measuredWidth, absoluteGravity + max2);
                return;
            }
            c0192dm = (C0192dm) view.getLayoutParams();
            Rect a = m6776a();
            a.set(getPaddingLeft() + c0192dm.leftMargin, getPaddingTop() + c0192dm.topMargin, (getWidth() - getPaddingRight()) - c0192dm.rightMargin, (getHeight() - getPaddingBottom()) - c0192dm.bottomMargin);
            if (!(this.f10468b == null || !C0315jm.m4632g(this) || C0315jm.m4632g(view))) {
                a.left += this.f10468b.mo10073b();
                a.top += this.f10468b.mo10075d();
                a.right -= this.f10468b.mo10074c();
                a.bottom -= this.f10468b.mo10071a();
            }
            Rect a2 = m6776a();
            C0261ha.m3020a(m6787c(c0192dm.f3339c), view.getMeasuredWidth(), view.getMeasuredHeight(), a, a2, i);
            view.layout(a2.left, a2.top, a2.right, a2.bottom);
            m6779a(a);
            m6779a(a2);
        } else {
            Rect a3 = m6776a();
            Rect a4 = m6776a();
            try {
                C0358ls.m5608a((ViewGroup) this, view2, a3);
                C0192dm c0192dm2 = (C0192dm) view.getLayoutParams();
                i3 = view.getMeasuredWidth();
                i2 = view.getMeasuredHeight();
                m6778a(i, a3, a4, c0192dm2, i3, i2);
                m6781a(c0192dm2, a4, i3, i2);
                view.layout(a4.left, a4.top, a4.right, a4.bottom);
            } finally {
                m6779a(a3);
                m6779a(a4);
            }
        }
    }

    /* JADX WARNING: Missing block: B:85:0x0170, code:
            if (r1 == null) goto L_0x00fb;
     */
    protected void onMeasure(int r26, int r27) {
        /*
        r25 = this;
        r0 = r25;
        r1 = r0.f10471j;
        r1.clear();
        r0 = r25;
        r3 = r0.f10467a;
        r1 = r3.f9108b;
        r4 = r1.size();
        r1 = 0;
        r2 = r1;
    L_0x0013:
        if (r2 >= r4) goto L_0x002c;
    L_0x0015:
        r1 = r3.f9108b;
        r1 = r1.mo9200d(r2);
        r1 = (java.util.ArrayList) r1;
        if (r1 != 0) goto L_0x0023;
    L_0x001f:
        r1 = r2 + 1;
        r2 = r1;
        goto L_0x0013;
    L_0x0023:
        r1.clear();
        r5 = r3.f9107a;
        r5.mo9114a(r1);
        goto L_0x001f;
    L_0x002c:
        r1 = r3.f9108b;
        r1.clear();
        r4 = r25.getChildCount();
        r1 = 0;
        r3 = r1;
    L_0x0037:
        if (r3 >= r4) goto L_0x0185;
    L_0x0039:
        r0 = r25;
        r5 = r0.getChildAt(r3);
        r6 = m6785b(r5);
        r1 = r6.f3342f;
        r2 = -1;
        if (r1 != r2) goto L_0x00f7;
    L_0x0048:
        r1 = 0;
        r6.f3348l = r1;
        r1 = 0;
        r6.f3347k = r1;
    L_0x004e:
        r0 = r25;
        r1 = r0.f10467a;
        r1.mo10568a(r5);
        r1 = 0;
        r2 = r1;
    L_0x0057:
        if (r2 >= r4) goto L_0x00f2;
    L_0x0059:
        if (r2 != r3) goto L_0x005f;
    L_0x005b:
        r1 = r2 + 1;
        r2 = r1;
        goto L_0x0057;
    L_0x005f:
        r0 = r25;
        r7 = r0.getChildAt(r2);
        r1 = r6.f3348l;
        if (r7 == r1) goto L_0x00f0;
    L_0x0069:
        r8 = p000.C0315jm.m4635j(r25);
        r1 = r7.getLayoutParams();
        r1 = (p000.C0192dm) r1;
        r1 = r1.f3343g;
        r1 = android.view.Gravity.getAbsoluteGravity(r1, r8);
        if (r1 == 0) goto L_0x00ee;
    L_0x007b:
        r9 = r6.f3344h;
        r8 = android.view.Gravity.getAbsoluteGravity(r9, r8);
        r8 = r8 & r1;
        if (r8 != r1) goto L_0x00ec;
    L_0x0084:
        r1 = 1;
    L_0x0085:
        if (r1 != 0) goto L_0x00ea;
    L_0x0087:
        r1 = r6.f3337a;
        if (r1 == 0) goto L_0x00e8;
    L_0x008b:
        r1 = r1.mo418c(r7);
        if (r1 == 0) goto L_0x00e6;
    L_0x0091:
        r1 = 1;
    L_0x0092:
        if (r1 == 0) goto L_0x005b;
    L_0x0094:
        r0 = r25;
        r1 = r0.f10467a;
        r1 = r1.f9108b;
        r1 = r1.containsKey(r7);
        if (r1 != 0) goto L_0x00a7;
    L_0x00a0:
        r0 = r25;
        r1 = r0.f10467a;
        r1.mo10568a(r7);
    L_0x00a7:
        r0 = r25;
        r8 = r0.f10467a;
        r1 = r8.f9108b;
        r1 = r1.containsKey(r7);
        if (r1 == 0) goto L_0x00bb;
    L_0x00b3:
        r1 = r8.f9108b;
        r1 = r1.containsKey(r5);
        if (r1 != 0) goto L_0x00c3;
    L_0x00bb:
        r1 = new java.lang.IllegalArgumentException;
        r2 = "All nodes must be present in the graph before being added as an edge";
        r1.<init>(r2);
        throw r1;
    L_0x00c3:
        r1 = r8.f9108b;
        r1 = r1.get(r7);
        r1 = (java.util.ArrayList) r1;
        if (r1 == 0) goto L_0x00d1;
    L_0x00cd:
        r1.add(r5);
        goto L_0x005b;
    L_0x00d1:
        r1 = r8.f9107a;
        r1 = r1.mo9113a();
        r1 = (java.util.ArrayList) r1;
        if (r1 != 0) goto L_0x00e0;
    L_0x00db:
        r1 = new java.util.ArrayList;
        r1.<init>();
    L_0x00e0:
        r8 = r8.f9108b;
        r8.put(r7, r1);
        goto L_0x00cd;
    L_0x00e6:
        r1 = 0;
        goto L_0x0092;
    L_0x00e8:
        r1 = 0;
        goto L_0x0092;
    L_0x00ea:
        r1 = 1;
        goto L_0x0092;
    L_0x00ec:
        r1 = 0;
        goto L_0x0085;
    L_0x00ee:
        r1 = 0;
        goto L_0x0085;
    L_0x00f0:
        r1 = 1;
        goto L_0x0092;
    L_0x00f2:
        r1 = r3 + 1;
        r3 = r1;
        goto L_0x0037;
    L_0x00f7:
        r1 = r6.f3347k;
        if (r1 != 0) goto L_0x0153;
    L_0x00fb:
        r1 = r6.f3342f;
        r0 = r25;
        r1 = r0.findViewById(r1);
        r6.f3347k = r1;
        r1 = r6.f3347k;
        if (r1 == 0) goto L_0x0145;
    L_0x0109:
        r0 = r25;
        if (r1 != r0) goto L_0x011b;
    L_0x010d:
        r1 = r25.isInEditMode();
        if (r1 == 0) goto L_0x03b5;
    L_0x0113:
        r1 = 0;
        r6.f3348l = r1;
        r1 = 0;
        r6.f3347k = r1;
        goto L_0x004e;
    L_0x011b:
        r2 = r1.getParent();
    L_0x011f:
        r0 = r25;
        if (r2 == r0) goto L_0x0141;
    L_0x0123:
        if (r2 == 0) goto L_0x0141;
    L_0x0125:
        if (r2 != r5) goto L_0x0135;
    L_0x0127:
        r1 = r25.isInEditMode();
        if (r1 == 0) goto L_0x03bd;
    L_0x012d:
        r1 = 0;
        r6.f3348l = r1;
        r1 = 0;
        r6.f3347k = r1;
        goto L_0x004e;
    L_0x0135:
        r7 = r2 instanceof android.view.View;
        if (r7 == 0) goto L_0x013c;
    L_0x0139:
        r1 = r2;
        r1 = (android.view.View) r1;
    L_0x013c:
        r2 = r2.getParent();
        goto L_0x011f;
    L_0x0141:
        r6.f3348l = r1;
        goto L_0x004e;
    L_0x0145:
        r1 = r25.isInEditMode();
        if (r1 == 0) goto L_0x03c5;
    L_0x014b:
        r1 = 0;
        r6.f3348l = r1;
        r1 = 0;
        r6.f3347k = r1;
        goto L_0x004e;
    L_0x0153:
        r1 = r1.getId();
        r2 = r6.f3342f;
        if (r1 != r2) goto L_0x0183;
    L_0x015b:
        r1 = r6.f3347k;
        r2 = r1.getParent();
    L_0x0161:
        r0 = r25;
        if (r2 == r0) goto L_0x017f;
    L_0x0165:
        if (r2 == 0) goto L_0x0169;
    L_0x0167:
        if (r2 != r5) goto L_0x0173;
    L_0x0169:
        r1 = 0;
        r6.f3348l = r1;
        r1 = 0;
        r6.f3347k = r1;
        r1 = 0;
    L_0x0170:
        if (r1 != 0) goto L_0x004e;
    L_0x0172:
        goto L_0x00fb;
    L_0x0173:
        r7 = r2 instanceof android.view.View;
        if (r7 == 0) goto L_0x017a;
    L_0x0177:
        r1 = r2;
        r1 = (android.view.View) r1;
    L_0x017a:
        r2 = r2.getParent();
        goto L_0x0161;
    L_0x017f:
        r6.f3348l = r1;
        r1 = 1;
        goto L_0x0170;
    L_0x0183:
        r1 = 0;
        goto L_0x0170;
    L_0x0185:
        r0 = r25;
        r2 = r0.f10471j;
        r0 = r25;
        r3 = r0.f10467a;
        r1 = r3.f9109c;
        r1.clear();
        r1 = r3.f9110d;
        r1.clear();
        r1 = r3.f9108b;
        r4 = r1.size();
        r1 = 0;
    L_0x019e:
        if (r1 >= r4) goto L_0x01b0;
    L_0x01a0:
        r5 = r3.f9108b;
        r5 = r5.mo9195b(r1);
        r6 = r3.f9109c;
        r7 = r3.f9110d;
        r3.mo10569a(r5, r6, r7);
        r1 = r1 + 1;
        goto L_0x019e;
    L_0x01b0:
        r1 = r3.f9109c;
        r2.addAll(r1);
        r0 = r25;
        r1 = r0.f10471j;
        java.util.Collections.reverse(r1);
        r4 = r25.getChildCount();
        r1 = 0;
        r2 = r1;
    L_0x01c2:
        if (r2 >= r4) goto L_0x03b2;
    L_0x01c4:
        r0 = r25;
        r5 = r0.getChildAt(r2);
        r0 = r25;
        r6 = r0.f10467a;
        r1 = r6.f9108b;
        r7 = r1.size();
        r1 = 0;
        r3 = r1;
    L_0x01d6:
        if (r3 >= r7) goto L_0x03af;
    L_0x01d8:
        r1 = r6.f9108b;
        r1 = r1.mo9200d(r3);
        r1 = (java.util.ArrayList) r1;
        if (r1 == 0) goto L_0x01e8;
    L_0x01e2:
        r1 = r1.contains(r5);
        if (r1 != 0) goto L_0x01ec;
    L_0x01e8:
        r1 = r3 + 1;
        r3 = r1;
        goto L_0x01d6;
    L_0x01ec:
        r1 = 1;
    L_0x01ed:
        if (r1 != 0) goto L_0x01f3;
    L_0x01ef:
        r1 = r2 + 1;
        r2 = r1;
        goto L_0x01c2;
    L_0x01f3:
        r1 = 1;
    L_0x01f4:
        r0 = r25;
        r2 = r0.f10481t;
        if (r1 == r2) goto L_0x0223;
    L_0x01fa:
        if (r1 == 0) goto L_0x0391;
    L_0x01fc:
        r0 = r25;
        r1 = r0.f10476o;
        if (r1 == 0) goto L_0x021e;
    L_0x0202:
        r0 = r25;
        r1 = r0.f10480s;
        if (r1 != 0) goto L_0x0213;
    L_0x0208:
        r1 = new dn;
        r0 = r25;
        r1.<init>(r0);
        r0 = r25;
        r0.f10480s = r1;
    L_0x0213:
        r1 = r25.getViewTreeObserver();
        r0 = r25;
        r2 = r0.f10480s;
        r1.addOnPreDrawListener(r2);
    L_0x021e:
        r1 = 1;
        r0 = r25;
        r0.f10481t = r1;
    L_0x0223:
        r15 = r25.getPaddingLeft();
        r2 = r25.getPaddingTop();
        r16 = r25.getPaddingRight();
        r3 = r25.getPaddingBottom();
        r17 = p000.C0315jm.m4635j(r25);
        r1 = 1;
        r0 = r17;
        if (r0 == r1) goto L_0x038d;
    L_0x023c:
        r1 = 0;
        r12 = r1;
    L_0x023e:
        r18 = android.view.View.MeasureSpec.getMode(r26);
        r19 = android.view.View.MeasureSpec.getSize(r26);
        r20 = android.view.View.MeasureSpec.getMode(r27);
        r21 = android.view.View.MeasureSpec.getSize(r27);
        r22 = r15 + r16;
        r23 = r2 + r3;
        r11 = r25.getSuggestedMinimumWidth();
        r10 = r25.getSuggestedMinimumHeight();
        r0 = r25;
        r1 = r0.f10468b;
        if (r1 == 0) goto L_0x0389;
    L_0x0260:
        r1 = p000.C0315jm.m4632g(r25);
        if (r1 == 0) goto L_0x0385;
    L_0x0266:
        r1 = 1;
        r13 = r1;
    L_0x0268:
        r0 = r25;
        r1 = r0.f10471j;
        r24 = r1.size();
        r9 = 0;
        r1 = 0;
        r14 = r1;
    L_0x0273:
        r0 = r24;
        if (r14 >= r0) goto L_0x036e;
    L_0x0277:
        r0 = r25;
        r1 = r0.f10471j;
        r3 = r1.get(r14);
        r3 = (android.view.View) r3;
        r1 = r3.getVisibility();
        r2 = 8;
        if (r1 != r2) goto L_0x0293;
    L_0x0289:
        r1 = r9;
        r2 = r10;
        r3 = r11;
    L_0x028c:
        r4 = r14 + 1;
        r14 = r4;
        r9 = r1;
        r10 = r2;
        r11 = r3;
        goto L_0x0273;
    L_0x0293:
        r1 = r3.getLayoutParams();
        r8 = r1;
        r8 = (p000.C0192dm) r8;
        r1 = r8.f3341e;
        if (r1 < 0) goto L_0x036b;
    L_0x029e:
        if (r18 == 0) goto L_0x0368;
    L_0x02a0:
        r0 = r25;
        r1 = r0.m6784b(r1);
        r2 = r8.f3339c;
        r2 = m6789d(r2);
        r0 = r17;
        r2 = android.view.Gravity.getAbsoluteGravity(r2, r0);
        r2 = r2 & 7;
        r4 = 3;
        if (r2 == r4) goto L_0x0364;
    L_0x02b7:
        r4 = 5;
        if (r2 != r4) goto L_0x0348;
    L_0x02ba:
        if (r12 == 0) goto L_0x0348;
    L_0x02bc:
        r2 = 0;
        r4 = r19 - r16;
        r1 = r4 - r1;
        r5 = java.lang.Math.max(r2, r1);
    L_0x02c5:
        if (r13 == 0) goto L_0x0343;
    L_0x02c7:
        r1 = p000.C0315jm.m4632g(r3);
        if (r1 != 0) goto L_0x033e;
    L_0x02cd:
        r0 = r25;
        r1 = r0.f10468b;
        r1 = r1.mo10073b();
        r0 = r25;
        r2 = r0.f10468b;
        r2 = r2.mo10074c();
        r0 = r25;
        r4 = r0.f10468b;
        r6 = r4.mo10075d();
        r0 = r25;
        r4 = r0.f10468b;
        r7 = r4.mo10071a();
        r1 = r1 + r2;
        r1 = r19 - r1;
        r0 = r18;
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0);
        r1 = r6 + r7;
        r1 = r21 - r1;
        r0 = r20;
        r6 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0);
    L_0x0300:
        r1 = r8.f3337a;
        if (r1 == 0) goto L_0x030d;
    L_0x0304:
        r7 = 0;
        r2 = r25;
        r1 = r1.mo409a(r2, r3, r4, r5, r6, r7);
        if (r1 != 0) goto L_0x0313;
    L_0x030d:
        r7 = 0;
        r2 = r25;
        r2.mo11688a(r3, r4, r5, r6, r7);
    L_0x0313:
        r1 = r3.getMeasuredWidth();
        r1 = r1 + r22;
        r2 = r8.leftMargin;
        r1 = r1 + r2;
        r2 = r8.rightMargin;
        r1 = r1 + r2;
        r4 = java.lang.Math.max(r11, r1);
        r1 = r3.getMeasuredHeight();
        r1 = r1 + r23;
        r2 = r8.topMargin;
        r1 = r1 + r2;
        r2 = r8.bottomMargin;
        r1 = r1 + r2;
        r2 = java.lang.Math.max(r10, r1);
        r1 = r3.getMeasuredState();
        r1 = android.view.View.combineMeasuredStates(r9, r1);
        r3 = r4;
        goto L_0x028c;
    L_0x033e:
        r6 = r27;
        r4 = r26;
        goto L_0x0300;
    L_0x0343:
        r6 = r27;
        r4 = r26;
        goto L_0x0300;
    L_0x0348:
        r4 = 5;
        if (r2 == r4) goto L_0x0361;
    L_0x034b:
        r4 = 3;
        if (r2 != r4) goto L_0x035e;
    L_0x034e:
        r2 = 1;
        r0 = r17;
        if (r0 == r2) goto L_0x0356;
    L_0x0353:
        r5 = 0;
        goto L_0x02c5;
    L_0x0356:
        r2 = 0;
        r1 = r1 - r15;
        r5 = java.lang.Math.max(r2, r1);
        goto L_0x02c5;
    L_0x035e:
        r5 = 0;
        goto L_0x02c5;
    L_0x0361:
        if (r12 == 0) goto L_0x0356;
    L_0x0363:
        goto L_0x034b;
    L_0x0364:
        if (r12 == 0) goto L_0x02bc;
    L_0x0366:
        goto L_0x02b7;
    L_0x0368:
        r5 = 0;
        goto L_0x02c5;
    L_0x036b:
        r5 = 0;
        goto L_0x02c5;
    L_0x036e:
        r1 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r1 = r1 & r9;
        r0 = r26;
        r1 = android.view.View.resolveSizeAndState(r11, r0, r1);
        r2 = r9 << 16;
        r0 = r27;
        r2 = android.view.View.resolveSizeAndState(r10, r0, r2);
        r0 = r25;
        r0.setMeasuredDimension(r1, r2);
        return;
    L_0x0385:
        r1 = 0;
        r13 = r1;
        goto L_0x0268;
    L_0x0389:
        r1 = 0;
        r13 = r1;
        goto L_0x0268;
    L_0x038d:
        r1 = 1;
        r12 = r1;
        goto L_0x023e;
    L_0x0391:
        r0 = r25;
        r1 = r0.f10476o;
        if (r1 == 0) goto L_0x03a8;
    L_0x0397:
        r0 = r25;
        r1 = r0.f10480s;
        if (r1 == 0) goto L_0x03a8;
    L_0x039d:
        r1 = r25.getViewTreeObserver();
        r0 = r25;
        r2 = r0.f10480s;
        r1.removeOnPreDrawListener(r2);
    L_0x03a8:
        r1 = 0;
        r0 = r25;
        r0.f10481t = r1;
        goto L_0x0223;
    L_0x03af:
        r1 = 0;
        goto L_0x01ed;
    L_0x03b2:
        r1 = 0;
        goto L_0x01f4;
    L_0x03b5:
        r1 = new java.lang.IllegalStateException;
        r2 = "View can not be anchored to the the parent CoordinatorLayout";
        r1.<init>(r2);
        throw r1;
    L_0x03bd:
        r1 = new java.lang.IllegalStateException;
        r2 = "Anchor must not be a descendant of the anchored view";
        r1.<init>(r2);
        throw r1;
    L_0x03c5:
        r1 = new java.lang.IllegalStateException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Could not find CoordinatorLayout descendant view with id ";
        r2.append(r3);
        r3 = r25.getResources();
        r4 = r6.f3342f;
        r3 = r3.getResourceName(r4);
        r2.append(r3);
        r3 = " to anchor view ";
        r2.append(r3);
        r2.append(r5);
        r2 = r2.toString();
        r1.<init>(r2);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    /* renamed from: a */
    public final void mo11688a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                childAt.getLayoutParams();
            }
        }
        return false;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        int childCount = getChildCount();
        int i = 0;
        boolean z = false;
        while (i < childCount) {
            boolean z2;
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 8) {
                z2 = z;
            } else {
                C0192dm c0192dm = (C0192dm) childAt.getLayoutParams();
                if (c0192dm.mo6019a(0)) {
                    C0189dj c0189dj = c0192dm.f3337a;
                    z2 = c0189dj != null ? c0189dj.mo5980a(this, childAt, view, f, f2) | z : z;
                } else {
                    z2 = z;
                }
            }
            i++;
            z = z2;
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo9447a(view, i, i2, iArr, 0);
    }

    /* renamed from: a */
    public final void mo9447a(View view, int i, int i2, int[] iArr, int i3) {
        int childCount = getChildCount();
        int i4 = 0;
        int i5 = 0;
        Object obj = null;
        int i6 = 0;
        while (i6 < childCount) {
            Object obj2;
            int i7;
            int i8;
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                obj2 = obj;
                i7 = i5;
                i8 = i4;
            } else {
                C0192dm c0192dm = (C0192dm) childAt.getLayoutParams();
                if (c0192dm.mo6019a(i3)) {
                    C0189dj c0189dj = c0192dm.f3337a;
                    if (c0189dj != null) {
                        int min;
                        int[] iArr2 = this.f10474m;
                        iArr2[1] = 0;
                        iArr2[0] = 0;
                        c0189dj.mo405a(childAt, view, i2, iArr2, i3);
                        if (i <= 0) {
                            i8 = Math.min(i4, this.f10474m[0]);
                        } else {
                            i8 = Math.max(i4, this.f10474m[0]);
                        }
                        if (i2 <= 0) {
                            min = Math.min(i5, this.f10474m[1]);
                        } else {
                            min = Math.max(i5, this.f10474m[1]);
                        }
                        i7 = min;
                        min = 1;
                    } else {
                        obj2 = obj;
                        i7 = i5;
                        i8 = i4;
                    }
                } else {
                    obj2 = obj;
                    i7 = i5;
                    i8 = i4;
                }
            }
            i6++;
            i5 = i7;
            i4 = i8;
            obj = obj2;
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (obj != null) {
            mo11686a(1);
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo9446a(view, i, i2, i3, i4, 0);
    }

    /* renamed from: a */
    public final void mo9446a(View view, int i, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        while (i6 < childCount) {
            int i8;
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                i8 = i7;
            } else {
                C0192dm c0192dm = (C0192dm) childAt.getLayoutParams();
                if (c0192dm.mo6019a(i5)) {
                    C0189dj c0189dj = c0192dm.f3337a;
                    if (c0189dj != null) {
                        c0189dj.mo403a(childAt, i2, i4, i5);
                        i8 = 1;
                    } else {
                        i8 = i7;
                    }
                } else {
                    i8 = i7;
                }
            }
            i6++;
            i7 = i8;
        }
        if (i7 != 0) {
            mo11686a(1);
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo9450b(view2, i, 0);
    }

    /* renamed from: b */
    public final void mo9450b(View view, int i, int i2) {
        this.f10484w.f8242a = i;
        this.f10479r = view;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).getLayoutParams();
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C0668do) {
            C0668do c0668do = (C0668do) parcelable;
            super.onRestoreInstanceState(c0668do.f7997e);
            SparseArray sparseArray = c0668do.f14221a;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                int id = childAt.getId();
                C0189dj c0189dj = m6785b(childAt).f3337a;
                if (!(id == -1 || c0189dj == null)) {
                    Parcelable parcelable2 = (Parcelable) sparseArray.get(id);
                    if (parcelable2 != null) {
                        c0189dj.mo402a(this, childAt, parcelable2);
                    }
                }
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable c0668do = new C0668do(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0189dj c0189dj = ((C0192dm) childAt.getLayoutParams()).f3337a;
            if (!(id == -1 || c0189dj == null)) {
                Parcelable a = c0189dj.mo401a(this, childAt);
                if (a != null) {
                    sparseArray.append(id, a);
                }
            }
        }
        c0668do.f14221a = sparseArray;
        return c0668do;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo9448a(view, view2, i, 0);
    }

    /* renamed from: a */
    public final boolean mo9448a(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (i3 < childCount) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0192dm c0192dm = (C0192dm) childAt.getLayoutParams();
                C0189dj c0189dj = c0192dm.f3337a;
                if (c0189dj != null) {
                    boolean a = c0189dj.mo407a(i, i2);
                    i4 |= a;
                    c0192dm.mo6017a(i2, a);
                } else {
                    c0192dm.mo6017a(i2, false);
                }
            }
            i3++;
            i4 = i4;
        }
        return i4;
    }

    public void onStopNestedScroll(View view) {
        mo9449b(view, 0);
    }

    /* renamed from: b */
    public final void mo9449b(View view, int i) {
        this.f10484w.f8242a = 0;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0192dm c0192dm = (C0192dm) childAt.getLayoutParams();
            if (c0192dm.mo6019a(i)) {
                C0189dj c0189dj = c0192dm.f3337a;
                if (c0189dj != null) {
                    c0189dj.mo404a(childAt, view, i);
                }
                c0192dm.mo6017a(i, false);
                c0192dm.f3350n = false;
            }
        }
        this.f10479r = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
        r11 = this;
        r2 = 0;
        r4 = 3;
        r10 = 1;
        r5 = 0;
        r7 = 0;
        r9 = r12.getActionMasked();
        r0 = r11.f10478q;
        if (r0 != 0) goto L_0x0055;
    L_0x000d:
        r0 = r11.m6783a(r12, r10);
        if (r0 == 0) goto L_0x0052;
    L_0x0013:
        r1 = r0;
    L_0x0014:
        r0 = r11.f10478q;
        r0 = r0.getLayoutParams();
        r0 = (p000.C0192dm) r0;
        r0 = r0.f3337a;
        if (r0 == 0) goto L_0x0050;
    L_0x0020:
        r3 = r11.f10478q;
        r0 = r0.mo5982b(r11, r3, r12);
        r8 = r0;
    L_0x0027:
        r0 = r11.f10478q;
        if (r0 != 0) goto L_0x003e;
    L_0x002b:
        r0 = super.onTouchEvent(r12);
        r8 = r8 | r0;
        r0 = r2;
    L_0x0031:
        if (r0 == 0) goto L_0x0036;
    L_0x0033:
        r0.recycle();
    L_0x0036:
        if (r9 == r10) goto L_0x003a;
    L_0x0038:
        if (r9 != r4) goto L_0x003d;
    L_0x003a:
        r11.m6782a(r7);
    L_0x003d:
        return r8;
    L_0x003e:
        if (r1 != 0) goto L_0x0042;
    L_0x0040:
        r0 = r2;
        goto L_0x0031;
    L_0x0042:
        r0 = android.os.SystemClock.uptimeMillis();
        r2 = r0;
        r6 = r5;
        r0 = android.view.MotionEvent.obtain(r0, r2, r4, r5, r6, r7);
        super.onTouchEvent(r0);
        goto L_0x0031;
    L_0x0050:
        r8 = r7;
        goto L_0x0027;
    L_0x0052:
        r1 = r0;
        r8 = r7;
        goto L_0x0027;
    L_0x0055:
        r1 = r7;
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public static C0189dj m6777a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder stringBuilder;
        if (str.startsWith(".")) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(context.getPackageName());
            stringBuilder.append(str);
            str = stringBuilder.toString();
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f10462e)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(f10462e);
            stringBuilder.append('.');
            stringBuilder.append(str);
            str = stringBuilder.toString();
        }
        try {
            Map map;
            Map map2 = (Map) f10464g.get();
            if (map2 == null) {
                HashMap hashMap = new HashMap();
                f10464g.set(hashMap);
                map = hashMap;
            } else {
                map = map2;
            }
            Constructor constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = context.getClassLoader().loadClass(str).getConstructor(f10463f);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (C0189dj) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Throwable e) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Could not inflate Behavior subclass ");
            stringBuilder2.append(str);
            throw new RuntimeException(stringBuilder2.toString(), e);
        }
    }

    /* renamed from: a */
    private final boolean m6783a(MotionEvent motionEvent, int i) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f10472k;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            int childDrawingOrder;
            if (isChildrenDrawingOrderEnabled) {
                childDrawingOrder = getChildDrawingOrder(childCount, i2);
            } else {
                childDrawingOrder = i2;
            }
            list.add(getChildAt(childDrawingOrder));
        }
        if (f10465h != null) {
            Collections.sort(list, f10465h);
        }
        int size = list.size();
        boolean z2 = false;
        Object obj = null;
        MotionEvent motionEvent2 = null;
        int i3 = 0;
        while (i3 < size) {
            Object obj2;
            View view = (View) list.get(i3);
            C0192dm c0192dm = (C0192dm) view.getLayoutParams();
            C0189dj c0189dj = c0192dm.f3337a;
            if ((!z2 && obj == null) || actionMasked == 0) {
                boolean z3;
                if (z2) {
                    z = z2;
                } else if (c0189dj != null) {
                    switch (i) {
                        case 0:
                            z2 = c0189dj.mo422a(this, view, motionEvent);
                            break;
                        case 1:
                            z2 = c0189dj.mo5982b(this, view, motionEvent);
                            break;
                    }
                    if (z2) {
                        this.f10478q = view;
                        z = z2;
                    } else {
                        z = z2;
                    }
                } else {
                    z = z2;
                }
                if (c0192dm.f3337a == null) {
                    c0192dm.f3349m = false;
                }
                boolean z4 = c0192dm.f3349m;
                if (z4) {
                    z3 = true;
                } else {
                    c0192dm.f3349m = z4;
                    z3 = z4;
                }
                if (!z3) {
                    obj2 = null;
                } else if (z4) {
                    obj2 = null;
                } else {
                    obj2 = 1;
                }
                if (z3 && obj2 == null) {
                    list.clear();
                    return z;
                }
            } else if (c0189dj != null) {
                MotionEvent obtain;
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                } else {
                    obtain = motionEvent2;
                }
                switch (i) {
                    case 0:
                        c0189dj.mo422a(this, view, obtain);
                        break;
                    case 1:
                        c0189dj.mo5982b(this, view, obtain);
                        break;
                }
                z = z2;
                motionEvent2 = obtain;
                obj2 = obj;
            } else {
                obj2 = obj;
                z = z2;
            }
            i3++;
            obj = obj2;
            z2 = z;
        }
        z = z2;
        list.clear();
        return z;
    }

    /* renamed from: a */
    private static void m6779a(Rect rect) {
        rect.setEmpty();
        f10466i.mo9114a(rect);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        C0189dj c0189dj = ((C0192dm) view.getLayoutParams()).f3337a;
        if (c0189dj != null) {
            c0189dj.mo415a(this, view, rect);
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f10475n) {
            m6782a(false);
            this.f10475n = true;
        }
    }

    /* renamed from: a */
    private final void m6782a(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0189dj c0189dj = ((C0192dm) childAt.getLayoutParams()).f3337a;
            if (c0189dj != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    c0189dj.mo422a(this, childAt, obtain);
                } else {
                    c0189dj.mo5982b(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0192dm) getChildAt(i2).getLayoutParams()).f3349m = false;
        }
        this.f10478q = null;
        this.f10475n = false;
    }

    /* renamed from: c */
    private static int m6787c(int i) {
        int i2;
        if ((i & 7) == 0) {
            i2 = 8388611 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 112) == 0) {
            return i2 | 48;
        }
        return i2;
    }

    /* renamed from: d */
    private static int m6789d(int i) {
        return i == 0 ? 8388661 : i;
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m6786b();
    }

    /* renamed from: c */
    private static void m6788c(View view, int i) {
        C0192dm c0192dm = (C0192dm) view.getLayoutParams();
        int i2 = c0192dm.f3345i;
        if (i2 != i) {
            C0315jm.m4609a(view, i - i2);
            c0192dm.f3345i = i;
        }
    }

    /* renamed from: d */
    private static void m6790d(View view, int i) {
        C0192dm c0192dm = (C0192dm) view.getLayoutParams();
        int i2 = c0192dm.f3346j;
        if (i2 != i) {
            C0315jm.m4624b(view, i - i2);
            c0192dm.f3346j = i;
        }
    }

    public void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f10470d = onHierarchyChangeListener;
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f10482u;
        if (drawable != null && drawable.isVisible() != z) {
            this.f10482u.setVisible(z, false);
        }
    }

    /* renamed from: b */
    private final void m6786b() {
        if (C0315jm.m4632g(this)) {
            if (this.f10483v == null) {
                this.f10483v = new C0639bh(this);
            }
            C0315jm.m4619a((View) this, this.f10483v);
            setSystemUiVisibility(DepthmapTask.DEPTH_PROCESSING_LATTICE_HR_MAX_SIZE_PX);
            return;
        }
        C0315jm.m4619a((View) this, null);
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f10482u;
    }
}
