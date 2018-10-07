package p000;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

/* compiled from: PG */
/* renamed from: ri */
final class C0838ri extends C0760tg {
    /* renamed from: a */
    public CharSequence f25450a;
    /* renamed from: b */
    public ListAdapter f25451b;
    /* renamed from: c */
    public final Rect f25452c = new Rect();
    /* renamed from: d */
    public final /* synthetic */ C0449rf f25453d;

    public C0838ri(C0449rf c0449rf, Context context, AttributeSet attributeSet, int i) {
        this.f25453d = c0449rf;
        super(context, attributeSet, i);
        this.f22320l = c0449rf;
        mo14436j();
        this.f22321m = new C0451rj(this);
    }

    /* renamed from: a */
    final void mo15285a() {
        int i;
        Drawable background = this.f22326r.getBackground();
        if (background != null) {
            background.getPadding(this.f25453d.f9613c);
            if (C0549vx.m6138a(this.f25453d)) {
                i = this.f25453d.f9613c.right;
            } else {
                i = -this.f25453d.f9613c.left;
            }
        } else {
            Rect rect = this.f25453d.f9613c;
            rect.right = 0;
            rect.left = 0;
            i = 0;
        }
        int paddingLeft = this.f25453d.getPaddingLeft();
        int paddingRight = this.f25453d.getPaddingRight();
        int width = this.f25453d.getWidth();
        C0449rf c0449rf = this.f25453d;
        int i2 = c0449rf.f9612b;
        if (i2 == -2) {
            int a = c0449rf.mo10976a((SpinnerAdapter) this.f25451b, this.f22326r.getBackground());
            i2 = this.f25453d.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f25453d.f9613c;
            i2 = (i2 - rect2.left) - rect2.right;
            if (a <= i2) {
                i2 = a;
            }
            mo14427a(Math.max(i2, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            mo14427a((width - paddingLeft) - paddingRight);
        } else {
            mo14427a(i2);
        }
        if (C0549vx.m6138a(this.f25453d)) {
            i2 = ((width - paddingRight) - this.f22314f) + i;
        } else {
            i2 = i + paddingLeft;
        }
        this.f22315g = i2;
    }

    /* renamed from: a */
    public final void mo14429a(ListAdapter listAdapter) {
        super.mo14429a(listAdapter);
        this.f25451b = listAdapter;
    }

    /* renamed from: f */
    public final void mo10863f() {
        boolean isShowing = this.f22326r.isShowing();
        mo15285a();
        mo14435i();
        super.m17118a();
        this.f22313e.setChoiceMode(1);
        int selectedItemPosition = this.f25453d.getSelectedItemPosition();
        C0475sh c0475sh = this.f22313e;
        if (this.f22326r.isShowing() && c0475sh != null) {
            c0475sh.f9709a = false;
            c0475sh.setSelection(selectedItemPosition);
            if (c0475sh.getChoiceMode() != 0) {
                c0475sh.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing) {
            ViewTreeObserver viewTreeObserver = this.f25453d.getViewTreeObserver();
            if (viewTreeObserver != null) {
                OnGlobalLayoutListener c0452rk = new C0452rk(this);
                viewTreeObserver.addOnGlobalLayoutListener(c0452rk);
                mo14430a(new C0453rl(this, c0452rk));
            }
        }
    }
}
