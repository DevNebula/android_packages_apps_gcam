package p000;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;

/* compiled from: PG */
/* renamed from: pb */
abstract class C0741pb implements OnItemClickListener, C0410pe, C0414pj {
    /* renamed from: g */
    public Rect f22237g;

    C0741pb() {
    }

    /* renamed from: a */
    public abstract void mo14398a(int i);

    /* renamed from: a */
    public abstract void mo14399a(View view);

    /* renamed from: a */
    public abstract void mo14400a(OnDismissListener onDismissListener);

    /* renamed from: a */
    public abstract void mo14401a(C0734op c0734op);

    /* renamed from: b */
    public abstract void mo14402b(int i);

    /* renamed from: b */
    public abstract void mo14403b(boolean z);

    /* renamed from: c */
    public abstract void mo14405c(int i);

    /* renamed from: c */
    public abstract void mo14406c(boolean z);

    /* renamed from: b */
    protected boolean mo14404b() {
        return true;
    }

    /* renamed from: a */
    public final boolean mo10851a(C0736ot c0736ot) {
        return false;
    }

    /* renamed from: b */
    public final boolean mo10853b(C0736ot c0736ot) {
        return false;
    }

    /* renamed from: a */
    public final void mo10846a(Context context, C0734op c0734op) {
    }

    /* renamed from: a */
    protected static int m14553a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        int i4 = 0;
        ViewGroup viewGroup2 = viewGroup;
        while (i2 < count) {
            int i5;
            View view2;
            ViewGroup frameLayout;
            int itemViewType = listAdapter.getItemViewType(i2);
            if (itemViewType != i3) {
                i5 = itemViewType;
            } else {
                i5 = i3;
            }
            if (itemViewType != i3) {
                view2 = null;
            } else {
                view2 = view;
            }
            if (viewGroup2 == null) {
                frameLayout = new FrameLayout(context);
            } else {
                frameLayout = viewGroup2;
            }
            view2 = listAdapter.getView(i2, view2, frameLayout);
            view2.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view2.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth <= i4) {
                measuredWidth = i4;
            }
            i2++;
            i3 = i5;
            i4 = measuredWidth;
            viewGroup2 = frameLayout;
            view = view2;
        }
        return i4;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        C0734op c0734op = C0741pb.m14554a(listAdapter).f9514a;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (mo14404b()) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        c0734op.mo14299a(menuItem, (C0410pe) this, i2);
    }

    /* renamed from: b */
    protected static boolean m14555b(C0734op c0734op) {
        int size = c0734op.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0734op.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    protected static C0405oo m14554a(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (C0405oo) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (C0405oo) listAdapter;
    }
}
