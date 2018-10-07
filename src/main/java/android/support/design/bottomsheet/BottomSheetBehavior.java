package android.support.design.bottomsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.GoogleCamera.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import p000.C0059bm;
import p000.C0060bn;
import p000.C0189dj;
import p000.C0315jm;
import p000.C0354lo;
import p000.C0357lr;
import p000.C0640bj;
import p000.C0641bk;

/* compiled from: PG */
public class BottomSheetBehavior extends C0189dj {
    /* renamed from: a */
    public boolean f10419a = true;
    /* renamed from: b */
    public int f10420b;
    /* renamed from: c */
    public int f10421c;
    /* renamed from: d */
    public int f10422d;
    /* renamed from: e */
    public boolean f10423e;
    /* renamed from: f */
    public int f10424f = 4;
    /* renamed from: g */
    public C0354lo f10425g;
    /* renamed from: h */
    public int f10426h;
    /* renamed from: i */
    public WeakReference f10427i;
    /* renamed from: j */
    public WeakReference f10428j;
    /* renamed from: k */
    public int f10429k;
    /* renamed from: l */
    public boolean f10430l;
    /* renamed from: m */
    private float f10431m;
    /* renamed from: n */
    private int f10432n;
    /* renamed from: o */
    private boolean f10433o;
    /* renamed from: p */
    private int f10434p;
    /* renamed from: q */
    private int f10435q;
    /* renamed from: r */
    private boolean f10436r;
    /* renamed from: s */
    private boolean f10437s;
    /* renamed from: t */
    private int f10438t;
    /* renamed from: u */
    private boolean f10439u;
    /* renamed from: v */
    private VelocityTracker f10440v;
    /* renamed from: w */
    private int f10441w;
    /* renamed from: x */
    private Map f10442x;
    /* renamed from: y */
    private final C0357lr f10443y = new C0640bj(this);

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0060bn.f1357a);
        TypedValue peekValue = obtainStyledAttributes.peekValue(C0060bn.f1360d);
        if (peekValue == null || peekValue.data != -1) {
            m6745c(obtainStyledAttributes.getDimensionPixelSize(C0060bn.f1360d, -1));
        } else {
            m6745c(peekValue.data);
        }
        this.f10423e = obtainStyledAttributes.getBoolean(C0060bn.f1359c, false);
        boolean z = obtainStyledAttributes.getBoolean(C0060bn.f1358b, true);
        if (this.f10419a != z) {
            int i;
            this.f10419a = z;
            if (this.f10427i != null) {
                m6744c();
            }
            if (this.f10419a && this.f10424f == 6) {
                i = 3;
            } else {
                i = this.f10424f;
            }
            mo11660b(i);
        }
        this.f10436r = obtainStyledAttributes.getBoolean(C0060bn.f1361e, false);
        obtainStyledAttributes.recycle();
        this.f10431m = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: c */
    private final void m6744c() {
        if (this.f10419a) {
            this.f10422d = Math.max(this.f10426h - this.f10435q, this.f10420b);
        } else {
            this.f10422d = this.f10426h - this.f10435q;
        }
    }

    /* renamed from: a */
    public final void mo11657a() {
        this.f10427i.get();
    }

    /* renamed from: a */
    private final View m6742a(View view) {
        if (C0315jm.m4650y(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View a = m6742a(viewGroup.getChildAt(i));
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final int mo11659b() {
        return this.f10419a ? this.f10420b : 0;
    }

    /* renamed from: a */
    public final boolean mo422a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (view.isShown()) {
            WeakReference weakReference;
            View view2;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                m6746d();
            }
            if (this.f10440v == null) {
                this.f10440v = VelocityTracker.obtain();
            }
            this.f10440v.addMovement(motionEvent);
            switch (actionMasked) {
                case 0:
                    int x = (int) motionEvent.getX();
                    this.f10441w = (int) motionEvent.getY();
                    weakReference = this.f10428j;
                    if (weakReference != null) {
                        view2 = (View) weakReference.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && coordinatorLayout.mo11689a(view2, x, this.f10441w)) {
                        this.f10429k = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f10430l = true;
                    }
                    boolean z = this.f10429k == -1 ? !coordinatorLayout.mo11689a(view, x, this.f10441w) : false;
                    this.f10437s = z;
                    break;
                case 1:
                case 3:
                    this.f10430l = false;
                    this.f10429k = -1;
                    if (this.f10437s) {
                        this.f10437s = false;
                        return false;
                    }
                    break;
            }
            if (!this.f10437s) {
                C0354lo c0354lo = this.f10425g;
                if (c0354lo != null && c0354lo.mo10627b(motionEvent)) {
                    return true;
                }
            }
            weakReference = this.f10428j;
            if (weakReference != null) {
                view2 = (View) weakReference.get();
            } else {
                view2 = null;
            }
            if (actionMasked != 2 || r0 == null || this.f10437s || this.f10424f == 1 || coordinatorLayout.mo11689a(r0, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f10425g == null || Math.abs(((float) this.f10441w) - motionEvent.getY()) <= ((float) this.f10425g.f9152b)) {
                return false;
            }
            return true;
        }
        this.f10437s = true;
        return false;
    }

    /* renamed from: a */
    public final boolean mo408a(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (C0315jm.m4632g(coordinatorLayout) && !C0315jm.m4632g(view)) {
            view.setFitsSystemWindows(true);
        }
        int top = view.getTop();
        coordinatorLayout.mo11687a(view, i);
        this.f10426h = coordinatorLayout.getHeight();
        if (this.f10433o) {
            if (this.f10434p == 0) {
                this.f10434p = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            }
            this.f10435q = Math.max(this.f10434p, this.f10426h - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            this.f10435q = this.f10432n;
        }
        this.f10420b = Math.max(0, this.f10426h - view.getHeight());
        this.f10421c = this.f10426h / 2;
        m6744c();
        int i2 = this.f10424f;
        if (i2 == 3) {
            C0315jm.m4624b(view, mo11659b());
        } else if (i2 == 6) {
            C0315jm.m4624b(view, this.f10421c);
        } else if (this.f10423e && i2 == 5) {
            C0315jm.m4624b(view, this.f10426h);
        } else if (i2 == 4) {
            C0315jm.m4624b(view, this.f10422d);
        } else if (i2 == 1 || i2 == 2) {
            C0315jm.m4624b(view, top - view.getTop());
        }
        if (this.f10425g == null) {
            this.f10425g = C0354lo.m5580b((ViewGroup) coordinatorLayout, this.f10443y);
        }
        this.f10427i = new WeakReference(view);
        this.f10428j = new WeakReference(m6742a(view));
        return true;
    }

    /* renamed from: a */
    public final boolean mo5980a(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        if (view2 != this.f10428j.get()) {
            return false;
        }
        if (this.f10424f == 3 && !super.mo5980a(coordinatorLayout, view, view2, f, f2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo405a(View view, View view2, int i, int[] iArr, int i2) {
        if (i2 != 1 && view2 == ((View) this.f10428j.get())) {
            int top = view.getTop();
            int i3 = top - i;
            if (i > 0) {
                if (i3 < mo11659b()) {
                    iArr[1] = top - mo11659b();
                    C0315jm.m4624b(view, -iArr[1]);
                    mo11660b(3);
                } else {
                    iArr[1] = i;
                    C0315jm.m4624b(view, -i);
                    mo11660b(1);
                }
            } else if (i < 0 && !view2.canScrollVertically(-1)) {
                int i4 = this.f10422d;
                if (i3 <= i4 || this.f10423e) {
                    iArr[1] = i;
                    C0315jm.m4624b(view, -i);
                    mo11660b(1);
                } else {
                    iArr[1] = top - i4;
                    C0315jm.m4624b(view, -iArr[1]);
                    mo11660b(4);
                }
            }
            view.getTop();
            mo11657a();
            this.f10438t = i;
            this.f10439u = true;
        }
    }

    /* renamed from: a */
    public final void mo402a(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        C0641bk c0641bk = (C0641bk) parcelable;
        super.mo402a(coordinatorLayout, view, c0641bk.f7997e);
        int i = c0641bk.f11484a;
        if (i == 1 || i == 2) {
            this.f10424f = 4;
        } else {
            this.f10424f = i;
        }
    }

    /* renamed from: a */
    public final Parcelable mo401a(CoordinatorLayout coordinatorLayout, View view) {
        return new C0641bk(super.mo401a(coordinatorLayout, view), this.f10424f);
    }

    /* renamed from: a */
    public final boolean mo407a(int i, int i2) {
        this.f10438t = 0;
        this.f10439u = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo404a(View view, View view2, int i) {
        int i2 = 3;
        if (view.getTop() == mo11659b()) {
            mo11660b(3);
        } else if (view2 == this.f10428j.get() && this.f10439u) {
            int b;
            if (this.f10438t > 0) {
                b = mo11659b();
            } else {
                if (this.f10423e) {
                    float yVelocity;
                    VelocityTracker velocityTracker = this.f10440v;
                    if (velocityTracker != null) {
                        velocityTracker.computeCurrentVelocity(1000, this.f10431m);
                        yVelocity = this.f10440v.getYVelocity(this.f10429k);
                    } else {
                        yVelocity = 0.0f;
                    }
                    if (mo11658a(view, yVelocity)) {
                        b = this.f10426h;
                        i2 = 5;
                    }
                }
                if (this.f10438t == 0) {
                    b = view.getTop();
                    if (!this.f10419a) {
                        int i3 = this.f10421c;
                        if (b < i3) {
                            if (b >= Math.abs(b - this.f10422d)) {
                                b = this.f10421c;
                                i2 = 6;
                            } else {
                                b = 0;
                            }
                        } else if (Math.abs(b - i3) < Math.abs(b - this.f10422d)) {
                            b = this.f10421c;
                            i2 = 6;
                        } else {
                            b = this.f10422d;
                            i2 = 4;
                        }
                    } else if (Math.abs(b - this.f10420b) < Math.abs(b - this.f10422d)) {
                        b = this.f10420b;
                    } else {
                        b = this.f10422d;
                        i2 = 4;
                    }
                } else {
                    b = this.f10422d;
                    i2 = 4;
                }
            }
            if (this.f10425g.mo10623a(view, view.getLeft(), b)) {
                mo11660b(2);
                C0315jm.m4615a(view, new C0059bm(this, view, i2));
            } else {
                mo11660b(i2);
            }
            this.f10439u = false;
        }
    }

    /* renamed from: b */
    public final boolean mo5982b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f10424f == 1 && actionMasked == 0) {
            return true;
        }
        C0354lo c0354lo = this.f10425g;
        if (c0354lo != null) {
            c0354lo.mo10620a(motionEvent);
        }
        if (actionMasked == 0) {
            m6746d();
        }
        if (this.f10440v == null) {
            this.f10440v = VelocityTracker.obtain();
        }
        this.f10440v.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f10437s) {
            float abs = Math.abs(((float) this.f10441w) - motionEvent.getY());
            C0354lo c0354lo2 = this.f10425g;
            if (abs > ((float) c0354lo2.f9152b)) {
                c0354lo2.mo10621a(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return this.f10437s ^ 1;
    }

    /* renamed from: d */
    private final void m6746d() {
        this.f10429k = -1;
        VelocityTracker velocityTracker = this.f10440v;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f10440v = null;
        }
    }

    /* renamed from: c */
    private final void m6745c(int i) {
        boolean z = true;
        if (i == -1) {
            if (this.f10433o) {
                z = false;
            } else {
                this.f10433o = true;
            }
        } else if (this.f10433o || this.f10432n != i) {
            this.f10433o = false;
            this.f10432n = Math.max(0, i);
            this.f10422d = this.f10426h - i;
        } else {
            z = false;
        }
        if (z && this.f10424f == 4) {
            WeakReference weakReference = this.f10427i;
            if (weakReference != null) {
                View view = (View) weakReference.get();
                if (view != null) {
                    view.requestLayout();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo11660b(int i) {
        if (this.f10424f != i) {
            this.f10424f = i;
            if (i == 6 || i == 3) {
                m6743a(true);
            } else if (i == 5 || i == 4) {
                m6743a(false);
            }
            this.f10427i.get();
        }
    }

    /* renamed from: a */
    public final boolean mo11658a(View view, float f) {
        if (this.f10436r) {
            return true;
        }
        if (view.getTop() < this.f10422d) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (0.1f * f)) - ((float) this.f10422d)) / ((float) this.f10432n) <= 0.5f) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final void m6743a(boolean z) {
        WeakReference weakReference = this.f10427i;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                int i;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (!z) {
                    i = 0;
                } else if (this.f10442x == null) {
                    this.f10442x = new HashMap(childCount);
                    i = 0;
                } else {
                    return;
                }
                while (i < childCount) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.f10427i.get()) {
                        if (z) {
                            if (VERSION.SDK_INT >= 16) {
                                this.f10442x.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            C0315jm.m4627c(childAt, 4);
                        } else {
                            Map map = this.f10442x;
                            if (map != null && map.containsKey(childAt)) {
                                C0315jm.m4627c(childAt, ((Integer) this.f10442x.get(childAt)).intValue());
                            }
                        }
                    }
                    i++;
                }
                if (!z) {
                    this.f10442x = null;
                }
            }
        }
    }
}
