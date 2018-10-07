package p000;

import android.os.Bundle;
import android.support.p001v4.view.ViewPager;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* renamed from: jw */
public final class C0698jw extends C0306jd {
    /* renamed from: c */
    private final /* synthetic */ ViewPager f21773c;

    public C0698jw(ViewPager viewPager) {
        this.f21773c = viewPager;
    }

    /* renamed from: a */
    private final boolean m13506a() {
        C0314jl c0314jl = this.f21773c.f590d;
        return c0314jl != null && c0314jl.getCount() > 1;
    }

    /* renamed from: a */
    public final void mo9324a(View view, AccessibilityEvent accessibilityEvent) {
        super.mo9324a(view, accessibilityEvent);
        accessibilityEvent.setClassName(ViewPager.class.getName());
        accessibilityEvent.setScrollable(m13506a());
        if (accessibilityEvent.getEventType() == 4096) {
            C0314jl c0314jl = this.f21773c.f590d;
            if (c0314jl != null) {
                accessibilityEvent.setItemCount(c0314jl.getCount());
                accessibilityEvent.setFromIndex(this.f21773c.f591e);
                accessibilityEvent.setToIndex(this.f21773c.f591e);
            }
        }
    }

    /* renamed from: a */
    public final void mo9325a(View view, C0334kk c0334kk) {
        super.mo9325a(view, c0334kk);
        c0334kk.mo10082a(ViewPager.class.getName());
        c0334kk.mo10089d(m13506a());
        if (this.f21773c.canScrollHorizontally(1)) {
            c0334kk.mo10079a(4096);
        }
        if (this.f21773c.canScrollHorizontally(-1)) {
            c0334kk.mo10079a(8192);
        }
    }

    /* renamed from: a */
    public final boolean mo9326a(View view, int i, Bundle bundle) {
        if (super.mo9326a(view, i, bundle)) {
            return true;
        }
        ViewPager viewPager;
        switch (i) {
            case 4096:
                if (!this.f21773c.canScrollHorizontally(1)) {
                    return false;
                }
                viewPager = this.f21773c;
                viewPager.mo1055a(viewPager.f591e + 1);
                return true;
            case 8192:
                if (!this.f21773c.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager = this.f21773c;
                viewPager.mo1055a(viewPager.f591e - 1);
                return true;
            default:
                return false;
        }
    }
}
