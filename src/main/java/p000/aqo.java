package p000;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* renamed from: aqo */
public abstract class aqo extends aqt implements arb {
    /* renamed from: b */
    private Animatable f26618b;

    public aqo(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: a */
    protected abstract void mo15707a(Object obj);

    /* renamed from: e */
    public final Drawable mo1721e() {
        return ((ImageView) this.f25495a).getDrawable();
    }

    /* renamed from: b */
    private final void m18234b(Object obj) {
        if (obj instanceof Animatable) {
            this.f26618b = (Animatable) obj;
            this.f26618b.start();
            return;
        }
        this.f26618b = null;
    }

    /* renamed from: a */
    public final void mo12304a(Drawable drawable) {
        super.mo12304a(drawable);
        Animatable animatable = this.f26618b;
        if (animatable != null) {
            animatable.stop();
        }
        m18235c(null);
        mo1720d(drawable);
    }

    /* renamed from: b */
    public final void mo12308b(Drawable drawable) {
        super.mo12308b(drawable);
        m18235c(null);
        mo1720d(drawable);
    }

    /* renamed from: c */
    public final void mo12310c(Drawable drawable) {
        super.mo12310c(drawable);
        m18235c(null);
        mo1720d(drawable);
    }

    /* renamed from: a */
    public final void mo12307a(Object obj, ara ara) {
        if (ara == null || !ara.mo1719a(obj, this)) {
            m18235c(obj);
        } else {
            m18234b(obj);
        }
    }

    /* renamed from: c */
    public final void mo1646c() {
        Animatable animatable = this.f26618b;
        if (animatable != null) {
            animatable.start();
        }
    }

    /* renamed from: d */
    public final void mo1647d() {
        Animatable animatable = this.f26618b;
        if (animatable != null) {
            animatable.stop();
        }
    }

    /* renamed from: d */
    public final void mo1720d(Drawable drawable) {
        ((ImageView) this.f25495a).setImageDrawable(drawable);
    }

    /* renamed from: c */
    private final void m18235c(Object obj) {
        mo15707a(obj);
        m18234b(obj);
    }
}
