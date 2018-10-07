package p000;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.support.p002v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ug */
public abstract class C0517ug {
    /* renamed from: a */
    private final C0547vv f9814a = new C0762uh(this);
    /* renamed from: b */
    private final C0547vv f9815b = new C0763ui(this);
    /* renamed from: f */
    public C0457rp f9816f;
    /* renamed from: g */
    public RecyclerView f9817g;
    /* renamed from: h */
    public C0545vt f9818h = new C0545vt(this.f9814a);
    /* renamed from: i */
    public C0545vt f9819i = new C0545vt(this.f9815b);
    /* renamed from: j */
    public boolean f9820j = true;
    /* renamed from: k */
    public boolean f9821k = true;
    /* renamed from: l */
    public int f9822l;
    /* renamed from: m */
    public boolean f9823m;
    /* renamed from: n */
    public int f9824n;
    /* renamed from: o */
    public int f9825o;
    /* renamed from: p */
    public int f9826p;
    /* renamed from: q */
    public int f9827q;

    /* renamed from: a */
    public abstract C0519uk mo11218a();

    /* renamed from: a */
    final void mo11228a(View view, int i, boolean z) {
        C0530ux c = RecyclerView.m453c(view);
        if (z || c.mo11326j()) {
            this.f9817g.f707g.mo11475a(c);
        } else {
            this.f9817g.f707g.mo11479c(c);
        }
        C0519uk c0519uk = (C0519uk) view.getLayoutParams();
        if (c.mo11334r() || c.mo11327k()) {
            if (c.mo11327k()) {
                c.mo11333q();
            } else {
                c.mo11319c();
            }
            this.f9816f.mo11030a(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.f9817g) {
            int b = this.f9816f.mo11033b(view);
            if (i == -1) {
                i = this.f9816f.mo11027a();
            }
            if (b == -1) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                stringBuilder.append(this.f9817g.indexOfChild(view));
                stringBuilder.append(this.f9817g.mo1154g());
                throw new IllegalStateException(stringBuilder.toString());
            } else if (b != i) {
                C0517ug c0517ug = this.f9817g.f711k;
                View e = c0517ug.mo11256e(b);
                if (e == null) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Cannot move a child from non-existing index:");
                    stringBuilder2.append(b);
                    stringBuilder2.append(c0517ug.f9817g.toString());
                    throw new IllegalArgumentException(stringBuilder2.toString());
                }
                c0517ug.mo11253d(b);
                C0519uk c0519uk2 = (C0519uk) e.getLayoutParams();
                C0530ux c2 = RecyclerView.m453c(e);
                if (c2.mo11326j()) {
                    c0517ug.f9817g.f707g.mo11475a(c2);
                } else {
                    c0517ug.f9817g.f707g.mo11479c(c2);
                }
                c0517ug.f9816f.mo11030a(e, i, c0519uk2, c2.mo11326j());
            }
        } else {
            this.f9816f.mo11031a(view, i, false);
            c0519uk.f9834e = true;
        }
        if (c0519uk.f9835f) {
            c.f9877a.invalidate();
            c0519uk.f9835f = false;
        }
    }

    /* renamed from: a */
    public void mo11232a(String str) {
        RecyclerView recyclerView = this.f9817g;
        if (recyclerView != null) {
            recyclerView.mo1117a(str);
        }
    }

    /* renamed from: h */
    public boolean mo11263h() {
        return false;
    }

    /* renamed from: i */
    public boolean mo11264i() {
        return false;
    }

    /* renamed from: a */
    public boolean mo11238a(C0519uk c0519uk) {
        return c0519uk != null;
    }

    /* renamed from: a */
    public static int m5977a(int i, int i2, int i3) {
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        switch (mode) {
            case kvl.UNSET_ENUM_VALUE /*-2147483648*/:
                return Math.min(size, Math.max(i2, i3));
            case 1073741824:
                return size;
            default:
                return Math.max(i2, i3);
        }
    }

    /* renamed from: a */
    public void mo11222a(int i, int i2, C0528uv c0528uv, C0518uj c0518uj) {
    }

    /* renamed from: a */
    public void mo11223a(int i, C0518uj c0518uj) {
    }

    /* renamed from: b */
    public int mo11241b(C0528uv c0528uv) {
        return 0;
    }

    /* renamed from: c */
    public int mo11246c(C0528uv c0528uv) {
        return 0;
    }

    /* renamed from: d */
    public int mo11251d(C0528uv c0528uv) {
        return 0;
    }

    /* renamed from: e */
    public int mo11255e(C0528uv c0528uv) {
        return 0;
    }

    /* renamed from: f */
    public int mo11258f(C0528uv c0528uv) {
        return 0;
    }

    /* renamed from: g */
    public int mo11261g(C0528uv c0528uv) {
        return 0;
    }

    /* renamed from: d */
    public final void mo11253d(int i) {
        mo11256e(i);
        this.f9816f.mo11028a(i);
    }

    /* renamed from: c */
    public View mo11247c(int i) {
        int o = mo11268o();
        for (int i2 = 0; i2 < o; i2++) {
            View e = mo11256e(i2);
            C0530ux c = RecyclerView.m453c(e);
            if (c != null && c.mo11322f() == i && !c.mo11332p() && (this.f9817g.f662A.f9861g || !c.mo11326j())) {
                return e;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0519uk mo11219a(Context context, AttributeSet attributeSet) {
        return new C0519uk(context, attributeSet);
    }

    /* renamed from: a */
    public C0519uk mo11220a(LayoutParams layoutParams) {
        if (layoutParams instanceof C0519uk) {
            return new C0519uk((C0519uk) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new C0519uk((MarginLayoutParams) layoutParams);
        }
        return new C0519uk(layoutParams);
    }

    /* renamed from: e */
    public final View mo11256e(int i) {
        C0457rp c0457rp = this.f9816f;
        return c0457rp != null ? c0457rp.mo11034b(i) : null;
    }

    /* renamed from: o */
    public final int mo11268o() {
        C0457rp c0457rp = this.f9816f;
        return c0457rp != null ? c0457rp.mo11027a() : 0;
    }

    /* renamed from: a */
    public static int m5978a(int i, int i2, int i3, int i4, boolean z) {
        int i5 = 0;
        int max = Math.max(0, i - i3);
        if (z) {
            if (i4 >= 0) {
                i5 = 1073741824;
                max = i4;
            } else if (i4 == -1) {
                switch (i2) {
                    case kvl.UNSET_ENUM_VALUE /*-2147483648*/:
                    case 1073741824:
                        i5 = max;
                        break;
                    case 0:
                        i2 = 0;
                        break;
                    default:
                        i2 = 0;
                        break;
                }
                max = i5;
                i5 = i2;
            } else {
                max = i4 == -2 ? 0 : 0;
            }
        } else if (i4 >= 0) {
            i5 = 1073741824;
            max = i4;
        } else if (i4 == -1) {
            i5 = i2;
        } else if (i4 != -2) {
            max = 0;
        } else if (i2 == kvl.UNSET_ENUM_VALUE) {
            i5 = kvl.UNSET_ENUM_VALUE;
        } else if (i2 == 1073741824) {
            i5 = kvl.UNSET_ENUM_VALUE;
        }
        return MeasureSpec.makeMeasureSpec(max, i5);
    }

    /* renamed from: a */
    public int mo11216a(C0524up c0524up, C0528uv c0528uv) {
        RecyclerView recyclerView = this.f9817g;
        if (recyclerView == null || recyclerView.f710j == null || !mo11263h()) {
            return 1;
        }
        return this.f9817g.f710j.mo11186a();
    }

    /* renamed from: a */
    public static int m5979a(View view) {
        return ((C0519uk) view.getLayoutParams()).f9833d.bottom + view.getBottom();
    }

    /* renamed from: b */
    public static int m5981b(View view) {
        return view.getTop() - ((C0519uk) view.getLayoutParams()).f9833d.top;
    }

    /* renamed from: p */
    public final View mo11269p() {
        RecyclerView recyclerView = this.f9817g;
        if (recyclerView == null) {
            return null;
        }
        View focusedChild = recyclerView.getFocusedChild();
        if (focusedChild == null || this.f9816f.mo11036c(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    /* renamed from: q */
    public final int mo11270q() {
        RecyclerView recyclerView = this.f9817g;
        return recyclerView != null ? recyclerView.getPaddingBottom() : 0;
    }

    /* renamed from: r */
    public final int mo11271r() {
        RecyclerView recyclerView = this.f9817g;
        return recyclerView != null ? recyclerView.getPaddingLeft() : 0;
    }

    /* renamed from: s */
    public final int mo11272s() {
        RecyclerView recyclerView = this.f9817g;
        return recyclerView != null ? recyclerView.getPaddingRight() : 0;
    }

    /* renamed from: t */
    public final int mo11273t() {
        RecyclerView recyclerView = this.f9817g;
        return recyclerView != null ? recyclerView.getPaddingTop() : 0;
    }

    /* renamed from: c */
    public static int m5983c(View view) {
        return ((C0519uk) view.getLayoutParams()).f9832c.mo11322f();
    }

    /* renamed from: b */
    public int mo11240b(C0524up c0524up, C0528uv c0528uv) {
        RecyclerView recyclerView = this.f9817g;
        if (recyclerView == null || recyclerView.f710j == null || !mo11264i()) {
            return 1;
        }
        return this.f9817g.f710j.mo11186a();
    }

    /* renamed from: a */
    public final void mo11229a(View view, Rect rect) {
        Rect rect2 = ((C0519uk) view.getLayoutParams()).f9833d;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, rect2.bottom + view.getHeight());
        if (this.f9817g != null) {
            Matrix matrix = view.getMatrix();
            if (!(matrix == null || matrix.isIdentity())) {
                RectF rectF = this.f9817g.f709i;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    /* renamed from: k */
    public boolean mo11265k() {
        return false;
    }

    /* renamed from: b */
    static boolean m5982b(int i, int i2, int i3) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        switch (mode) {
            case kvl.UNSET_ENUM_VALUE /*-2147483648*/:
                if (size >= i) {
                    return true;
                }
                return false;
            case 0:
                return true;
            case 1073741824:
                if (size == i) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public static void m5980a(View view, int i, int i2, int i3, int i4) {
        C0519uk c0519uk = (C0519uk) view.getLayoutParams();
        Rect rect = c0519uk.f9833d;
        view.layout((rect.left + i) + c0519uk.leftMargin, (rect.top + i2) + c0519uk.topMargin, (i3 - rect.right) - c0519uk.rightMargin, (i4 - rect.bottom) - c0519uk.bottomMargin);
    }

    /* renamed from: u */
    public void mo11274u() {
    }

    /* renamed from: v */
    public void mo11275v() {
    }

    /* renamed from: w */
    public void mo11276w() {
    }

    /* renamed from: a */
    public View mo11217a(View view, int i, C0524up c0524up, C0528uv c0528uv) {
        return null;
    }

    /* renamed from: a */
    public void mo11231a(AccessibilityEvent accessibilityEvent) {
        boolean z = true;
        RecyclerView recyclerView = this.f9817g;
        C0524up c0524up = recyclerView.f704d;
        C0528uv c0528uv = recyclerView.f662A;
        if (recyclerView != null && accessibilityEvent != null) {
            if (!(recyclerView.canScrollVertically(1) || this.f9817g.canScrollVertically(-1) || this.f9817g.canScrollHorizontally(-1) || this.f9817g.canScrollHorizontally(1))) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            C0507tx c0507tx = this.f9817g.f710j;
            if (c0507tx != null) {
                accessibilityEvent.setItemCount(c0507tx.mo11186a());
            }
        }
    }

    /* renamed from: a */
    public void mo11234a(C0524up c0524up, C0528uv c0528uv, View view, C0334kk c0334kk) {
        int c;
        int c2;
        if (mo11264i()) {
            c = C0517ug.m5983c(view);
        } else {
            c = 0;
        }
        if (mo11263h()) {
            c2 = C0517ug.m5983c(view);
        } else {
            c2 = 0;
        }
        c0334kk.mo10083a(C0337kn.m5072a(c, 1, c2, 1, false));
    }

    /* renamed from: a */
    final void mo11230a(View view, C0334kk c0334kk) {
        C0530ux c = RecyclerView.m453c(view);
        if (c != null && !c.mo11326j() && !this.f9816f.mo11036c(c.f9877a)) {
            RecyclerView recyclerView = this.f9817g;
            mo11234a(recyclerView.f704d, recyclerView.f662A, view, c0334kk);
        }
    }

    /* renamed from: b */
    public void mo11242b() {
    }

    /* renamed from: c */
    public void mo11248c() {
    }

    /* renamed from: d */
    public void mo11252d() {
    }

    /* renamed from: e */
    public void mo11257e() {
    }

    /* renamed from: x */
    public void mo11277x() {
    }

    /* renamed from: f */
    public void mo11259f() {
        mo11277x();
    }

    /* renamed from: c */
    public void mo11250c(C0524up c0524up, C0528uv c0528uv) {
        Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }

    /* renamed from: a */
    public void mo11235a(C0528uv c0528uv) {
    }

    /* renamed from: a */
    public final void mo11221a(int i, int i2) {
        this.f9817g.mo1128b(i, i2);
    }

    /* renamed from: a */
    public void mo11226a(Parcelable parcelable) {
    }

    /* renamed from: m */
    public Parcelable mo11266m() {
        return null;
    }

    /* renamed from: a */
    public final void mo11233a(C0524up c0524up) {
        for (int o = mo11268o() - 1; o >= 0; o--) {
            if (!RecyclerView.m453c(mo11256e(o)).mo11332p()) {
                mo11224a(o, c0524up);
            }
        }
    }

    /* renamed from: b */
    public final void mo11245b(C0524up c0524up) {
        int size = c0524up.f9842a.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((C0530ux) c0524up.f9842a.get(i)).f9877a;
            C0530ux c = RecyclerView.m453c(view);
            if (!c.mo11332p()) {
                c.mo11316a(false);
                if (c.mo11328l()) {
                    this.f9817g.removeDetachedView(view, false);
                }
                C0512ub c0512ub = this.f9817g.f724x;
                if (c0512ub != null) {
                    c0512ub.mo11205c(c);
                }
                c.mo11316a(true);
                c0524up.mo11291a(view);
            }
        }
        c0524up.f9842a.clear();
        ArrayList arrayList = c0524up.f9843b;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (size > 0) {
            this.f9817g.invalidate();
        }
    }

    /* renamed from: a */
    public final void mo11224a(int i, C0524up c0524up) {
        View e = mo11256e(i);
        mo11260f(i);
        c0524up.mo11296b(e);
    }

    /* renamed from: f */
    public final void mo11260f(int i) {
        if (mo11256e(i) != null) {
            C0457rp c0457rp = this.f9816f;
            int c = c0457rp.mo11035c(i);
            View a = c0457rp.f9647a.mo11048a(c);
            if (a != null) {
                if (c0457rp.f9648b.mo11044d(c)) {
                    c0457rp.mo11038d(a);
                }
                c0457rp.f9647a.mo11049b(c);
            }
        }
    }

    /* JADX WARNING: Missing block: B:26:0x00cf, code:
            if (r1 != null) goto L_0x0082;
     */
    /* renamed from: a */
    public final boolean mo11236a(android.support.p002v7.widget.RecyclerView r16, android.view.View r17, android.graphics.Rect r18, boolean r19, boolean r20) {
        /*
        r15 = this;
        r1 = 2;
        r4 = new int[r1];
        r1 = r15.mo11271r();
        r2 = r15.mo11273t();
        r5 = r15.f9826p;
        r6 = r15.mo11272s();
        r7 = r15.f9827q;
        r8 = r15.mo11270q();
        r3 = r17.getLeft();
        r0 = r18;
        r9 = r0.left;
        r3 = r3 + r9;
        r9 = r17.getScrollX();
        r9 = r3 - r9;
        r3 = r17.getTop();
        r0 = r18;
        r10 = r0.top;
        r3 = r3 + r10;
        r10 = r17.getScrollY();
        r10 = r3 - r10;
        r11 = r18.width();
        r12 = r18.height();
        r13 = r9 - r1;
        r1 = 0;
        r3 = java.lang.Math.min(r1, r13);
        r14 = r10 - r2;
        r1 = 0;
        r1 = java.lang.Math.min(r1, r14);
        r2 = r9 + r11;
        r5 = r5 - r6;
        r5 = r2 - r5;
        r2 = 0;
        r2 = java.lang.Math.max(r2, r5);
        r6 = 0;
        r9 = r10 + r12;
        r7 = r7 - r8;
        r7 = r9 - r7;
        r6 = java.lang.Math.max(r6, r7);
        r7 = r15.f9817g;
        r7 = p000.C0315jm.m4635j(r7);
        r8 = 1;
        if (r7 != r8) goto L_0x00dc;
    L_0x0068:
        if (r2 != 0) goto L_0x006e;
    L_0x006a:
        r2 = java.lang.Math.max(r3, r5);
    L_0x006e:
        if (r1 != 0) goto L_0x0074;
    L_0x0070:
        r1 = java.lang.Math.min(r14, r6);
    L_0x0074:
        r3 = 0;
        r4[r3] = r2;
        r2 = 1;
        r4[r2] = r1;
        r1 = 0;
        r2 = r4[r1];
        r1 = 1;
        r3 = r4[r1];
        if (r20 != 0) goto L_0x0097;
    L_0x0082:
        if (r2 != 0) goto L_0x0086;
    L_0x0084:
        if (r3 == 0) goto L_0x0095;
    L_0x0086:
        if (r19 == 0) goto L_0x008f;
    L_0x0088:
        r0 = r16;
        r0.scrollBy(r2, r3);
    L_0x008d:
        r1 = 1;
    L_0x008e:
        return r1;
    L_0x008f:
        r0 = r16;
        r0.mo1133c(r2, r3);
        goto L_0x008d;
    L_0x0095:
        r1 = 0;
        goto L_0x008e;
    L_0x0097:
        r1 = r16.getFocusedChild();
        if (r1 == 0) goto L_0x00da;
    L_0x009d:
        r4 = r15.mo11271r();
        r5 = r15.mo11273t();
        r6 = r15.f9826p;
        r7 = r15.mo11272s();
        r8 = r15.f9827q;
        r9 = r15.mo11270q();
        r8 = r8 - r9;
        r9 = r15.f9817g;
        r9 = r9.f708h;
        android.support.p002v7.widget.RecyclerView.m446a(r1, r9);
        r1 = r9.left;
        r1 = r1 - r2;
        r6 = r6 - r7;
        if (r1 >= r6) goto L_0x00d8;
    L_0x00bf:
        r1 = r9.right;
        r1 = r1 - r2;
        if (r1 <= r4) goto L_0x00d6;
    L_0x00c4:
        r1 = r9.top;
        r1 = r1 - r3;
        if (r1 >= r8) goto L_0x00d4;
    L_0x00c9:
        r1 = r9.bottom;
        r1 = r1 - r3;
        if (r1 <= r5) goto L_0x00d2;
    L_0x00ce:
        r1 = 1;
    L_0x00cf:
        if (r1 == 0) goto L_0x0095;
    L_0x00d1:
        goto L_0x0082;
    L_0x00d2:
        r1 = 0;
        goto L_0x00cf;
    L_0x00d4:
        r1 = 0;
        goto L_0x00cf;
    L_0x00d6:
        r1 = 0;
        goto L_0x00cf;
    L_0x00d8:
        r1 = 0;
        goto L_0x00cf;
    L_0x00da:
        r1 = 0;
        goto L_0x00cf;
    L_0x00dc:
        if (r3 != 0) goto L_0x00e3;
    L_0x00de:
        r2 = java.lang.Math.min(r13, r2);
        goto L_0x006e;
    L_0x00e3:
        r2 = r3;
        goto L_0x006e;
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.a(android.support.v7.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    /* renamed from: y */
    public final void mo11278y() {
        RecyclerView recyclerView = this.f9817g;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    /* renamed from: a */
    public int mo11215a(int i, C0524up c0524up, C0528uv c0528uv) {
        return 0;
    }

    /* renamed from: b */
    public int mo11239b(int i, C0524up c0524up, C0528uv c0528uv) {
        return 0;
    }

    /* renamed from: a */
    public final void mo11227a(RecyclerView recyclerView) {
        mo11243b(MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    /* renamed from: b */
    public final void mo11243b(int i, int i2) {
        this.f9826p = MeasureSpec.getSize(i);
        this.f9824n = MeasureSpec.getMode(i);
        if (this.f9824n == 0 && !RecyclerView.f660a) {
            this.f9826p = 0;
        }
        this.f9827q = MeasureSpec.getSize(i2);
        this.f9825o = MeasureSpec.getMode(i2);
        if (this.f9825o == 0 && !RecyclerView.f660a) {
            this.f9827q = 0;
        }
    }

    /* renamed from: c */
    public final void mo11249c(int i, int i2) {
        this.f9817g.setMeasuredDimension(i, i2);
    }

    /* renamed from: a */
    public void mo11225a(Rect rect, int i, int i2) {
        int width = rect.width();
        int r = mo11271r();
        int s = mo11272s();
        int height = rect.height();
        int t = mo11273t();
        mo11249c(C0517ug.m5977a(i, (width + r) + s, C0315jm.m4637l(this.f9817g)), C0517ug.m5977a(i2, (height + t) + mo11270q(), C0315jm.m4636k(this.f9817g)));
    }

    /* renamed from: d */
    public final void mo11254d(int i, int i2) {
        int i3 = LfuScheduler.MAX_PRIORITY;
        int i4 = kvl.UNSET_ENUM_VALUE;
        int o = mo11268o();
        if (o != 0) {
            int i5 = kvl.UNSET_ENUM_VALUE;
            int i6 = LfuScheduler.MAX_PRIORITY;
            for (int i7 = 0; i7 < o; i7++) {
                View e = mo11256e(i7);
                Rect rect = this.f9817g.f708h;
                RecyclerView.m446a(e, rect);
                if (rect.left < i6) {
                    i6 = rect.left;
                }
                if (rect.right > i5) {
                    i5 = rect.right;
                }
                if (rect.top < i3) {
                    i3 = rect.top;
                }
                if (rect.bottom > i4) {
                    i4 = rect.bottom;
                }
            }
            this.f9817g.f708h.set(i6, i3, i5, i4);
            mo11225a(this.f9817g.f708h, i, i2);
            return;
        }
        this.f9817g.mo1128b(i, i2);
    }

    /* renamed from: b */
    public final void mo11244b(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f9817g = null;
            this.f9816f = null;
            this.f9826p = 0;
            this.f9827q = 0;
        } else {
            this.f9817g = recyclerView;
            this.f9816f = recyclerView.f706f;
            this.f9826p = recyclerView.getWidth();
            this.f9827q = recyclerView.getHeight();
        }
        this.f9824n = 1073741824;
        this.f9825o = 1073741824;
    }

    /* renamed from: a */
    final boolean mo11237a(View view, int i, int i2, C0519uk c0519uk) {
        return (!view.isLayoutRequested() && this.f9820j && C0517ug.m5982b(view.getWidth(), i, c0519uk.width) && C0517ug.m5982b(view.getHeight(), i2, c0519uk.height)) ? false : true;
    }

    /* renamed from: n */
    public boolean mo11267n() {
        return false;
    }

    /* renamed from: g */
    public boolean mo11262g() {
        return false;
    }
}
