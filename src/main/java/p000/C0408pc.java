package p000;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow.OnDismissListener;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: pc */
public class C0408pc {
    /* renamed from: a */
    public View f9520a;
    /* renamed from: b */
    public int f9521b;
    /* renamed from: c */
    public OnDismissListener f9522c;
    /* renamed from: d */
    private final Context f9523d;
    /* renamed from: e */
    private final C0734op f9524e;
    /* renamed from: f */
    private final boolean f9525f;
    /* renamed from: g */
    private final int f9526g;
    /* renamed from: h */
    private final int f9527h;
    /* renamed from: i */
    private boolean f9528i;
    /* renamed from: j */
    private C0411pf f9529j;
    /* renamed from: k */
    private C0741pb f9530k;
    /* renamed from: l */
    private final OnDismissListener f9531l;

    public C0408pc(Context context, C0734op c0734op, View view, boolean z) {
        this(context, c0734op, view, z, R.attr.actionOverflowMenuStyle, 0);
    }

    public C0408pc(Context context, C0734op c0734op, View view, boolean z, int i, int i2) {
        this.f9521b = 8388611;
        this.f9531l = new C0409pd(this);
        this.f9523d = context;
        this.f9524e = c0734op;
        this.f9520a = view;
        this.f9525f = z;
        this.f9526g = i;
        this.f9527h = i2;
    }

    /* renamed from: a */
    public final void mo10837a() {
        if (mo10842c()) {
            this.f9530k.mo10860c();
        }
    }

    /* renamed from: b */
    public final C0741pb mo10841b() {
        if (this.f9530k == null) {
            C0741pb c0829og;
            Display defaultDisplay = ((WindowManager) this.f9523d.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= this.f9523d.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                c0829og = new C0829og(this.f9523d, this.f9520a, this.f9526g, this.f9527h, this.f9525f);
            } else {
                c0829og = new C0834pk(this.f9523d, this.f9524e, this.f9520a, this.f9526g, this.f9527h, this.f9525f);
            }
            c0829og.mo14401a(this.f9524e);
            c0829og.mo14400a(this.f9531l);
            c0829og.mo14399a(this.f9520a);
            c0829og.mo10848a(this.f9529j);
            c0829og.mo14403b(this.f9528i);
            c0829og.mo14398a(this.f9521b);
            this.f9530k = c0829og;
        }
        return this.f9530k;
    }

    /* renamed from: c */
    public final boolean mo10842c() {
        C0741pb c0741pb = this.f9530k;
        return c0741pb != null && c0741pb.mo10862e();
    }

    /* renamed from: d */
    public void mo10843d() {
        this.f9530k = null;
        OnDismissListener onDismissListener = this.f9522c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: a */
    public final void mo10840a(boolean z) {
        this.f9528i = z;
        C0741pb c0741pb = this.f9530k;
        if (c0741pb != null) {
            c0741pb.mo14403b(z);
        }
    }

    /* renamed from: a */
    public final void mo10839a(C0411pf c0411pf) {
        this.f9529j = c0411pf;
        C0741pb c0741pb = this.f9530k;
        if (c0741pb != null) {
            c0741pb.mo10848a(c0411pf);
        }
    }

    /* renamed from: a */
    final void mo10838a(int i, int i2, boolean z, boolean z2) {
        C0741pb b = mo10841b();
        b.mo14406c(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f9521b, C0315jm.m4635j(this.f9520a)) & 7) == 5) {
                i -= this.f9520a.getWidth();
            }
            b.mo14402b(i);
            b.mo14405c(i2);
            int i3 = (int) ((this.f9523d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            b.f22237g = new Rect(i - i3, i2 - i3, i + i3, i3 + i2);
        }
        b.mo10863f();
    }

    /* renamed from: e */
    public final boolean mo10844e() {
        if (mo10842c()) {
            return true;
        }
        if (this.f9520a == null) {
            return false;
        }
        mo10838a(0, 0, false, false);
        return true;
    }
}
