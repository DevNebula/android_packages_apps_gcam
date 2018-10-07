package p000;

import android.support.design.bottomsheet.BottomSheetBehavior;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: bj */
public final class C0640bj extends C0357lr {
    /* renamed from: a */
    private final /* synthetic */ BottomSheetBehavior f11463a;

    public C0640bj(BottomSheetBehavior bottomSheetBehavior) {
        this.f11463a = bottomSheetBehavior;
    }

    /* renamed from: a */
    public final int mo10632a(View view, int i) {
        return view.getLeft();
    }

    /* renamed from: b */
    public final int mo10636b(View view, int i) {
        int i2;
        int b = this.f11463a.mo11659b();
        BottomSheetBehavior bottomSheetBehavior = this.f11463a;
        if (bottomSheetBehavior.f10423e) {
            i2 = bottomSheetBehavior.f10426h;
        } else {
            i2 = bottomSheetBehavior.f10422d;
        }
        return C0186df.m1624a(i, b, i2);
    }

    /* renamed from: a */
    public final int mo10630a() {
        BottomSheetBehavior bottomSheetBehavior = this.f11463a;
        if (bottomSheetBehavior.f10423e) {
            return bottomSheetBehavior.f10426h;
        }
        return bottomSheetBehavior.f10422d;
    }

    /* renamed from: a */
    public final void mo10633a(int i) {
        if (i == 1) {
            this.f11463a.mo11660b(1);
        }
    }

    /* renamed from: d */
    public final void mo10639d(View view, int i) {
        this.f11463a.mo11657a();
    }

    /* renamed from: a */
    public final void mo10635a(View view, float f, float f2) {
        int i;
        int i2 = 3;
        int top;
        if (f2 < 0.0f) {
            BottomSheetBehavior bottomSheetBehavior = this.f11463a;
            if (bottomSheetBehavior.f10419a) {
                i = bottomSheetBehavior.f10420b;
            } else {
                top = view.getTop();
                int i3 = this.f11463a.f10421c;
                if (top > i3) {
                    i2 = 6;
                    i = i3;
                } else {
                    i = 0;
                }
            }
        } else {
            BottomSheetBehavior bottomSheetBehavior2 = this.f11463a;
            if (bottomSheetBehavior2.f10423e && bottomSheetBehavior2.mo11658a(view, f2)) {
                i = this.f11463a.f10426h;
                i2 = 5;
            } else if (f2 == 0.0f) {
                top = view.getTop();
                BottomSheetBehavior bottomSheetBehavior3 = this.f11463a;
                if (!bottomSheetBehavior3.f10419a) {
                    int i4 = bottomSheetBehavior3.f10421c;
                    if (top < i4) {
                        if (top >= Math.abs(top - bottomSheetBehavior3.f10422d)) {
                            i = this.f11463a.f10421c;
                            i2 = 6;
                        } else {
                            i = 0;
                        }
                    } else if (Math.abs(top - i4) < Math.abs(top - this.f11463a.f10422d)) {
                        i = this.f11463a.f10421c;
                        i2 = 6;
                    } else {
                        i = this.f11463a.f10422d;
                        i2 = 4;
                    }
                } else if (Math.abs(top - bottomSheetBehavior3.f10420b) < Math.abs(top - this.f11463a.f10422d)) {
                    i = this.f11463a.f10420b;
                } else {
                    i = this.f11463a.f10422d;
                    i2 = 4;
                }
            } else {
                i = this.f11463a.f10422d;
                i2 = 4;
            }
        }
        if (this.f11463a.f10425g.mo10626b(view.getLeft(), i)) {
            this.f11463a.mo11660b(2);
            C0315jm.m4615a(view, new C0059bm(this.f11463a, view, i2));
            return;
        }
        this.f11463a.mo11660b(i2);
    }

    /* renamed from: e */
    public final boolean mo10640e(View view, int i) {
        BottomSheetBehavior bottomSheetBehavior = this.f11463a;
        int i2 = bottomSheetBehavior.f10424f;
        if (i2 == 1) {
            return false;
        }
        if (bottomSheetBehavior.f10430l) {
            return false;
        }
        if (i2 == 3 && bottomSheetBehavior.f10429k == i) {
            View view2 = (View) bottomSheetBehavior.f10428j.get();
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        WeakReference weakReference = this.f11463a.f10427i;
        return weakReference != null && weakReference.get() == view;
    }
}
