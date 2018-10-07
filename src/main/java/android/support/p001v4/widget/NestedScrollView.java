package android.support.p001v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.p003v8.renderscript.ScriptIntrinsicBLAS;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.util.List;
import p000.C0310jh;
import p000.C0311ji;
import p000.C0312jj;
import p000.C0315jm;
import p000.C0352lm;
import p000.C0712lk;
import p000.kvl;

/* compiled from: PG */
/* renamed from: android.support.v4.widget.NestedScrollView */
public class NestedScrollView extends FrameLayout implements C0311ji {
    /* renamed from: w */
    private static final C0712lk f10485w = new C0712lk();
    /* renamed from: x */
    private static final int[] f10486x = new int[]{16843130};
    /* renamed from: A */
    private float f10487A;
    /* renamed from: a */
    private long f10488a;
    /* renamed from: b */
    private final Rect f10489b;
    /* renamed from: c */
    private OverScroller f10490c;
    /* renamed from: d */
    private EdgeEffect f10491d;
    /* renamed from: e */
    private EdgeEffect f10492e;
    /* renamed from: f */
    private int f10493f;
    /* renamed from: g */
    private boolean f10494g;
    /* renamed from: h */
    private boolean f10495h;
    /* renamed from: i */
    private View f10496i;
    /* renamed from: j */
    private boolean f10497j;
    /* renamed from: k */
    private VelocityTracker f10498k;
    /* renamed from: l */
    private boolean f10499l;
    /* renamed from: m */
    private boolean f10500m;
    /* renamed from: n */
    private int f10501n;
    /* renamed from: o */
    private int f10502o;
    /* renamed from: p */
    private int f10503p;
    /* renamed from: q */
    private int f10504q;
    /* renamed from: r */
    private final int[] f10505r;
    /* renamed from: s */
    private final int[] f10506s;
    /* renamed from: t */
    private int f10507t;
    /* renamed from: u */
    private int f10508u;
    /* renamed from: v */
    private C0352lm f10509v;
    /* renamed from: y */
    private final C0312jj f10510y;
    /* renamed from: z */
    private final C0310jh f10511z;

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10489b = new Rect();
        this.f10494g = true;
        this.f10495h = false;
        this.f10496i = null;
        this.f10497j = false;
        this.f10500m = true;
        this.f10504q = -1;
        this.f10505r = new int[2];
        this.f10506s = new int[2];
        this.f10490c = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f10501n = viewConfiguration.getScaledTouchSlop();
        this.f10502o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f10503p = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f10486x, i, 0);
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        if (z != this.f10499l) {
            this.f10499l = z;
            requestLayout();
        }
        obtainStyledAttributes.recycle();
        this.f10510y = new C0312jj();
        this.f10511z = new C0310jh(this);
        setNestedScrollingEnabled(true);
        C0315jm.m4618a((View) this, f10485w);
    }

    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    public void addView(View view, LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    /* renamed from: b */
    private final boolean m6814b(int i) {
        View view;
        int scrollY;
        View findFocus = findFocus();
        if (findFocus == this) {
            view = null;
        } else {
            view = findFocus;
        }
        findFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        int height = (int) (((float) getHeight()) * 0.5f);
        if (findFocus == null || !m6810a(findFocus, height, getHeight())) {
            if (i == 33 && getScrollY() < height) {
                scrollY = getScrollY();
            } else if (i != ScriptIntrinsicBLAS.RsBlas_ctrsm) {
                scrollY = height;
            } else if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                scrollY = Math.min((layoutParams.bottomMargin + childAt.getBottom()) - ((getScrollY() + getHeight()) - getPaddingBottom()), height);
            } else {
                scrollY = height;
            }
            if (scrollY == 0) {
                return false;
            }
            if (i != ScriptIntrinsicBLAS.RsBlas_ctrsm) {
                scrollY = -scrollY;
            }
            m6818c(scrollY);
        } else {
            findFocus.getDrawingRect(this.f10489b);
            offsetDescendantRectToMyCoords(findFocus, this.f10489b);
            m6818c(m6803a(this.f10489b));
            findFocus.requestFocus(i);
        }
        if (view != null && view.isFocused() && m6809a(view)) {
            scrollY = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(scrollY);
        }
        return true;
    }

    /* renamed from: a */
    private static int m6802a(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        if (i2 + i > i3) {
            return i3 - i2;
        }
        return i;
    }

    public void computeScroll() {
        int i = 1;
        if (this.f10490c.computeScrollOffset()) {
            this.f10490c.getCurrX();
            int currY = this.f10490c.getCurrY();
            int i2 = currY - this.f10508u;
            if (m6808a(0, i2, this.f10506s, null, 1)) {
                i2 -= this.f10506s[1];
            }
            if (i2 != 0) {
                int a = mo12033a();
                int scrollY = getScrollY();
                m6806a(i2, getScrollX(), scrollY, a);
                int scrollY2 = getScrollY() - scrollY;
                if (!m6807a(0, scrollY2, 0, i2 - scrollY2, null, 1)) {
                    i2 = getOverScrollMode();
                    if (i2 != 0) {
                        if (i2 != 1) {
                            i = 0;
                        } else if (a <= 0) {
                            i = 0;
                        }
                    }
                    if (i != 0) {
                        m6817c();
                        if (currY <= 0 && scrollY > 0) {
                            this.f10491d.onAbsorb((int) this.f10490c.getCurrVelocity());
                        } else if (currY >= a && scrollY < a) {
                            this.f10492e.onAbsorb((int) this.f10490c.getCurrVelocity());
                        }
                    }
                }
            }
            this.f10508u = currY;
            C0315jm.m4601A(this);
            return;
        }
        if (m6823f(1)) {
            m6824g(1);
        }
        this.f10508u = 0;
    }

    /* renamed from: a */
    private final int m6803a(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int i;
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            i = scrollY + verticalFadingEdgeLength;
        } else {
            i = scrollY;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) {
            verticalFadingEdgeLength = i2 - verticalFadingEdgeLength;
        } else {
            verticalFadingEdgeLength = i2;
        }
        if (rect.bottom > verticalFadingEdgeLength && rect.top > i) {
            if (rect.height() > height) {
                i = rect.top - i;
            } else {
                i = rect.bottom - verticalFadingEdgeLength;
            }
            scrollY = Math.min(i, (layoutParams.bottomMargin + childAt.getBottom()) - i2);
        } else if (rect.top >= i) {
            scrollY = 0;
        } else if (rect.bottom >= verticalFadingEdgeLength) {
            scrollY = 0;
        } else {
            if (rect.height() > height) {
                scrollY = -(verticalFadingEdgeLength - rect.bottom);
            } else {
                scrollY = -(i - rect.top);
            }
            scrollY = Math.max(scrollY, -getScrollY());
        }
        return scrollY;
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (getChildCount() == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int bottom = layoutParams.bottomMargin + childAt.getBottom();
        int scrollY = getScrollY();
        height = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > height) {
            return bottom + (scrollY - height);
        }
        return bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo12035a(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f10511z.mo9420a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f10511z.mo9419a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m6808a(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: a */
    private final boolean m6808a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f10511z.mo9424a(i, i2, iArr, iArr2, i3);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return m6807a(i, i2, i3, i4, iArr, 0);
    }

    /* renamed from: a */
    private final boolean m6807a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.f10511z.mo9423a(i, i2, i3, i4, iArr, i5);
    }

    /* renamed from: c */
    private final void m6818c(int i) {
        if (i == 0) {
            return;
        }
        if (this.f10500m) {
            m6804a(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    public void draw(Canvas canvas) {
        int i = 0;
        super.draw(canvas);
        if (this.f10491d != null) {
            int width;
            int height;
            int min;
            int paddingLeft;
            int scrollY = getScrollY();
            if (!this.f10491d.isFinished()) {
                int save = canvas.save();
                width = getWidth();
                height = getHeight();
                min = Math.min(0, scrollY);
                if (getClipToPadding()) {
                    paddingLeft = width - (getPaddingLeft() + getPaddingRight());
                    width = getPaddingLeft();
                } else {
                    paddingLeft = width;
                    width = 0;
                }
                if (getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) width, (float) min);
                this.f10491d.setSize(paddingLeft, height);
                if (this.f10491d.draw(canvas)) {
                    C0315jm.m4601A(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f10492e.isFinished()) {
                height = canvas.save();
                width = getWidth();
                min = getHeight();
                paddingLeft = Math.max(mo12033a(), scrollY) + min;
                if (getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft();
                }
                if (getClipToPadding()) {
                    min -= getPaddingTop() + getPaddingBottom();
                    paddingLeft -= getPaddingBottom();
                }
                canvas.translate((float) (i - width), (float) paddingLeft);
                canvas.rotate(180.0f, (float) width, 0.0f);
                this.f10492e.setSize(width, min);
                if (this.f10492e.draw(canvas)) {
                    C0315jm.m4601A(this);
                }
                canvas.restoreToCount(height);
            }
        }
    }

    /* renamed from: b */
    private final void m6812b() {
        this.f10497j = false;
        m6821e();
        m6824g(0);
        EdgeEffect edgeEffect = this.f10491d;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f10492e.onRelease();
        }
    }

    /* renamed from: c */
    private final void m6817c() {
        if (getOverScrollMode() == 2) {
            this.f10491d = null;
            this.f10492e = null;
        } else if (this.f10491d == null) {
            Context context = getContext();
            this.f10491d = new EdgeEffect(context);
            this.f10492e = new EdgeEffect(context);
        }
    }

    /* renamed from: a */
    public final boolean mo12035a(KeyEvent keyEvent) {
        FrameLayout.LayoutParams layoutParams;
        boolean z;
        int i = 33;
        this.f10489b.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (layoutParams.bottomMargin + (childAt.getHeight() + layoutParams.topMargin) > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (z) {
            if (keyEvent.getAction() == 0) {
                switch (keyEvent.getKeyCode()) {
                    case 19:
                        if (!keyEvent.isAltPressed()) {
                            z = m6814b(33);
                            break;
                        }
                        z = m6822e(33);
                        break;
                    case 20:
                        if (!keyEvent.isAltPressed()) {
                            z = m6814b((int) ScriptIntrinsicBLAS.RsBlas_ctrsm);
                            break;
                        }
                        z = m6822e(ScriptIntrinsicBLAS.RsBlas_ctrsm);
                        break;
                    case 62:
                        Rect rect;
                        if (!keyEvent.isShiftPressed()) {
                            i = ScriptIntrinsicBLAS.RsBlas_ctrsm;
                        }
                        int height = getHeight();
                        if (i == ScriptIntrinsicBLAS.RsBlas_ctrsm) {
                            this.f10489b.top = getScrollY() + height;
                            int childCount = getChildCount();
                            if (childCount > 0) {
                                View childAt2 = getChildAt(childCount - 1);
                                layoutParams = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
                                childCount = (layoutParams.bottomMargin + childAt2.getBottom()) + getPaddingBottom();
                                Rect rect2 = this.f10489b;
                                if (rect2.top + height > childCount) {
                                    rect2.top = childCount - height;
                                }
                            }
                        } else {
                            this.f10489b.top = getScrollY() - height;
                            rect = this.f10489b;
                            if (rect.top < 0) {
                                rect.top = 0;
                            }
                        }
                        rect = this.f10489b;
                        rect.bottom = rect.top + height;
                        m6816b(i, rect.top, rect.bottom);
                        return false;
                    default:
                        z = false;
                        break;
                }
            }
            z = false;
            return z;
        } else if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        } else {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            findFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, ScriptIntrinsicBLAS.RsBlas_ctrsm);
            if (findFocus == null || findFocus == this || !findFocus.requestFocus(ScriptIntrinsicBLAS.RsBlas_ctrsm)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: d */
    private final void m6820d(int i) {
        int scrollY = getScrollY();
        boolean z = (scrollY > 0 || i > 0) ? scrollY < mo12033a() ? true : i < 0 : false;
        float f = (float) i;
        if (!dispatchNestedPreFling(0.0f, f)) {
            dispatchNestedFling(0.0f, f, z);
            if (getChildCount() > 0) {
                m6815b(2, 1);
                this.f10490c.fling(getScrollX(), getScrollY(), 0, i, 0, 0, kvl.UNSET_ENUM_VALUE, LfuScheduler.MAX_PRIORITY, 0, 0);
                this.f10508u = getScrollY();
                C0315jm.m4601A(this);
            }
        }
    }

    /* renamed from: e */
    private final boolean m6822e(int i) {
        int height = getHeight();
        Rect rect = this.f10489b;
        rect.top = 0;
        rect.bottom = height;
        if (i == ScriptIntrinsicBLAS.RsBlas_ctrsm) {
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                this.f10489b.bottom = (layoutParams.bottomMargin + childAt.getBottom()) + getPaddingBottom();
                rect = this.f10489b;
                rect.top = rect.bottom - height;
            }
        }
        rect = this.f10489b;
        return m6816b(i, rect.top, rect.bottom);
    }

    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((layoutParams.bottomMargin + childAt.getBottom()) - getScrollY()) - (getHeight() - getPaddingBottom());
        return bottom < verticalFadingEdgeLength ? ((float) bottom) / ((float) verticalFadingEdgeLength) : 1.0f;
    }

    public int getNestedScrollAxes() {
        return this.f10510y.f8242a;
    }

    /* renamed from: a */
    public final int mo12033a() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, (layoutParams.bottomMargin + (childAt.getHeight() + layoutParams.topMargin)) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        return scrollY < verticalFadingEdgeLength ? ((float) scrollY) / ((float) verticalFadingEdgeLength) : 1.0f;
    }

    public boolean hasNestedScrollingParent() {
        return m6823f(0);
    }

    /* renamed from: f */
    private final boolean m6823f(int i) {
        return this.f10511z.mo9421a(i);
    }

    /* renamed from: d */
    private final void m6819d() {
        if (this.f10498k == null) {
            this.f10498k = VelocityTracker.obtain();
        }
    }

    public boolean isNestedScrollingEnabled() {
        return this.f10511z.f8186a;
    }

    /* renamed from: a */
    private final boolean m6809a(View view) {
        return m6810a(view, 0, getHeight()) ^ 1;
    }

    /* renamed from: a */
    private static boolean m6811a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && NestedScrollView.m6811a((View) parent, view2);
    }

    /* renamed from: a */
    private final boolean m6810a(View view, int i, int i2) {
        view.getDrawingRect(this.f10489b);
        offsetDescendantRectToMyCoords(view, this.f10489b);
        return this.f10489b.bottom + i >= getScrollY() && this.f10489b.top - i <= getScrollY() + i2;
    }

    protected void measureChild(View view, int i, int i2) {
        view.measure(NestedScrollView.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), MeasureSpec.makeMeasureSpec(0, 0));
    }

    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        view.measure(NestedScrollView.getChildMeasureSpec(i, (((getPaddingLeft() + getPaddingRight()) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) + i2, marginLayoutParams.width), MeasureSpec.makeMeasureSpec(marginLayoutParams.bottomMargin + marginLayoutParams.topMargin, 0));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10495h = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0) {
            switch (motionEvent.getAction()) {
                case 8:
                    if (!this.f10497j) {
                        float axisValue = motionEvent.getAxisValue(9);
                        if (axisValue != 0.0f) {
                            if (this.f10487A == 0.0f) {
                                TypedValue typedValue = new TypedValue();
                                Context context = getContext();
                                if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                                    this.f10487A = typedValue.getDimension(context.getResources().getDisplayMetrics());
                                } else {
                                    throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
                                }
                            }
                            float f = this.f10487A;
                            int a = mo12033a();
                            int scrollY = getScrollY();
                            int i = scrollY - ((int) (axisValue * f));
                            if (i < 0) {
                                a = 0;
                            } else if (i <= a) {
                                a = i;
                            }
                            if (a != scrollY) {
                                super.scrollTo(getScrollX(), a);
                                return true;
                            }
                        }
                    }
                    break;
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        int action = motionEvent.getAction();
        if (action == 2 && this.f10497j) {
            return true;
        }
        int x;
        switch (action & Illuminant.kOther) {
            case 0:
                action = (int) motionEvent.getY();
                x = (int) motionEvent.getX();
                if (getChildCount() > 0) {
                    int scrollY = getScrollY();
                    View childAt = getChildAt(0);
                    if (action < childAt.getTop() - scrollY) {
                        z = false;
                    } else if (action >= childAt.getBottom() - scrollY) {
                        z = false;
                    } else if (x < childAt.getLeft()) {
                        z = false;
                    } else if (x >= childAt.getRight()) {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (!z) {
                    this.f10497j = false;
                    m6821e();
                    break;
                }
                this.f10493f = action;
                this.f10504q = motionEvent.getPointerId(0);
                VelocityTracker velocityTracker = this.f10498k;
                if (velocityTracker == null) {
                    this.f10498k = VelocityTracker.obtain();
                } else {
                    velocityTracker.clear();
                }
                this.f10498k.addMovement(motionEvent);
                this.f10490c.computeScrollOffset();
                this.f10497j = this.f10490c.isFinished() ^ 1;
                m6815b(2, 0);
                break;
            case 1:
            case 3:
                this.f10497j = false;
                this.f10504q = -1;
                m6821e();
                if (this.f10490c.springBack(getScrollX(), getScrollY(), 0, 0, 0, mo12033a())) {
                    C0315jm.m4601A(this);
                }
                m6824g(0);
                break;
            case 2:
                action = this.f10504q;
                if (action != -1) {
                    x = motionEvent.findPointerIndex(action);
                    if (x != -1) {
                        action = (int) motionEvent.getY(x);
                        if (Math.abs(action - this.f10493f) > this.f10501n && (getNestedScrollAxes() & 2) == 0) {
                            this.f10497j = true;
                            this.f10493f = action;
                            m6819d();
                            this.f10498k.addMovement(motionEvent);
                            this.f10507t = 0;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                                break;
                            }
                        }
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid pointerId=");
                    stringBuilder.append(action);
                    stringBuilder.append(" in onInterceptTouchEvent");
                    Log.e("NestedScrollView", stringBuilder.toString());
                    break;
                }
                break;
            case 6:
                m6805a(motionEvent);
                break;
        }
        return this.f10497j;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = 0;
        super.onLayout(z, i, i2, i3, i4);
        this.f10494g = false;
        View view = this.f10496i;
        if (view != null && NestedScrollView.m6811a(view, (View) this)) {
            m6813b(this.f10496i);
        }
        this.f10496i = null;
        if (!this.f10495h) {
            if (this.f10509v != null) {
                scrollTo(getScrollX(), this.f10509v.f9149a);
                this.f10509v = null;
            }
            if (getChildCount() > 0) {
                view = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                i5 = layoutParams.bottomMargin + (view.getMeasuredHeight() + layoutParams.topMargin);
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int scrollY = getScrollY();
            i5 = NestedScrollView.m6802a(scrollY, ((i4 - i2) - paddingTop) - paddingBottom, i5);
            if (i5 != scrollY) {
                scrollTo(getScrollX(), i5);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f10495h = true;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f10499l && MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(NestedScrollView.getChildMeasureSpec(i, ((getPaddingLeft() + getPaddingRight()) + layoutParams.leftMargin) + layoutParams.rightMargin, layoutParams.width), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        m6820d((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo9447a(view, i, i2, iArr, 0);
    }

    /* renamed from: a */
    public final void mo9447a(View view, int i, int i2, int[] iArr, int i3) {
        m6808a(i, i2, iArr, null, i3);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo9446a(view, i, i2, i3, i4, 0);
    }

    /* renamed from: a */
    public final void mo9446a(View view, int i, int i2, int i3, int i4, int i5) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        m6807a(0, scrollY2, 0, i4 - scrollY2, null, i5);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo9450b(view2, i, 0);
    }

    /* renamed from: b */
    public final void mo9450b(View view, int i, int i2) {
        this.f10510y.f8242a = i;
        m6815b(2, i2);
    }

    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocus;
        if (i == 2) {
            i = ScriptIntrinsicBLAS.RsBlas_ctrsm;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            findNextFocus = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (findNextFocus == null || m6809a(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i, rect);
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C0352lm) {
            C0352lm c0352lm = (C0352lm) parcelable;
            super.onRestoreInstanceState(c0352lm.getSuperState());
            this.f10509v = c0352lm;
            requestLayout();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable c0352lm = new C0352lm(super.onSaveInstanceState());
        c0352lm.f9149a = getScrollY();
        return c0352lm;
    }

    /* renamed from: a */
    private final void m6805a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f10504q) {
            if (actionIndex == 0) {
                actionIndex = 1;
            } else {
                actionIndex = 0;
            }
            this.f10493f = (int) motionEvent.getY(actionIndex);
            this.f10504q = motionEvent.getPointerId(actionIndex);
            VelocityTracker velocityTracker = this.f10498k;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m6810a(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f10489b);
            offsetDescendantRectToMyCoords(findFocus, this.f10489b);
            m6818c(m6803a(this.f10489b));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo9448a(view, view2, i, 0);
    }

    /* renamed from: a */
    public final boolean mo9448a(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        mo9449b(view, 0);
    }

    /* renamed from: b */
    public final void mo9449b(View view, int i) {
        this.f10510y.f8242a = 0;
        m6824g(i);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        m6819d();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f10507t = 0;
        }
        obtain.offsetLocation(0.0f, (float) this.f10507t);
        ViewParent parent;
        switch (actionMasked) {
            case 0:
                if (getChildCount() != 0) {
                    boolean isFinished = this.f10490c.isFinished() ^ 1;
                    this.f10497j = isFinished;
                    if (isFinished) {
                        parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (!this.f10490c.isFinished()) {
                        this.f10490c.abortAnimation();
                    }
                    this.f10493f = (int) motionEvent.getY();
                    this.f10504q = motionEvent.getPointerId(0);
                    m6815b(2, 0);
                    break;
                }
                return false;
            case 1:
                velocityTracker = this.f10498k;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f10503p);
                actionMasked = (int) velocityTracker.getYVelocity(this.f10504q);
                if (Math.abs(actionMasked) > this.f10502o) {
                    m6820d(-actionMasked);
                } else if (this.f10490c.springBack(getScrollX(), getScrollY(), 0, 0, 0, mo12033a())) {
                    C0315jm.m4601A(this);
                }
                this.f10504q = -1;
                m6812b();
                break;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.f10504q);
                if (findPointerIndex != -1) {
                    int i;
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i2 = this.f10493f - y;
                    if (m6808a(0, i2, this.f10506s, this.f10505r, 0)) {
                        i2 -= this.f10506s[1];
                        obtain.offsetLocation(0.0f, (float) this.f10505r[1]);
                        this.f10507t += this.f10505r[1];
                    }
                    if (this.f10497j) {
                        i = i2;
                    } else if (Math.abs(i2) > this.f10501n) {
                        parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f10497j = true;
                        if (i2 > 0) {
                            i = i2 - this.f10501n;
                        } else {
                            i = i2 + this.f10501n;
                        }
                    } else {
                        i = i2;
                    }
                    if (this.f10497j) {
                        Object obj;
                        this.f10493f = y - this.f10505r[1];
                        int scrollY = getScrollY();
                        int a = mo12033a();
                        actionMasked = getOverScrollMode();
                        if (actionMasked == 0) {
                            obj = 1;
                        } else if (actionMasked != 1) {
                            obj = null;
                        } else if (a <= 0) {
                            obj = null;
                        } else {
                            int obj2 = 1;
                        }
                        if (m6806a(i, 0, getScrollY(), a) && !m6823f(0)) {
                            this.f10498k.clear();
                        }
                        i2 = getScrollY() - scrollY;
                        if (!m6807a(0, i2, 0, i - i2, this.f10505r, 0)) {
                            if (obj2 != null) {
                                m6817c();
                                actionMasked = scrollY + i;
                                if (actionMasked < 0) {
                                    this.f10491d.onPull(((float) i) / ((float) getHeight()), motionEvent.getX(findPointerIndex) / ((float) getWidth()));
                                    if (!this.f10492e.isFinished()) {
                                        this.f10492e.onRelease();
                                    }
                                } else if (actionMasked > a) {
                                    this.f10492e.onPull(((float) i) / ((float) getHeight()), 1.0f - (motionEvent.getX(findPointerIndex) / ((float) getWidth())));
                                    if (!this.f10491d.isFinished()) {
                                        this.f10491d.onRelease();
                                    }
                                }
                                EdgeEffect edgeEffect = this.f10491d;
                                if (!(edgeEffect == null || (edgeEffect.isFinished() && this.f10492e.isFinished()))) {
                                    C0315jm.m4601A(this);
                                    break;
                                }
                            }
                        }
                        actionMasked = this.f10493f;
                        int i3 = this.f10505r[1];
                        this.f10493f = actionMasked - i3;
                        obtain.offsetLocation(0.0f, (float) i3);
                        this.f10507t += this.f10505r[1];
                        break;
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid pointerId=");
                stringBuilder.append(this.f10504q);
                stringBuilder.append(" in onTouchEvent");
                Log.e("NestedScrollView", stringBuilder.toString());
                break;
                break;
            case 3:
                if (this.f10497j && getChildCount() > 0 && this.f10490c.springBack(getScrollX(), getScrollY(), 0, 0, 0, mo12033a())) {
                    C0315jm.m4601A(this);
                }
                this.f10504q = -1;
                m6812b();
                break;
            case 5:
                actionMasked = motionEvent.getActionIndex();
                this.f10493f = (int) motionEvent.getY(actionMasked);
                this.f10504q = motionEvent.getPointerId(actionMasked);
                break;
            case 6:
                m6805a(motionEvent);
                this.f10493f = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f10504q));
                break;
        }
        velocityTracker = this.f10498k;
        if (velocityTracker != null) {
            velocityTracker.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    /* renamed from: a */
    private final boolean m6806a(int i, int i2, int i3, int i4) {
        int i5;
        boolean z;
        boolean z2;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i6 = i3 + i;
        if (i2 > 0) {
            i5 = 0;
            z = true;
        } else if (i2 < 0) {
            i5 = 0;
            z = true;
        } else {
            i5 = i2;
            z = false;
        }
        if (i6 > i4) {
            z2 = true;
            i6 = i4;
        } else if (i6 < 0) {
            z2 = true;
            i6 = 0;
        } else {
            z2 = false;
        }
        if (z2 && !m6823f(1)) {
            this.f10490c.springBack(i5, i6, 0, 0, 0, mo12033a());
        }
        onOverScrolled(i5, i6, z, z2);
        if (z || z2) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private final void m6821e() {
        VelocityTracker velocityTracker = this.f10498k;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f10498k = null;
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (this.f10494g) {
            this.f10496i = view2;
        } else {
            m6813b(view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        boolean z2;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int a = m6803a(rect);
        if (a != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (z) {
                scrollBy(0, a);
            } else {
                m6804a(0, a);
            }
        }
        return z2;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m6821e();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f10494g = true;
        super.requestLayout();
    }

    /* renamed from: b */
    private final boolean m6816b(int i, int i2, int i3) {
        Object obj;
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        if (i != 33) {
            obj = null;
        } else {
            int obj2 = 1;
        }
        List focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        Object obj3 = null;
        int i5 = 0;
        while (i5 < size) {
            Object obj4;
            View view2;
            View view3 = (View) focusables.get(i5);
            int top = view3.getTop();
            int bottom = view3.getBottom();
            if (i2 >= bottom) {
                obj4 = obj3;
                view2 = view;
            } else if (top >= i3) {
                obj4 = obj3;
                view2 = view;
            } else {
                Object obj5;
                if (i2 >= top) {
                    obj5 = null;
                } else if (bottom < i3) {
                    obj5 = 1;
                } else {
                    obj5 = null;
                }
                if (view != null) {
                    Object obj6;
                    if (obj2 != null && top < view.getTop()) {
                        obj6 = 1;
                    } else if (i == 33) {
                        obj6 = null;
                    } else if (bottom <= view.getBottom()) {
                        obj6 = null;
                    } else {
                        obj6 = 1;
                    }
                    Object obj7;
                    if (obj3 != null) {
                        if (obj5 == null) {
                            obj4 = obj3;
                            view2 = view;
                        } else if (obj6 != null) {
                            obj7 = obj3;
                            view2 = view3;
                            obj4 = obj7;
                        } else {
                            obj4 = obj3;
                            view2 = view;
                        }
                    } else if (obj5 != null) {
                        view2 = view3;
                        height = 1;
                    } else if (obj6 != null) {
                        obj7 = obj3;
                        view2 = view3;
                        obj4 = obj7;
                    } else {
                        obj4 = obj3;
                        view2 = view;
                    }
                } else {
                    view2 = view3;
                    obj4 = obj5;
                }
            }
            i5++;
            view = view2;
            obj3 = obj4;
        }
        if (view == null) {
            view = this;
        }
        if (i2 < scrollY || i3 > i4) {
            if (i != 33) {
                height = i3 - i4;
            } else {
                height = i2 - scrollY;
            }
            m6818c(height);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z;
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = getWidth();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = childAt.getWidth();
            int i3 = layoutParams.leftMargin;
            int i4 = layoutParams.rightMargin;
            int height = getHeight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int height2 = childAt.getHeight();
            int i5 = layoutParams.topMargin;
            int i6 = layoutParams.bottomMargin;
            width = NestedScrollView.m6802a(i, (width - paddingLeft) - paddingRight, (width2 + i3) + i4);
            i6 = NestedScrollView.m6802a(i2, (height - paddingTop) - paddingBottom, i6 + (height2 + i5));
            if (width != getScrollX() || i6 != getScrollY()) {
                super.scrollTo(width, i6);
            }
        }
    }

    /* renamed from: b */
    private final void m6813b(View view) {
        view.getDrawingRect(this.f10489b);
        offsetDescendantRectToMyCoords(view, this.f10489b);
        int a = m6803a(this.f10489b);
        if (a != 0) {
            scrollBy(0, a);
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f10511z.mo9418a(z);
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    /* renamed from: a */
    private final void m6804a(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f10488a > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight();
                int i3 = layoutParams.topMargin;
                int i4 = layoutParams.bottomMargin;
                int height2 = getHeight();
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int scrollY = getScrollY();
                i4 = Math.max(0, Math.min(scrollY + i2, Math.max(0, (i4 + (height + i3)) - ((height2 - paddingTop) - paddingBottom))));
                this.f10508u = getScrollY();
                this.f10490c.startScroll(getScrollX(), scrollY, 0, i4 - scrollY);
                C0315jm.m4601A(this);
            } else {
                if (!this.f10490c.isFinished()) {
                    this.f10490c.abortAnimation();
                }
                scrollBy(i, i2);
            }
            this.f10488a = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: a */
    public final void mo12034a(int i) {
        m6804a(-getScrollX(), i - getScrollY());
    }

    public boolean startNestedScroll(int i) {
        return m6815b(i, 0);
    }

    /* renamed from: b */
    private final boolean m6815b(int i, int i2) {
        return this.f10511z.mo9422a(i, i2);
    }

    public void stopNestedScroll() {
        m6824g(0);
    }

    /* renamed from: g */
    private final void m6824g(int i) {
        this.f10511z.mo9425b(i);
    }
}
