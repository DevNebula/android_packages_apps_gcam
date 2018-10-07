package p000;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

/* compiled from: PG */
/* renamed from: tl */
final class C0497tl implements OnScrollListener {
    /* renamed from: a */
    private final /* synthetic */ C0760tg f9789a;

    C0497tl(C0760tg c0760tg) {
        this.f9789a = c0760tg;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1 && !this.f9789a.mo14434h() && this.f9789a.f22326r.getContentView() != null) {
            C0760tg c0760tg = this.f9789a;
            c0760tg.f22323o.removeCallbacks(c0760tg.f22322n);
            this.f9789a.f22322n.run();
        }
    }
}
