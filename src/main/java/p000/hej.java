package p000;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback2;

/* compiled from: PG */
/* renamed from: hej */
final class hej implements Callback2 {
    /* renamed from: a */
    private final /* synthetic */ hei f6456a;

    hej(hei hei) {
        this.f6456a = hei;
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        boolean z = false;
        iqp iqp = new iqp(i2, i3);
        Surface surface = surfaceHolder.getSurface();
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        ipz a = ipz.m4077b(iqp).mo8750a();
        iqz iqz = this.f6456a.f19975b;
        String valueOf = String.valueOf(iqp);
        String valueOf2 = String.valueOf(a);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 53) + String.valueOf(valueOf2).length());
        stringBuilder.append("SurfaceEvent: surfaceChanged (newSize: ");
        stringBuilder.append(valueOf);
        stringBuilder.append(", newRatio: ");
        stringBuilder.append(valueOf2);
        stringBuilder.append(" )");
        iqz.mo8832b(stringBuilder.toString());
        iqz iqz2 = this.f6456a.f19975b;
        int width = surfaceFrame.width();
        int height = surfaceFrame.height();
        StringBuilder stringBuilder2 = new StringBuilder(68);
        stringBuilder2.append("SurfaceEvent: surfaceChanged (surfaceFrame: ");
        stringBuilder2.append(width);
        stringBuilder2.append("x");
        stringBuilder2.append(height);
        stringBuilder2.append(")");
        iqz2.mo8832b(stringBuilder2.toString());
        if (!this.f6456a.f19981h.isDone()) {
            boolean b;
            iqz iqz3;
            hei hei = this.f6456a;
            if (surface.isValid()) {
                a = ipz.m4077b(iqp).mo8750a();
                ipz a2 = hei.f19979f.f6472b.mo8750a();
                b = kbf.m16778b(a, a2);
                if (!b) {
                    iqz3 = hei.f19975b;
                    valueOf2 = String.valueOf(a.mo8750a());
                    String valueOf3 = String.valueOf(a2.mo8750a());
                    StringBuilder stringBuilder3 = new StringBuilder((String.valueOf(valueOf2).length() + 47) + String.valueOf(valueOf3).length());
                    stringBuilder3.append("Aspect ratios do not match! surface: ");
                    stringBuilder3.append(valueOf2);
                    stringBuilder3.append(" preview: ");
                    stringBuilder3.append(valueOf3);
                    iqz3.mo8837e(stringBuilder3.toString());
                }
            } else {
                b = false;
            }
            if (b) {
                hei hei2 = this.f6456a;
                iqz3 = hei2.f19975b;
                String valueOf4 = String.valueOf(hei2.f19979f.f6471a);
                StringBuilder stringBuilder4 = new StringBuilder(String.valueOf(valueOf4).length() + 47);
                stringBuilder4.append("Setting fixed size after surfaceChanged event: ");
                stringBuilder4.append(valueOf4);
                iqz3.mo8836d(stringBuilder4.toString());
                gsg gsg = this.f6456a.f19980g;
                if (gsg.f19558c == 0) {
                    z = true;
                }
                jri.m13406b(z, (Object) "Accidental session reuse.");
                iya iya = gsg.f2599m;
                gsg.f19558c = SystemClock.elapsedRealtimeNanos();
                gsg.mo2699a("Surface Start", gsg.f19556a, "Surface Ready", gsg.f19558c);
                hei2 = this.f6456a;
                hmz hmz = hei2.f19976c;
                iqp iqp2 = hei2.f19979f.f6471a;
                hmz.mo7971a(iqp2.f7695a, iqp2.f7696b);
                hei2 = this.f6456a;
                hei2.f19982i = hei2.f19974a.mo7969a(hei2.f19976c.getHolder(), this.f6456a.f19979f.f6471a.mo8817e());
                hei2 = this.f6456a;
                hei2.f19982i.mo13547a(hei2.f19977d.mo7041f());
                hei2 = this.f6456a;
                hei2.f19981h.mo15644b(hei2.f19982i.mo13545a());
            }
        }
        hmx hmx = this.f6456a.f19982i;
        if (hmx != null) {
            hmx.mo13546a(iqp.mo8817e());
        }
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        boolean z;
        this.f6456a.f19975b.mo8832b("SurfaceEvent: surfaceCreated");
        gsg gsg = this.f6456a.f19980g;
        if (gsg.f19557b == 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13406b(z, (Object) "Accidental session reuse.");
        iya iya = gsg.f2599m;
        gsg.f19557b = SystemClock.elapsedRealtimeNanos();
        gsg.mo2698a("Surface Created", gsg.f19556a, gsg.f19557b);
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        hmx hmx = this.f6456a.f19982i;
        if (hmx != null) {
            hmx.close();
            this.f6456a.f19982i = null;
        }
        this.f6456a.f19975b.mo8832b("SurfaceEvent: surfaceDestroyed");
        if (!this.f6456a.f19981h.isDone()) {
            this.f6456a.f19975b.mo8838f("A previous future exists, but the active Surface object is null. Setting exception. Surface has been destroyed.");
            this.f6456a.f19981h.mo15642a(new isr("Surface has been destroyed."));
        }
        this.f6456a.f19978e.run();
    }

    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
        this.f6456a.f19975b.mo8832b("SurfaceEvent: surfaceRedrawNeeded");
    }
}
