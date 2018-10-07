package p000;

import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* renamed from: gmd */
final /* synthetic */ class gmd implements Callable {
    /* renamed from: a */
    private final gmb f5654a;
    /* renamed from: b */
    private final ixx f5655b;
    /* renamed from: c */
    private final InputStream f5656c;
    /* renamed from: d */
    private final kbg f5657d;

    gmd(gmb gmb, ixx ixx, InputStream inputStream, kbg kbg) {
        this.f5654a = gmb;
        this.f5655b = ixx;
        this.f5656c = inputStream;
        this.f5657d = kbg;
    }

    public final Object call() {
        gkt gkt = this.f5654a;
        ixx ixx = this.f5655b;
        InputStream inputStream = this.f5656c;
        kbg kbg = this.f5657d;
        File a = gkt.mo14927y().mo7436a(gkt.f24392i, ixx);
        gkt.f24407x.mo7377b(gkt.mo14926x().mo7392a(a, inputStream, kbg));
        return a;
    }
}
