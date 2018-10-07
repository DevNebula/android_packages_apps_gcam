package p000;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: lo */
public final class C0354lo {
    /* renamed from: v */
    private static final Interpolator f9150v = new C0355lp();
    /* renamed from: a */
    public int f9151a;
    /* renamed from: b */
    public int f9152b;
    /* renamed from: c */
    public float[] f9153c;
    /* renamed from: d */
    public float[] f9154d;
    /* renamed from: e */
    public float[] f9155e;
    /* renamed from: f */
    public float[] f9156f;
    /* renamed from: g */
    public float f9157g;
    /* renamed from: h */
    public int f9158h;
    /* renamed from: i */
    public int f9159i;
    /* renamed from: j */
    public View f9160j;
    /* renamed from: k */
    private int f9161k = -1;
    /* renamed from: l */
    private int[] f9162l;
    /* renamed from: m */
    private int[] f9163m;
    /* renamed from: n */
    private int[] f9164n;
    /* renamed from: o */
    private int f9165o;
    /* renamed from: p */
    private VelocityTracker f9166p;
    /* renamed from: q */
    private float f9167q;
    /* renamed from: r */
    private OverScroller f9168r;
    /* renamed from: s */
    private final C0357lr f9169s;
    /* renamed from: t */
    private boolean f9170t;
    /* renamed from: u */
    private final ViewGroup f9171u;
    /* renamed from: w */
    private final Runnable f9172w = new C0356lq(this);

    private C0354lo(Context context, ViewGroup viewGroup, C0357lr c0357lr) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (c0357lr == null) {
            throw new IllegalArgumentException("Callback may not be null");
        } else {
            this.f9171u = viewGroup;
            this.f9169s = c0357lr;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f9158h = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f9152b = viewConfiguration.getScaledTouchSlop();
            this.f9167q = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f9157g = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f9168r = new OverScroller(context, f9150v);
        }
    }

    /* renamed from: a */
    public final void mo10619a() {
        this.f9161k = -1;
        float[] fArr = this.f9153c;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f9154d, 0.0f);
            Arrays.fill(this.f9155e, 0.0f);
            Arrays.fill(this.f9156f, 0.0f);
            Arrays.fill(this.f9162l, 0);
            Arrays.fill(this.f9163m, 0);
            Arrays.fill(this.f9164n, 0);
            this.f9165o = 0;
        }
        VelocityTracker velocityTracker = this.f9166p;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f9166p = null;
        }
    }

    /* renamed from: a */
    public final void mo10621a(View view, int i) {
        if (view.getParent() != this.f9171u) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
            stringBuilder.append(this.f9171u);
            stringBuilder.append(")");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f9160j = view;
        this.f9161k = i;
        this.f9169s.mo10638c(view, i);
        mo10624b(1);
    }

    /* renamed from: a */
    private final boolean m5576a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f9162l[i] & i2) != i2 || (this.f9159i & i2) == 0 || (this.f9164n[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f9163m[i] & i2;
        if (i3 == i2) {
            return false;
        }
        float f3 = (float) this.f9152b;
        if ((abs > f3 || abs2 > f3) && i3 == 0 && abs > f3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m5578a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z;
        int a = this.f9169s.mo10631a(view);
        if (this.f9169s.mo10630a() <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (a > 0 && z) {
            int i = this.f9152b;
            if ((f * f) + (f2 * f2) > ((float) (i * i))) {
                return true;
            }
            return false;
        } else if (a > 0) {
            if (Math.abs(f) > ((float) this.f9152b)) {
                return true;
            }
            return false;
        } else if (!z || Math.abs(f2) <= ((float) this.f9152b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    private static float m5571a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs <= f3) {
            return f;
        }
        if (f <= 0.0f) {
            return -f3;
        }
        return f3;
    }

    /* renamed from: a */
    private static int m5572a(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs <= i3) {
            return i;
        }
        if (i <= 0) {
            return -i3;
        }
        return i3;
    }

    /* renamed from: c */
    private final void m5584c(int i) {
        if (this.f9153c != null && mo10622a(i)) {
            this.f9153c[i] = 0.0f;
            this.f9154d[i] = 0.0f;
            this.f9155e[i] = 0.0f;
            this.f9156f[i] = 0.0f;
            this.f9162l[i] = 0;
            this.f9163m[i] = 0;
            this.f9164n[i] = 0;
            this.f9165o &= (1 << i) ^ -1;
        }
    }

    /* renamed from: b */
    private final int m5579b(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f9171u.getWidth();
        float f = (float) (width / 2);
        float sin = (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i)) / ((float) width)) - 8.0f) * 0.47123894f))) * f) + f;
        int abs = Math.abs(i2);
        if (abs > 0) {
            width = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) << 2;
        } else {
            width = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(width, 600);
    }

    /* renamed from: b */
    public final boolean mo10625b() {
        if (this.f9151a == 2) {
            boolean computeScrollOffset = this.f9168r.computeScrollOffset();
            int currX = this.f9168r.getCurrX();
            int currY = this.f9168r.getCurrY();
            int left = currX - this.f9160j.getLeft();
            int top = currY - this.f9160j.getTop();
            if (left != 0) {
                C0315jm.m4609a(this.f9160j, left);
            }
            if (top != 0) {
                C0315jm.m4624b(this.f9160j, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f9169s.mo10639d(this.f9160j, currX);
            }
            if (computeScrollOffset && currX == this.f9168r.getFinalX() && currY == this.f9168r.getFinalY()) {
                this.f9168r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f9171u.post(this.f9172w);
            }
        }
        if (this.f9151a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C0354lo m5573a(ViewGroup viewGroup, C0357lr c0357lr) {
        C0354lo b = C0354lo.m5580b(viewGroup, c0357lr);
        b.f9152b = (int) ((float) b.f9152b);
        return b;
    }

    /* renamed from: b */
    public static C0354lo m5580b(ViewGroup viewGroup, C0357lr c0357lr) {
        return new C0354lo(viewGroup.getContext(), viewGroup, c0357lr);
    }

    /* renamed from: a */
    private final void m5574a(float f, float f2) {
        this.f9170t = true;
        this.f9169s.mo10635a(this.f9160j, f, f2);
        this.f9170t = false;
        if (this.f9151a == 1) {
            mo10624b(0);
        }
    }

    /* renamed from: a */
    public final View mo10618a(int i, int i2) {
        for (int childCount = this.f9171u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f9171u.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    private final boolean m5577a(int i, int i2, int i3, int i4) {
        int left = this.f9160j.getLeft();
        int top = this.f9160j.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f9168r.abortAnimation();
            mo10624b(0);
            return false;
        }
        float f;
        float f2;
        View view = this.f9160j;
        int a = C0354lo.m5572a(i3, (int) this.f9157g, (int) this.f9167q);
        int a2 = C0354lo.m5572a(i4, (int) this.f9157g, (int) this.f9167q);
        int abs = Math.abs(i5);
        int abs2 = Math.abs(i6);
        int abs3 = Math.abs(a);
        int abs4 = Math.abs(a2);
        int i7 = abs3 + abs4;
        int i8 = abs + abs2;
        if (a == 0) {
            f = ((float) abs) / ((float) i8);
        } else {
            f = ((float) abs3) / ((float) i7);
        }
        if (a2 == 0) {
            f2 = ((float) abs2) / ((float) i8);
        } else {
            f2 = ((float) abs4) / ((float) i7);
        }
        int b = m5579b(i5, a, this.f9169s.mo10631a(view));
        f *= (float) b;
        this.f9168r.startScroll(left, top, i5, i6, (int) ((f2 * ((float) m5579b(i6, a2, this.f9169s.mo10630a()))) + f));
        mo10624b(2);
        return true;
    }

    /* renamed from: a */
    public final boolean mo10622a(int i) {
        return (this.f9165o & (1 << i)) != 0;
    }

    /* renamed from: d */
    private final boolean m5586d(int i) {
        if (mo10622a(i)) {
            return true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ignoring pointerId=");
        stringBuilder.append(i);
        stringBuilder.append(" because ACTION_DOWN was not received ");
        stringBuilder.append("for this pointer before ACTION_MOVE. It likely happened because ");
        stringBuilder.append(" ViewDragHelper did not receive all the events in the event stream.");
        Log.e("ViewDragHelper", stringBuilder.toString());
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084  */
    /* renamed from: a */
    public final void mo10620a(android.view.MotionEvent r10) {
        /*
        r9 = this;
        r2 = -1;
        r6 = 0;
        r1 = 1;
        r0 = 0;
        r3 = r10.getActionMasked();
        r4 = r10.getActionIndex();
        if (r3 != 0) goto L_0x0011;
    L_0x000e:
        r9.mo10619a();
    L_0x0011:
        r5 = r9.f9166p;
        if (r5 != 0) goto L_0x001b;
    L_0x0015:
        r5 = android.view.VelocityTracker.obtain();
        r9.f9166p = r5;
    L_0x001b:
        r5 = r9.f9166p;
        r5.addMovement(r10);
        switch(r3) {
            case 0: goto L_0x0024;
            case 1: goto L_0x01a5;
            case 2: goto L_0x00ed;
            case 3: goto L_0x00e1;
            case 4: goto L_0x0023;
            case 5: goto L_0x008d;
            case 6: goto L_0x004b;
            default: goto L_0x0023;
        };
    L_0x0023:
        return;
    L_0x0024:
        r1 = r10.getX();
        r2 = r10.getY();
        r0 = r10.getPointerId(r0);
        r3 = (int) r1;
        r4 = (int) r2;
        r3 = r9.mo10618a(r3, r4);
        r9.m5581b(r1, r2, r0);
        r9.m5582b(r3, r0);
        r1 = r9.f9162l;
        r0 = r1[r0];
        r1 = r9.f9159i;
        r0 = r0 & r1;
        if (r0 == 0) goto L_0x0023;
    L_0x0045:
        r0 = r9.f9169s;
        r0.mo10637c();
        goto L_0x0023;
    L_0x004b:
        r3 = r10.getPointerId(r4);
        r4 = r9.f9151a;
        if (r4 != r1) goto L_0x0087;
    L_0x0053:
        r1 = r9.f9161k;
        if (r3 != r1) goto L_0x0087;
    L_0x0057:
        r1 = r10.getPointerCount();
    L_0x005b:
        if (r0 >= r1) goto L_0x008b;
    L_0x005d:
        r4 = r10.getPointerId(r0);
        r5 = r9.f9161k;
        if (r4 != r5) goto L_0x0068;
    L_0x0065:
        r0 = r0 + 1;
        goto L_0x005b;
    L_0x0068:
        r5 = r10.getX(r0);
        r6 = r10.getY(r0);
        r5 = (int) r5;
        r6 = (int) r6;
        r5 = r9.mo10618a(r5, r6);
        r6 = r9.f9160j;
        if (r5 != r6) goto L_0x0065;
    L_0x007a:
        r4 = r9.m5582b(r6, r4);
        if (r4 == 0) goto L_0x0065;
    L_0x0080:
        r0 = r9.f9161k;
    L_0x0082:
        if (r0 != r2) goto L_0x0087;
    L_0x0084:
        r9.m5583c();
    L_0x0087:
        r9.m5584c(r3);
        goto L_0x0023;
    L_0x008b:
        r0 = r2;
        goto L_0x0082;
    L_0x008d:
        r2 = r10.getPointerId(r4);
        r3 = r10.getX(r4);
        r4 = r10.getY(r4);
        r9.m5581b(r3, r4, r2);
        r5 = r9.f9151a;
        if (r5 != 0) goto L_0x00b9;
    L_0x00a0:
        r0 = (int) r3;
        r1 = (int) r4;
        r0 = r9.mo10618a(r0, r1);
        r9.m5582b(r0, r2);
        r0 = r9.f9162l;
        r0 = r0[r2];
        r1 = r9.f9159i;
        r0 = r0 & r1;
        if (r0 == 0) goto L_0x0023;
    L_0x00b2:
        r0 = r9.f9169s;
        r0.mo10637c();
        goto L_0x0023;
    L_0x00b9:
        r3 = (int) r3;
        r4 = (int) r4;
        r5 = r9.f9160j;
        if (r5 == 0) goto L_0x00d8;
    L_0x00bf:
        r6 = r5.getLeft();
        if (r3 < r6) goto L_0x00d8;
    L_0x00c5:
        r6 = r5.getRight();
        if (r3 >= r6) goto L_0x00d8;
    L_0x00cb:
        r3 = r5.getTop();
        if (r4 < r3) goto L_0x00d8;
    L_0x00d1:
        r3 = r5.getBottom();
        if (r4 >= r3) goto L_0x00d8;
    L_0x00d7:
        r0 = r1;
    L_0x00d8:
        if (r0 == 0) goto L_0x0023;
    L_0x00da:
        r0 = r9.f9160j;
        r9.m5582b(r0, r2);
        goto L_0x0023;
    L_0x00e1:
        r0 = r9.f9151a;
        if (r0 != r1) goto L_0x00e8;
    L_0x00e5:
        r9.m5574a(r6, r6);
    L_0x00e8:
        r9.mo10619a();
        goto L_0x0023;
    L_0x00ed:
        r2 = r9.f9151a;
        if (r2 != r1) goto L_0x0160;
    L_0x00f1:
        r0 = r9.f9161k;
        r0 = r9.m5586d(r0);
        if (r0 == 0) goto L_0x0023;
    L_0x00f9:
        r0 = r9.f9161k;
        r0 = r10.findPointerIndex(r0);
        r1 = r10.getX(r0);
        r0 = r10.getY(r0);
        r2 = r9.f9155e;
        r3 = r9.f9161k;
        r2 = r2[r3];
        r1 = r1 - r2;
        r1 = (int) r1;
        r2 = r9.f9156f;
        r2 = r2[r3];
        r0 = r0 - r2;
        r2 = (int) r0;
        r0 = r9.f9160j;
        r0 = r0.getLeft();
        r0 = r0 + r1;
        r3 = r9.f9160j;
        r3 = r3.getTop();
        r3 = r3 + r2;
        r4 = r9.f9160j;
        r4 = r4.getLeft();
        r5 = r9.f9160j;
        r5 = r5.getTop();
        if (r1 == 0) goto L_0x0140;
    L_0x0131:
        r6 = r9.f9169s;
        r7 = r9.f9160j;
        r0 = r6.mo10632a(r7, r0);
        r6 = r9.f9160j;
        r4 = r0 - r4;
        p000.C0315jm.m4609a(r6, r4);
    L_0x0140:
        if (r2 == 0) goto L_0x0150;
    L_0x0142:
        r4 = r9.f9169s;
        r6 = r9.f9160j;
        r3 = r4.mo10636b(r6, r3);
        r4 = r9.f9160j;
        r3 = r3 - r5;
        p000.C0315jm.m4624b(r4, r3);
    L_0x0150:
        if (r1 != 0) goto L_0x0154;
    L_0x0152:
        if (r2 == 0) goto L_0x015b;
    L_0x0154:
        r1 = r9.f9169s;
        r2 = r9.f9160j;
        r1.mo10639d(r2, r0);
    L_0x015b:
        r9.m5585c(r10);
        goto L_0x0023;
    L_0x0160:
        r2 = r10.getPointerCount();
    L_0x0164:
        if (r0 >= r2) goto L_0x019d;
    L_0x0166:
        r3 = r10.getPointerId(r0);
        r4 = r9.m5586d(r3);
        if (r4 == 0) goto L_0x01a2;
    L_0x0170:
        r4 = r10.getX(r0);
        r5 = r10.getY(r0);
        r6 = r9.f9153c;
        r6 = r6[r3];
        r6 = r4 - r6;
        r7 = r9.f9154d;
        r7 = r7[r3];
        r7 = r5 - r7;
        r9.m5575a(r6, r7, r3);
        r8 = r9.f9151a;
        if (r8 == r1) goto L_0x019d;
    L_0x018b:
        r4 = (int) r4;
        r5 = (int) r5;
        r4 = r9.mo10618a(r4, r5);
        r5 = r9.m5578a(r4, r6, r7);
        if (r5 == 0) goto L_0x01a2;
    L_0x0197:
        r3 = r9.m5582b(r4, r3);
        if (r3 == 0) goto L_0x01a2;
    L_0x019d:
        r9.m5585c(r10);
        goto L_0x0023;
    L_0x01a2:
        r0 = r0 + 1;
        goto L_0x0164;
    L_0x01a5:
        r0 = r9.f9151a;
        if (r0 != r1) goto L_0x01ac;
    L_0x01a9:
        r9.m5583c();
    L_0x01ac:
        r9.mo10619a();
        goto L_0x0023;
        */
        throw new UnsupportedOperationException("Method not decompiled: lo.a(android.view.MotionEvent):void");
    }

    /* renamed from: c */
    private final void m5583c() {
        this.f9166p.computeCurrentVelocity(1000, this.f9167q);
        m5574a(C0354lo.m5571a(this.f9166p.getXVelocity(this.f9161k), this.f9157g, this.f9167q), C0354lo.m5571a(this.f9166p.getYVelocity(this.f9161k), this.f9157g, this.f9167q));
    }

    /* renamed from: a */
    private final void m5575a(float f, float f2, int i) {
        int a = m5576a(f, f2, i, 1);
        if (m5576a(f2, f, i, 4)) {
            a |= 4;
        }
        if (m5576a(f, f2, i, 2)) {
            a |= 2;
        }
        if (m5576a(f2, f, i, 8)) {
            a |= 8;
        }
        if (a != 0) {
            int[] iArr = this.f9163m;
            iArr[i] = iArr[i] | a;
            this.f9169s.mo10634a(a, i);
        }
    }

    /* renamed from: b */
    private final void m5581b(float f, float f2, int i) {
        int i2;
        int i3 = 0;
        Object obj = this.f9153c;
        if (obj == null || obj.length <= i) {
            i2 = i + 1;
            Object obj2 = new float[i2];
            Object obj3 = new float[i2];
            Object obj4 = new float[i2];
            Object obj5 = new float[i2];
            Object obj6 = new int[i2];
            Object obj7 = new int[i2];
            Object obj8 = new int[i2];
            if (obj != null) {
                System.arraycopy(obj, 0, obj2, 0, obj.length);
                obj = this.f9154d;
                System.arraycopy(obj, 0, obj3, 0, obj.length);
                obj = this.f9155e;
                System.arraycopy(obj, 0, obj4, 0, obj.length);
                obj = this.f9156f;
                System.arraycopy(obj, 0, obj5, 0, obj.length);
                obj = this.f9162l;
                System.arraycopy(obj, 0, obj6, 0, obj.length);
                obj = this.f9163m;
                System.arraycopy(obj, 0, obj7, 0, obj.length);
                obj = this.f9164n;
                System.arraycopy(obj, 0, obj8, 0, obj.length);
            }
            this.f9153c = obj2;
            this.f9154d = obj3;
            this.f9155e = obj4;
            this.f9156f = obj5;
            this.f9162l = obj6;
            this.f9163m = obj7;
            this.f9164n = obj8;
        }
        float[] fArr = this.f9153c;
        this.f9155e[i] = f;
        fArr[i] = f;
        fArr = this.f9154d;
        this.f9156f[i] = f2;
        fArr[i] = f2;
        int[] iArr = this.f9162l;
        i2 = (int) f;
        int i4 = (int) f2;
        if (i2 < this.f9171u.getLeft() + this.f9158h) {
            i3 = 1;
        }
        if (i4 < this.f9171u.getTop() + this.f9158h) {
            i3 |= 4;
        }
        if (i2 > this.f9171u.getRight() - this.f9158h) {
            i3 |= 2;
        }
        if (i4 > this.f9171u.getBottom() - this.f9158h) {
            i3 |= 8;
        }
        iArr[i] = i3;
        this.f9165o |= 1 << i;
    }

    /* renamed from: c */
    private final void m5585c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m5586d(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f9155e[pointerId] = x;
                this.f9156f[pointerId] = y;
            }
        }
    }

    /* renamed from: b */
    final void mo10624b(int i) {
        this.f9171u.removeCallbacks(this.f9172w);
        if (this.f9151a != i) {
            this.f9151a = i;
            this.f9169s.mo10633a(i);
            if (this.f9151a == 0) {
                this.f9160j = null;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo10626b(int i, int i2) {
        if (this.f9170t) {
            return m5577a(i, i2, (int) this.f9166p.getXVelocity(this.f9161k), (int) this.f9166p.getYVelocity(this.f9161k));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Missing block: B:49:0x00e5, code:
            if (r8 == r7) goto L_0x00c8;
     */
    /* renamed from: b */
    public final boolean mo10627b(android.view.MotionEvent r14) {
        /*
        r13 = this;
        r0 = r14.getActionMasked();
        r1 = r14.getActionIndex();
        if (r0 != 0) goto L_0x000d;
    L_0x000a:
        r13.mo10619a();
    L_0x000d:
        r2 = r13.f9166p;
        if (r2 != 0) goto L_0x0017;
    L_0x0011:
        r2 = android.view.VelocityTracker.obtain();
        r13.f9166p = r2;
    L_0x0017:
        r2 = r13.f9166p;
        r2.addMovement(r14);
        switch(r0) {
            case 0: goto L_0x00f5;
            case 1: goto L_0x00f0;
            case 2: goto L_0x0063;
            case 3: goto L_0x00f0;
            case 4: goto L_0x001f;
            case 5: goto L_0x0030;
            case 6: goto L_0x0028;
            default: goto L_0x001f;
        };
    L_0x001f:
        r0 = r13.f9151a;
        r1 = 1;
        if (r0 != r1) goto L_0x0026;
    L_0x0024:
        r0 = 1;
    L_0x0025:
        return r0;
    L_0x0026:
        r0 = 0;
        goto L_0x0025;
    L_0x0028:
        r0 = r14.getPointerId(r1);
        r13.m5584c(r0);
        goto L_0x001f;
    L_0x0030:
        r0 = r14.getPointerId(r1);
        r2 = r14.getX(r1);
        r1 = r14.getY(r1);
        r13.m5581b(r2, r1, r0);
        r3 = r13.f9151a;
        if (r3 != 0) goto L_0x0052;
    L_0x0043:
        r1 = r13.f9162l;
        r0 = r1[r0];
        r1 = r13.f9159i;
        r0 = r0 & r1;
        if (r0 == 0) goto L_0x001f;
    L_0x004c:
        r0 = r13.f9169s;
        r0.mo10637c();
        goto L_0x001f;
    L_0x0052:
        r4 = 2;
        if (r3 != r4) goto L_0x001f;
    L_0x0055:
        r2 = (int) r2;
        r1 = (int) r1;
        r1 = r13.mo10618a(r2, r1);
        r2 = r13.f9160j;
        if (r1 != r2) goto L_0x001f;
    L_0x005f:
        r13.m5582b(r1, r0);
        goto L_0x001f;
    L_0x0063:
        r0 = r13.f9153c;
        if (r0 == 0) goto L_0x001f;
    L_0x0067:
        r0 = r13.f9154d;
        if (r0 == 0) goto L_0x001f;
    L_0x006b:
        r2 = r14.getPointerCount();
        r0 = 0;
        r1 = r0;
    L_0x0071:
        if (r1 >= r2) goto L_0x00de;
    L_0x0073:
        r3 = r14.getPointerId(r1);
        r0 = r13.m5586d(r3);
        if (r0 == 0) goto L_0x00ec;
    L_0x007d:
        r0 = r14.getX(r1);
        r4 = r14.getY(r1);
        r5 = r13.f9153c;
        r5 = r5[r3];
        r5 = r0 - r5;
        r6 = r13.f9154d;
        r6 = r6[r3];
        r6 = r4 - r6;
        r0 = (int) r0;
        r4 = (int) r4;
        r4 = r13.mo10618a(r0, r4);
        if (r4 == 0) goto L_0x00ea;
    L_0x0099:
        r0 = r13.m5578a(r4, r5, r6);
        if (r0 == 0) goto L_0x00e8;
    L_0x009f:
        r0 = 1;
    L_0x00a0:
        if (r0 == 0) goto L_0x00ce;
    L_0x00a2:
        r7 = r4.getLeft();
        r8 = r13.f9169s;
        r9 = (int) r5;
        r9 = r9 + r7;
        r8 = r8.mo10632a(r4, r9);
        r9 = r4.getTop();
        r10 = r13.f9169s;
        r11 = (int) r6;
        r11 = r11 + r9;
        r10 = r10.mo10636b(r4, r11);
        r11 = r13.f9169s;
        r11 = r11.mo10631a(r4);
        r12 = r13.f9169s;
        r12 = r12.mo10630a();
        if (r11 != 0) goto L_0x00e3;
    L_0x00c8:
        if (r12 == 0) goto L_0x00de;
    L_0x00ca:
        if (r12 <= 0) goto L_0x00ce;
    L_0x00cc:
        if (r10 == r9) goto L_0x00de;
    L_0x00ce:
        r13.m5575a(r5, r6, r3);
        r5 = r13.f9151a;
        r6 = 1;
        if (r5 == r6) goto L_0x00de;
    L_0x00d6:
        if (r0 == 0) goto L_0x00ec;
    L_0x00d8:
        r0 = r13.m5582b(r4, r3);
        if (r0 == 0) goto L_0x00ec;
    L_0x00de:
        r13.m5585c(r14);
        goto L_0x001f;
    L_0x00e3:
        if (r11 <= 0) goto L_0x00ce;
    L_0x00e5:
        if (r8 != r7) goto L_0x00ce;
    L_0x00e7:
        goto L_0x00c8;
    L_0x00e8:
        r0 = 0;
        goto L_0x00a0;
    L_0x00ea:
        r0 = 0;
        goto L_0x00a0;
    L_0x00ec:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0071;
    L_0x00f0:
        r13.mo10619a();
        goto L_0x001f;
    L_0x00f5:
        r0 = r14.getX();
        r1 = r14.getY();
        r2 = 0;
        r2 = r14.getPointerId(r2);
        r13.m5581b(r0, r1, r2);
        r0 = (int) r0;
        r1 = (int) r1;
        r0 = r13.mo10618a(r0, r1);
        r1 = r13.f9160j;
        if (r0 != r1) goto L_0x0117;
    L_0x010f:
        r1 = r13.f9151a;
        r3 = 2;
        if (r1 != r3) goto L_0x0117;
    L_0x0114:
        r13.m5582b(r0, r2);
    L_0x0117:
        r0 = r13.f9162l;
        r0 = r0[r2];
        r1 = r13.f9159i;
        r0 = r0 & r1;
        if (r0 == 0) goto L_0x001f;
    L_0x0120:
        r0 = r13.f9169s;
        r0.mo10637c();
        goto L_0x001f;
        */
        throw new UnsupportedOperationException("Method not decompiled: lo.b(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public final boolean mo10623a(View view, int i, int i2) {
        this.f9160j = view;
        this.f9161k = -1;
        boolean a = m5577a(i, i2, 0, 0);
        if (!(a || this.f9151a != 0 || this.f9160j == null)) {
            this.f9160j = null;
        }
        return a;
    }

    /* renamed from: b */
    private final boolean m5582b(View view, int i) {
        if (view == this.f9160j && this.f9161k == i) {
            return true;
        }
        if (view == null || !this.f9169s.mo10640e(view, i)) {
            return false;
        }
        this.f9161k = i;
        mo10621a(view, i);
        return true;
    }
}
