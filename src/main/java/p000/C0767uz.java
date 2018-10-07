package p000;

import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* renamed from: uz */
public final class C0767uz extends C0306jd {
    /* renamed from: c */
    private final C0766uy f22345c;

    public C0767uz(C0766uy c0766uy) {
        this.f22345c = c0766uy;
    }

    /* renamed from: a */
    public final void mo9325a(View view, C0334kk c0334kk) {
        super.mo9325a(view, c0334kk);
        if (!this.f22345c.f22343c.mo1164j()) {
            C0517ug c0517ug = this.f22345c.f22343c.f711k;
            if (c0517ug != null) {
                c0517ug.mo11230a(view, c0334kk);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo9326a(View view, int i, Bundle bundle) {
        if (super.mo9326a(view, i, bundle)) {
            return true;
        }
        if (this.f22345c.f22343c.mo1164j()) {
            return false;
        }
        C0517ug c0517ug = this.f22345c.f22343c.f711k;
        if (c0517ug == null) {
            return false;
        }
        RecyclerView recyclerView = c0517ug.f9817g;
        C0524up c0524up = recyclerView.f704d;
        C0528uv c0528uv = recyclerView.f662A;
        return false;
    }
}
