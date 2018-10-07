package p000;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: nx */
public final class C0395nx {
    /* renamed from: a */
    public final ArrayList f9492a = new ArrayList();
    /* renamed from: b */
    public C0331kg f9493b;
    /* renamed from: c */
    public boolean f9494c;
    /* renamed from: d */
    private long f9495d = -1;
    /* renamed from: e */
    private Interpolator f9496e;
    /* renamed from: f */
    private final C0701kh f9497f = new C0828ny(this);

    /* renamed from: a */
    public final void mo10788a() {
        if (this.f9494c) {
            ArrayList arrayList = this.f9492a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                ((C0328kd) arrayList.get(i)).mo9762a();
                i = i2;
            }
            this.f9494c = false;
        }
    }

    /* renamed from: a */
    public final C0395nx mo10786a(C0328kd c0328kd) {
        if (!this.f9494c) {
            this.f9492a.add(c0328kd);
        }
        return this;
    }

    /* renamed from: b */
    public final C0395nx mo10789b() {
        if (!this.f9494c) {
            this.f9495d = 250;
        }
        return this;
    }

    /* renamed from: a */
    public final C0395nx mo10785a(Interpolator interpolator) {
        if (!this.f9494c) {
            this.f9496e = interpolator;
        }
        return this;
    }

    /* renamed from: a */
    public final C0395nx mo10787a(C0331kg c0331kg) {
        if (!this.f9494c) {
            this.f9493b = c0331kg;
        }
        return this;
    }

    /* renamed from: c */
    public final void mo10790c() {
        if (!this.f9494c) {
            ArrayList arrayList = this.f9492a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                C0328kd c0328kd = (C0328kd) arrayList.get(i);
                long j = this.f9495d;
                if (j >= 0) {
                    c0328kd.mo9759a(j);
                }
                TimeInterpolator timeInterpolator = this.f9496e;
                if (timeInterpolator != null) {
                    View view = (View) c0328kd.f8577a.get();
                    if (view != null) {
                        view.animate().setInterpolator(timeInterpolator);
                    }
                }
                if (this.f9493b != null) {
                    c0328kd.mo9760a(this.f9497f);
                }
                View view2 = (View) c0328kd.f8577a.get();
                if (view2 != null) {
                    view2.animate().start();
                    i = i2;
                } else {
                    i = i2;
                }
            }
            this.f9494c = true;
        }
    }
}
