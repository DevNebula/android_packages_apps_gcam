package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.p001v4.app.NotificationCompat.WearableExtender;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowInsets;
import com.google.android.apps.refocus.processing.DepthmapTask;
import com.google.android.libraries.smartburst.filterfw.filterpacks.video.VideoProviderSource;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: kz */
public class C0345kz extends ViewGroup {
    /* renamed from: a */
    public static final int[] f9111a = new int[]{16842931};
    /* renamed from: b */
    public static final boolean f9112b = true;
    /* renamed from: k */
    private static final int[] f9113k = new int[]{16843828};
    /* renamed from: l */
    private static final boolean f9114l = true;
    /* renamed from: A */
    private float f9115A;
    /* renamed from: B */
    private Drawable f9116B;
    /* renamed from: C */
    private final ArrayList f9117C;
    /* renamed from: D */
    private Rect f9118D;
    /* renamed from: E */
    private Matrix f9119E;
    /* renamed from: c */
    public int f9120c;
    /* renamed from: d */
    public final C0354lo f9121d;
    /* renamed from: e */
    public final C0354lo f9122e;
    /* renamed from: f */
    public int f9123f;
    /* renamed from: g */
    public boolean f9124g;
    /* renamed from: h */
    public List f9125h;
    /* renamed from: i */
    public Object f9126i;
    /* renamed from: j */
    public boolean f9127j;
    /* renamed from: m */
    private final C0708lc f9128m;
    /* renamed from: n */
    private float f9129n;
    /* renamed from: o */
    private int f9130o;
    /* renamed from: p */
    private float f9131p;
    /* renamed from: q */
    private Paint f9132q;
    /* renamed from: r */
    private final C0710lh f9133r;
    /* renamed from: s */
    private final C0710lh f9134s;
    /* renamed from: t */
    private boolean f9135t;
    /* renamed from: u */
    private boolean f9136u;
    /* renamed from: v */
    private int f9137v;
    /* renamed from: w */
    private int f9138w;
    /* renamed from: x */
    private int f9139x;
    /* renamed from: y */
    private int f9140y;
    /* renamed from: z */
    private float f9141z;

    public C0345kz(Context context) {
        this(context, null);
    }

    public C0345kz(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0345kz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9128m = new C0708lc();
        this.f9120c = -1728053248;
        this.f9132q = new Paint();
        this.f9136u = true;
        this.f9137v = 3;
        this.f9138w = 3;
        this.f9139x = 3;
        this.f9140y = 3;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f9130o = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        this.f9133r = new C0710lh(this, 3);
        this.f9134s = new C0710lh(this, 5);
        this.f9121d = C0354lo.m5573a((ViewGroup) this, this.f9133r);
        C0354lo c0354lo = this.f9121d;
        c0354lo.f9159i = 1;
        c0354lo.f9157g = f2;
        this.f9133r.f22035b = c0354lo;
        this.f9122e = C0354lo.m5573a((ViewGroup) this, this.f9134s);
        c0354lo = this.f9122e;
        c0354lo.f9159i = 2;
        c0354lo.f9157g = f2;
        this.f9134s.f22035b = c0354lo;
        setFocusableInTouchMode(true);
        C0315jm.m4627c(this, 1);
        C0315jm.m4618a((View) this, new C0707lb(this));
        setMotionEventSplittingEnabled(false);
        if (C0315jm.m4632g(this)) {
            setOnApplyWindowInsetsListener(new C0346la());
            setSystemUiVisibility(DepthmapTask.DEPTH_PROCESSING_LATTICE_HR_MAX_SIZE_PX);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f9113k);
            try {
                this.f9116B = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f9129n = f * 10.0f;
        this.f9117C = new ArrayList();
    }

    public void addFocusables(ArrayList arrayList, int i, int i2) {
        int i3 = 0;
        if (getDescendantFocusability() != 393216) {
            int i4;
            int childCount = getChildCount();
            int i5 = 0;
            for (i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (!C0345kz.m5549f(childAt)) {
                    this.f9117C.add(childAt);
                } else if (C0345kz.m5552i(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    i5 = 1;
                }
            }
            if (i5 == 0) {
                i4 = this.f9117C.size();
                while (i3 < i4) {
                    View view = (View) this.f9117C.get(i3);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                    i3++;
                }
            }
            this.f9117C.clear();
        }
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (m5547e() != null || C0345kz.m5549f(view)) {
            C0315jm.m4627c(view, 4);
        } else {
            C0315jm.m4627c(view, 1);
        }
        if (!f9112b) {
            C0315jm.m4618a(view, this.f9128m);
        }
    }

    /* renamed from: a */
    final boolean mo10575a(View view, int i) {
        return (mo10581c(view) & i) == i;
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C0348le) && super.checkLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final void mo10572a(View view) {
        if (C0345kz.m5549f(view)) {
            C0348le c0348le = (C0348le) view.getLayoutParams();
            if (this.f9136u) {
                c0348le.f9143b = 0.0f;
                c0348le.f9145d = 0;
            } else {
                c0348le.f9145d |= 4;
                if (mo10575a(view, 3)) {
                    this.f9121d.mo10623a(view, -view.getWidth(), view.getTop());
                } else {
                    this.f9122e.mo10623a(view, getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("View ");
        stringBuilder.append(view);
        stringBuilder.append(" is not a sliding drawer");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    public final void mo10571a() {
        View a = mo10570a(8388611);
        if (a == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No drawer view found with gravity ");
            stringBuilder.append(C0345kz.m5545c(8388611));
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        mo10572a(a);
    }

    /* renamed from: a */
    private final void m5544a(boolean z) {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0348le c0348le = (C0348le) childAt.getLayoutParams();
            if (C0345kz.m5549f(childAt) && (!z || c0348le.f9144c)) {
                int width = childAt.getWidth();
                if (mo10575a(childAt, 3)) {
                    i |= this.f9121d.mo10623a(childAt, -width, childAt.getTop());
                } else {
                    i |= this.f9122e.mo10623a(childAt, getWidth(), childAt.getTop());
                }
                c0348le.f9144c = false;
            }
        }
        this.f9133r.mo14212d();
        this.f9134s.mo14212d();
        if (i != 0) {
            invalidate();
        }
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((C0348le) getChildAt(i).getLayoutParams()).f9143b);
        }
        this.f9131p = f;
        boolean b = this.f9121d.mo10625b();
        boolean b2 = this.f9122e.mo10625b();
        if (b || b2) {
            C0315jm.m4601A(this);
        }
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f9131p <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount != 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            for (int i = childCount - 1; i >= 0; i--) {
                View childAt = getChildAt(i);
                if (this.f9118D == null) {
                    this.f9118D = new Rect();
                }
                childAt.getHitRect(this.f9118D);
                if (this.f9118D.contains((int) x, (int) y) && !C0345kz.m5551h(childAt)) {
                    boolean dispatchGenericMotionEvent;
                    if (childAt.getMatrix().isIdentity()) {
                        float scrollX = (float) (getScrollX() - childAt.getLeft());
                        float scrollY = (float) (getScrollY() - childAt.getTop());
                        motionEvent.offsetLocation(scrollX, scrollY);
                        dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                        motionEvent.offsetLocation(-scrollX, -scrollY);
                    } else {
                        int scrollX2 = getScrollX();
                        int left = childAt.getLeft();
                        int scrollY2 = getScrollY();
                        int top = childAt.getTop();
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        obtain.offsetLocation((float) (scrollX2 - left), (float) (scrollY2 - top));
                        Matrix matrix = childAt.getMatrix();
                        if (!matrix.isIdentity()) {
                            if (this.f9119E == null) {
                                this.f9119E = new Matrix();
                            }
                            matrix.invert(this.f9119E);
                            obtain.transform(this.f9119E);
                        }
                        dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(obtain);
                        obtain.recycle();
                    }
                    if (dispatchGenericMotionEvent) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        int i2;
        int height = getHeight();
        boolean h = C0345kz.m5551h(view);
        int width = getWidth();
        int save = canvas.save();
        if (h) {
            int childCount = getChildCount();
            i = 0;
            i2 = 0;
            while (i2 < childCount) {
                int i3;
                View childAt = getChildAt(i2);
                if (childAt == view) {
                    i3 = i;
                } else if (childAt.getVisibility() != 0) {
                    i3 = i;
                } else {
                    Object obj;
                    Drawable background = childAt.getBackground();
                    if (background == null) {
                        obj = null;
                    } else if (background.getOpacity() == -1) {
                        obj = 1;
                    } else {
                        obj = null;
                    }
                    if (obj == null) {
                        i3 = i;
                    } else if (!C0345kz.m5549f(childAt)) {
                        i3 = i;
                    } else if (childAt.getHeight() < height) {
                        i3 = i;
                    } else if (mo10575a(childAt, 3)) {
                        i3 = childAt.getRight();
                        if (i3 <= i) {
                            i3 = i;
                        }
                    } else {
                        i3 = childAt.getLeft();
                        if (i3 >= width) {
                            i3 = i;
                        } else {
                            width = i3;
                            i3 = i;
                        }
                    }
                }
                i2++;
                i = i3;
            }
            canvas.clipRect(i, 0, width, getHeight());
        } else {
            i = 0;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.f9131p;
        if (f > 0.0f && h) {
            i2 = this.f9120c;
            this.f9132q.setColor((((int) (f * ((float) ((-16777216 & i2) >>> 24)))) << 24) | (i2 & 16777215));
            canvas.drawRect((float) i, 0.0f, (float) width, (float) getHeight(), this.f9132q);
        }
        return drawChild;
    }

    /* renamed from: a */
    public final View mo10570a(int i) {
        int absoluteGravity = Gravity.getAbsoluteGravity(i, C0315jm.m4635j(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((mo10581c(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: e */
    private final View m5547e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((C0348le) childAt.getLayoutParams()).f9145d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: b */
    final View mo10579b() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (C0345kz.m5549f(childAt) && C0345kz.m5550g(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new C0348le();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0348le(getContext(), attributeSet);
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        if (layoutParams instanceof C0348le) {
            return new C0348le((C0348le) layoutParams);
        }
        return layoutParams instanceof MarginLayoutParams ? new C0348le((MarginLayoutParams) layoutParams) : new C0348le(layoutParams);
    }

    /* renamed from: b */
    public final int mo10578b(View view) {
        if (C0345kz.m5549f(view)) {
            int i = ((C0348le) view.getLayoutParams()).f9142a;
            int j = C0315jm.m4635j(this);
            switch (i) {
                case 3:
                    i = this.f9137v;
                    if (i != 3) {
                        return i;
                    }
                    if (j != 0) {
                        i = this.f9140y;
                    } else {
                        i = this.f9139x;
                    }
                    if (i != 3) {
                        return i;
                    }
                    break;
                case 5:
                    i = this.f9138w;
                    if (i != 3) {
                        return i;
                    }
                    if (j != 0) {
                        i = this.f9139x;
                    } else {
                        i = this.f9140y;
                    }
                    if (i != 3) {
                        return i;
                    }
                    break;
                case 8388611:
                    i = this.f9139x;
                    if (i != 3) {
                        return i;
                    }
                    if (j != 0) {
                        i = this.f9138w;
                    } else {
                        i = this.f9137v;
                    }
                    if (i != 3) {
                        return i;
                    }
                    break;
                case WearableExtender.DEFAULT_CONTENT_ICON_GRAVITY /*8388613*/:
                    i = this.f9140y;
                    if (i != 3) {
                        return i;
                    }
                    if (j != 0) {
                        i = this.f9137v;
                    } else {
                        i = this.f9138w;
                    }
                    if (i != 3) {
                        return i;
                    }
                    break;
            }
            return 0;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("View ");
        stringBuilder.append(view);
        stringBuilder.append(" is not a drawer");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: c */
    final int mo10581c(View view) {
        return Gravity.getAbsoluteGravity(((C0348le) view.getLayoutParams()).f9142a, C0315jm.m4635j(this));
    }

    /* renamed from: d */
    static float m5546d(View view) {
        return ((C0348le) view.getLayoutParams()).f9143b;
    }

    /* renamed from: c */
    private static String m5545c(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        if ((i & 5) == 5) {
            return "RIGHT";
        }
        return Integer.toHexString(i);
    }

    /* renamed from: e */
    static boolean m5548e(View view) {
        return (C0315jm.m4633h(view) == 4 || C0315jm.m4633h(view) == 2) ? false : true;
    }

    /* renamed from: h */
    private static boolean m5551h(View view) {
        return ((C0348le) view.getLayoutParams()).f9142a == 0;
    }

    /* renamed from: i */
    private static boolean m5552i(View view) {
        if (C0345kz.m5549f(view)) {
            return ((C0348le) view.getLayoutParams()).f9145d & 1;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("View ");
        stringBuilder.append(view);
        stringBuilder.append(" is not a drawer");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: c */
    public final boolean mo10582c() {
        View a = mo10570a(8388611);
        return a != null ? C0345kz.m5552i(a) : false;
    }

    /* renamed from: f */
    static boolean m5549f(View view) {
        int absoluteGravity = Gravity.getAbsoluteGravity(((C0348le) view.getLayoutParams()).f9142a, C0315jm.m4635j(view));
        if ((absoluteGravity & 3) != 0) {
            return true;
        }
        if ((absoluteGravity & 5) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m5550g(View view) {
        if (C0345kz.m5549f(view)) {
            return ((C0348le) view.getLayoutParams()).f9143b > 0.0f;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("View ");
            stringBuilder.append(view);
            stringBuilder.append(" is not a drawer");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9136u = true;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9136u = true;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f9127j && this.f9116B != null) {
            int systemWindowInsetTop;
            Object obj = this.f9126i;
            if (obj != null) {
                systemWindowInsetTop = ((WindowInsets) obj).getSystemWindowInsetTop();
            } else {
                systemWindowInsetTop = 0;
            }
            if (systemWindowInsetTop > 0) {
                this.f9116B.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                this.f9116B.draw(canvas);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a3  */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
        r9 = this;
        r1 = 1;
        r2 = 0;
        r0 = r10.getActionMasked();
        r3 = r9.f9121d;
        r3 = r3.mo10627b(r10);
        r4 = r9.f9122e;
        r4 = r4.mo10627b(r10);
        r4 = r4 | r3;
        switch(r0) {
            case 0: goto L_0x0040;
            case 1: goto L_0x00b8;
            case 2: goto L_0x006d;
            case 3: goto L_0x00b8;
            default: goto L_0x0016;
        };
    L_0x0016:
        r0 = r2;
    L_0x0017:
        if (r4 != 0) goto L_0x003e;
    L_0x0019:
        if (r0 != 0) goto L_0x003e;
    L_0x001b:
        r4 = r9.getChildCount();
        r3 = r2;
    L_0x0020:
        if (r3 >= r4) goto L_0x003c;
    L_0x0022:
        r0 = r9.getChildAt(r3);
        r0 = r0.getLayoutParams();
        r0 = (p000.C0348le) r0;
        r0 = r0.f9144c;
        if (r0 != 0) goto L_0x0034;
    L_0x0030:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x0020;
    L_0x0034:
        r0 = r1;
    L_0x0035:
        if (r0 != 0) goto L_0x003e;
    L_0x0037:
        r0 = r9.f9124g;
        if (r0 != 0) goto L_0x003e;
    L_0x003b:
        return r2;
    L_0x003c:
        r0 = r2;
        goto L_0x0035;
    L_0x003e:
        r2 = r1;
        goto L_0x003b;
    L_0x0040:
        r0 = r10.getX();
        r3 = r10.getY();
        r9.f9141z = r0;
        r9.f9115A = r3;
        r5 = r9.f9131p;
        r6 = 0;
        r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r5 <= 0) goto L_0x006b;
    L_0x0053:
        r5 = r9.f9121d;
        r0 = (int) r0;
        r3 = (int) r3;
        r0 = r5.mo10618a(r0, r3);
        if (r0 == 0) goto L_0x0069;
    L_0x005d:
        r0 = p000.C0345kz.m5551h(r0);
        if (r0 == 0) goto L_0x0067;
    L_0x0063:
        r0 = r1;
    L_0x0064:
        r9.f9124g = r2;
        goto L_0x0017;
    L_0x0067:
        r0 = r2;
        goto L_0x0064;
    L_0x0069:
        r0 = r2;
        goto L_0x0064;
    L_0x006b:
        r0 = r2;
        goto L_0x0064;
    L_0x006d:
        r5 = r9.f9121d;
        r0 = r5.f9153c;
        r6 = r0.length;
        r3 = r2;
    L_0x0073:
        if (r3 >= r6) goto L_0x00b6;
    L_0x0075:
        r0 = r5.mo10622a(r3);
        if (r0 == 0) goto L_0x00b4;
    L_0x007b:
        r0 = r5.f9155e;
        r0 = r0[r3];
        r7 = r5.f9153c;
        r7 = r7[r3];
        r0 = r0 - r7;
        r7 = r5.f9156f;
        r7 = r7[r3];
        r8 = r5.f9154d;
        r8 = r8[r3];
        r7 = r7 - r8;
        r8 = r5.f9152b;
        r0 = r0 * r0;
        r7 = r7 * r7;
        r0 = r0 + r7;
        r7 = r8 * r8;
        r7 = (float) r7;
        r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1));
        if (r0 <= 0) goto L_0x00b2;
    L_0x0099:
        r0 = r1;
    L_0x009a:
        if (r0 != 0) goto L_0x00a0;
    L_0x009c:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x0073;
    L_0x00a0:
        r0 = r1;
    L_0x00a1:
        if (r0 == 0) goto L_0x00af;
    L_0x00a3:
        r0 = r9.f9133r;
        r0.mo14212d();
        r0 = r9.f9134s;
        r0.mo14212d();
        goto L_0x0016;
    L_0x00af:
        r0 = r2;
        goto L_0x0017;
    L_0x00b2:
        r0 = r2;
        goto L_0x009a;
    L_0x00b4:
        r0 = r2;
        goto L_0x009a;
    L_0x00b6:
        r0 = r2;
        goto L_0x00a1;
    L_0x00b8:
        r9.m5544a(r1);
        r9.f9124g = r2;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: kz.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || mo10579b() == null) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View b = mo10579b();
        if (b != null && mo10578b(b) == 0) {
            m5544a(false);
        }
        if (b != null) {
            return true;
        }
        return false;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f9135t = true;
        int i5 = i3 - i;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0348le c0348le = (C0348le) childAt.getLayoutParams();
                if (C0345kz.m5551h(childAt)) {
                    childAt.layout(c0348le.leftMargin, c0348le.topMargin, c0348le.leftMargin + childAt.getMeasuredWidth(), c0348le.topMargin + childAt.getMeasuredHeight());
                } else {
                    float f;
                    int i7;
                    int i8;
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (mo10575a(childAt, 3)) {
                        f = (float) measuredWidth;
                        i7 = (-measuredWidth) + ((int) (c0348le.f9143b * f));
                        f = ((float) (measuredWidth + i7)) / f;
                    } else {
                        f = (float) measuredWidth;
                        i7 = i5 - ((int) (c0348le.f9143b * f));
                        f = ((float) (i5 - i7)) / f;
                    }
                    float f2 = c0348le.f9143b;
                    int i9;
                    switch (c0348le.f9142a & 112) {
                        case 16:
                            int i10 = i4 - i2;
                            i9 = (i10 - measuredHeight) / 2;
                            if (i9 < c0348le.topMargin) {
                                i9 = c0348le.topMargin;
                            } else if (i9 + measuredHeight > i10 - c0348le.bottomMargin) {
                                i9 = (i10 - c0348le.bottomMargin) - measuredHeight;
                            }
                            childAt.layout(i7, i9, measuredWidth + i7, measuredHeight + i9);
                            break;
                        case 80:
                            i9 = i4 - i2;
                            childAt.layout(i7, (i9 - c0348le.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i7, i9 - c0348le.bottomMargin);
                            break;
                        default:
                            childAt.layout(i7, c0348le.topMargin, measuredWidth + i7, measuredHeight + c0348le.topMargin);
                            break;
                    }
                    if (f != f2) {
                        mo10573a(childAt, f);
                    }
                    if (c0348le.f9143b > 0.0f) {
                        i8 = 0;
                    } else {
                        i8 = 4;
                    }
                    if (childAt.getVisibility() != i8) {
                        childAt.setVisibility(i8);
                    }
                }
            }
        }
        this.f9135t = false;
        this.f9136u = false;
    }

    @SuppressLint({"WrongConstant"})
    protected void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            mode = size;
            mode2 = size2;
        } else if (isInEditMode()) {
            if (mode != kvl.UNSET_ENUM_VALUE && mode == 0) {
                size = VideoProviderSource.TIMESTAMP_FILTER_SIZE;
            }
            if (mode2 == kvl.UNSET_ENUM_VALUE) {
                mode = size;
                mode2 = size2;
            } else if (mode2 == 0) {
                mode = size;
                mode2 = VideoProviderSource.TIMESTAMP_FILTER_SIZE;
            } else {
                mode = size;
                mode2 = size2;
            }
        } else {
            throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
        }
        setMeasuredDimension(mode, mode2);
        Object obj = this.f9126i != null ? C0315jm.m4632g(this) ? 1 : null : null;
        int j = C0315jm.m4635j(this);
        int childCount = getChildCount();
        Object obj2 = null;
        Object obj3 = null;
        int i3 = 0;
        while (i3 < childCount) {
            Object obj4;
            Object obj5;
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 8) {
                obj4 = obj3;
                obj5 = obj2;
            } else {
                int absoluteGravity;
                C0348le c0348le = (C0348le) childAt.getLayoutParams();
                if (obj != null) {
                    absoluteGravity = Gravity.getAbsoluteGravity(c0348le.f9142a, j);
                    WindowInsets windowInsets;
                    if (C0315jm.m4632g(childAt)) {
                        windowInsets = (WindowInsets) this.f9126i;
                        if (absoluteGravity == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsets);
                    } else {
                        windowInsets = (WindowInsets) this.f9126i;
                        if (absoluteGravity == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        c0348le.leftMargin = windowInsets.getSystemWindowInsetLeft();
                        c0348le.topMargin = windowInsets.getSystemWindowInsetTop();
                        c0348le.rightMargin = windowInsets.getSystemWindowInsetRight();
                        c0348le.bottomMargin = windowInsets.getSystemWindowInsetBottom();
                    }
                }
                StringBuilder stringBuilder;
                if (C0345kz.m5551h(childAt)) {
                    childAt.measure(MeasureSpec.makeMeasureSpec((mode - c0348le.leftMargin) - c0348le.rightMargin, 1073741824), MeasureSpec.makeMeasureSpec((mode2 - c0348le.topMargin) - c0348le.bottomMargin, 1073741824));
                    obj4 = obj3;
                    obj5 = obj2;
                } else if (C0345kz.m5549f(childAt)) {
                    if (f9114l) {
                        float f = C0315jm.m4631f(childAt);
                        float f2 = this.f9129n;
                        if (f != f2) {
                            C0315jm.m4608a(childAt, f2);
                        }
                    }
                    absoluteGravity = mo10581c(childAt) & 7;
                    if ((absoluteGravity == 3 && obj2 != null) || !(absoluteGravity == 3 || obj3 == null)) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Child drawer has absolute gravity ");
                        stringBuilder.append(C0345kz.m5545c(absoluteGravity));
                        stringBuilder.append(" but this ");
                        stringBuilder.append("DrawerLayout");
                        stringBuilder.append(" already has a ");
                        stringBuilder.append("drawer view along that edge");
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                    if (absoluteGravity != 3) {
                        obj5 = 1;
                    } else {
                        obj5 = obj3;
                    }
                    if (absoluteGravity == 3) {
                        obj3 = 1;
                    } else {
                        obj3 = obj2;
                    }
                    childAt.measure(C0345kz.getChildMeasureSpec(i, (this.f9130o + c0348le.leftMargin) + c0348le.rightMargin, c0348le.width), C0345kz.getChildMeasureSpec(i2, c0348le.topMargin + c0348le.bottomMargin, c0348le.height));
                    obj4 = obj5;
                    obj5 = obj3;
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Child ");
                    stringBuilder.append(childAt);
                    stringBuilder.append(" at index ");
                    stringBuilder.append(i3);
                    stringBuilder.append(" does not have a valid layout_gravity - must be Gravity.LEFT, ");
                    stringBuilder.append("Gravity.RIGHT or Gravity.NO_GRAVITY");
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
            i3++;
            obj2 = obj5;
            obj3 = obj4;
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C0709lf) {
            C0709lf c0709lf = (C0709lf) parcelable;
            super.onRestoreInstanceState(c0709lf.f7997e);
            int i = c0709lf.f22029a;
            if (i != 0) {
                View a = mo10570a(i);
                if (a != null) {
                    m5553j(a);
                }
            }
            i = c0709lf.f22030b;
            if (i != 3) {
                m5543a(i, 3);
            }
            i = c0709lf.f22031c;
            if (i != 3) {
                m5543a(i, 5);
            }
            i = c0709lf.f22032f;
            if (i != 3) {
                m5543a(i, 8388611);
            }
            i = c0709lf.f22033g;
            if (i != 3) {
                m5543a(i, (int) WearableExtender.DEFAULT_CONTENT_ICON_GRAVITY);
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void onRtlPropertiesChanged(int i) {
        if (!f9114l) {
            C0315jm.m4635j(this);
            C0315jm.m4635j(this);
        }
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable c0709lf = new C0709lf(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C0348le c0348le = (C0348le) getChildAt(i).getLayoutParams();
            int i2 = c0348le.f9145d;
            if (i2 == 1 || i2 == 2) {
                c0709lf.f22029a = c0348le.f9142a;
                break;
            }
        }
        c0709lf.f22030b = this.f9137v;
        c0709lf.f22031c = this.f9138w;
        c0709lf.f22032f = this.f9139x;
        c0709lf.f22033g = this.f9140y;
        return c0709lf;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        this.f9121d.mo10620a(motionEvent);
        this.f9122e.mo10620a(motionEvent);
        float x;
        float y;
        switch (motionEvent.getAction() & Illuminant.kOther) {
            case 0:
                x = motionEvent.getX();
                y = motionEvent.getY();
                this.f9141z = x;
                this.f9115A = y;
                this.f9124g = false;
                break;
            case 1:
                x = motionEvent.getX();
                y = motionEvent.getY();
                View a = this.f9121d.mo10618a((int) x, (int) y);
                if (a == null) {
                    z = true;
                } else if (C0345kz.m5551h(a)) {
                    x -= this.f9141z;
                    y -= this.f9115A;
                    int i = this.f9121d.f9152b;
                    if ((x * x) + (y * y) < ((float) (i * i))) {
                        View e = m5547e();
                        if (e == null) {
                            z = true;
                        } else if (mo10578b(e) == 2) {
                            z = true;
                        }
                    } else {
                        z = true;
                    }
                } else {
                    z = true;
                }
                m5544a(z);
                break;
            case 3:
                m5544a(true);
                this.f9124g = false;
                break;
        }
        return true;
    }

    /* renamed from: j */
    private final void m5553j(View view) {
        if (C0345kz.m5549f(view)) {
            C0348le c0348le = (C0348le) view.getLayoutParams();
            if (this.f9136u) {
                c0348le.f9143b = 1.0f;
                c0348le.f9145d = 1;
                mo10574a(view, true);
            } else {
                c0348le.f9145d |= 2;
                if (mo10575a(view, 3)) {
                    this.f9121d.mo10623a(view, 0, view.getTop());
                } else {
                    this.f9122e.mo10623a(view, getWidth() - view.getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("View ");
        stringBuilder.append(view);
        stringBuilder.append(" is not a sliding drawer");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: d */
    public final void mo10585d() {
        View a = mo10570a(8388611);
        if (a == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No drawer view found with gravity ");
            stringBuilder.append(C0345kz.m5545c(8388611));
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        m5553j(a);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            m5544a(true);
        }
    }

    public void requestLayout() {
        if (!this.f9135t) {
            super.requestLayout();
        }
    }

    /* renamed from: b */
    public final void mo10580b(int i) {
        m5543a(i, 3);
        m5543a(i, 5);
    }

    /* renamed from: a */
    private final void m5543a(int i, int i2) {
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, C0315jm.m4635j(this));
        switch (i2) {
            case 3:
                this.f9137v = i;
                break;
            case 5:
                this.f9138w = i;
                break;
            case 8388611:
                this.f9139x = i;
                break;
            case WearableExtender.DEFAULT_CONTENT_ICON_GRAVITY /*8388613*/:
                this.f9140y = i;
                break;
        }
        if (i != 0) {
            C0354lo c0354lo;
            if (absoluteGravity != 3) {
                c0354lo = this.f9122e;
            } else {
                c0354lo = this.f9121d;
            }
            c0354lo.mo10619a();
        }
        View a;
        switch (i) {
            case 1:
                a = mo10570a(absoluteGravity);
                if (a != null) {
                    mo10572a(a);
                    return;
                }
                return;
            case 2:
                a = mo10570a(absoluteGravity);
                if (a != null) {
                    m5553j(a);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    final void mo10573a(View view, float f) {
        C0348le c0348le = (C0348le) view.getLayoutParams();
        if (f != c0348le.f9143b) {
            c0348le.f9143b = f;
            List list = this.f9125h;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C0347ld) this.f9125h.get(size)).onDrawerSlide(view, f);
                }
            }
        }
    }

    /* renamed from: a */
    final void mo10574a(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || C0345kz.m5549f(childAt)) && !(z && childAt == view)) {
                C0315jm.m4627c(childAt, 4);
            } else {
                C0315jm.m4627c(childAt, 1);
            }
        }
    }
}
