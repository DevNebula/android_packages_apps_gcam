package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* compiled from: PG */
/* renamed from: re */
final class C0751re extends C0445ra {
    /* renamed from: b */
    public final SeekBar f22252b;
    /* renamed from: c */
    public Drawable f22253c;
    /* renamed from: d */
    private ColorStateList f22254d = null;
    /* renamed from: e */
    private Mode f22255e = null;
    /* renamed from: f */
    private boolean f22256f = false;
    /* renamed from: g */
    private boolean f22257g = false;

    C0751re(SeekBar seekBar) {
        super(seekBar);
        this.f22252b = seekBar;
    }

    /* renamed from: a */
    private final void m14588a() {
        Drawable drawable = this.f22253c;
        if (drawable == null) {
            return;
        }
        if (this.f22256f || this.f22257g) {
            this.f22253c = drawable.mutate();
            if (this.f22256f) {
                this.f22253c.setTintList(this.f22254d);
            }
            if (this.f22257g) {
                this.f22253c.setTintMode(this.f22255e);
            }
            if (this.f22253c.isStateful()) {
                this.f22253c.setState(this.f22252b.getDrawableState());
            }
        }
    }

    /* renamed from: a */
    final void mo10968a(AttributeSet attributeSet, int i) {
        super.mo10968a(attributeSet, i);
        C0540vk a = C0540vk.m6109a(this.f22252b.getContext(), attributeSet, C0382ni.f9254N, i, 0);
        Drawable c = a.mo11392c(C0382ni.f9255O);
        if (c != null) {
            this.f22252b.setThumb(c);
        }
        c = a.mo11390b(C0382ni.f9256P);
        Drawable drawable = this.f22253c;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f22253c = c;
        if (c != null) {
            c.setCallback(this.f22252b);
            c.setLayoutDirection(C0315jm.m4635j(this.f22252b));
            if (c.isStateful()) {
                c.setState(this.f22252b.getDrawableState());
            }
            m14588a();
        }
        this.f22252b.invalidate();
        if (a.mo11398f(C0382ni.f9258R)) {
            this.f22255e = C0474sg.m5866a(a.mo11393d(C0382ni.f9258R, -1), this.f22255e);
            this.f22257g = true;
        }
        if (a.mo11398f(C0382ni.f9257Q)) {
            this.f22254d = a.mo11387a(C0382ni.f9257Q);
            this.f22256f = true;
        }
        a.f9927b.recycle();
        m14588a();
    }
}
