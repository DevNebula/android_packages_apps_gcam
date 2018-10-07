package p000;

import android.view.View;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: es */
final class C0674es implements C0224fc {
    /* renamed from: a */
    private final /* synthetic */ View f17694a;
    /* renamed from: b */
    private final /* synthetic */ ArrayList f17695b;

    C0674es(View view, ArrayList arrayList) {
        this.f17694a = view;
        this.f17695b = arrayList;
    }

    /* renamed from: a */
    public final void mo6738a(C0219ex c0219ex) {
        c0219ex.mo6644b((C0224fc) this);
        this.f17694a.setVisibility(8);
        int size = this.f17695b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.f17695b.get(i)).setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo6737a() {
    }

    /* renamed from: b */
    public final void mo6739b() {
    }

    /* renamed from: c */
    public final void mo6740c() {
    }
}
