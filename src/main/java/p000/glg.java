package p000;

import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayList;

/* renamed from: glg */
final /* synthetic */ class glg implements Runnable {
    /* renamed from: a */
    private final glf f5600a;
    /* renamed from: b */
    private final gmq f5601b;
    /* renamed from: c */
    private final glz f5602c;
    /* renamed from: d */
    private final InputStream f5603d;
    /* renamed from: e */
    private final kpw f5604e;

    glg(glf glf, gmq gmq, glz glz, InputStream inputStream, kpw kpw) {
        this.f5600a = glf;
        this.f5601b = gmq;
        this.f5602c = glz;
        this.f5603d = inputStream;
        this.f5604e = kpw;
    }

    public final void run() {
        glf glf = this.f5600a;
        gmq gmq = this.f5601b;
        glz glz = this.f5602c;
        InputStream inputStream = this.f5603d;
        knk knk = this.f5604e;
        try {
            gmp gmp = glf.f24415e;
            ixx ixx = glz.f5643b;
            iqp iqp = glz.f5642a;
            if (ixx.mo9169a()) {
                gmp.f5695b.mo7404a(gmq.f5697b, gmp.f5694a.getContentResolver(), gmq.f5696a, gmq.f5698c, glz.f5647f, ((Long) glz.f5646e.mo9707a(Long.valueOf(0))).longValue(), inputStream, iqp.f7695a, iqp.f7696b, ixx);
            } else {
                gmp.f5695b.mo7403a(gmq.f5697b, gmp.f5694a.getContentResolver(), gmq.f5696a, gmq.f5698c, glz.f5647f, ((Integer) glz.f5644c.mo9707a(Integer.valueOf(0))).intValue(), glz.f5645d, inputStream, iqp.f7695a, iqp.f7696b, ixx);
            }
        } catch (Throwable e) {
            bli.m892b(glf.f24410a, "Failed to persist image!", e);
        }
        if (glf.f24417g != null) {
            glf.mo14932r();
            glf.f24419i.mo7378c();
            glf.f24414d.mo7249a((Uri) jri.m13404b(glf.f24417g), new ArrayList());
            glf.mo14929a("capturePersisted");
        } else {
            glf.mo14931q();
            glf.mo14929a("captureFailed");
            glf.mo7076a(hci.m11977a(), true, "Failed to persist capture, there is no uri.");
        }
        knk.mo15641a(kbg.m4803b(glf.f24417g));
    }
}
