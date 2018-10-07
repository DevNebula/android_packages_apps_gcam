package p000;

import android.content.Context;
import android.graphics.Rect;
import android.support.p002v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: su */
public final class C0840su extends C0759ta {
    /* renamed from: a */
    public C0485sx f25466a = new C0756sv();
    /* renamed from: r */
    private boolean f25467r = false;
    /* renamed from: s */
    private int f25468s = -1;
    /* renamed from: t */
    private int[] f25469t;
    /* renamed from: u */
    private View[] f25470u;
    /* renamed from: v */
    private final SparseIntArray f25471v = new SparseIntArray();
    /* renamed from: w */
    private final SparseIntArray f25472w = new SparseIntArray();
    /* renamed from: x */
    private final Rect f25473x = new Rect();

    public C0840su(int i) {
        mo15287a(i);
    }

    /* JADX WARNING: Missing block: B:5:0x0010, code:
            if (r0[r1 - 1] == r9) goto L_0x0016;
     */
    /* renamed from: g */
    private final void m17144g(int r9) {
        /*
        r8 = this;
        r3 = 0;
        r0 = r8.f25469t;
        r6 = r8.f25468s;
        if (r0 == 0) goto L_0x0012;
    L_0x0007:
        r1 = r0.length;
        r2 = r6 + 1;
        if (r1 != r2) goto L_0x0012;
    L_0x000c:
        r1 = r1 + -1;
        r1 = r0[r1];
        if (r1 == r9) goto L_0x0016;
    L_0x0012:
        r0 = r6 + 1;
        r0 = new int[r0];
    L_0x0016:
        r0[r3] = r3;
        r2 = r9 / r6;
        r7 = r9 % r6;
        r1 = 1;
        r4 = r1;
        r5 = r3;
    L_0x001f:
        if (r4 > r6) goto L_0x0036;
    L_0x0021:
        r3 = r3 + r7;
        if (r3 <= 0) goto L_0x0034;
    L_0x0024:
        r1 = r6 - r3;
        if (r1 >= r7) goto L_0x0032;
    L_0x0028:
        r1 = r2 + 1;
        r3 = r3 - r6;
    L_0x002b:
        r5 = r5 + r1;
        r0[r4] = r5;
        r1 = r4 + 1;
        r4 = r1;
        goto L_0x001f;
    L_0x0032:
        r1 = r2;
        goto L_0x002b;
    L_0x0034:
        r1 = r2;
        goto L_0x002b;
    L_0x0036:
        r8.f25469t = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: su.g(int):void");
    }

    /* renamed from: a */
    public final boolean mo11238a(C0519uk c0519uk) {
        return c0519uk instanceof C0757sw;
    }

    /* renamed from: a */
    final void mo14422a(C0528uv c0528uv, C0490td c0490td, C0518uj c0518uj) {
        int i = this.f25468s;
        for (int i2 = 0; i2 < this.f25468s && c0490td.mo11141a(c0528uv) && i > 0; i2++) {
            int i3 = c0490td.f9774d;
            c0518uj.mo11280a(i3, Math.max(0, c0490td.f9777g));
            i -= this.f25466a.mo11115a(i3);
            c0490td.f9774d += c0490td.f9775e;
        }
    }

    /* renamed from: z */
    private final void m17145z() {
        View[] viewArr = this.f25470u;
        if (viewArr == null || viewArr.length != this.f25468s) {
            this.f25470u = new View[this.f25468s];
        }
    }

    /* renamed from: a */
    final View mo14419a(C0524up c0524up, C0528uv c0528uv, int i, int i2, int i3) {
        int i4;
        View view = null;
        mo14424j();
        int f = this.f22297c.mo11179f();
        int b = this.f22297c.mo11171b();
        if (i2 > i) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        View view2 = null;
        while (i != i2) {
            View view3;
            View e = mo11256e(i);
            int c = C0517ug.m5983c(e);
            if (c < 0) {
                view3 = view2;
                e = view;
            } else if (c >= i3) {
                view3 = view2;
                e = view;
            } else if (m17140b(c0524up, c0528uv, c) != 0) {
                view3 = view2;
                e = view;
            } else if (((C0519uk) e.getLayoutParams()).f9832c.mo11326j()) {
                if (view2 == null) {
                    view3 = e;
                    e = view;
                } else {
                    view3 = view2;
                    e = view;
                }
            } else if (this.f22297c.mo11176d(e) < b && this.f22297c.mo11169a(e) >= f) {
                return e;
            } else {
                if (view != null) {
                    view3 = view2;
                    e = view;
                } else {
                    view3 = view2;
                }
            }
            i += i4;
            view = e;
            view2 = view3;
        }
        return view != null ? view : view2;
    }

    /* renamed from: a */
    public final C0519uk mo11218a() {
        if (this.f22296b == 0) {
            return new C0757sw(-2, -1);
        }
        return new C0757sw(-1, -2);
    }

    /* renamed from: a */
    public final C0519uk mo11219a(Context context, AttributeSet attributeSet) {
        return new C0757sw(context, attributeSet);
    }

    /* renamed from: a */
    public final C0519uk mo11220a(LayoutParams layoutParams) {
        if (layoutParams instanceof MarginLayoutParams) {
            return new C0757sw((MarginLayoutParams) layoutParams);
        }
        return new C0757sw(layoutParams);
    }

    /* renamed from: a */
    public final int mo11216a(C0524up c0524up, C0528uv c0528uv) {
        if (this.f22296b == 1) {
            return this.f25468s;
        }
        if (c0528uv.mo11304a() <= 0) {
            return 0;
        }
        return m17138a(c0524up, c0528uv, c0528uv.mo11304a() - 1) + 1;
    }

    /* renamed from: b */
    public final int mo11240b(C0524up c0524up, C0528uv c0528uv) {
        if (this.f22296b == 0) {
            return this.f25468s;
        }
        if (c0528uv.mo11304a() <= 0) {
            return 0;
        }
        return m17138a(c0524up, c0528uv, c0528uv.mo11304a() - 1) + 1;
    }

    /* renamed from: e */
    private final int m17143e(int i, int i2) {
        int[] iArr;
        if (this.f22296b == 1 && mo14425l()) {
            iArr = this.f25469t;
            int i3 = this.f25468s - i;
            return iArr[i3] - iArr[i3 - i2];
        }
        iArr = this.f25469t;
        return iArr[i + i2] - iArr[i];
    }

    /* renamed from: a */
    private final int m17138a(C0524up c0524up, C0528uv c0528uv, int i) {
        if (!c0528uv.f9861g) {
            return this.f25466a.mo11117b(i, this.f25468s);
        }
        int a = c0524up.mo11288a(i);
        if (a != -1) {
            return this.f25466a.mo11117b(a, this.f25468s);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot find span size for pre layout position. ");
        stringBuilder.append(i);
        Log.w("GridLayoutManager", stringBuilder.toString());
        return 0;
    }

    /* renamed from: b */
    private final int m17140b(C0524up c0524up, C0528uv c0528uv, int i) {
        if (!c0528uv.f9861g) {
            return this.f25466a.mo11116a(i, this.f25468s);
        }
        int i2 = this.f25472w.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        i2 = c0524up.mo11288a(i);
        if (i2 != -1) {
            return this.f25466a.mo11116a(i2, this.f25468s);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        stringBuilder.append(i);
        Log.w("GridLayoutManager", stringBuilder.toString());
        return 0;
    }

    /* renamed from: c */
    private final int m17142c(C0524up c0524up, C0528uv c0528uv, int i) {
        if (!c0528uv.f9861g) {
            return this.f25466a.mo11115a(i);
        }
        int i2 = this.f25471v.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        i2 = c0524up.mo11288a(i);
        if (i2 != -1) {
            return this.f25466a.mo11115a(i2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        stringBuilder.append(i);
        Log.w("GridLayoutManager", stringBuilder.toString());
        return 1;
    }

    /* renamed from: a */
    final void mo14421a(C0524up c0524up, C0528uv c0528uv, C0490td c0490td, C0489tc c0489tc) {
        int i;
        int i2;
        int i3;
        int c;
        int e = this.f22297c.mo11177e();
        if (mo11268o() > 0) {
            i = this.f25469t[this.f25468s];
        } else {
            i = 0;
        }
        if (e != 1073741824) {
            m17137A();
        }
        int i4 = c0490td.f9775e;
        int i5 = this.f25468s;
        if (i4 != 1) {
            i5 = m17140b(c0524up, c0528uv, c0490td.f9774d) + m17142c(c0524up, c0528uv, c0490td.f9774d);
            i2 = 0;
        } else {
            i2 = 0;
        }
        while (i2 < this.f25468s && c0490td.mo11141a(c0528uv) && i5 > 0) {
            i3 = c0490td.f9774d;
            c = m17142c(c0524up, c0528uv, i3);
            if (c <= this.f25468s) {
                i5 -= c;
                if (i5 < 0) {
                    break;
                }
                View a = c0490td.mo11139a(c0524up);
                if (a == null) {
                    break;
                }
                this.f25470u[i2] = a;
                i2++;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Item at position ");
                stringBuilder.append(i3);
                stringBuilder.append(" requires ");
                stringBuilder.append(c);
                stringBuilder.append(" spans but GridLayoutManager has only ");
                stringBuilder.append(this.f25468s);
                stringBuilder.append(" spans.");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        if (i2 == 0) {
            c0489tc.f9768b = true;
            return;
        }
        int i6;
        C0757sw c0757sw;
        if (i4 != 1) {
            c = -1;
            i5 = i2 - 1;
            i3 = -1;
        } else {
            c = i2;
            i3 = 1;
            i5 = 0;
        }
        int i7 = 0;
        for (i6 = i5; i6 != c; i6 += i3) {
            View view = this.f25470u[i6];
            c0757sw = (C0757sw) view.getLayoutParams();
            c0757sw.f22294b = m17142c(c0524up, c0528uv, C0517ug.m5983c(view));
            c0757sw.f22293a = i7;
            i7 += c0757sw.f22294b;
        }
        i3 = 0;
        float f = 0.0f;
        i6 = 0;
        while (i6 < i2) {
            View view2 = this.f25470u[i6];
            if (c0490td.f9780j == null) {
                if (i4 == 1) {
                    super.mo11228a(view2, -1, false);
                } else {
                    super.mo11228a(view2, 0, false);
                }
            } else if (i4 == 1) {
                super.mo11228a(view2, -1, true);
            } else {
                super.mo11228a(view2, 0, true);
            }
            Rect rect = this.f25473x;
            RecyclerView recyclerView = this.f9817g;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.mo1142d(view2));
            }
            m17141b(view2, e, false);
            i5 = this.f22297c.mo11172b(view2);
            if (i5 > i3) {
                i3 = i5;
            }
            float c2 = ((float) this.f22297c.mo11174c(view2)) / ((float) ((C0757sw) view2.getLayoutParams()).f22294b);
            if (c2 <= f) {
                c2 = f;
            }
            i6++;
            f = c2;
        }
        if (e == 1073741824) {
            i7 = i3;
        } else {
            m17144g(Math.max(Math.round(((float) this.f25468s) * f), i));
            i3 = 0;
            c = 0;
            while (c < i2) {
                View view3 = this.f25470u[c];
                m17141b(view3, 1073741824, true);
                i5 = this.f22297c.mo11172b(view3);
                if (i5 <= i3) {
                    i5 = i3;
                }
                c++;
                i3 = i5;
            }
            i7 = i3;
        }
        for (c = 0; c < i2; c++) {
            View view4 = this.f25470u[c];
            if (this.f22297c.mo11172b(view4) != i7) {
                c0757sw = (C0757sw) view4.getLayoutParams();
                Rect rect2 = c0757sw.f9833d;
                i = ((rect2.top + rect2.bottom) + c0757sw.topMargin) + c0757sw.bottomMargin;
                i3 = ((rect2.right + rect2.left) + c0757sw.leftMargin) + c0757sw.rightMargin;
                e = m17143e(c0757sw.f22293a, c0757sw.f22294b);
                if (this.f22296b == 1) {
                    i3 = C0517ug.m5978a(e, 1073741824, i3, c0757sw.width, false);
                    i5 = MeasureSpec.makeMeasureSpec(i7 - i, 1073741824);
                } else {
                    i3 = MeasureSpec.makeMeasureSpec(i7 - i3, 1073741824);
                    i5 = C0517ug.m5978a(e, 1073741824, i, c0757sw.height, false);
                }
                m17139a(view4, i3, i5, true);
            }
        }
        c0489tc.f9767a = i7;
        if (this.f22296b == 1) {
            if (c0490td.f9776f == -1) {
                c = c0490td.f9772b;
                i6 = c - i7;
                i3 = 0;
                i5 = 0;
            } else {
                i6 = c0490td.f9772b;
                c = i6 + i7;
                i3 = 0;
                i5 = 0;
            }
        } else if (c0490td.f9776f == -1) {
            i5 = c0490td.f9772b;
            i3 = i5 - i7;
            i6 = 0;
            c = 0;
        } else {
            i3 = c0490td.f9772b;
            i5 = i3 + i7;
            i6 = 0;
            c = 0;
        }
        i7 = i5;
        int i8 = c;
        c = i3;
        i3 = i8;
        for (i = 0; i < i2; i++) {
            View view5 = this.f25470u[i];
            c0757sw = (C0757sw) view5.getLayoutParams();
            if (this.f22296b != 1) {
                i6 = this.f25469t[c0757sw.f22293a] + mo11273t();
                i3 = this.f22297c.mo11174c(view5) + i6;
            } else if (mo14425l()) {
                i7 = this.f25469t[this.f25468s - c0757sw.f22293a] + mo11271r();
                c = i7 - this.f22297c.mo11174c(view5);
            } else {
                c = mo11271r() + this.f25469t[c0757sw.f22293a];
                i7 = this.f22297c.mo11174c(view5) + c;
            }
            C0517ug.m5980a(view5, c, i6, i7, i3);
            if (c0757sw.f9832c.mo11326j() || c0757sw.f9832c.mo11329m()) {
                c0489tc.f9769c = true;
            }
            c0489tc.f9770d |= view5.hasFocusable();
        }
        Arrays.fill(this.f25470u, null);
    }

    /* renamed from: b */
    private final void m17141b(View view, int i, boolean z) {
        int a;
        C0757sw c0757sw = (C0757sw) view.getLayoutParams();
        Rect rect = c0757sw.f9833d;
        int i2 = ((rect.top + rect.bottom) + c0757sw.topMargin) + c0757sw.bottomMargin;
        int i3 = c0757sw.rightMargin + ((rect.right + rect.left) + c0757sw.leftMargin);
        int e = m17143e(c0757sw.f22293a, c0757sw.f22294b);
        if (this.f22296b == 1) {
            e = C0517ug.m5978a(e, i, i3, c0757sw.width, false);
            a = C0517ug.m5978a(this.f22297c.mo11181g(), this.f9825o, i2, c0757sw.height, true);
        } else {
            int a2 = C0517ug.m5978a(e, i, i2, c0757sw.height, false);
            e = C0517ug.m5978a(this.f22297c.mo11181g(), this.f9824n, i3, c0757sw.width, true);
            a = a2;
        }
        m17139a(view, e, a, z);
    }

    /* renamed from: a */
    private final void m17139a(View view, int i, int i2, boolean z) {
        boolean a;
        C0519uk c0519uk = (C0519uk) view.getLayoutParams();
        if (!z) {
            a = mo11237a(view, i, i2, c0519uk);
        } else if (!this.f9820j) {
            a = true;
        } else if (!C0517ug.m5982b(view.getMeasuredWidth(), i, c0519uk.width)) {
            a = true;
        } else if (C0517ug.m5982b(view.getMeasuredHeight(), i2, c0519uk.height)) {
            a = false;
        } else {
            a = true;
        }
        if (a) {
            view.measure(i, i2);
        }
    }

    /* renamed from: a */
    final void mo14420a(C0524up c0524up, C0528uv c0528uv, C0488tb c0488tb, int i) {
        super.mo14420a(c0524up, c0528uv, c0488tb, i);
        m17137A();
        if (c0528uv.mo11304a() > 0 && !c0528uv.f9861g) {
            int b = m17140b(c0524up, c0528uv, c0488tb.f9763b);
            if (i == 1) {
                while (b > 0) {
                    b = c0488tb.f9763b;
                    if (b <= 0) {
                        break;
                    }
                    c0488tb.f9763b = b - 1;
                    b = m17140b(c0524up, c0528uv, c0488tb.f9763b);
                }
            } else {
                int a = c0528uv.mo11304a() - 1;
                int i2 = c0488tb.f9763b;
                while (i2 < a) {
                    int b2 = m17140b(c0524up, c0528uv, i2 + 1);
                    if (b2 <= b) {
                        break;
                    }
                    i2++;
                    b = b2;
                }
                c0488tb.f9763b = i2;
            }
        }
        m17145z();
    }

    /* renamed from: a */
    public final View mo11217a(View view, int i, C0524up c0524up, C0528uv c0528uv) {
        View view2;
        RecyclerView recyclerView = this.f9817g;
        if (recyclerView != null) {
            View a = recyclerView.mo1111a(view);
            if (a == null) {
                view2 = null;
            } else if (this.f9816f.mo11036c(a)) {
                view2 = null;
            } else {
                view2 = a;
            }
        } else {
            view2 = null;
        }
        if (view2 == null) {
            return null;
        }
        C0757sw c0757sw = (C0757sw) view2.getLayoutParams();
        int i2 = c0757sw.f22293a;
        int i3 = i2 + c0757sw.f22294b;
        if (super.mo11217a(view, i, c0524up, c0528uv) == null) {
            return null;
        }
        boolean z;
        int o;
        int i4;
        int i5;
        Object obj;
        if (mo14423b(i) != 1) {
            z = false;
        } else {
            z = true;
        }
        if (z != this.f22298d) {
            o = mo11268o() - 1;
            i4 = -1;
            i5 = -1;
        } else {
            o = 0;
            i4 = 1;
            i5 = mo11268o();
        }
        if (this.f22296b != 1) {
            obj = null;
        } else if (mo14425l()) {
            obj = 1;
        } else {
            obj = null;
        }
        int a2 = m17138a(c0524up, c0528uv, o);
        View view3 = null;
        int i6 = -1;
        int i7 = 0;
        View view4 = null;
        int i8 = -1;
        int i9 = 0;
        int i10 = o;
        while (i10 != i5) {
            o = m17138a(c0524up, c0528uv, i10);
            View e = mo11256e(i10);
            if (e == view2) {
                break;
            }
            View view5;
            int i11;
            if (e.hasFocusable() && o != a2) {
                if (view3 != null) {
                    break;
                }
                o = i9;
                e = view3;
                i9 = i8;
                view5 = view4;
                i11 = i7;
                i7 = i6;
            } else {
                c0757sw = (C0757sw) e.getLayoutParams();
                int i12 = c0757sw.f22293a;
                int i13 = i12 + c0757sw.f22294b;
                if (e.hasFocusable() && i12 == i2 && i13 == i3) {
                    return e;
                }
                Object obj2;
                if (e.hasFocusable() && view3 == null) {
                    obj2 = 1;
                } else if (e.hasFocusable() || view4 != null) {
                    int min = Math.min(i13, i3) - Math.max(i12, i2);
                    if (e.hasFocusable()) {
                        if (min > i7) {
                            obj2 = 1;
                        } else if (min == i7) {
                            if (i12 <= i6) {
                                obj2 = null;
                            } else {
                                obj2 = 1;
                            }
                            if (obj == obj2) {
                                obj2 = 1;
                            } else {
                                obj2 = null;
                            }
                        } else {
                            obj2 = null;
                        }
                    } else if (view3 != null) {
                        obj2 = null;
                    } else {
                        int i14;
                        if (!this.f9818h.mo11407a(e)) {
                            i14 = 0;
                        } else if (this.f9819i.mo11407a(e)) {
                            i14 = 1;
                        } else {
                            i14 = 0;
                        }
                        if ((i14 ^ 1) == 0) {
                            obj2 = null;
                        } else if (min > i9) {
                            obj2 = 1;
                        } else if (min == i9) {
                            if (i12 <= i8) {
                                obj2 = null;
                            } else {
                                obj2 = 1;
                            }
                            if (obj == obj2) {
                                obj2 = 1;
                            } else {
                                obj2 = null;
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                } else {
                    obj2 = 1;
                }
                if (obj2 == null) {
                    o = i9;
                    e = view3;
                    i9 = i8;
                    view5 = view4;
                    i11 = i7;
                    i7 = i6;
                } else if (e.hasFocusable()) {
                    i7 = c0757sw.f22293a;
                    int i15 = i9;
                    i9 = i8;
                    view5 = view4;
                    i11 = Math.min(i13, i3) - Math.max(i12, i2);
                    o = i15;
                } else {
                    i9 = c0757sw.f22293a;
                    o = Math.min(i13, i3) - Math.max(i12, i2);
                    view5 = e;
                    i11 = i7;
                    e = view3;
                    i7 = i6;
                }
            }
            i10 += i4;
            i6 = i7;
            i7 = i11;
            view3 = e;
            view4 = view5;
            i8 = i9;
            i9 = o;
        }
        return view3 != null ? view3 : view4;
    }

    /* renamed from: a */
    public final void mo11234a(C0524up c0524up, C0528uv c0528uv, View view, C0334kk c0334kk) {
        boolean z = false;
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C0757sw) {
            C0757sw c0757sw = (C0757sw) layoutParams;
            int a = m17138a(c0524up, c0528uv, c0757sw.f9832c.mo11322f());
            int i;
            int i2;
            int i3;
            if (this.f22296b == 0) {
                i = c0757sw.f22293a;
                i2 = c0757sw.f22294b;
                i3 = this.f25468s;
                boolean z2 = i3 <= 1 ? false : i2 == i3;
                c0334kk.mo10083a(C0337kn.m5072a(i, i2, a, 1, z2));
                return;
            }
            i = c0757sw.f22293a;
            i3 = c0757sw.f22294b;
            i2 = this.f25468s;
            if (i2 > 1 && i3 == i2) {
                z = true;
            }
            c0334kk.mo10083a(C0337kn.m5072a(a, 1, i, i3, z));
            return;
        }
        super.mo11230a(view, c0334kk);
    }

    /* renamed from: b */
    public final void mo11242b() {
        this.f25466a.f9744a.clear();
    }

    /* renamed from: c */
    public final void mo11248c() {
        this.f25466a.f9744a.clear();
    }

    /* renamed from: d */
    public final void mo11252d() {
        this.f25466a.f9744a.clear();
    }

    /* renamed from: e */
    public final void mo11257e() {
        this.f25466a.f9744a.clear();
    }

    /* renamed from: f */
    public final void mo11259f() {
        this.f25466a.f9744a.clear();
    }

    /* renamed from: c */
    public final void mo11250c(C0524up c0524up, C0528uv c0528uv) {
        if (c0528uv.f9861g) {
            int o = mo11268o();
            for (int i = 0; i < o; i++) {
                C0757sw c0757sw = (C0757sw) mo11256e(i).getLayoutParams();
                int f = c0757sw.f9832c.mo11322f();
                this.f25471v.put(f, c0757sw.f22294b);
                this.f25472w.put(f, c0757sw.f22293a);
            }
        }
        super.mo11250c(c0524up, c0528uv);
        this.f25471v.clear();
        this.f25472w.clear();
    }

    /* renamed from: a */
    public final void mo11235a(C0528uv c0528uv) {
        super.mo11235a(c0528uv);
        this.f25467r = false;
    }

    /* renamed from: a */
    public final int mo11215a(int i, C0524up c0524up, C0528uv c0528uv) {
        m17137A();
        m17145z();
        return super.mo11215a(i, c0524up, c0528uv);
    }

    /* renamed from: b */
    public final int mo11239b(int i, C0524up c0524up, C0528uv c0528uv) {
        m17137A();
        m17145z();
        return super.mo11239b(i, c0524up, c0528uv);
    }

    /* renamed from: a */
    public final void mo11225a(Rect rect, int i, int i2) {
        if (this.f25469t == null) {
            super.mo11225a(rect, i, i2);
        }
        int s = mo11272s() + mo11271r();
        int t = mo11273t() + mo11270q();
        int[] iArr;
        if (this.f22296b == 1) {
            t = C0517ug.m5977a(i2, t + rect.height(), C0315jm.m4636k(this.f9817g));
            iArr = this.f25469t;
            s = C0517ug.m5977a(i, s + iArr[iArr.length - 1], C0315jm.m4637l(this.f9817g));
        } else {
            s = C0517ug.m5977a(i, s + rect.width(), C0315jm.m4637l(this.f9817g));
            iArr = this.f25469t;
            t = C0517ug.m5977a(i2, t + iArr[iArr.length - 1], C0315jm.m4636k(this.f9817g));
        }
        mo11249c(s, t);
    }

    /* renamed from: a */
    public final void mo15287a(int i) {
        if (i != this.f25468s) {
            this.f25467r = true;
            if (i <= 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Span count should be at least 1. Provided ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            this.f25468s = i;
            this.f25466a.f9744a.clear();
            mo11278y();
        }
    }

    /* renamed from: g */
    public final boolean mo11262g() {
        return this.f22299e == null && !this.f25467r;
    }

    /* renamed from: A */
    private final void m17137A() {
        int s;
        if (this.f22296b == 1) {
            s = (this.f9826p - mo11272s()) - mo11271r();
        } else {
            s = (this.f9827q - mo11270q()) - mo11273t();
        }
        m17144g(s);
    }
}
