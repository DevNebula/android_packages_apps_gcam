package p000;

import java.io.File;
import java.io.InputStream;

/* renamed from: gnb */
final /* synthetic */ class gnb implements Runnable {
    /* renamed from: a */
    private final gmz f5718a;
    /* renamed from: b */
    private final ixx f5719b;
    /* renamed from: c */
    private final InputStream f5720c;
    /* renamed from: d */
    private final kbg f5721d;
    /* renamed from: e */
    private final glz f5722e;

    gnb(gmz gmz, ixx ixx, InputStream inputStream, kbg kbg, glz glz) {
        this.f5718a = gmz;
        this.f5719b = ixx;
        this.f5720c = inputStream;
        this.f5721d = kbg;
        this.f5722e = glz;
    }

    public final void run() {
        gkt gkt = this.f5718a;
        ixx ixx = this.f5719b;
        InputStream inputStream = this.f5720c;
        kbg kbg = this.f5721d;
        glz glz = this.f5722e;
        File a = gkt.mo14927y().mo7436a(gkt.f24392i, ixx);
        try {
            gkt.f24407x.mo7377b(gkt.mo14926x().mo7392a(a, inputStream, kbg));
            gkt.f24380A.mo15641a(new gnd(gkt, a, ixx, glz));
        } catch (Throwable e) {
            bli.m892b(gmz.f26437a, "CameraFileUtil.writeFile() throws : ", e);
            gkt.f24380A.mo15642a(e);
        }
    }
}
