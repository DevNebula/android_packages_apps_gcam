package p000;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.p002v7.widget.RecyclerView;
import android.view.MotionEvent;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: sk */
public final class C0754sk extends C0516uf implements C0520ul {
    /* renamed from: p */
    private static final int[] f22261p = new int[]{16842919};
    /* renamed from: q */
    private static final int[] f22262q = new int[0];
    /* renamed from: A */
    private int f22263A = 0;
    /* renamed from: B */
    private final int[] f22264B = new int[2];
    /* renamed from: C */
    private final int[] f22265C = new int[2];
    /* renamed from: D */
    private final Runnable f22266D = new C0477sl(this);
    /* renamed from: E */
    private final C0521um f22267E = new C0755sm(this);
    /* renamed from: a */
    public final int f22268a;
    /* renamed from: b */
    public final StateListDrawable f22269b;
    /* renamed from: c */
    public final Drawable f22270c;
    /* renamed from: d */
    public int f22271d;
    /* renamed from: e */
    public int f22272e;
    /* renamed from: f */
    public int f22273f;
    /* renamed from: g */
    public int f22274g;
    /* renamed from: h */
    public int f22275h = 0;
    /* renamed from: i */
    public int f22276i = 0;
    /* renamed from: j */
    public RecyclerView f22277j;
    /* renamed from: k */
    public boolean f22278k = false;
    /* renamed from: l */
    public boolean f22279l = false;
    /* renamed from: m */
    public int f22280m = 0;
    /* renamed from: n */
    public final ValueAnimator f22281n = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
    /* renamed from: o */
    public int f22282o = 0;
    /* renamed from: r */
    private final int f22283r;
    /* renamed from: s */
    private final int f22284s;
    /* renamed from: t */
    private final int f22285t;
    /* renamed from: u */
    private final StateListDrawable f22286u;
    /* renamed from: v */
    private final Drawable f22287v;
    /* renamed from: w */
    private final int f22288w;
    /* renamed from: x */
    private final int f22289x;
    /* renamed from: y */
    private float f22290y;
    /* renamed from: z */
    private float f22291z;

    public C0754sk(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.f22269b = stateListDrawable;
        this.f22270c = drawable;
        this.f22286u = stateListDrawable2;
        this.f22287v = drawable2;
        this.f22284s = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f22285t = Math.max(i, drawable.getIntrinsicWidth());
        this.f22288w = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f22289x = Math.max(i, drawable2.getIntrinsicWidth());
        this.f22268a = i2;
        this.f22283r = i3;
        this.f22269b.setAlpha(Illuminant.kOther);
        this.f22270c.setAlpha(Illuminant.kOther);
        this.f22281n.addListener(new C0478sn(this));
        this.f22281n.addUpdateListener(new C0479so(this));
        RecyclerView recyclerView2 = this.f22277j;
        if (recyclerView2 != recyclerView) {
            C0521um c0521um;
            if (recyclerView2 != null) {
                recyclerView2.mo1118a((C0516uf) this);
                recyclerView2 = this.f22277j;
                recyclerView2.f714n.remove(this);
                if (recyclerView2.f715o == this) {
                    recyclerView2.f715o = null;
                }
                recyclerView2 = this.f22277j;
                c0521um = this.f22267E;
                List list = recyclerView2.f663B;
                if (list != null) {
                    list.remove(c0521um);
                }
                m14594b();
            }
            this.f22277j = recyclerView;
            recyclerView2 = this.f22277j;
            if (recyclerView2 != null) {
                C0517ug c0517ug = recyclerView2.f711k;
                if (c0517ug != null) {
                    c0517ug.mo11232a("Cannot add item decoration during a scroll  or layout");
                }
                if (recyclerView2.f713m.isEmpty()) {
                    recyclerView2.setWillNotDraw(false);
                }
                recyclerView2.f713m.add(this);
                recyclerView2.mo1166l();
                recyclerView2.requestLayout();
                this.f22277j.f714n.add(this);
                recyclerView2 = this.f22277j;
                c0521um = this.f22267E;
                if (recyclerView2.f663B == null) {
                    recyclerView2.f663B = new ArrayList();
                }
                recyclerView2.f663B.add(c0521um);
            }
        }
    }

    /* renamed from: b */
    private final void m14594b() {
        this.f22277j.removeCallbacks(this.f22266D);
    }

    /* renamed from: c */
    private final boolean m14597c() {
        return C0315jm.m4635j(this.f22277j) == 1;
    }

    /* renamed from: a */
    private final boolean m14593a(float f, float f2) {
        if (f2 >= ((float) (this.f22276i - this.f22288w))) {
            int i = this.f22274g;
            int i2 = this.f22273f / 2;
            if (f >= ((float) (i - i2)) && f <= ((float) (i + i2))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final boolean m14596b(float f, float f2) {
        if (m14597c() ? f > ((float) (this.f22284s / 2)) : f < ((float) (this.f22275h - this.f22284s))) {
            int i = this.f22272e;
            int i2 = this.f22271d / 2;
            if (f2 >= ((float) (i - i2)) && f2 <= ((float) (i + i2))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo11213a(Canvas canvas) {
        if (this.f22275h != this.f22277j.getWidth() || this.f22276i != this.f22277j.getHeight()) {
            this.f22275h = this.f22277j.getWidth();
            this.f22276i = this.f22277j.getHeight();
            mo14417a(0);
        } else if (this.f22282o != 0) {
            int i;
            int i2;
            int i3;
            int i4;
            if (this.f22278k) {
                i = this.f22275h;
                i2 = this.f22284s;
                i -= i2;
                i3 = this.f22272e;
                i4 = this.f22271d;
                i3 -= i4 / 2;
                this.f22269b.setBounds(0, 0, i2, i4);
                this.f22270c.setBounds(0, 0, this.f22285t, this.f22276i);
                if (m14597c()) {
                    this.f22270c.draw(canvas);
                    canvas.translate((float) this.f22284s, (float) i3);
                    canvas.scale(-1.0f, 1.0f);
                    this.f22269b.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate((float) (-this.f22284s), (float) (-i3));
                } else {
                    canvas.translate((float) i, 0.0f);
                    this.f22270c.draw(canvas);
                    canvas.translate(0.0f, (float) i3);
                    this.f22269b.draw(canvas);
                    canvas.translate((float) (-i), (float) (-i3));
                }
            }
            if (this.f22279l) {
                i = this.f22276i;
                i2 = this.f22288w;
                i -= i2;
                i3 = this.f22274g;
                i4 = this.f22273f;
                i3 -= i4 / 2;
                this.f22286u.setBounds(0, 0, i4, i2);
                this.f22287v.setBounds(0, 0, this.f22275h, this.f22289x);
                canvas.translate(0.0f, (float) i);
                this.f22287v.draw(canvas);
                canvas.translate((float) i3, 0.0f);
                this.f22286u.draw(canvas);
                canvas.translate((float) (-i3), (float) (-i));
            }
        }
    }

    /* renamed from: a */
    public final boolean mo11284a(MotionEvent motionEvent) {
        boolean z = false;
        int i = this.f22280m;
        if (i == 1) {
            boolean b = m14596b(motionEvent.getX(), motionEvent.getY());
            boolean a = m14593a(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (b || a)) {
                if (a) {
                    this.f22263A = 1;
                    this.f22291z = (float) ((int) motionEvent.getX());
                } else if (b) {
                    this.f22263A = 2;
                    this.f22290y = (float) ((int) motionEvent.getY());
                }
                mo14417a(2);
                z = true;
            }
        } else if (i == 2) {
            return true;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo11283a() {
    }

    /* renamed from: b */
    public final void mo11285b(MotionEvent motionEvent) {
        if (this.f22280m != 0) {
            if (motionEvent.getAction() == 0) {
                boolean b = m14596b(motionEvent.getX(), motionEvent.getY());
                boolean a = m14593a(motionEvent.getX(), motionEvent.getY());
                if (b || a) {
                    if (a) {
                        this.f22263A = 1;
                        this.f22291z = (float) ((int) motionEvent.getX());
                    } else if (b) {
                        this.f22263A = 2;
                        this.f22290y = (float) ((int) motionEvent.getY());
                    }
                    mo14417a(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f22280m == 2) {
                this.f22290y = 0.0f;
                this.f22291z = 0.0f;
                mo14417a(1);
                this.f22263A = 0;
            } else if (motionEvent.getAction() == 2 && this.f22280m == 2) {
                float x;
                int[] iArr;
                int i;
                float max;
                int a2;
                m14598d();
                if (this.f22263A == 1) {
                    x = motionEvent.getX();
                    iArr = this.f22265C;
                    i = this.f22283r;
                    iArr[0] = i;
                    iArr[1] = this.f22275h - i;
                    max = Math.max((float) iArr[0], Math.min((float) iArr[1], x));
                    if (Math.abs(((float) this.f22274g) - max) >= 2.0f) {
                        a2 = C0754sk.m14592a(this.f22291z, max, iArr, this.f22277j.computeHorizontalScrollRange(), this.f22277j.computeHorizontalScrollOffset(), this.f22275h);
                        if (a2 != 0) {
                            this.f22277j.scrollBy(a2, 0);
                        }
                        this.f22291z = max;
                    }
                }
                if (this.f22263A == 2) {
                    x = motionEvent.getY();
                    iArr = this.f22264B;
                    i = this.f22283r;
                    iArr[0] = i;
                    iArr[1] = this.f22276i - i;
                    max = Math.max((float) iArr[0], Math.min((float) iArr[1], x));
                    if (Math.abs(((float) this.f22272e) - max) >= 2.0f) {
                        a2 = C0754sk.m14592a(this.f22290y, max, iArr, this.f22277j.computeVerticalScrollRange(), this.f22277j.computeVerticalScrollOffset(), this.f22276i);
                        if (a2 != 0) {
                            this.f22277j.scrollBy(0, a2);
                        }
                        this.f22290y = max;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private final void m14595b(int i) {
        m14594b();
        this.f22277j.postDelayed(this.f22266D, (long) i);
    }

    /* renamed from: a */
    private static int m14592a(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        i4 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i6 = i2 + i4;
        if (i6 >= i5 || i6 < 0) {
            return 0;
        }
        return i4;
    }

    /* renamed from: a */
    final void mo14417a(int i) {
        if (i == 2 && this.f22280m != 2) {
            this.f22269b.setState(f22261p);
            m14594b();
        }
        if (i != 0) {
            m14598d();
        } else {
            this.f22277j.invalidate();
        }
        if (this.f22280m == 2 && i != 2) {
            this.f22269b.setState(f22262q);
            m14595b(1200);
        } else if (i == 1) {
            m14595b(1500);
        }
        this.f22280m = i;
    }

    /* renamed from: d */
    private final void m14598d() {
        switch (this.f22282o) {
            case 0:
                break;
            case 3:
                this.f22281n.cancel();
                break;
            default:
                return;
        }
        this.f22282o = 1;
        this.f22281n.setFloatValues(new float[]{((Float) this.f22281n.getAnimatedValue()).floatValue(), 1.0f});
        this.f22281n.setDuration(500);
        this.f22281n.setStartDelay(0);
        this.f22281n.start();
    }
}
