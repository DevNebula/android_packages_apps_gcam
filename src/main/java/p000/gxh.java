package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;

/* compiled from: PG */
/* renamed from: gxh */
public final class gxh extends gwz {
    public gxh(gzk gzk, Paint paint) {
        super(gzk, paint, 0.0f);
    }

    /* renamed from: a */
    public final void mo7586a(long j, long j2, Canvas canvas) {
        float a = this.f19779d.mo7583a((float) j2);
        if (this.f19789n != C0252go.f5888bh) {
            if (this.f19789n == C0252go.f5889bi && ((float) j) > ((float) this.f19786k) + this.f19782g) {
                this.f19789n = C0252go.f5890bj;
            }
            if (this.f19789n == C0252go.f5890bj && !this.f19779d.mo7584a()) {
                this.f19789n = C0252go.f5891bk;
                this.f19787l = j;
            }
            if (this.f19789n == C0252go.f5891bk && ((float) j) > ((float) this.f19787l) + this.f19783h) {
                this.f19789n = C0252go.f5888bh;
            }
            if (this.f19789n == C0252go.f5892bl && ((float) j) > ((float) this.f19788m) + 64.0f) {
                this.f19789n = C0252go.f5888bh;
            }
        }
        if (mo7587a()) {
            int a2;
            this.f19777b.invalidate();
            if (this.f19789n == C0252go.f5891bk) {
                a2 = (int) ((this.f19781f.mo7591a(gzj.m11912a(j, this.f19787l, this.f19783h)) * -255.0f) + 255.0f);
            } else if (this.f19789n == C0252go.f5892bl) {
                a2 = (int) ((this.f19781f.mo7591a(gzj.m11912a(j, this.f19788m, 64.0f)) * -255.0f) + 255.0f);
            } else if (this.f19789n == C0252go.f5888bh) {
                a2 = 0;
            } else {
                a2 = Illuminant.kOther;
            }
            this.f19778c.setAlpha(a2);
            canvas.drawCircle((float) this.f19784i, (float) this.f19785j, a, this.f19778c);
        }
    }
}
