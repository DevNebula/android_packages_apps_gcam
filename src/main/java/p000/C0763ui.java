package p000;

import android.view.View;

/* compiled from: PG */
/* renamed from: ui */
final class C0763ui implements C0547vv {
    /* renamed from: a */
    private final /* synthetic */ C0517ug f22340a;

    C0763ui(C0517ug c0517ug) {
        this.f22340a = c0517ug;
    }

    /* renamed from: a */
    public final View mo11413a(int i) {
        return this.f22340a.mo11256e(i);
    }

    /* renamed from: a */
    public final int mo11412a(View view) {
        C0519uk c0519uk = (C0519uk) view.getLayoutParams();
        return c0519uk.bottomMargin + C0517ug.m5979a(view);
    }

    /* renamed from: b */
    public final int mo11415b(View view) {
        return C0517ug.m5981b(view) - ((C0519uk) view.getLayoutParams()).topMargin;
    }

    /* renamed from: a */
    public final int mo11411a() {
        C0517ug c0517ug = this.f22340a;
        return c0517ug.f9827q - c0517ug.mo11270q();
    }

    /* renamed from: b */
    public final int mo11414b() {
        return this.f22340a.mo11273t();
    }
}
