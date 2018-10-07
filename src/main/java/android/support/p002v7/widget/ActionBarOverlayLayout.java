package android.support.p002v7.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p001v4.app.NotificationCompat.WearableExtender;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.Window.Callback;
import android.widget.OverScroller;
import com.google.android.GoogleCamera.R;
import p000.C0312jj;
import p000.C0315jm;
import p000.C0410pe;
import p000.C0411pf;
import p000.C0420pt;
import p000.C0421pu;
import p000.C0422pv;
import p000.C0423pw;
import p000.C0424px;
import p000.C0461rt;
import p000.C0462ru;
import p000.C0549vx;
import p000.C0734op;
import p000.C0770vn;
import p000.C0836py;
import p000.kvl;

/* compiled from: PG */
/* renamed from: android.support.v7.widget.ActionBarOverlayLayout */
public class ActionBarOverlayLayout extends ViewGroup implements C0461rt {
    /* renamed from: A */
    private static final int[] f10552A = new int[]{R.attr.actionBarSize, 16842841};
    /* renamed from: B */
    private final C0312jj f10553B;
    /* renamed from: a */
    public int f10554a;
    /* renamed from: b */
    public ActionBarContainer f10555b;
    /* renamed from: c */
    public boolean f10556c;
    /* renamed from: d */
    public boolean f10557d;
    /* renamed from: e */
    public boolean f10558e;
    /* renamed from: f */
    public int f10559f;
    /* renamed from: g */
    public C0423pw f10560g;
    /* renamed from: h */
    public ViewPropertyAnimator f10561h;
    /* renamed from: i */
    public final AnimatorListenerAdapter f10562i;
    /* renamed from: j */
    private int f10563j;
    /* renamed from: k */
    private ContentFrameLayout f10564k;
    /* renamed from: l */
    private C0462ru f10565l;
    /* renamed from: m */
    private Drawable f10566m;
    /* renamed from: n */
    private boolean f10567n;
    /* renamed from: o */
    private boolean f10568o;
    /* renamed from: p */
    private int f10569p;
    /* renamed from: q */
    private final Rect f10570q;
    /* renamed from: r */
    private final Rect f10571r;
    /* renamed from: s */
    private final Rect f10572s;
    /* renamed from: t */
    private final Rect f10573t;
    /* renamed from: u */
    private final Rect f10574u;
    /* renamed from: v */
    private final Rect f10575v;
    /* renamed from: w */
    private final Rect f10576w;
    /* renamed from: x */
    private OverScroller f10577x;
    /* renamed from: y */
    private final Runnable f10578y;
    /* renamed from: z */
    private final Runnable f10579z;

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10554a = 0;
        this.f10570q = new Rect();
        this.f10571r = new Rect();
        this.f10572s = new Rect();
        this.f10573t = new Rect();
        this.f10574u = new Rect();
        this.f10575v = new Rect();
        this.f10576w = new Rect();
        this.f10562i = new C0420pt(this);
        this.f10578y = new C0421pu(this);
        this.f10579z = new C0422pv(this);
        m6857a(context);
        this.f10553B = new C0312jj();
    }

    /* renamed from: a */
    private static boolean m6858a(View view, Rect rect, boolean z) {
        boolean z2;
        C0424px c0424px = (C0424px) view.getLayoutParams();
        if (c0424px.leftMargin != rect.left) {
            c0424px.leftMargin = rect.left;
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0424px.topMargin != rect.top) {
            c0424px.topMargin = rect.top;
            z2 = true;
        }
        if (c0424px.rightMargin != rect.right) {
            c0424px.rightMargin = rect.right;
            z2 = true;
        }
        if (!z || c0424px.bottomMargin == rect.bottom) {
            return z2;
        }
        c0424px.bottomMargin = rect.bottom;
        return true;
    }

    /* renamed from: a */
    public final boolean mo11055a() {
        m6861j();
        Toolbar toolbar = this.f10565l.f9654a;
        if (toolbar.getVisibility() == 0) {
            ActionMenuView actionMenuView = toolbar.f738a;
            if (actionMenuView != null && actionMenuView.f10581b) {
                return true;
            }
        }
        return false;
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0424px;
    }

    /* renamed from: b */
    public final void mo11056b() {
        m6861j();
        this.f10565l.mo11063a();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f10566m != null && !this.f10567n) {
            int bottom;
            if (this.f10555b.getVisibility() == 0) {
                bottom = (int) ((((float) this.f10555b.getBottom()) + this.f10555b.getTranslationY()) + 0.5f);
            } else {
                bottom = 0;
            }
            this.f10566m.setBounds(0, bottom, getWidth(), this.f10566m.getIntrinsicHeight() + bottom);
            this.f10566m.draw(canvas);
        }
    }

    protected boolean fitSystemWindows(Rect rect) {
        m6861j();
        C0315jm.m4642q(this);
        boolean a = ActionBarOverlayLayout.m6858a(this.f10555b, rect, false);
        this.f10573t.set(rect);
        C0549vx.m6137a(this, this.f10573t, this.f10570q);
        if (!this.f10574u.equals(this.f10573t)) {
            this.f10574u.set(this.f10573t);
            a = true;
        }
        if (!this.f10571r.equals(this.f10570q)) {
            this.f10571r.set(this.f10570q);
            a = true;
        }
        if (a) {
            requestLayout();
        }
        return true;
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return new C0424px();
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C0424px(layoutParams);
    }

    public int getNestedScrollAxes() {
        return this.f10553B.f8242a;
    }

    /* renamed from: c */
    public final void mo12109c() {
        removeCallbacks(this.f10578y);
        removeCallbacks(this.f10579z);
        ViewPropertyAnimator viewPropertyAnimator = this.f10561h;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: d */
    public final boolean mo11057d() {
        m6861j();
        ActionMenuView actionMenuView = this.f10565l.f9654a.f738a;
        if (actionMenuView != null) {
            boolean z;
            C0836py c0836py = actionMenuView.f10582c;
            if (c0836py == null) {
                z = false;
            } else if (c0836py.mo15281c()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private final void m6857a(Context context) {
        boolean z;
        boolean z2 = true;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f10552A);
        this.f10563j = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f10566m = obtainStyledAttributes.getDrawable(1);
        if (this.f10566m == null) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion >= 19) {
            z2 = false;
        }
        this.f10567n = z2;
        this.f10577x = new OverScroller(context);
    }

    /* renamed from: a */
    public final void mo11051a(int i) {
        boolean z = true;
        m6861j();
        switch (i) {
            case 2:
                Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
                return;
            case 5:
                Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
                return;
            case 109:
                this.f10556c = true;
                if (getContext().getApplicationInfo().targetSdkVersion >= 19) {
                    z = false;
                }
                this.f10567n = z;
                return;
            default:
                return;
        }
    }

    /* renamed from: e */
    public final boolean mo11058e() {
        m6861j();
        ActionMenuView actionMenuView = this.f10565l.f9654a.f738a;
        if (actionMenuView != null) {
            boolean z;
            C0836py c0836py = actionMenuView.f10582c;
            if (c0836py == null) {
                z = false;
            } else {
                if (c0836py.f25442m != null) {
                    z = true;
                } else if (c0836py.mo15283e()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo11059f() {
        m6861j();
        return this.f10565l.f9654a.mo1212h();
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m6857a(getContext());
        C0315jm.m4602B(this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo12109c();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0424px c0424px = (C0424px) childAt.getLayoutParams();
                int i6 = c0424px.leftMargin + paddingLeft;
                int i7 = c0424px.topMargin + paddingTop;
                childAt.layout(i6, i7, childAt.getMeasuredWidth() + i6, childAt.getMeasuredHeight() + i7);
            }
        }
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        m6861j();
        measureChildWithMargins(this.f10555b, i, 0, i2, 0);
        C0424px c0424px = (C0424px) this.f10555b.getLayoutParams();
        int max = Math.max(0, (this.f10555b.getMeasuredWidth() + c0424px.leftMargin) + c0424px.rightMargin);
        int max2 = Math.max(0, c0424px.bottomMargin + (this.f10555b.getMeasuredHeight() + c0424px.topMargin));
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f10555b.getMeasuredState());
        int q = C0315jm.m4642q(this) & 256;
        if (q == 0) {
            i3 = 0;
        } else {
            boolean i32 = true;
        }
        if (i32 != 0) {
            i32 = this.f10563j;
        } else if (this.f10555b.getVisibility() == 8) {
            i32 = 0;
        } else {
            i32 = this.f10555b.getMeasuredHeight();
        }
        this.f10572s.set(this.f10570q);
        this.f10575v.set(this.f10573t);
        Rect rect;
        if (this.f10556c || q != 0) {
            rect = this.f10575v;
            rect.top = i32 + rect.top;
        } else {
            rect = this.f10572s;
            rect.top = i32 + rect.top;
        }
        ActionBarOverlayLayout.m6858a(this.f10564k, this.f10572s, true);
        if (!this.f10576w.equals(this.f10575v)) {
            this.f10576w.set(this.f10575v);
            this.f10564k.mo1107a(this.f10575v);
        }
        measureChildWithMargins(this.f10564k, i, 0, i2, 0);
        c0424px = (C0424px) this.f10564k.getLayoutParams();
        q = Math.max(max, (this.f10564k.getMeasuredWidth() + c0424px.leftMargin) + c0424px.rightMargin);
        i32 = Math.max(max2, c0424px.bottomMargin + (this.f10564k.getMeasuredHeight() + c0424px.topMargin));
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f10564k.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(q + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(i32 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f10568o || !z) {
            return false;
        }
        this.f10577x.fling(0, 0, 0, (int) f2, 0, 0, kvl.UNSET_ENUM_VALUE, LfuScheduler.MAX_PRIORITY);
        if (this.f10577x.getFinalY() > this.f10555b.getHeight()) {
            mo12109c();
            this.f10579z.run();
        } else {
            mo12109c();
            this.f10578y.run();
        }
        this.f10558e = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.f10569p += i2;
        m6859b(this.f10569p);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        int i2;
        this.f10553B.f8242a = i;
        ActionBarContainer actionBarContainer = this.f10555b;
        if (actionBarContainer != null) {
            i2 = -((int) actionBarContainer.getTranslationY());
        } else {
            i2 = 0;
        }
        this.f10569p = i2;
        mo12109c();
        C0423pw c0423pw = this.f10560g;
        if (c0423pw != null) {
            c0423pw.mo10887m();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f10555b.getVisibility() != 0) {
            return false;
        }
        return this.f10568o;
    }

    public void onStopNestedScroll(View view) {
        if (this.f10568o && !this.f10558e) {
            if (this.f10569p <= this.f10555b.getHeight()) {
                mo12109c();
                postDelayed(this.f10578y, 600);
                return;
            }
            mo12109c();
            postDelayed(this.f10579z, 600);
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m6861j();
        int i2 = this.f10559f ^ i;
        this.f10559f = i;
        int i3 = i & 4;
        int i4 = i & 256;
        C0423pw c0423pw = this.f10560g;
        if (c0423pw != null) {
            boolean z;
            if (i4 == 0) {
                z = true;
            } else {
                z = false;
            }
            c0423pw.mo10885f(z);
            if (i3 == 0 || i4 == 0) {
                this.f10560g.mo10888n();
            } else {
                this.f10560g.mo10886l();
            }
        }
        if ((i2 & 256) != 0 && this.f10560g != null) {
            C0315jm.m4602B(this);
        }
    }

    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f10554a = i;
        C0423pw c0423pw = this.f10560g;
        if (c0423pw != null) {
            c0423pw.mo10884a(i);
        }
    }

    /* renamed from: j */
    private final void m6861j() {
        if (this.f10564k == null) {
            C0462ru c0462ru;
            this.f10564k = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f10555b = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof C0462ru) {
                c0462ru = (C0462ru) findViewById;
            } else if (findViewById instanceof Toolbar) {
                c0462ru = ((Toolbar) findViewById).mo1208g();
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Can't make a decor toolbar out of ");
                stringBuilder.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(stringBuilder.toString());
            }
            this.f10565l = c0462ru;
        }
    }

    /* renamed from: b */
    private final void m6859b(int i) {
        mo12109c();
        this.f10555b.setTranslationY((float) (-Math.max(0, Math.min(i, this.f10555b.getHeight()))));
    }

    /* renamed from: a */
    public final void mo12108a(boolean z) {
        if (z != this.f10568o) {
            this.f10568o = z;
            if (!z) {
                mo12109c();
                m6859b(0);
            }
        }
    }

    /* renamed from: a */
    public final void mo11052a(Menu menu, C0411pf c0411pf) {
        m6861j();
        C0462ru c0462ru = this.f10565l;
        if (c0462ru.f9660g == null) {
            c0462ru.f9660g = new C0836py(c0462ru.f9654a.getContext());
        }
        C0836py c0836py = c0462ru.f9660g;
        c0836py.f22159d = c0411pf;
        Toolbar toolbar = c0462ru.f9654a;
        C0734op c0734op = (C0734op) menu;
        if (c0734op != null || toolbar.f738a != null) {
            if (toolbar.f738a == null) {
                toolbar.f738a = new ActionMenuView(toolbar.getContext());
                toolbar.f738a.mo12132a(toolbar.f747j);
                LayoutParams d = Toolbar.m516d();
                d.f9176a = (toolbar.f750m & 112) | WearableExtender.DEFAULT_CONTENT_ICON_GRAVITY;
                toolbar.f738a.setLayoutParams(d);
                toolbar.mo1198a(toolbar.f738a, false);
            }
            C0734op c0734op2 = toolbar.f738a.f10580a;
            if (c0734op2 != c0734op) {
                if (c0734op2 != null) {
                    c0734op2.mo14313b(toolbar.f755r);
                    c0734op2.mo14313b(toolbar.f756s);
                }
                if (toolbar.f756s == null) {
                    toolbar.f756s = new C0770vn(toolbar);
                }
                c0836py.f25439j = true;
                if (c0734op != null) {
                    c0734op.mo14297a((C0410pe) c0836py, toolbar.f746i);
                    c0734op.mo14297a(toolbar.f756s, toolbar.f746i);
                } else {
                    c0836py.mo10846a(toolbar.f746i, null);
                    toolbar.f756s.mo10846a(toolbar.f746i, null);
                    c0836py.mo10849a(true);
                    toolbar.f756s.mo10849a(true);
                }
                toolbar.f738a.mo12132a(toolbar.f747j);
                toolbar.f738a.mo12133a(c0836py);
                toolbar.f755r = c0836py;
            }
        }
    }

    /* renamed from: g */
    public final void mo11060g() {
        m6861j();
        this.f10565l.f9659f = true;
    }

    /* renamed from: h */
    public static void m6860h() {
    }

    /* renamed from: a */
    public final void mo11053a(Callback callback) {
        m6861j();
        this.f10565l.f9658e = callback;
    }

    /* renamed from: a */
    public final void mo11054a(CharSequence charSequence) {
        m6861j();
        this.f10565l.mo11068b(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: i */
    public final boolean mo11061i() {
        m6861j();
        return this.f10565l.f9654a.mo1213i();
    }
}
