package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: dey */
final class dey implements aat {
    /* renamed from: a */
    private final /* synthetic */ des f13730a;

    dey(des des) {
        this.f13730a = des;
    }

    /* renamed from: a */
    public final void mo42a() {
        boolean z = false;
        des des = this.f13730a;
        ejy ejy = des.f25987v;
        if (ejy != null) {
            des.f25977l = true;
            ejy.f3951v = true;
            des.f25969d.f4130b = true;
            ejy.f3931b.f3965G = false;
            des.f25974i.start();
            des = this.f13730a;
            des.mo15496m();
            des.f25921E.mo6694a(0, 0, true);
            try {
                des = this.f13730a;
                if (des.f25987v.mo6268b() <= 0.0f) {
                    z = true;
                }
                des.f25924H = z;
                des des2 = this.f13730a;
                Handler handler = des2.f25925I;
                if (handler != null) {
                    if (handler != null) {
                        handler.obtainMessage(1).sendToTarget();
                        des2.f25925I.obtainMessage(2, des2.f25991z, des2.f25917A).sendToTarget();
                    }
                    des2 = this.f13730a;
                    des2.f25987v.f3952w = des2.f25926J;
                }
                this.f13730a.mo15495c(true);
            } catch (IllegalStateException e) {
            }
        }
    }
}
