package p000;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: PG */
/* renamed from: qw */
public final class C0441qw {
    /* renamed from: a */
    private final ImageView f9597a;

    public C0441qw(ImageView imageView) {
        this.f9597a = imageView;
    }

    /* renamed from: a */
    final void mo10947a() {
        Drawable drawable = this.f9597a.getDrawable();
        if (drawable != null) {
            C0474sg.m5867a();
        }
        if (drawable != null) {
        }
    }

    /* renamed from: b */
    final boolean mo10950b() {
        if (this.f9597a.getBackground() instanceof RippleDrawable) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo10949a(AttributeSet attributeSet, int i) {
        C0540vk a = C0540vk.m6109a(this.f9597a.getContext(), attributeSet, C0382ni.f9253M, i, 0);
        try {
            Drawable drawable = this.f9597a.getDrawable();
            if (drawable == null) {
                int g = a.mo11399g(1, -1);
                if (g != -1) {
                    drawable = C0383nj.m5682b(this.f9597a.getContext(), g);
                    if (drawable != null) {
                        this.f9597a.setImageDrawable(drawable);
                    }
                }
            }
            if (drawable != null) {
                C0474sg.m5867a();
            }
            if (a.mo11398f(2)) {
                this.f9597a.setImageTintList(a.mo11387a(2));
            }
            if (a.mo11398f(3)) {
                this.f9597a.setImageTintMode(C0474sg.m5866a(a.mo11393d(3, -1), null));
            }
            a.f9927b.recycle();
        } catch (Throwable th) {
            a.f9927b.recycle();
        }
    }

    /* renamed from: a */
    public final void mo10948a(int i) {
        if (i != 0) {
            Drawable b = C0383nj.m5682b(this.f9597a.getContext(), i);
            if (b != null) {
                C0474sg.m5867a();
            }
            this.f9597a.setImageDrawable(b);
        } else {
            this.f9597a.setImageDrawable(null);
        }
        mo10947a();
    }
}
