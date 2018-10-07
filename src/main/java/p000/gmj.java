package p000;

import java.io.File;
import java.io.InputStream;

/* renamed from: gmj */
final /* synthetic */ class gmj implements Runnable {
    /* renamed from: a */
    private final gmi f5672a;
    /* renamed from: b */
    private final ixx f5673b;
    /* renamed from: c */
    private final InputStream f5674c;
    /* renamed from: d */
    private final kbg f5675d;
    /* renamed from: e */
    private final glz f5676e;

    gmj(gmi gmi, ixx ixx, InputStream inputStream, kbg kbg, glz glz) {
        this.f5672a = gmi;
        this.f5673b = ixx;
        this.f5674c = inputStream;
        this.f5675d = kbg;
        this.f5676e = glz;
    }

    public final void run() {
        gkt gkt = this.f5672a;
        ixx ixx = this.f5673b;
        InputStream inputStream = this.f5674c;
        kbg kbg = this.f5675d;
        glz glz = this.f5676e;
        File a = gkt.mo14927y().mo7436a(gkt.f24392i, ixx);
        try {
            gkt.f24407x.mo7377b(gkt.mo14926x().mo7392a(a, inputStream, kbg));
            gkt.f24380A.mo15641a(glz.mo7219a(a));
        } catch (Throwable e) {
            bli.m892b(gmi.f26434a, "CameraFileUtil.writeFile() throws : ", e);
            gkt.f24380A.mo15642a(e);
        }
    }
}
