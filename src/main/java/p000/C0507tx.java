package p000;

import android.os.Trace;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: tx */
public abstract class C0507tx {
    /* renamed from: a */
    public final C0508ty f9803a = new C0508ty();
    /* renamed from: b */
    public boolean f9804b = false;

    /* renamed from: a */
    public abstract int mo11186a();

    /* renamed from: a */
    public abstract void mo11191a(C0530ux c0530ux, int i);

    /* renamed from: b */
    public abstract C0530ux mo11193b(ViewGroup viewGroup, int i);

    /* renamed from: a */
    public final C0530ux mo11188a(ViewGroup viewGroup, int i) {
        try {
            Trace.beginSection("RV CreateView");
            C0530ux b = mo11193b(viewGroup, i);
            if (b.f9877a.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            b.f9882f = i;
            return b;
        } finally {
            Trace.endSection();
        }
    }

    /* renamed from: a */
    public long mo11187a(int i) {
        return -1;
    }

    /* renamed from: b */
    public int mo11192b(int i) {
        return 0;
    }

    /* renamed from: a */
    public void mo11190a(C0530ux c0530ux) {
    }

    /* renamed from: a */
    public final void mo11189a(C0509tz c0509tz) {
        this.f9803a.registerObserver(c0509tz);
    }
}
