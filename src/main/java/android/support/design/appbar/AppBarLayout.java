package android.support.design.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import java.lang.ref.WeakReference;
import java.util.List;
import p000.C0055bd;
import p000.C0190dk;
import p000.C0192dm;
import p000.C0315jm;
import p000.C0809ba;
import p000.C0810bc;

@C0190dk(a = Behavior.class)
/* compiled from: PG */
public class AppBarLayout extends LinearLayout {

    /* compiled from: PG */
    public class BaseBehavior extends C0809ba {
        /* renamed from: b */
        private int f551b;
        /* renamed from: c */
        private WeakReference f552c;

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        final /* synthetic */ boolean mo406a() {
            WeakReference weakReference = this.f552c;
            if (weakReference != null) {
                View view = (View) weakReference.get();
                if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: b */
        final /* synthetic */ int mo412b(View view) {
            throw new NoSuchMethodError();
        }

        /* renamed from: b */
        final int mo411b() {
            return mo12361c();
        }

        /* renamed from: a */
        public final /* synthetic */ boolean mo409a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            View view2 = (AppBarLayout) view;
            if (((C0192dm) view2.getLayoutParams()).height != -2) {
                return super.mo409a(coordinatorLayout, view2, i, i2, i3, i4);
            }
            coordinatorLayout.mo11688a(view2, i, i2, MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo405a(View view, View view2, int i, int[] iArr, int i2) {
            if (i == 0) {
                return;
            }
            if (i >= 0) {
                throw new NoSuchMethodError();
            }
            throw new NoSuchMethodError();
        }

        /* renamed from: a */
        public final /* synthetic */ void mo403a(View view, int i, int i2, int i3) {
            if (i2 < 0) {
                throw new NoSuchMethodError();
            }
        }

        /* renamed from: a */
        private final void m372a(AppBarLayout appBarLayout) {
            int c = mo12361c();
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (i < childCount) {
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                childAt.getLayoutParams();
                int i2 = -c;
                if (top <= i2 && bottom >= i2) {
                    break;
                }
                i++;
            }
            i = -1;
            if (i >= 0) {
                appBarLayout.getChildAt(i).getLayoutParams();
            }
        }
    }

    /* compiled from: PG */
    public class ScrollingViewBehavior extends C0810bc {
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0055bd.f1105a);
            this.f22565c = obtainStyledAttributes.getDimensionPixelSize(C0055bd.f1106b, 0);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: b */
        private static AppBarLayout m387b(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* renamed from: a */
        final float mo413a(View view) {
            if (!(view instanceof AppBarLayout)) {
                return 0.0f;
            }
            throw new NoSuchMethodError();
        }

        /* renamed from: b */
        final int mo417b(View view) {
            if (!(view instanceof AppBarLayout)) {
                return super.mo417b(view);
            }
            throw new NoSuchMethodError();
        }

        /* renamed from: c */
        public final boolean mo418c(View view) {
            return view instanceof AppBarLayout;
        }

        /* renamed from: a */
        public final boolean mo416a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (((C0192dm) view2.getLayoutParams()).f3337a instanceof BaseBehavior) {
                C0315jm.m4624b(view, ((view2.getBottom() - view.getTop()) + this.f22564b) - mo14556d(view2));
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo415a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            if (m387b(coordinatorLayout.mo11685a(view)) != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f22563a;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    throw new NoSuchMethodError();
                }
            }
            return false;
        }
    }

    /* compiled from: PG */
    public class Behavior extends BaseBehavior {
        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        throw new NoSuchMethodError();
    }

    protected int[] onCreateDrawableState(int i) {
        throw new NoSuchMethodError();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        throw new NoSuchMethodError();
    }

    protected void onMeasure(int i, int i2) {
        throw new NoSuchMethodError();
    }

    public void setOrientation(int i) {
        throw new NoSuchMethodError();
    }
}
