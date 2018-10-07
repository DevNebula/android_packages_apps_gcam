package p000;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

/* compiled from: PG */
/* renamed from: hnv */
final class hnv extends SimpleOnGestureListener {
    /* renamed from: a */
    private final /* synthetic */ hnu f6771a;

    hnv(hnu hnu) {
        this.f6771a = hnu;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.f6771a.f6757h.mo7974a();
        hnj hnj = (hnj) this.f6771a.f6760k.mo9757a().get(this.f6771a.f6761l.mo13673b());
        if (hnj == null) {
            return false;
        }
        if (hnj == hnj.SWITCH_CAMERA && !hnu.f6750a) {
            return true;
        }
        hnk hnk = this.f6771a.f6759j;
        String str = hhs.f20133a;
        String valueOf = String.valueOf(hnj);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 30);
        stringBuilder.append("DoubleTapListener onDoubleTap ");
        stringBuilder.append(valueOf);
        bli.m888a(str, stringBuilder.toString());
        if (hnj == hnj.ZOOM) {
            hnk.f6745a.mo8007f();
        } else if (hnj == hnj.SWITCH_CAMERA) {
            hnk.f6746b.switchCamera();
        } else if (hnj == hnj.NONE) {
            bli.m888a(hhs.f20133a, "DoubleTapListener onDoubleTap event ignored.");
        } else {
            String valueOf2 = String.valueOf(hnj);
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
            stringBuilder2.append("Invalid double tap action option ");
            stringBuilder2.append(valueOf2);
            throw new IllegalStateException(stringBuilder2.toString());
        }
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        hnl hnl = this.f6771a.f6755f;
        if (Math.abs(f) > Math.abs(f2)) {
            return hnl.f6747a.mo7575a(f, false);
        }
        return hnl.f6747a.mo7575a(f2, true);
    }

    public final void onLongPress(MotionEvent motionEvent) {
        hnu hnu = this.f6771a;
        hnu.f6764o = true;
        hnu.f6757h.mo7974a();
        hnu = this.f6771a;
        hnp hnp = hnu.f6756g;
        hnu.mo7977a(motionEvent);
        hnp.mo13551d();
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f6771a.f6756g.mo7973c();
        hnu hnu = this.f6771a;
        switch (hnu.f6762m - 1) {
            case 0:
                if (hnu.f6767r > 0) {
                    return false;
                }
                boolean z;
                hnu.f6765p += f;
                hnu.f6766q += f2;
                float f3 = hnu.f6765p;
                if (f3 > 40.0f) {
                    z = true;
                } else if ((-f3) <= 40.0f) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    hnu.f6753d.mo13549a(f3);
                    this.f6771a.f6762m = C0252go.f5859bE;
                    return true;
                }
                f3 = hnu.f6766q;
                if (f3 > 40.0f) {
                    z = true;
                } else if ((-f3) <= 40.0f) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    return false;
                }
                hnu.f6754e.mo13552a(f3);
                this.f6771a.f6762m = C0252go.f5860bF;
                return true;
            case 1:
                hnu.f6753d.mo13549a(f);
                return true;
            case 2:
                hnu.f6754e.mo13552a(f2);
                return true;
            default:
                throw new IllegalStateException("Unknown scrolling state");
        }
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        hnu hnu = this.f6771a;
        return hnu.f6757h.mo7975a(hnu.mo7977a(motionEvent));
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        hnu hnu = this.f6771a;
        return hnu.f6757h.mo7976b(hnu.mo7977a(motionEvent));
    }
}
