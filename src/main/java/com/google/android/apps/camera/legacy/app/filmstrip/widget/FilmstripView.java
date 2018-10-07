package com.google.android.apps.camera.legacy.app.filmstrip.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.nfc.NfcAdapter;
import android.os.PowerManager;
import android.provider.Settings.Global;
import android.provider.Settings.SettingNotFoundException;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import p000.C0252go;
import p000.bli;
import p000.cfh;
import p000.cfk;
import p000.cfq;
import p000.cpx;
import p000.cre;
import p000.csp;
import p000.cst;
import p000.csx;
import p000.csy;
import p000.cth;
import p000.cub;
import p000.cuo;
import p000.cuq;
import p000.cuw;
import p000.cve;
import p000.cvf;
import p000.cvg;
import p000.err;
import p000.hfu;
import p000.hfz;
import p000.hjg;
import p000.jri;
import p000.kpw;
import p000.kvl;

@TargetApi(21)
/* compiled from: PG */
public class FilmstripView extends ViewGroup {
    /* renamed from: a */
    public static final String f2524a = bli.m887a("FilmstripView");
    /* renamed from: A */
    private boolean f2525A = true;
    /* renamed from: B */
    private cre f2526B;
    /* renamed from: b */
    public cfh f2527b;
    /* renamed from: c */
    public csp f2528c;
    /* renamed from: d */
    public cub f2529d;
    /* renamed from: e */
    public cpx f2530e;
    /* renamed from: f */
    public final cth f2531f = new cuq(this);
    /* renamed from: g */
    public hfz f2532g;
    /* renamed from: h */
    public int f2533h;
    /* renamed from: i */
    public final Rect f2534i = new Rect();
    /* renamed from: j */
    public float f2535j;
    /* renamed from: k */
    public cuw f2536k;
    /* renamed from: l */
    public int f2537l = -1;
    /* renamed from: m */
    public final cvf[] f2538m = new cvf[5];
    /* renamed from: n */
    public cst f2539n;
    /* renamed from: o */
    public hfu f2540o = null;
    /* renamed from: p */
    public int f2541p;
    /* renamed from: q */
    public TimeInterpolator f2542q;
    /* renamed from: r */
    public boolean f2543r;
    /* renamed from: s */
    public boolean f2544s;
    /* renamed from: t */
    public float f2545t = 1.0f;
    /* renamed from: u */
    public boolean f2546u = false;
    /* renamed from: v */
    public final SparseArray f2547v = new SparseArray();
    /* renamed from: w */
    public kpw f2548w = kpw.m18486d();
    /* renamed from: x */
    public TextView f2549x;
    /* renamed from: y */
    public cve f2550y;
    /* renamed from: z */
    private MotionEvent f2551z;

    public FilmstripView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo2629a() {
        for (int i = 4; i >= 0; i--) {
            cvf cvf = this.f2538m[i];
            if (cvf != null) {
                cvf.f2996a.bringChildToFront(cvf.f2997b);
            }
        }
        bringChildToFront(this.f2540o);
    }

    /* renamed from: a */
    public final void mo2632a(cre cre) {
        if (this.f2535j > 1.0f) {
            mo2647k();
        }
        if (this.f2528c.mo5749i()) {
            bli.m898e(f2524a, "Aborting  animateNodeInsert, activity closing.");
            return;
        }
        int signum;
        cvf cvf;
        cvf[] cvfArr = (cvf[]) this.f2538m.clone();
        List n = m1289n();
        if (this.f2538m[2] == null) {
            n.set(2, cre);
        }
        csy a = csx.m1538a(n, this.f2526B);
        for (int i = 0; i < 5; i++) {
            cre cre2 = (cre) a.f2879a.get(i);
            int intValue = ((Integer) a.f2880b.get(i)).intValue();
            if (cre2 == cre.f2792c) {
                cvfArr[i] = null;
            } else {
                if (intValue == -1 || cre2 == cre) {
                    cvfArr[i] = mo2637c(cre2);
                } else {
                    cvf[] cvfArr2 = this.f2538m;
                    cvfArr[i] = cvfArr2[intValue];
                    cvfArr2[intValue] = null;
                }
                if (intValue == -1 || cre2 == cre) {
                    cvfArr[i].mo5847a(0.0f);
                    cvfArr[i].mo5857c((float) (getHeight() / 8));
                } else {
                    signum = Integer.signum(intValue - i);
                    cvf = cvfArr[i];
                    cvf.mo5854b((float) (signum * (cvf.f2997b.getMeasuredWidth() + this.f2533h)));
                }
                mo2633a(cvfArr[i]);
            }
        }
        m1285a(cvfArr);
        for (signum = 0; signum < 5; signum++) {
            cvf = this.f2538m[signum];
            if (cvf != null) {
                cvf.mo5859e();
            }
            this.f2538m[signum] = cvfArr[signum];
        }
        int d = mo2639d(cre);
        if (d != -1) {
            mo2630a(d);
        }
        m1290o();
        if (!(this.f2536k.mo12917h() || this.f2543r)) {
            mo2648l();
        }
        mo2629a();
        invalidate();
        this.f2526B = null;
    }

    /* renamed from: b */
    public final void mo2635b(cre cre) {
        if (this.f2535j > 1.0f) {
            mo2647k();
        }
        int d = mo2639d(cre);
        if (d == -1) {
            m1290o();
            return;
        }
        int signum;
        Object obj = this.f2538m;
        cvf cvf = obj[d];
        cvf[] cvfArr = (cvf[]) obj.clone();
        csy a = csx.m1538a(m1289n(), null);
        for (int i = 0; i < 5; i++) {
            cre cre2 = (cre) a.f2879a.get(i);
            int intValue = ((Integer) a.f2880b.get(i)).intValue();
            if (cre2 == cre.f2792c) {
                cvfArr[i] = null;
            } else {
                if (intValue == -1) {
                    cvfArr[i] = mo2637c(cre2);
                } else {
                    cvfArr[i] = this.f2538m[intValue];
                }
                if (intValue != -1) {
                    signum = Integer.signum(intValue - i);
                    cvf cvf2 = cvfArr[i];
                    cvf2.mo5854b((float) (signum * (cvf2.f2997b.getMeasuredWidth() + this.f2533h)));
                    mo2633a(cvfArr[i]);
                }
            }
        }
        m1285a(cvfArr);
        for (signum = 0; signum < 5; signum++) {
            this.f2538m[signum] = cvfArr[signum];
        }
        m1290o();
        if (!(this.f2536k.mo12917h() || this.f2543r)) {
            mo2648l();
        }
        d = getHeight() / 8;
        if (cvf.mo5856c() < 0.0f) {
            d = -d;
        }
        cvf.mo5855b(((float) d) + cvf.mo5856c(), this.f2542q);
        cvf.mo5850a(0.0f, this.f2542q);
        postDelayed(new cuo(cvf), 400);
        mo2629a();
        invalidate();
        this.f2526B = cre;
    }

    /* renamed from: b */
    public final boolean mo2636b() {
        Object obj;
        boolean z;
        PowerManager powerManager = (PowerManager) getContext().getSystemService("power");
        try {
            if (Global.getFloat(getContext().getContentResolver(), "animator_duration_scale") > 0.0f) {
                obj = 1;
            } else {
                obj = null;
            }
        } catch (SettingNotFoundException e) {
            int obj2 = 1;
        }
        if (obj2 == null) {
            z = false;
        } else if (powerManager.isPowerSaveMode()) {
            z = false;
        } else {
            z = true;
        }
        String str = f2524a;
        StringBuilder stringBuilder = new StringBuilder(26);
        stringBuilder.append("areAnimationsEnabled ");
        stringBuilder.append(z);
        bli.m888a(str, stringBuilder.toString());
        return z;
    }

    /* renamed from: c */
    public final cvf mo2637c(cre cre) {
        if (this.f2528c.mo5749i()) {
            bli.m898e(f2524a, "Activity destroyed, don't load data");
            return null;
        } else if (cre == cre.f2792c) {
            bli.m898e(f2524a, "Cannot build ViewItem from invalid node. Returning null.");
            return null;
        } else {
            View view;
            boolean z;
            int round = Math.round((float) getWidth());
            int round2 = Math.round((float) getHeight());
            String str = f2524a;
            StringBuilder stringBuilder = new StringBuilder(47);
            stringBuilder.append("suggesting item bounds: ");
            stringBuilder.append(round);
            stringBuilder.append("x");
            stringBuilder.append(round2);
            bli.m896d(str, stringBuilder.toString());
            this.f2532g.mo7829b(round, round2);
            int a = this.f2532g.mo7814a(cre);
            Queue queue = (Queue) this.f2547v.get(this.f2532g.mo7833c(a));
            if (queue != null) {
                view = (View) queue.poll();
            } else {
                view = null;
            }
            if (view != null) {
                view.setVisibility(8);
            }
            if (view != null) {
                z = true;
            } else {
                z = false;
            }
            String str2 = f2524a;
            StringBuilder stringBuilder2 = new StringBuilder(31);
            stringBuilder2.append("getRecycledView, recycled=");
            stringBuilder2.append(z);
            bli.m896d(str2, stringBuilder2.toString());
            view = this.f2532g.mo7815a(view, cre, this.f2530e);
            if (view == null) {
                String str3 = f2524a;
                String valueOf = String.valueOf(cre);
                a = this.f2532g.mo7835d();
                stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 64);
                stringBuilder2.append("buildViewItemAt failed with node: ");
                stringBuilder2.append(valueOf);
                stringBuilder2.append(" and adapter size: ");
                stringBuilder2.append(a);
                bli.m898e(str3, stringBuilder2.toString());
                return null;
            }
            cvf cvf = new cvf(a, view, cre, this);
            if (cvf.f2996a.indexOfChild(cvf.f2997b) < 0) {
                cvf.f2996a.addView(cvf.f2997b);
            }
            cvf.mo5851a(4);
            cvf.mo5847a(1.0f);
            cvf.mo5854b(0.0f);
            cvf.mo5857c(0.0f);
            return cvf;
        }
    }

    /* renamed from: c */
    public final boolean mo2638c() {
        boolean z = false;
        cvf cvf = this.f2538m[2];
        if (cvf != null) {
            if (cvf.mo5858d() && this.f2537l < cvf.mo5846a()) {
                z = true;
            } else if (cvf.f3002g.mo5689b() == cre.f2792c && this.f2537l > cvf.mo5846a()) {
                z = true;
            }
            if (z) {
                this.f2537l = cvf.mo5846a();
            }
        }
        return z;
    }

    /* renamed from: c */
    private final void m1287c(int i) {
        if (i <= 0 || i > 5) {
            bli.m898e(f2524a, "fadeAndScaleRightViewItem() - bufferIndex out of bound!");
            return;
        }
        cvf[] cvfArr = this.f2538m;
        cvf cvf = cvfArr[i];
        cvf cvf2 = cvfArr[i - 1];
        if (cvf == null || cvf2 == null) {
            String str = f2524a;
            StringBuilder stringBuilder = new StringBuilder(89);
            stringBuilder.append("fadeAndScaleRightViewItem() - Invalid view item (curr or prev == null).curr = ");
            stringBuilder.append(i);
            bli.m898e(str, stringBuilder.toString());
        } else if (i > 3) {
            cvf.mo5851a(4);
        } else {
            int a = cvf2.mo5846a();
            if (this.f2537l <= a) {
                cvf.mo5851a(4);
                return;
            }
            int a2 = cvf.mo5846a();
            float f = (((float) this.f2537l) - ((float) a)) / ((float) (a2 - a));
            cvf.mo5852a(this.f2534i, a2, (0.3f * f) + 0.7f);
            cvf.mo5847a(f);
            cvf.mo5854b(0.0f);
            cvf.mo5851a(0);
        }
    }

    /* renamed from: d */
    public final int mo2639d(cre cre) {
        for (int i = 0; i < 5; i++) {
            cvf cvf = this.f2538m[i];
            if (cvf != null && cvf.f3002g == cre) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public final cre mo2640d() {
        cvf cvf = this.f2538m[2];
        if (cvf == null) {
            return cre.f2792c;
        }
        return cvf.f3002g;
    }

    /* renamed from: n */
    private final List m1289n() {
        List arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            cvf cvf = this.f2538m[i];
            if (cvf == null) {
                arrayList.add(cre.f2792c);
            } else {
                arrayList.add(cvf.f3002g);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public final boolean mo2641e() {
        return this.f2535j == 0.7f;
    }

    /* renamed from: f */
    public final boolean mo2642f() {
        return this.f2535j == 1.0f;
    }

    /* renamed from: g */
    public final boolean mo2643g() {
        return this.f2535j > 1.0f;
    }

    /* renamed from: h */
    public final boolean mo2644h() {
        return this.f2538m[2].mo5846a() == this.f2537l;
    }

    /* renamed from: a */
    private final void m1284a(boolean z) {
        int i = 1;
        if (this.f2538m[2] != null && this.f2534i.width() != 0 && this.f2534i.height() != 0) {
            if (z) {
                mo2648l();
            }
            if (!mo2643g()) {
                cvf cvf;
                int width = this.f2534i.width() + this.f2533h;
                m1285a(this.f2538m);
                cvf cvf2 = this.f2538m[2];
                int a = cvf2.mo5846a();
                int i2 = this.f2537l;
                if (i2 < a) {
                    m1287c(2);
                } else if (i2 > a) {
                    m1282a(2, width);
                } else {
                    cvf2.mo5852a(this.f2534i, i2, this.f2535j);
                    cvf2.mo5854b(0.0f);
                    cvf2.mo5847a(1.0f);
                    cvf2.mo5851a(0);
                }
                while (i >= 0) {
                    if (this.f2538m[i] == null) {
                        i = 3;
                        break;
                    } else {
                        m1282a(i, width);
                        i--;
                    }
                }
                i = 3;
                while (i < 5) {
                    cvf = this.f2538m[i];
                    if (cvf == null) {
                        break;
                    }
                    cvf.mo5852a(this.f2534i, this.f2537l, this.f2535j);
                    m1287c(i);
                    i++;
                }
                if (mo2641e() || mo2642f()) {
                    cvf cvf3;
                    i2 = this.f2537l;
                    int i3 = 0;
                    while (i3 < 5) {
                        cvf3 = this.f2538m[i3];
                        if (cvf3 != null && cvf3.f3001f != kvl.UNSET_ENUM_VALUE) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 != 5) {
                        i = Math.abs(i2 - this.f2538m[i3].mo5846a());
                        a = i3 + 1;
                        while (a < 5) {
                            cvf = this.f2538m[a];
                            if (cvf == null) {
                                break;
                            }
                            if (cvf.f3001f == kvl.UNSET_ENUM_VALUE) {
                                width = i3;
                            } else {
                                width = Math.abs(i2 - cvf.mo5846a());
                                if (width < i) {
                                    i = width;
                                    width = a;
                                } else {
                                    width = i3;
                                }
                            }
                            a++;
                            i3 = width;
                        }
                    } else {
                        i3 = -1;
                    }
                    if (i3 != -1 && i3 != 2) {
                        width = i3 - 2;
                        cvf[] cvfArr;
                        cvf[] cvfArr2;
                        if (width > 0) {
                            for (i = 0; i < width; i++) {
                                m1288d(i);
                            }
                            i = 0;
                            while (true) {
                                i3 = i + width;
                                if (i3 >= 5) {
                                    break;
                                }
                                cvfArr = this.f2538m;
                                cvfArr[i] = cvfArr[i3];
                                i++;
                            }
                            for (i = 5 - width; i < 5; i++) {
                                cvfArr2 = this.f2538m;
                                cvfArr2[i] = null;
                                cvf2 = cvfArr2[i - 1];
                                if (cvf2 != null) {
                                    cvfArr2[i] = mo2637c(cvf2.f3002g.mo5689b());
                                }
                            }
                            mo2629a();
                        } else {
                            for (i = 4; i >= width + 5; i--) {
                                m1288d(i);
                            }
                            i = 4;
                            while (true) {
                                i3 = i + width;
                                if (i3 < 0) {
                                    break;
                                }
                                cvfArr = this.f2538m;
                                cvfArr[i] = cvfArr[i3];
                                i--;
                            }
                            for (i = -1 - width; i >= 0; i--) {
                                cvfArr2 = this.f2538m;
                                cvfArr2[i] = null;
                                cvf2 = cvfArr2[i + 1];
                                if (cvf2 != null) {
                                    cvfArr2[i] = mo2637c(cvf2.f3002g.mo5690c());
                                }
                            }
                        }
                        invalidate();
                        cst cst = this.f2539n;
                        if (cst != null) {
                            cst.mo12902a(mo2640d());
                            i = this.f2538m[2].f3000e;
                            this.f2539n.f13242a.f23064L.onScroll(null, i - 2, 5, this.f2532g.mo7835d());
                        }
                        cve cve = this.f2550y;
                        if (cve != null) {
                            cve.mo5845a(this.f2538m[2].f3003h);
                        }
                        mo2649m();
                        cvf3 = this.f2538m[2];
                        if (cvf3 != null) {
                            width = this.f2537l;
                            i3 = cvf3.f3001f;
                            cvf3.f3001f = 0;
                            this.f2537l = width - i3;
                        }
                        this.f2526B = null;
                    }
                }
            }
        }
    }

    public void onDraw(Canvas canvas) {
        m1284a(false);
        super.onDraw(canvas);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f2536k.mo12917h()) {
            return true;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f2525A = true;
            this.f2551z = MotionEvent.obtain(motionEvent);
            return false;
        } else if (motionEvent.getActionMasked() == 5) {
            this.f2525A = false;
            return false;
        } else if (!this.f2525A) {
            return false;
        } else {
            if (motionEvent.getEventTime() - motionEvent.getDownTime() > 500) {
                return false;
            }
            int x = (int) (motionEvent.getX() - this.f2551z.getX());
            int y = (int) (motionEvent.getY() - this.f2551z.getY());
            if (motionEvent.getActionMasked() == 2 && x < (-this.f2541p)) {
                x = Math.abs(x);
                y = Math.abs(y);
                if (x >= y + y) {
                    return true;
                }
            }
            return false;
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Rect rect = this.f2534i;
        rect.left = 0;
        rect.top = 0;
        rect.right = i3 - i;
        rect.bottom = i4 - i2;
        hfu hfu = this.f2540o;
        if (hfu != null) {
            hfu.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
        if (!mo2643g() || z) {
            mo2647k();
            m1284a(z);
        }
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (size != 0 && size2 != 0) {
            for (cvf cvf : this.f2538m) {
                if (cvf != null) {
                    err e = cvf.f3002g.mo5692e();
                    if (e == null) {
                        bli.m898e(f2524a, "measureViewItem() - Trying to measure a null item!");
                    } else {
                        Point a = hjg.m3257a(e.mo6542h().f7695a, e.mo6542h().f7696b, e.mo6546l(), size, size2);
                        cvf.f2999d = a;
                        cvf.f2997b.measure(MeasureSpec.makeMeasureSpec(a.x, 1073741824), MeasureSpec.makeMeasureSpec(a.y, 1073741824));
                    }
                }
            }
            mo2638c();
            hfu hfu = this.f2540o;
            if (hfu != null) {
                hfu.measure(MeasureSpec.makeMeasureSpec(i, 1073741824), MeasureSpec.makeMeasureSpec(i2, 1073741824));
            }
        }
    }

    /* renamed from: i */
    public final void mo2645i() {
        cvf[] cvfArr;
        this.f2536k.mo12913b(true);
        this.f2536k.f13287a.cancel();
        int i = 0;
        while (true) {
            cvfArr = this.f2538m;
            if (i >= cvfArr.length) {
                break;
            }
            cvf cvf = cvfArr[i];
            if (cvf != null) {
                cvf.mo5859e();
            }
            i++;
        }
        Arrays.fill(cvfArr, null);
        if (this.f2532g.mo7835d() != 0) {
            this.f2538m[2] = mo2637c(this.f2532g.mo7826b(0));
            cvf cvf2 = this.f2538m[2];
            if (cvf2 != null) {
                cvf2.f3001f = 0;
                for (i = 3; i < 5; i++) {
                    cvf[] cvfArr2 = this.f2538m;
                    cvfArr2[i] = mo2637c(cvfArr2[i - 1].f3002g.mo5689b());
                    if (this.f2538m[i] == null) {
                        break;
                    }
                }
                this.f2537l = -1;
                this.f2535j = 1.0f;
                mo2629a();
                bli.m888a(f2524a, "reload() - Ensure all items are loaded at max size.");
                mo2646j();
                invalidate();
                cst cst = this.f2539n;
                if (cst != null) {
                    cst.mo12903b();
                    this.f2539n.mo12902a(mo2640d());
                }
            }
        }
    }

    /* renamed from: d */
    private final void m1288d(int i) {
        cvf[] cvfArr = this.f2538m;
        if (i < cvfArr.length) {
            cvf cvf = cvfArr[i];
            if (cvf != null) {
                if (cvf.f3002g.mo5692e() == null) {
                    bli.m898e(f2524a, "removeItem() - Trying to remove a null item!");
                    return;
                }
                this.f2538m[i].mo5859e();
                this.f2538m[i] = null;
            }
        }
    }

    /* renamed from: j */
    public final void mo2646j() {
        for (int i = 0; i < 5; i++) {
            mo2630a(i);
        }
    }

    /* renamed from: a */
    public final void mo2631a(Bitmap bitmap) {
        cvf cvf = this.f2538m[2];
        if (cvf == null) {
            bli.m896d(f2524a, "renderPlaceholderIntoFirstItem() --current filmstrip item is null()");
        } else if (cvf.mo5858d()) {
            View view = cvf.f2997b;
            cvf.f3004i = C0252go.f5799Y;
            String str = f2524a;
            int i = cvf.f3000e;
            StringBuilder stringBuilder = new StringBuilder(60);
            stringBuilder.append("[ViewItem:");
            stringBuilder.append(i);
            stringBuilder.append("] data.renderThumbnailWithPlaceholder()");
            bli.m888a(str, stringBuilder.toString());
            cvf.f3003h.mo6530a(view, bitmap);
        } else {
            bli.m896d(f2524a, "renderPlaceholderIntoFirstItem() -- current filmstrip isn't first node");
        }
    }

    /* renamed from: a */
    public final void mo2630a(int i) {
        cvf cvf = this.f2538m[i];
        if (cvf != null && cvf.f3004i != C0252go.f5799Y) {
            cvf.f3004i = C0252go.f5799Y;
            String str = f2524a;
            int i2 = cvf.f3000e;
            StringBuilder stringBuilder = new StringBuilder(45);
            stringBuilder.append("[ViewItem:");
            stringBuilder.append(i2);
            stringBuilder.append("] data.renderThumbnail()");
            bli.m888a(str, stringBuilder.toString());
            cvf.f3003h.mo6537c(cvf.f2997b);
        }
    }

    /* renamed from: k */
    public final void mo2647k() {
        if (mo2643g()) {
            cvf cvf = this.f2538m[2];
            if (cvf != null) {
                this.f2535j = 1.0f;
                cuw cuw = this.f2536k;
                if (cuw.mo12918i()) {
                    cuw.f13288b.cancel();
                }
                cuw = this.f2536k;
                if (cuw.mo12916g()) {
                    cuw.f13289c.cancel();
                }
                cvf.mo5860f();
                this.f2536k.f13292f.f2540o.mo7803a();
                this.f2540o.setVisibility(8);
                cuw = this.f2536k;
                for (int i = 0; i < 2; i++) {
                    cvf cvf2 = cuw.f13292f.f2538m[i];
                    if (cvf2 != null) {
                        cvf2.mo5851a(0);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final void m1285a(cvf[] cvfArr) {
        int i = 3;
        cvf cvf = cvfArr[2];
        if (cvf != null) {
            cvf cvf2;
            cvf.f3001f = 0;
            for (int i2 = 1; i2 >= 0; i2--) {
                cvf2 = cvfArr[i2];
                if (cvf2 == null) {
                    break;
                }
                cvf2.f3001f = (cvfArr[i2 + 1].f3001f - cvf2.f2997b.getMeasuredWidth()) - this.f2533h;
            }
            while (i < 5) {
                cvf = cvfArr[i];
                if (cvf != null) {
                    cvf2 = cvfArr[i - 1];
                    cvf.f3001f = (cvf2.f2997b.getMeasuredWidth() + cvf2.f3001f) + this.f2533h;
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo2633a(cvf cvf) {
        TimeInterpolator timeInterpolator = this.f2542q;
        if (cvf.f3005j == null) {
            cvf.f3005j = new ValueAnimator();
            cvf.f3005j.addUpdateListener(new cvg(cvf));
        }
        cvf.m1574a(cvf.f3005j, cvf.mo5853b(), 0.0f, timeInterpolator);
        cvf.mo5855b(0.0f, this.f2542q);
        cvf.mo5850a(1.0f, this.f2542q);
    }

    /* renamed from: o */
    private final void m1290o() {
        for (cvf cvf : this.f2538m) {
            if (cvf != null) {
                cvf.f3000e = this.f2532g.mo7814a(cvf.f3002g);
            }
        }
    }

    /* renamed from: a */
    private final void m1282a(int i, int i2) {
        if (i < 0 || i > 4) {
            bli.m898e(f2524a, "translateLeftViewItem() - Index out of bound!");
            return;
        }
        cvf[] cvfArr = this.f2538m;
        cvf cvf = cvfArr[i];
        cvf cvf2 = cvfArr[i + 1];
        if (cvf == null || cvf2 == null) {
            String str = f2524a;
            StringBuilder stringBuilder = new StringBuilder(86);
            stringBuilder.append("translateLeftViewItem() - Invalid view item (curr or next == null). curr = ");
            stringBuilder.append(i);
            bli.m898e(str, stringBuilder.toString());
            return;
        }
        int a = cvf.mo5846a();
        int a2 = cvf2.mo5846a();
        int i3 = (int) ((float) ((a2 - i2) - a));
        cvf.mo5852a(this.f2534i, this.f2537l, this.f2535j);
        cvf.mo5847a(1.0f);
        cvf.mo5851a(0);
        if (mo2642f()) {
            cvf.mo5854b((float) ((i3 * (this.f2537l - a)) / (a2 - a)));
        } else {
            cvf.mo5854b((float) i3);
        }
    }

    /* renamed from: l */
    public final void mo2648l() {
        cvf cvf = this.f2538m[2];
        if (cvf != null) {
            this.f2537l = cvf.mo5846a();
        }
    }

    /* renamed from: b */
    public final void mo2634b(int i) {
        cvf cvf = this.f2538m[i];
        if (cvf == null) {
            bli.m898e(f2524a, "updateViewItem() - Trying to update an null item!");
            return;
        }
        String str;
        Object obj = cvf.f3002g;
        err e = obj.mo5692e();
        err err = cvf.f3003h;
        if (e.equals(err)) {
            bli.m896d(f2524a, "updateViewItem() - updating data with the same item");
        } else {
            StringBuilder stringBuilder;
            err.mo6529a(cvf.f2997b);
            cvf.f3002g = (cre) jri.m13404b(obj);
            cvf.f3003h = obj.mo5692e();
            cvf.f2999d = hjg.m3257a(cvf.f3003h.mo6542h().f7695a, cvf.f3003h.mo6542h().f7696b, cvf.f3003h.mo6546l(), cvf.f2996a.getMeasuredWidth(), cvf.f2996a.getMeasuredHeight());
            if (cvf.f3004i != C0252go.f5798X) {
                cvf.f3004i = C0252go.f5798X;
                str = f2524a;
                int i2 = cvf.f3000e;
                stringBuilder = new StringBuilder(40);
                stringBuilder.append("[ViewItem:");
                stringBuilder.append(i2);
                stringBuilder.append("] data.renderTiny()");
                bli.m888a(str, stringBuilder.toString());
                cvf.f3003h.mo6538d(cvf.f2997b);
            }
            str = f2524a;
            String valueOf = String.valueOf(e);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 59);
            stringBuilder.append("updateViewItem() - recycling old data item and setting new:");
            stringBuilder.append(valueOf);
            bli.m896d(str, stringBuilder.toString());
        }
        this.f2532g.mo7815a(cvf.f2997b, obj, this.f2530e);
        if (mo2638c()) {
            this.f2536k.mo12913b(true);
        }
        str = f2524a;
        StringBuilder stringBuilder2 = new StringBuilder(40);
        stringBuilder2.append("updateViewItem(bufferIndex: ");
        stringBuilder2.append(i);
        stringBuilder2.append(")");
        bli.m888a(str, stringBuilder2.toString());
        str = f2524a;
        boolean z = this.f2543r;
        StringBuilder stringBuilder3 = new StringBuilder(42);
        stringBuilder3.append("updateViewItem() - mIsUserScrolling: ");
        stringBuilder3.append(z);
        bli.m888a(str, stringBuilder3.toString());
        str = f2524a;
        z = this.f2536k.mo12917h();
        stringBuilder3 = new StringBuilder(52);
        stringBuilder3.append("updateViewItem() - mController.isScrolling() - ");
        stringBuilder3.append(z);
        bli.m888a(str, stringBuilder3.toString());
        if (!(this.f2536k.mo12917h() && this.f2543r)) {
            mo2630a(i);
        }
        if (!(i != 2 || this.f2543r || this.f2536k.mo12917h())) {
            mo2648l();
        }
        mo2629a();
        invalidate();
        cst cst = this.f2539n;
        if (cst != null) {
            cre d = mo2640d();
            cfk cfk = cst.f13242a;
            if (!cfk.f23076X) {
                return;
            }
            if (d == cre.f2792c) {
                bli.m898e(cfk.f23052a, "Current data ID not found.");
                cfk.f23066N.mo5700a(null);
                cfk.f23191z.mo5710c(false);
                cfk.f23191z.mo5711d(false);
                cfk.f23191z.mo5707a(false);
                cfk.f23191z.mo5709b(false);
                cfk.f23191z.mo5708b();
                cfk.mo14581I();
                return;
            }
            e = d.mo5692e();
            cfk.m15205b(e);
            cfk.mo14583P();
            cfk.f23066N.mo5700a(e);
            if (cfk.f23189x) {
                cfk.f23191z.mo5710c(false);
                cfk.f23191z.mo5711d(false);
            } else {
                if (!cfk.f23181p.getAndSet(true)) {
                    cfk.f23180o.mo8856a("NFC#init");
                    NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(cfk.f23171f);
                    if (defaultAdapter != null) {
                        defaultAdapter.setBeamPushUris(null, (Activity) cfk.f23183r.get());
                        defaultAdapter.setBeamPushUrisCallback(new cfq(cfk), (Activity) cfk.f23183r.get());
                        cfk.f23180o.mo8857b();
                    }
                }
                Uri uri = e.mo6541g().f4384h;
                if (uri.equals(Uri.EMPTY)) {
                    cfk.f23182q[0] = null;
                } else {
                    cfk.f23182q[0] = uri;
                }
            }
            int a = cfk.f23059G.mo7814a(d);
            if (!cfk.f23059G.mo7839e(a)) {
                cfk.f23059G.mo7840f(a);
            }
        }
    }

    /* renamed from: m */
    public final void mo2649m() {
        cvf cvf = this.f2538m[2];
        if (cvf != null) {
            cre cre = cvf.f3002g;
            cst cst = this.f2539n;
            float f = this.f2535j;
            if (cre != cre.f2792c) {
                err e = cre.mo5692e();
                long currentTimeMillis = System.currentTimeMillis() - e.mo6541g().f4382f.getTime();
                if (!TextUtils.isEmpty(e.mo6541g().f4383g) && currentTimeMillis <= 30000) {
                    cst.f13242a.f23069Q.mo8896a(new File(e.mo6541g().f4383g).getName(), e.mo6541g().f4382f.getTime(), f);
                }
            }
        }
    }
}
