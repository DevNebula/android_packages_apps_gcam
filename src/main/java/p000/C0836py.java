package p000;

import android.content.Context;
import android.content.res.Resources;
import android.support.p002v7.view.menu.ActionMenuItemView;
import android.support.p002v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: py */
public final class C0836py extends C0730od {
    /* renamed from: f */
    public C0745qb f25435f;
    /* renamed from: g */
    public boolean f25436g;
    /* renamed from: h */
    public boolean f25437h;
    /* renamed from: i */
    public int f25438i;
    /* renamed from: j */
    public boolean f25439j;
    /* renamed from: k */
    public C0747qd f25440k;
    /* renamed from: l */
    public C0743pz f25441l;
    /* renamed from: m */
    public C0425qa f25442m;
    /* renamed from: n */
    public final C0748qe f25443n = new C0748qe(this);
    /* renamed from: o */
    private int f25444o;
    /* renamed from: p */
    private int f25445p;
    /* renamed from: q */
    private final SparseBooleanArray f25446q = new SparseBooleanArray();
    /* renamed from: r */
    private View f25447r;
    /* renamed from: s */
    private C0398oc f25448s;

    public C0836py(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo14285a(C0736ot c0736ot, C0413ph c0413ph) {
        c0413ph.mo10858a(c0736ot);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) c0413ph;
        actionMenuItemView.f10513b = (ActionMenuView) this.f22160e;
        if (this.f25448s == null) {
            this.f25448s = new C0398oc(this);
        }
        actionMenuItemView.f10514c = this.f25448s;
    }

    /* renamed from: b */
    public final boolean mo15280b() {
        return mo15281c() | mo15282d();
    }

    /* renamed from: a */
    public final boolean mo14286a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f25435f) {
            return false;
        }
        return super.mo14286a(viewGroup, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e6  */
    /* renamed from: a */
    public final boolean mo10850a() {
        /*
        r15 = this;
        r0 = r15.f22158c;
        if (r0 == 0) goto L_0x0130;
    L_0x0004:
        r0 = r15.f22158c;
        r1 = r0.mo14321e();
        r0 = r1.size();
        r3 = r0;
        r4 = r1;
    L_0x0010:
        r7 = r15.f25438i;
        r8 = r15.f25445p;
        r0 = 0;
        r1 = 0;
        r11 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1);
        r0 = r15.f22160e;
        r0 = (android.view.ViewGroup) r0;
        r6 = 0;
        r5 = 0;
        r2 = 0;
        r1 = 0;
        r9 = r1;
    L_0x0023:
        if (r9 >= r3) goto L_0x0052;
    L_0x0025:
        r1 = r4.get(r9);
        r1 = (p000.C0736ot) r1;
        r10 = r1.mo14357g();
        if (r10 == 0) goto L_0x0047;
    L_0x0031:
        r6 = r6 + 1;
    L_0x0033:
        r10 = r15.f25439j;
        if (r10 == 0) goto L_0x0045;
    L_0x0037:
        r1 = r1.isActionViewExpanded();
        if (r1 == 0) goto L_0x0043;
    L_0x003d:
        r1 = 0;
    L_0x003e:
        r7 = r9 + 1;
        r9 = r7;
        r7 = r1;
        goto L_0x0023;
    L_0x0043:
        r1 = r7;
        goto L_0x003e;
    L_0x0045:
        r1 = r7;
        goto L_0x003e;
    L_0x0047:
        r10 = r1.f22210e;
        r10 = r10 & 1;
        if (r10 == 0) goto L_0x0050;
    L_0x004d:
        r5 = r5 + 1;
        goto L_0x0033;
    L_0x0050:
        r2 = 1;
        goto L_0x0033;
    L_0x0052:
        r1 = r15.f25436g;
        if (r1 == 0) goto L_0x005e;
    L_0x0056:
        if (r2 != 0) goto L_0x005c;
    L_0x0058:
        r1 = r6 + r5;
        if (r1 <= r7) goto L_0x005e;
    L_0x005c:
        r7 = r7 + -1;
    L_0x005e:
        r2 = r7 - r6;
        r12 = r15.f25446q;
        r12.clear();
        r5 = 0;
        r1 = 0;
        r10 = r1;
        r6 = r8;
        r8 = r2;
    L_0x006a:
        if (r10 >= r3) goto L_0x012e;
    L_0x006c:
        r1 = r4.get(r10);
        r1 = (p000.C0736ot) r1;
        r2 = r1.mo14357g();
        if (r2 == 0) goto L_0x00a7;
    L_0x0078:
        r2 = r15.f25447r;
        r2 = r15.mo14283a(r1, r2, r0);
        r7 = r15.f25447r;
        if (r7 != 0) goto L_0x0084;
    L_0x0082:
        r15.f25447r = r2;
    L_0x0084:
        r2.measure(r11, r11);
        r2 = r2.getMeasuredWidth();
        r6 = r6 - r2;
        if (r5 != 0) goto L_0x00a5;
    L_0x008e:
        r5 = r1.getGroupId();
        if (r5 == 0) goto L_0x0098;
    L_0x0094:
        r7 = 1;
        r12.put(r5, r7);
    L_0x0098:
        r5 = 1;
        r1.mo14351c(r5);
        r1 = r6;
        r5 = r8;
    L_0x009e:
        r6 = r10 + 1;
        r10 = r6;
        r8 = r5;
        r6 = r1;
        r5 = r2;
        goto L_0x006a;
    L_0x00a5:
        r2 = r5;
        goto L_0x008e;
    L_0x00a7:
        r2 = r1.f22210e;
        r2 = r2 & 1;
        if (r2 == 0) goto L_0x0125;
    L_0x00ad:
        r13 = r1.getGroupId();
        r14 = r12.get(r13);
        if (r8 <= 0) goto L_0x0121;
    L_0x00b7:
        if (r6 <= 0) goto L_0x011f;
    L_0x00b9:
        r9 = 1;
    L_0x00ba:
        if (r9 == 0) goto L_0x011c;
    L_0x00bc:
        r2 = r15.f25447r;
        r2 = r15.mo14283a(r1, r2, r0);
        r7 = r15.f25447r;
        if (r7 != 0) goto L_0x00c8;
    L_0x00c6:
        r15.f25447r = r2;
    L_0x00c8:
        r2.measure(r11, r11);
        r2 = r2.getMeasuredWidth();
        r7 = r6 - r2;
        if (r5 != 0) goto L_0x011a;
    L_0x00d3:
        r6 = r2;
    L_0x00d4:
        r2 = r7 + r6;
        if (r2 <= 0) goto L_0x0118;
    L_0x00d8:
        r2 = 1;
    L_0x00d9:
        r2 = r2 & r9;
        r9 = r2;
    L_0x00db:
        if (r9 == 0) goto L_0x00ef;
    L_0x00dd:
        if (r13 == 0) goto L_0x00ef;
    L_0x00df:
        r2 = 1;
        r12.put(r13, r2);
    L_0x00e3:
        r2 = r8;
    L_0x00e4:
        if (r9 == 0) goto L_0x00e8;
    L_0x00e6:
        r2 = r2 + -1;
    L_0x00e8:
        r1.mo14351c(r9);
        r1 = r7;
        r5 = r2;
        r2 = r6;
        goto L_0x009e;
    L_0x00ef:
        if (r14 == 0) goto L_0x00e3;
    L_0x00f1:
        r2 = 0;
        r12.put(r13, r2);
        r2 = 0;
        r5 = r8;
        r8 = r2;
    L_0x00f8:
        if (r8 >= r10) goto L_0x0116;
    L_0x00fa:
        r2 = r4.get(r8);
        r2 = (p000.C0736ot) r2;
        r14 = r2.getGroupId();
        if (r14 != r13) goto L_0x0112;
    L_0x0106:
        r14 = r2.mo14355e();
        if (r14 == 0) goto L_0x010e;
    L_0x010c:
        r5 = r5 + 1;
    L_0x010e:
        r14 = 0;
        r2.mo14351c(r14);
    L_0x0112:
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x00f8;
    L_0x0116:
        r2 = r5;
        goto L_0x00e4;
    L_0x0118:
        r2 = 0;
        goto L_0x00d9;
    L_0x011a:
        r6 = r5;
        goto L_0x00d4;
    L_0x011c:
        r7 = r6;
        r6 = r5;
        goto L_0x00db;
    L_0x011f:
        r9 = 0;
        goto L_0x00ba;
    L_0x0121:
        if (r14 != 0) goto L_0x00b7;
    L_0x0123:
        r9 = 0;
        goto L_0x00ba;
    L_0x0125:
        r2 = 0;
        r1.mo14351c(r2);
        r2 = r5;
        r1 = r6;
        r5 = r8;
        goto L_0x009e;
    L_0x012e:
        r0 = 1;
        return r0;
    L_0x0130:
        r1 = 0;
        r0 = 0;
        r3 = r0;
        r4 = r1;
        goto L_0x0010;
        */
        throw new UnsupportedOperationException("Method not decompiled: py.a():boolean");
    }

    /* renamed from: a */
    public final View mo14283a(C0736ot c0736ot, View view, ViewGroup viewGroup) {
        int i;
        View actionView = c0736ot.getActionView();
        if (actionView == null || c0736ot.mo14352c()) {
            actionView = super.mo14283a(c0736ot, view, viewGroup);
        }
        if (c0736ot.isActionViewExpanded()) {
            i = 8;
        } else {
            i = 0;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.m6875a(layoutParams));
        }
        return actionView;
    }

    /* renamed from: a */
    public final C0412pg mo14284a(ViewGroup viewGroup) {
        C0412pg c0412pg = this.f22160e;
        C0412pg a = super.mo14284a(viewGroup);
        if (c0412pg != a) {
            ((ActionMenuView) a).mo12133a(this);
        }
        return a;
    }

    /* renamed from: c */
    public final boolean mo15281c() {
        Runnable runnable = this.f25442m;
        if (runnable == null || this.f22160e == null) {
            C0408pc c0408pc = this.f25440k;
            if (c0408pc == null) {
                return false;
            }
            c0408pc.mo10837a();
            return true;
        }
        ((View) this.f22160e).removeCallbacks(runnable);
        this.f25442m = null;
        return true;
    }

    /* renamed from: d */
    public final boolean mo15282d() {
        C0743pz c0743pz = this.f25441l;
        if (c0743pz == null) {
            return false;
        }
        c0743pz.mo10837a();
        return true;
    }

    /* renamed from: a */
    public final void mo10846a(Context context, C0734op c0734op) {
        super.mo10846a(context, c0734op);
        Resources resources = context.getResources();
        C0386nm a = C0386nm.m5683a(context);
        if (!this.f25437h) {
            this.f25436g = true;
        }
        this.f25444o = a.f9442a.getResources().getDisplayMetrics().widthPixels / 2;
        this.f25438i = a.mo10735a();
        int i = this.f25444o;
        if (this.f25436g) {
            if (this.f25435f == null) {
                this.f25435f = new C0745qb(this, this.f22156a);
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
                this.f25435f.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f25435f.getMeasuredWidth();
        } else {
            this.f25435f = null;
        }
        this.f25445p = i;
        float f = resources.getDisplayMetrics().density;
        this.f25447r = null;
    }

    /* renamed from: e */
    public final boolean mo15283e() {
        C0747qd c0747qd = this.f25440k;
        return c0747qd != null && c0747qd.mo10842c();
    }

    /* renamed from: a */
    public final void mo10847a(C0734op c0734op, boolean z) {
        mo15280b();
        super.mo10847a(c0734op, z);
    }

    /* renamed from: a */
    public final boolean mo10852a(C0835pn c0835pn) {
        if (!c0835pn.hasVisibleItems()) {
            return false;
        }
        View childAt;
        C0835pn c0835pn2 = c0835pn;
        while (true) {
            C0734op c0734op = c0835pn2.f25433k;
            if (c0734op == this.f22158c) {
                break;
            }
            c0835pn2 = (C0835pn) c0734op;
        }
        C0736ot item = c0835pn2.getItem();
        ViewGroup viewGroup = (ViewGroup) this.f22160e;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof C0413ph) && ((C0413ph) childAt).mo10857a() == item) {
                    break;
                }
            }
            childAt = null;
        } else {
            childAt = null;
        }
        if (childAt == null) {
            return false;
        }
        boolean z;
        c0835pn.getItem().getItemId();
        int size = c0835pn.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item2 = c0835pn.getItem(i2);
            if (item2.isVisible() && item2.getIcon() != null) {
                z = true;
                break;
            }
        }
        z = false;
        this.f25441l = new C0743pz(this, this.f22157b, c0835pn, childAt);
        this.f25441l.mo10840a(z);
        if (this.f25441l.mo10844e()) {
            super.mo10852a(c0835pn);
            return true;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    /* renamed from: c */
    public final boolean mo14287c(C0736ot c0736ot) {
        return c0736ot.mo14355e();
    }

    /* renamed from: f */
    public final boolean mo15284f() {
        if (!this.f25436g || mo15283e() || this.f22158c == null || this.f22160e == null || this.f25442m != null || this.f22158c.mo14316c().isEmpty()) {
            return false;
        }
        this.f25442m = new C0425qa(this, new C0747qd(this, this.f22157b, this.f22158c, this.f25435f));
        ((View) this.f22160e).post(this.f25442m);
        super.mo10852a(null);
        return true;
    }

    /* renamed from: a */
    public final void mo10849a(boolean z) {
        int i;
        ArrayList c;
        super.mo10849a(z);
        ((View) this.f22160e).requestLayout();
        if (this.f22158c != null) {
            C0734op c0734op = this.f22158c;
            c0734op.mo14292a();
            ArrayList arrayList = c0734op.f22179d;
            int size = arrayList.size();
            for (i = 0; i < size; i++) {
                arrayList.get(i);
            }
        }
        if (this.f22158c != null) {
            c = this.f22158c.mo14316c();
        } else {
            c = null;
        }
        if (!this.f25436g) {
            i = 0;
        } else if (c != null) {
            int size2 = c.size();
            if (size2 == 1) {
                i = ((C0736ot) c.get(0)).isActionViewExpanded() ^ 1;
            } else if (size2 > 0) {
                i = 1;
            } else {
                i = 0;
            }
        } else {
            i = 0;
        }
        if (i != 0) {
            if (this.f25435f == null) {
                this.f25435f = new C0745qb(this, this.f22156a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f25435f.getParent();
            if (viewGroup != this.f22160e) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f25435f);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f22160e;
                View view = this.f25435f;
                LayoutParams b = ActionMenuView.m6876b();
                b.f22246a = true;
                actionMenuView.addView(view, b);
            }
        } else {
            C0745qb c0745qb = this.f25435f;
            if (c0745qb != null && c0745qb.getParent() == this.f22160e) {
                ((ViewGroup) this.f22160e).removeView(this.f25435f);
            }
        }
        ((ActionMenuView) this.f22160e).f10581b = this.f25436g;
    }
}
