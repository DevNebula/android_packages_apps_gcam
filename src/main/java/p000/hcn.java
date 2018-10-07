package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.PopupWindow;

/* compiled from: PG */
/* renamed from: hcn */
public final class hcn implements AutoCloseable {
    /* renamed from: a */
    public final hde f6351a;
    /* renamed from: b */
    public final kpw f6352b = kpw.m18486d();

    public hcn(View view, int i, View view2, int i2, int i3) {
        jri.m13404b((Object) view);
        jri.m13404b((Object) view2);
        hde hde = new hde(view2.getContext());
        hde.setWillNotDraw(false);
        hde.setLayerType(1, hde.f6382b);
        hde.setOnClickListener(new hdf(hde));
        hde.f6398r = new hdg(hde);
        this.f6351a = hde;
        View view3 = this.f6351a;
        view3.f6387g = view;
        view3.f6385e = new PopupWindow(view3);
        view3.addView(view);
        view3 = this.f6351a;
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int a = hcn.m3128a(view3);
        int i4 = view2.getResources().getDisplayMetrics().heightPixels;
        int a2 = hcn.m3128a(view2);
        boolean z;
        if (i == 1) {
            if (a < iArr[1]) {
                a = 1;
            } else {
                z = false;
            }
        } else if (a < (i4 - a2) - iArr[1]) {
            a = 1;
        } else {
            z = false;
        }
        if (a == 0) {
            if (i == 1) {
                i = 2;
            } else {
                i = 1;
            }
        }
        hde = this.f6351a;
        hde.f6389i = view2;
        view3 = hde.f6389i;
        if (view3 != null) {
            int[] iArr2 = hde.f6381a;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
            view3.measure(makeMeasureSpec, makeMeasureSpec);
            view3.getLocationOnScreen(iArr2);
            if (view3.getWidth() != 0) {
                makeMeasureSpec = view3.getWidth();
            } else {
                makeMeasureSpec = view3.getMeasuredWidth();
            }
            if (view3.getHeight() != 0) {
                a = view3.getHeight();
            } else {
                a = view3.getMeasuredHeight();
            }
            int i5 = iArr2[0];
            int i6 = iArr2[1];
            hde.f6390j = new Rect(i5, i6, makeMeasureSpec + i5, a + i6);
        }
        hde.f6388h = i;
        hde.f6391k = i2;
        hde.f6392l = 0;
    }

    public final void close() {
        hde hde = this.f6351a;
        if (hde != null) {
            hde.mo7731a();
            this.f6351a.close();
        }
        this.f6352b.mo15641a(null);
    }

    /* renamed from: a */
    private static int m3128a(View view) {
        int height = view.getHeight();
        if (height != 0) {
            return height;
        }
        height = MeasureSpec.makeMeasureSpec(0, 0);
        view.measure(height, height);
        return view.getMeasuredHeight();
    }
}
