package p000;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* compiled from: PG */
/* renamed from: kvx */
final class kvx implements OnTouchListener {
    /* renamed from: a */
    private PointF f9085a = new PointF();
    /* renamed from: b */
    private final /* synthetic */ kvr f9086b;

    kvx(kvr kvr) {
        this.f9086b = kvr;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f = 0.0f;
        this.f9086b.f9052k.onTouchEvent(motionEvent);
        this.f9086b.f9053l.onTouchEvent(motionEvent);
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        if (this.f9086b.f9044c == C0252go.f5913cf || this.f9086b.f9044c == C0252go.f5914cg || this.f9086b.f9044c == C0252go.f5916ci) {
            switch (motionEvent.getAction()) {
                case 0:
                    this.f9085a.set(pointF);
                    kvv kvv = this.f9086b.f9049h;
                    if (kvv != null) {
                        kvv.mo10550a();
                    }
                    this.f9086b.f9044c = C0252go.f5914cg;
                    break;
                case 1:
                case 6:
                    this.f9086b.f9044c = C0252go.f5913cf;
                    break;
                case 2:
                    if (this.f9086b.f9044c == C0252go.f5914cg) {
                        float f2 = pointF.x;
                        PointF pointF2 = this.f9085a;
                        float f3 = pointF2.x;
                        float f4 = pointF.y;
                        float f5 = pointF2.y;
                        kvr kvr = this.f9086b;
                        f2 -= f3;
                        if (kvr.mo10535d() <= ((float) kvr.f9050i)) {
                            f2 = 0.0f;
                        }
                        kvr kvr2 = this.f9086b;
                        f5 = f4 - f5;
                        if (kvr2.mo10533c() > ((float) kvr2.f9051j)) {
                            f = f5;
                        }
                        this.f9086b.f9043b.postTranslate(f2, f);
                        this.f9086b.mo10532b();
                        this.f9085a.set(pointF.x, pointF.y);
                        break;
                    }
                    break;
            }
        }
        kvr kvr3 = this.f9086b;
        kvr3.setImageMatrix(kvr3.f9043b);
        OnTouchListener onTouchListener = this.f9086b.f9054m;
        if (onTouchListener != null) {
            onTouchListener.onTouch(view, motionEvent);
        }
        return true;
    }
}
