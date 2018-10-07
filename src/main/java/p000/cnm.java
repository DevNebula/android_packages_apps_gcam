package p000;

import android.graphics.Rect;
import android.support.p002v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* renamed from: cnm */
final class cnm extends C0516uf {
    /* renamed from: a */
    private final int f12745a;
    /* renamed from: b */
    private final int f12746b;
    /* renamed from: c */
    private final int f12747c;
    /* renamed from: d */
    private final C0485sx f12748d;

    public cnm(int i, int i2, C0485sx c0485sx) {
        boolean z;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        this.f12745a = i;
        this.f12747c = i2;
        this.f12748d = c0485sx;
        this.f12746b = Math.round((1.0f - (1.0f / ((float) i2))) * ((float) i));
    }

    /* renamed from: a */
    public final void mo11214a(Rect rect, View view, RecyclerView recyclerView) {
        int e;
        C0530ux c = RecyclerView.m453c(view);
        if (c != null) {
            e = c.mo11321e();
        } else {
            e = -1;
        }
        rect.set(0, this.f12745a, 0, 0);
        int a = this.f12748d.mo11115a(e);
        int i = this.f12747c;
        if (a != i) {
            e = Math.round((((float) this.f12748d.mo11116a(e, i)) / ((float) this.f12747c)) * ((float) this.f12745a));
            a = this.f12746b - e;
            if (C0315jm.m4635j(recyclerView) == 1) {
                rect.right = e;
                rect.left = a;
                return;
            }
            rect.left = e;
            rect.right = a;
        }
    }
}
