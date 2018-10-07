package p000;

import android.support.design.behavior.SwipeDismissBehavior;
import android.view.View;
import android.view.ViewParent;

/* compiled from: PG */
/* renamed from: bg */
public final class C0638bg extends C0357lr {
    /* renamed from: a */
    private int f11277a;
    /* renamed from: b */
    private int f11278b = -1;
    /* renamed from: c */
    private final /* synthetic */ SwipeDismissBehavior f11279c;

    public C0638bg(SwipeDismissBehavior swipeDismissBehavior) {
        this.f11279c = swipeDismissBehavior;
    }

    /* renamed from: a */
    public final int mo10632a(View view, int i) {
        Object obj;
        int obj2;
        int width;
        if (C0315jm.m4635j(view) != 1) {
            obj2 = null;
        } else {
            obj2 = 1;
        }
        int i2 = this.f11279c.f10413b;
        if (i2 == 0) {
            if (obj2 != null) {
                width = this.f11277a - view.getWidth();
                obj2 = this.f11277a;
            } else {
                width = this.f11277a;
                obj2 = view.getWidth() + width;
            }
        } else if (i2 != 1) {
            width = this.f11277a - view.getWidth();
            obj2 = this.f11277a + view.getWidth();
        } else if (obj2 != null) {
            width = this.f11277a;
            obj2 = view.getWidth() + width;
        } else {
            width = this.f11277a - view.getWidth();
            obj2 = this.f11277a;
        }
        return Math.min(Math.max(width, i), obj2);
    }

    /* renamed from: b */
    public final int mo10636b(View view, int i) {
        return view.getTop();
    }

    /* renamed from: a */
    public final int mo10631a(View view) {
        return view.getWidth();
    }

    /* renamed from: c */
    public final void mo10638c(View view, int i) {
        this.f11278b = i;
        this.f11277a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    /* renamed from: a */
    public final void mo10633a(int i) {
    }

    /* renamed from: d */
    public final void mo10639d(View view, int i) {
        float width = ((float) this.f11277a) + (((float) view.getWidth()) * this.f11279c.f10415d);
        float width2 = ((float) this.f11277a) + (((float) view.getWidth()) * this.f11279c.f10416e);
        float f = (float) i;
        if (f <= width) {
            view.setAlpha(1.0f);
        } else if (f >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(SwipeDismissBehavior.m6738a(1.0f - ((f - width) / (width2 - width))));
        }
    }

    /* renamed from: a */
    public final void mo10635a(View view, float f, float f2) {
        int j;
        boolean z;
        int i;
        boolean z2 = false;
        this.f11278b = -1;
        int width = view.getWidth();
        int i2;
        if (f != 0.0f) {
            j = C0315jm.m4635j(view);
            i2 = this.f11279c.f10413b;
            if (i2 == 2) {
                z = true;
            } else if (i2 == 0) {
                if (j != 1) {
                    if (f > 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (f < 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (i2 != 1) {
                z = false;
            } else if (j != 1) {
                if (f < 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (f > 0.0f) {
                z = true;
            } else {
                z = false;
            }
        } else {
            j = view.getLeft();
            i2 = this.f11277a;
            if (Math.abs(j - i2) >= Math.round(((float) view.getWidth()) * this.f11279c.f10414c)) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            int left = view.getLeft();
            j = this.f11277a;
            if (left < j) {
                left = j - width;
            } else {
                left = j + width;
            }
            i = left;
            z2 = true;
        } else {
            i = this.f11277a;
        }
        if (this.f11279c.f10412a.mo10626b(i, view.getTop())) {
            C0315jm.m4615a(view, new C0057bi(this.f11279c, view, z2));
        } else {
            if (z2) {
            }
        }
    }

    /* renamed from: e */
    public final boolean mo10640e(View view, int i) {
        return this.f11278b == -1 && this.f11279c.mo423a(view);
    }
}
