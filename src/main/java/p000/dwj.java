package p000;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.Camera.Area;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: dwj */
final class dwj extends SimpleOnGestureListener {
    /* renamed from: a */
    private final /* synthetic */ dwd f3527a;

    dwj(dwd dwd) {
        this.f3527a = dwd;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        dwd dwd = this.f3527a;
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        if (dwd.f26234w == C0252go.f5833af) {
            gwv gwv = dwd.f26229r;
            if (gwv.f19755f) {
                int i = gwv.f19754e;
                if (i != 2) {
                    if (gwv.f19760k != null && (i == 1 || i == 3 || i == 4)) {
                        gwv.mo13476a();
                    }
                    if (!(gwv.f19767r.width() == 0 || gwv.f19767r.height() == 0)) {
                        if (gwv.f19756g) {
                            if (gwv.f19760k == null) {
                                gwv.f19760k = new ArrayList();
                                gwv.f19760k.add(new Area(new Rect(), 1));
                            }
                            ((Area) gwv.f19760k.get(0)).rect = gwv.mo13475a(rawX, rawY, (int) (((float) Math.min(gwv.f19767r.width(), gwv.f19767r.height())) * gwv.f19750c));
                        }
                        if (gwv.f19757h) {
                            if (gwv.f19761l == null) {
                                gwv.f19761l = new ArrayList();
                                gwv.f19761l.add(new Area(new Rect(), 1));
                            }
                            ((Area) gwv.f19761l.get(0)).rect = gwv.mo13475a(rawX, rawY, (int) (((float) Math.min(gwv.f19767r.width(), gwv.f19767r.height())) * gwv.f19751d));
                        }
                        float f = (float) rawX;
                        float f2 = (float) rawY;
                        kow.m13878a(gwv.f19766q.mo12313a(new PointF(f, f2)).mo7897b(), new haj(gwv), iel.m3771a());
                        gwv.f19768s = new hin(f, f2, (float) gwv.f19767r.width(), (float) gwv.f19767r.height());
                        gwv.f19769t = System.currentTimeMillis();
                        gwv.f19764o.mo7489u();
                        gwv.f19764o.mo7487s();
                        if (gwv.f19756g) {
                            gwv.mo13477a(1);
                        } else {
                            gwv.f19763n.removeMessages(0);
                            gwv.f19763n.sendEmptyMessageDelayed(0, (long) gwv.f19749b);
                        }
                    }
                }
            }
        }
        return true;
    }
}
