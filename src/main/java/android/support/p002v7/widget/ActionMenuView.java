package android.support.p002v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.support.p002v7.view.menu.ActionMenuItemView;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import p000.C0407or;
import p000.C0412pg;
import p000.C0426qf;
import p000.C0486sy;
import p000.C0549vx;
import p000.C0734op;
import p000.C0736ot;
import p000.C0749qg;
import p000.C0836py;
import p000.kvl;

/* compiled from: PG */
/* renamed from: android.support.v7.widget.ActionMenuView */
public class ActionMenuView extends C0486sy implements C0407or, C0412pg {
    /* renamed from: a */
    public C0734op f10580a;
    /* renamed from: b */
    public boolean f10581b;
    /* renamed from: c */
    public C0836py f10582c;
    /* renamed from: h */
    private int f10583h;
    /* renamed from: i */
    private boolean f10584i;
    /* renamed from: j */
    private int f10585j;
    /* renamed from: k */
    private int f10586k;
    /* renamed from: l */
    private int f10587l;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9748d = false;
        float f = context.getResources().getDisplayMetrics().density;
        this.f10586k = (int) (56.0f * f);
        this.f10587l = (int) (f * 4.0f);
        this.f10583h = 0;
    }

    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof C0749qg);
    }

    /* renamed from: a */
    public final void mo12131a() {
        C0836py c0836py = this.f10582c;
        if (c0836py != null) {
            c0836py.mo15280b();
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* renamed from: b */
    public static C0749qg m6876b() {
        C0749qg c0749qg = new C0749qg();
        c0749qg.f9761h = 16;
        return c0749qg;
    }

    /* renamed from: b */
    private final C0749qg m6877b(AttributeSet attributeSet) {
        return new C0749qg(getContext(), attributeSet);
    }

    /* renamed from: a */
    public static C0749qg m6875a(LayoutParams layoutParams) {
        if (layoutParams == null) {
            return ActionMenuView.m6876b();
        }
        C0749qg c0749qg;
        if (layoutParams instanceof C0749qg) {
            c0749qg = new C0749qg((C0749qg) layoutParams);
        } else {
            c0749qg = new C0749qg(layoutParams);
        }
        if (c0749qg.f9761h > 0) {
            return c0749qg;
        }
        c0749qg.f9761h = 16;
        return c0749qg;
    }

    /* renamed from: d */
    private final boolean m6878d(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0426qf)) {
            z = ((C0426qf) childAt).mo10890d();
        }
        if (i <= 0 || !(childAt2 instanceof C0426qf)) {
            return z;
        }
        return ((C0426qf) childAt2).mo10891e() | z;
    }

    /* renamed from: a */
    public final void mo10856a(C0734op c0734op) {
        this.f10580a = c0734op;
    }

    /* renamed from: a */
    public final boolean mo10836a(C0736ot c0736ot) {
        return this.f10580a.mo14299a((MenuItem) c0736ot, null, 0);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0836py c0836py = this.f10582c;
        if (c0836py != null) {
            c0836py.mo10849a(false);
            if (this.f10582c.mo15283e()) {
                this.f10582c.mo15281c();
                this.f10582c.mo15284f();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo12131a();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f10584i) {
            int i5;
            C0749qg c0749qg;
            int i6;
            int childCount = getChildCount();
            int i7 = (i4 - i2) / 2;
            int i8 = this.f9751g;
            int i9 = i3 - i;
            int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
            boolean a = C0549vx.m6138a(this);
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i12 < childCount) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 8) {
                    i5 = i10;
                    i10 = i11;
                    i11 = paddingRight;
                } else {
                    c0749qg = (C0749qg) childAt.getLayoutParams();
                    if (c0749qg.f22246a) {
                        i11 = childAt.getMeasuredWidth();
                        if (m6878d(i12)) {
                            i11 += i8;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        if (a) {
                            i5 = c0749qg.leftMargin + getPaddingLeft();
                            i6 = i5 + i11;
                        } else {
                            i6 = (getWidth() - getPaddingRight()) - c0749qg.rightMargin;
                            i5 = i6 - i11;
                        }
                        int i13 = i7 - (measuredHeight / 2);
                        childAt.layout(i5, i13, i6, measuredHeight + i13);
                        i11 = paddingRight - i11;
                        int i14 = i10;
                        i10 = 1;
                        i5 = i14;
                    } else {
                        paddingRight -= c0749qg.rightMargin + (childAt.getMeasuredWidth() + c0749qg.leftMargin);
                        m6878d(i12);
                        i5 = i10 + 1;
                        i10 = i11;
                        i11 = paddingRight;
                    }
                }
                i12++;
                paddingRight = i11;
                i11 = i10;
                i10 = i5;
            }
            if (childCount == 1 && i11 == 0) {
                View childAt2 = getChildAt(0);
                i10 = childAt2.getMeasuredWidth();
                i11 = childAt2.getMeasuredHeight();
                paddingRight = (i9 / 2) - (i10 / 2);
                i6 = i7 - (i11 / 2);
                childAt2.layout(paddingRight, i6, i10 + paddingRight, i11 + i6);
                return;
            }
            i5 = i10 - (i11 ^ 1);
            if (i5 > 0) {
                i5 = paddingRight / i5;
            } else {
                i5 = 0;
            }
            paddingRight = Math.max(0, i5);
            View childAt3;
            if (a) {
                i10 = getWidth() - getPaddingRight();
                i11 = 0;
                while (i11 < childCount) {
                    childAt3 = getChildAt(i11);
                    c0749qg = (C0749qg) childAt3.getLayoutParams();
                    if (childAt3.getVisibility() == 8) {
                        i5 = i10;
                    } else if (c0749qg.f22246a) {
                        i5 = i10;
                    } else {
                        i10 -= c0749qg.rightMargin;
                        i12 = childAt3.getMeasuredWidth();
                        i8 = childAt3.getMeasuredHeight();
                        i9 = i7 - (i8 / 2);
                        childAt3.layout(i10 - i12, i9, i10, i8 + i9);
                        i5 = i10 - ((c0749qg.leftMargin + i12) + paddingRight);
                    }
                    i11++;
                    i10 = i5;
                }
                return;
            }
            i10 = getPaddingLeft();
            i11 = 0;
            while (i11 < childCount) {
                childAt3 = getChildAt(i11);
                c0749qg = (C0749qg) childAt3.getLayoutParams();
                if (childAt3.getVisibility() == 8) {
                    i5 = i10;
                } else if (c0749qg.f22246a) {
                    i5 = i10;
                } else {
                    i10 += c0749qg.leftMargin;
                    i12 = childAt3.getMeasuredWidth();
                    i8 = childAt3.getMeasuredHeight();
                    i9 = i7 - (i8 / 2);
                    childAt3.layout(i10, i9, i10 + i12, i8 + i9);
                    i5 = ((c0749qg.rightMargin + i12) + paddingRight) + i10;
                }
                i11++;
                i10 = i5;
            }
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    protected void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        C0749qg c0749qg;
        boolean z2 = this.f10584i;
        if (MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.f10584i = z;
        if (z2 != this.f10584i) {
            this.f10585j = 0;
        }
        int size = MeasureSpec.getSize(i);
        if (this.f10584i) {
            C0734op c0734op = this.f10580a;
            if (!(c0734op == null || size == this.f10585j)) {
                this.f10585j = size;
                c0734op.mo14314b(true);
            }
        }
        int childCount = getChildCount();
        if (!this.f10584i) {
            i3 = 0;
        } else if (childCount <= 0) {
            i3 = 0;
        } else {
            int mode = MeasureSpec.getMode(i2);
            size = MeasureSpec.getSize(i);
            int size2 = MeasureSpec.getSize(i2);
            i3 = getPaddingLeft();
            childCount = getPaddingRight();
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = ActionMenuView.getChildMeasureSpec(i2, paddingTop, -2);
            int i4 = size - (i3 + childCount);
            size = this.f10586k;
            int i5 = i4 / size;
            i3 = i4 % size;
            if (i5 == 0) {
                setMeasuredDimension(i4, 0);
                return;
            }
            int i6;
            View childAt;
            int i7;
            int makeMeasureSpec;
            int i8;
            long j;
            Object obj;
            int i9 = size + (i3 / i5);
            int childCount2 = getChildCount();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            i3 = 0;
            int i13 = 0;
            long j2 = 0;
            size = 0;
            while (true) {
                i6 = size;
                if (i6 >= childCount2) {
                    break;
                }
                int i14;
                long j3;
                childAt = getChildAt(i6);
                if (childAt.getVisibility() != 8) {
                    ActionMenuItemView actionMenuItemView;
                    Object obj2;
                    boolean z3;
                    boolean z4 = childAt instanceof ActionMenuItemView;
                    i7 = i3 + 1;
                    if (z4) {
                        size = this.f10587l;
                        childAt.setPadding(size, 0, size, 0);
                    }
                    c0749qg = (C0749qg) childAt.getLayoutParams();
                    c0749qg.f22251f = false;
                    c0749qg.f22248c = 0;
                    c0749qg.f22247b = 0;
                    c0749qg.f22249d = false;
                    c0749qg.leftMargin = 0;
                    c0749qg.rightMargin = 0;
                    if (!z4) {
                        z2 = false;
                    } else if (((ActionMenuItemView) childAt).mo12083c()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c0749qg.f22250e = z2;
                    if (c0749qg.f22246a) {
                        i14 = 1;
                    } else {
                        i14 = i5;
                    }
                    C0749qg c0749qg2 = (C0749qg) childAt.getLayoutParams();
                    makeMeasureSpec = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(childMeasureSpec) - paddingTop, MeasureSpec.getMode(childMeasureSpec));
                    if (z4) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView == null) {
                        obj2 = null;
                    } else if (actionMenuItemView.mo12083c()) {
                        obj2 = 1;
                    } else {
                        obj2 = null;
                    }
                    if (i14 <= 0) {
                        i8 = 0;
                    } else if (obj2 == null || i14 >= 2) {
                        childAt.measure(MeasureSpec.makeMeasureSpec(i9 * i14, kvl.UNSET_ENUM_VALUE), makeMeasureSpec);
                        i14 = childAt.getMeasuredWidth();
                        i8 = i14 / i9;
                        if (i14 % i9 != 0) {
                            i8++;
                        }
                        if (obj2 != null && i8 < 2) {
                            i8 = 2;
                        }
                    } else {
                        i8 = 0;
                    }
                    if (c0749qg2.f22246a) {
                        z3 = false;
                    } else if (obj2 != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c0749qg2.f22249d = z3;
                    c0749qg2.f22247b = i8;
                    childAt.measure(MeasureSpec.makeMeasureSpec(i8 * i9, 1073741824), makeMeasureSpec);
                    i14 = Math.max(i11, i8);
                    if (c0749qg.f22249d) {
                        i3 = i12 + 1;
                    } else {
                        i3 = i12;
                    }
                    if (c0749qg.f22246a) {
                        size = 1;
                    } else {
                        size = i13;
                    }
                    i12 = i5 - i8;
                    i5 = Math.max(i10, childAt.getMeasuredHeight());
                    if (i8 == 1) {
                        j3 = ((long) (1 << i6)) | j2;
                        i13 = i12;
                        i12 = i3;
                        i3 = i7;
                    } else {
                        j3 = j2;
                        i13 = i12;
                        i12 = i3;
                        i3 = i7;
                    }
                } else {
                    size = i13;
                    j3 = j2;
                    i14 = i11;
                    i13 = i5;
                    i5 = i10;
                }
                i6++;
                j2 = j3;
                i11 = i14;
                i10 = i5;
                i5 = i13;
            }
            Object obj3 = i13 != 0 ? i3 == 2 ? 1 : null : null;
            long j4 = j2;
            paddingTop = i5;
            Object obj4 = null;
            while (i12 > 0) {
                if (paddingTop <= 0) {
                    j = j4;
                    break;
                }
                int i15 = LfuScheduler.MAX_PRIORITY;
                i8 = 0;
                size = 0;
                j = 0;
                while (true) {
                    makeMeasureSpec = size;
                    if (makeMeasureSpec >= childCount2) {
                        break;
                    }
                    c0749qg = (C0749qg) getChildAt(makeMeasureSpec).getLayoutParams();
                    if (c0749qg.f22249d) {
                        i7 = c0749qg.f22247b;
                        if (i7 < i15) {
                            j = 1 << makeMeasureSpec;
                            size = 1;
                            i8 = i7;
                        } else if (i7 == i15) {
                            j |= 1 << makeMeasureSpec;
                            size = i8 + 1;
                            i8 = i15;
                        } else {
                            size = i8;
                            i8 = i15;
                        }
                    } else {
                        size = i8;
                        i8 = i15;
                    }
                    makeMeasureSpec++;
                    i15 = i8;
                }
                j4 |= j;
                if (i8 > paddingTop) {
                    j = j4;
                    break;
                }
                makeMeasureSpec = i15 + 1;
                j2 = j4;
                i7 = 0;
                i8 = paddingTop;
                while (i7 < childCount2) {
                    View childAt2 = getChildAt(i7);
                    c0749qg = (C0749qg) childAt2.getLayoutParams();
                    long j5 = (long) (1 << i7);
                    if ((j & j5) != 0) {
                        if (obj3 != null && c0749qg.f22250e && i8 == 1) {
                            i6 = this.f10587l;
                            childAt2.setPadding(i6 + i9, 0, i6, 0);
                        }
                        c0749qg.f22247b++;
                        c0749qg.f22251f = true;
                        size = i8 - 1;
                    } else if (c0749qg.f22247b == makeMeasureSpec) {
                        j2 |= j5;
                        size = i8;
                    } else {
                        size = i8;
                    }
                    i7++;
                    i8 = size;
                }
                j4 = j2;
                paddingTop = i8;
                int obj42 = 1;
            }
            j = j4;
            if (i13 != 0) {
                obj = null;
            } else if (i3 == 1) {
                obj = 1;
            } else {
                obj = null;
            }
            if (paddingTop <= 0) {
                obj3 = obj42;
            } else if (j == 0) {
                obj3 = obj42;
            } else if (paddingTop < i3 - 1 || obj != null || i11 > 1) {
                float f;
                float bitCount = (float) Long.bitCount(j);
                if (obj == null) {
                    if (!((1 & j) == 0 || ((C0749qg) getChildAt(0).getLayoutParams()).f22250e)) {
                        bitCount -= 8.0f;
                    }
                    size = childCount2 - 1;
                    f = (((long) (1 << size)) & j) != 0 ? !((C0749qg) getChildAt(size).getLayoutParams()).f22250e ? -0.5f + bitCount : bitCount : bitCount;
                } else {
                    f = bitCount;
                }
                if (f > 0.0f) {
                    i3 = (int) (((float) (paddingTop * i9)) / f);
                } else {
                    i3 = 0;
                }
                i8 = 0;
                obj3 = obj42;
                while (i8 < childCount2) {
                    if ((((long) (1 << i8)) & j) == 0) {
                        obj = obj3;
                    } else {
                        View childAt3 = getChildAt(i8);
                        c0749qg = (C0749qg) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            c0749qg.f22248c = i3;
                            c0749qg.f22251f = true;
                            if (i8 != 0) {
                                obj = 1;
                            } else if (c0749qg.f22250e) {
                                obj = 1;
                            } else {
                                c0749qg.leftMargin = (-i3) / 2;
                                obj = 1;
                            }
                        } else if (c0749qg.f22246a) {
                            c0749qg.f22248c = i3;
                            c0749qg.f22251f = true;
                            c0749qg.rightMargin = (-i3) / 2;
                            obj = 1;
                        } else {
                            if (i8 != 0) {
                                c0749qg.leftMargin = i3 / 2;
                            }
                            if (i8 != childCount2 - 1) {
                                c0749qg.rightMargin = i3 / 2;
                                obj = obj3;
                            } else {
                                obj = obj3;
                            }
                        }
                    }
                    i8++;
                    obj3 = obj;
                }
            } else {
                obj3 = obj42;
            }
            if (obj3 != null) {
                size = 0;
                while (true) {
                    i3 = size;
                    if (i3 >= childCount2) {
                        break;
                    }
                    childAt = getChildAt(i3);
                    c0749qg = (C0749qg) childAt.getLayoutParams();
                    if (c0749qg.f22251f) {
                        childAt.measure(MeasureSpec.makeMeasureSpec(c0749qg.f22248c + (c0749qg.f22247b * i9), 1073741824), childMeasureSpec);
                    }
                    size = i3 + 1;
                }
            }
            if (mode == 1073741824) {
                i10 = size2;
            }
            setMeasuredDimension(i4, i10);
            return;
        }
        while (i3 < childCount) {
            c0749qg = (C0749qg) getChildAt(i3).getLayoutParams();
            c0749qg.rightMargin = 0;
            c0749qg.leftMargin = 0;
            i3++;
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: a */
    public final void mo12132a(int i) {
        if (this.f10583h != i) {
            this.f10583h = i;
            if (i == 0) {
                getContext();
            } else {
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    /* renamed from: a */
    public final void mo12133a(C0836py c0836py) {
        this.f10582c = c0836py;
        C0836py c0836py2 = this.f10582c;
        c0836py2.f22160e = this;
        this.f10580a = c0836py2.f22158c;
    }
}
