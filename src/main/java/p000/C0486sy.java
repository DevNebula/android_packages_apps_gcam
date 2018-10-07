package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* renamed from: sy */
public class C0486sy extends ViewGroup {
    /* renamed from: a */
    private int f9745a;
    /* renamed from: b */
    private int f9746b;
    /* renamed from: c */
    private int f9747c;
    /* renamed from: d */
    public boolean f9748d;
    /* renamed from: e */
    public int f9749e;
    /* renamed from: f */
    public Drawable f9750f;
    /* renamed from: g */
    public int f9751g;
    /* renamed from: h */
    private int f9752h;
    /* renamed from: i */
    private float f9753i;
    /* renamed from: j */
    private boolean f9754j;
    /* renamed from: k */
    private int[] f9755k;
    /* renamed from: l */
    private int[] f9756l;
    /* renamed from: m */
    private int f9757m;
    /* renamed from: n */
    private int f9758n;
    /* renamed from: o */
    private int f9759o;

    public C0486sy(Context context) {
        this(context, null);
    }

    public C0486sy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0486sy(Context context, AttributeSet attributeSet, int i) {
        boolean z = true;
        super(context, attributeSet, i);
        this.f9748d = true;
        this.f9745a = -1;
        this.f9746b = 0;
        this.f9749e = 8388659;
        C0540vk a = C0540vk.m6109a(context, attributeSet, C0382ni.f9276aI, i, 0);
        int d = a.mo11393d(C0382ni.f9283aP, -1);
        if (d >= 0) {
            mo11122c(d);
        }
        d = a.mo11393d(C0382ni.f9282aO, -1);
        if (d >= 0 && this.f9749e != d) {
            if ((8388615 & d) == 0) {
                d |= 8388611;
            }
            if ((d & 112) == 0) {
                d |= 48;
            }
            this.f9749e = d;
            requestLayout();
        }
        boolean a2 = a.mo11388a(C0382ni.f9280aM, true);
        if (!a2) {
            this.f9748d = a2;
        }
        this.f9753i = a.f9927b.getFloat(4, -1.0f);
        this.f9745a = a.mo11393d(C0382ni.f9281aN, -1);
        this.f9754j = a.mo11388a(C0382ni.f9286aS, false);
        Drawable b = a.mo11390b(C0382ni.f9284aQ);
        if (b != this.f9750f) {
            this.f9750f = b;
            if (b != null) {
                this.f9751g = b.getIntrinsicWidth();
                this.f9757m = b.getIntrinsicHeight();
            } else {
                this.f9751g = 0;
                this.f9757m = 0;
            }
            if (b != null) {
                z = false;
            }
            setWillNotDraw(z);
            requestLayout();
        }
        this.f9758n = a.mo11393d(C0382ni.f9287aT, 0);
        this.f9759o = a.mo11391c(C0382ni.f9285aR, 0);
        a.f9927b.recycle();
    }

    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0487sz;
    }

    /* renamed from: a */
    private final void m5882a(Canvas canvas, int i) {
        this.f9750f.setBounds(getPaddingLeft() + this.f9759o, i, (getWidth() - getPaddingRight()) - this.f9759o, this.f9757m + i);
        this.f9750f.draw(canvas);
    }

    /* renamed from: b */
    private final void m5884b(Canvas canvas, int i) {
        this.f9750f.setBounds(i, getPaddingTop() + this.f9759o, this.f9751g + i, (getHeight() - getPaddingBottom()) - this.f9759o);
        this.f9750f.draw(canvas);
    }

    /* renamed from: c */
    public C0487sz generateDefaultLayoutParams() {
        int i = this.f9747c;
        if (i == 0) {
            return new C0487sz(-2);
        }
        return i == 1 ? new C0487sz(-1) : null;
    }

    /* renamed from: a */
    public C0487sz generateLayoutParams(AttributeSet attributeSet) {
        return new C0487sz(getContext(), attributeSet);
    }

    /* renamed from: b */
    public C0487sz generateLayoutParams(LayoutParams layoutParams) {
        return new C0487sz(layoutParams);
    }

    public int getBaseline() {
        if (this.f9745a < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i = this.f9745a;
        if (childCount <= i) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i);
        int baseline = childAt.getBaseline();
        if (baseline != -1) {
            int i2 = this.f9746b;
            if (this.f9747c == 1) {
                childCount = this.f9749e & 112;
                if (childCount != 48) {
                    switch (childCount) {
                        case 16:
                            childCount = i2 + (((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f9752h) / 2);
                            break;
                        case 80:
                            childCount = ((getBottom() - getTop()) - getPaddingBottom()) - this.f9752h;
                            break;
                        default:
                            childCount = i2;
                            break;
                    }
                }
                childCount = i2;
            } else {
                childCount = i2;
            }
            return (((C0487sz) childAt.getLayoutParams()).topMargin + childCount) + baseline;
        } else if (this.f9745a == 0) {
            return -1;
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
    }

    /* renamed from: b */
    public final boolean mo11120b(int i) {
        if (i == 0) {
            return this.f9758n & 1;
        }
        if (i == getChildCount()) {
            if ((this.f9758n & 4) == 0) {
                return false;
            }
            return true;
        } else if ((this.f9758n & 2) == 0) {
            return false;
        } else {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    private final void m5883a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    protected void onDraw(Canvas canvas) {
        if (this.f9750f != null) {
            int childCount;
            int i;
            View childAt;
            int height;
            C0487sz c0487sz;
            if (this.f9747c == 1) {
                childCount = getChildCount();
                i = 0;
                while (i < childCount) {
                    View childAt2 = getChildAt(i);
                    if (!(childAt2 == null || childAt2.getVisibility() == 8 || !mo11120b(i))) {
                        m5882a(canvas, (childAt2.getTop() - ((C0487sz) childAt2.getLayoutParams()).topMargin) - this.f9757m);
                    }
                    i++;
                }
                if (mo11120b(childCount)) {
                    childAt = getChildAt(childCount - 1);
                    if (childAt == null) {
                        height = (getHeight() - getPaddingBottom()) - this.f9757m;
                    } else {
                        c0487sz = (C0487sz) childAt.getLayoutParams();
                        height = c0487sz.bottomMargin + childAt.getBottom();
                    }
                    m5882a(canvas, height);
                    return;
                }
                return;
            }
            childCount = getChildCount();
            boolean a = C0549vx.m6138a(this);
            i = 0;
            while (i < childCount) {
                View childAt3 = getChildAt(i);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !mo11120b(i))) {
                    c0487sz = (C0487sz) childAt3.getLayoutParams();
                    if (a) {
                        height = c0487sz.rightMargin + childAt3.getRight();
                    } else {
                        height = (childAt3.getLeft() - c0487sz.leftMargin) - this.f9751g;
                    }
                    m5884b(canvas, height);
                }
                i++;
            }
            if (mo11120b(childCount)) {
                childAt = getChildAt(childCount - 1);
                if (childAt != null) {
                    c0487sz = (C0487sz) childAt.getLayoutParams();
                    if (a) {
                        height = (childAt.getLeft() - c0487sz.leftMargin) - this.f9751g;
                    } else {
                        height = c0487sz.rightMargin + childAt.getRight();
                    }
                } else if (a) {
                    height = getPaddingLeft();
                } else {
                    height = (getWidth() - getPaddingRight()) - this.f9751g;
                }
                m5884b(canvas, height);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C0486sy.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C0486sy.class.getName());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int paddingRight;
        int paddingRight2;
        int childCount;
        int i6;
        int i7;
        int i8;
        int measuredWidth;
        int measuredHeight;
        C0487sz c0487sz;
        int i9;
        if (this.f9747c == 1) {
            paddingLeft = getPaddingLeft();
            i5 = i3 - i;
            paddingRight = i5 - getPaddingRight();
            paddingRight2 = (i5 - paddingLeft) - getPaddingRight();
            childCount = getChildCount();
            i5 = this.f9749e;
            i6 = i5 & 8388615;
            switch (i5 & 112) {
                case 16:
                    i5 = getPaddingTop() + (((i4 - i2) - this.f9752h) / 2);
                    break;
                case 80:
                    i5 = ((getPaddingTop() + i4) - i2) - this.f9752h;
                    break;
                default:
                    i5 = getPaddingTop();
                    break;
            }
            i7 = 0;
            i8 = i5;
            while (i7 < childCount) {
                View childAt = getChildAt(i7);
                if (childAt == null) {
                    i5 = i8;
                } else if (childAt.getVisibility() != 8) {
                    measuredWidth = childAt.getMeasuredWidth();
                    measuredHeight = childAt.getMeasuredHeight();
                    c0487sz = (C0487sz) childAt.getLayoutParams();
                    i9 = c0487sz.f9761h;
                    if (i9 < 0) {
                        i9 = i6;
                    }
                    switch (Gravity.getAbsoluteGravity(i9, C0315jm.m4635j(this)) & 7) {
                        case 1:
                            i9 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + c0487sz.leftMargin) - c0487sz.rightMargin;
                            break;
                        case 5:
                            i9 = (paddingRight - measuredWidth) - c0487sz.rightMargin;
                            break;
                        default:
                            i9 = c0487sz.leftMargin + paddingLeft;
                            break;
                    }
                    if (mo11120b(i7)) {
                        i8 += this.f9757m;
                    }
                    i8 += c0487sz.topMargin;
                    C0486sy.m5885b(childAt, i9, i8, measuredWidth, measuredHeight);
                    i5 = (c0487sz.bottomMargin + measuredHeight) + i8;
                } else {
                    i5 = i8;
                }
                i7++;
                i8 = i5;
            }
            return;
        }
        boolean a = C0549vx.m6138a(this);
        paddingLeft = getPaddingTop();
        i8 = i4 - i2;
        int paddingBottom = i8 - getPaddingBottom();
        measuredWidth = (i8 - paddingLeft) - getPaddingBottom();
        measuredHeight = getChildCount();
        i8 = this.f9749e;
        paddingRight2 = i8 & 112;
        boolean z2 = this.f9748d;
        int[] iArr = this.f9755k;
        int[] iArr2 = this.f9756l;
        switch (Gravity.getAbsoluteGravity(i8 & 8388615, C0315jm.m4635j(this))) {
            case 1:
                i6 = getPaddingLeft() + (((i3 - i) - this.f9752h) / 2);
                break;
            case 5:
                i6 = ((getPaddingLeft() + i3) - i) - this.f9752h;
                break;
            default:
                i6 = getPaddingLeft();
                break;
        }
        if (a) {
            i9 = measuredHeight - 1;
            i8 = -1;
        } else {
            i9 = 0;
            i8 = 1;
        }
        childCount = 0;
        while (childCount < measuredHeight) {
            int i10 = i9 + (i8 * childCount);
            View childAt2 = getChildAt(i10);
            if (childAt2 == null) {
                i5 = i6;
            } else if (childAt2.getVisibility() != 8) {
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                c0487sz = (C0487sz) childAt2.getLayoutParams();
                if (!z2) {
                    i7 = -1;
                } else if (c0487sz.height != -1) {
                    i7 = childAt2.getBaseline();
                } else {
                    i7 = -1;
                }
                paddingRight = c0487sz.f9761h;
                if (paddingRight < 0) {
                    paddingRight = paddingRight2;
                }
                switch (paddingRight & 112) {
                    case 16:
                        i7 = ((((measuredWidth - measuredHeight2) / 2) + paddingLeft) + c0487sz.topMargin) - c0487sz.bottomMargin;
                        break;
                    case 48:
                        paddingRight = c0487sz.topMargin + paddingLeft;
                        if (i7 == -1) {
                            i7 = paddingRight;
                            break;
                        } else {
                            i7 = (iArr[1] - i7) + paddingRight;
                            break;
                        }
                    case 80:
                        paddingRight = (paddingBottom - measuredHeight2) - c0487sz.bottomMargin;
                        if (i7 == -1) {
                            i7 = paddingRight;
                            break;
                        }
                        i7 = paddingRight - (iArr2[2] - (childAt2.getMeasuredHeight() - i7));
                        break;
                    default:
                        i7 = paddingLeft;
                        break;
                }
                if (mo11120b(i10)) {
                    i6 += this.f9751g;
                }
                i6 += c0487sz.leftMargin;
                C0486sy.m5885b(childAt2, i6, i7, measuredWidth2, measuredHeight2);
                i5 = (c0487sz.rightMargin + measuredWidth2) + i6;
            } else {
                i5 = i6;
            }
            childCount++;
            i6 = i5;
        }
    }

    public void onMeasure(int i, int i2) {
        int childCount;
        int mode;
        int mode2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        Object obj;
        Object obj2;
        int i7;
        int i8;
        int i9;
        View childAt;
        Object obj3;
        float f2;
        Object obj4;
        int i10;
        int i11;
        Object obj5;
        C0487sz c0487sz;
        float f3;
        int i12;
        Object obj6;
        int i13;
        int i14;
        int i15;
        int max;
        int combineMeasuredStates;
        Object obj7;
        int i16;
        Object obj8;
        View childAt2;
        C0487sz c0487sz2;
        int resolveSizeAndState;
        float f4;
        if (this.f9747c == 1) {
            this.f9752h = 0;
            childCount = getChildCount();
            mode = MeasureSpec.getMode(i);
            mode2 = MeasureSpec.getMode(i2);
            i3 = this.f9745a;
            boolean z = this.f9754j;
            i4 = 0;
            int i17 = 0;
            i5 = 0;
            i6 = 0;
            Object obj9 = 1;
            f = 0.0f;
            obj = null;
            obj2 = null;
            i7 = 0;
            i8 = 0;
            while (true) {
                i9 = i8;
                Object obj10;
                if (i9 < childCount) {
                    childAt = getChildAt(i9);
                    if (childAt == null) {
                        i8 = i7;
                        obj3 = obj2;
                        f2 = f;
                        obj4 = obj9;
                        i10 = i17;
                        i11 = i4;
                        obj5 = obj;
                    } else if (childAt.getVisibility() == 8) {
                        i8 = i7;
                        obj3 = obj2;
                        f2 = f;
                        obj4 = obj9;
                        i10 = i17;
                        i11 = i4;
                        obj5 = obj;
                    } else {
                        if (mo11120b(i9)) {
                            this.f9752h += this.f9757m;
                        }
                        c0487sz = (C0487sz) childAt.getLayoutParams();
                        f3 = c0487sz.f9760g;
                        float f5 = f + f3;
                        if (mode2 == 1073741824 && c0487sz.height == 0 && f3 > 0.0f) {
                            i8 = this.f9752h;
                            this.f9752h = Math.max(i8, (c0487sz.topMargin + i8) + c0487sz.bottomMargin);
                            i12 = i7;
                            obj6 = 1;
                        } else {
                            if (c0487sz.height != 0) {
                                i13 = Integer.MIN_VALUE;
                            } else if (f3 > 0.0f) {
                                c0487sz.height = -2;
                                i13 = 0;
                            } else {
                                i13 = Integer.MIN_VALUE;
                            }
                            if (f5 == 0.0f) {
                                i10 = this.f9752h;
                            } else {
                                i10 = 0;
                            }
                            m5883a(childAt, i, 0, i2, i10);
                            if (i13 != Integer.MIN_VALUE) {
                                c0487sz.height = i13;
                            }
                            i8 = childAt.getMeasuredHeight();
                            i14 = this.f9752h;
                            this.f9752h = Math.max(i14, ((i14 + i8) + c0487sz.topMargin) + c0487sz.bottomMargin);
                            if (z) {
                                i12 = Math.max(i8, i7);
                                obj6 = obj2;
                            } else {
                                i12 = i7;
                                obj6 = obj2;
                            }
                        }
                        if (i3 >= 0 && i3 == i9 + 1) {
                            this.f9746b = this.f9752h;
                        }
                        if (i9 >= i3 || c0487sz.f9760g <= 0.0f) {
                            Object obj11;
                            if (mode == 1073741824) {
                                obj10 = obj;
                                obj11 = null;
                            } else if (c0487sz.width == -1) {
                                obj10 = 1;
                                obj11 = 1;
                            } else {
                                obj10 = obj;
                                obj11 = null;
                            }
                            i15 = c0487sz.leftMargin + c0487sz.rightMargin;
                            i14 = childAt.getMeasuredWidth() + i15;
                            max = Math.max(i4, i14);
                            combineMeasuredStates = View.combineMeasuredStates(i17, childAt.getMeasuredState());
                            if (obj9 == null) {
                                obj7 = null;
                            } else if (c0487sz.width == -1) {
                                obj7 = 1;
                            } else {
                                obj7 = null;
                            }
                            if (c0487sz.f9760g > 0.0f) {
                                if (obj11 == null) {
                                    i16 = i14;
                                } else {
                                    i16 = i15;
                                }
                                i16 = Math.max(i6, i16);
                                i14 = i5;
                            } else {
                                if (obj11 != null) {
                                    i14 = i15;
                                }
                                i14 = Math.max(i5, i14);
                                i16 = i6;
                            }
                            f2 = f5;
                            i6 = i16;
                            i5 = i14;
                            i11 = max;
                            obj3 = obj6;
                            obj5 = obj10;
                            i10 = combineMeasuredStates;
                            obj8 = obj7;
                            i8 = i12;
                            obj4 = obj8;
                        } else {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                    }
                    i7 = i9 + 1;
                    i9 = i7;
                    obj2 = obj3;
                    obj = obj5;
                    obj9 = obj4;
                    i17 = i10;
                    i4 = i11;
                    f = f2;
                } else {
                    if (this.f9752h > 0 && mo11120b(childCount)) {
                        this.f9752h += this.f9757m;
                    }
                    if (z && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
                        this.f9752h = 0;
                        i8 = 0;
                        while (true) {
                            i16 = i8;
                            if (i16 >= childCount) {
                                break;
                            }
                            childAt2 = getChildAt(i16);
                            if (!(childAt2 == null || childAt2.getVisibility() == 8)) {
                                c0487sz2 = (C0487sz) childAt2.getLayoutParams();
                                i15 = this.f9752h;
                                this.f9752h = Math.max(i15, c0487sz2.bottomMargin + ((i15 + i7) + c0487sz2.topMargin));
                            }
                            i8 = i16 + 1;
                        }
                    }
                    this.f9752h += getPaddingTop() + getPaddingBottom();
                    resolveSizeAndState = View.resolveSizeAndState(Math.max(this.f9752h, getSuggestedMinimumHeight()), i2, 0);
                    i16 = (16777215 & resolveSizeAndState) - this.f9752h;
                    if (obj2 != null || (i16 != 0 && f > 0.0f)) {
                        f3 = this.f9753i;
                        if (f3 > 0.0f) {
                            f = f3;
                        }
                        this.f9752h = 0;
                        combineMeasuredStates = 0;
                        Object obj12 = obj9;
                        i12 = i5;
                        i10 = i17;
                        i11 = i4;
                        float f6 = f;
                        i14 = i16;
                        f4 = f6;
                        while (combineMeasuredStates < childCount) {
                            View childAt3 = getChildAt(combineMeasuredStates);
                            if (childAt3.getVisibility() != 8) {
                                c0487sz2 = (C0487sz) childAt3.getLayoutParams();
                                float f7 = c0487sz2.f9760g;
                                if (f7 > 0.0f) {
                                    i6 = (int) ((((float) i14) * f7) / f4);
                                    f7 = f4 - f7;
                                    i14 -= i6;
                                    i7 = C0486sy.getChildMeasureSpec(i, ((getPaddingLeft() + getPaddingRight()) + c0487sz2.leftMargin) + c0487sz2.rightMargin, c0487sz2.width);
                                    if (c0487sz2.height == 0 && mode2 == 1073741824) {
                                        if (i6 > 0) {
                                            i16 = i6;
                                        } else {
                                            i16 = 0;
                                        }
                                        childAt3.measure(i7, MeasureSpec.makeMeasureSpec(i16, 1073741824));
                                    } else {
                                        i16 = childAt3.getMeasuredHeight() + i6;
                                        if (i16 < 0) {
                                            i16 = 0;
                                        }
                                        childAt3.measure(i7, MeasureSpec.makeMeasureSpec(i16, 1073741824));
                                    }
                                    i10 = View.combineMeasuredStates(i10, childAt3.getMeasuredState() & -256);
                                    f4 = f7;
                                }
                                i5 = c0487sz2.rightMargin + c0487sz2.leftMargin;
                                i6 = childAt3.getMeasuredWidth() + i5;
                                i11 = Math.max(i11, i6);
                                if (mode == 1073741824) {
                                    obj10 = null;
                                } else if (c0487sz2.width == -1) {
                                    obj10 = 1;
                                } else {
                                    obj10 = null;
                                }
                                if (obj10 != null) {
                                    i6 = i5;
                                }
                                i12 = Math.max(i12, i6);
                                if (obj12 == null) {
                                    obj12 = null;
                                } else if (c0487sz2.width == -1) {
                                    obj12 = 1;
                                } else {
                                    obj12 = null;
                                }
                                i6 = this.f9752h;
                                this.f9752h = Math.max(i6, c0487sz2.bottomMargin + ((childAt3.getMeasuredHeight() + i6) + c0487sz2.topMargin));
                            }
                            f3 = f4;
                            i16 = i14;
                            obj5 = obj12;
                            i15 = i12;
                            i12 = i10;
                            combineMeasuredStates++;
                            i11 = i11;
                            i10 = i12;
                            i12 = i15;
                            obj12 = obj5;
                            i14 = i16;
                            f4 = f3;
                        }
                        this.f9752h += getPaddingTop() + getPaddingBottom();
                        obj9 = obj12;
                        i8 = i12;
                        i17 = i10;
                        i16 = i11;
                    } else {
                        i12 = Math.max(i5, i6);
                        if (!z) {
                            i8 = i12;
                            i16 = i4;
                        } else if (mode2 != 1073741824) {
                            i8 = 0;
                            while (true) {
                                i16 = i8;
                                if (i16 >= childCount) {
                                    break;
                                }
                                View childAt4 = getChildAt(i16);
                                if (!(childAt4 == null || childAt4.getVisibility() == 8 || ((C0487sz) childAt4.getLayoutParams()).f9760g <= 0.0f)) {
                                    childAt4.measure(MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(i7, 1073741824));
                                }
                                i8 = i16 + 1;
                            }
                            i8 = i12;
                            i16 = i4;
                        } else {
                            i8 = i12;
                            i16 = i4;
                        }
                    }
                    if (obj9 != null) {
                        i8 = i16;
                    } else if (mode == 1073741824) {
                        i8 = i16;
                    }
                    setMeasuredDimension(View.resolveSizeAndState(Math.max(i8 + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, i17), resolveSizeAndState);
                    if (obj != null) {
                        i14 = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                        i8 = 0;
                        while (true) {
                            i6 = i8;
                            if (i6 < childCount) {
                                childAt = getChildAt(i6);
                                if (childAt.getVisibility() != 8) {
                                    c0487sz = (C0487sz) childAt.getLayoutParams();
                                    if (c0487sz.width == -1) {
                                        i5 = c0487sz.height;
                                        c0487sz.height = childAt.getMeasuredHeight();
                                        measureChildWithMargins(childAt, i14, 0, i2, 0);
                                        c0487sz.height = i5;
                                    }
                                }
                                i8 = i6 + 1;
                            } else {
                                return;
                            }
                        }
                    }
                    return;
                }
            }
        }
        Object obj13;
        this.f9752h = 0;
        mode = getChildCount();
        mode2 = MeasureSpec.getMode(i);
        i3 = MeasureSpec.getMode(i2);
        if (this.f9755k == null || this.f9756l == null) {
            this.f9755k = new int[4];
            this.f9756l = new int[4];
        }
        int[] iArr = this.f9755k;
        int[] iArr2 = this.f9756l;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z2 = this.f9748d;
        boolean z3 = this.f9754j;
        if (mode2 == 1073741824) {
            obj13 = 1;
        } else {
            obj13 = null;
        }
        i13 = 0;
        i4 = 0;
        i7 = 0;
        i5 = 0;
        Object obj14 = 1;
        f = 0.0f;
        Object obj15 = null;
        obj = null;
        combineMeasuredStates = 0;
        i8 = 0;
        while (true) {
            childCount = i8;
            if (childCount >= mode) {
                break;
            }
            childAt = getChildAt(childCount);
            if (childAt == null) {
                i8 = combineMeasuredStates;
                obj3 = obj;
                f2 = f;
                obj4 = obj14;
                i10 = i4;
                i11 = i13;
                obj5 = obj15;
            } else if (childAt.getVisibility() == 8) {
                i8 = combineMeasuredStates;
                obj3 = obj;
                f2 = f;
                obj4 = obj14;
                i10 = i4;
                i11 = i13;
                obj5 = obj15;
            } else {
                Object obj16;
                if (mo11120b(childCount)) {
                    this.f9752h += this.f9751g;
                }
                c0487sz = (C0487sz) childAt.getLayoutParams();
                f3 = c0487sz.f9760g;
                float f8 = f + f3;
                if (mode2 == 1073741824 && c0487sz.width == 0 && f3 > 0.0f) {
                    if (obj13 != null) {
                        this.f9752h += c0487sz.leftMargin + c0487sz.rightMargin;
                    } else {
                        i8 = this.f9752h;
                        this.f9752h = Math.max(i8, (c0487sz.leftMargin + i8) + c0487sz.rightMargin);
                    }
                    if (z2) {
                        i8 = MeasureSpec.makeMeasureSpec(0, 0);
                        childAt.measure(i8, i8);
                        i12 = combineMeasuredStates;
                        obj6 = obj;
                    } else {
                        i12 = combineMeasuredStates;
                        i10 = 1;
                    }
                } else {
                    if (c0487sz.width != 0) {
                        i9 = Integer.MIN_VALUE;
                    } else if (f3 > 0.0f) {
                        c0487sz.width = -2;
                        i9 = 0;
                    } else {
                        i9 = Integer.MIN_VALUE;
                    }
                    if (f8 == 0.0f) {
                        i15 = this.f9752h;
                    } else {
                        i15 = 0;
                    }
                    m5883a(childAt, i, i15, i2, 0);
                    if (i9 != Integer.MIN_VALUE) {
                        c0487sz.width = i9;
                    }
                    i8 = childAt.getMeasuredWidth();
                    if (obj13 != null) {
                        this.f9752h += (c0487sz.leftMargin + i8) + c0487sz.rightMargin;
                    } else {
                        i14 = this.f9752h;
                        this.f9752h = Math.max(i14, ((i14 + i8) + c0487sz.leftMargin) + c0487sz.rightMargin);
                    }
                    if (z3) {
                        i12 = Math.max(i8, combineMeasuredStates);
                        obj6 = obj;
                    } else {
                        i12 = combineMeasuredStates;
                        obj6 = obj;
                    }
                }
                if (i3 == 1073741824) {
                    obj2 = obj15;
                    obj16 = null;
                } else if (c0487sz.height == -1) {
                    obj2 = 1;
                    obj16 = 1;
                } else {
                    obj2 = obj15;
                    obj16 = null;
                }
                i15 = c0487sz.topMargin + c0487sz.bottomMargin;
                i14 = childAt.getMeasuredHeight() + i15;
                max = View.combineMeasuredStates(i4, childAt.getMeasuredState());
                if (z2) {
                    i16 = childAt.getBaseline();
                    if (i16 != -1) {
                        i8 = c0487sz.f9761h;
                        if (i8 < 0) {
                            i8 = this.f9749e;
                        }
                        i8 = (((i8 & 112) >> 4) & -2) >> 1;
                        iArr[i8] = Math.max(iArr[i8], i16);
                        iArr2[i8] = Math.max(iArr2[i8], i14 - i16);
                    }
                }
                resolveSizeAndState = Math.max(i13, i14);
                if (obj14 == null) {
                    obj7 = null;
                } else if (c0487sz.height == -1) {
                    obj7 = 1;
                } else {
                    obj7 = null;
                }
                if (c0487sz.f9760g > 0.0f) {
                    if (obj16 == null) {
                        i16 = i14;
                    } else {
                        i16 = i15;
                    }
                    i16 = Math.max(i5, i16);
                    i14 = i7;
                } else {
                    if (obj16 != null) {
                        i14 = i15;
                    }
                    i14 = Math.max(i7, i14);
                    i16 = i5;
                }
                f2 = f8;
                i5 = i16;
                i7 = i14;
                i11 = resolveSizeAndState;
                obj3 = obj6;
                obj5 = obj2;
                i10 = max;
                obj8 = obj7;
                i8 = i12;
                obj4 = obj8;
            }
            combineMeasuredStates = childCount + 1;
            childCount = combineMeasuredStates;
            obj = obj3;
            obj15 = obj5;
            obj14 = obj4;
            i4 = i10;
            i13 = i11;
            f = f2;
        }
        if (this.f9752h > 0 && mo11120b(mode)) {
            this.f9752h += this.f9751g;
        }
        i8 = iArr[1];
        if (i8 == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1) {
            i10 = i13;
        } else {
            i10 = Math.max(i13, Math.max(iArr[3], Math.max(iArr[0], Math.max(i8, iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
        }
        if (z3 && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
            this.f9752h = 0;
            i8 = 0;
            while (true) {
                i16 = i8;
                if (i16 >= mode) {
                    break;
                }
                childAt2 = getChildAt(i16);
                if (!(childAt2 == null || childAt2.getVisibility() == 8)) {
                    c0487sz2 = (C0487sz) childAt2.getLayoutParams();
                    if (obj13 != null) {
                        this.f9752h = (c0487sz2.rightMargin + (c0487sz2.leftMargin + combineMeasuredStates)) + this.f9752h;
                    } else {
                        i15 = this.f9752h;
                        this.f9752h = Math.max(i15, c0487sz2.rightMargin + ((i15 + combineMeasuredStates) + c0487sz2.leftMargin));
                    }
                }
                i8 = i16 + 1;
            }
        }
        this.f9752h += getPaddingLeft() + getPaddingRight();
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(this.f9752h, getSuggestedMinimumWidth()), i, 0);
        i12 = (16777215 & resolveSizeAndState2) - this.f9752h;
        if (obj != null || (i12 != 0 && f > 0.0f)) {
            f3 = this.f9753i;
            if (f3 <= 0.0f) {
                f3 = f;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f9752h = 0;
            i10 = -1;
            max = 0;
            Object obj17 = obj14;
            i14 = i7;
            i15 = i4;
            while (true) {
                f4 = f3;
                if (max >= mode) {
                    break;
                }
                View childAt5 = getChildAt(max);
                if (!(childAt5 == null || childAt5.getVisibility() == 8)) {
                    Object obj18;
                    c0487sz2 = (C0487sz) childAt5.getLayoutParams();
                    float f9 = c0487sz2.f9760g;
                    if (f9 > 0.0f) {
                        i5 = (int) ((((float) i12) * f9) / f4);
                        f9 = f4 - f9;
                        i12 -= i5;
                        combineMeasuredStates = C0486sy.getChildMeasureSpec(i2, ((getPaddingTop() + getPaddingBottom()) + c0487sz2.topMargin) + c0487sz2.bottomMargin, c0487sz2.height);
                        if (c0487sz2.width == 0 && mode2 == 1073741824) {
                            if (i5 > 0) {
                                i16 = i5;
                            } else {
                                i16 = 0;
                            }
                            childAt5.measure(MeasureSpec.makeMeasureSpec(i16, 1073741824), combineMeasuredStates);
                        } else {
                            i16 = childAt5.getMeasuredWidth() + i5;
                            if (i16 < 0) {
                                i16 = 0;
                            }
                            childAt5.measure(MeasureSpec.makeMeasureSpec(i16, 1073741824), combineMeasuredStates);
                        }
                        i15 = View.combineMeasuredStates(i15, childAt5.getMeasuredState() & -16777216);
                        f4 = f9;
                    }
                    if (obj13 != null) {
                        this.f9752h += (childAt5.getMeasuredWidth() + c0487sz2.leftMargin) + c0487sz2.rightMargin;
                    } else {
                        i5 = this.f9752h;
                        this.f9752h = Math.max(i5, ((childAt5.getMeasuredWidth() + i5) + c0487sz2.leftMargin) + c0487sz2.rightMargin);
                    }
                    if (i3 == 1073741824) {
                        obj18 = null;
                    } else if (c0487sz2.height == -1) {
                        obj18 = 1;
                    } else {
                        obj18 = null;
                    }
                    combineMeasuredStates = c0487sz2.bottomMargin + c0487sz2.topMargin;
                    i7 = childAt5.getMeasuredHeight() + combineMeasuredStates;
                    i10 = Math.max(i10, i7);
                    if (obj18 == null) {
                        i5 = i7;
                    } else {
                        i5 = combineMeasuredStates;
                    }
                    i14 = Math.max(i14, i5);
                    if (obj17 == null) {
                        obj17 = null;
                    } else if (c0487sz2.height == -1) {
                        obj17 = 1;
                    } else {
                        obj17 = null;
                    }
                    if (z2) {
                        i5 = childAt5.getBaseline();
                        if (i5 != -1) {
                            i8 = c0487sz2.f9761h;
                            if (i8 < 0) {
                                i8 = this.f9749e;
                            }
                            i8 = (((i8 & 112) >> 4) & -2) >> 1;
                            iArr[i8] = Math.max(iArr[i8], i5);
                            iArr2[i8] = Math.max(iArr2[i8], i7 - i5);
                        }
                    }
                }
                f3 = f4;
                i16 = i14;
                i14 = i15;
                i15 = i12;
                i12 = i10;
                max++;
                obj17 = obj17;
                i10 = i12;
                i12 = i15;
                i15 = i14;
                i14 = i16;
            }
            this.f9752h += getPaddingLeft() + getPaddingRight();
            i8 = iArr[1];
            if (!(i8 == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1)) {
                i10 = Math.max(i10, Math.max(iArr[3], Math.max(iArr[0], Math.max(i8, iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
            }
            obj14 = obj17;
            i8 = i14;
            i4 = i15;
            i16 = i10;
        } else {
            i14 = Math.max(i7, i5);
            if (!z3) {
                i8 = i14;
                i16 = i10;
            } else if (mode2 != 1073741824) {
                i8 = 0;
                while (true) {
                    i16 = i8;
                    if (i16 >= mode) {
                        break;
                    }
                    View childAt6 = getChildAt(i16);
                    if (!(childAt6 == null || childAt6.getVisibility() == 8 || ((C0487sz) childAt6.getLayoutParams()).f9760g <= 0.0f)) {
                        childAt6.measure(MeasureSpec.makeMeasureSpec(combineMeasuredStates, 1073741824), MeasureSpec.makeMeasureSpec(childAt6.getMeasuredHeight(), 1073741824));
                    }
                    i8 = i16 + 1;
                }
                i8 = i14;
                i16 = i10;
            } else {
                i8 = i14;
                i16 = i10;
            }
        }
        if (obj14 != null) {
            i8 = i16;
        } else if (i3 == 1073741824) {
            i8 = i16;
        }
        setMeasuredDimension((-16777216 & i4) | resolveSizeAndState2, View.resolveSizeAndState(Math.max(i8 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), i2, i4 << 16));
        if (obj15 != null) {
            i12 = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
            i8 = 0;
            while (true) {
                i6 = i8;
                if (i6 < mode) {
                    childAt = getChildAt(i6);
                    if (childAt.getVisibility() != 8) {
                        c0487sz = (C0487sz) childAt.getLayoutParams();
                        if (c0487sz.height == -1) {
                            i5 = c0487sz.width;
                            c0487sz.width = childAt.getMeasuredWidth();
                            measureChildWithMargins(childAt, i, 0, i12, 0);
                            c0487sz.width = i5;
                        }
                    }
                    i8 = i6 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    private static void m5885b(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i + i3, i2 + i4);
    }

    /* renamed from: c */
    public final void mo11122c(int i) {
        if (this.f9747c != i) {
            this.f9747c = i;
            requestLayout();
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
