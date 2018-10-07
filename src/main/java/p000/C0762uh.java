package p000;

import android.view.View;

/* compiled from: PG */
/* renamed from: uh */
final class C0762uh implements C0547vv {
    /* renamed from: a */
    private final /* synthetic */ C0517ug f22339a;

    C0762uh(C0517ug c0517ug) {
        this.f22339a = c0517ug;
    }

    /* renamed from: a */
    public final View mo11413a(int i) {
        return this.f22339a.mo11256e(i);
    }

    /* renamed from: a */
    public final int mo11412a(View view) {
        return ((C0519uk) view.getLayoutParams()).rightMargin + (((C0519uk) view.getLayoutParams()).f9833d.right + view.getRight());
    }

    /* renamed from: b */
    public final int mo11415b(View view) {
        return (view.getLeft() - ((C0519uk) view.getLayoutParams()).f9833d.left) - ((C0519uk) view.getLayoutParams()).leftMargin;
    }

    /* renamed from: a */
    public final int mo11411a() {
        C0517ug c0517ug = this.f22339a;
        return c0517ug.f9826p - c0517ug.mo11272s();
    }

    /* renamed from: b */
    public final int mo11414b() {
        return this.f22339a.mo11271r();
    }
}
