package p000;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;

/* compiled from: PG */
/* renamed from: ba */
public class C0809ba extends C0637be {
    /* renamed from: a */
    public OverScroller f22548a;
    /* renamed from: b */
    private Runnable f22549b;
    /* renamed from: c */
    private boolean f22550c;
    /* renamed from: f */
    private int f22551f = -1;
    /* renamed from: g */
    private int f22552g;
    /* renamed from: h */
    private int f22553h = -1;
    /* renamed from: i */
    private VelocityTracker f22554i;

    public C0809ba(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo406a() {
        return false;
    }

    /* renamed from: d */
    private final void m14974d() {
        if (this.f22554i == null) {
            this.f22554i = VelocityTracker.obtain();
        }
    }

    /* renamed from: a */
    public int mo400a(View view) {
        return -view.getHeight();
    }

    /* renamed from: b */
    public int mo412b(View view) {
        return view.getHeight();
    }

    /* renamed from: b */
    public int mo411b() {
        return mo12361c();
    }

    /* renamed from: a_ */
    public void mo410a_(View view) {
    }

    /* renamed from: a */
    public final boolean mo422a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f22553h < 0) {
            this.f22553h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getAction() == 2 && this.f22550c) {
            return true;
        }
        VelocityTracker velocityTracker;
        int y;
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f22550c = false;
                int x = (int) motionEvent.getX();
                y = (int) motionEvent.getY();
                if (mo406a() && coordinatorLayout.mo11689a(view, x, y)) {
                    this.f22552g = y;
                    this.f22551f = motionEvent.getPointerId(0);
                    m14974d();
                    break;
                }
            case 1:
            case 3:
                this.f22550c = false;
                this.f22551f = -1;
                velocityTracker = this.f22554i;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f22554i = null;
                    break;
                }
                break;
            case 2:
                y = this.f22551f;
                if (y != -1) {
                    y = motionEvent.findPointerIndex(y);
                    if (y != -1) {
                        y = (int) motionEvent.getY(y);
                        if (Math.abs(y - this.f22552g) > this.f22553h) {
                            this.f22550c = true;
                            this.f22552g = y;
                            break;
                        }
                    }
                }
                break;
        }
        velocityTracker = this.f22554i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return this.f22550c;
    }

    /* renamed from: b */
    public final boolean mo5982b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (this.f22553h < 0) {
            this.f22553h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        int y;
        switch (motionEvent.getActionMasked()) {
            case 0:
                y = (int) motionEvent.getY();
                if (coordinatorLayout.mo11689a(view, (int) motionEvent.getX(), y) && mo406a()) {
                    this.f22552g = y;
                    this.f22551f = motionEvent.getPointerId(0);
                    m14974d();
                    break;
                }
                return false;
                break;
            case 1:
                velocityTracker = this.f22554i;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                    this.f22554i.computeCurrentVelocity(1000);
                    float yVelocity = this.f22554i.getYVelocity(this.f22551f);
                    int i = -mo412b(view);
                    Runnable runnable = this.f22549b;
                    if (runnable != null) {
                        view.removeCallbacks(runnable);
                        this.f22549b = null;
                    }
                    if (this.f22548a == null) {
                        this.f22548a = new OverScroller(view.getContext());
                    }
                    this.f22548a.fling(0, mo12361c(), 0, Math.round(yVelocity), 0, 0, i, 0);
                    if (!this.f22548a.computeScrollOffset()) {
                        mo410a_(view);
                        break;
                    }
                    this.f22549b = new C0054bb(this, coordinatorLayout, view);
                    C0315jm.m4615a(view, this.f22549b);
                    break;
                }
                break;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.f22551f);
                if (findPointerIndex != -1) {
                    y = (int) motionEvent.getY(findPointerIndex);
                    findPointerIndex = this.f22552g - y;
                    if (!this.f22550c) {
                        int abs = Math.abs(findPointerIndex);
                        int i2 = this.f22553h;
                        if (abs > i2) {
                            this.f22550c = true;
                            findPointerIndex = findPointerIndex > 0 ? findPointerIndex - i2 : findPointerIndex + i2;
                        }
                    }
                    if (this.f22550c) {
                        this.f22552g = y;
                        mo399a(mo411b() - findPointerIndex, mo400a(view), 0);
                        break;
                    }
                }
                return false;
                break;
            case 3:
                break;
        }
        this.f22550c = false;
        this.f22551f = -1;
        velocityTracker = this.f22554i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f22554i = null;
        }
        velocityTracker = this.f22554i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return true;
    }

    /* renamed from: a */
    public int mo399a(int i, int i2, int i3) {
        int c = mo12361c();
        if (i2 != 0 && c >= i2 && c <= i3) {
            int a = C0186df.m1624a(i, i2, i3);
            if (c != a) {
                C0071cb c0071cb = this.f11193d;
                if (c0071cb != null) {
                    c0071cb.mo2248a(a);
                } else {
                    this.f11194e = a;
                }
                return c - a;
            }
        }
        return 0;
    }
}
