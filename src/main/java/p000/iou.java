package p000;

import android.media.AudioManager;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.view.Surface;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: iou */
public final class iou implements iqo {
    /* renamed from: a */
    public final inm f21153a;
    /* renamed from: b */
    public final inp f21154b;
    /* renamed from: c */
    public final Handler f21155c;
    /* renamed from: d */
    public final ilp f21156d;
    /* renamed from: e */
    public final kbg f21157e;
    /* renamed from: f */
    public final gtf f21158f;
    /* renamed from: g */
    public final bja f21159g;
    /* renamed from: h */
    public final int f21160h;
    /* renamed from: i */
    public final kbg f21161i;
    /* renamed from: j */
    public final ird f21162j;
    /* renamed from: k */
    public final kbg f21163k;
    /* renamed from: l */
    public int f21164l;
    /* renamed from: m */
    public File f21165m;
    /* renamed from: n */
    public final ing f21166n;
    /* renamed from: o */
    public kbg f21167o;
    /* renamed from: p */
    public final AudioManager f21168p;
    /* renamed from: q */
    public final iov f21169q;
    /* renamed from: r */
    public final kpm f21170r;
    /* renamed from: s */
    private final Executor f21171s;
    /* renamed from: t */
    private final guf f21172t;
    /* renamed from: u */
    private final Object f21173u = new Object();
    /* renamed from: v */
    private boolean f21174v = false;

    public iou(ilp ilp, AudioManager audioManager, bkm bkm, inm inm, inp inp, Executor executor, Handler handler, ing ing, ilp ilp2, kbg kbg, boolean z, guf guf, gtf gtf, bja bja, int i, kbg kbg2, kbg kbg3, ird ird) {
        this.f21168p = audioManager;
        this.f21153a = inm;
        this.f21154b = inp;
        this.f21171s = executor;
        this.f21155c = handler;
        this.f21156d = ilp2;
        this.f21157e = kbg;
        this.f21172t = guf;
        this.f21158f = gtf;
        this.f21159g = bja;
        this.f21160h = i;
        this.f21161i = kbg3;
        this.f21163k = kbg2;
        this.f21162j = ird;
        this.f21166n = ing;
        if (z) {
            this.f21167o = kbg.m4804c(MediaCodec.createPersistentInputSurface());
        } else {
            this.f21167o = kau.f21835a;
        }
        this.f21169q = new iov(bkm, ilp);
        boolean b = this.f21167o.mo9709b();
        StringBuilder stringBuilder = new StringBuilder(63);
        stringBuilder.append("persistent surface requested=");
        stringBuilder.append(z);
        stringBuilder.append(" and actually available=");
        stringBuilder.append(b);
        bli.m888a("VideoRecPreImp2", stringBuilder.toString());
        this.f21170r = khx.m5001a(iel.m3772a("VidMedCod", 2));
    }

    public final void close() {
        synchronized (this.f21173u) {
            if (this.f21174v) {
                bli.m891b("VideoRecPreImp2", "close twice!");
                return;
            }
            bli.m888a("VideoRecPreImp2", "close");
            this.f21174v = true;
            if (this.f21163k.mo9709b()) {
                bli.m888a("VideoRecPreImp2", "Close video intent file descriptor.");
                try {
                    ((ParcelFileDescriptor) this.f21163k.mo9706a()).close();
                } catch (IOException e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 39);
                    stringBuilder.append("Error on closing intentFileDescriptor: ");
                    stringBuilder.append(valueOf);
                    bli.m891b("VideoRecPreImp2", stringBuilder.toString());
                }
            }
            if (this.f21167o.mo9709b()) {
                bli.m888a("VideoRecPreImp2", "Persistent surface is now closed.");
                ((Surface) this.f21167o.mo9706a()).release();
            }
            this.f21169q.close();
            this.f21170r.shutdown();
            return;
        }
    }

    /* renamed from: a */
    public final kpk mo13696a() {
        return kny.m18476a(this.f21172t.mo7456a(true), new bkr(this), this.f21171s);
    }
}
