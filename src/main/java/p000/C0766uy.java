package p000;

import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;

/* compiled from: PG */
/* renamed from: uy */
public final class C0766uy extends C0306jd {
    /* renamed from: c */
    public final RecyclerView f22343c;
    /* renamed from: d */
    public final C0306jd f22344d = new C0767uz(this);

    public C0766uy(RecyclerView recyclerView) {
        this.f22343c = recyclerView;
    }

    /* renamed from: a */
    public final void mo9324a(View view, AccessibilityEvent accessibilityEvent) {
        super.mo9324a(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if ((view instanceof RecyclerView) && !this.f22343c.mo1164j()) {
            C0517ug c0517ug = ((RecyclerView) view).f711k;
            if (c0517ug != null) {
                c0517ug.mo11231a(accessibilityEvent);
            }
        }
    }

    /* renamed from: a */
    public final void mo9325a(View view, C0334kk c0334kk) {
        super.mo9325a(view, c0334kk);
        c0334kk.mo10082a(RecyclerView.class.getName());
        if (!this.f22343c.mo1164j()) {
            C0517ug c0517ug = this.f22343c.f711k;
            if (c0517ug != null) {
                RecyclerView recyclerView = c0517ug.f9817g;
                C0524up c0524up = recyclerView.f704d;
                C0528uv c0528uv = recyclerView.f662A;
                if (recyclerView.canScrollVertically(-1) || c0517ug.f9817g.canScrollHorizontally(-1)) {
                    c0334kk.mo10079a(8192);
                    c0334kk.mo10089d(true);
                }
                if (c0517ug.f9817g.canScrollVertically(1) || c0517ug.f9817g.canScrollHorizontally(1)) {
                    c0334kk.mo10079a(4096);
                    c0334kk.mo10089d(true);
                }
                c0334kk.f8693a.setCollectionInfo((CollectionInfo) new C0336km(CollectionInfo.obtain(c0517ug.mo11240b(c0524up, c0528uv), c0517ug.mo11216a(c0524up, c0528uv), false, 0)).f8697a);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo9326a(View view, int i, Bundle bundle) {
        if (super.mo9326a(view, i, bundle)) {
            return true;
        }
        if (this.f22343c.mo1164j()) {
            return false;
        }
        C0517ug c0517ug = this.f22343c.f711k;
        if (c0517ug == null) {
            return false;
        }
        RecyclerView recyclerView = c0517ug.f9817g;
        C0524up c0524up = recyclerView.f704d;
        C0528uv c0528uv = recyclerView.f662A;
        if (recyclerView == null) {
            return false;
        }
        int t;
        int i2;
        switch (i) {
            case 4096:
                if (recyclerView.canScrollVertically(1)) {
                    t = (c0517ug.f9827q - c0517ug.mo11273t()) - c0517ug.mo11270q();
                } else {
                    t = 0;
                }
                if (!c0517ug.f9817g.canScrollHorizontally(1)) {
                    i2 = t;
                    t = 0;
                    break;
                }
                i2 = t;
                t = (c0517ug.f9826p - c0517ug.mo11271r()) - c0517ug.mo11272s();
                break;
            case 8192:
                if (recyclerView.canScrollVertically(-1)) {
                    t = -((c0517ug.f9827q - c0517ug.mo11273t()) - c0517ug.mo11270q());
                } else {
                    t = 0;
                }
                if (!c0517ug.f9817g.canScrollHorizontally(-1)) {
                    i2 = t;
                    t = 0;
                    break;
                }
                i2 = t;
                t = -((c0517ug.f9826p - c0517ug.mo11271r()) - c0517ug.mo11272s());
                break;
            default:
                t = 0;
                i2 = 0;
                break;
        }
        if (i2 == 0 && t == 0) {
            return false;
        }
        c0517ug.f9817g.mo1133c(t, i2);
        return true;
    }
}
