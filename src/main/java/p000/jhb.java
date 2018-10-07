package p000;

import android.media.MediaMuxer;
import android.util.Log;
import java.io.FileDescriptor;

/* renamed from: jhb */
final /* synthetic */ class jhb implements Runnable {
    /* renamed from: a */
    private final jgz f8194a;

    jhb(jgz jgz) {
        this.f8194a = jgz;
    }

    public final void run() {
        jgz jgz = this.f8194a;
        kbg b = kbg.m4803b((Integer) kow.m13881c(jgz.f21480c));
        kbg b2 = kbg.m4803b((Float) kow.m13881c(jgz.f21481d));
        kbg b3 = kbg.m4803b((Float) kow.m13881c(jgz.f21482e));
        jgw jgw = (jgw) kow.m13881c(jgz.f21479b);
        try {
            Object mediaMuxer;
            if (jgw.f8182a.mo9709b()) {
                mediaMuxer = new MediaMuxer((String) jgw.f8182a.mo9706a(), 0);
            } else {
                mediaMuxer = new MediaMuxer((FileDescriptor) jgw.f8183b.mo9706a(), 0);
            }
            if (b.mo9709b()) {
                mediaMuxer.setOrientationHint(((Integer) b.mo9706a()).intValue());
            }
            if (b2.mo9709b() && b3.mo9709b()) {
                mediaMuxer.setLocation(((Float) b2.mo9706a()).floatValue(), ((Float) b3.mo9706a()).floatValue());
            }
            jgz.f21483f.mo15641a(mediaMuxer);
        } catch (Throwable e) {
            Log.e("MuxerImpl", "Error trying to construct MediaMuxer.", e);
            jgz.f21483f.mo15642a(e);
            throw new RuntimeException(e);
        }
    }
}
