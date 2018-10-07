package p000;

import android.support.p002v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.refocus.processing.DepthmapTask;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: ub */
public abstract class C0512ub {
    /* renamed from: a */
    private ArrayList f9805a = new ArrayList();
    /* renamed from: h */
    public C0514ud f9806h = null;
    /* renamed from: i */
    public long f9807i = 120;
    /* renamed from: j */
    public long f9808j = 120;
    /* renamed from: k */
    public long f9809k = 250;
    /* renamed from: l */
    public long f9810l = 250;

    /* renamed from: a */
    public abstract boolean mo11201a(C0530ux c0530ux, C0515ue c0515ue, C0515ue c0515ue2);

    /* renamed from: a */
    public abstract boolean mo11202a(C0530ux c0530ux, C0530ux c0530ux2, C0515ue c0515ue, C0515ue c0515ue2);

    /* renamed from: b */
    public abstract void mo11203b();

    /* renamed from: b */
    public abstract boolean mo11204b(C0530ux c0530ux, C0515ue c0515ue, C0515ue c0515ue2);

    /* renamed from: c */
    public abstract void mo11205c(C0530ux c0530ux);

    /* renamed from: c */
    public abstract boolean mo11206c();

    /* renamed from: c */
    public abstract boolean mo11207c(C0530ux c0530ux, C0515ue c0515ue, C0515ue c0515ue2);

    /* renamed from: d */
    public abstract void mo11208d();

    /* renamed from: d */
    public static int m5960d(C0530ux c0530ux) {
        int i = c0530ux.f9886j & 14;
        if (c0530ux.mo11324h()) {
            return 4;
        }
        if ((i & 4) != 0) {
            return i;
        }
        int i2 = c0530ux.f9880d;
        int e = c0530ux.mo11321e();
        if (i2 == -1 || e == -1 || i2 == e) {
            return i;
        }
        return i | DepthmapTask.MAX_REFERENCE_SIZE_HR_PX;
    }

    /* renamed from: e */
    public boolean mo11210e(C0530ux c0530ux) {
        return true;
    }

    /* renamed from: a */
    public boolean mo11200a(C0530ux c0530ux, List list) {
        return mo11210e(c0530ux);
    }

    /* renamed from: f */
    public final void mo11211f(C0530ux c0530ux) {
        int i = 1;
        C0514ud c0514ud = this.f9806h;
        if (c0514ud != null) {
            c0530ux.mo11316a(true);
            if (c0530ux.f9884h != null && c0530ux.f9885i == null) {
                c0530ux.f9884h = null;
            }
            c0530ux.f9885i = null;
            if ((c0530ux.f9886j & 16) == 0) {
                RecyclerView recyclerView = c0514ud.f9811a;
                View view = c0530ux.f9877a;
                recyclerView.mo1182p();
                C0457rp c0457rp = recyclerView.f706f;
                int a = c0457rp.f9647a.mo11047a(view);
                if (a == -1) {
                    c0457rp.mo11038d(view);
                } else if (c0457rp.f9648b.mo11043c(a)) {
                    c0457rp.f9648b.mo11044d(a);
                    c0457rp.mo11038d(view);
                    c0457rp.f9647a.mo11049b(a);
                } else {
                    i = 0;
                }
                if (i != 0) {
                    C0530ux c = RecyclerView.m453c(view);
                    recyclerView.f704d.mo11297b(c);
                    recyclerView.f704d.mo11292a(c);
                }
                recyclerView.mo1134c(i ^ 1);
                if (i == 0 && c0530ux.mo11328l()) {
                    c0514ud.f9811a.removeDetachedView(c0530ux.f9877a, false);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo11209e() {
        int size = this.f9805a.size();
        for (int i = 0; i < size; i++) {
            ((C0513uc) this.f9805a.get(i)).mo11212a();
        }
        this.f9805a.clear();
    }

    /* renamed from: f */
    public static C0515ue m5961f() {
        return new C0515ue();
    }
}
