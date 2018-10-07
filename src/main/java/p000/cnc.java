package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.support.p002v7.widget.RecyclerView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: cnc */
public class cnc {
    /* renamed from: a */
    public static final String f2385a = cnc.class.getSimpleName();
    /* renamed from: b */
    public final cne f2386b;
    /* renamed from: c */
    public RecyclerView f2387c;
    /* renamed from: d */
    public cnk f2388d;
    /* renamed from: e */
    public Context f2389e;
    /* renamed from: f */
    public boolean f2390f = false;
    /* renamed from: g */
    private C0516uf f2391g;

    public cnc(cne cne) {
        this.f2386b = cne;
    }

    /* renamed from: a */
    public static int m1224a(Configuration configuration) {
        if (configuration.orientation == 1) {
            return 4;
        }
        return 6;
    }

    /* renamed from: a */
    public final void mo2401a() {
        if (this.f2390f) {
            this.f2388d.f9803a.mo11195b();
        } else {
            bli.m898e(f2385a, "NotifyDatasetChanged does nothing (BurstEditor has not been created).");
        }
    }

    /* renamed from: a */
    public final void mo2402a(int i) {
        C0516uf c0516uf = this.f2391g;
        if (c0516uf != null) {
            this.f2387c.mo1118a(c0516uf);
        }
        this.f2391g = new cnm(this.f2389e.getResources().getDimensionPixelOffset(R.dimen.burst_grid_item_margin), i, new cnd(this, i));
        RecyclerView recyclerView = this.f2387c;
        C0516uf c0516uf2 = this.f2391g;
        C0517ug c0517ug = recyclerView.f711k;
        if (c0517ug != null) {
            c0517ug.mo11232a("Cannot add item decoration during a scroll  or layout");
        }
        if (recyclerView.f713m.isEmpty()) {
            recyclerView.setWillNotDraw(false);
        }
        recyclerView.f713m.add(c0516uf2);
        recyclerView.mo1166l();
        recyclerView.requestLayout();
    }

    /* renamed from: b */
    public final cng mo2403b(int i) {
        if (this.f2390f) {
            return (cng) this.f2387c.mo1112a(i);
        }
        bli.m898e(f2385a, "viewHolderForPosition does nothing (BurstEditor has not been created).");
        return null;
    }
}
