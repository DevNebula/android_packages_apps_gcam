package p000;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: frb */
final class frb implements frg {
    /* renamed from: a */
    private final gkr f18686a;
    /* renamed from: b */
    private final iqm f18687b;
    /* renamed from: c */
    private final gfn f18688c;
    /* renamed from: d */
    private final fsq f18689d;
    /* renamed from: e */
    private final /* synthetic */ fra f18690e;

    public frb(fra fra, gkr gkr, iqm iqm, gfn gfn, fsq fsq) {
        this.f18690e = fra;
        this.f18686a = gkr;
        this.f18687b = iqm;
        this.f18688c = gfn;
        this.f18689d = fsq;
    }

    /* renamed from: a */
    public final void mo6874a(kbg kbg, kbg kbg2, kpk kpk) {
        try {
            if (kbg2.mo9709b()) {
                ((iwz) kbg2.mo9706a()).close();
            }
            Set hashSet = new HashSet();
            hashSet.add(gfi.CREATE_EARLY_FILMSTRIP_PREVIEW);
            hashSet.add(gfi.CONVERT_TO_RGB_PREVIEW);
            hashSet.add(gfi.COMPRESS_TO_JPEG_AND_WRITE_TO_DISK);
            hashSet.add(gfi.CLOSE_ON_ALL_TASKS_RELEASE);
            if (kbg.mo9709b()) {
                this.f18689d.f4923b.add(kpk);
                this.f18690e.f18681b.mo7108a(new gfw((iwz) kbg.mo9706a(), this.f18687b, kpk, this.f18690e.f18682c, this.f18686a.mo13383l(), null, null), this.f18690e.f18683d, hashSet, this.f18686a, kbg.m4804c(this.f18688c));
            } else {
                bli.m891b(fra.f18680a, "JpegImageBackendImageSaver received an image, but it did not have any image data!");
                this.f18686a.mo7076a(hci.m11977a(), true, "JpegImageBackendImageSaver received an image, but it did not have any image data!");
            }
            this.f18689d.close();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } catch (Throwable th) {
            this.f18689d.close();
        }
    }
}
