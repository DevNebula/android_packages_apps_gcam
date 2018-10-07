package p000;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* compiled from: PG */
/* renamed from: gbi */
final class gbi implements OnLayoutChangeListener {
    /* renamed from: a */
    private final /* synthetic */ gxn f5256a;
    /* renamed from: b */
    private final /* synthetic */ View f5257b;
    /* renamed from: c */
    private final /* synthetic */ View f5258c;
    /* renamed from: d */
    private final /* synthetic */ gbd f5259d;

    gbi(gbd gbd, gxn gxn, View view, View view2) {
        this.f5259d = gbd;
        this.f5256a = gxn;
        this.f5257b = view;
        this.f5258c = view2;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f5256a.mo7505a();
        gxn gxn = this.f5256a;
        View view2 = this.f5257b;
        gxn.mo7507a(view2, gbd.m11135a(this.f5259d.f18981a, this.f5258c, view2));
    }
}
