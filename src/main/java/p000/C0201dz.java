package p000;

import android.graphics.Matrix;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: dz */
final class C0201dz {
    /* renamed from: a */
    public final Matrix f3573a = new Matrix();
    /* renamed from: b */
    public final ArrayList f3574b = new ArrayList();
    /* renamed from: c */
    public float f3575c = 0.0f;
    /* renamed from: d */
    public float f3576d = 0.0f;
    /* renamed from: e */
    public float f3577e = 0.0f;
    /* renamed from: f */
    public float f3578f = 1.0f;
    /* renamed from: g */
    public float f3579g = 1.0f;
    /* renamed from: h */
    public float f3580h = 0.0f;
    /* renamed from: i */
    public float f3581i = 0.0f;
    /* renamed from: j */
    public final Matrix f3582j = new Matrix();
    /* renamed from: k */
    public int f3583k;
    /* renamed from: l */
    public int[] f3584l;
    /* renamed from: m */
    public String f3585m = null;

    public C0201dz(C0201dz c0201dz, C0691ih c0691ih) {
        this.f3575c = c0201dz.f3575c;
        this.f3576d = c0201dz.f3576d;
        this.f3577e = c0201dz.f3577e;
        this.f3578f = c0201dz.f3578f;
        this.f3579g = c0201dz.f3579g;
        this.f3580h = c0201dz.f3580h;
        this.f3581i = c0201dz.f3581i;
        this.f3584l = c0201dz.f3584l;
        this.f3585m = c0201dz.f3585m;
        this.f3583k = c0201dz.f3583k;
        String str = this.f3585m;
        if (str != null) {
            c0691ih.put(str, this);
        }
        this.f3582j.set(c0201dz.f3582j);
        ArrayList arrayList = c0201dz.f3574b;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < arrayList.size()) {
                Object obj = arrayList.get(i2);
                if (obj instanceof C0201dz) {
                    this.f3574b.add(new C0201dz((C0201dz) obj, c0691ih));
                } else {
                    C0203ea c0671dy;
                    if (obj instanceof C0671dy) {
                        c0671dy = new C0671dy((C0671dy) obj);
                    } else if (obj instanceof C0670dx) {
                        c0671dy = new C0670dx((C0670dx) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f3574b.add(c0671dy);
                    String str2 = c0671dy.f3639o;
                    if (str2 != null) {
                        c0691ih.put(str2, c0671dy);
                    }
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    public final String getGroupName() {
        return this.f3585m;
    }

    public final Matrix getLocalMatrix() {
        return this.f3582j;
    }

    public final float getPivotX() {
        return this.f3576d;
    }

    public final float getPivotY() {
        return this.f3577e;
    }

    public final float getRotation() {
        return this.f3575c;
    }

    public final float getScaleX() {
        return this.f3578f;
    }

    public final float getScaleY() {
        return this.f3579g;
    }

    public final float getTranslateX() {
        return this.f3580h;
    }

    public final float getTranslateY() {
        return this.f3581i;
    }

    public final void setPivotX(float f) {
        if (f != this.f3576d) {
            this.f3576d = f;
            mo6106a();
        }
    }

    public final void setPivotY(float f) {
        if (f != this.f3577e) {
            this.f3577e = f;
            mo6106a();
        }
    }

    public final void setRotation(float f) {
        if (f != this.f3575c) {
            this.f3575c = f;
            mo6106a();
        }
    }

    public final void setScaleX(float f) {
        if (f != this.f3578f) {
            this.f3578f = f;
            mo6106a();
        }
    }

    public final void setScaleY(float f) {
        if (f != this.f3579g) {
            this.f3579g = f;
            mo6106a();
        }
    }

    public final void setTranslateX(float f) {
        if (f != this.f3580h) {
            this.f3580h = f;
            mo6106a();
        }
    }

    public final void setTranslateY(float f) {
        if (f != this.f3581i) {
            this.f3581i = f;
            mo6106a();
        }
    }

    /* renamed from: a */
    final void mo6106a() {
        this.f3582j.reset();
        this.f3582j.postTranslate(-this.f3576d, -this.f3577e);
        this.f3582j.postScale(this.f3578f, this.f3579g);
        this.f3582j.postRotate(this.f3575c, 0.0f, 0.0f);
        this.f3582j.postTranslate(this.f3580h + this.f3576d, this.f3581i + this.f3577e);
    }
}
