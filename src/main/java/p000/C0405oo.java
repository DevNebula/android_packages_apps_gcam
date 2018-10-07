package p000;

import android.support.p002v7.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: oo */
public final class C0405oo extends BaseAdapter {
    /* renamed from: a */
    public C0734op f9514a;
    /* renamed from: b */
    public boolean f9515b;
    /* renamed from: c */
    private int f9516c = -1;
    /* renamed from: d */
    private final boolean f9517d;
    /* renamed from: e */
    private final LayoutInflater f9518e;
    /* renamed from: f */
    private final int f9519f;

    public C0405oo(C0734op c0734op, LayoutInflater layoutInflater, boolean z, int i) {
        this.f9517d = z;
        this.f9518e = layoutInflater;
        this.f9514a = c0734op;
        this.f9519f = i;
        m5722a();
    }

    /* renamed from: a */
    private final void m5722a() {
        C0734op c0734op = this.f9514a;
        C0736ot c0736ot = c0734op.f22184i;
        if (c0736ot != null) {
            ArrayList c = c0734op.mo14316c();
            int size = c.size();
            for (int i = 0; i < size; i++) {
                if (((C0736ot) c.get(i)) == c0736ot) {
                    this.f9516c = i;
                    return;
                }
            }
        }
        this.f9516c = -1;
    }

    public final int getCount() {
        ArrayList c;
        if (this.f9517d) {
            c = this.f9514a.mo14316c();
        } else {
            c = this.f9514a.mo14321e();
        }
        if (this.f9516c < 0) {
            return c.size();
        }
        return c.size() - 1;
    }

    /* renamed from: a */
    public final C0736ot getItem(int i) {
        ArrayList c;
        if (this.f9517d) {
            c = this.f9514a.mo14316c();
        } else {
            c = this.f9514a.mo14321e();
        }
        int i2 = this.f9516c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0736ot) c.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View inflate;
        int groupId;
        int i2 = 0;
        if (view == null) {
            inflate = this.f9518e.inflate(this.f9519f, viewGroup, false);
        } else {
            inflate = view;
        }
        int groupId2 = getItem(i).getGroupId();
        int i3 = i - 1;
        if (i3 >= 0) {
            groupId = getItem(i3).getGroupId();
        } else {
            groupId = groupId2;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) inflate;
        if (!this.f9514a.mo14322f()) {
            groupId = 0;
        } else if (groupId2 != groupId) {
            boolean z = true;
        } else {
            groupId = 0;
        }
        ImageView imageView = listMenuItemView.f10525b;
        if (imageView != null) {
            if (listMenuItemView.f10527d) {
                i2 = 8;
            } else if (groupId == 0) {
                i2 = 8;
            }
            imageView.setVisibility(i2);
        }
        C0413ph c0413ph = (C0413ph) inflate;
        if (this.f9515b) {
            listMenuItemView.f10528e = true;
            listMenuItemView.f10526c = true;
        }
        c0413ph.mo10858a(getItem(i));
        return inflate;
    }

    public final void notifyDataSetChanged() {
        m5722a();
        super.notifyDataSetChanged();
    }
}
