package p000;

import android.graphics.Rect;
import android.support.p002v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* renamed from: tt */
public class C0503tt {
    /* renamed from: a */
    public final C0517ug f9798a;
    /* renamed from: b */
    public int f9799b;
    /* renamed from: c */
    public final Rect f9800c;

    private C0503tt(C0517ug c0517ug) {
        this.f9799b = kvl.UNSET_ENUM_VALUE;
        this.f9800c = new Rect();
        this.f9798a = c0517ug;
    }

    /* renamed from: a */
    public int mo11169a(View view) {
        C0519uk c0519uk = (C0519uk) view.getLayoutParams();
        return c0519uk.bottomMargin + C0517ug.m5979a(view);
    }

    /* renamed from: b */
    public int mo11172b(View view) {
        C0519uk c0519uk = (C0519uk) view.getLayoutParams();
        Rect rect = ((C0519uk) view.getLayoutParams()).f9833d;
        return c0519uk.bottomMargin + ((rect.bottom + (view.getMeasuredHeight() + rect.top)) + c0519uk.topMargin);
    }

    /* renamed from: c */
    public int mo11174c(View view) {
        C0519uk c0519uk = (C0519uk) view.getLayoutParams();
        Rect rect = ((C0519uk) view.getLayoutParams()).f9833d;
        return c0519uk.rightMargin + ((rect.right + (view.getMeasuredWidth() + rect.left)) + c0519uk.leftMargin);
    }

    /* renamed from: d */
    public int mo11176d(View view) {
        return C0517ug.m5981b(view) - ((C0519uk) view.getLayoutParams()).topMargin;
    }

    /* renamed from: a */
    public int mo11168a() {
        return this.f9798a.f9827q;
    }

    /* renamed from: b */
    public int mo11171b() {
        return this.f9798a.f9827q - this.f9798a.mo11270q();
    }

    /* renamed from: c */
    public int mo11173c() {
        return this.f9798a.mo11270q();
    }

    /* renamed from: d */
    public int mo11175d() {
        return this.f9798a.f9825o;
    }

    /* renamed from: e */
    public int mo11177e() {
        return this.f9798a.f9824n;
    }

    /* renamed from: f */
    public int mo11179f() {
        return this.f9798a.mo11273t();
    }

    /* renamed from: g */
    public int mo11181g() {
        return (this.f9798a.f9827q - this.f9798a.mo11273t()) - this.f9798a.mo11270q();
    }

    /* renamed from: h */
    public final int mo11182h() {
        return this.f9799b != kvl.UNSET_ENUM_VALUE ? mo11181g() - this.f9799b : 0;
    }

    /* renamed from: e */
    public int mo11178e(View view) {
        this.f9798a.mo11229a(view, this.f9800c);
        return this.f9800c.bottom;
    }

    /* renamed from: f */
    public int mo11180f(View view) {
        this.f9798a.mo11229a(view, this.f9800c);
        return this.f9800c.top;
    }

    /* renamed from: a */
    public void mo11170a(int i) {
        RecyclerView recyclerView = this.f9798a.f9817g;
        if (recyclerView != null) {
            int a = recyclerView.f706f.mo11027a();
            for (int i2 = 0; i2 < a; i2++) {
                recyclerView.f706f.mo11034b(i2).offsetTopAndBottom(i);
            }
        }
    }

    C0503tt(C0517ug c0517ug, char c) {
        this(c0517ug);
    }
}
