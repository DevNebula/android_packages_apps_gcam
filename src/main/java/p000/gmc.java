package p000;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: gmc */
final /* synthetic */ class gmc implements Runnable {
    /* renamed from: a */
    private final gmb f5649a;
    /* renamed from: b */
    private final glz f5650b;
    /* renamed from: c */
    private final InputStream f5651c;
    /* renamed from: d */
    private final kbg f5652d;
    /* renamed from: e */
    private final ixx f5653e;

    gmc(gmb gmb, glz glz, InputStream inputStream, kbg kbg, ixx ixx) {
        this.f5649a = gmb;
        this.f5650b = glz;
        this.f5651c = inputStream;
        this.f5652d = kbg;
        this.f5653e = ixx;
    }

    public final void run() {
        kpk a;
        gkt gkt = this.f5649a;
        glz glz = this.f5650b;
        InputStream inputStream = this.f5651c;
        kbg kbg = this.f5652d;
        ixx ixx = this.f5653e;
        if (gkt.f26431a.mo9709b()) {
            a = ((etc) gkt.f26431a.mo9706a()).mo6577a(gkt.f24402s, inputStream, kbg, gkt.mo14927y().mo7438a(gkt.f24406w, new SimpleDateFormat("'MVIMG'_yyyyMMdd_HHmmss", Locale.US)), gkt.f24392i, gkt.f24407x);
        } else {
            a = kpl.m13884a(new gmd(gkt, ixx, inputStream, kbg));
            a.run();
        }
        kow.m13878a(a, new gme(gkt, glz), gkt.f24399p);
    }
}
