package p000;

import android.view.View;
import java.util.List;

/* compiled from: PG */
/* renamed from: lh */
final class C0710lh extends C0357lr {
    /* renamed from: a */
    public final int f22034a;
    /* renamed from: b */
    public C0354lo f22035b;
    /* renamed from: c */
    public final /* synthetic */ C0345kz f22036c;
    /* renamed from: d */
    private final Runnable f22037d = new C0350li(this);

    C0710lh(C0345kz c0345kz, int i) {
        this.f22036c = c0345kz;
        this.f22034a = i;
    }

    /* renamed from: a */
    public final int mo10632a(View view, int i) {
        if (this.f22036c.mo10575a(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = this.f22036c.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    /* renamed from: b */
    public final int mo10636b(View view, int i) {
        return view.getTop();
    }

    /* renamed from: b */
    final void mo14211b() {
        int i = 3;
        if (this.f22034a == 3) {
            i = 5;
        }
        View a = this.f22036c.mo10570a(i);
        if (a != null) {
            this.f22036c.mo10572a(a);
        }
    }

    /* renamed from: a */
    public final int mo10631a(View view) {
        return C0345kz.m5549f(view) ? view.getWidth() : 0;
    }

    /* renamed from: a */
    public final void mo10634a(int i, int i2) {
        View a;
        if ((i & 1) == 1) {
            a = this.f22036c.mo10570a(3);
        } else {
            a = this.f22036c.mo10570a(5);
        }
        if (a != null && this.f22036c.mo10578b(a) == 0) {
            this.f22035b.mo10621a(a, i2);
        }
    }

    /* renamed from: c */
    public final void mo10637c() {
        this.f22036c.postDelayed(this.f22037d, 160);
    }

    /* renamed from: c */
    public final void mo10638c(View view, int i) {
        ((C0348le) view.getLayoutParams()).f9144c = false;
        mo14211b();
    }

    /* renamed from: a */
    public final void mo10633a(int i) {
        List list;
        C0345kz c0345kz = this.f22036c;
        View view = this.f22035b.f9160j;
        int i2 = c0345kz.f9121d.f9151a;
        int i3 = c0345kz.f9122e.f9151a;
        i3 = i2 != 1 ? i3 != 1 ? i2 != 2 ? i3 != 2 ? 0 : 2 : 2 : 1 : 1;
        if (view != null && i == 0) {
            float f = ((C0348le) view.getLayoutParams()).f9143b;
            C0348le c0348le;
            if (f == 0.0f) {
                c0348le = (C0348le) view.getLayoutParams();
                if ((c0348le.f9145d & 1) == 1) {
                    c0348le.f9145d = 0;
                    list = c0345kz.f9125h;
                    if (list != null) {
                        for (i2 = list.size() - 1; i2 >= 0; i2--) {
                            ((C0347ld) c0345kz.f9125h.get(i2)).onDrawerClosed(view);
                        }
                    }
                    c0345kz.mo10574a(view, false);
                    if (c0345kz.hasWindowFocus()) {
                        View rootView = c0345kz.getRootView();
                        if (rootView != null) {
                            rootView.sendAccessibilityEvent(32);
                        }
                    }
                }
            } else if (f == 1.0f) {
                c0348le = (C0348le) view.getLayoutParams();
                if ((c0348le.f9145d & 1) == 0) {
                    c0348le.f9145d = 1;
                    list = c0345kz.f9125h;
                    if (list != null) {
                        for (i2 = list.size() - 1; i2 >= 0; i2--) {
                            ((C0347ld) c0345kz.f9125h.get(i2)).onDrawerOpened(view);
                        }
                    }
                    c0345kz.mo10574a(view, true);
                    if (c0345kz.hasWindowFocus()) {
                        c0345kz.sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i3 != c0345kz.f9123f) {
            c0345kz.f9123f = i3;
            list = c0345kz.f9125h;
            if (list != null) {
                for (i2 = list.size() - 1; i2 >= 0; i2--) {
                    ((C0347ld) c0345kz.f9125h.get(i2)).onDrawerStateChanged(i3);
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo10639d(View view, int i) {
        float f;
        int width = view.getWidth();
        if (this.f22036c.mo10575a(view, 3)) {
            f = ((float) (width + i)) / ((float) width);
        } else {
            f = ((float) (this.f22036c.getWidth() - i)) / ((float) width);
        }
        this.f22036c.mo10573a(view, f);
        if (f == 0.0f) {
            width = 4;
        } else {
            width = 0;
        }
        view.setVisibility(width);
        this.f22036c.invalidate();
    }

    /* renamed from: a */
    public final void mo10635a(View view, float f, float f2) {
        int i = 0;
        float d = C0345kz.m5546d(view);
        int width = view.getWidth();
        if (!this.f22036c.mo10575a(view, 3)) {
            i = this.f22036c.getWidth();
            if (f < 0.0f || (f == 0.0f && d > 0.5f)) {
                i -= width;
            }
        } else if (f <= 0.0f && (f != 0.0f || d <= 0.5f)) {
            i = -width;
        }
        this.f22035b.mo10626b(i, view.getTop());
        this.f22036c.invalidate();
    }

    /* renamed from: d */
    public final void mo14212d() {
        this.f22036c.removeCallbacks(this.f22037d);
    }

    /* renamed from: e */
    public final boolean mo10640e(View view, int i) {
        return C0345kz.m5549f(view) && this.f22036c.mo10575a(view, this.f22034a) && this.f22036c.mo10578b(view) == 0;
    }
}
