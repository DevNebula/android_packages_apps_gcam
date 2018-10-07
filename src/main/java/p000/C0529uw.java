package p000;

import android.support.p002v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* compiled from: PG */
/* renamed from: uw */
public final class C0529uw implements Runnable {
    /* renamed from: a */
    public int f9869a;
    /* renamed from: b */
    public int f9870b;
    /* renamed from: c */
    public OverScroller f9871c;
    /* renamed from: d */
    public Interpolator f9872d = RecyclerView.f656I;
    /* renamed from: e */
    public final /* synthetic */ RecyclerView f9873e;
    /* renamed from: f */
    private boolean f9874f = false;
    /* renamed from: g */
    private boolean f9875g = false;

    public C0529uw(RecyclerView recyclerView) {
        this.f9873e = recyclerView;
        this.f9871c = new OverScroller(recyclerView.getContext(), RecyclerView.f656I);
    }

    /* renamed from: a */
    public final void mo11307a() {
        if (this.f9874f) {
            this.f9875g = true;
            return;
        }
        this.f9873e.removeCallbacks(this);
        C0315jm.m4615a(this.f9873e, (Runnable) this);
    }

    public final void run() {
        RecyclerView recyclerView = this.f9873e;
        if (recyclerView.f711k == null) {
            mo11308b();
            return;
        }
        this.f9875g = false;
        this.f9874f = true;
        recyclerView.mo1113a();
        OverScroller overScroller = this.f9871c;
        C0517ug c0517ug = this.f9873e.f711k;
        if (overScroller.computeScrollOffset()) {
            int i;
            int i2;
            int i3;
            int i4;
            Object obj;
            Object obj2;
            int[] iArr = this.f9873e.f668G;
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.f9869a;
            int i6 = currY - this.f9870b;
            this.f9869a = currX;
            this.f9870b = currY;
            if (this.f9873e.mo1124a(i5, i6, iArr, null, 1)) {
                i = i6 - iArr[1];
                i2 = i5 - iArr[0];
            } else {
                i = i6;
                i2 = i5;
            }
            recyclerView = this.f9873e;
            if (recyclerView.f710j == null) {
                i5 = 0;
                i6 = 0;
                i3 = 0;
                i4 = 0;
            } else {
                recyclerView.mo1116a(i2, i, recyclerView.f669H);
                int[] iArr2 = this.f9873e.f669H;
                i5 = iArr2[0];
                i6 = iArr2[1];
                i3 = i2 - i5;
                i4 = i - i6;
            }
            if (!this.f9873e.f713m.isEmpty()) {
                this.f9873e.invalidate();
            }
            if (this.f9873e.getOverScrollMode() != 2) {
                this.f9873e.mo1114a(i2, i);
            }
            if (!(this.f9873e.mo1123a(i5, i6, i3, i4, null, 1) || (i3 == 0 && i4 == 0))) {
                int i7;
                int currVelocity = (int) overScroller.getCurrVelocity();
                if (i3 == currX) {
                    i7 = 0;
                } else if (i3 < 0) {
                    i7 = -currVelocity;
                } else if (i3 > 0) {
                    i7 = currVelocity;
                } else {
                    i7 = 0;
                }
                if (i4 == currY) {
                    currVelocity = 0;
                } else if (i4 < 0) {
                    currVelocity = -currVelocity;
                } else if (i4 <= 0) {
                    currVelocity = 0;
                }
                if (this.f9873e.getOverScrollMode() != 2) {
                    View view = this.f9873e;
                    if (i7 < 0) {
                        view.mo1143d();
                        view.f720t.onAbsorb(-i7);
                    } else if (i7 > 0) {
                        view.mo1151e();
                        view.f722v.onAbsorb(i7);
                    }
                    if (currVelocity < 0) {
                        view.mo1152f();
                        view.f721u.onAbsorb(-currVelocity);
                    } else if (currVelocity > 0) {
                        view.mo1131c();
                        view.f723w.onAbsorb(currVelocity);
                    }
                    if (!(i7 == 0 && currVelocity == 0)) {
                        C0315jm.m4601A(view);
                    }
                }
                if ((i7 != 0 || i3 == currX || overScroller.getFinalX() == 0) && (currVelocity != 0 || i4 == currY || overScroller.getFinalY() == 0)) {
                    overScroller.abortAnimation();
                }
            }
            if (!(i5 == 0 && i6 == 0)) {
                this.f9873e.mo1126b();
            }
            if (!this.f9873e.awakenScrollBars()) {
                this.f9873e.invalidate();
            }
            if (i == 0) {
                obj = null;
            } else if (!this.f9873e.f711k.mo11264i()) {
                obj = null;
            } else if (i6 == i) {
                i6 = 1;
            } else {
                obj = null;
            }
            if (i2 == 0) {
                obj2 = null;
            } else if (!this.f9873e.f711k.mo11263h()) {
                obj2 = null;
            } else if (i5 == i2) {
                obj2 = 1;
            } else {
                obj2 = null;
            }
            if (i2 == 0 && i == 0) {
                obj2 = 1;
            } else if (obj2 != null) {
                obj2 = 1;
            } else if (obj == null) {
                obj2 = null;
            } else {
                obj2 = 1;
            }
            if (overScroller.isFinished() || (r0 == null && !this.f9873e.mo1161i().mo9421a(1))) {
                this.f9873e.mo1127b(0);
                if (RecyclerView.f661b) {
                    this.f9873e.f726z.mo11279a();
                }
                this.f9873e.mo1132c(1);
            } else {
                mo11307a();
                recyclerView = this.f9873e;
                C0483ss c0483ss = recyclerView.f725y;
                if (c0483ss != null) {
                    c0483ss.mo11112a(recyclerView, i2, i);
                }
            }
        }
        this.f9874f = false;
        if (this.f9875g) {
            mo11307a();
        }
    }

    /* renamed from: b */
    public final void mo11308b() {
        this.f9873e.removeCallbacks(this);
        this.f9871c.abortAnimation();
    }
}
