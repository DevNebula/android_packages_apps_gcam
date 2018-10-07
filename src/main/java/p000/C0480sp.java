package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;

/* compiled from: PG */
/* renamed from: sp */
public abstract class C0480sp implements OnAttachStateChangeListener, OnTouchListener {
    /* renamed from: a */
    public final View f9727a;
    /* renamed from: b */
    public boolean f9728b;
    /* renamed from: c */
    private final float f9729c;
    /* renamed from: d */
    private final int f9730d;
    /* renamed from: e */
    private final int f9731e;
    /* renamed from: f */
    private Runnable f9732f;
    /* renamed from: g */
    private Runnable f9733g;
    /* renamed from: h */
    private int f9734h;
    /* renamed from: i */
    private final int[] f9735i = new int[2];

    public C0480sp(View view) {
        this.f9727a = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f9729c = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f9730d = ViewConfiguration.getTapTimeout();
        this.f9731e = (this.f9730d + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    public abstract C0414pj mo11103a();

    /* renamed from: d */
    final void mo11106d() {
        Runnable runnable = this.f9733g;
        if (runnable != null) {
            this.f9727a.removeCallbacks(runnable);
        }
        runnable = this.f9732f;
        if (runnable != null) {
            this.f9727a.removeCallbacks(runnable);
        }
    }

    /* renamed from: b */
    public boolean mo11104b() {
        C0414pj a = mo11103a();
        if (!(a == null || a.mo10862e())) {
            a.mo10863f();
        }
        return true;
    }

    /* renamed from: c */
    protected boolean mo11105c() {
        C0414pj a = mo11103a();
        if (a != null && a.mo10862e()) {
            a.mo10860c();
        }
        return true;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f9728b;
        View view2;
        int actionMasked;
        if (z2) {
            view2 = this.f9727a;
            C0414pj a = mo11103a();
            if (a == null) {
                z = false;
            } else if (a.mo10862e()) {
                C0475sh c0475sh = (C0475sh) a.mo10861d();
                if (c0475sh == null) {
                    z = false;
                } else if (c0475sh.isShown()) {
                    MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                    int[] iArr = this.f9735i;
                    view2.getLocationOnScreen(iArr);
                    obtainNoHistory.offsetLocation((float) iArr[0], (float) iArr[1]);
                    int[] iArr2 = this.f9735i;
                    c0475sh.getLocationOnScreen(iArr2);
                    obtainNoHistory.offsetLocation((float) (-iArr2[0]), (float) (-iArr2[1]));
                    boolean a2 = c0475sh.mo11087a(obtainNoHistory, this.f9734h);
                    obtainNoHistory.recycle();
                    actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 1) {
                        z = false;
                    } else if (actionMasked != 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!a2) {
                        z = false;
                    } else if (z) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z) {
                z = true;
            } else if (mo11105c()) {
                z = false;
            } else {
                z = true;
            }
        } else {
            boolean z3;
            view2 = this.f9727a;
            if (view2.isEnabled()) {
                switch (motionEvent.getActionMasked()) {
                    case 0:
                        this.f9734h = motionEvent.getPointerId(0);
                        if (this.f9732f == null) {
                            this.f9732f = new C0481sq(this);
                        }
                        view2.postDelayed(this.f9732f, (long) this.f9730d);
                        if (this.f9733g == null) {
                            this.f9733g = new C0482sr(this);
                        }
                        view2.postDelayed(this.f9733g, (long) this.f9731e);
                        break;
                    case 1:
                    case 3:
                        mo11106d();
                        break;
                    case 2:
                        actionMasked = motionEvent.findPointerIndex(this.f9734h);
                        if (actionMasked < 0) {
                            z = false;
                            break;
                        }
                        float x = motionEvent.getX(actionMasked);
                        float y = motionEvent.getY(actionMasked);
                        float f = this.f9729c;
                        float f2 = -f;
                        if (x < f2) {
                            z = false;
                        } else if (y < f2) {
                            z = false;
                        } else if (x >= ((float) (view2.getRight() - view2.getLeft())) + f) {
                            z = false;
                        } else if (y < ((float) (view2.getBottom() - view2.getTop())) + f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            mo11106d();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                }
                z = false;
            } else {
                z = false;
            }
            if (!z) {
                z3 = false;
            } else if (mo11104b()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f9727a.onTouchEvent(obtain);
                obtain.recycle();
                z = z3;
            } else {
                z = z3;
            }
        }
        this.f9728b = z;
        if (z || z2) {
            return true;
        }
        return false;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f9728b = false;
        this.f9734h = -1;
        Runnable runnable = this.f9732f;
        if (runnable != null) {
            this.f9727a.removeCallbacks(runnable);
        }
    }
}
