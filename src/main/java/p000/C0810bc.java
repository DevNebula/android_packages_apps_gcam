package p000;

import android.content.Context;
import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import java.util.List;

/* compiled from: PG */
/* renamed from: bc */
public abstract class C0810bc extends C0637be {
    /* renamed from: a */
    public final Rect f22563a = new Rect();
    /* renamed from: b */
    public int f22564b = 0;
    /* renamed from: c */
    public int f22565c;
    /* renamed from: f */
    private final Rect f22566f = new Rect();

    /* renamed from: a */
    public abstract View mo414a(List list);

    public C0810bc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: d */
    public final int mo14556d(View view) {
        if (this.f22565c == 0) {
            return 0;
        }
        float a = mo413a(view);
        int i = this.f22565c;
        return C0186df.m1624a((int) (a * ((float) i)), 0, i);
    }

    /* renamed from: a */
    public float mo413a(View view) {
        return 1.0f;
    }

    /* renamed from: b */
    public int mo417b(View view) {
        return view.getMeasuredHeight();
    }

    /* renamed from: b */
    protected final void mo12360b(CoordinatorLayout coordinatorLayout, View view, int i) {
        View a = mo414a(coordinatorLayout.mo11685a(view));
        if (a != null) {
            C0192dm c0192dm = (C0192dm) view.getLayoutParams();
            Rect rect = this.f22563a;
            rect.set(coordinatorLayout.getPaddingLeft() + c0192dm.leftMargin, a.getBottom() + c0192dm.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - c0192dm.rightMargin, ((coordinatorLayout.getHeight() + a.getBottom()) - coordinatorLayout.getPaddingBottom()) - c0192dm.bottomMargin);
            C0333kj c0333kj = coordinatorLayout.f10468b;
            if (!(c0333kj == null || !C0315jm.m4632g(coordinatorLayout) || C0315jm.m4632g(view))) {
                rect.left += c0333kj.mo10073b();
                rect.right -= c0333kj.mo10074c();
            }
            Rect rect2 = this.f22566f;
            int i2 = c0192dm.f3339c;
            if (i2 == 0) {
                i2 = 8388659;
            }
            C0261ha.m3020a(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            i2 = mo14556d(a);
            view.layout(rect2.left, rect2.top - i2, rect2.right, rect2.bottom - i2);
            this.f22564b = rect2.top - a.getBottom();
            return;
        }
        super.mo12360b(coordinatorLayout, view, i);
        this.f22564b = 0;
    }

    /* renamed from: a */
    public boolean mo409a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        int i5 = view.getLayoutParams().height;
        if (i5 == -1 || i5 == -2) {
            View a = mo414a(coordinatorLayout.mo11685a(view));
            if (a != null) {
                if (C0315jm.m4632g(a) && !C0315jm.m4632g(view)) {
                    C0315jm.m4603C(view);
                    if (C0315jm.m4632g(view)) {
                        view.requestLayout();
                        return true;
                    }
                }
                int size = MeasureSpec.getSize(i3);
                if (size == 0) {
                    size = coordinatorLayout.getHeight();
                }
                int b = mo417b(a) + (size - a.getMeasuredHeight());
                if (i5 == -1) {
                    size = 1073741824;
                } else {
                    size = kvl.UNSET_ENUM_VALUE;
                }
                coordinatorLayout.mo11688a(view, i, i2, MeasureSpec.makeMeasureSpec(b, size), i4);
                return true;
            }
        }
        return false;
    }
}
