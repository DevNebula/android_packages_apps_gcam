package p000;

import android.widget.ListView;

/* compiled from: PG */
/* renamed from: lj */
public final class C0711lj extends C0341kv {
    /* renamed from: f */
    private final ListView f22038f;

    public C0711lj(ListView listView) {
        super(listView);
        this.f22038f = listView;
    }

    /* renamed from: a */
    public final boolean mo10446a() {
        return false;
    }

    /* renamed from: a */
    public final boolean mo10447a(int i) {
        ListView listView = this.f22038f;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else if (i >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final void mo10448b(int i) {
        this.f22038f.scrollListBy(i);
    }
}
