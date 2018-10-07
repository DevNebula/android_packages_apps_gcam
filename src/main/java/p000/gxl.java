package p000;

import android.graphics.RectF;

/* compiled from: PG */
/* renamed from: gxl */
public final class gxl extends gxj {
    /* renamed from: j */
    private final float[] f19802j;

    public gxl(float[] fArr, boolean z, boolean z2) {
        boolean z3;
        super(false, z, z2);
        this.f19802j = (float[]) jri.m13404b((Object) fArr);
        if (!z && fArr.length == 2) {
            z3 = true;
        } else if (fArr.length != 3) {
            z3 = false;
        } else {
            z3 = true;
        }
        jri.m13405b(z3);
    }

    /* renamed from: a */
    public final void mo7502a(RectF rectF) {
        if (this.f6124h) {
            this.f6117a = Math.round(rectF.width() * this.f19802j[0]);
            this.f6121e = Math.round(rectF.width() * this.f19802j[1]);
            this.f6118b = Math.round(rectF.width() * this.f19802j[2]);
            this.f6119c = Math.round(rectF.height() * this.f19802j[0]);
            this.f6122f = Math.round(rectF.height() * this.f19802j[1]);
            this.f6120d = Math.round(rectF.height() * this.f19802j[2]);
            return;
        }
        this.f6117a = Math.round(rectF.width() * this.f19802j[0]);
        this.f6118b = Math.round(rectF.width() * this.f19802j[1]);
        this.f6119c = Math.round(rectF.height() * this.f19802j[0]);
        this.f6120d = Math.round(rectF.height() * this.f19802j[1]);
    }
}
