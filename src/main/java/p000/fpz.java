package p000;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: fpz */
final class fpz implements frg {
    /* renamed from: a */
    private final gkr f18617a;
    /* renamed from: b */
    private final iqm f18618b;
    /* renamed from: c */
    private final gfa f18619c;
    /* renamed from: d */
    private final gfn f18620d;
    /* renamed from: e */
    private final /* synthetic */ fpy f18621e;

    public fpz(fpy fpy, gkr gkr, iqm iqm, gfa gfa, gfn gfn) {
        this.f18621e = fpy;
        this.f18617a = gkr;
        this.f18618b = iqm;
        this.f18619c = gfa;
        this.f18620d = gfn;
    }

    /* renamed from: a */
    public final void mo6874a(kbg kbg, kbg kbg2, kpk kpk) {
        if (kbg2.mo9709b()) {
            ((iwz) kbg2.mo9706a()).close();
        }
        if (kbg.mo9709b()) {
            Set hashSet = new HashSet();
            hashSet.add(gfi.COMPRESS_TO_JPEG_AND_WRITE_TO_DISK);
            hashSet.add(gfi.CLOSE_ON_ALL_TASKS_RELEASE);
            try {
                this.f18619c.mo7108a(new gfw((iwz) kbg.mo9706a(), this.f18618b, kpk, this.f18621e.f18614c), this.f18621e.f18613b, hashSet, this.f18617a, kbg.m4804c(this.f18620d));
                return;
            } catch (Throwable e) {
                bli.m892b(fpy.f18612a, "ImageBackend failed to receive an image! Aborting session.", e);
                this.f18617a.mo7076a(hci.m11977a(), true, e.getMessage());
                return;
            }
        }
        bli.m891b(fpy.f18612a, "JpegImageBackendImageSaver received an image, but it did not have any image data!");
        this.f18617a.mo7076a(hci.m11977a(), true, "JpegImageBackendImageSaver received an image, but it did not have any image data!");
    }
}
