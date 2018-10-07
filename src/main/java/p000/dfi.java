package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;

/* compiled from: PG */
/* renamed from: dfi */
final class dfi implements OnTouchListener {
    /* renamed from: a */
    private final /* synthetic */ des f3235a;

    dfi(des des) {
        this.f3235a = des;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ejy ejy = this.f3235a.f25987v;
        if (ejy == null || !ejy.f3950u) {
            return false;
        }
        switch (motionEvent.getAction() & Illuminant.kOther) {
            case 0:
                break;
            case 2:
                if (!ejy.f3934e) {
                    return true;
                }
                if (motionEvent.getPointerCount() > 1) {
                    ejy.f3936g = ejy.m1867a(motionEvent);
                    float f = ejy.f3936g;
                    float f2 = ejy.f3935f;
                    eki eki = ejy.f3931b;
                    eki.mo6282b(f / f2);
                    eki.f4022n = true;
                    break;
                }
                return true;
            case 5:
                ejy.f3935f = ejy.m1867a(motionEvent);
                ejy.f3934e = true;
                break;
            case 6:
                ejy.f3934e = false;
                ejy.f3931b.mo6279a(ejy.f3936g / ejy.f3935f);
                break;
            default:
                return false;
        }
        return true;
    }
}
