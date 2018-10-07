package p000;

import android.graphics.Rect;
import android.support.p001v4.view.ViewPager;
import android.view.View;

/* compiled from: PG */
/* renamed from: js */
public final class C0697js implements C0313jk {
    /* renamed from: a */
    private final Rect f21689a = new Rect();
    /* renamed from: b */
    private final /* synthetic */ ViewPager f21690b;

    public C0697js(ViewPager viewPager) {
        this.f21690b = viewPager;
    }

    /* renamed from: a */
    public final C0333kj mo9476a(View view, C0333kj c0333kj) {
        C0333kj b = C0315jm.m4623b(view, c0333kj);
        if (b.mo10076e()) {
            return b;
        }
        Rect rect = this.f21689a;
        rect.left = b.mo10073b();
        rect.top = b.mo10075d();
        rect.right = b.mo10074c();
        rect.bottom = b.mo10071a();
        int childCount = this.f21690b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C0333kj a = C0315jm.m4607a(this.f21690b.getChildAt(i), b);
            rect.left = Math.min(a.mo10073b(), rect.left);
            rect.top = Math.min(a.mo10075d(), rect.top);
            rect.right = Math.min(a.mo10074c(), rect.right);
            rect.bottom = Math.min(a.mo10071a(), rect.bottom);
        }
        return b.mo10072a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
