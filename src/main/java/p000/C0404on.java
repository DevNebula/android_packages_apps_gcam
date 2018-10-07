package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: on */
public final class C0404on extends BaseAdapter {
    /* renamed from: a */
    private int f9512a = -1;
    /* renamed from: b */
    private final /* synthetic */ C0733om f9513b;

    public C0404on(C0733om c0733om) {
        this.f9513b = c0733om;
        m5720a();
    }

    /* renamed from: a */
    private final void m5720a() {
        C0734op c0734op = this.f9513b.f22169b;
        C0736ot c0736ot = c0734op.f22184i;
        if (c0736ot != null) {
            ArrayList c = c0734op.mo14316c();
            int size = c.size();
            for (int i = 0; i < size; i++) {
                if (((C0736ot) c.get(i)) == c0736ot) {
                    this.f9512a = i;
                    return;
                }
            }
        }
        this.f9512a = -1;
    }

    public final int getCount() {
        int size = this.f9513b.f22169b.mo14316c().size();
        return this.f9512a < 0 ? size : size - 1;
    }

    /* renamed from: a */
    public final C0736ot getItem(int i) {
        ArrayList c = this.f9513b.f22169b.mo14316c();
        int i2 = this.f9512a;
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
        if (view == null) {
            C0733om c0733om = this.f9513b;
            inflate = c0733om.f22168a.inflate(c0733om.f22171d, viewGroup, false);
        } else {
            inflate = view;
        }
        ((C0413ph) inflate).mo10858a(getItem(i));
        return inflate;
    }

    public final void notifyDataSetChanged() {
        m5720a();
        super.notifyDataSetChanged();
    }
}
