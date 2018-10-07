package p000;

import android.graphics.Rect;
import android.os.Parcelable;
import android.support.p001v4.app.FragmentTransaction;
import android.support.p002v7.widget.RecyclerView;
import android.support.p003v8.renderscript.ScriptIntrinsicBLAS;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.refocus.processing.DepthmapTask;
import java.util.List;

/* compiled from: PG */
/* renamed from: ta */
public class C0759ta extends C0517ug {
    /* renamed from: a */
    private C0490td f22295a;
    /* renamed from: b */
    public int f22296b = 1;
    /* renamed from: c */
    public C0503tt f22297c;
    /* renamed from: d */
    public boolean f22298d = false;
    /* renamed from: e */
    public C0491te f22299e = null;
    /* renamed from: r */
    private boolean f22300r = false;
    /* renamed from: s */
    private boolean f22301s = true;
    /* renamed from: t */
    private int f22302t = -1;
    /* renamed from: u */
    private int f22303u = kvl.UNSET_ENUM_VALUE;
    /* renamed from: v */
    private final C0488tb f22304v = new C0488tb();
    /* renamed from: w */
    private final C0489tc f22305w = new C0489tc();
    /* renamed from: x */
    private int f22306x = 2;

    public C0759ta() {
        mo11232a(null);
        if (this.f22296b != 1 || this.f22297c == null) {
            this.f22297c = new C0503tt(this, 0);
            this.f22304v.f9762a = this.f22297c;
            this.f22296b = 1;
            mo11278y();
        }
        mo11232a(null);
    }

    /* renamed from: a */
    public final void mo11232a(String str) {
        if (this.f22299e == null) {
            super.mo11232a(str);
        }
    }

    /* renamed from: h */
    public final boolean mo11263h() {
        return this.f22296b == 0;
    }

    /* renamed from: i */
    public final boolean mo11264i() {
        return this.f22296b == 1;
    }

    /* renamed from: a */
    public final void mo11222a(int i, int i2, C0528uv c0528uv, C0518uj c0518uj) {
        if (this.f22296b == 0) {
            i2 = i;
        }
        if (mo11268o() != 0 && i2 != 0) {
            int i3;
            mo14424j();
            if (i2 > 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            m14617a(i3, Math.abs(i2), true, c0528uv);
            mo14422a(c0528uv, this.f22295a, c0518uj);
        }
    }

    /* renamed from: a */
    public final void mo11223a(int i, C0518uj c0518uj) {
        boolean z;
        int i2;
        int i3;
        C0491te c0491te = this.f22299e;
        if (c0491te == null || !c0491te.mo11142a()) {
            m14612E();
            z = this.f22298d;
            i2 = this.f22302t;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            c0491te = this.f22299e;
            z = c0491te.f9784c;
            i2 = c0491te.f9782a;
        }
        if (z) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        int i4 = i2;
        for (i2 = 0; i2 < this.f22306x && i4 >= 0 && i4 < i; i2++) {
            c0518uj.mo11280a(i4, 0);
            i4 += i3;
        }
    }

    /* renamed from: a */
    void mo14422a(C0528uv c0528uv, C0490td c0490td, C0518uj c0518uj) {
        int i = c0490td.f9774d;
        if (i >= 0 && i < c0528uv.mo11304a()) {
            c0518uj.mo11280a(i, Math.max(0, c0490td.f9777g));
        }
    }

    /* renamed from: b */
    public final int mo11241b(C0528uv c0528uv) {
        return m14630h(c0528uv);
    }

    /* renamed from: c */
    public final int mo11246c(C0528uv c0528uv) {
        return m14631i(c0528uv);
    }

    /* renamed from: d */
    public final int mo11251d(C0528uv c0528uv) {
        return m14632j(c0528uv);
    }

    /* renamed from: h */
    private final int m14630h(C0528uv c0528uv) {
        if (mo11268o() == 0) {
            return 0;
        }
        mo14424j();
        C0503tt c0503tt = this.f22297c;
        View b = m14622b(this.f22301s ^ 1);
        View a = m14616a(this.f22301s ^ 1);
        boolean z = this.f22301s;
        if (mo11268o() == 0 || c0528uv.mo11304a() == 0 || b == null || a == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(C0517ug.m5983c(b) - C0517ug.m5983c(a)) + 1;
        }
        return Math.min(c0503tt.mo11181g(), c0503tt.mo11169a(a) - c0503tt.mo11176d(b));
    }

    /* renamed from: i */
    private final int m14631i(C0528uv c0528uv) {
        if (mo11268o() == 0) {
            return 0;
        }
        mo14424j();
        C0503tt c0503tt = this.f22297c;
        View b = m14622b(this.f22301s ^ 1);
        View a = m14616a(this.f22301s ^ 1);
        boolean z = this.f22301s;
        boolean z2 = this.f22298d;
        if (mo11268o() == 0 || c0528uv.mo11304a() == 0 || b == null || a == null) {
            return 0;
        }
        int max;
        int min = Math.min(C0517ug.m5983c(b), C0517ug.m5983c(a));
        int max2 = Math.max(C0517ug.m5983c(b), C0517ug.m5983c(a));
        if (z2) {
            max = Math.max(0, (c0528uv.mo11304a() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        return z ? Math.round((((float) max) * (((float) Math.abs(c0503tt.mo11169a(a) - c0503tt.mo11176d(b))) / ((float) (Math.abs(C0517ug.m5983c(b) - C0517ug.m5983c(a)) + 1)))) + ((float) (c0503tt.mo11179f() - c0503tt.mo11176d(b)))) : max;
    }

    /* renamed from: j */
    private final int m14632j(C0528uv c0528uv) {
        if (mo11268o() == 0) {
            return 0;
        }
        mo14424j();
        C0503tt c0503tt = this.f22297c;
        View b = m14622b(this.f22301s ^ 1);
        View a = m14616a(this.f22301s ^ 1);
        boolean z = this.f22301s;
        if (mo11268o() == 0 || c0528uv.mo11304a() == 0 || b == null || a == null) {
            return 0;
        }
        if (z) {
            return (int) ((((float) (c0503tt.mo11169a(a) - c0503tt.mo11176d(b))) / ((float) (Math.abs(C0517ug.m5983c(b) - C0517ug.m5983c(a)) + 1))) * ((float) c0528uv.mo11304a()));
        }
        return c0528uv.mo11304a();
    }

    /* renamed from: e */
    public final int mo11255e(C0528uv c0528uv) {
        return m14630h(c0528uv);
    }

    /* renamed from: f */
    public final int mo11258f(C0528uv c0528uv) {
        return m14631i(c0528uv);
    }

    /* renamed from: g */
    public final int mo11261g(C0528uv c0528uv) {
        return m14632j(c0528uv);
    }

    /* renamed from: b */
    final int mo14423b(int i) {
        switch (i) {
            case 1:
                if (this.f22296b == 1 || !mo14425l()) {
                    return -1;
                }
                return 1;
            case 2:
                if (this.f22296b == 1) {
                    return 1;
                }
                if (mo14425l()) {
                    return -1;
                }
                return 1;
            case 17:
                return this.f22296b != 0 ? kvl.UNSET_ENUM_VALUE : -1;
            case 33:
                return this.f22296b != 1 ? kvl.UNSET_ENUM_VALUE : -1;
            case 66:
                return this.f22296b == 0 ? 1 : kvl.UNSET_ENUM_VALUE;
            case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                return this.f22296b == 1 ? 1 : kvl.UNSET_ENUM_VALUE;
            default:
                return kvl.UNSET_ENUM_VALUE;
        }
    }

    /* renamed from: j */
    final void mo14424j() {
        if (this.f22295a == null) {
            this.f22295a = new C0490td();
        }
    }

    /* renamed from: a */
    private final int m14614a(C0524up c0524up, C0490td c0490td, C0528uv c0528uv, boolean z) {
        int i = c0490td.f9773c;
        int i2 = c0490td.f9777g;
        if (i2 != kvl.UNSET_ENUM_VALUE) {
            if (i < 0) {
                c0490td.f9777g = i2 + i;
            }
            m14620a(c0524up, c0490td);
        }
        i2 = c0490td.f9773c + c0490td.f9778h;
        C0489tc c0489tc = this.f22305w;
        while (true) {
            if ((!c0490td.f9781k && i2 <= 0) || !c0490td.mo11141a(c0528uv)) {
                break;
            }
            c0489tc.f9767a = 0;
            c0489tc.f9768b = false;
            c0489tc.f9769c = false;
            c0489tc.f9770d = false;
            mo14421a(c0524up, c0528uv, c0490td, c0489tc);
            if (!c0489tc.f9768b) {
                int i3 = c0490td.f9772b;
                int i4 = c0489tc.f9767a;
                c0490td.f9772b = i3 + (c0490td.f9776f * i4);
                if (!(c0489tc.f9769c && this.f22295a.f9780j == null && c0528uv.f9861g)) {
                    c0490td.f9773c -= i4;
                    i2 -= i4;
                }
                i3 = c0490td.f9777g;
                if (i3 != kvl.UNSET_ENUM_VALUE) {
                    c0490td.f9777g = i3 + i4;
                    i3 = c0490td.f9773c;
                    if (i3 < 0) {
                        c0490td.f9777g = i3 + c0490td.f9777g;
                    }
                    m14620a(c0524up, c0490td);
                }
                if (z && c0489tc.f9770d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - c0490td.f9773c;
    }

    /* renamed from: z */
    private final View m14634z() {
        return m14626e(0, mo11268o());
    }

    /* renamed from: d */
    private final View m14625d(C0524up c0524up, C0528uv c0528uv) {
        return mo14419a(c0524up, c0528uv, 0, mo11268o(), c0528uv.mo11304a());
    }

    /* renamed from: a */
    private final View m14616a(boolean z) {
        if (this.f22298d) {
            return m14615a(0, mo11268o(), z);
        }
        return m14615a(mo11268o() - 1, -1, z);
    }

    /* renamed from: b */
    private final View m14622b(boolean z) {
        if (this.f22298d) {
            return m14615a(mo11268o() - 1, -1, z);
        }
        return m14615a(0, mo11268o(), z);
    }

    /* renamed from: A */
    private final View m14608A() {
        return m14626e(mo11268o() - 1, -1);
    }

    /* renamed from: e */
    private final View m14627e(C0524up c0524up, C0528uv c0528uv) {
        return mo14419a(c0524up, c0528uv, mo11268o() - 1, -1, c0528uv.mo11304a());
    }

    /* renamed from: e */
    private final View m14626e(int i, int i2) {
        mo14424j();
        Object obj = i2 > i ? 1 : i2 < i ? -1 : null;
        if (obj == null) {
            return mo11256e(i);
        }
        int i3;
        int d = this.f22297c.mo11176d(mo11256e(i));
        int f = this.f22297c.mo11179f();
        int i4 = d < f ? 16388 : FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
        if (d < f) {
            i3 = 16644;
        } else {
            i3 = 4161;
        }
        if (this.f22296b == 0) {
            return this.f9818h.mo11406a(i, i2, i3, i4);
        }
        return this.f9819i.mo11406a(i, i2, i3, i4);
    }

    /* renamed from: a */
    private final View m14615a(int i, int i2, boolean z) {
        mo14424j();
        int i3 = !z ? DepthmapTask.DEPTH_PROCESSING_LR_MAX_SIZE_PX : 24579;
        if (this.f22296b == 0) {
            return this.f9818h.mo11406a(i, i2, i3, DepthmapTask.DEPTH_PROCESSING_LR_MAX_SIZE_PX);
        }
        return this.f9819i.mo11406a(i, i2, i3, DepthmapTask.DEPTH_PROCESSING_LR_MAX_SIZE_PX);
    }

    /* renamed from: a */
    View mo14419a(C0524up c0524up, C0528uv c0528uv, int i, int i2, int i3) {
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
                view3 = view;
                e = view2;
            } else if (c >= i3) {
                view3 = view;
                e = view2;
            } else if (((C0519uk) e.getLayoutParams()).f9832c.mo11326j()) {
                if (view2 == null) {
                    view3 = view;
                } else {
                    view3 = view;
                    e = view2;
                }
            } else if (this.f22297c.mo11176d(e) < b && this.f22297c.mo11169a(e) >= f) {
                return e;
            } else {
                if (view != null) {
                    view3 = view;
                    e = view2;
                } else {
                    view3 = e;
                    e = view2;
                }
            }
            i += i4;
            view = view3;
            view2 = e;
        }
        return view != null ? view : view2;
    }

    /* renamed from: c */
    public final View mo11247c(int i) {
        int o = mo11268o();
        if (o == 0) {
            return null;
        }
        int c = i - C0517ug.m5983c(mo11256e(0));
        if (c >= 0 && c < o) {
            View e = mo11256e(c);
            if (C0517ug.m5983c(e) == i) {
                return e;
            }
        }
        return super.mo11247c(i);
    }

    /* renamed from: a */
    private final int m14613a(int i, C0524up c0524up, C0528uv c0528uv, boolean z) {
        int b = this.f22297c.mo11171b() - i;
        if (b <= 0) {
            return 0;
        }
        b = -m14624c(-b, c0524up, c0528uv);
        int i2 = i + b;
        if (!z) {
            return b;
        }
        i2 = this.f22297c.mo11171b() - i2;
        if (i2 <= 0) {
            return b;
        }
        this.f22297c.mo11170a(i2);
        return b + i2;
    }

    /* renamed from: b */
    private final int m14621b(int i, C0524up c0524up, C0528uv c0528uv, boolean z) {
        int f = i - this.f22297c.mo11179f();
        if (f <= 0) {
            return 0;
        }
        f = -m14624c(f, c0524up, c0528uv);
        int i2 = i + f;
        if (!z) {
            return f;
        }
        i2 -= this.f22297c.mo11179f();
        if (i2 <= 0) {
            return f;
        }
        this.f22297c.mo11170a(-i2);
        return f - i2;
    }

    /* renamed from: a */
    public C0519uk mo11218a() {
        return new C0519uk(-2, -2);
    }

    /* renamed from: B */
    private final View m14609B() {
        return mo11256e(!this.f22298d ? mo11268o() - 1 : 0);
    }

    /* renamed from: C */
    private final View m14610C() {
        return mo11256e(this.f22298d ? mo11268o() - 1 : 0);
    }

    /* renamed from: k */
    private final int m14633k(C0528uv c0528uv) {
        if (c0528uv.f9855a == -1) {
            return 0;
        }
        return this.f22297c.mo11181g();
    }

    /* renamed from: k */
    public final boolean mo11265k() {
        return true;
    }

    /* renamed from: l */
    protected final boolean mo14425l() {
        if (C0315jm.m4635j(this.f9817g) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    void mo14421a(C0524up c0524up, C0528uv c0528uv, C0490td c0490td, C0489tc c0489tc) {
        View a = c0490td.mo11139a(c0524up);
        if (a == null) {
            c0489tc.f9768b = true;
            return;
        }
        int s;
        C0519uk c0519uk = (C0519uk) a.getLayoutParams();
        boolean z;
        boolean z2;
        if (c0490td.f9780j == null) {
            z = this.f22298d;
            if (c0490td.f9776f != -1) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z == z2) {
                super.mo11228a(a, -1, false);
            } else {
                super.mo11228a(a, 0, false);
            }
        } else {
            z = this.f22298d;
            if (c0490td.f9776f != -1) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z == z2) {
                super.mo11228a(a, -1, true);
            } else {
                super.mo11228a(a, 0, true);
            }
        }
        C0519uk c0519uk2 = (C0519uk) a.getLayoutParams();
        Rect d = this.f9817g.mo1142d(a);
        int i = d.left;
        int i2 = d.right;
        int i3 = d.top;
        int i4 = d.bottom;
        i = C0517ug.m5978a(this.f9826p, this.f9824n, (i + i2) + (((mo11271r() + mo11272s()) + c0519uk2.leftMargin) + c0519uk2.rightMargin), c0519uk2.width, mo11263h());
        i4 = C0517ug.m5978a(this.f9827q, this.f9825o, (i4 + i3) + (((mo11273t() + mo11270q()) + c0519uk2.topMargin) + c0519uk2.bottomMargin), c0519uk2.height, mo11264i());
        if (mo11237a(a, i, i4, c0519uk2)) {
            a.measure(i, i4);
        }
        c0489tc.f9767a = this.f22297c.mo11172b(a);
        if (this.f22296b == 1) {
            if (mo14425l()) {
                s = this.f9826p - mo11272s();
                i4 = s - this.f22297c.mo11174c(a);
            } else {
                i4 = mo11271r();
                s = this.f22297c.mo11174c(a) + i4;
            }
            if (c0490td.f9776f == -1) {
                i = c0490td.f9772b;
                i2 = i - c0489tc.f9767a;
            } else {
                i2 = c0490td.f9772b;
                i = c0489tc.f9767a + i2;
            }
        } else {
            i2 = mo11273t();
            i = i2 + this.f22297c.mo11174c(a);
            if (c0490td.f9776f == -1) {
                s = c0490td.f9772b;
                i4 = s - c0489tc.f9767a;
            } else {
                i4 = c0490td.f9772b;
                s = c0489tc.f9767a + i4;
            }
        }
        C0517ug.m5980a(a, i4, i2, s, i);
        if (c0519uk.f9832c.mo11326j() || c0519uk.f9832c.mo11329m()) {
            c0489tc.f9769c = true;
        }
        c0489tc.f9770d = a.hasFocusable();
    }

    /* renamed from: a */
    void mo14420a(C0524up c0524up, C0528uv c0528uv, C0488tb c0488tb, int i) {
    }

    /* renamed from: a */
    public View mo11217a(View view, int i, C0524up c0524up, C0528uv c0528uv) {
        m14612E();
        if (mo11268o() == 0) {
            return null;
        }
        int b = mo14423b(i);
        if (b == kvl.UNSET_ENUM_VALUE) {
            return null;
        }
        View A;
        View C;
        mo14424j();
        mo14424j();
        m14617a(b, (int) (((float) this.f22297c.mo11181g()) * 0.33333334f), false, c0528uv);
        C0490td c0490td = this.f22295a;
        c0490td.f9777g = kvl.UNSET_ENUM_VALUE;
        c0490td.f9771a = false;
        m14614a(c0524up, c0490td, c0528uv, true);
        if (b == -1) {
            if (this.f22298d) {
                A = m14608A();
            } else {
                A = m14634z();
            }
        } else if (this.f22298d) {
            A = m14634z();
        } else {
            A = m14608A();
        }
        if (b == -1) {
            C = m14610C();
        } else {
            C = m14609B();
        }
        if (!C.hasFocusable()) {
            return A;
        }
        if (A == null) {
            return null;
        }
        return C;
    }

    /* renamed from: a */
    public final void mo11231a(AccessibilityEvent accessibilityEvent) {
        int i = -1;
        super.mo11231a(accessibilityEvent);
        if (mo11268o() > 0) {
            int c;
            View a = m14615a(0, mo11268o(), false);
            if (a != null) {
                c = C0517ug.m5983c(a);
            } else {
                c = -1;
            }
            accessibilityEvent.setFromIndex(c);
            a = m14615a(mo11268o() - 1, -1, false);
            if (a != null) {
                i = C0517ug.m5983c(a);
            }
            accessibilityEvent.setToIndex(i);
        }
    }

    /* renamed from: c */
    public void mo11250c(C0524up c0524up, C0528uv c0528uv) {
        if (!(this.f22299e == null && this.f22302t == -1) && c0528uv.mo11304a() == 0) {
            mo11233a(c0524up);
            return;
        }
        int i;
        View p;
        int i2;
        C0490td c0490td;
        C0491te c0491te = this.f22299e;
        if (c0491te != null && c0491te.mo11142a()) {
            this.f22302t = this.f22299e.f9782a;
        }
        mo14424j();
        this.f22295a.f9771a = false;
        m14612E();
        View p2 = mo11269p();
        C0488tb c0488tb = this.f22304v;
        if (!c0488tb.f9766e || this.f22302t != -1 || this.f22299e != null) {
            Object obj;
            c0488tb.mo11136b();
            c0488tb = this.f22304v;
            c0488tb.f9765d = this.f22298d;
            if (c0528uv.f9861g) {
                obj = null;
            } else {
                i = this.f22302t;
                if (i == -1) {
                    obj = null;
                } else if (i < 0 || i >= c0528uv.mo11304a()) {
                    this.f22302t = -1;
                    this.f22303u = kvl.UNSET_ENUM_VALUE;
                    obj = null;
                } else {
                    c0488tb.f9763b = this.f22302t;
                    c0491te = this.f22299e;
                    boolean z;
                    if (c0491te != null && c0491te.mo11142a()) {
                        c0488tb.f9765d = this.f22299e.f9784c;
                        if (c0488tb.f9765d) {
                            c0488tb.f9764c = this.f22297c.mo11171b() - this.f22299e.f9783b;
                            obj = 1;
                        } else {
                            c0488tb.f9764c = this.f22297c.mo11179f() + this.f22299e.f9783b;
                            obj = 1;
                        }
                    } else if (this.f22303u == kvl.UNSET_ENUM_VALUE) {
                        p2 = mo11247c(this.f22302t);
                        if (p2 == null) {
                            if (mo11268o() > 0) {
                                if (this.f22302t >= C0517ug.m5983c(mo11256e(0))) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z == this.f22298d) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                c0488tb.f9765d = z;
                            }
                            c0488tb.mo11134a();
                            obj = 1;
                        } else if (this.f22297c.mo11172b(p2) > this.f22297c.mo11181g()) {
                            c0488tb.mo11134a();
                            obj = 1;
                        } else if (this.f22297c.mo11176d(p2) - this.f22297c.mo11179f() < 0) {
                            c0488tb.f9764c = this.f22297c.mo11179f();
                            c0488tb.f9765d = false;
                            obj = 1;
                        } else if (this.f22297c.mo11171b() - this.f22297c.mo11169a(p2) < 0) {
                            c0488tb.f9764c = this.f22297c.mo11171b();
                            c0488tb.f9765d = true;
                            obj = 1;
                        } else {
                            if (c0488tb.f9765d) {
                                i = this.f22297c.mo11169a(p2) + this.f22297c.mo11182h();
                            } else {
                                i = this.f22297c.mo11176d(p2);
                            }
                            c0488tb.f9764c = i;
                            obj = 1;
                        }
                    } else {
                        z = this.f22298d;
                        c0488tb.f9765d = z;
                        if (z) {
                            c0488tb.f9764c = this.f22297c.mo11171b() - this.f22303u;
                            obj = 1;
                        } else {
                            c0488tb.f9764c = this.f22297c.mo11179f() + this.f22303u;
                            obj = 1;
                        }
                    }
                }
            }
            if (obj == null) {
                if (mo11268o() != 0) {
                    p = mo11269p();
                    if (p != null) {
                        C0519uk c0519uk = (C0519uk) p.getLayoutParams();
                        if (c0519uk.f9832c.mo11326j()) {
                            obj = null;
                        } else if (c0519uk.f9832c.mo11322f() < 0) {
                            obj = null;
                        } else if (c0519uk.f9832c.mo11322f() < c0528uv.mo11304a()) {
                            obj = 1;
                        } else {
                            obj = null;
                        }
                        if (obj != null) {
                            c0488tb.mo11137b(p, C0517ug.m5983c(p));
                            obj = 1;
                        }
                    }
                    if (c0488tb.f9765d) {
                        if (this.f22298d) {
                            p2 = m14625d(c0524up, c0528uv);
                        } else {
                            p2 = m14627e(c0524up, c0528uv);
                        }
                    } else if (this.f22298d) {
                        p2 = m14627e(c0524up, c0528uv);
                    } else {
                        p2 = m14625d(c0524up, c0528uv);
                    }
                    if (p2 != null) {
                        c0488tb.mo11135a(p2, C0517ug.m5983c(p2));
                        if (c0528uv.f9861g) {
                            obj = 1;
                        } else if (mo11262g()) {
                            if (this.f22297c.mo11176d(p2) >= this.f22297c.mo11171b()) {
                                obj = 1;
                            } else if (this.f22297c.mo11169a(p2) >= this.f22297c.mo11179f()) {
                                obj = null;
                            } else {
                                obj = 1;
                            }
                            if (obj != null) {
                                if (c0488tb.f9765d) {
                                    i = this.f22297c.mo11171b();
                                } else {
                                    i = this.f22297c.mo11179f();
                                }
                                c0488tb.f9764c = i;
                                obj = 1;
                            } else {
                                obj = 1;
                            }
                        } else {
                            obj = 1;
                        }
                    } else {
                        obj = null;
                    }
                } else {
                    obj = null;
                }
                if (obj == null) {
                    c0488tb.mo11134a();
                    c0488tb.f9763b = 0;
                }
            }
            this.f22304v.f9766e = true;
        } else if (p2 != null && (this.f22297c.mo11176d(p2) >= this.f22297c.mo11171b() || this.f22297c.mo11169a(p2) <= this.f22297c.mo11179f())) {
            this.f22304v.mo11137b(p2, C0517ug.m5983c(p2));
        }
        i = m14633k(c0528uv);
        int i3 = this.f22295a.f9779i;
        if (i3 >= 0) {
            i2 = i;
        } else {
            i2 = 0;
        }
        if (i3 >= 0) {
            i = 0;
        }
        int f = this.f22297c.mo11179f() + i;
        i = this.f22297c.mo11173c() + i2;
        if (c0528uv.f9861g) {
            i2 = this.f22302t;
            if (!(i2 == -1 || this.f22303u == kvl.UNSET_ENUM_VALUE)) {
                p = mo11247c(i2);
                if (p != null) {
                    if (this.f22298d) {
                        i2 = (this.f22297c.mo11171b() - this.f22297c.mo11169a(p)) - this.f22303u;
                    } else {
                        i2 = this.f22303u - (this.f22297c.mo11176d(p) - this.f22297c.mo11179f());
                    }
                    if (i2 <= 0) {
                        i -= i2;
                    } else {
                        f += i2;
                    }
                }
            }
        }
        C0488tb c0488tb2 = this.f22304v;
        if (c0488tb2.f9765d) {
            if (this.f22298d) {
                i2 = 1;
            } else {
                i2 = -1;
            }
        } else if (this.f22298d) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        mo14420a(c0524up, c0528uv, c0488tb2, i2);
        for (i2 = mo11268o() - 1; i2 >= 0; i2--) {
            View e = mo11256e(i2);
            C0530ux c = RecyclerView.m453c(e);
            if (!c.mo11332p()) {
                if (!c.mo11324h() || c.mo11326j() || this.f9817g.f710j.f9804b) {
                    mo11253d(i2);
                    c0524up.mo11299c(e);
                    this.f9817g.f707g.mo11479c(c);
                } else {
                    mo11260f(i2);
                    c0524up.mo11292a(c);
                }
            }
        }
        this.f22295a.f9781k = m14611D();
        C0488tb c0488tb3 = this.f22304v;
        C0490td c0490td2;
        if (c0488tb3.f9765d) {
            m14623b(c0488tb3);
            c0490td2 = this.f22295a;
            c0490td2.f9778h = f;
            m14614a(c0524up, c0490td2, c0528uv, false);
            c0490td2 = this.f22295a;
            f = c0490td2.f9772b;
            i3 = c0490td2.f9774d;
            i2 = c0490td2.f9773c;
            if (i2 > 0) {
                i += i2;
            }
            m14618a(this.f22304v);
            c0490td2 = this.f22295a;
            c0490td2.f9778h = i;
            c0490td2.f9774d += c0490td2.f9775e;
            m14614a(c0524up, c0490td2, c0528uv, false);
            c0490td2 = this.f22295a;
            i = c0490td2.f9772b;
            i2 = c0490td2.f9773c;
            if (i2 > 0) {
                m14629g(i3, f);
                C0490td c0490td3 = this.f22295a;
                c0490td3.f9778h = i2;
                m14614a(c0524up, c0490td3, c0528uv, false);
                f = this.f22295a.f9772b;
            }
        } else {
            m14618a(c0488tb3);
            c0490td2 = this.f22295a;
            c0490td2.f9778h = i;
            m14614a(c0524up, c0490td2, c0528uv, false);
            c0490td2 = this.f22295a;
            i = c0490td2.f9772b;
            i3 = c0490td2.f9774d;
            i2 = c0490td2.f9773c;
            if (i2 > 0) {
                f += i2;
            }
            m14623b(this.f22304v);
            c0490td2 = this.f22295a;
            c0490td2.f9778h = f;
            c0490td2.f9774d += c0490td2.f9775e;
            m14614a(c0524up, c0490td2, c0528uv, false);
            c0490td2 = this.f22295a;
            f = c0490td2.f9772b;
            i2 = c0490td2.f9773c;
            if (i2 > 0) {
                m14628f(i3, i);
                c0490td = this.f22295a;
                c0490td.f9778h = i2;
                m14614a(c0524up, c0490td, c0528uv, false);
                i = this.f22295a.f9772b;
            }
        }
        if (mo11268o() <= 0) {
            i2 = f;
            f = i;
        } else if (this.f22298d) {
            i2 = m14613a(i, c0524up, c0528uv, true);
            f += i2;
            i3 = m14621b(f, c0524up, c0528uv, false);
            i2 = f + i3;
            f = (i + i2) + i3;
        } else {
            i2 = m14621b(f, c0524up, c0528uv, true);
            i += i2;
            i3 = m14613a(i, c0524up, c0528uv, false);
            i2 = (f + i2) + i3;
            f = i + i3;
        }
        if (c0528uv.f9865k && mo11268o() != 0 && !c0528uv.f9861g && mo11262g()) {
            List list = c0524up.f9845d;
            int size = list.size();
            int c2 = C0517ug.m5983c(mo11256e(0));
            int i4 = 0;
            i3 = 0;
            int i5 = 0;
            while (i5 < size) {
                C0530ux c0530ux = (C0530ux) list.get(i5);
                if (c0530ux.mo11326j()) {
                    i = i3;
                    i3 = i4;
                } else {
                    boolean z2;
                    int i6;
                    if (c0530ux.mo11322f() >= c2) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2 != this.f22298d) {
                        i6 = -1;
                    } else {
                        i6 = 1;
                    }
                    if (i6 == -1) {
                        int i7 = i3;
                        i3 = this.f22297c.mo11172b(c0530ux.f9877a) + i4;
                        i = i7;
                    } else {
                        i = this.f22297c.mo11172b(c0530ux.f9877a) + i3;
                        i3 = i4;
                    }
                }
                i5++;
                i4 = i3;
                i3 = i;
            }
            this.f22295a.f9780j = list;
            if (i4 > 0) {
                m14629g(C0517ug.m5983c(m14610C()), i2);
                c0490td = this.f22295a;
                c0490td.f9778h = i4;
                c0490td.f9773c = 0;
                c0490td.mo11140a(null);
                m14614a(c0524up, this.f22295a, c0528uv, false);
            }
            if (i3 > 0) {
                m14628f(C0517ug.m5983c(m14609B()), f);
                c0490td = this.f22295a;
                c0490td.f9778h = i3;
                c0490td.f9773c = 0;
                c0490td.mo11140a(null);
                m14614a(c0524up, this.f22295a, c0528uv, false);
            }
            this.f22295a.f9780j = null;
        }
        if (c0528uv.f9861g) {
            this.f22304v.mo11136b();
            return;
        }
        C0503tt c0503tt = this.f22297c;
        c0503tt.f9799b = c0503tt.mo11181g();
    }

    /* renamed from: a */
    public void mo11235a(C0528uv c0528uv) {
        super.mo11235a(c0528uv);
        this.f22299e = null;
        this.f22302t = -1;
        this.f22303u = kvl.UNSET_ENUM_VALUE;
        this.f22304v.mo11136b();
    }

    /* renamed from: a */
    public final void mo11226a(Parcelable parcelable) {
        if (parcelable instanceof C0491te) {
            this.f22299e = (C0491te) parcelable;
            mo11278y();
        }
    }

    /* renamed from: m */
    public final Parcelable mo11266m() {
        C0491te c0491te = this.f22299e;
        if (c0491te != null) {
            return new C0491te(c0491te);
        }
        Parcelable c0491te2 = new C0491te();
        if (mo11268o() > 0) {
            mo14424j();
            boolean z = this.f22298d;
            c0491te2.f9784c = z;
            View B;
            if (z) {
                B = m14609B();
                c0491te2.f9783b = this.f22297c.mo11171b() - this.f22297c.mo11169a(B);
                c0491te2.f9782a = C0517ug.m5983c(B);
                return c0491te2;
            }
            B = m14610C();
            c0491te2.f9782a = C0517ug.m5983c(B);
            c0491te2.f9783b = this.f22297c.mo11176d(B) - this.f22297c.mo11179f();
            return c0491te2;
        }
        c0491te2.f9782a = -1;
        return c0491te2;
    }

    /* renamed from: a */
    private final void m14620a(C0524up c0524up, C0490td c0490td) {
        if (c0490td.f9771a && !c0490td.f9781k) {
            int i;
            int o;
            int a;
            View e;
            int i2;
            if (c0490td.f9776f == -1) {
                i = c0490td.f9777g;
                o = mo11268o();
                if (i >= 0) {
                    a = this.f22297c.mo11168a() - i;
                    if (this.f22298d) {
                        for (i = 0; i < o; i++) {
                            e = mo11256e(i);
                            if (this.f22297c.mo11176d(e) < a || this.f22297c.mo11180f(e) < a) {
                                m14619a(c0524up, 0, i);
                                return;
                            }
                        }
                        return;
                    }
                    i2 = o - 1;
                    for (i = i2; i >= 0; i--) {
                        View e2 = mo11256e(i);
                        if (this.f22297c.mo11176d(e2) < a || this.f22297c.mo11180f(e2) < a) {
                            m14619a(c0524up, i2, i);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            o = c0490td.f9777g;
            if (o >= 0) {
                a = mo11268o();
                if (this.f22298d) {
                    i2 = a - 1;
                    for (i = i2; i >= 0; i--) {
                        View e3 = mo11256e(i);
                        if (this.f22297c.mo11169a(e3) > o || this.f22297c.mo11178e(e3) > o) {
                            m14619a(c0524up, i2, i);
                            return;
                        }
                    }
                    return;
                }
                for (i = 0; i < a; i++) {
                    e = mo11256e(i);
                    if (this.f22297c.mo11169a(e) > o || this.f22297c.mo11178e(e) > o) {
                        m14619a(c0524up, 0, i);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final void m14619a(C0524up c0524up, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    mo11224a(i3, c0524up);
                }
                return;
            }
            while (i > i2) {
                mo11224a(i, c0524up);
                i--;
            }
        }
    }

    /* renamed from: D */
    private final boolean m14611D() {
        return this.f22297c.mo11175d() == 0 && this.f22297c.mo11168a() == 0;
    }

    /* renamed from: E */
    private final void m14612E() {
        if (this.f22296b == 1 || !mo14425l()) {
            this.f22298d = false;
        } else {
            this.f22298d = true;
        }
    }

    /* renamed from: c */
    private final int m14624c(int i, C0524up c0524up, C0528uv c0528uv) {
        if (mo11268o() == 0 || i == 0) {
            return 0;
        }
        int i2;
        this.f22295a.f9771a = true;
        mo14424j();
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int abs = Math.abs(i);
        m14617a(i2, abs, true, c0528uv);
        C0490td c0490td = this.f22295a;
        int a = m14614a(c0524up, c0490td, c0528uv, false) + c0490td.f9777g;
        if (a < 0) {
            return 0;
        }
        if (abs > a) {
            i = i2 * a;
        }
        this.f22297c.mo11170a(-i);
        this.f22295a.f9779i = i;
        return i;
    }

    /* renamed from: a */
    public int mo11215a(int i, C0524up c0524up, C0528uv c0528uv) {
        if (this.f22296b == 1) {
            return 0;
        }
        return m14624c(i, c0524up, c0528uv);
    }

    /* renamed from: b */
    public int mo11239b(int i, C0524up c0524up, C0528uv c0528uv) {
        if (this.f22296b == 0) {
            return 0;
        }
        return m14624c(i, c0524up, c0528uv);
    }

    /* renamed from: n */
    final boolean mo11267n() {
        if (!(this.f9825o == 1073741824 || this.f9824n == 1073741824)) {
            boolean z;
            int o = mo11268o();
            for (int i = 0; i < o; i++) {
                LayoutParams layoutParams = mo11256e(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo11262g() {
        return this.f22299e == null;
    }

    /* renamed from: a */
    private final void m14617a(int i, int i2, boolean z, C0528uv c0528uv) {
        C0490td c0490td;
        int i3 = -1;
        int i4 = 1;
        this.f22295a.f9781k = m14611D();
        this.f22295a.f9778h = m14633k(c0528uv);
        C0490td c0490td2 = this.f22295a;
        c0490td2.f9776f = i;
        View B;
        C0490td c0490td3;
        if (i == 1) {
            c0490td2.f9778h += this.f22297c.mo11173c();
            B = m14609B();
            c0490td3 = this.f22295a;
            if (this.f22298d) {
                i4 = -1;
            }
            c0490td3.f9775e = i4;
            i4 = C0517ug.m5983c(B);
            c0490td = this.f22295a;
            c0490td3.f9774d = i4 + c0490td.f9775e;
            c0490td.f9772b = this.f22297c.mo11169a(B);
            i4 = this.f22297c.mo11169a(B) - this.f22297c.mo11171b();
        } else {
            B = m14610C();
            c0490td3 = this.f22295a;
            c0490td3.f9778h += this.f22297c.mo11179f();
            c0490td3 = this.f22295a;
            if (this.f22298d) {
                i3 = 1;
            }
            c0490td3.f9775e = i3;
            i4 = C0517ug.m5983c(B);
            c0490td = this.f22295a;
            c0490td3.f9774d = i4 + c0490td.f9775e;
            c0490td.f9772b = this.f22297c.mo11176d(B);
            i4 = (-this.f22297c.mo11176d(B)) + this.f22297c.mo11179f();
        }
        c0490td = this.f22295a;
        c0490td.f9773c = i2;
        if (z) {
            c0490td.f9773c -= i4;
        }
        c0490td.f9777g = i4;
    }

    /* renamed from: f */
    private final void m14628f(int i, int i2) {
        int i3;
        this.f22295a.f9773c = this.f22297c.mo11171b() - i2;
        C0490td c0490td = this.f22295a;
        if (this.f22298d) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        c0490td.f9775e = i3;
        c0490td.f9774d = i;
        c0490td.f9776f = 1;
        c0490td.f9772b = i2;
        c0490td.f9777g = kvl.UNSET_ENUM_VALUE;
    }

    /* renamed from: a */
    private final void m14618a(C0488tb c0488tb) {
        m14628f(c0488tb.f9763b, c0488tb.f9764c);
    }

    /* renamed from: g */
    private final void m14629g(int i, int i2) {
        int i3;
        this.f22295a.f9773c = i2 - this.f22297c.mo11179f();
        C0490td c0490td = this.f22295a;
        c0490td.f9774d = i;
        if (this.f22298d) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        c0490td.f9775e = i3;
        c0490td.f9776f = -1;
        c0490td.f9772b = i2;
        c0490td.f9777g = kvl.UNSET_ENUM_VALUE;
    }

    /* renamed from: b */
    private final void m14623b(C0488tb c0488tb) {
        m14629g(c0488tb.f9763b, c0488tb.f9764c);
    }
}
