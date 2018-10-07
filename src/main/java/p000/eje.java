package p000;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.WindowManager;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;

/* compiled from: PG */
/* renamed from: eje */
public final class eje {
    /* renamed from: g */
    private static final String f3860g = bli.m887a("CameraSetupAgent");
    /* renamed from: a */
    public final Handler f3861a;
    /* renamed from: b */
    public aah f3862b = null;
    /* renamed from: c */
    public aag f3863c;
    /* renamed from: d */
    public boolean f3864d;
    /* renamed from: e */
    public boolean f3865e = false;
    /* renamed from: f */
    private abw f3866f;
    /* renamed from: h */
    private SurfaceTexture f3867h = new SurfaceTexture(100);

    public eje(aah aah, Handler handler) {
        this.f3862b = aah;
        this.f3861a = handler;
    }

    /* renamed from: a */
    public final synchronized abw mo6233a(WindowManager windowManager, Context context, aag aag, boolean z, int i) {
        abw abw = null;
        synchronized (this) {
            this.f3863c = aag;
            this.f3864d = true;
            aah aah = this.f3862b;
            if (aah == null) {
                bli.m894c(f3860g, "Camera is null");
            } else if (aah.mo23d().mo77a() == 1) {
                bli.m894c(f3860g, "Camera is closed");
            } else {
                aaz e = this.f3862b.mo24e();
                this.f3862b.mo16a(false);
                if (z && i != 0) {
                    iqm b;
                    abo i2 = this.f3862b.mo28i();
                    if (ejh.m1815a(context, e) == abc.AUTO) {
                        this.f3865e = true;
                    }
                    i2.f151q = ejh.m1815a(context, e);
                    i2.f150p = ejh.m1814a(e);
                    i2.f152r = ejh.m1819c(e);
                    i2.mo68a(1.0f);
                    ejg a = ejf.m1811a(e, i);
                    this.f3866f = a.f3872a;
                    i2.mo73b(this.f3866f);
                    ejh.m1817a(e, i2);
                    i2.f159y = new abw(0, 0);
                    i2.mo69a(100);
                    i2.mo71a(a.f3873b);
                    switch (windowManager.getDefaultDisplay().getRotation()) {
                        case 0:
                            b = iqm.m4097b(0);
                            break;
                        case 1:
                            b = iqm.m4097b(90);
                            break;
                        case 2:
                            b = iqm.m4097b(MediaDecoder.ROTATE_180);
                            break;
                        case 3:
                            b = iqm.m4097b(MediaDecoder.ROTATE_90_LEFT);
                            break;
                        default:
                            b = iqm.CLOCKWISE_0;
                            break;
                    }
                    this.f3862b.mo9a(b.mo8806a());
                    this.f3862b.mo18a(i2);
                    float f = e.f67u;
                    StringBuilder stringBuilder = new StringBuilder(40);
                    stringBuilder.append("Field of view reported = ");
                    stringBuilder.append(f);
                }
                this.f3862b.mo10a(this.f3867h);
                if (this.f3864d) {
                    ejh.m1816a(this.f3862b, this.f3866f, this.f3861a, this.f3863c);
                } else {
                    this.f3862b.mo11a(this.f3861a, this.f3863c);
                }
                abw = this.f3866f;
            }
        }
        return abw;
    }
}
