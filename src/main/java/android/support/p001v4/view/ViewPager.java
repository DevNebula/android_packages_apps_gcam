package android.support.p001v4.view;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p000.C0314jl;
import p000.C0315jm;
import p000.C0317jp;
import p000.C0318jq;
import p000.C0319jr;
import p000.C0320jt;
import p000.C0321ju;
import p000.C0322jv;
import p000.C0323jx;
import p000.C0324jy;
import p000.C0325jz;
import p000.C0327kc;
import p000.C0697js;
import p000.C0698jw;
import p000.C0700ka;
import p000.kvl;

/* compiled from: PG */
/* renamed from: android.support.v4.view.ViewPager */
public class ViewPager extends ViewGroup {
    /* renamed from: V */
    private static final C0327kc f561V = new C0327kc();
    /* renamed from: a */
    public static final int[] f562a = new int[]{16842931};
    /* renamed from: l */
    private static final Comparator f563l = new C0317jp();
    /* renamed from: m */
    private static final Interpolator f564m = new C0318jq();
    /* renamed from: A */
    private int f565A;
    /* renamed from: B */
    private int f566B;
    /* renamed from: C */
    private float f567C;
    /* renamed from: D */
    private float f568D;
    /* renamed from: E */
    private float f569E;
    /* renamed from: F */
    private float f570F;
    /* renamed from: G */
    private int f571G = -1;
    /* renamed from: H */
    private VelocityTracker f572H;
    /* renamed from: I */
    private int f573I;
    /* renamed from: J */
    private int f574J;
    /* renamed from: K */
    private int f575K;
    /* renamed from: L */
    private int f576L;
    /* renamed from: M */
    private EdgeEffect f577M;
    /* renamed from: N */
    private EdgeEffect f578N;
    /* renamed from: O */
    private boolean f579O;
    /* renamed from: P */
    private int f580P;
    /* renamed from: Q */
    private List f581Q;
    /* renamed from: R */
    private C0324jy f582R;
    /* renamed from: S */
    private int f583S;
    /* renamed from: T */
    private int f584T;
    /* renamed from: U */
    private ArrayList f585U;
    /* renamed from: W */
    private final Runnable f586W = new C0319jr(this);
    /* renamed from: aa */
    private int f587aa = 0;
    /* renamed from: b */
    public int f588b;
    /* renamed from: c */
    public final ArrayList f589c = new ArrayList();
    /* renamed from: d */
    public C0314jl f590d;
    /* renamed from: e */
    public int f591e;
    /* renamed from: f */
    public int f592f = -1;
    /* renamed from: g */
    public Parcelable f593g = null;
    /* renamed from: h */
    public ClassLoader f594h = null;
    /* renamed from: i */
    public C0325jz f595i;
    /* renamed from: j */
    public boolean f596j;
    /* renamed from: k */
    public boolean f597k = true;
    /* renamed from: n */
    private final C0321ju f598n = new C0321ju();
    /* renamed from: o */
    private final Rect f599o = new Rect();
    /* renamed from: p */
    private Scroller f600p;
    /* renamed from: q */
    private boolean f601q;
    /* renamed from: r */
    private float f602r = -3.4028235E38f;
    /* renamed from: s */
    private float f603s = Float.MAX_VALUE;
    /* renamed from: t */
    private int f604t;
    /* renamed from: u */
    private boolean f605u;
    /* renamed from: v */
    private boolean f606v;
    /* renamed from: w */
    private int f607w = 1;
    /* renamed from: x */
    private boolean f608x;
    /* renamed from: y */
    private boolean f609y;
    /* renamed from: z */
    private int f610z;

    public ViewPager(Context context) {
        super(context);
        m416f();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m416f();
    }

    public void addFocusables(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    C0321ju a = m402a(childAt);
                    if (a != null && a.f8346b == this.f591e) {
                        childAt.addFocusables(arrayList, i, i2);
                    }
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    /* renamed from: a */
    private final C0321ju m401a(int i, int i2) {
        C0321ju c0321ju = new C0321ju();
        c0321ju.f8346b = i;
        c0321ju.f8345a = this.f590d.instantiateItem((ViewGroup) this, i);
        c0321ju.f8348d = this.f590d.getPageWidth(i);
        if (i2 < 0 || i2 >= this.f589c.size()) {
            this.f589c.add(c0321ju);
        } else {
            this.f589c.add(i2, c0321ju);
        }
        return c0321ju;
    }

    /* renamed from: a */
    public final void mo1058a(C0323jx c0323jx) {
        if (this.f581Q == null) {
            this.f581Q = new ArrayList();
        }
        this.f581Q.add(c0323jx);
    }

    public void addTouchables(ArrayList arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C0321ju a = m402a(childAt);
                if (a != null && a.f8346b == this.f591e) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        LayoutParams layoutParams2;
        int i2;
        if (checkLayoutParams(layoutParams)) {
            layoutParams2 = layoutParams;
        } else {
            layoutParams2 = generateLayoutParams(layoutParams);
        }
        C0322jv c0322jv = (C0322jv) layoutParams2;
        boolean z = c0322jv.f8360a;
        if (view.getClass().getAnnotation(C0320jt.class) != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c0322jv.f8360a = i2 | z;
        if (!this.f605u) {
            super.addView(view, i, layoutParams2);
        } else if (c0322jv == null || !c0322jv.f8360a) {
            c0322jv.f8363d = true;
            addViewInLayout(view, i, layoutParams2);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* renamed from: c */
    private final boolean m411c(int i) {
        View view;
        boolean h;
        View findFocus = findFocus();
        if (findFocus == this) {
            view = null;
        } else if (findFocus != null) {
            Object obj;
            for (ViewPager parent = findFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                if (parent == this) {
                    obj = 1;
                    break;
                }
            }
            obj = null;
            if (obj == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(findFocus.getClass().getSimpleName());
                for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    stringBuilder.append(" => ");
                    stringBuilder.append(parent2.getClass().getSimpleName());
                }
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("arrowScroll tried to find focus based on non-child current focused view ");
                stringBuilder2.append(stringBuilder.toString());
                Log.e("ViewPager", stringBuilder2.toString());
                view = null;
            } else {
                view = findFocus;
            }
        } else {
            view = findFocus;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (findNextFocus == null || findNextFocus == view) {
            h = (i == 17 || i == 1) ? m418h() : (i == 66 || i == 2) ? m419i() : false;
        } else if (i == 17) {
            h = (view == null || m400a(this.f599o, findNextFocus).left < m400a(this.f599o, view).left) ? findNextFocus.requestFocus() : m418h();
        } else if (i != 66) {
            h = false;
        } else {
            h = (view == null || m400a(this.f599o, findNextFocus).left > m400a(this.f599o, view).left) ? findNextFocus.requestFocus() : m419i();
        }
        if (h) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return h;
    }

    /* renamed from: a */
    private final boolean m408a(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i4 = i2 + scrollX;
                if (i4 >= childAt.getLeft() && i4 < childAt.getRight()) {
                    int i5 = i3 + scrollY;
                    if (i5 >= childAt.getTop() && i5 < childAt.getBottom()) {
                        if (m408a(childAt, true, i, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
                            return true;
                        }
                    }
                }
            }
        }
        if (z && view.canScrollHorizontally(-i)) {
            return true;
        }
        return false;
    }

    public boolean canScrollHorizontally(int i) {
        if (this.f590d == null) {
            return false;
        }
        int d = m412d();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) d) * this.f602r))) {
                return true;
            }
            return false;
        } else if (i <= 0 || scrollX >= ((int) (((float) d) * this.f603s))) {
            return false;
        } else {
            return true;
        }
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C0322jv) && super.checkLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private final void m406a(boolean z) {
        int i;
        int scrollX;
        int scrollY;
        if (this.f587aa == 2) {
            i = 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            m409b(false);
            if ((this.f600p.isFinished() ^ 1) != 0) {
                this.f600p.abortAnimation();
                scrollX = getScrollX();
                scrollY = getScrollY();
                int currX = this.f600p.getCurrX();
                int currY = this.f600p.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m420j();
                    }
                }
            }
        }
        this.f596j = false;
        scrollX = 0;
        while (true) {
            scrollY = i;
            if (scrollX >= this.f589c.size()) {
                break;
            }
            C0321ju c0321ju = (C0321ju) this.f589c.get(scrollX);
            if (c0321ju.f8347c) {
                c0321ju.f8347c = false;
                scrollY = 1;
            }
            i = scrollX + 1;
        }
        if (scrollY == 0) {
            return;
        }
        if (z) {
            C0315jm.m4615a((View) this, this.f586W);
        } else {
            this.f586W.run();
        }
    }

    public void computeScroll() {
        this.f601q = true;
        if (this.f600p.isFinished() || !this.f600p.computeScrollOffset()) {
            m406a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f600p.getCurrX();
        int currY = this.f600p.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m420j()) {
                this.f600p.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C0315jm.m4601A(this);
    }

    /* renamed from: a */
    public final void mo1054a() {
        boolean z;
        int i;
        int count = this.f590d.getCount();
        this.f588b = count;
        int size = this.f589c.size();
        int i2 = this.f607w;
        if (size >= (i2 + i2) + 1) {
            z = false;
        } else if (this.f589c.size() < count) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = false;
        int i3 = this.f591e;
        boolean z3 = z;
        i2 = 0;
        while (i2 < this.f589c.size()) {
            boolean z4;
            boolean z5;
            C0321ju c0321ju = (C0321ju) this.f589c.get(i2);
            int itemPosition = this.f590d.getItemPosition(c0321ju.f8345a);
            if (itemPosition == -1) {
                size = i2;
                z4 = z2;
                i = i3;
                z5 = z3;
            } else if (itemPosition == -2) {
                this.f589c.remove(i2);
                i2--;
                if (!z2) {
                    this.f590d.startUpdate((ViewGroup) this);
                    z2 = true;
                }
                this.f590d.destroyItem((ViewGroup) this, c0321ju.f8346b, c0321ju.f8345a);
                int i4 = this.f591e;
                if (i4 == c0321ju.f8346b) {
                    size = i2;
                    z4 = z2;
                    i = Math.max(0, Math.min(i4, count - 1));
                    z5 = true;
                } else {
                    size = i2;
                    z4 = z2;
                    i = i3;
                    z5 = true;
                }
            } else {
                int i5 = c0321ju.f8346b;
                if (i5 != itemPosition) {
                    if (i5 == this.f591e) {
                        i3 = itemPosition;
                    }
                    c0321ju.f8346b = itemPosition;
                    size = i2;
                    z4 = z2;
                    i = i3;
                    z5 = true;
                } else {
                    size = i2;
                    z4 = z2;
                    i = i3;
                    z5 = z3;
                }
            }
            z3 = z5;
            i3 = i;
            z2 = z4;
            i2 = size + 1;
        }
        if (z2) {
            this.f590d.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f589c, f563l);
        if (z3) {
            i = getChildCount();
            for (i2 = 0; i2 < i; i2++) {
                C0322jv c0322jv = (C0322jv) getChildAt(i2).getLayoutParams();
                if (!c0322jv.f8360a) {
                    c0322jv.f8362c = 0.0f;
                }
            }
            mo1057a(i3, false, true);
            requestLayout();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent)) {
            boolean c;
            if (keyEvent.getAction() == 0) {
                switch (keyEvent.getKeyCode()) {
                    case 21:
                        if (!keyEvent.hasModifiers(2)) {
                            c = m411c(17);
                            break;
                        }
                        c = m418h();
                        break;
                    case 22:
                        if (!keyEvent.hasModifiers(2)) {
                            c = m411c(66);
                            break;
                        }
                        c = m419i();
                        break;
                    case 61:
                        if (!keyEvent.hasNoModifiers()) {
                            if (!keyEvent.hasModifiers(1)) {
                                c = false;
                                break;
                            }
                            c = m411c(1);
                            break;
                        }
                        c = m411c(2);
                        break;
                    default:
                        c = false;
                        break;
                }
            }
            c = false;
            if (!c) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private final void m410c() {
        List list = this.f581Q;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C0323jx c0323jx = (C0323jx) this.f581Q.get(i);
                if (c0323jx != null) {
                    c0323jx.mo9588b();
                }
            }
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C0321ju a = m402a(childAt);
                if (a != null && a.f8346b == this.f591e && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x009b  */
    /* JADX WARNING: Missing block: B:6:0x0015, code:
            if (r1.getCount() > 1) goto L_0x0017;
     */
    public void draw(android.graphics.Canvas r10) {
        /*
        r9 = this;
        r2 = 1;
        r0 = 0;
        super.draw(r10);
        r1 = r9.getOverScrollMode();
        if (r1 == 0) goto L_0x0017;
    L_0x000b:
        if (r1 != r2) goto L_0x009f;
    L_0x000d:
        r1 = r9.f590d;
        if (r1 == 0) goto L_0x009f;
    L_0x0011:
        r1 = r1.getCount();
        if (r1 <= r2) goto L_0x009f;
    L_0x0017:
        r1 = r9.f577M;
        r1 = r1.isFinished();
        if (r1 != 0) goto L_0x0056;
    L_0x001f:
        r1 = r10.save();
        r0 = r9.getHeight();
        r2 = r9.getPaddingTop();
        r0 = r0 - r2;
        r2 = r9.getPaddingBottom();
        r0 = r0 - r2;
        r2 = r9.getWidth();
        r3 = 1132920832; // 0x43870000 float:270.0 double:5.597372625E-315;
        r10.rotate(r3);
        r3 = -r0;
        r4 = r9.getPaddingTop();
        r3 = r3 + r4;
        r3 = (float) r3;
        r4 = r9.f602r;
        r5 = (float) r2;
        r4 = r4 * r5;
        r10.translate(r3, r4);
        r3 = r9.f577M;
        r3.setSize(r0, r2);
        r0 = r9.f577M;
        r0 = r0.draw(r10);
        r10.restoreToCount(r1);
    L_0x0056:
        r1 = r9.f578N;
        r1 = r1.isFinished();
        if (r1 != 0) goto L_0x0099;
    L_0x005e:
        r1 = r10.save();
        r2 = r9.getWidth();
        r3 = r9.getHeight();
        r4 = r9.getPaddingTop();
        r5 = r9.getPaddingBottom();
        r6 = 1119092736; // 0x42b40000 float:90.0 double:5.529052754E-315;
        r10.rotate(r6);
        r6 = r9.getPaddingTop();
        r6 = -r6;
        r6 = (float) r6;
        r7 = r9.f603s;
        r8 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r7 = r7 + r8;
        r7 = -r7;
        r8 = (float) r2;
        r7 = r7 * r8;
        r10.translate(r6, r7);
        r6 = r9.f578N;
        r3 = r3 - r4;
        r3 = r3 - r5;
        r6.setSize(r3, r2);
        r2 = r9.f578N;
        r2 = r2.draw(r10);
        r0 = r0 | r2;
        r10.restoreToCount(r1);
    L_0x0099:
        if (r0 == 0) goto L_0x009e;
    L_0x009b:
        p000.C0315jm.m4601A(r9);
    L_0x009e:
        return;
    L_0x009f:
        r1 = r9.f577M;
        r1.finish();
        r1 = r9.f578N;
        r1.finish();
        goto L_0x0099;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.draw(android.graphics.Canvas):void");
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new C0322jv();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0322jv(getContext(), attributeSet);
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    protected int getChildDrawingOrder(int i, int i2) {
        if (this.f584T == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C0322jv) ((View) this.f585U.get(i2)).getLayoutParams()).f8365f;
    }

    /* renamed from: a */
    private final Rect m400a(Rect rect, View view) {
        Rect rect2;
        if (rect == null) {
            rect2 = new Rect();
        } else {
            rect2 = rect;
        }
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        ViewPager parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = parent;
            rect2.left += viewGroup.getLeft();
            rect2.right += viewGroup.getRight();
            rect2.top += viewGroup.getTop();
            rect2.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect2;
    }

    /* renamed from: d */
    private final int m412d() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: a */
    private final C0321ju m402a(View view) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f589c.size()) {
                return null;
            }
            C0321ju c0321ju = (C0321ju) this.f589c.get(i2);
            if (this.f590d.isViewFromObject(view, c0321ju.f8345a)) {
                return c0321ju;
            }
            i = i2 + 1;
        }
    }

    /* renamed from: e */
    private final C0321ju m414e() {
        float scrollX;
        float f;
        int d = m412d();
        if (d > 0) {
            scrollX = ((float) getScrollX()) / ((float) d);
        } else {
            scrollX = 0.0f;
        }
        if (d > 0) {
            f = 0.0f / ((float) d);
        } else {
            f = 0.0f;
        }
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = -1;
        int i2 = 0;
        Object obj = 1;
        C0321ju c0321ju = null;
        while (i2 < this.f589c.size()) {
            int i3;
            C0321ju c0321ju2;
            C0321ju c0321ju3 = (C0321ju) this.f589c.get(i2);
            C0321ju c0321ju4;
            if (obj == null) {
                i++;
                if (c0321ju3.f8346b != i) {
                    c0321ju3 = this.f598n;
                    c0321ju3.f8349e = (f2 + f3) + f;
                    c0321ju3.f8346b = i;
                    c0321ju3.f8348d = this.f590d.getPageWidth(c0321ju3.f8346b);
                    c0321ju4 = c0321ju3;
                    i3 = i2 - 1;
                    c0321ju2 = c0321ju4;
                } else {
                    c0321ju4 = c0321ju3;
                    i3 = i2;
                    c0321ju2 = c0321ju4;
                }
            } else {
                c0321ju4 = c0321ju3;
                i3 = i2;
                c0321ju2 = c0321ju4;
            }
            f2 = c0321ju2.f8349e;
            f3 = (c0321ju2.f8348d + f2) + f;
            if (obj == null && scrollX < f2) {
                return c0321ju;
            }
            if (scrollX < f3 || i3 == this.f589c.size() - 1) {
                return c0321ju2;
            }
            f3 = f2;
            i = c0321ju2.f8346b;
            obj = null;
            f2 = c0321ju2.f8348d;
            c0321ju = c0321ju2;
            i2 = i3 + 1;
        }
        return c0321ju;
    }

    /* renamed from: d */
    private final C0321ju m413d(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.f589c.size()) {
                return null;
            }
            C0321ju c0321ju = (C0321ju) this.f589c.get(i3);
            if (c0321ju.f8346b == i) {
                return c0321ju;
            }
            i2 = i3 + 1;
        }
    }

    /* renamed from: f */
    private final void m416f() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f600p = new Scroller(context, f564m);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f566B = viewConfiguration.getScaledPagingTouchSlop();
        this.f573I = (int) (400.0f * f);
        this.f574J = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f577M = new EdgeEffect(context);
        this.f578N = new EdgeEffect(context);
        this.f575K = (int) (25.0f * f);
        this.f576L = (int) (f + f);
        this.f610z = (int) (16.0f * f);
        C0315jm.m4618a((View) this, new C0698jw(this));
        if (C0315jm.m4633h(this) == 0) {
            C0315jm.m4627c(this, 1);
        }
        C0315jm.m4619a((View) this, new C0697js(this));
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f597k = true;
    }

    protected void onDetachedFromWindow() {
        removeCallbacks(this.f586W);
        Scroller scroller = this.f600p;
        if (!(scroller == null || scroller.isFinished())) {
            this.f600p.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & Illuminant.kOther;
        if (action == 3 || action == 1) {
            m422l();
            return false;
        }
        if (action != 0) {
            if (this.f608x) {
                return true;
            }
            if (this.f609y) {
                return false;
            }
        }
        float x;
        switch (action) {
            case 0:
                x = motionEvent.getX();
                this.f569E = x;
                this.f567C = x;
                x = motionEvent.getY();
                this.f570F = x;
                this.f568D = x;
                this.f571G = motionEvent.getPointerId(0);
                this.f609y = false;
                this.f601q = true;
                this.f600p.computeScrollOffset();
                if (this.f587aa == 2 && Math.abs(this.f600p.getFinalX() - this.f600p.getCurrX()) > this.f576L) {
                    this.f600p.abortAnimation();
                    this.f596j = false;
                    mo1063b();
                    this.f608x = true;
                    m421k();
                    mo1064b(1);
                    break;
                }
                m406a(false);
                this.f608x = false;
                break;
            case 2:
                action = this.f571G;
                if (action != -1) {
                    action = motionEvent.findPointerIndex(action);
                    float x2 = motionEvent.getX(action);
                    float f = x2 - this.f567C;
                    float abs = Math.abs(f);
                    float y = motionEvent.getY(action);
                    float abs2 = Math.abs(y - this.f570F);
                    if (f != 0.0f) {
                        x = this.f567C;
                        boolean z = (x < ((float) this.f565A) && f > 0.0f) ? true : x > ((float) (getWidth() - this.f565A)) ? f < 0.0f : false;
                        if (!z) {
                            if (m408a(this, false, (int) f, (int) x2, (int) y)) {
                                this.f567C = x2;
                                this.f568D = y;
                                this.f609y = true;
                                return false;
                            }
                        }
                    }
                    x = (float) this.f566B;
                    if (abs > x && 0.5f * abs > abs2) {
                        this.f608x = true;
                        m421k();
                        mo1064b(1);
                        if (f <= 0.0f) {
                            x = this.f569E - ((float) this.f566B);
                        } else {
                            x = this.f569E + ((float) this.f566B);
                        }
                        this.f567C = x;
                        this.f568D = y;
                        m409b(true);
                    } else if (abs2 > x) {
                        this.f609y = true;
                    }
                    if (this.f608x && m407a(x2)) {
                        C0315jm.m4601A(this);
                        break;
                    }
                }
                break;
            case 6:
                m405a(motionEvent);
                break;
        }
        if (this.f572H == null) {
            this.f572H = VelocityTracker.obtain();
        }
        this.f572H.addMovement(motionEvent);
        return this.f608x;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0322jv c0322jv;
        int i5;
        int childCount = getChildCount();
        int i6 = i3 - i;
        int i7 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i8 = 0;
        int i9 = 0;
        while (i9 < childCount) {
            int i10;
            View childAt = getChildAt(i9);
            int i11;
            if (childAt.getVisibility() != 8) {
                c0322jv = (C0322jv) childAt.getLayoutParams();
                if (c0322jv.f8360a) {
                    int max;
                    i11 = c0322jv.f8361b;
                    int i12 = i11 & 112;
                    switch (i11 & 7) {
                        case 1:
                            max = Math.max((i6 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            i5 = paddingLeft;
                            paddingLeft = paddingRight;
                            break;
                        case 3:
                            i5 = paddingLeft + childAt.getMeasuredWidth();
                            max = paddingLeft;
                            paddingLeft = paddingRight;
                            break;
                        case 5:
                            i11 = (i6 - paddingRight) - childAt.getMeasuredWidth();
                            max = i11;
                            i5 = paddingLeft;
                            paddingLeft = paddingRight + childAt.getMeasuredWidth();
                            break;
                        default:
                            max = paddingLeft;
                            i5 = paddingLeft;
                            paddingLeft = paddingRight;
                            break;
                    }
                    switch (i12) {
                        case 16:
                            i10 = paddingBottom;
                            paddingBottom = Math.max((i7 - childAt.getMeasuredHeight()) / 2, paddingTop);
                            i11 = i10;
                            break;
                        case 48:
                            i10 = paddingBottom;
                            paddingBottom = paddingTop;
                            paddingTop = childAt.getMeasuredHeight() + paddingTop;
                            i11 = i10;
                            break;
                        case 80:
                            i11 = childAt.getMeasuredHeight() + paddingBottom;
                            paddingBottom = (i7 - paddingBottom) - childAt.getMeasuredHeight();
                            break;
                        default:
                            i11 = paddingBottom;
                            paddingBottom = paddingTop;
                            break;
                    }
                    paddingRight = max + scrollX;
                    childAt.layout(paddingRight, paddingBottom, childAt.getMeasuredWidth() + paddingRight, childAt.getMeasuredHeight() + paddingBottom);
                    paddingBottom = i8 + 1;
                    paddingRight = paddingTop;
                    i8 = i5;
                    paddingTop = paddingLeft;
                    i10 = paddingBottom;
                    paddingBottom = i11;
                } else {
                    i11 = i8;
                    i8 = paddingLeft;
                    i10 = paddingTop;
                    paddingTop = paddingRight;
                }
            } else {
                i11 = i8;
                i8 = paddingLeft;
                i10 = paddingTop;
                paddingTop = paddingRight;
            }
            i9++;
            paddingLeft = i8;
            i8 = i10;
            i10 = paddingRight;
            paddingRight = paddingTop;
            paddingTop = i10;
        }
        i5 = (i6 - paddingLeft) - paddingRight;
        for (paddingRight = 0; paddingRight < childCount; paddingRight++) {
            View childAt2 = getChildAt(paddingRight);
            if (childAt2.getVisibility() != 8) {
                c0322jv = (C0322jv) childAt2.getLayoutParams();
                if (!c0322jv.f8360a) {
                    C0321ju a = m402a(childAt2);
                    if (a != null) {
                        float f = (float) i5;
                        i9 = ((int) (a.f8349e * f)) + paddingLeft;
                        if (c0322jv.f8363d) {
                            c0322jv.f8363d = false;
                            childAt2.measure(MeasureSpec.makeMeasureSpec((int) (c0322jv.f8362c * f), 1073741824), MeasureSpec.makeMeasureSpec((i7 - paddingTop) - paddingBottom, 1073741824));
                        }
                        childAt2.layout(i9, paddingTop, childAt2.getMeasuredWidth() + i9, childAt2.getMeasuredHeight() + paddingTop);
                    }
                }
            }
        }
        this.f580P = i8;
        if (this.f597k) {
            m403a(this.f591e, false, 0, false);
        }
        this.f597k = false;
    }

    protected void onMeasure(int i, int i2) {
        C0322jv c0322jv;
        int i3;
        int i4;
        setMeasuredDimension(ViewPager.getDefaultSize(0, i), ViewPager.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f565A = Math.min(measuredWidth / 10, this.f610z);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                c0322jv = (C0322jv) childAt.getLayoutParams();
                if (c0322jv != null && c0322jv.f8360a) {
                    Object obj;
                    Object obj2;
                    int i6;
                    i3 = c0322jv.f8361b;
                    i4 = i3 & 7;
                    i3 &= 112;
                    int obj3;
                    if (i3 == 48) {
                        obj3 = 1;
                    } else if (i3 != 80) {
                        obj3 = null;
                    } else {
                        obj3 = 1;
                    }
                    int obj22;
                    if (i4 == 3) {
                        obj22 = 1;
                    } else if (i4 != 5) {
                        obj22 = null;
                    } else {
                        obj22 = 1;
                    }
                    if (obj3 != null) {
                        i4 = kvl.UNSET_ENUM_VALUE;
                        i3 = 1073741824;
                    } else if (obj22 != null) {
                        i4 = 1073741824;
                        i3 = kvl.UNSET_ENUM_VALUE;
                    } else {
                        i4 = kvl.UNSET_ENUM_VALUE;
                        i3 = kvl.UNSET_ENUM_VALUE;
                    }
                    if (c0322jv.width == -2) {
                        i6 = paddingLeft;
                    } else if (c0322jv.width != -1) {
                        i6 = c0322jv.width;
                        i3 = 1073741824;
                    } else {
                        i3 = 1073741824;
                        i6 = paddingLeft;
                    }
                    if (c0322jv.height == -2) {
                        measuredWidth = measuredHeight;
                    } else if (c0322jv.height != -1) {
                        measuredWidth = c0322jv.height;
                        i4 = 1073741824;
                    } else {
                        i4 = 1073741824;
                        measuredWidth = measuredHeight;
                    }
                    childAt.measure(MeasureSpec.makeMeasureSpec(i6, i3), MeasureSpec.makeMeasureSpec(measuredWidth, i4));
                    if (obj3 != null) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (obj22 != null) {
                        paddingLeft -= childAt.getMeasuredWidth();
                    }
                }
            }
        }
        MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f604t = MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f605u = true;
        mo1063b();
        this.f605u = false;
        i4 = getChildCount();
        for (i3 = 0; i3 < i4; i3++) {
            View childAt2 = getChildAt(i3);
            if (childAt2.getVisibility() != 8) {
                c0322jv = (C0322jv) childAt2.getLayoutParams();
                if (c0322jv == null || !c0322jv.f8360a) {
                    childAt2.measure(MeasureSpec.makeMeasureSpec((int) (c0322jv.f8362c * ((float) paddingLeft)), 1073741824), this.f604t);
                }
            }
        }
    }

    /* renamed from: g */
    private final void m417g() {
        int paddingLeft;
        int paddingRight;
        int i;
        if (this.f580P > 0) {
            int scrollX = getScrollX();
            paddingLeft = getPaddingLeft();
            paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            i = 0;
            while (i < childCount) {
                int i2;
                View childAt = getChildAt(i);
                C0322jv c0322jv = (C0322jv) childAt.getLayoutParams();
                if (c0322jv.f8360a) {
                    int i3;
                    switch (c0322jv.f8361b & 7) {
                        case 1:
                            i3 = paddingRight;
                            paddingRight = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            i2 = i3;
                            break;
                        case 3:
                            i3 = paddingRight;
                            paddingRight = paddingLeft;
                            paddingLeft = childAt.getWidth() + paddingLeft;
                            i2 = i3;
                            break;
                        case 5:
                            i2 = childAt.getMeasuredWidth() + paddingRight;
                            paddingRight = (width - paddingRight) - childAt.getMeasuredWidth();
                            break;
                        default:
                            i2 = paddingRight;
                            paddingRight = paddingLeft;
                            break;
                    }
                    paddingRight = (paddingRight + scrollX) - childAt.getLeft();
                    if (paddingRight != 0) {
                        childAt.offsetLeftAndRight(paddingRight);
                    }
                } else {
                    i2 = paddingRight;
                }
                i++;
                paddingRight = i2;
            }
        }
        List list = this.f581Q;
        if (list != null) {
            paddingLeft = list.size();
            for (paddingRight = 0; paddingRight < paddingLeft; paddingRight++) {
                C0323jx c0323jx = (C0323jx) this.f581Q.get(paddingRight);
                if (c0323jx != null) {
                    c0323jx.mo9586a();
                }
            }
        }
        if (this.f582R != null) {
            paddingLeft = getScrollX();
            int childCount2 = getChildCount();
            for (paddingRight = 0; paddingRight < childCount2; paddingRight++) {
                View childAt2 = getChildAt(paddingRight);
                if (!((C0322jv) childAt2.getLayoutParams()).f8360a) {
                    float left = ((float) (childAt2.getLeft() - paddingLeft)) / ((float) m412d());
                    i = childAt2.getWidth();
                    if (left < -1.0f || left <= 0.0f || left >= 1.0f) {
                        childAt2.setAlpha(1.0f);
                        childAt2.setTranslationX(0.0f);
                        childAt2.setScaleX(1.0f);
                        childAt2.setScaleY(1.0f);
                    } else {
                        childAt2.setAlpha(1.0f - left);
                        childAt2.setTranslationX(((float) i) * (-left));
                        left = ((1.0f - Math.abs(left)) * 0.25f) + 0.75f;
                        childAt2.setScaleX(left);
                        childAt2.setScaleY(left);
                    }
                }
            }
        }
        this.f579O = true;
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3 = -1;
        int childCount = getChildCount();
        if ((i & 2) == 0) {
            i2 = childCount - 1;
            childCount = -1;
        } else {
            i3 = childCount;
            i2 = 0;
            childCount = 1;
        }
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                C0321ju a = m402a(childAt);
                if (a != null && a.f8346b == this.f591e && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            i2 += childCount;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C0700ka) {
            C0700ka c0700ka = (C0700ka) parcelable;
            super.onRestoreInstanceState(c0700ka.f7997e);
            C0314jl c0314jl = this.f590d;
            if (c0314jl != null) {
                c0314jl.restoreState(c0700ka.f21832b, c0700ka.f21833c);
                mo1057a(c0700ka.f21831a, false, true);
                return;
            }
            this.f592f = c0700ka.f21831a;
            this.f593g = c0700ka.f21832b;
            this.f594h = c0700ka.f21833c;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable c0700ka = new C0700ka(super.onSaveInstanceState());
        c0700ka.f21831a = this.f591e;
        C0314jl c0314jl = this.f590d;
        if (c0314jl != null) {
            c0700ka.f21832b = c0314jl.saveState();
        }
        return c0700ka;
    }

    /* renamed from: a */
    private final void m405a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f571G) {
            if (actionIndex == 0) {
                actionIndex = 1;
            } else {
                actionIndex = 0;
            }
            this.f567C = motionEvent.getX(actionIndex);
            this.f571G = motionEvent.getPointerId(actionIndex);
            VelocityTracker velocityTracker = this.f572H;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3) {
            return;
        }
        float min;
        int paddingLeft;
        if (i3 <= 0 || this.f589c.isEmpty()) {
            C0321ju d = m413d(this.f591e);
            if (d != null) {
                min = Math.min(d.f8349e, this.f603s);
            } else {
                min = 0.0f;
            }
            paddingLeft = (int) (min * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (paddingLeft != getScrollX()) {
                m406a(false);
                scrollTo(paddingLeft, getScrollY());
            }
        } else if (this.f600p.isFinished()) {
            paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingLeft2 = getPaddingLeft();
            min = (float) ((i - paddingLeft) - paddingRight);
            scrollTo((int) (min * (((float) getScrollX()) / ((float) ((i3 - paddingLeft2) - getPaddingRight())))), getScrollY());
        } else {
            this.f600p.setFinalX(this.f591e * m412d());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        C0314jl c0314jl = this.f590d;
        if (c0314jl == null || c0314jl.getCount() == 0) {
            return false;
        }
        if (this.f572H == null) {
            this.f572H = VelocityTracker.obtain();
        }
        this.f572H.addMovement(motionEvent);
        float x;
        int d;
        float f;
        float f2;
        switch (motionEvent.getAction() & Illuminant.kOther) {
            case 0:
                this.f600p.abortAnimation();
                this.f596j = false;
                mo1063b();
                x = motionEvent.getX();
                this.f569E = x;
                this.f567C = x;
                x = motionEvent.getY();
                this.f570F = x;
                this.f568D = x;
                this.f571G = motionEvent.getPointerId(0);
                break;
            case 1:
                if (this.f608x) {
                    int i;
                    VelocityTracker velocityTracker = this.f572H;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.f574J);
                    int xVelocity = (int) velocityTracker.getXVelocity(this.f571G);
                    this.f596j = true;
                    d = m412d();
                    int scrollX = getScrollX();
                    C0321ju e = m414e();
                    float f3 = (float) d;
                    d = e.f8346b;
                    f = ((((float) scrollX) / f3) - e.f8349e) / (e.f8348d + (0.0f / f3));
                    if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f571G)) - this.f569E)) <= this.f575K || Math.abs(xVelocity) <= this.f573I) {
                        if (d >= this.f591e) {
                            f2 = 0.4f;
                        } else {
                            f2 = 0.6f;
                        }
                        i = d + ((int) (f2 + f));
                    } else if (xVelocity <= 0) {
                        i = d + 1;
                    } else {
                        i = d;
                    }
                    if (this.f589c.size() > 0) {
                        C0321ju c0321ju = (C0321ju) this.f589c.get(0);
                        ArrayList arrayList = this.f589c;
                        i = Math.max(c0321ju.f8346b, Math.min(i, ((C0321ju) arrayList.get(arrayList.size() - 1)).f8346b));
                    }
                    m404a(i, true, true, xVelocity);
                    z = m422l();
                    break;
                }
                break;
            case 2:
                if (!this.f608x) {
                    d = motionEvent.findPointerIndex(this.f571G);
                    if (d == -1) {
                        z = m422l();
                        break;
                    }
                    f2 = motionEvent.getX(d);
                    f = Math.abs(f2 - this.f567C);
                    float y = motionEvent.getY(d);
                    x = Math.abs(y - this.f568D);
                    if (f > ((float) this.f566B) && f > x) {
                        this.f608x = true;
                        m421k();
                        x = this.f569E;
                        if (f2 - x <= 0.0f) {
                            x -= (float) this.f566B;
                        } else {
                            x += (float) this.f566B;
                        }
                        this.f567C = x;
                        this.f568D = y;
                        mo1064b(1);
                        m409b(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
                if (this.f608x) {
                    z = m407a(motionEvent.getX(motionEvent.findPointerIndex(this.f571G)));
                    break;
                }
                break;
            case 3:
                if (this.f608x) {
                    m403a(this.f591e, true, 0, false);
                    z = m422l();
                    break;
                }
                break;
            case 5:
                d = motionEvent.getActionIndex();
                this.f567C = motionEvent.getX(d);
                this.f571G = motionEvent.getPointerId(d);
                break;
            case 6:
                m405a(motionEvent);
                this.f567C = motionEvent.getX(motionEvent.findPointerIndex(this.f571G));
                break;
        }
        if (z) {
            C0315jm.m4601A(this);
        }
        return true;
    }

    /* renamed from: h */
    private final boolean m418h() {
        int i = this.f591e;
        if (i <= 0) {
            return false;
        }
        mo1056a(i - 1, true);
        return true;
    }

    /* renamed from: i */
    private final boolean m419i() {
        C0314jl c0314jl = this.f590d;
        if (c0314jl == null || this.f591e >= c0314jl.getCount() - 1) {
            return false;
        }
        mo1056a(this.f591e + 1, true);
        return true;
    }

    /* renamed from: j */
    private final boolean m420j() {
        if (this.f589c.size() != 0) {
            m414e();
            m412d();
            this.f579O = false;
            m417g();
            if (this.f579O) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f597k) {
            return false;
        } else {
            this.f579O = false;
            m417g();
            if (this.f579O) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    /* renamed from: a */
    private final boolean m407a(float f) {
        int i;
        float f2;
        int i2;
        boolean z = true;
        float f3 = this.f567C;
        this.f567C = f;
        float scrollX = ((float) getScrollX()) + (f3 - f);
        float d = (float) m412d();
        float f4 = d * this.f602r;
        float f5 = d * this.f603s;
        C0321ju c0321ju = (C0321ju) this.f589c.get(0);
        ArrayList arrayList = this.f589c;
        C0321ju c0321ju2 = (C0321ju) arrayList.get(arrayList.size() - 1);
        if (c0321ju.f8346b != 0) {
            f4 = c0321ju.f8349e * d;
            i = 0;
        } else {
            boolean i3 = true;
        }
        if (c0321ju2.f8346b != this.f590d.getCount() - 1) {
            f2 = c0321ju2.f8349e * d;
            i2 = 0;
        } else {
            f2 = f5;
            boolean i22 = true;
        }
        if (scrollX < f4) {
            if (i3 != 0) {
                this.f577M.onPull(Math.abs(f4 - scrollX) / d);
            } else {
                z = false;
            }
        } else if (scrollX > f2) {
            if (i22 != 0) {
                this.f578N.onPull(Math.abs(scrollX - f2) / d);
            } else {
                z = false;
            }
            f4 = f2;
        } else {
            f4 = scrollX;
            z = false;
        }
        i3 = (int) f4;
        this.f567C += f4 - ((float) i3);
        scrollTo(i3, getScrollY());
        m420j();
        return z;
    }

    /* renamed from: b */
    public final void mo1063b() {
        m415e(this.f591e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:133:0x02bc A:{LOOP_END, LOOP:8: B:131:0x02b8->B:133:0x02bc} */
    /* renamed from: e */
    private final void m415e(int r15) {
        /*
        r14 = this;
        r0 = r14.f591e;
        if (r0 == r15) goto L_0x0417;
    L_0x0004:
        r0 = r14.m413d(r0);
        r14.f591e = r15;
        r6 = r0;
    L_0x000b:
        r0 = r14.f590d;
        if (r0 != 0) goto L_0x0013;
    L_0x000f:
        r14.m423m();
    L_0x0012:
        return;
    L_0x0013:
        r0 = r14.f596j;
        if (r0 == 0) goto L_0x001b;
    L_0x0017:
        r14.m423m();
        goto L_0x0012;
    L_0x001b:
        r0 = r14.getWindowToken();
        if (r0 == 0) goto L_0x0012;
    L_0x0021:
        r0 = r14.f590d;
        r0.startUpdate(r14);
        r0 = r14.f607w;
        r1 = 0;
        r2 = r14.f591e;
        r2 = r2 - r0;
        r8 = java.lang.Math.max(r1, r2);
        r1 = r14.f590d;
        r10 = r1.getCount();
        r1 = r10 + -1;
        r2 = r14.f591e;
        r0 = r0 + r2;
        r11 = java.lang.Math.min(r1, r0);
        r0 = r14.f588b;
        if (r10 == r0) goto L_0x0092;
    L_0x0043:
        r0 = r14.getResources();	 Catch:{ NotFoundException -> 0x041b }
        r1 = r14.getId();	 Catch:{ NotFoundException -> 0x041b }
        r0 = r0.getResourceName(r1);	 Catch:{ NotFoundException -> 0x041b }
    L_0x004f:
        r1 = new java.lang.IllegalStateException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ";
        r2.append(r3);
        r3 = r14.f588b;
        r2.append(r3);
        r3 = ", found: ";
        r2.append(r3);
        r2.append(r10);
        r3 = " Pager id: ";
        r2.append(r3);
        r2.append(r0);
        r0 = " Pager class: ";
        r2.append(r0);
        r0 = r14.getClass();
        r2.append(r0);
        r0 = " Problematic adapter: ";
        r2.append(r0);
        r0 = r14.f590d;
        r0 = r0.getClass();
        r2.append(r0);
        r0 = r2.toString();
        r1.<init>(r0);
        throw r1;
    L_0x0092:
        r0 = 0;
        r1 = r0;
    L_0x0094:
        r0 = r14.f589c;
        r0 = r0.size();
        if (r1 >= r0) goto L_0x0414;
    L_0x009c:
        r0 = r14.f589c;
        r0 = r0.get(r1);
        r0 = (p000.C0321ju) r0;
        r2 = r0.f8346b;
        r3 = r14.f591e;
        if (r2 < r3) goto L_0x040f;
    L_0x00aa:
        if (r2 == r3) goto L_0x00ad;
    L_0x00ac:
        r0 = 0;
    L_0x00ad:
        if (r0 != 0) goto L_0x040c;
    L_0x00af:
        if (r10 <= 0) goto L_0x0409;
    L_0x00b1:
        r0 = r14.f591e;
        r0 = r14.m401a(r0, r1);
        r7 = r0;
    L_0x00b8:
        if (r7 == 0) goto L_0x0369;
    L_0x00ba:
        r4 = r1 + -1;
        if (r4 < 0) goto L_0x0405;
    L_0x00be:
        r0 = r14.f589c;
        r0 = r0.get(r4);
        r0 = (p000.C0321ju) r0;
        r3 = r0;
    L_0x00c7:
        r9 = r14.m412d();
        if (r9 <= 0) goto L_0x0401;
    L_0x00cd:
        r0 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = r7.f8348d;
        r0 = r0 - r2;
        r2 = r14.getPaddingLeft();
        r2 = (float) r2;
        r5 = (float) r9;
        r2 = r2 / r5;
        r0 = r0 + r2;
        r2 = r0;
    L_0x00db:
        r0 = r14.f591e;
        r0 = r0 + -1;
        r5 = 0;
        r13 = r0;
        r0 = r3;
        r3 = r4;
        r4 = r1;
        r1 = r5;
        r5 = r13;
    L_0x00e6:
        if (r5 < 0) goto L_0x015b;
    L_0x00e8:
        r12 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r12 < 0) goto L_0x0125;
    L_0x00ec:
        if (r5 >= r8) goto L_0x0125;
    L_0x00ee:
        if (r0 == 0) goto L_0x015b;
    L_0x00f0:
        r12 = r0.f8346b;
        if (r5 != r12) goto L_0x0121;
    L_0x00f4:
        r12 = r0.f8347c;
        if (r12 != 0) goto L_0x011d;
    L_0x00f8:
        r12 = r14.f589c;
        r12.remove(r3);
        r12 = r14.f590d;
        r0 = r0.f8345a;
        r12.destroyItem(r14, r5, r0);
        r3 = r3 + -1;
        r4 = r4 + -1;
        if (r3 < 0) goto L_0x011b;
    L_0x010a:
        r0 = r14.f589c;
        r0 = r0.get(r3);
        r0 = (p000.C0321ju) r0;
    L_0x0112:
        r13 = r1;
        r1 = r0;
        r0 = r13;
    L_0x0115:
        r5 = r5 + -1;
        r13 = r1;
        r1 = r0;
        r0 = r13;
        goto L_0x00e6;
    L_0x011b:
        r0 = 0;
        goto L_0x0112;
    L_0x011d:
        r13 = r1;
        r1 = r0;
        r0 = r13;
        goto L_0x0115;
    L_0x0121:
        r13 = r1;
        r1 = r0;
        r0 = r13;
        goto L_0x0115;
    L_0x0125:
        if (r0 == 0) goto L_0x0140;
    L_0x0127:
        r12 = r0.f8346b;
        if (r5 != r12) goto L_0x0140;
    L_0x012b:
        r0 = r0.f8348d;
        r1 = r1 + r0;
        r3 = r3 + -1;
        if (r3 < 0) goto L_0x013e;
    L_0x0132:
        r0 = r14.f589c;
        r0 = r0.get(r3);
        r0 = (p000.C0321ju) r0;
    L_0x013a:
        r13 = r1;
        r1 = r0;
        r0 = r13;
        goto L_0x0115;
    L_0x013e:
        r0 = 0;
        goto L_0x013a;
    L_0x0140:
        r0 = r3 + 1;
        r0 = r14.m401a(r5, r0);
        r0 = r0.f8348d;
        r1 = r1 + r0;
        r4 = r4 + 1;
        if (r3 < 0) goto L_0x0159;
    L_0x014d:
        r0 = r14.f589c;
        r0 = r0.get(r3);
        r0 = (p000.C0321ju) r0;
    L_0x0155:
        r13 = r1;
        r1 = r0;
        r0 = r13;
        goto L_0x0115;
    L_0x0159:
        r0 = 0;
        goto L_0x0155;
    L_0x015b:
        r2 = r7.f8348d;
        r8 = r4 + 1;
        r0 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 >= 0) goto L_0x021b;
    L_0x0165:
        r0 = r14.f589c;
        r0 = r0.size();
        if (r8 >= r0) goto L_0x0218;
    L_0x016d:
        r0 = r14.f589c;
        r0 = r0.get(r8);
        r0 = (p000.C0321ju) r0;
        r3 = r0;
    L_0x0176:
        if (r9 <= 0) goto L_0x0214;
    L_0x0178:
        r0 = r14.getPaddingRight();
        r0 = (float) r0;
        r1 = (float) r9;
        r0 = r0 / r1;
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r0 + r1;
        r1 = r0;
    L_0x0183:
        r0 = r14.f591e;
        r0 = r0 + 1;
        r9 = r0;
        r0 = r3;
        r3 = r8;
    L_0x018a:
        if (r9 >= r10) goto L_0x021b;
    L_0x018c:
        r5 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1));
        if (r5 < 0) goto L_0x01cc;
    L_0x0190:
        if (r9 <= r11) goto L_0x01cc;
    L_0x0192:
        if (r0 == 0) goto L_0x021b;
    L_0x0194:
        r5 = r0.f8346b;
        if (r9 != r5) goto L_0x01c8;
    L_0x0198:
        r5 = r0.f8347c;
        if (r5 != 0) goto L_0x01c4;
    L_0x019c:
        r5 = r14.f589c;
        r5.remove(r3);
        r5 = r14.f590d;
        r0 = r0.f8345a;
        r5.destroyItem(r14, r9, r0);
        r0 = r14.f589c;
        r0 = r0.size();
        if (r3 >= r0) goto L_0x01c2;
    L_0x01b0:
        r0 = r14.f589c;
        r0 = r0.get(r3);
        r0 = (p000.C0321ju) r0;
    L_0x01b8:
        r13 = r2;
        r2 = r0;
        r0 = r13;
    L_0x01bb:
        r5 = r9 + 1;
        r9 = r5;
        r13 = r0;
        r0 = r2;
        r2 = r13;
        goto L_0x018a;
    L_0x01c2:
        r0 = 0;
        goto L_0x01b8;
    L_0x01c4:
        r13 = r2;
        r2 = r0;
        r0 = r13;
        goto L_0x01bb;
    L_0x01c8:
        r13 = r2;
        r2 = r0;
        r0 = r13;
        goto L_0x01bb;
    L_0x01cc:
        if (r0 == 0) goto L_0x01f0;
    L_0x01ce:
        r5 = r0.f8346b;
        if (r9 != r5) goto L_0x01f0;
    L_0x01d2:
        r0 = r0.f8348d;
        r2 = r2 + r0;
        r3 = r3 + 1;
        r0 = r14.f589c;
        r0 = r0.size();
        if (r3 >= r0) goto L_0x01eb;
    L_0x01df:
        r0 = r14.f589c;
        r0 = r0.get(r3);
        r0 = (p000.C0321ju) r0;
        r13 = r2;
        r2 = r0;
        r0 = r13;
        goto L_0x01bb;
    L_0x01eb:
        r0 = 0;
        r13 = r2;
        r2 = r0;
        r0 = r13;
        goto L_0x01bb;
    L_0x01f0:
        r5 = r3 + 1;
        r0 = r14.m401a(r9, r3);
        r0 = r0.f8348d;
        r2 = r2 + r0;
        r0 = r14.f589c;
        r0 = r0.size();
        if (r5 >= r0) goto L_0x020e;
    L_0x0201:
        r0 = r14.f589c;
        r0 = r0.get(r5);
        r0 = (p000.C0321ju) r0;
        r3 = r5;
        r13 = r0;
        r0 = r2;
        r2 = r13;
        goto L_0x01bb;
    L_0x020e:
        r0 = 0;
        r3 = r5;
        r13 = r0;
        r0 = r2;
        r2 = r13;
        goto L_0x01bb;
    L_0x0214:
        r0 = 0;
        r1 = r0;
        goto L_0x0183;
    L_0x0218:
        r3 = 0;
        goto L_0x0176;
    L_0x021b:
        r0 = r14.f590d;
        r10 = r0.getCount();
        r0 = r14.m412d();
        if (r0 <= 0) goto L_0x03fd;
    L_0x0227:
        r1 = 0;
        r0 = (float) r0;
        r0 = r1 / r0;
        r9 = r0;
    L_0x022c:
        if (r6 == 0) goto L_0x02d0;
    L_0x022e:
        r0 = r6.f8346b;
        r1 = r7.f8346b;
        if (r0 >= r1) goto L_0x028b;
    L_0x0234:
        r1 = r6.f8349e;
        r2 = r6.f8348d;
        r1 = r1 + r2;
        r2 = r1 + r9;
        r1 = r0 + 1;
        r0 = 0;
        r3 = r0;
    L_0x023f:
        r0 = r7.f8346b;
        if (r1 > r0) goto L_0x02d0;
    L_0x0243:
        r0 = r14.f589c;
        r0 = r0.size();
        if (r3 >= r0) goto L_0x02d0;
    L_0x024b:
        r0 = r14.f589c;
        r0 = r0.get(r3);
        r0 = (p000.C0321ju) r0;
        r5 = r0;
    L_0x0254:
        r0 = r5.f8346b;
        if (r1 <= r0) goto L_0x0288;
    L_0x0258:
        r0 = r14.f589c;
        r0 = r0.size();
        r0 = r0 + -1;
        if (r3 >= r0) goto L_0x026e;
    L_0x0262:
        r3 = r3 + 1;
        r0 = r14.f589c;
        r0 = r0.get(r3);
        r0 = (p000.C0321ju) r0;
        r5 = r0;
        goto L_0x0254;
    L_0x026e:
        r0 = r1;
        r1 = r2;
    L_0x0270:
        r2 = r5.f8346b;
        if (r0 >= r2) goto L_0x027f;
    L_0x0274:
        r2 = r14.f590d;
        r2 = r2.getPageWidth(r0);
        r2 = r2 + r9;
        r1 = r1 + r2;
        r0 = r0 + 1;
        goto L_0x0270;
    L_0x027f:
        r5.f8349e = r1;
        r2 = r5.f8348d;
        r2 = r2 + r9;
        r2 = r2 + r1;
        r1 = r0 + 1;
        goto L_0x023f;
    L_0x0288:
        r0 = r1;
        r1 = r2;
        goto L_0x0270;
    L_0x028b:
        if (r0 <= r1) goto L_0x02d0;
    L_0x028d:
        r1 = r14.f589c;
        r1 = r1.size();
        r1 = r1 + -1;
        r3 = r6.f8349e;
        r2 = r0 + -1;
    L_0x0299:
        r0 = r7.f8346b;
        if (r2 < r0) goto L_0x02d0;
    L_0x029d:
        if (r1 < 0) goto L_0x02d0;
    L_0x029f:
        r0 = r14.f589c;
        r0 = r0.get(r1);
        r0 = (p000.C0321ju) r0;
    L_0x02a7:
        r5 = r0.f8346b;
        if (r2 >= r5) goto L_0x02b8;
    L_0x02ab:
        if (r1 <= 0) goto L_0x02b8;
    L_0x02ad:
        r1 = r1 + -1;
        r0 = r14.f589c;
        r0 = r0.get(r1);
        r0 = (p000.C0321ju) r0;
        goto L_0x02a7;
    L_0x02b8:
        r5 = r0.f8346b;
        if (r2 <= r5) goto L_0x02c7;
    L_0x02bc:
        r5 = r14.f590d;
        r5 = r5.getPageWidth(r2);
        r5 = r5 + r9;
        r3 = r3 - r5;
        r2 = r2 + -1;
        goto L_0x02b8;
    L_0x02c7:
        r5 = r0.f8348d;
        r5 = r5 + r9;
        r3 = r3 - r5;
        r0.f8349e = r3;
        r2 = r2 + -1;
        goto L_0x0299;
    L_0x02d0:
        r0 = r14.f589c;
        r5 = r0.size();
        r1 = r7.f8349e;
        r3 = r7.f8346b;
        r2 = r3 + -1;
        if (r3 != 0) goto L_0x03f8;
    L_0x02de:
        r0 = r1;
    L_0x02df:
        r14.f602r = r0;
        r6 = r10 + -1;
        if (r3 != r6) goto L_0x03f3;
    L_0x02e5:
        r0 = r7.f8348d;
        r0 = r0 + r1;
        r3 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r0 = r0 + r3;
    L_0x02eb:
        r14.f603s = r0;
        r0 = r4 + -1;
        r4 = r0;
        r13 = r2;
        r2 = r1;
        r1 = r13;
    L_0x02f3:
        if (r4 < 0) goto L_0x0321;
    L_0x02f5:
        r0 = r14.f589c;
        r0 = r0.get(r4);
        r0 = (p000.C0321ju) r0;
        r3 = r2;
    L_0x02fe:
        r10 = r0.f8346b;
        if (r1 <= r10) goto L_0x0310;
    L_0x0302:
        r2 = r1 + -1;
        r10 = r14.f590d;
        r1 = r10.getPageWidth(r1);
        r1 = r1 + r9;
        r1 = r3 - r1;
        r3 = r1;
        r1 = r2;
        goto L_0x02fe;
    L_0x0310:
        r2 = r0.f8348d;
        r2 = r2 + r9;
        r2 = r3 - r2;
        r0.f8349e = r2;
        if (r10 != 0) goto L_0x031b;
    L_0x0319:
        r14.f602r = r2;
    L_0x031b:
        r0 = r4 + -1;
        r1 = r1 + -1;
        r4 = r0;
        goto L_0x02f3;
    L_0x0321:
        r0 = r7.f8349e;
        r1 = r7.f8348d;
        r0 = r0 + r1;
        r2 = r0 + r9;
        r0 = r7.f8346b;
        r1 = r0 + 1;
        r4 = r8;
    L_0x032d:
        if (r4 >= r5) goto L_0x0360;
    L_0x032f:
        r0 = r14.f589c;
        r0 = r0.get(r4);
        r0 = (p000.C0321ju) r0;
        r3 = r2;
    L_0x0338:
        r2 = r0.f8346b;
        if (r1 >= r2) goto L_0x0349;
    L_0x033c:
        r2 = r1 + 1;
        r8 = r14.f590d;
        r1 = r8.getPageWidth(r1);
        r1 = r1 + r9;
        r1 = r1 + r3;
        r3 = r1;
        r1 = r2;
        goto L_0x0338;
    L_0x0349:
        if (r2 != r6) goto L_0x0353;
    L_0x034b:
        r2 = r0.f8348d;
        r2 = r2 + r3;
        r8 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r2 = r2 + r8;
        r14.f603s = r2;
    L_0x0353:
        r0.f8349e = r3;
        r0 = r0.f8348d;
        r0 = r0 + r9;
        r2 = r3 + r0;
        r0 = r4 + 1;
        r1 = r1 + 1;
        r4 = r0;
        goto L_0x032d;
    L_0x0360:
        r0 = r14.f590d;
        r1 = r14.f591e;
        r2 = r7.f8345a;
        r0.setPrimaryItem(r14, r1, r2);
    L_0x0369:
        r0 = r14.f590d;
        r0.finishUpdate(r14);
        r2 = r14.getChildCount();
        r0 = 0;
        r1 = r0;
    L_0x0374:
        if (r1 >= r2) goto L_0x039f;
    L_0x0376:
        r3 = r14.getChildAt(r1);
        r0 = r3.getLayoutParams();
        r0 = (p000.C0322jv) r0;
        r0.f8365f = r1;
        r4 = r0.f8360a;
        if (r4 != 0) goto L_0x039b;
    L_0x0386:
        r4 = r0.f8362c;
        r5 = 0;
        r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));
        if (r4 != 0) goto L_0x039b;
    L_0x038d:
        r3 = r14.m402a(r3);
        if (r3 == 0) goto L_0x039b;
    L_0x0393:
        r4 = r3.f8348d;
        r0.f8362c = r4;
        r3 = r3.f8346b;
        r0.f8364e = r3;
    L_0x039b:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0374;
    L_0x039f:
        r14.m423m();
        r0 = r14.hasFocus();
        if (r0 == 0) goto L_0x0012;
    L_0x03a8:
        r0 = r14.findFocus();
        if (r0 != 0) goto L_0x0426;
    L_0x03ae:
        r0 = 0;
    L_0x03af:
        if (r0 == 0) goto L_0x03d8;
    L_0x03b1:
        r0 = r0.f8346b;
        r1 = r14.f591e;
        if (r0 == r1) goto L_0x0012;
    L_0x03b7:
        r0 = 0;
    L_0x03b8:
        r1 = r14.getChildCount();
        if (r0 >= r1) goto L_0x0012;
    L_0x03be:
        r1 = r14.getChildAt(r0);
        r2 = r14.m402a(r1);
        if (r2 == 0) goto L_0x03d5;
    L_0x03c8:
        r2 = r2.f8346b;
        r3 = r14.f591e;
        if (r2 != r3) goto L_0x03d5;
    L_0x03ce:
        r2 = 2;
        r1 = r1.requestFocus(r2);
        if (r1 != 0) goto L_0x0012;
    L_0x03d5:
        r0 = r0 + 1;
        goto L_0x03b8;
    L_0x03d8:
        r0 = 0;
        goto L_0x03b8;
    L_0x03da:
        r0 = r1.getParent();
        if (r0 == r14) goto L_0x03ee;
    L_0x03e0:
        if (r0 == 0) goto L_0x03ec;
    L_0x03e2:
        r1 = r0 instanceof android.view.View;
        if (r1 == 0) goto L_0x03ea;
    L_0x03e6:
        r0 = (android.view.View) r0;
        r1 = r0;
        goto L_0x03da;
    L_0x03ea:
        r0 = 0;
        goto L_0x03af;
    L_0x03ec:
        r0 = 0;
        goto L_0x03af;
    L_0x03ee:
        r0 = r14.m402a(r1);
        goto L_0x03af;
    L_0x03f3:
        r0 = 2139095039; // 0x7f7fffff float:3.4028235E38 double:1.056853372E-314;
        goto L_0x02eb;
    L_0x03f8:
        r0 = -8388609; // 0xffffffffff7fffff float:-3.4028235E38 double:NaN;
        goto L_0x02df;
    L_0x03fd:
        r0 = 0;
        r9 = r0;
        goto L_0x022c;
    L_0x0401:
        r0 = 0;
        r2 = r0;
        goto L_0x00db;
    L_0x0405:
        r0 = 0;
        r3 = r0;
        goto L_0x00c7;
    L_0x0409:
        r7 = r0;
        goto L_0x00b8;
    L_0x040c:
        r7 = r0;
        goto L_0x00b8;
    L_0x040f:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0094;
    L_0x0414:
        r0 = 0;
        goto L_0x00ad;
    L_0x0417:
        r0 = 0;
        r6 = r0;
        goto L_0x000b;
    L_0x041b:
        r0 = move-exception;
        r0 = r14.getId();
        r0 = java.lang.Integer.toHexString(r0);
        goto L_0x004f;
    L_0x0426:
        r1 = r0;
        goto L_0x03da;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.e(int):void");
    }

    public void removeView(View view) {
        if (this.f605u) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* renamed from: k */
    private final void m421k() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    /* renamed from: l */
    private final boolean m422l() {
        this.f571G = -1;
        this.f608x = false;
        this.f609y = false;
        VelocityTracker velocityTracker = this.f572H;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f572H = null;
        }
        this.f577M.onRelease();
        this.f578N.onRelease();
        if (this.f577M.isFinished() || this.f578N.isFinished()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final void m403a(int i, boolean z, int i2, boolean z2) {
        int max;
        C0321ju d = m413d(i);
        if (d != null) {
            max = (int) (Math.max(this.f602r, Math.min(d.f8349e, this.f603s)) * ((float) m412d()));
        } else {
            max = 0;
        }
        if (z) {
            if (getChildCount() == 0) {
                m409b(false);
            } else {
                boolean z3;
                int currX;
                int i3;
                Scroller scroller = this.f600p;
                if (scroller == null) {
                    z3 = false;
                } else if (scroller.isFinished()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    if (this.f601q) {
                        currX = this.f600p.getCurrX();
                    } else {
                        currX = this.f600p.getStartX();
                    }
                    this.f600p.abortAnimation();
                    m409b(false);
                    i3 = currX;
                } else {
                    i3 = getScrollX();
                }
                int scrollY = getScrollY();
                max -= i3;
                int i4 = -scrollY;
                if (max == 0 && i4 == 0) {
                    m406a(false);
                    mo1063b();
                    mo1064b(0);
                } else {
                    m409b(true);
                    mo1064b(2);
                    currX = m412d();
                    float f = (float) currX;
                    float f2 = (float) (currX / 2);
                    f2 += ((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(max)) / f) - 8.0f) * 0.47123894f))) * f2;
                    int abs = Math.abs(i2);
                    if (abs > 0) {
                        currX = Math.round(Math.abs(f2 / ((float) abs)) * 1000.0f) << 2;
                    } else {
                        currX = (int) (((((float) Math.abs(max)) / ((this.f590d.getPageWidth(this.f591e) * f) + 0.0f)) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(currX, 600);
                    this.f601q = false;
                    this.f600p.startScroll(i3, scrollY, max, i4, min);
                    C0315jm.m4601A(this);
                }
            }
            if (z2) {
                m410c();
                return;
            }
            return;
        }
        if (z2) {
            m410c();
        }
        m406a(false);
        scrollTo(max, 0);
        m420j();
    }

    /* renamed from: a */
    public final void mo1055a(int i) {
        this.f596j = false;
        mo1057a(i, this.f597k ^ 1, false);
    }

    /* renamed from: a */
    public final void mo1056a(int i, boolean z) {
        this.f596j = false;
        mo1057a(i, z, false);
    }

    /* renamed from: a */
    public final void mo1057a(int i, boolean z, boolean z2) {
        m404a(i, z, z2, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0060  */
    /* renamed from: a */
    private final void m404a(int r6, boolean r7, boolean r8, int r9) {
        /*
        r5 = this;
        r3 = 1;
        r1 = 0;
        r0 = r5.f590d;
        if (r0 == 0) goto L_0x000c;
    L_0x0006:
        r0 = r0.getCount();
        if (r0 > 0) goto L_0x0010;
    L_0x000c:
        r5.m409b(r1);
    L_0x000f:
        return;
    L_0x0010:
        if (r8 != 0) goto L_0x0022;
    L_0x0012:
        r0 = r5.f591e;
        if (r0 != r6) goto L_0x0022;
    L_0x0016:
        r0 = r5.f589c;
        r0 = r0.size();
        if (r0 == 0) goto L_0x0022;
    L_0x001e:
        r5.m409b(r1);
        goto L_0x000f;
    L_0x0022:
        if (r6 < 0) goto L_0x0074;
    L_0x0024:
        r0 = r5.f590d;
        r0 = r0.getCount();
        if (r6 < r0) goto L_0x0034;
    L_0x002c:
        r0 = r5.f590d;
        r0 = r0.getCount();
        r6 = r0 + -1;
    L_0x0034:
        r0 = r5.f607w;
        r2 = r5.f591e;
        r4 = r2 + r0;
        if (r6 > r4) goto L_0x0072;
    L_0x003c:
        r0 = r2 - r0;
        if (r6 >= r0) goto L_0x0057;
    L_0x0040:
        r2 = r1;
    L_0x0041:
        r0 = r5.f589c;
        r0 = r0.size();
        if (r2 >= r0) goto L_0x0057;
    L_0x0049:
        r0 = r5.f589c;
        r0 = r0.get(r2);
        r0 = (p000.C0321ju) r0;
        r0.f8347c = r3;
        r0 = r2 + 1;
        r2 = r0;
        goto L_0x0041;
    L_0x0057:
        r0 = r5.f591e;
        if (r0 == r6) goto L_0x005c;
    L_0x005b:
        r1 = r3;
    L_0x005c:
        r0 = r5.f597k;
        if (r0 == 0) goto L_0x006b;
    L_0x0060:
        r5.f591e = r6;
        if (r1 == 0) goto L_0x0067;
    L_0x0064:
        r5.m410c();
    L_0x0067:
        r5.requestLayout();
        goto L_0x000f;
    L_0x006b:
        r5.m415e(r6);
        r5.m403a(r6, r7, r9, r1);
        goto L_0x000f;
    L_0x0072:
        r2 = r1;
        goto L_0x0041;
    L_0x0074:
        r6 = r1;
        goto L_0x0034;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.a(int, boolean, boolean, int):void");
    }

    /* renamed from: a */
    public final void mo1059a(C0324jy c0324jy) {
        C0324jy c0324jy2 = this.f582R;
        this.f582R = c0324jy;
        setChildrenDrawingOrderEnabled(true);
        this.f584T = 2;
        this.f583S = 2;
        if (c0324jy2 == null) {
            mo1063b();
        }
    }

    /* renamed from: b */
    public final void mo1064b(int i) {
        int i2 = 0;
        if (this.f587aa != i) {
            int i3;
            this.f587aa = i;
            if (this.f582R != null) {
                int childCount = getChildCount();
                for (i3 = 0; i3 < childCount; i3++) {
                    int i4;
                    if (i != 0) {
                        i4 = this.f583S;
                    } else {
                        i4 = 0;
                    }
                    getChildAt(i3).setLayerType(i4, null);
                }
            }
            List list = this.f581Q;
            if (list != null) {
                i3 = list.size();
                while (i2 < i3) {
                    C0323jx c0323jx = (C0323jx) this.f581Q.get(i2);
                    if (c0323jx != null) {
                        c0323jx.mo9587a(i);
                    }
                    i2++;
                }
            }
        }
    }

    /* renamed from: b */
    private final void m409b(boolean z) {
        if (this.f606v != z) {
            this.f606v = z;
        }
    }

    /* renamed from: m */
    private final void m423m() {
        if (this.f584T != 0) {
            ArrayList arrayList = this.f585U;
            if (arrayList == null) {
                this.f585U = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f585U.add(getChildAt(i));
            }
            Collections.sort(this.f585U, f561V);
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == null;
    }
}
