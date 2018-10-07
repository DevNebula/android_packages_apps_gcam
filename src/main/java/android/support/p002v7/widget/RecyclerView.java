package android.support.p002v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.Trace;
import android.support.p001v4.app.FragmentTransaction;
import android.support.p003v8.renderscript.ScriptIntrinsicBLAS;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.refocus.processing.DepthmapTask;
import com.google.googlex.gcam.androidutils.camera2.BlockingCameraManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import p000.C0310jh;
import p000.C0315jm;
import p000.C0385nl;
import p000.C0428qi;
import p000.C0429qj;
import p000.C0457rp;
import p000.C0458rq;
import p000.C0459rr;
import p000.C0483ss;
import p000.C0502ts;
import p000.C0504tu;
import p000.C0505tv;
import p000.C0506tw;
import p000.C0507tx;
import p000.C0511ua;
import p000.C0512ub;
import p000.C0514ud;
import p000.C0515ue;
import p000.C0516uf;
import p000.C0517ug;
import p000.C0518uj;
import p000.C0519uk;
import p000.C0520ul;
import p000.C0521um;
import p000.C0524up;
import p000.C0525uq;
import p000.C0528uv;
import p000.C0529uw;
import p000.C0530ux;
import p000.C0548vw;
import p000.C0564wm;
import p000.C0572wy;
import p000.C0754sk;
import p000.C0764ur;
import p000.C0765us;
import p000.C0766uy;
import p000.C0839rv;
import p000.kvl;

/* compiled from: PG */
/* renamed from: android.support.v7.widget.RecyclerView */
public class RecyclerView extends ViewGroup {
    /* renamed from: I */
    public static final Interpolator f656I = new C0506tw();
    /* renamed from: J */
    private static final int[] f657J = new int[]{16843830};
    /* renamed from: K */
    private static final int[] f658K = new int[]{16842987};
    /* renamed from: L */
    private static final Class[] f659L = new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
    /* renamed from: a */
    public static final boolean f660a = true;
    /* renamed from: b */
    public static final boolean f661b = true;
    /* renamed from: A */
    public final C0528uv f662A;
    /* renamed from: B */
    public List f663B;
    /* renamed from: C */
    public boolean f664C;
    /* renamed from: D */
    public boolean f665D;
    /* renamed from: E */
    public boolean f666E;
    /* renamed from: F */
    public C0766uy f667F;
    /* renamed from: G */
    public final int[] f668G;
    /* renamed from: H */
    public final int[] f669H;
    /* renamed from: M */
    private C0765us f670M;
    /* renamed from: N */
    private boolean f671N;
    /* renamed from: O */
    private final Rect f672O;
    /* renamed from: P */
    private boolean f673P;
    /* renamed from: Q */
    private int f674Q;
    /* renamed from: R */
    private boolean f675R;
    /* renamed from: S */
    private int f676S;
    /* renamed from: T */
    private final AccessibilityManager f677T;
    /* renamed from: U */
    private boolean f678U;
    /* renamed from: V */
    private int f679V;
    /* renamed from: W */
    private int f680W;
    /* renamed from: aa */
    private int f681aa;
    /* renamed from: ab */
    private int f682ab;
    /* renamed from: ac */
    private VelocityTracker f683ac;
    /* renamed from: ad */
    private int f684ad;
    /* renamed from: ae */
    private int f685ae;
    /* renamed from: af */
    private int f686af;
    /* renamed from: ag */
    private int f687ag;
    /* renamed from: ah */
    private int f688ah;
    /* renamed from: ai */
    private final int f689ai;
    /* renamed from: aj */
    private final int f690aj;
    /* renamed from: ak */
    private float f691ak;
    /* renamed from: al */
    private float f692al;
    /* renamed from: am */
    private boolean f693am;
    /* renamed from: an */
    private final C0529uw f694an;
    /* renamed from: ao */
    private C0514ud f695ao;
    /* renamed from: ap */
    private final int[] f696ap;
    /* renamed from: aq */
    private C0310jh f697aq;
    /* renamed from: ar */
    private final int[] f698ar;
    /* renamed from: as */
    private final int[] f699as;
    /* renamed from: at */
    private final List f700at;
    /* renamed from: au */
    private Runnable f701au;
    /* renamed from: av */
    private final C0572wy f702av;
    /* renamed from: c */
    public final C0764ur f703c;
    /* renamed from: d */
    public final C0524up f704d;
    /* renamed from: e */
    public C0502ts f705e;
    /* renamed from: f */
    public C0457rp f706f;
    /* renamed from: g */
    public final C0564wm f707g;
    /* renamed from: h */
    public final Rect f708h;
    /* renamed from: i */
    public final RectF f709i;
    /* renamed from: j */
    public C0507tx f710j;
    /* renamed from: k */
    public C0517ug f711k;
    /* renamed from: l */
    public C0525uq f712l;
    /* renamed from: m */
    public final ArrayList f713m;
    /* renamed from: n */
    public final ArrayList f714n;
    /* renamed from: o */
    public C0520ul f715o;
    /* renamed from: p */
    public boolean f716p;
    /* renamed from: q */
    public boolean f717q;
    /* renamed from: r */
    public boolean f718r;
    /* renamed from: s */
    public boolean f719s;
    /* renamed from: t */
    public EdgeEffect f720t;
    /* renamed from: u */
    public EdgeEffect f721u;
    /* renamed from: v */
    public EdgeEffect f722v;
    /* renamed from: w */
    public EdgeEffect f723w;
    /* renamed from: x */
    public C0512ub f724x;
    /* renamed from: y */
    public C0483ss f725y;
    /* renamed from: z */
    public C0518uj f726z;

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        C0518uj c0518uj;
        boolean z;
        StringBuilder stringBuilder;
        super(context, attributeSet, i);
        this.f703c = new C0764ur(this);
        this.f704d = new C0524up(this);
        this.f707g = new C0564wm();
        C0504tu c0504tu = new C0504tu(this);
        this.f708h = new Rect();
        this.f672O = new Rect();
        this.f709i = new RectF();
        this.f713m = new ArrayList();
        this.f714n = new ArrayList();
        this.f674Q = 0;
        this.f719s = false;
        this.f678U = false;
        this.f679V = 0;
        this.f680W = 0;
        C0511ua c0511ua = new C0511ua();
        this.f724x = new C0839rv();
        this.f681aa = 0;
        this.f682ab = -1;
        this.f691ak = Float.MIN_VALUE;
        this.f692al = Float.MIN_VALUE;
        this.f693am = true;
        this.f694an = new C0529uw(this);
        if (f661b) {
            c0518uj = new C0518uj();
        } else {
            c0518uj = null;
        }
        this.f726z = c0518uj;
        this.f662A = new C0528uv();
        this.f664C = false;
        this.f665D = false;
        this.f695ao = new C0514ud(this);
        this.f666E = false;
        this.f696ap = new int[2];
        this.f698ar = new int[2];
        this.f668G = new int[2];
        this.f699as = new int[2];
        this.f669H = new int[2];
        this.f700at = new ArrayList();
        this.f701au = new C0505tv(this);
        this.f702av = new C0572wy(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f658K, i, 0);
            this.f671N = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f671N = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f688ah = viewConfiguration.getScaledTouchSlop();
        this.f691ak = viewConfiguration.getScaledHorizontalScrollFactor();
        this.f692al = viewConfiguration.getScaledVerticalScrollFactor();
        this.f689ai = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f690aj = viewConfiguration.getScaledMaximumFlingVelocity();
        if (getOverScrollMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        this.f724x.f9806h = this.f695ao;
        this.f705e = new C0502ts(new C0428qi(this));
        this.f706f = new C0457rp(new C0459rr(this));
        if (C0315jm.m4634i(this) == 0) {
            C0315jm.m4604D(this);
        }
        if (C0315jm.m4633h(this) == 0) {
            C0315jm.m4627c(this, 1);
        }
        this.f677T = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f667F = new C0766uy(this);
        C0315jm.m4618a((View) this, this.f667F);
        if (attributeSet != null) {
            StringBuilder stringBuilder2;
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C0385nl.f9434a, i, 0);
            String string = obtainStyledAttributes2.getString(C0385nl.f9441h);
            if (obtainStyledAttributes2.getInt(C0385nl.f9435b, -1) == -1) {
                setDescendantFocusability(262144);
            }
            this.f673P = obtainStyledAttributes2.getBoolean(C0385nl.f9436c, false);
            if (this.f673P) {
                StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes2.getDrawable(C0385nl.f9439f);
                Drawable drawable = obtainStyledAttributes2.getDrawable(C0385nl.f9440g);
                StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes2.getDrawable(C0385nl.f9437d);
                Drawable drawable2 = obtainStyledAttributes2.getDrawable(C0385nl.f9438e);
                if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Trying to set fast scroller without both required drawables.");
                    stringBuilder2.append(mo1154g());
                    throw new IllegalArgumentException(stringBuilder2.toString());
                }
                Resources resources = getContext().getResources();
                C0754sk c0754sk = new C0754sk(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
            }
            obtainStyledAttributes2.recycle();
            if (string != null) {
                String trim = string.trim();
                if (!trim.isEmpty()) {
                    String stringBuilder3;
                    if (trim.charAt(0) == '.') {
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(context.getPackageName());
                        stringBuilder2.append(trim);
                        stringBuilder3 = stringBuilder2.toString();
                    } else if (trim.contains(".")) {
                        stringBuilder3 = trim;
                    } else {
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(RecyclerView.class.getPackage().getName());
                        stringBuilder2.append('.');
                        stringBuilder2.append(trim);
                        stringBuilder3 = stringBuilder2.toString();
                    }
                    try {
                        ClassLoader classLoader;
                        Constructor constructor;
                        Object[] objArr;
                        if (isInEditMode()) {
                            classLoader = getClass().getClassLoader();
                        } else {
                            classLoader = context.getClassLoader();
                        }
                        Class asSubclass = classLoader.loadClass(stringBuilder3).asSubclass(C0517ug.class);
                        try {
                            constructor = asSubclass.getConstructor(f659L);
                            objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(0)};
                        } catch (Throwable e) {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        }
                        constructor.setAccessible(true);
                        mo1119a((C0517ug) constructor.newInstance(objArr));
                    } catch (Throwable e2) {
                        e2.initCause(e);
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(attributeSet.getPositionDescription());
                        stringBuilder.append(": Error creating LayoutManager ");
                        stringBuilder.append(stringBuilder3);
                        throw new IllegalStateException(stringBuilder.toString(), e2);
                    } catch (Throwable e3) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(attributeSet.getPositionDescription());
                        stringBuilder.append(": Unable to find LayoutManager ");
                        stringBuilder.append(stringBuilder3);
                        throw new IllegalStateException(stringBuilder.toString(), e3);
                    } catch (Throwable e32) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(attributeSet.getPositionDescription());
                        stringBuilder.append(": Could not instantiate the LayoutManager: ");
                        stringBuilder.append(stringBuilder3);
                        throw new IllegalStateException(stringBuilder.toString(), e32);
                    } catch (Throwable e322) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(attributeSet.getPositionDescription());
                        stringBuilder.append(": Could not instantiate the LayoutManager: ");
                        stringBuilder.append(stringBuilder3);
                        throw new IllegalStateException(stringBuilder.toString(), e322);
                    } catch (Throwable e3222) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(attributeSet.getPositionDescription());
                        stringBuilder.append(": Cannot access non-public constructor ");
                        stringBuilder.append(stringBuilder3);
                        throw new IllegalStateException(stringBuilder.toString(), e3222);
                    } catch (Throwable e32222) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(attributeSet.getPositionDescription());
                        stringBuilder.append(": Class is not a LayoutManager ");
                        stringBuilder.append(stringBuilder3);
                        throw new IllegalStateException(stringBuilder.toString(), e32222);
                    }
                }
            }
            if (VERSION.SDK_INT >= 21) {
                TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f657J, i, 0);
                z = obtainStyledAttributes3.getBoolean(0, true);
                obtainStyledAttributes3.recycle();
            } else {
                z = true;
            }
        } else {
            setDescendantFocusability(262144);
            z = true;
        }
        setNestedScrollingEnabled(z);
    }

    /* renamed from: a */
    public final void mo1120a(C0530ux c0530ux) {
        View view = c0530ux.f9877a;
        RecyclerView parent = view.getParent();
        this.f704d.mo11297b(m456e(view));
        if (c0530ux.mo11328l()) {
            this.f706f.mo11030a(view, -1, view.getLayoutParams(), true);
        } else if (parent != this) {
            this.f706f.mo11031a(view, -1, true);
        } else {
            C0457rp c0457rp = this.f706f;
            int a = c0457rp.f9647a.mo11047a(view);
            if (a < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("view is not a child, cannot hide ");
                stringBuilder.append(view);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            c0457rp.f9648b.mo11045e(a);
            c0457rp.mo11029a(view);
        }
    }

    /* renamed from: a */
    public final void mo1117a(String str) {
        StringBuilder stringBuilder;
        if (m465x()) {
            if (str == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Cannot call this method while RecyclerView is computing a layout or scrolling");
                stringBuilder.append(mo1154g());
                throw new IllegalStateException(stringBuilder.toString());
            }
            throw new IllegalStateException(str);
        } else if (this.f680W > 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(mo1154g());
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(stringBuilder.toString()));
        }
    }

    /* renamed from: q */
    private final void m458q() {
        m440A();
        mo1127b(0);
    }

    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C0519uk) && this.f711k.mo11238a((C0519uk) layoutParams);
    }

    /* renamed from: b */
    public static void m452b(C0530ux c0530ux) {
        WeakReference weakReference = c0530ux.f9878b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != c0530ux.f9877a) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            c0530ux.f9878b = null;
        }
    }

    /* renamed from: r */
    private final void m459r() {
        int i = 0;
        int b = this.f706f.mo11032b();
        for (int i2 = 0; i2 < b; i2++) {
            C0530ux c = RecyclerView.m453c(this.f706f.mo11037d(i2));
            if (!c.mo11332p()) {
                c.mo11310a();
            }
        }
        C0524up c0524up = this.f704d;
        int size = c0524up.f9844c.size();
        for (b = 0; b < size; b++) {
            ((C0530ux) c0524up.f9844c.get(b)).mo11310a();
        }
        size = c0524up.f9842a.size();
        for (b = 0; b < size; b++) {
            ((C0530ux) c0524up.f9842a.get(b)).mo11310a();
        }
        ArrayList arrayList = c0524up.f9843b;
        if (arrayList != null) {
            b = arrayList.size();
            while (i < b) {
                ((C0530ux) c0524up.f9843b.get(i)).mo11310a();
                i++;
            }
        }
    }

    public int computeHorizontalScrollExtent() {
        C0517ug c0517ug = this.f711k;
        if (c0517ug != null && c0517ug.mo11263h()) {
            return this.f711k.mo11241b(this.f662A);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        C0517ug c0517ug = this.f711k;
        if (c0517ug != null && c0517ug.mo11263h()) {
            return this.f711k.mo11246c(this.f662A);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        C0517ug c0517ug = this.f711k;
        if (c0517ug != null && c0517ug.mo11263h()) {
            return this.f711k.mo11251d(this.f662A);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        C0517ug c0517ug = this.f711k;
        if (c0517ug != null && c0517ug.mo11264i()) {
            return this.f711k.mo11255e(this.f662A);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        C0517ug c0517ug = this.f711k;
        if (c0517ug != null && c0517ug.mo11264i()) {
            return this.f711k.mo11258f(this.f662A);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        C0517ug c0517ug = this.f711k;
        if (c0517ug != null && c0517ug.mo11264i()) {
            return this.f711k.mo11261g(this.f662A);
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo1114a(int i, int i2) {
        int i3 = 0;
        EdgeEffect edgeEffect = this.f720t;
        if (!(edgeEffect == null || edgeEffect.isFinished() || i <= 0)) {
            this.f720t.onRelease();
            i3 = this.f720t.isFinished();
        }
        edgeEffect = this.f722v;
        if (!(edgeEffect == null || edgeEffect.isFinished() || i >= 0)) {
            this.f722v.onRelease();
            i3 |= this.f722v.isFinished();
        }
        edgeEffect = this.f721u;
        if (!(edgeEffect == null || edgeEffect.isFinished() || i2 <= 0)) {
            this.f721u.onRelease();
            i3 |= this.f721u.isFinished();
        }
        edgeEffect = this.f723w;
        if (!(edgeEffect == null || edgeEffect.isFinished() || i2 >= 0)) {
            this.f723w.onRelease();
            i3 |= this.f723w.isFinished();
        }
        if (i3 != 0) {
            C0315jm.m4601A(this);
        }
    }

    /* renamed from: a */
    public final void mo1113a() {
        if (!this.f717q || this.f719s) {
            Trace.beginSection("RV FullInvalidate");
            m460s();
            Trace.endSection();
        } else if (this.f705e.mo11165b() && this.f705e.mo11165b()) {
            Trace.beginSection("RV FullInvalidate");
            m460s();
            Trace.endSection();
        }
    }

    /* renamed from: b */
    public final void mo1128b(int i, int i2) {
        setMeasuredDimension(C0517ug.m5977a(i, getPaddingLeft() + getPaddingRight(), C0315jm.m4637l(this)), C0517ug.m5977a(i2, getPaddingTop() + getPaddingBottom(), C0315jm.m4636k(this)));
    }

    /* JADX WARNING: Missing block: B:111:0x0296, code:
            if (r10.f706f.mo11036c(getFocusedChild()) != false) goto L_0x0298;
     */
    /* renamed from: s */
    private final void m460s() {
        /*
        r10 = this;
        r0 = r10.f710j;
        if (r0 != 0) goto L_0x000c;
    L_0x0004:
        r0 = "RecyclerView";
        r1 = "No adapter attached; skipping layout";
        android.util.Log.e(r0, r1);
    L_0x000b:
        return;
    L_0x000c:
        r0 = r10.f711k;
        if (r0 != 0) goto L_0x0018;
    L_0x0010:
        r0 = "RecyclerView";
        r1 = "No layout manager attached; skipping layout";
        android.util.Log.e(r0, r1);
        goto L_0x000b;
    L_0x0018:
        r0 = r10.f662A;
        r1 = 0;
        r0.f9863i = r1;
        r0 = r0.f9858d;
        r1 = 1;
        if (r0 != r1) goto L_0x0381;
    L_0x0022:
        r10.m461t();
        r0 = r10.f711k;
        r0.mo11227a(r10);
        r10.m462u();
    L_0x002d:
        r0 = r10.f662A;
        r1 = 4;
        r0.mo11305a(r1);
        r10.mo1182p();
        r10.mo1167m();
        r0 = r10.f662A;
        r1 = 1;
        r0.f9858d = r1;
        r0 = r0.f9864j;
        if (r0 == 0) goto L_0x01fe;
    L_0x0042:
        r0 = r10.f706f;
        r0 = r0.mo11027a();
        r0 = r0 + -1;
        r2 = r0;
    L_0x004b:
        if (r2 < 0) goto L_0x0164;
    L_0x004d:
        r0 = r10.f706f;
        r0 = r0.mo11034b(r2);
        r3 = android.support.p002v7.widget.RecyclerView.m453c(r0);
        r0 = r3.mo11332p();
        if (r0 == 0) goto L_0x0061;
    L_0x005d:
        r0 = r2 + -1;
        r2 = r0;
        goto L_0x004b;
    L_0x0061:
        r4 = r10.m454d(r3);
        r1 = p000.C0512ub.m5961f();
        r0 = r3.f9877a;
        r6 = r0.getLeft();
        r1.f9812a = r6;
        r6 = r0.getTop();
        r1.f9813b = r6;
        r0.getRight();
        r0.getBottom();
        r0 = r10.f707g;
        r0 = r0.f9972b;
        r0 = r0.mo8629b(r4);
        r0 = (p000.C0530ux) r0;
        if (r0 == 0) goto L_0x015d;
    L_0x0089:
        r6 = r0.mo11332p();
        if (r6 != 0) goto L_0x015d;
    L_0x008f:
        r6 = r10.f707g;
        r6 = r6.mo11478b(r0);
        r7 = r10.f707g;
        r7 = r7.mo11478b(r3);
        if (r6 == 0) goto L_0x00a5;
    L_0x009d:
        if (r0 != r3) goto L_0x00a5;
    L_0x009f:
        r0 = r10.f707g;
        r0.mo11476a(r3, r1);
        goto L_0x005d;
    L_0x00a5:
        r8 = r10.f707g;
        r9 = 4;
        r8 = r8.mo11472a(r0, r9);
        r9 = r10.f707g;
        r9.mo11476a(r3, r1);
        r1 = r10.f707g;
        r9 = 8;
        r1 = r1.mo11472a(r3, r9);
        if (r8 != 0) goto L_0x0130;
    L_0x00bb:
        r1 = r10.f706f;
        r6 = r1.mo11027a();
        r1 = 0;
    L_0x00c2:
        if (r1 >= r6) goto L_0x0109;
    L_0x00c4:
        r7 = r10.f706f;
        r7 = r7.mo11034b(r1);
        r7 = android.support.p002v7.widget.RecyclerView.m453c(r7);
        if (r7 == r3) goto L_0x0106;
    L_0x00d0:
        r8 = r10.m454d(r7);
        r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
        if (r8 != 0) goto L_0x0106;
    L_0x00d8:
        r0 = r10.f710j;
        if (r0 == 0) goto L_0x03bf;
    L_0x00dc:
        r0 = r0.f9804b;
        if (r0 == 0) goto L_0x03bf;
    L_0x00e0:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:";
        r1.append(r2);
        r1.append(r7);
        r2 = " \n View Holder 2:";
        r1.append(r2);
        r1.append(r3);
        r2 = r10.mo1154g();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0106:
        r1 = r1 + 1;
        goto L_0x00c2;
    L_0x0109:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r4 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder ";
        r1.append(r4);
        r1.append(r0);
        r0 = " cannot be found but it is necessary for ";
        r1.append(r0);
        r1.append(r3);
        r0 = r10.mo1154g();
        r1.append(r0);
        r0 = "RecyclerView";
        r1 = r1.toString();
        android.util.Log.e(r0, r1);
        goto L_0x005d;
    L_0x0130:
        r4 = 0;
        r0.mo11316a(r4);
        if (r6 == 0) goto L_0x0139;
    L_0x0136:
        r10.mo1120a(r0);
    L_0x0139:
        if (r0 == r3) goto L_0x0150;
    L_0x013b:
        if (r7 == 0) goto L_0x0140;
    L_0x013d:
        r10.mo1120a(r3);
    L_0x0140:
        r0.f9884h = r3;
        r10.mo1120a(r0);
        r4 = r10.f704d;
        r4.mo11297b(r0);
        r4 = 0;
        r3.mo11316a(r4);
        r3.f9885i = r0;
    L_0x0150:
        r4 = r10.f724x;
        r0 = r4.mo11202a(r0, r3, r8, r1);
        if (r0 == 0) goto L_0x005d;
    L_0x0158:
        r10.mo1168n();
        goto L_0x005d;
    L_0x015d:
        r0 = r10.f707g;
        r0.mo11476a(r3, r1);
        goto L_0x005d;
    L_0x0164:
        r3 = r10.f707g;
        r4 = r10.f702av;
        r0 = r3.f9971a;
        r0 = r0.size();
        r0 = r0 + -1;
        r2 = r0;
    L_0x0171:
        if (r2 < 0) goto L_0x01fe;
    L_0x0173:
        r0 = r3.f9971a;
        r0 = r0.mo9195b(r2);
        r0 = (p000.C0530ux) r0;
        r1 = r3.f9971a;
        r1 = r1.mo9196c(r2);
        r1 = (p000.C0548vw) r1;
        r5 = r1.f9941a;
        r6 = r5 & 3;
        r7 = 3;
        if (r6 != r7) goto L_0x0194;
    L_0x018a:
        r4.mo11514a(r0);
    L_0x018d:
        p000.C0548vw.m6136a(r1);
        r0 = r2 + -1;
        r2 = r0;
        goto L_0x0171;
    L_0x0194:
        r6 = r5 & 1;
        if (r6 == 0) goto L_0x01a6;
    L_0x0198:
        r5 = r1.f9942b;
        if (r5 != 0) goto L_0x01a0;
    L_0x019c:
        r4.mo11514a(r0);
        goto L_0x018d;
    L_0x01a0:
        r6 = r1.f9943c;
        r4.mo11516b(r0, r5, r6);
        goto L_0x018d;
    L_0x01a6:
        r6 = r5 & 14;
        r7 = 14;
        if (r6 != r7) goto L_0x01b4;
    L_0x01ac:
        r5 = r1.f9942b;
        r6 = r1.f9943c;
        r4.mo11515a(r0, r5, r6);
        goto L_0x018d;
    L_0x01b4:
        r6 = r5 & 12;
        r7 = 12;
        if (r6 != r7) goto L_0x01e4;
    L_0x01ba:
        r5 = r1.f9942b;
        r6 = r1.f9943c;
        r7 = 0;
        r0.mo11316a(r7);
        r7 = r4.f9999a;
        r8 = r7.f719s;
        if (r8 == 0) goto L_0x01d6;
    L_0x01c8:
        r7 = r7.f724x;
        r0 = r7.mo11202a(r0, r0, r5, r6);
        if (r0 == 0) goto L_0x018d;
    L_0x01d0:
        r0 = r4.f9999a;
        r0.mo1168n();
        goto L_0x018d;
    L_0x01d6:
        r7 = r7.f724x;
        r0 = r7.mo11207c(r0, r5, r6);
        if (r0 == 0) goto L_0x018d;
    L_0x01de:
        r0 = r4.f9999a;
        r0.mo1168n();
        goto L_0x018d;
    L_0x01e4:
        r6 = r5 & 4;
        if (r6 == 0) goto L_0x01ef;
    L_0x01e8:
        r5 = r1.f9942b;
        r6 = 0;
        r4.mo11516b(r0, r5, r6);
        goto L_0x018d;
    L_0x01ef:
        r5 = r5 & 8;
        if (r5 == 0) goto L_0x01fb;
    L_0x01f3:
        r5 = r1.f9942b;
        r6 = r1.f9943c;
        r4.mo11515a(r0, r5, r6);
        goto L_0x018d;
    L_0x01fb:
        r0 = r1.f9941a;
        goto L_0x018d;
    L_0x01fe:
        r0 = r10.f711k;
        r1 = r10.f704d;
        r0.mo11245b(r1);
        r0 = r10.f662A;
        r1 = r0.f9859e;
        r0.f9856b = r1;
        r1 = 0;
        r10.f719s = r1;
        r1 = 0;
        r10.f678U = r1;
        r1 = 0;
        r0.f9864j = r1;
        r1 = 0;
        r0.f9865k = r1;
        r0 = r10.f704d;
        r0 = r0.f9843b;
        if (r0 == 0) goto L_0x0220;
    L_0x021d:
        r0.clear();
    L_0x0220:
        r0 = r10.f711k;
        r1 = r0.f9823m;
        if (r1 == 0) goto L_0x0231;
    L_0x0226:
        r1 = 0;
        r0.f9822l = r1;
        r1 = 0;
        r0.f9823m = r1;
        r0 = r10.f704d;
        r0.mo11300d();
    L_0x0231:
        r0 = r10.f711k;
        r1 = r10.f662A;
        r0.mo11235a(r1);
        r0 = 1;
        r10.mo1122a(r0);
        r0 = 0;
        r10.mo1134c(r0);
        r0 = r10.f707g;
        r0.mo11473a();
        r0 = r10.f696ap;
        r1 = 0;
        r1 = r0[r1];
        r2 = 1;
        r2 = r0[r2];
        r10.m448a(r0);
        r0 = r10.f696ap;
        r3 = 0;
        r3 = r0[r3];
        if (r3 != r1) goto L_0x037e;
    L_0x0257:
        r1 = 1;
        r0 = r0[r1];
        if (r0 != r2) goto L_0x037b;
    L_0x025c:
        r0 = 0;
    L_0x025d:
        if (r0 == 0) goto L_0x0262;
    L_0x025f:
        r10.mo1126b();
    L_0x0262:
        r0 = r10.f693am;
        if (r0 == 0) goto L_0x02e2;
    L_0x0266:
        r0 = r10.f710j;
        if (r0 == 0) goto L_0x02e2;
    L_0x026a:
        r0 = r10.hasFocus();
        if (r0 == 0) goto L_0x02e2;
    L_0x0270:
        r0 = r10.getDescendantFocusability();
        r1 = 393216; // 0x60000 float:5.51013E-40 double:1.942745E-318;
        if (r0 == r1) goto L_0x02e2;
    L_0x0278:
        r0 = r10.getDescendantFocusability();
        r1 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        if (r0 != r1) goto L_0x0286;
    L_0x0280:
        r0 = r10.isFocused();
        if (r0 != 0) goto L_0x02e2;
    L_0x0286:
        r0 = r10.isFocused();
        if (r0 != 0) goto L_0x0298;
    L_0x028c:
        r0 = r10.getFocusedChild();
        r1 = r10.f706f;
        r0 = r1.mo11036c(r0);
        if (r0 == 0) goto L_0x02e2;
    L_0x0298:
        r0 = r10.f662A;
        r4 = r0.f9867m;
        r0 = -1;
        r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r0 == 0) goto L_0x0378;
    L_0x02a2:
        r0 = r10.f710j;
        r1 = r0.f9804b;
        if (r1 != 0) goto L_0x0333;
    L_0x02a8:
        r0 = 0;
    L_0x02a9:
        if (r0 == 0) goto L_0x02bd;
    L_0x02ab:
        r1 = r10.f706f;
        r2 = r0.f9877a;
        r1 = r1.mo11036c(r2);
        if (r1 != 0) goto L_0x02bd;
    L_0x02b5:
        r1 = r0.f9877a;
        r1 = r1.hasFocusable();
        if (r1 != 0) goto L_0x0330;
    L_0x02bd:
        r0 = r10.f706f;
        r0 = r0.mo11027a();
        if (r0 > 0) goto L_0x02ed;
    L_0x02c5:
        r1 = 0;
    L_0x02c6:
        if (r1 == 0) goto L_0x02e2;
    L_0x02c8:
        r0 = r10.f662A;
        r0 = r0.f9868n;
        r2 = (long) r0;
        r4 = -1;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 == 0) goto L_0x02eb;
    L_0x02d3:
        r0 = r1.findViewById(r0);
        if (r0 == 0) goto L_0x02e9;
    L_0x02d9:
        r2 = r0.isFocusable();
        if (r2 == 0) goto L_0x02e7;
    L_0x02df:
        r0.requestFocus();
    L_0x02e2:
        r10.m467z();
        goto L_0x000b;
    L_0x02e7:
        r0 = r1;
        goto L_0x02df;
    L_0x02e9:
        r0 = r1;
        goto L_0x02df;
    L_0x02eb:
        r0 = r1;
        goto L_0x02df;
    L_0x02ed:
        r1 = r10.f662A;
        r0 = r1.f9866l;
        r2 = -1;
        if (r0 != r2) goto L_0x02f5;
    L_0x02f4:
        r0 = 0;
    L_0x02f5:
        r2 = r1.mo11304a();
        r1 = r0;
    L_0x02fa:
        if (r1 >= r2) goto L_0x0310;
    L_0x02fc:
        r3 = r10.mo1112a(r1);
        if (r3 == 0) goto L_0x0310;
    L_0x0302:
        r4 = r3.f9877a;
        r4 = r4.hasFocusable();
        if (r4 == 0) goto L_0x030d;
    L_0x030a:
        r1 = r3.f9877a;
        goto L_0x02c6;
    L_0x030d:
        r1 = r1 + 1;
        goto L_0x02fa;
    L_0x0310:
        r0 = java.lang.Math.min(r2, r0);
        r0 = r0 + -1;
    L_0x0316:
        if (r0 < 0) goto L_0x032e;
    L_0x0318:
        r1 = r10.mo1112a(r0);
        if (r1 == 0) goto L_0x032c;
    L_0x031e:
        r2 = r1.f9877a;
        r2 = r2.hasFocusable();
        if (r2 == 0) goto L_0x0329;
    L_0x0326:
        r1 = r1.f9877a;
        goto L_0x02c6;
    L_0x0329:
        r0 = r0 + -1;
        goto L_0x0316;
    L_0x032c:
        r1 = 0;
        goto L_0x02c6;
    L_0x032e:
        r1 = 0;
        goto L_0x02c6;
    L_0x0330:
        r1 = r0.f9877a;
        goto L_0x02c6;
    L_0x0333:
        if (r0 == 0) goto L_0x0375;
    L_0x0335:
        if (r1 == 0) goto L_0x0372;
    L_0x0337:
        r0 = r10.f706f;
        r3 = r0.mo11032b();
        r1 = 0;
        r0 = 0;
        r2 = r0;
    L_0x0340:
        if (r2 >= r3) goto L_0x036f;
    L_0x0342:
        r0 = r10.f706f;
        r0 = r0.mo11037d(r2);
        r0 = android.support.p002v7.widget.RecyclerView.m453c(r0);
        if (r0 == 0) goto L_0x036d;
    L_0x034e:
        r6 = r0.mo11326j();
        if (r6 == 0) goto L_0x035a;
    L_0x0354:
        r0 = r1;
    L_0x0355:
        r1 = r2 + 1;
        r2 = r1;
        r1 = r0;
        goto L_0x0340;
    L_0x035a:
        r6 = r0.f9881e;
        r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r6 != 0) goto L_0x036b;
    L_0x0360:
        r1 = r10.f706f;
        r6 = r0.f9877a;
        r1 = r1.mo11036c(r6);
        if (r1 == 0) goto L_0x02a9;
    L_0x036a:
        goto L_0x0355;
    L_0x036b:
        r0 = r1;
        goto L_0x0355;
    L_0x036d:
        r0 = r1;
        goto L_0x0355;
    L_0x036f:
        r0 = r1;
        goto L_0x02a9;
    L_0x0372:
        r0 = 0;
        goto L_0x02a9;
    L_0x0375:
        r0 = 0;
        goto L_0x02a9;
    L_0x0378:
        r0 = 0;
        goto L_0x02a9;
    L_0x037b:
        r0 = 1;
        goto L_0x025d;
    L_0x037e:
        r0 = 1;
        goto L_0x025d;
    L_0x0381:
        r0 = r10.f705e;
        r1 = r0.f9794b;
        r1 = r1.isEmpty();
        if (r1 != 0) goto L_0x03bd;
    L_0x038b:
        r0 = r0.f9793a;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x03bb;
    L_0x0393:
        r0 = 1;
    L_0x0394:
        if (r0 != 0) goto L_0x03aa;
    L_0x0396:
        r0 = r10.f711k;
        r0 = r0.f9826p;
        r1 = r10.getWidth();
        if (r0 != r1) goto L_0x03aa;
    L_0x03a0:
        r0 = r10.f711k;
        r0 = r0.f9827q;
        r1 = r10.getHeight();
        if (r0 == r1) goto L_0x03b4;
    L_0x03aa:
        r0 = r10.f711k;
        r0.mo11227a(r10);
        r10.m462u();
        goto L_0x002d;
    L_0x03b4:
        r0 = r10.f711k;
        r0.mo11227a(r10);
        goto L_0x002d;
    L_0x03bb:
        r0 = 0;
        goto L_0x0394;
    L_0x03bd:
        r0 = 0;
        goto L_0x0394;
    L_0x03bf:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:";
        r1.append(r2);
        r1.append(r7);
        r2 = " \n View Holder 2:";
        r1.append(r2);
        r1.append(r3);
        r2 = r10.mo1154g();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.s():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:318:0x01ff A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* renamed from: t */
    private final void m461t() {
        /*
        r15 = this;
        r0 = r15.f662A;
        r1 = 1;
        r0.mo11305a(r1);
        r15.m463v();
        r0 = r15.f662A;
        r1 = 0;
        r0.f9863i = r1;
        r15.mo1182p();
        r0 = r15.f707g;
        r0.mo11473a();
        r15.mo1167m();
        r0 = r15.f719s;
        if (r0 == 0) goto L_0x002b;
    L_0x001d:
        r0 = r15.f705e;
        r0.mo11166c();
        r0 = r15.f678U;
        if (r0 == 0) goto L_0x002b;
    L_0x0026:
        r0 = r15.f711k;
        r0.mo11248c();
    L_0x002b:
        r0 = r15.m466y();
        if (r0 == 0) goto L_0x0540;
    L_0x0031:
        r8 = r15.f705e;
        r6 = r8.f9796d;
        r7 = r8.f9793a;
    L_0x0037:
        r0 = r7.size();
        r2 = r0 + -1;
        r1 = 0;
    L_0x003e:
        if (r2 < 0) goto L_0x053c;
    L_0x0040:
        r0 = r7.get(r2);
        r0 = (p000.C0429qj) r0;
        r0 = r0.f9551a;
        r3 = 8;
        if (r0 != r3) goto L_0x0539;
    L_0x004c:
        if (r1 != 0) goto L_0x0053;
    L_0x004e:
        r0 = r1;
    L_0x004f:
        r2 = r2 + -1;
        r1 = r0;
        goto L_0x003e;
    L_0x0053:
        r5 = r2;
    L_0x0054:
        r0 = -1;
        if (r5 == r0) goto L_0x01ff;
    L_0x0057:
        r9 = r5 + 1;
        r0 = r7.get(r5);
        r0 = (p000.C0429qj) r0;
        r1 = r7.get(r9);
        r1 = (p000.C0429qj) r1;
        r2 = r1.f9551a;
        switch(r2) {
            case 1: goto L_0x006b;
            case 2: goto L_0x0092;
            case 3: goto L_0x006a;
            case 4: goto L_0x0195;
            default: goto L_0x006a;
        };
    L_0x006a:
        goto L_0x0037;
    L_0x006b:
        r3 = r0.f9554d;
        r4 = r1.f9552b;
        if (r3 >= r4) goto L_0x01fc;
    L_0x0071:
        r2 = -1;
    L_0x0072:
        r10 = r0.f9552b;
        if (r10 >= r4) goto L_0x0078;
    L_0x0076:
        r2 = r2 + 1;
    L_0x0078:
        if (r4 > r10) goto L_0x007f;
    L_0x007a:
        r4 = r1.f9554d;
        r4 = r4 + r10;
        r0.f9552b = r4;
    L_0x007f:
        r4 = r1.f9552b;
        if (r4 > r3) goto L_0x0088;
    L_0x0083:
        r10 = r1.f9554d;
        r3 = r3 + r10;
        r0.f9554d = r3;
    L_0x0088:
        r2 = r2 + r4;
        r1.f9552b = r2;
        r7.set(r5, r1);
        r7.set(r9, r0);
        goto L_0x0037;
    L_0x0092:
        r2 = r0.f9552b;
        r4 = r0.f9554d;
        if (r2 >= r4) goto L_0x017e;
    L_0x0098:
        r3 = r1.f9552b;
        if (r3 != r2) goto L_0x017a;
    L_0x009c:
        r3 = r1.f9554d;
        r2 = r4 - r2;
        if (r3 != r2) goto L_0x0176;
    L_0x00a2:
        r3 = 1;
        r2 = 0;
    L_0x00a4:
        r10 = r1.f9552b;
        if (r4 >= r10) goto L_0x0159;
    L_0x00a8:
        r4 = r10 + -1;
        r1.f9552b = r4;
    L_0x00ac:
        r4 = r0.f9552b;
        r10 = r1.f9552b;
        if (r4 > r10) goto L_0x013c;
    L_0x00b2:
        r4 = r10 + 1;
        r1.f9552b = r4;
        r4 = 0;
    L_0x00b7:
        if (r3 == 0) goto L_0x00c6;
    L_0x00b9:
        r7.set(r5, r1);
        r7.remove(r9);
        r1 = r6.f9792a;
        r1.mo11167c(r0);
        goto L_0x0037;
    L_0x00c6:
        if (r2 == 0) goto L_0x010d;
    L_0x00c8:
        if (r4 == 0) goto L_0x00e0;
    L_0x00ca:
        r2 = r0.f9552b;
        r3 = r4.f9552b;
        if (r2 <= r3) goto L_0x00d5;
    L_0x00d0:
        r3 = r4.f9554d;
        r2 = r2 - r3;
        r0.f9552b = r2;
    L_0x00d5:
        r2 = r0.f9554d;
        r3 = r4.f9552b;
        if (r2 <= r3) goto L_0x00e0;
    L_0x00db:
        r3 = r4.f9554d;
        r2 = r2 - r3;
        r0.f9554d = r2;
    L_0x00e0:
        r2 = r0.f9552b;
        r3 = r1.f9552b;
        if (r2 <= r3) goto L_0x00eb;
    L_0x00e6:
        r3 = r1.f9554d;
        r2 = r2 - r3;
        r0.f9552b = r2;
    L_0x00eb:
        r2 = r0.f9554d;
        r3 = r1.f9552b;
        if (r2 <= r3) goto L_0x00f6;
    L_0x00f1:
        r3 = r1.f9554d;
        r2 = r2 - r3;
        r0.f9554d = r2;
    L_0x00f6:
        r7.set(r5, r1);
        r1 = r0.f9552b;
        r2 = r0.f9554d;
        if (r1 == r2) goto L_0x0109;
    L_0x00ff:
        r7.set(r9, r0);
    L_0x0102:
        if (r4 == 0) goto L_0x0037;
    L_0x0104:
        r7.add(r5, r4);
        goto L_0x0037;
    L_0x0109:
        r7.remove(r9);
        goto L_0x0102;
    L_0x010d:
        if (r4 == 0) goto L_0x0125;
    L_0x010f:
        r2 = r0.f9552b;
        r3 = r4.f9552b;
        if (r2 < r3) goto L_0x011a;
    L_0x0115:
        r3 = r4.f9554d;
        r2 = r2 - r3;
        r0.f9552b = r2;
    L_0x011a:
        r2 = r0.f9554d;
        r3 = r4.f9552b;
        if (r2 < r3) goto L_0x0125;
    L_0x0120:
        r3 = r4.f9554d;
        r2 = r2 - r3;
        r0.f9554d = r2;
    L_0x0125:
        r2 = r0.f9552b;
        r3 = r1.f9552b;
        if (r2 < r3) goto L_0x0130;
    L_0x012b:
        r3 = r1.f9554d;
        r2 = r2 - r3;
        r0.f9552b = r2;
    L_0x0130:
        r2 = r0.f9554d;
        r3 = r1.f9552b;
        if (r2 < r3) goto L_0x00f6;
    L_0x0136:
        r3 = r1.f9554d;
        r2 = r2 - r3;
        r0.f9554d = r2;
        goto L_0x00f6;
    L_0x013c:
        r11 = r1.f9554d;
        r10 = r10 + r11;
        if (r4 < r10) goto L_0x0144;
    L_0x0141:
        r4 = 0;
        goto L_0x00b7;
    L_0x0144:
        r11 = r6.f9792a;
        r12 = 2;
        r13 = r4 + 1;
        r4 = r10 - r4;
        r10 = 0;
        r4 = r11.mo11160a(r12, r13, r4, r10);
        r10 = r0.f9552b;
        r11 = r1.f9552b;
        r10 = r10 - r11;
        r1.f9554d = r10;
        goto L_0x00b7;
    L_0x0159:
        r11 = r1.f9554d;
        r10 = r10 + r11;
        if (r4 >= r10) goto L_0x00ac;
    L_0x015e:
        r2 = r11 + -1;
        r1.f9554d = r2;
        r2 = 2;
        r0.f9551a = r2;
        r2 = 1;
        r0.f9554d = r2;
        r0 = r1.f9554d;
        if (r0 != 0) goto L_0x0037;
    L_0x016c:
        r7.remove(r9);
        r0 = r6.f9792a;
        r0.mo11167c(r1);
        goto L_0x0037;
    L_0x0176:
        r3 = 0;
        r2 = 0;
        goto L_0x00a4;
    L_0x017a:
        r3 = 0;
        r2 = 0;
        goto L_0x00a4;
    L_0x017e:
        r3 = r1.f9552b;
        r10 = r4 + 1;
        if (r3 != r10) goto L_0x0191;
    L_0x0184:
        r3 = r1.f9554d;
        r2 = r2 - r4;
        if (r3 != r2) goto L_0x018d;
    L_0x0189:
        r3 = 1;
        r2 = 1;
        goto L_0x00a4;
    L_0x018d:
        r3 = 0;
        r2 = 1;
        goto L_0x00a4;
    L_0x0191:
        r3 = 0;
        r2 = 1;
        goto L_0x00a4;
    L_0x0195:
        r2 = r0.f9554d;
        r3 = r1.f9552b;
        if (r2 >= r3) goto L_0x01e4;
    L_0x019b:
        r2 = r3 + -1;
        r1.f9552b = r2;
        r2 = 0;
    L_0x01a0:
        r3 = r0.f9552b;
        r4 = r1.f9552b;
        if (r3 > r4) goto L_0x01ca;
    L_0x01a6:
        r3 = r4 + 1;
        r1.f9552b = r3;
        r3 = 0;
    L_0x01ab:
        r7.set(r9, r0);
        r0 = r1.f9554d;
        if (r0 <= 0) goto L_0x01c1;
    L_0x01b2:
        r7.set(r5, r1);
    L_0x01b5:
        if (r2 == 0) goto L_0x01ba;
    L_0x01b7:
        r7.add(r5, r2);
    L_0x01ba:
        if (r3 == 0) goto L_0x0037;
    L_0x01bc:
        r7.add(r5, r3);
        goto L_0x0037;
    L_0x01c1:
        r7.remove(r5);
        r0 = r6.f9792a;
        r0.mo11167c(r1);
        goto L_0x01b5;
    L_0x01ca:
        r10 = r1.f9554d;
        r4 = r4 + r10;
        if (r3 >= r4) goto L_0x01e2;
    L_0x01cf:
        r4 = r4 - r3;
        r10 = r6.f9792a;
        r11 = 4;
        r3 = r3 + 1;
        r12 = r1.f9553c;
        r3 = r10.mo11160a(r11, r3, r4, r12);
        r10 = r1.f9554d;
        r4 = r10 - r4;
        r1.f9554d = r4;
        goto L_0x01ab;
    L_0x01e2:
        r3 = 0;
        goto L_0x01ab;
    L_0x01e4:
        r4 = r1.f9554d;
        r3 = r3 + r4;
        if (r2 < r3) goto L_0x01eb;
    L_0x01e9:
        r2 = 0;
        goto L_0x01a0;
    L_0x01eb:
        r2 = r4 + -1;
        r1.f9554d = r2;
        r2 = r6.f9792a;
        r3 = 4;
        r4 = r0.f9552b;
        r10 = 1;
        r11 = r1.f9553c;
        r2 = r2.mo11160a(r3, r4, r10, r11);
        goto L_0x01a0;
    L_0x01fc:
        r2 = 0;
        goto L_0x0072;
    L_0x01ff:
        r0 = r8.f9793a;
        r9 = r0.size();
        r0 = 0;
        r7 = r0;
    L_0x0207:
        if (r7 >= r9) goto L_0x02e0;
    L_0x0209:
        r0 = r8.f9793a;
        r0 = r0.get(r7);
        r0 = (p000.C0429qj) r0;
        r1 = r0.f9551a;
        switch(r1) {
            case 1: goto L_0x02db;
            case 2: goto L_0x0274;
            case 3: goto L_0x0216;
            case 4: goto L_0x021e;
            case 5: goto L_0x0216;
            case 6: goto L_0x0216;
            case 7: goto L_0x0216;
            case 8: goto L_0x021a;
            default: goto L_0x0216;
        };
    L_0x0216:
        r0 = r7 + 1;
        r7 = r0;
        goto L_0x0207;
    L_0x021a:
        r8.mo11164b(r0);
        goto L_0x0216;
    L_0x021e:
        r4 = r0.f9552b;
        r1 = r0.f9554d;
        r5 = r4 + r1;
        r2 = 0;
        r1 = -1;
        r3 = r4;
    L_0x0227:
        if (r4 >= r5) goto L_0x025c;
    L_0x0229:
        r6 = r8.f9795c;
        r6 = r6.mo10892a(r4);
        if (r6 != 0) goto L_0x0237;
    L_0x0231:
        r6 = r8.mo11163a(r4);
        if (r6 == 0) goto L_0x024b;
    L_0x0237:
        if (r1 != 0) goto L_0x0245;
    L_0x0239:
        r1 = 4;
        r6 = r0.f9553c;
        r1 = r8.mo11160a(r1, r3, r2, r6);
        r8.mo11162a(r1);
        r2 = 0;
        r3 = r4;
    L_0x0245:
        r1 = 1;
    L_0x0246:
        r2 = r2 + 1;
        r4 = r4 + 1;
        goto L_0x0227;
    L_0x024b:
        r6 = 1;
        if (r1 != r6) goto L_0x025a;
    L_0x024e:
        r1 = 4;
        r6 = r0.f9553c;
        r1 = r8.mo11160a(r1, r3, r2, r6);
        r8.mo11164b(r1);
        r2 = 0;
        r3 = r4;
    L_0x025a:
        r1 = 0;
        goto L_0x0246;
    L_0x025c:
        r4 = r0.f9554d;
        if (r2 == r4) goto L_0x026a;
    L_0x0260:
        r4 = r0.f9553c;
        r8.mo11167c(r0);
        r0 = 4;
        r0 = r8.mo11160a(r0, r3, r2, r4);
    L_0x026a:
        if (r1 != 0) goto L_0x0270;
    L_0x026c:
        r8.mo11162a(r0);
        goto L_0x0216;
    L_0x0270:
        r8.mo11164b(r0);
        goto L_0x0216;
    L_0x0274:
        r5 = r0.f9552b;
        r1 = r0.f9554d;
        r3 = r5 + r1;
        r1 = 0;
        r4 = -1;
        r2 = r5;
        r6 = r1;
    L_0x027e:
        if (r2 >= r3) goto L_0x02c2;
    L_0x0280:
        r1 = r8.f9795c;
        r1 = r1.mo10892a(r2);
        if (r1 != 0) goto L_0x028e;
    L_0x0288:
        r1 = r8.mo11163a(r2);
        if (r1 == 0) goto L_0x02b1;
    L_0x028e:
        if (r4 != 0) goto L_0x02af;
    L_0x0290:
        r1 = 2;
        r4 = 0;
        r1 = r8.mo11160a(r1, r5, r6, r4);
        r8.mo11162a(r1);
        r1 = 1;
    L_0x029a:
        r4 = 1;
    L_0x029b:
        if (r1 == 0) goto L_0x02a8;
    L_0x029d:
        r1 = r2 - r6;
        r2 = r3 - r6;
        r3 = 1;
    L_0x02a2:
        r1 = r1 + 1;
        r6 = r3;
        r3 = r2;
        r2 = r1;
        goto L_0x027e;
    L_0x02a8:
        r1 = r6 + 1;
        r14 = r2;
        r2 = r3;
        r3 = r1;
        r1 = r14;
        goto L_0x02a2;
    L_0x02af:
        r1 = 0;
        goto L_0x029a;
    L_0x02b1:
        r1 = 1;
        if (r4 != r1) goto L_0x02c0;
    L_0x02b4:
        r1 = 2;
        r4 = 0;
        r1 = r8.mo11160a(r1, r5, r6, r4);
        r8.mo11164b(r1);
        r1 = 1;
    L_0x02be:
        r4 = 0;
        goto L_0x029b;
    L_0x02c0:
        r1 = 0;
        goto L_0x02be;
    L_0x02c2:
        r1 = r0.f9554d;
        if (r6 == r1) goto L_0x02cf;
    L_0x02c6:
        r8.mo11167c(r0);
        r0 = 2;
        r1 = 0;
        r0 = r8.mo11160a(r0, r5, r6, r1);
    L_0x02cf:
        if (r4 != 0) goto L_0x02d6;
    L_0x02d1:
        r8.mo11162a(r0);
        goto L_0x0216;
    L_0x02d6:
        r8.mo11164b(r0);
        goto L_0x0216;
    L_0x02db:
        r8.mo11164b(r0);
        goto L_0x0216;
    L_0x02e0:
        r0 = r8.f9793a;
        r0.clear();
    L_0x02e5:
        r0 = r15.f664C;
        if (r0 != 0) goto L_0x0536;
    L_0x02e9:
        r0 = r15.f665D;
        if (r0 != 0) goto L_0x0533;
    L_0x02ed:
        r0 = 0;
    L_0x02ee:
        r2 = r15.f662A;
        r1 = r15.f717q;
        if (r1 == 0) goto L_0x0530;
    L_0x02f4:
        r1 = r15.f724x;
        if (r1 == 0) goto L_0x052d;
    L_0x02f8:
        r1 = r15.f719s;
        if (r1 == 0) goto L_0x0528;
    L_0x02fc:
        if (r1 == 0) goto L_0x0525;
    L_0x02fe:
        r1 = r15.f710j;
        r1 = r1.f9804b;
        if (r1 == 0) goto L_0x0522;
    L_0x0304:
        r1 = 1;
    L_0x0305:
        r2.f9864j = r1;
        r1 = r2.f9864j;
        if (r1 == 0) goto L_0x051f;
    L_0x030b:
        if (r0 == 0) goto L_0x051c;
    L_0x030d:
        r0 = r15.f719s;
        if (r0 != 0) goto L_0x0519;
    L_0x0311:
        r0 = r15.m466y();
        if (r0 == 0) goto L_0x0516;
    L_0x0317:
        r0 = 1;
    L_0x0318:
        r2.f9865k = r0;
        r0 = r15.f693am;
        if (r0 == 0) goto L_0x0513;
    L_0x031e:
        r0 = r15.hasFocus();
        if (r0 == 0) goto L_0x0510;
    L_0x0324:
        r0 = r15.f710j;
        if (r0 == 0) goto L_0x050d;
    L_0x0328:
        r0 = r15.getFocusedChild();
    L_0x032c:
        if (r0 != 0) goto L_0x04fc;
    L_0x032e:
        r0 = 0;
        r2 = r0;
    L_0x0330:
        if (r2 != 0) goto L_0x04aa;
    L_0x0332:
        r15.m467z();
    L_0x0335:
        r1 = r15.f662A;
        r0 = r1.f9864j;
        if (r0 == 0) goto L_0x04a7;
    L_0x033b:
        r0 = r15.f665D;
        if (r0 == 0) goto L_0x04a4;
    L_0x033f:
        r0 = 1;
    L_0x0340:
        r1.f9862h = r0;
        r0 = 0;
        r15.f665D = r0;
        r0 = 0;
        r15.f664C = r0;
        r0 = r1.f9865k;
        r1.f9861g = r0;
        r0 = r15.f710j;
        r0 = r0.mo11186a();
        r1.f9859e = r0;
        r0 = r15.f696ap;
        r15.m448a(r0);
        r0 = r15.f662A;
        r0 = r0.f9864j;
        if (r0 == 0) goto L_0x03d2;
    L_0x035f:
        r0 = r15.f706f;
        r1 = r0.mo11027a();
        r0 = 0;
    L_0x0366:
        if (r0 >= r1) goto L_0x03d2;
    L_0x0368:
        r2 = r15.f706f;
        r2 = r2.mo11034b(r0);
        r2 = android.support.p002v7.widget.RecyclerView.m453c(r2);
        r3 = r2.mo11332p();
        if (r3 != 0) goto L_0x0384;
    L_0x0378:
        r3 = r2.mo11324h();
        if (r3 == 0) goto L_0x0387;
    L_0x037e:
        r3 = r15.f710j;
        r3 = r3.f9804b;
        if (r3 != 0) goto L_0x0387;
    L_0x0384:
        r0 = r0 + 1;
        goto L_0x0366;
    L_0x0387:
        p000.C0512ub.m5960d(r2);
        r2.mo11323g();
        r3 = p000.C0512ub.m5961f();
        r4 = r2.f9877a;
        r5 = r4.getLeft();
        r3.f9812a = r5;
        r5 = r4.getTop();
        r3.f9813b = r5;
        r4.getRight();
        r4.getBottom();
        r4 = r15.f707g;
        r4.mo11477b(r2, r3);
        r3 = r15.f662A;
        r3 = r3.f9862h;
        if (r3 == 0) goto L_0x0384;
    L_0x03b0:
        r3 = r2.mo11329m();
        if (r3 == 0) goto L_0x0384;
    L_0x03b6:
        r3 = r2.mo11326j();
        if (r3 != 0) goto L_0x0384;
    L_0x03bc:
        r3 = r2.mo11332p();
        if (r3 != 0) goto L_0x0384;
    L_0x03c2:
        r3 = r2.mo11324h();
        if (r3 != 0) goto L_0x0384;
    L_0x03c8:
        r4 = r15.m454d(r2);
        r3 = r15.f707g;
        r3.mo11474a(r4, r2);
        goto L_0x0384;
    L_0x03d2:
        r0 = r15.f662A;
        r0 = r0.f9865k;
        if (r0 != 0) goto L_0x03e9;
    L_0x03d8:
        r15.m459r();
    L_0x03db:
        r0 = 1;
        r15.mo1122a(r0);
        r0 = 0;
        r15.mo1134c(r0);
        r0 = r15.f662A;
        r1 = 2;
        r0.f9858d = r1;
        return;
    L_0x03e9:
        r0 = r15.f706f;
        r1 = r0.mo11032b();
        r0 = 0;
    L_0x03f0:
        if (r0 >= r1) goto L_0x040f;
    L_0x03f2:
        r2 = r15.f706f;
        r2 = r2.mo11037d(r0);
        r2 = android.support.p002v7.widget.RecyclerView.m453c(r2);
        r3 = r2.mo11332p();
        if (r3 == 0) goto L_0x0405;
    L_0x0402:
        r0 = r0 + 1;
        goto L_0x03f0;
    L_0x0405:
        r3 = r2.f9880d;
        r4 = -1;
        if (r3 != r4) goto L_0x0402;
    L_0x040a:
        r3 = r2.f9879c;
        r2.f9880d = r3;
        goto L_0x0402;
    L_0x040f:
        r0 = r15.f662A;
        r1 = r0.f9860f;
        r2 = 0;
        r0.f9860f = r2;
        r2 = r15.f711k;
        r3 = r15.f704d;
        r2.mo11250c(r3, r0);
        r0 = r15.f662A;
        r0.f9860f = r1;
        r0 = 0;
        r1 = r0;
    L_0x0423:
        r0 = r15.f706f;
        r0 = r0.mo11027a();
        if (r1 >= r0) goto L_0x049f;
    L_0x042b:
        r0 = r15.f706f;
        r0 = r0.mo11034b(r1);
        r2 = android.support.p002v7.widget.RecyclerView.m453c(r0);
        r0 = r2.mo11332p();
        if (r0 != 0) goto L_0x0479;
    L_0x043b:
        r0 = r15.f707g;
        r0 = r0.f9971a;
        r0 = r0.get(r2);
        r0 = (p000.C0548vw) r0;
        if (r0 == 0) goto L_0x049d;
    L_0x0447:
        r0 = r0.f9941a;
        r0 = r0 & 4;
        if (r0 == 0) goto L_0x049b;
    L_0x044d:
        r0 = 1;
    L_0x044e:
        if (r0 != 0) goto L_0x0479;
    L_0x0450:
        p000.C0512ub.m5960d(r2);
        r0 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r0 = r2.mo11318b(r0);
        r2.mo11323g();
        r3 = p000.C0512ub.m5961f();
        r4 = r2.f9877a;
        r5 = r4.getLeft();
        r3.f9812a = r5;
        r5 = r4.getTop();
        r3.f9813b = r5;
        r4.getRight();
        r4.getBottom();
        if (r0 == 0) goto L_0x047d;
    L_0x0476:
        r15.mo1121a(r2, r3);
    L_0x0479:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0423;
    L_0x047d:
        r4 = r15.f707g;
        r0 = r4.f9971a;
        r0 = r0.get(r2);
        r0 = (p000.C0548vw) r0;
        if (r0 != 0) goto L_0x0492;
    L_0x0489:
        r0 = p000.C0548vw.m6135a();
        r4 = r4.f9971a;
        r4.put(r2, r0);
    L_0x0492:
        r2 = r0.f9941a;
        r2 = r2 | 2;
        r0.f9941a = r2;
        r0.f9942b = r3;
        goto L_0x0479;
    L_0x049b:
        r0 = 0;
        goto L_0x044e;
    L_0x049d:
        r0 = 0;
        goto L_0x044e;
    L_0x049f:
        r15.m459r();
        goto L_0x03db;
    L_0x04a4:
        r0 = 0;
        goto L_0x0340;
    L_0x04a7:
        r0 = 0;
        goto L_0x0340;
    L_0x04aa:
        r3 = r15.f662A;
        r0 = r15.f710j;
        r0 = r0.f9804b;
        if (r0 == 0) goto L_0x04f9;
    L_0x04b2:
        r0 = r2.f9881e;
    L_0x04b4:
        r3.f9867m = r0;
        r0 = r15.f719s;
        if (r0 != 0) goto L_0x04f7;
    L_0x04ba:
        r0 = r2.mo11326j();
        if (r0 == 0) goto L_0x04f2;
    L_0x04c0:
        r0 = r2.f9880d;
    L_0x04c2:
        r3.f9866l = r0;
        r3 = r15.f662A;
        r0 = r2.f9877a;
        r1 = r0.getId();
    L_0x04cc:
        r2 = r0.isFocused();
        if (r2 != 0) goto L_0x04ee;
    L_0x04d2:
        r2 = r0 instanceof android.view.ViewGroup;
        if (r2 == 0) goto L_0x04ee;
    L_0x04d6:
        r2 = r0.hasFocus();
        if (r2 == 0) goto L_0x04ee;
    L_0x04dc:
        r0 = (android.view.ViewGroup) r0;
        r0 = r0.getFocusedChild();
        r2 = r0.getId();
        r4 = -1;
        if (r2 == r4) goto L_0x04cc;
    L_0x04e9:
        r1 = r0.getId();
        goto L_0x04cc;
    L_0x04ee:
        r3.f9868n = r1;
        goto L_0x0335;
    L_0x04f2:
        r0 = r2.mo11321e();
        goto L_0x04c2;
    L_0x04f7:
        r0 = -1;
        goto L_0x04c2;
    L_0x04f9:
        r0 = -1;
        goto L_0x04b4;
    L_0x04fc:
        r0 = r15.mo1111a(r0);
        if (r0 == 0) goto L_0x0509;
    L_0x0502:
        r0 = r15.m456e(r0);
        r2 = r0;
        goto L_0x0330;
    L_0x0509:
        r0 = 0;
        r2 = r0;
        goto L_0x0330;
    L_0x050d:
        r0 = 0;
        goto L_0x032c;
    L_0x0510:
        r0 = 0;
        goto L_0x032c;
    L_0x0513:
        r0 = 0;
        goto L_0x032c;
    L_0x0516:
        r0 = 0;
        goto L_0x0318;
    L_0x0519:
        r0 = 0;
        goto L_0x0318;
    L_0x051c:
        r0 = 0;
        goto L_0x0318;
    L_0x051f:
        r0 = 0;
        goto L_0x0318;
    L_0x0522:
        r1 = 0;
        goto L_0x0305;
    L_0x0525:
        r1 = 1;
        goto L_0x0305;
    L_0x0528:
        if (r0 != 0) goto L_0x02fc;
    L_0x052a:
        r1 = 0;
        goto L_0x0305;
    L_0x052d:
        r1 = 0;
        goto L_0x0305;
    L_0x0530:
        r1 = 0;
        goto L_0x0305;
    L_0x0533:
        r0 = 1;
        goto L_0x02ee;
    L_0x0536:
        r0 = 1;
        goto L_0x02ee;
    L_0x0539:
        r0 = 1;
        goto L_0x004f;
    L_0x053c:
        r0 = -1;
        r5 = r0;
        goto L_0x0054;
    L_0x0540:
        r0 = r15.f705e;
        r0.mo11161a();
        goto L_0x02e5;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.t():void");
    }

    /* renamed from: u */
    private final void m462u() {
        boolean z;
        mo1182p();
        mo1167m();
        this.f662A.mo11305a(6);
        this.f705e.mo11161a();
        this.f662A.f9859e = this.f710j.mo11186a();
        C0528uv c0528uv = this.f662A;
        c0528uv.f9857c = 0;
        c0528uv.f9861g = false;
        this.f711k.mo11250c(this.f704d, c0528uv);
        C0528uv c0528uv2 = this.f662A;
        c0528uv2.f9860f = false;
        this.f670M = null;
        if (!c0528uv2.f9864j) {
            z = false;
        } else if (this.f724x != null) {
            z = true;
        } else {
            z = false;
        }
        c0528uv2.f9864j = z;
        c0528uv2.f9858d = 4;
        mo1122a(true);
        mo1134c(false);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return mo1161i().mo9420a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return mo1161i().mo9419a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return mo1161i().mo9424a(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: a */
    public final boolean mo1124a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return mo1161i().mo9424a(i, i2, iArr, iArr2, i3);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return mo1161i().mo9423a(i, i2, i3, i4, iArr, 0);
    }

    /* renamed from: a */
    public final boolean mo1123a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return mo1161i().mo9423a(i, i2, i3, i4, iArr, i5);
    }

    /* renamed from: b */
    public final void mo1126b() {
        this.f680W++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        List list = this.f663B;
        if (list != null) {
            for (scrollY = list.size() - 1; scrollY >= 0; scrollY--) {
                ((C0521um) this.f663B.get(scrollY)).mo11286a(this);
            }
        }
        this.f680W--;
    }

    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    protected void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = 1;
        int i4 = 0;
        super.draw(canvas);
        int size = this.f713m.size();
        for (i = 0; i < size; i++) {
            ((C0516uf) this.f713m.get(i)).mo11213a(canvas);
        }
        EdgeEffect edgeEffect = this.f720t;
        if (edgeEffect == null) {
            i2 = 0;
        } else if (edgeEffect.isFinished()) {
            i2 = 0;
        } else {
            i = canvas.save();
            if (this.f671N) {
                i2 = getPaddingBottom();
            } else {
                i2 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((float) (i2 + (-getHeight())), 0.0f);
            edgeEffect = this.f720t;
            if (edgeEffect == null) {
                i2 = 0;
            } else if (edgeEffect.draw(canvas)) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            canvas.restoreToCount(i);
        }
        EdgeEffect edgeEffect2 = this.f721u;
        if (edgeEffect2 == null) {
            i = i2;
        } else if (edgeEffect2.isFinished()) {
            i = i2;
        } else {
            size = canvas.save();
            if (this.f671N) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            edgeEffect2 = this.f721u;
            if (edgeEffect2 == null) {
                i = 0;
            } else if (edgeEffect2.draw(canvas)) {
                i = 1;
            } else {
                i = 0;
            }
            i2 |= i;
            canvas.restoreToCount(size);
            i = i2;
        }
        edgeEffect = this.f722v;
        if (!(edgeEffect == null || edgeEffect.isFinished())) {
            size = canvas.save();
            int width = getWidth();
            if (this.f671N) {
                i2 = getPaddingTop();
            } else {
                i2 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate((float) (-i2), (float) (-width));
            edgeEffect = this.f722v;
            if (edgeEffect == null) {
                i2 = 0;
            } else if (edgeEffect.draw(canvas)) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            i |= i2;
            canvas.restoreToCount(size);
        }
        edgeEffect = this.f723w;
        if (edgeEffect == null) {
            i2 = i;
        } else if (edgeEffect.isFinished()) {
            i2 = i;
        } else {
            i2 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f671N) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect3 = this.f723w;
            if (edgeEffect3 != null && edgeEffect3.draw(canvas)) {
                i4 = 1;
            }
            i |= i4;
            canvas.restoreToCount(i2);
            i2 = i;
        }
        if (i2 != 0) {
            i3 = i2;
        } else if (this.f724x == null) {
            i3 = i2;
        } else if (this.f713m.size() <= 0) {
            i3 = i2;
        } else if (!this.f724x.mo11206c()) {
            i3 = i2;
        }
        if (i3 != 0) {
            C0315jm.m4601A(this);
        }
    }

    /* renamed from: c */
    public final void mo1131c() {
        if (this.f723w == null) {
            this.f723w = C0511ua.m5959a(this);
            if (this.f671N) {
                this.f723w.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.f723w.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* renamed from: d */
    public final void mo1143d() {
        if (this.f720t == null) {
            this.f720t = C0511ua.m5959a(this);
            if (this.f671N) {
                this.f720t.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.f720t.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* renamed from: e */
    public final void mo1151e() {
        if (this.f722v == null) {
            this.f722v = C0511ua.m5959a(this);
            if (this.f671N) {
                this.f722v.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.f722v.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* renamed from: f */
    public final void mo1152f() {
        if (this.f721u == null) {
            this.f721u = C0511ua.m5959a(this);
            if (this.f671N) {
                this.f721u.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.f721u.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* renamed from: g */
    public final String mo1154g() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" ");
        stringBuilder.append(super.toString());
        stringBuilder.append(", adapter:");
        stringBuilder.append(this.f710j);
        stringBuilder.append(", layout:");
        stringBuilder.append(this.f711k);
        stringBuilder.append(", context:");
        stringBuilder.append(getContext());
        return stringBuilder.toString();
    }

    /* renamed from: v */
    private final void m463v() {
        if (this.f681aa == 2) {
            OverScroller overScroller = this.f694an.f9871c;
            overScroller.getFinalX();
            overScroller.getCurrX();
            overScroller.getFinalY();
            overScroller.getCurrY();
        }
    }

    /* renamed from: a */
    public final View mo1111a(View view) {
        RecyclerView parent = view.getParent();
        View view2 = view;
        while (parent != null && parent != this && (parent instanceof View)) {
            View view3 = parent;
            view2 = view3;
            ViewParent parent2 = view3.getParent();
        }
        return parent2 == this ? view2 : null;
    }

    /* renamed from: a */
    private final void m448a(int[] iArr) {
        int a = this.f706f.mo11027a();
        if (a != 0) {
            int i = LfuScheduler.MAX_PRIORITY;
            int i2 = kvl.UNSET_ENUM_VALUE;
            int i3 = 0;
            while (i3 < a) {
                C0530ux c = RecyclerView.m453c(this.f706f.mo11034b(i3));
                if (!c.mo11332p()) {
                    int f = c.mo11322f();
                    if (f < i) {
                        i = f;
                    }
                    if (f > i2) {
                        i2 = f;
                    }
                }
                i3++;
                i = i;
            }
            iArr[0] = i;
            iArr[1] = i2;
            return;
        }
        iArr[0] = -1;
        iArr[1] = -1;
    }

    /* renamed from: b */
    public static RecyclerView m451b(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView b = RecyclerView.m451b(viewGroup.getChildAt(i));
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final C0530ux mo1112a(int i) {
        if (this.f719s) {
            return null;
        }
        int b = this.f706f.mo11032b();
        int i2 = 0;
        C0530ux c0530ux = null;
        while (i2 < b) {
            C0530ux c = RecyclerView.m453c(this.f706f.mo11037d(i2));
            if (c == null) {
                c = c0530ux;
            } else if (c.mo11326j()) {
                c = c0530ux;
            } else if (mo1130c(c) != i) {
                c = c0530ux;
            } else if (!this.f706f.mo11036c(c.f9877a)) {
                return c;
            }
            i2++;
            c0530ux = c;
        }
        return c0530ux;
    }

    public View focusSearch(View view, int i) {
        int i2;
        View findNextFocus;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = this.f710j != null ? this.f711k != null ? !m465x() : false : false;
        FocusFinder instance = FocusFinder.getInstance();
        if (z3 && (i == 2 || i == 1)) {
            if (this.f711k.mo11264i()) {
                if (i == 2) {
                    i2 = ScriptIntrinsicBLAS.RsBlas_ctrsm;
                } else {
                    i2 = 33;
                }
                if (instance.findNextFocus(this, view, i2) == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            if (z3) {
                z3 = true;
            } else if (this.f711k.mo11263h()) {
                int i3;
                if (C0315jm.m4635j(this.f711k.f9817g) == 1) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                if (i == 2) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                if ((i2 ^ i3) == 0) {
                    i2 = 17;
                } else {
                    i2 = 66;
                }
                if (instance.findNextFocus(this, view, i2) == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            if (z3) {
                mo1113a();
                if (mo1111a(view) == null) {
                    return null;
                }
                mo1182p();
                this.f711k.mo11217a(view, i, this.f704d, this.f662A);
                mo1134c(false);
            }
            findNextFocus = instance.findNextFocus(this, view, i);
        } else {
            findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus == null && z3) {
                mo1113a();
                if (mo1111a(view) == null) {
                    return null;
                }
                mo1182p();
                findNextFocus = this.f711k.mo11217a(view, i, this.f704d, this.f662A);
                mo1134c(false);
            }
        }
        if (findNextFocus == null || findNextFocus.hasFocusable()) {
            if (!(findNextFocus == null || findNextFocus == this || mo1111a(findNextFocus) == null)) {
                if (view == null) {
                    z2 = true;
                } else if (mo1111a(view) != null) {
                    this.f708h.set(0, 0, view.getWidth(), view.getHeight());
                    this.f672O.set(0, 0, findNextFocus.getWidth(), findNextFocus.getHeight());
                    offsetDescendantRectToMyCoords(view, this.f708h);
                    offsetDescendantRectToMyCoords(findNextFocus, this.f672O);
                    if (C0315jm.m4635j(this.f711k.f9817g) == 1) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                    Rect rect = this.f708h;
                    int i4 = rect.left;
                    Rect rect2 = this.f672O;
                    if ((i4 < rect2.left || rect.right <= rect2.left) && rect.right < rect2.right) {
                        i4 = 1;
                    } else if (rect.right <= rect2.right && rect.left < rect2.right) {
                        i4 = 0;
                    } else if (rect.left > rect2.left) {
                        i4 = -1;
                    } else {
                        i4 = 0;
                    }
                    if ((rect.top < rect2.top || rect.bottom <= rect2.top) && rect.bottom < rect2.bottom) {
                        z = true;
                    } else if (rect.bottom <= rect2.bottom && rect.top < rect2.bottom) {
                        z = false;
                    } else if (rect.top <= rect2.top) {
                        z = false;
                    }
                    switch (i) {
                        case 1:
                            if (z < false) {
                                if (!z && r0 * i4 <= 0) {
                                    z2 = true;
                                    break;
                                }
                            }
                            z2 = true;
                            break;
                        case 2:
                            if (z > false) {
                                if (!z && r0 * i4 >= 0) {
                                    z2 = true;
                                    break;
                                }
                            }
                            z2 = true;
                            break;
                        case 17:
                            if (i4 < 0) {
                                z2 = true;
                                break;
                            }
                            break;
                        case 33:
                            if (z >= false) {
                                z2 = true;
                                break;
                            }
                            break;
                        case 66:
                            if (i4 > 0) {
                                z2 = true;
                                break;
                            }
                            break;
                        case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                            if (z <= false) {
                                z2 = true;
                                break;
                            }
                            break;
                        default:
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Invalid direction: ");
                            stringBuilder.append(i);
                            stringBuilder.append(mo1154g());
                            throw new IllegalArgumentException(stringBuilder.toString());
                    }
                } else {
                    z2 = true;
                }
            }
            return !z2 ? super.focusSearch(view, i) : findNextFocus;
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        } else {
            m447a(findNextFocus, null);
            return view;
        }
    }

    public LayoutParams generateDefaultLayoutParams() {
        C0517ug c0517ug = this.f711k;
        if (c0517ug != null) {
            return c0517ug.mo11218a();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RecyclerView has no LayoutManager");
        stringBuilder.append(mo1154g());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C0517ug c0517ug = this.f711k;
        if (c0517ug != null) {
            return c0517ug.mo11219a(getContext(), attributeSet);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RecyclerView has no LayoutManager");
        stringBuilder.append(mo1154g());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        C0517ug c0517ug = this.f711k;
        if (c0517ug != null) {
            return c0517ug.mo11220a(layoutParams);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RecyclerView has no LayoutManager");
        stringBuilder.append(mo1154g());
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: c */
    public final int mo1130c(C0530ux c0530ux) {
        if (c0530ux.mo11318b(524) || (c0530ux.f9886j & 1) == 0) {
            return -1;
        }
        C0502ts c0502ts = this.f705e;
        int i = c0530ux.f9879c;
        int size = c0502ts.f9793a.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0429qj c0429qj = (C0429qj) c0502ts.f9793a.get(i2);
            int i3;
            switch (c0429qj.f9551a) {
                case 1:
                    if (c0429qj.f9552b > i) {
                        break;
                    }
                    i += c0429qj.f9554d;
                    break;
                case 2:
                    i3 = c0429qj.f9552b;
                    if (i3 <= i) {
                        int i4 = c0429qj.f9554d;
                        if (i3 + i4 <= i) {
                            i -= i4;
                            break;
                        }
                        return -1;
                    }
                    continue;
                case 8:
                    i3 = c0429qj.f9552b;
                    if (i3 != i) {
                        if (i3 < i) {
                            i--;
                        }
                        if (c0429qj.f9554d > i) {
                            break;
                        }
                        i++;
                        break;
                    }
                    i = c0429qj.f9554d;
                    break;
                default:
                    break;
            }
        }
        return i;
    }

    public int getBaseline() {
        if (this.f711k != null) {
            return -1;
        }
        return super.getBaseline();
    }

    /* renamed from: d */
    private final long m454d(C0530ux c0530ux) {
        return !this.f710j.f9804b ? (long) c0530ux.f9879c : c0530ux.f9881e;
    }

    /* renamed from: e */
    private final C0530ux m456e(View view) {
        Object parent = view.getParent();
        if (parent == null || parent == this) {
            return RecyclerView.m453c(view);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("View ");
        stringBuilder.append(view);
        stringBuilder.append(" is not a direct child of ");
        stringBuilder.append(this);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: c */
    public static C0530ux m453c(View view) {
        if (view == null) {
            return null;
        }
        return ((C0519uk) view.getLayoutParams()).f9832c;
    }

    public boolean getClipToPadding() {
        return this.f671N;
    }

    /* renamed from: a */
    public static void m446a(View view, Rect rect) {
        C0519uk c0519uk = (C0519uk) view.getLayoutParams();
        Rect rect2 = c0519uk.f9833d;
        rect.set((view.getLeft() - rect2.left) - c0519uk.leftMargin, (view.getTop() - rect2.top) - c0519uk.topMargin, (view.getRight() + rect2.right) + c0519uk.rightMargin, c0519uk.bottomMargin + (rect2.bottom + view.getBottom()));
    }

    /* renamed from: d */
    public final Rect mo1142d(View view) {
        C0519uk c0519uk = (C0519uk) view.getLayoutParams();
        if (!c0519uk.f9834e) {
            return c0519uk.f9833d;
        }
        if (this.f662A.f9861g && (c0519uk.f9832c.mo11329m() || c0519uk.f9832c.mo11324h())) {
            return c0519uk.f9833d;
        }
        Rect rect = c0519uk.f9833d;
        rect.set(0, 0, 0, 0);
        int size = this.f713m.size();
        for (int i = 0; i < size; i++) {
            this.f708h.set(0, 0, 0, 0);
            ((C0516uf) this.f713m.get(i)).mo11214a(this.f708h, view, this);
            int i2 = rect.left;
            Rect rect2 = this.f708h;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c0519uk.f9834e = false;
        return rect;
    }

    /* renamed from: h */
    public static long m457h() {
        return f661b ? System.nanoTime() : 0;
    }

    /* renamed from: i */
    public final C0310jh mo1161i() {
        if (this.f697aq == null) {
            this.f697aq = new C0310jh(this);
        }
        return this.f697aq;
    }

    public boolean hasNestedScrollingParent() {
        return mo1161i().mo9421a(0);
    }

    /* renamed from: j */
    public final boolean mo1164j() {
        return !this.f717q || this.f719s || this.f705e.mo11165b();
    }

    /* renamed from: w */
    private final void m464w() {
        this.f723w = null;
        this.f721u = null;
        this.f722v = null;
        this.f720t = null;
    }

    /* renamed from: k */
    public final boolean mo1165k() {
        AccessibilityManager accessibilityManager = this.f677T;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAttachedToWindow() {
        return this.f716p;
    }

    /* renamed from: x */
    private final boolean m465x() {
        return this.f679V > 0;
    }

    public boolean isNestedScrollingEnabled() {
        return mo1161i().f8186a;
    }

    /* renamed from: l */
    public final void mo1166l() {
        int i = 0;
        int b = this.f706f.mo11032b();
        for (int i2 = 0; i2 < b; i2++) {
            ((C0519uk) this.f706f.mo11037d(i2).getLayoutParams()).f9834e = true;
        }
        C0524up c0524up = this.f704d;
        b = c0524up.f9844c.size();
        while (i < b) {
            C0519uk c0519uk = (C0519uk) ((C0530ux) c0524up.f9844c.get(i)).f9877a.getLayoutParams();
            if (c0519uk != null) {
                c0519uk.f9834e = true;
            }
            i++;
        }
    }

    /* renamed from: a */
    public final void mo1115a(int i, int i2, boolean z) {
        int i3;
        int i4 = i + i2;
        int b = this.f706f.mo11032b();
        for (int i5 = 0; i5 < b; i5++) {
            C0530ux c = RecyclerView.m453c(this.f706f.mo11037d(i5));
            if (!(c == null || c.mo11332p())) {
                i3 = c.f9879c;
                if (i3 >= i4) {
                    c.mo11313a(-i2, z);
                    this.f662A.f9860f = true;
                } else if (i3 >= i) {
                    c.mo11311a(8);
                    c.mo11313a(-i2, z);
                    c.f9879c = i - 1;
                    this.f662A.f9860f = true;
                }
            }
        }
        C0524up c0524up = this.f704d;
        for (b = c0524up.f9844c.size() - 1; b >= 0; b--) {
            C0530ux c0530ux = (C0530ux) c0524up.f9844c.get(b);
            if (c0530ux != null) {
                i3 = c0530ux.f9879c;
                if (i3 >= i4) {
                    c0530ux.mo11313a(-i2, z);
                } else if (i3 >= i) {
                    c0530ux.mo11311a(8);
                    c0524up.mo11295b(b);
                }
            }
        }
        requestLayout();
    }

    protected void onAttachedToWindow() {
        boolean z = true;
        super.onAttachedToWindow();
        this.f679V = 0;
        this.f716p = true;
        if (!this.f717q) {
            z = false;
        } else if (isLayoutRequested()) {
            z = false;
        }
        this.f717q = z;
        C0517ug c0517ug = this.f711k;
        if (c0517ug != null) {
            c0517ug.mo11275v();
        }
        this.f666E = false;
        if (f661b) {
            this.f725y = (C0483ss) C0483ss.f9738a.get();
            if (this.f725y == null) {
                float f;
                this.f725y = new C0483ss();
                Display e = C0315jm.m4630e(this);
                if (isInEditMode()) {
                    f = 60.0f;
                } else if (e != null) {
                    f = e.getRefreshRate();
                    if (f < 30.0f) {
                        f = 60.0f;
                    }
                } else {
                    f = 60.0f;
                }
                this.f725y.f9741c = (long) (1.0E9f / f);
                C0483ss.f9738a.set(this.f725y);
            }
            this.f725y.f9740b.add(this);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0512ub c0512ub = this.f724x;
        if (c0512ub != null) {
            c0512ub.mo11203b();
        }
        m441B();
        this.f716p = false;
        C0517ug c0517ug = this.f711k;
        if (c0517ug != null) {
            c0517ug.mo11276w();
        }
        this.f700at.clear();
        removeCallbacks(this.f701au);
        do {
        } while (C0548vw.f9940d.mo9113a() != null);
        if (f661b) {
            C0483ss c0483ss = this.f725y;
            if (c0483ss != null) {
                c0483ss.f9740b.remove(this);
                this.f725y = null;
            }
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f713m.size();
        for (int i = 0; i < size; i++) {
            this.f713m.get(i);
        }
    }

    /* renamed from: m */
    public final void mo1167m() {
        this.f679V++;
    }

    /* renamed from: a */
    public final void mo1122a(boolean z) {
        this.f679V--;
        if (this.f679V <= 0) {
            this.f679V = 0;
            if (z) {
                int i = this.f676S;
                this.f676S = 0;
                if (i != 0 && mo1165k()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(DepthmapTask.MAX_REFERENCE_SIZE_HR_PX);
                    obtain.setContentChangeTypes(i);
                    sendAccessibilityEventUnchecked(obtain);
                }
                for (int size = this.f700at.size() - 1; size >= 0; size--) {
                    C0530ux c0530ux = (C0530ux) this.f700at.get(size);
                    if (c0530ux.f9877a.getParent() == this && !c0530ux.mo11332p()) {
                        int i2 = c0530ux.f9890n;
                        if (i2 != -1) {
                            C0315jm.m4627c(c0530ux.f9877a, i2);
                            c0530ux.f9890n = -1;
                        }
                    }
                }
                this.f700at.clear();
            }
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (this.f711k != null && motionEvent.getAction() == 8) {
            float f;
            float axisValue;
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.f711k.mo11264i()) {
                    f = -motionEvent.getAxisValue(9);
                } else {
                    f = 0.0f;
                }
                if (this.f711k.mo11263h()) {
                    axisValue = motionEvent.getAxisValue(10);
                } else {
                    axisValue = 0.0f;
                }
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                f = motionEvent.getAxisValue(26);
                if (this.f711k.mo11264i()) {
                    f = -f;
                    axisValue = 0.0f;
                } else if (this.f711k.mo11263h()) {
                    axisValue = f;
                    f = 0.0f;
                } else {
                    f = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f = 0.0f;
                axisValue = 0.0f;
            }
            if (!(f == 0.0f && axisValue == 0.0f)) {
                m449a((int) (this.f691ak * axisValue), (int) (f * this.f692al), motionEvent);
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f715o = null;
        }
        int size = this.f714n.size();
        for (int i = 0; i < size; i++) {
            C0520ul c0520ul = (C0520ul) this.f714n.get(i);
            if (c0520ul.mo11284a(motionEvent) && action != 3) {
                this.f715o = c0520ul;
                z = true;
                break;
            }
        }
        z = false;
        if (z) {
            m458q();
            return true;
        }
        C0517ug c0517ug = this.f711k;
        if (c0517ug == null) {
            return false;
        }
        int h = c0517ug.mo11263h();
        boolean i2 = this.f711k.mo11264i();
        if (this.f683ac == null) {
            this.f683ac = VelocityTracker.obtain();
        }
        this.f683ac.addMovement(motionEvent);
        action = motionEvent.getActionMasked();
        size = motionEvent.getActionIndex();
        switch (action) {
            case 0:
                this.f682ab = motionEvent.getPointerId(0);
                action = (int) (motionEvent.getX() + 0.5f);
                this.f686af = action;
                this.f684ad = action;
                action = (int) (motionEvent.getY() + 0.5f);
                this.f687ag = action;
                this.f685ae = action;
                if (this.f681aa == 2) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    mo1127b(1);
                }
                int[] iArr = this.f699as;
                iArr[1] = 0;
                iArr[0] = 0;
                if (i2) {
                    h |= 2;
                }
                m455d(h, 0);
                break;
            case 1:
                this.f683ac.clear();
                mo1132c(0);
                break;
            case 2:
                action = motionEvent.findPointerIndex(this.f682ab);
                if (action >= 0) {
                    size = (int) (motionEvent.getX(action) + 0.5f);
                    action = (int) (motionEvent.getY(action) + 0.5f);
                    if (this.f681aa != 1) {
                        int i3 = size - this.f684ad;
                        int i4 = action - this.f685ae;
                        if (h == 0) {
                            z = false;
                        } else if (Math.abs(i3) > this.f688ah) {
                            this.f686af = size;
                            z = true;
                        } else {
                            z = false;
                        }
                        if (i2 && Math.abs(i4) > this.f688ah) {
                            this.f687ag = action;
                            z = true;
                        }
                        if (z) {
                            mo1127b(1);
                            break;
                        }
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Error processing scroll; pointer index for id ");
                stringBuilder.append(this.f682ab);
                stringBuilder.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", stringBuilder.toString());
                return false;
                break;
            case 3:
                m458q();
                break;
            case 5:
                this.f682ab = motionEvent.getPointerId(size);
                h = (int) (motionEvent.getX(size) + 0.5f);
                this.f686af = h;
                this.f684ad = h;
                h = (int) (motionEvent.getY(size) + 0.5f);
                this.f687ag = h;
                this.f685ae = h;
                break;
            case 6:
                m445a(motionEvent);
                break;
        }
        if (this.f681aa == 1) {
            return true;
        }
        return false;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        m460s();
        Trace.endSection();
        this.f717q = true;
    }

    protected void onMeasure(int i, int i2) {
        boolean z = false;
        C0517ug c0517ug = this.f711k;
        if (c0517ug == null) {
            mo1128b(i, i2);
        } else if (c0517ug.mo11265k()) {
            int mode = MeasureSpec.getMode(i);
            int mode2 = MeasureSpec.getMode(i2);
            this.f711k.mo11221a(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (!z && this.f710j != null) {
                if (this.f662A.f9858d == 1) {
                    m461t();
                }
                this.f711k.mo11243b(i, i2);
                this.f662A.f9863i = true;
                m462u();
                this.f711k.mo11254d(i, i2);
                if (this.f711k.mo11267n()) {
                    this.f711k.mo11243b(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f662A.f9863i = true;
                    m462u();
                    this.f711k.mo11254d(i, i2);
                }
            }
        } else {
            C0528uv c0528uv = this.f662A;
            if (c0528uv.f9865k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            C0507tx c0507tx = this.f710j;
            if (c0507tx != null) {
                c0528uv.f9859e = c0507tx.mo11186a();
            } else {
                c0528uv.f9859e = 0;
            }
            mo1182p();
            this.f711k.mo11221a(i, i2);
            mo1134c(false);
            this.f662A.f9861g = false;
        }
    }

    /* renamed from: a */
    private final void m445a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f682ab) {
            if (actionIndex == 0) {
                actionIndex = 1;
            } else {
                actionIndex = 0;
            }
            this.f682ab = motionEvent.getPointerId(actionIndex);
            int x = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f686af = x;
            this.f684ad = x;
            actionIndex = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f687ag = actionIndex;
            this.f685ae = actionIndex;
        }
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (m465x()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C0765us) {
            this.f670M = (C0765us) parcelable;
            super.onRestoreInstanceState(this.f670M.f7997e);
            C0517ug c0517ug = this.f711k;
            if (c0517ug != null) {
                Parcelable parcelable2 = this.f670M.f22342a;
                if (parcelable2 != null) {
                    c0517ug.mo11226a(parcelable2);
                    return;
                }
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Object c0765us = new C0765us(super.onSaveInstanceState());
        C0765us c0765us2 = this.f670M;
        if (c0765us2 == null) {
            C0517ug c0517ug = this.f711k;
            if (c0517ug != null) {
                c0765us.f22342a = c0517ug.mo11266m();
            } else {
                c0765us.f22342a = null;
            }
        } else {
            c0765us.f22342a = c0765us2.f22342a;
        }
        return c0765us;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            m464w();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Missing block: B:95:0x020e, code:
            if (r0 == null) goto L_0x0210;
     */
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
        r13 = this;
        r0 = r14.getAction();
        r1 = r13.f715o;
        if (r1 == 0) goto L_0x000d;
    L_0x0008:
        if (r0 != 0) goto L_0x02c7;
    L_0x000a:
        r1 = 0;
        r13.f715o = r1;
    L_0x000d:
        if (r0 == 0) goto L_0x02c4;
    L_0x000f:
        r0 = r13.f714n;
        r2 = r0.size();
        r0 = 0;
        r1 = r0;
    L_0x0017:
        if (r1 >= r2) goto L_0x02c1;
    L_0x0019:
        r0 = r13.f714n;
        r0 = r0.get(r1);
        r0 = (p000.C0520ul) r0;
        r3 = r0.mo11284a(r14);
        if (r3 == 0) goto L_0x02bc;
    L_0x0027:
        r13.f715o = r0;
        r0 = 1;
    L_0x002a:
        if (r0 == 0) goto L_0x0031;
    L_0x002c:
        r13.m458q();
        r0 = 1;
    L_0x0030:
        return r0;
    L_0x0031:
        r0 = r13.f711k;
        if (r0 != 0) goto L_0x0037;
    L_0x0035:
        r0 = 0;
        goto L_0x0030;
    L_0x0037:
        r6 = r0.mo11263h();
        r0 = r13.f711k;
        r7 = r0.mo11264i();
        r0 = r13.f683ac;
        if (r0 != 0) goto L_0x004b;
    L_0x0045:
        r0 = android.view.VelocityTracker.obtain();
        r13.f683ac = r0;
    L_0x004b:
        r9 = android.view.MotionEvent.obtain(r14);
        r0 = r14.getActionMasked();
        r1 = r14.getActionIndex();
        if (r0 != 0) goto L_0x0063;
    L_0x0059:
        r2 = r13.f699as;
        r3 = 1;
        r4 = 0;
        r2[r3] = r4;
        r3 = 0;
        r4 = 0;
        r2[r3] = r4;
    L_0x0063:
        r2 = r13.f699as;
        r3 = 0;
        r3 = r2[r3];
        r3 = (float) r3;
        r4 = 1;
        r2 = r2[r4];
        r2 = (float) r2;
        r9.offsetLocation(r3, r2);
        switch(r0) {
            case 0: goto L_0x0080;
            case 1: goto L_0x01d5;
            case 2: goto L_0x00d1;
            case 3: goto L_0x00cd;
            case 4: goto L_0x0073;
            case 5: goto L_0x00ae;
            case 6: goto L_0x00aa;
            default: goto L_0x0073;
        };
    L_0x0073:
        r0 = 0;
    L_0x0074:
        if (r0 != 0) goto L_0x007b;
    L_0x0076:
        r0 = r13.f683ac;
        r0.addMovement(r9);
    L_0x007b:
        r9.recycle();
        r0 = 1;
        goto L_0x0030;
    L_0x0080:
        r0 = 0;
        r0 = r14.getPointerId(r0);
        r13.f682ab = r0;
        r0 = r14.getX();
        r1 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r0 = r0 + r1;
        r0 = (int) r0;
        r13.f686af = r0;
        r13.f684ad = r0;
        r0 = r14.getY();
        r1 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r0 = r0 + r1;
        r0 = (int) r0;
        r13.f687ag = r0;
        r13.f685ae = r0;
        if (r7 == 0) goto L_0x00a8;
    L_0x00a1:
        r0 = r6 | 2;
    L_0x00a3:
        r1 = 0;
        r13.m455d(r0, r1);
        goto L_0x0073;
    L_0x00a8:
        r0 = r6;
        goto L_0x00a3;
    L_0x00aa:
        r13.m445a(r14);
        goto L_0x0073;
    L_0x00ae:
        r0 = r14.getPointerId(r1);
        r13.f682ab = r0;
        r0 = r14.getX(r1);
        r2 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r0 = r0 + r2;
        r0 = (int) r0;
        r13.f686af = r0;
        r13.f684ad = r0;
        r0 = r14.getY(r1);
        r1 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r0 = r0 + r1;
        r0 = (int) r0;
        r13.f687ag = r0;
        r13.f685ae = r0;
        goto L_0x0073;
    L_0x00cd:
        r13.m458q();
        goto L_0x0073;
    L_0x00d1:
        r0 = r13.f682ab;
        r0 = r14.findPointerIndex(r0);
        if (r0 >= 0) goto L_0x00f9;
    L_0x00d9:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Error processing scroll; pointer index for id ";
        r0.append(r1);
        r1 = r13.f682ab;
        r0.append(r1);
        r1 = " not found. Did any MotionEvents get skipped?";
        r0.append(r1);
        r1 = "RecyclerView";
        r0 = r0.toString();
        android.util.Log.e(r1, r0);
        r0 = 0;
        goto L_0x0030;
    L_0x00f9:
        r1 = r14.getX(r0);
        r2 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r1 = r1 + r2;
        r8 = (int) r1;
        r0 = r14.getY(r0);
        r1 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r0 = r0 + r1;
        r10 = (int) r0;
        r0 = r13.f686af;
        r1 = r0 - r8;
        r0 = r13.f687ag;
        r2 = r0 - r10;
        r3 = r13.f668G;
        r4 = r13.f698ar;
        r5 = 0;
        r0 = r13;
        r0 = r0.mo1124a(r1, r2, r3, r4, r5);
        if (r0 == 0) goto L_0x014c;
    L_0x011d:
        r0 = r13.f668G;
        r3 = 0;
        r3 = r0[r3];
        r1 = r1 - r3;
        r3 = 1;
        r0 = r0[r3];
        r2 = r2 - r0;
        r0 = r13.f698ar;
        r3 = 0;
        r3 = r0[r3];
        r3 = (float) r3;
        r4 = 1;
        r0 = r0[r4];
        r0 = (float) r0;
        r9.offsetLocation(r3, r0);
        r0 = r13.f699as;
        r3 = 0;
        r3 = r0[r3];
        r4 = r13.f698ar;
        r5 = 0;
        r11 = 0;
        r11 = r4[r11];
        r3 = r3 + r11;
        r0[r5] = r3;
        r3 = 1;
        r5 = 1;
        r5 = r0[r5];
        r11 = 1;
        r4 = r4[r11];
        r4 = r4 + r5;
        r0[r3] = r4;
    L_0x014c:
        r0 = r13.f681aa;
        r3 = 1;
        if (r0 == r3) goto L_0x01d1;
    L_0x0151:
        if (r6 == 0) goto L_0x01ce;
    L_0x0153:
        r0 = java.lang.Math.abs(r1);
        r3 = r13.f688ah;
        if (r0 <= r3) goto L_0x01cb;
    L_0x015b:
        if (r1 <= 0) goto L_0x01c8;
    L_0x015d:
        r0 = r1 - r3;
    L_0x015f:
        r1 = 1;
        r3 = r0;
        r0 = r1;
    L_0x0162:
        if (r7 == 0) goto L_0x01c6;
    L_0x0164:
        r1 = java.lang.Math.abs(r2);
        r4 = r13.f688ah;
        if (r1 <= r4) goto L_0x01c4;
    L_0x016c:
        if (r2 <= 0) goto L_0x01c1;
    L_0x016e:
        r0 = r2 - r4;
    L_0x0170:
        r1 = 1;
        r12 = r1;
        r1 = r0;
        r0 = r12;
    L_0x0174:
        if (r0 == 0) goto L_0x01bf;
    L_0x0176:
        r0 = 1;
        r13.mo1127b(r0);
        r2 = r3;
    L_0x017b:
        r0 = r13.f681aa;
        r3 = 1;
        if (r0 != r3) goto L_0x01bc;
    L_0x0180:
        r0 = r13.f698ar;
        r3 = 0;
        r3 = r0[r3];
        r3 = r8 - r3;
        r13.f686af = r3;
        r3 = 1;
        r0 = r0[r3];
        r0 = r10 - r0;
        r13.f687ag = r0;
        if (r6 != 0) goto L_0x01ba;
    L_0x0192:
        r0 = 0;
        r3 = r0;
    L_0x0194:
        if (r7 != 0) goto L_0x01b8;
    L_0x0196:
        r0 = 0;
    L_0x0197:
        r0 = r13.m449a(r3, r0, r9);
        if (r0 == 0) goto L_0x01a5;
    L_0x019d:
        r0 = r13.getParent();
        r3 = 1;
        r0.requestDisallowInterceptTouchEvent(r3);
    L_0x01a5:
        r0 = r13.f725y;
        if (r0 == 0) goto L_0x01b5;
    L_0x01a9:
        if (r2 != 0) goto L_0x01ad;
    L_0x01ab:
        if (r1 == 0) goto L_0x01b2;
    L_0x01ad:
        r0.mo11112a(r13, r2, r1);
        goto L_0x0073;
    L_0x01b2:
        r0 = 0;
        goto L_0x0074;
    L_0x01b5:
        r0 = 0;
        goto L_0x0074;
    L_0x01b8:
        r0 = r1;
        goto L_0x0197;
    L_0x01ba:
        r3 = r2;
        goto L_0x0194;
    L_0x01bc:
        r0 = 0;
        goto L_0x0074;
    L_0x01bf:
        r2 = r3;
        goto L_0x017b;
    L_0x01c1:
        r0 = r2 + r4;
        goto L_0x0170;
    L_0x01c4:
        r1 = r2;
        goto L_0x0174;
    L_0x01c6:
        r1 = r2;
        goto L_0x0174;
    L_0x01c8:
        r0 = r1 + r3;
        goto L_0x015f;
    L_0x01cb:
        r0 = 0;
        r3 = r1;
        goto L_0x0162;
    L_0x01ce:
        r0 = 0;
        r3 = r1;
        goto L_0x0162;
    L_0x01d1:
        r12 = r2;
        r2 = r1;
        r1 = r12;
        goto L_0x017b;
    L_0x01d5:
        r0 = r13.f683ac;
        r0.addMovement(r9);
        r0 = r13.f683ac;
        r1 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r13.f690aj;
        r2 = (float) r2;
        r0.computeCurrentVelocity(r1, r2);
        if (r6 == 0) goto L_0x02b8;
    L_0x01e6:
        r0 = r13.f683ac;
        r1 = r13.f682ab;
        r0 = r0.getXVelocity(r1);
        r0 = -r0;
        r1 = r0;
    L_0x01f0:
        if (r7 == 0) goto L_0x02b5;
    L_0x01f2:
        r0 = r13.f683ac;
        r2 = r13.f682ab;
        r0 = r0.getYVelocity(r2);
        r0 = -r0;
    L_0x01fb:
        r2 = 0;
        r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r2 == 0) goto L_0x02ae;
    L_0x0200:
        r2 = (int) r1;
        r0 = (int) r0;
        r1 = r13.f711k;
        if (r1 != 0) goto L_0x021a;
    L_0x0206:
        r0 = "RecyclerView";
        r1 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.";
        android.util.Log.e(r0, r1);
        r0 = 0;
    L_0x020e:
        if (r0 != 0) goto L_0x0214;
    L_0x0210:
        r0 = 0;
        r13.mo1127b(r0);
    L_0x0214:
        r13.m440A();
        r0 = 1;
        goto L_0x0074;
    L_0x021a:
        r1 = r1.mo11263h();
        r3 = r13.f711k;
        r4 = r3.mo11264i();
        if (r1 == 0) goto L_0x02ab;
    L_0x0226:
        r3 = java.lang.Math.abs(r2);
        r5 = r13.f689ai;
        if (r3 >= r5) goto L_0x02a9;
    L_0x022e:
        r2 = 0;
        r3 = r2;
    L_0x0230:
        if (r4 == 0) goto L_0x02a6;
    L_0x0232:
        r2 = java.lang.Math.abs(r0);
        r5 = r13.f689ai;
        if (r2 >= r5) goto L_0x02a4;
    L_0x023a:
        r0 = 0;
        r2 = r0;
    L_0x023c:
        if (r3 != 0) goto L_0x0240;
    L_0x023e:
        if (r2 == 0) goto L_0x02a1;
    L_0x0240:
        r5 = (float) r3;
        r6 = (float) r2;
        r0 = r13.dispatchNestedPreFling(r5, r6);
        if (r0 != 0) goto L_0x029e;
    L_0x0248:
        if (r1 == 0) goto L_0x0298;
    L_0x024a:
        r0 = 1;
    L_0x024b:
        r13.dispatchNestedFling(r5, r6, r0);
        if (r0 == 0) goto L_0x0295;
    L_0x0250:
        if (r4 == 0) goto L_0x0293;
    L_0x0252:
        r0 = r1 | 2;
    L_0x0254:
        r1 = 1;
        r13.m455d(r0, r1);
        r0 = r13.f690aj;
        r1 = java.lang.Math.min(r3, r0);
        r0 = -r0;
        r3 = java.lang.Math.max(r0, r1);
        r0 = r13.f690aj;
        r1 = java.lang.Math.min(r2, r0);
        r0 = -r0;
        r4 = java.lang.Math.max(r0, r1);
        r10 = r13.f694an;
        r0 = r10.f9873e;
        r1 = 2;
        r0.mo1127b(r1);
        r0 = 0;
        r10.f9870b = r0;
        r0 = 0;
        r10.f9869a = r0;
        r0 = r10.f9871c;
        r1 = 0;
        r2 = 0;
        r5 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r6 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r7 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r8 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r0.fling(r1, r2, r3, r4, r5, r6, r7, r8);
        r10.mo11307a();
        r0 = 1;
        goto L_0x020e;
    L_0x0293:
        r0 = r1;
        goto L_0x0254;
    L_0x0295:
        r0 = 0;
        goto L_0x020e;
    L_0x0298:
        if (r4 != 0) goto L_0x029c;
    L_0x029a:
        r0 = 0;
        goto L_0x024b;
    L_0x029c:
        r0 = 1;
        goto L_0x024b;
    L_0x029e:
        r0 = 0;
        goto L_0x020e;
    L_0x02a1:
        r0 = 0;
        goto L_0x020e;
    L_0x02a4:
        r2 = r0;
        goto L_0x023c;
    L_0x02a6:
        r0 = 0;
        r2 = r0;
        goto L_0x023c;
    L_0x02a9:
        r3 = r2;
        goto L_0x0230;
    L_0x02ab:
        r2 = 0;
        r3 = r2;
        goto L_0x0230;
    L_0x02ae:
        r2 = 0;
        r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r2 == 0) goto L_0x0210;
    L_0x02b3:
        goto L_0x0200;
    L_0x02b5:
        r0 = 0;
        goto L_0x01fb;
    L_0x02b8:
        r0 = 0;
        r1 = r0;
        goto L_0x01f0;
    L_0x02bc:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0017;
    L_0x02c1:
        r0 = 0;
        goto L_0x002a;
    L_0x02c4:
        r0 = 0;
        goto L_0x002a;
    L_0x02c7:
        r1.mo11285b(r14);
        r1 = 3;
        if (r0 == r1) goto L_0x02d0;
    L_0x02cd:
        r1 = 1;
        if (r0 != r1) goto L_0x02d6;
    L_0x02d0:
        r0 = 0;
        r13.f715o = r0;
        r0 = 1;
        goto L_0x002a;
    L_0x02d6:
        r0 = 1;
        goto L_0x002a;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: n */
    public final void mo1168n() {
        if (!this.f666E && this.f716p) {
            C0315jm.m4615a((View) this, this.f701au);
            this.f666E = true;
        }
    }

    /* renamed from: y */
    private final boolean m466y() {
        return this.f724x != null && this.f711k.mo11262g();
    }

    /* renamed from: b */
    public final void mo1129b(boolean z) {
        int i;
        this.f678U |= z;
        this.f719s = true;
        int b = this.f706f.mo11032b();
        for (i = 0; i < b; i++) {
            C0530ux c = RecyclerView.m453c(this.f706f.mo11037d(i));
            if (!(c == null || c.mo11332p())) {
                c.mo11311a(6);
            }
        }
        mo1166l();
        C0524up c0524up = this.f704d;
        int size = c0524up.f9844c.size();
        for (i = 0; i < size; i++) {
            C0530ux c0530ux = (C0530ux) c0524up.f9844c.get(i);
            if (c0530ux != null) {
                c0530ux.mo11311a(6);
                c0530ux.mo11314a(null);
            }
        }
        C0507tx c0507tx = c0524up.f9846e.f710j;
        if (c0507tx == null || !c0507tx.f9804b) {
            c0524up.mo11298c();
        }
    }

    /* renamed from: a */
    public final void mo1121a(C0530ux c0530ux, C0515ue c0515ue) {
        c0530ux.mo11312a(0, 8192);
        if (this.f662A.f9862h && c0530ux.mo11329m() && !c0530ux.mo11326j() && !c0530ux.mo11332p()) {
            this.f707g.mo11474a(m454d(c0530ux), c0530ux);
        }
        this.f707g.mo11477b(c0530ux, c0515ue);
    }

    /* renamed from: o */
    public final void mo1169o() {
        C0512ub c0512ub = this.f724x;
        if (c0512ub != null) {
            c0512ub.mo11203b();
        }
        C0517ug c0517ug = this.f711k;
        if (c0517ug != null) {
            c0517ug.mo11233a(this.f704d);
            this.f711k.mo11245b(this.f704d);
        }
        this.f704d.mo11290a();
    }

    public void removeDetachedView(View view, boolean z) {
        C0530ux c = RecyclerView.m453c(view);
        if (c != null) {
            if (c.mo11328l()) {
                c.mo11320d();
            } else if (!c.mo11332p()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                stringBuilder.append(c);
                stringBuilder.append(mo1154g());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        view.clearAnimation();
        RecyclerView.m453c(view);
        super.removeDetachedView(view, z);
    }

    /* renamed from: a */
    public final void mo1118a(C0516uf c0516uf) {
        C0517ug c0517ug = this.f711k;
        if (c0517ug != null) {
            c0517ug.mo11232a("Cannot remove item decoration during a scroll  or layout");
        }
        this.f713m.remove(c0516uf);
        if (this.f713m.isEmpty()) {
            boolean z;
            if (getOverScrollMode() == 2) {
                z = true;
            } else {
                z = false;
            }
            setWillNotDraw(z);
        }
        mo1166l();
        requestLayout();
    }

    public void requestChildFocus(View view, View view2) {
        if (!(m465x() || view2 == null)) {
            m447a(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    /* renamed from: a */
    private final void m447a(View view, View view2) {
        View view3;
        boolean z = false;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        this.f708h.set(0, 0, view3.getWidth(), view3.getHeight());
        LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0519uk) {
            C0519uk c0519uk = (C0519uk) layoutParams;
            if (!c0519uk.f9834e) {
                Rect rect = c0519uk.f9833d;
                Rect rect2 = this.f708h;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom = rect.bottom + rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f708h);
            offsetRectIntoDescendantCoords(view, this.f708h);
        }
        C0517ug c0517ug = this.f711k;
        Rect rect3 = this.f708h;
        boolean z2 = this.f717q ^ 1;
        if (view2 == null) {
            z = true;
        }
        c0517ug.mo11236a(this, view, rect3, z2, z);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f711k.mo11236a(this, view, rect, z, false);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f714n.size();
        for (int i = 0; i < size; i++) {
            ((C0520ul) this.f714n.get(i)).mo11283a();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.f674Q == 0) {
            super.requestLayout();
        } else {
            this.f675R = true;
        }
    }

    /* renamed from: z */
    private final void m467z() {
        C0528uv c0528uv = this.f662A;
        c0528uv.f9867m = -1;
        c0528uv.f9866l = -1;
        c0528uv.f9868n = -1;
    }

    /* renamed from: A */
    private final void m440A() {
        int i = 0;
        VelocityTracker velocityTracker = this.f683ac;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        mo1132c(0);
        EdgeEffect edgeEffect = this.f720t;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            i = this.f720t.isFinished();
        }
        edgeEffect = this.f721u;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            i |= this.f721u.isFinished();
        }
        edgeEffect = this.f722v;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            i |= this.f722v.isFinished();
        }
        edgeEffect = this.f723w;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            i |= this.f723w.isFinished();
        }
        if (i != 0) {
            C0315jm.m4601A(this);
        }
    }

    public void scrollBy(int i, int i2) {
        C0517ug c0517ug = this.f711k;
        if (c0517ug == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        boolean h = c0517ug.mo11263h();
        boolean i3 = this.f711k.mo11264i();
        if (h || i3) {
            if (!h) {
                i = 0;
            }
            if (!i3) {
                i2 = 0;
            }
            m449a(i, i2, null);
        }
    }

    /* renamed from: a */
    private final boolean m449a(int i, int i2, MotionEvent motionEvent) {
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6;
        mo1113a();
        if (this.f710j != null) {
            mo1116a(i, i2, this.f669H);
            iArr = this.f669H;
            i3 = iArr[0];
            i4 = iArr[1];
            i5 = i - i3;
            i6 = i2 - i4;
        } else {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        if (!this.f713m.isEmpty()) {
            invalidate();
        }
        if (mo1123a(i3, i4, i5, i6, this.f698ar, 0)) {
            int i7 = this.f686af;
            int[] iArr2 = this.f698ar;
            i6 = iArr2[0];
            this.f686af = i7 - i6;
            i7 = this.f687ag;
            i5 = iArr2[1];
            this.f687ag = i7 - i5;
            if (motionEvent != null) {
                motionEvent.offsetLocation((float) i6, (float) i5);
            }
            iArr = this.f699as;
            i5 = iArr[0];
            int[] iArr3 = this.f698ar;
            iArr[0] = i5 + iArr3[0];
            iArr[1] = iArr3[1] + iArr[1];
        } else if (getOverScrollMode() != 2) {
            if (!(motionEvent == null || (motionEvent.getSource() & FragmentTransaction.TRANSIT_FRAGMENT_CLOSE) == FragmentTransaction.TRANSIT_FRAGMENT_CLOSE)) {
                Object obj;
                float x = motionEvent.getX();
                float f = (float) i5;
                float y = motionEvent.getY();
                float f2 = (float) i6;
                if (f < 0.0f) {
                    mo1143d();
                    this.f720t.onPull((-f) / ((float) getWidth()), 1.0f - (y / ((float) getHeight())));
                    obj = 1;
                } else if (f > 0.0f) {
                    mo1151e();
                    this.f722v.onPull(f / ((float) getWidth()), y / ((float) getHeight()));
                    obj = 1;
                } else {
                    obj = null;
                }
                if (f2 < 0.0f) {
                    mo1152f();
                    this.f721u.onPull((-f2) / ((float) getHeight()), x / ((float) getWidth()));
                    obj = 1;
                } else if (f2 > 0.0f) {
                    mo1131c();
                    this.f723w.onPull(f2 / ((float) getHeight()), 1.0f - (x / ((float) getWidth())));
                    obj = 1;
                }
                if (!(obj == null && f == 0.0f && f2 == 0.0f)) {
                    C0315jm.m4601A(this);
                }
            }
            mo1114a(i, i2);
        }
        if (!(i3 == 0 && i4 == 0)) {
            mo1126b();
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (i3 == 0 && i4 == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo1116a(int i, int i2, int[] iArr) {
        int a;
        int b;
        mo1182p();
        mo1167m();
        Trace.beginSection("RV Scroll");
        m463v();
        if (i != 0) {
            a = this.f711k.mo11215a(i, this.f704d, this.f662A);
        } else {
            boolean a2 = false;
        }
        if (i2 != 0) {
            b = this.f711k.mo11239b(i2, this.f704d, this.f662A);
        } else {
            b = 0;
        }
        Trace.endSection();
        int a3 = this.f706f.mo11027a();
        for (int i3 = 0; i3 < a3; i3++) {
            View b2 = this.f706f.mo11034b(i3);
            C0530ux e = m456e(b2);
            if (e != null) {
                e = e.f9885i;
                if (e != null) {
                    View view = e.f9877a;
                    int left = b2.getLeft();
                    int top = b2.getTop();
                    if (left != view.getLeft() || top != view.getTop()) {
                        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                    }
                }
            }
        }
        mo1122a(true);
        mo1134c(false);
        if (iArr != null) {
            iArr[0] = a2;
            iArr[1] = b;
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i = 0;
        if (m465x()) {
            int i2;
            if (accessibilityEvent == null) {
                i2 = 0;
            } else {
                i2 = accessibilityEvent.getContentChangeTypes();
            }
            if (i2 != 0) {
                i = i2;
            }
            this.f676S = i | this.f676S;
            i = 1;
        }
        if (i == 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    /* renamed from: a */
    public final boolean mo1125a(C0530ux c0530ux, int i) {
        if (m465x()) {
            c0530ux.f9890n = i;
            this.f700at.add(c0530ux);
            return false;
        }
        C0315jm.m4627c(c0530ux.f9877a, i);
        return true;
    }

    public void setClipToPadding(boolean z) {
        if (z != this.f671N) {
            m464w();
        }
        this.f671N = z;
        super.setClipToPadding(z);
        if (this.f717q) {
            requestLayout();
        }
    }

    /* renamed from: a */
    public final void mo1119a(C0517ug c0517ug) {
        if (c0517ug != this.f711k) {
            m441B();
            if (this.f711k != null) {
                C0512ub c0512ub = this.f724x;
                if (c0512ub != null) {
                    c0512ub.mo11203b();
                }
                this.f711k.mo11233a(this.f704d);
                this.f711k.mo11245b(this.f704d);
                this.f704d.mo11290a();
                if (this.f716p) {
                    this.f711k.mo11276w();
                }
                this.f711k.mo11244b(null);
                this.f711k = null;
            } else {
                this.f704d.mo11290a();
            }
            C0457rp c0457rp = this.f706f;
            C0458rq c0458rq = c0457rp.f9648b;
            do {
                c0458rq.f9650a = 0;
                c0458rq = c0458rq.f9651b;
            } while (c0458rq != null);
            for (int size = c0457rp.f9649c.size() - 1; size >= 0; size--) {
                c0457rp.f9647a.mo11050b((View) c0457rp.f9649c.get(size));
                c0457rp.f9649c.remove(size);
            }
            C0459rr c0459rr = c0457rp.f9647a;
            int childCount = c0459rr.f9652a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View a = c0459rr.mo11048a(i);
                RecyclerView.m453c(a);
                a.clearAnimation();
            }
            c0459rr.f9652a.removeAllViews();
            this.f711k = c0517ug;
            if (c0517ug != null) {
                if (c0517ug.f9817g != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("LayoutManager ");
                    stringBuilder.append(c0517ug);
                    stringBuilder.append(" is already attached to a RecyclerView:");
                    stringBuilder.append(c0517ug.f9817g.mo1154g());
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                this.f711k.mo11244b(this);
                if (this.f716p) {
                    this.f711k.mo11275v();
                }
            }
            this.f704d.mo11300d();
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        mo1161i().mo9418a(z);
    }

    /* renamed from: b */
    public final void mo1127b(int i) {
        if (i != this.f681aa) {
            this.f681aa = i;
            if (i != 2) {
                this.f694an.mo11308b();
            }
            List list = this.f663B;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f663B.get(size);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo1133c(int i, int i2) {
        C0517ug c0517ug = this.f711k;
        if (c0517ug == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        int i3;
        int i4;
        if (c0517ug.mo11263h()) {
            i3 = i;
        } else {
            i3 = 0;
        }
        if (this.f711k.mo11264i()) {
            i4 = i2;
        } else {
            i4 = 0;
        }
        if (i3 != 0 || i4 != 0) {
            int height;
            C0529uw c0529uw = this.f694an;
            int abs = Math.abs(i3);
            int abs2 = Math.abs(i4);
            int sqrt = (int) Math.sqrt(0.0d);
            int sqrt2 = (int) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
            if (abs <= abs2) {
                height = c0529uw.f9873e.getHeight();
            } else {
                height = c0529uw.f9873e.getWidth();
            }
            float f = (float) height;
            float f2 = (float) (height / 2);
            f2 += ((float) Math.sin((double) ((Math.min(1.0f, ((float) sqrt2) / f) - 8.0f) * 0.47123894f))) * f2;
            if (sqrt > 0) {
                height = Math.round(Math.abs(f2 / ((float) sqrt)) * 1000.0f) << 2;
            } else {
                if (abs > abs2) {
                    height = abs;
                } else {
                    height = abs2;
                }
                height = (int) (((((float) height) / f) + 1.0f) * 300.0f);
            }
            abs2 = Math.min(height, BlockingCameraManager.OPEN_TIME_OUT_MS);
            Interpolator interpolator = f656I;
            if (c0529uw.f9872d != interpolator) {
                c0529uw.f9872d = interpolator;
                c0529uw.f9871c = new OverScroller(c0529uw.f9873e.getContext(), interpolator);
            }
            c0529uw.f9873e.mo1127b(2);
            c0529uw.f9870b = 0;
            c0529uw.f9869a = 0;
            c0529uw.f9871c.startScroll(0, 0, i3, i4, abs2);
            c0529uw.mo11307a();
        }
    }

    /* renamed from: p */
    public final void mo1182p() {
        this.f674Q++;
        if (this.f674Q == 1) {
            this.f675R = false;
        }
    }

    public boolean startNestedScroll(int i) {
        return mo1161i().mo9422a(i, 0);
    }

    /* renamed from: d */
    private final boolean m455d(int i, int i2) {
        return mo1161i().mo9422a(i, i2);
    }

    /* renamed from: c */
    public final void mo1134c(boolean z) {
        if (this.f674Q <= 0) {
            this.f674Q = 1;
        }
        if (!z) {
            this.f675R = false;
        }
        if (this.f674Q == 1) {
            if (z && this.f675R && this.f711k != null && this.f710j != null) {
                m460s();
            }
            this.f675R = false;
        }
        this.f674Q--;
    }

    public void stopNestedScroll() {
        mo1161i().mo9425b(0);
    }

    /* renamed from: c */
    public final void mo1132c(int i) {
        mo1161i().mo9425b(i);
    }

    /* renamed from: B */
    private final void m441B() {
        mo1127b(0);
        this.f694an.mo11308b();
    }
}
