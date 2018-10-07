package p000;

import android.os.ParcelFileDescriptor;
import android.view.Surface;
import java.io.File;
import java.io.FileDescriptor;

/* compiled from: PG */
/* renamed from: bev */
final class bev implements iju {
    /* renamed from: a */
    private final /* synthetic */ bfs f11222a;
    /* renamed from: b */
    private final /* synthetic */ bem f11223b;

    bev(bem bem, bfs bfs) {
        this.f11223b = bem;
        this.f11222a = bfs;
    }

    /* renamed from: a */
    private final kpk m7376a(File file, ios ios) {
        kpk a;
        synchronized (this.f11223b.f22627s) {
            if (this.f11223b.f22626r.equals(bey.CLOSED)) {
                String valueOf = String.valueOf(this.f11223b.f22626r);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
                stringBuilder.append("CamcorderCaptureSessionImpl state=");
                stringBuilder.append(valueOf);
                throw new IllegalStateException(stringBuilder.toString());
            }
            jri.m13395a(this.f11223b.f22626r.equals(bey.STARTING_RECORD));
            this.f11223b.f22626r = bey.RECORDING;
            long currentTimeMillis = System.currentTimeMillis();
            bem bem = this.f11223b;
            bhj bhj = bem.f22623o;
            bhs bhs = bem.f22624p;
            Surface surface = bem.f22621m;
            Surface surface2 = (Surface) ios.mo13690a().mo9706a();
            bem bem2 = this.f11223b;
            bhc bhc = new bhc(bhj, bhs, surface, surface2, bem2.f22610b, bem2.f22620l);
            bic bic = this.f11223b.f22620l;
            Surface surface3 = (Surface) ios.mo13690a().mo9706a();
            bem = this.f11223b;
            bib bib = new bib(bic, surface3, bem.f22623o, bem.f22624p);
            kbg kbg = kau.f21835a;
            if (kbg.m4803b(ios.f21142d).mo9709b()) {
                kbg = kbg.m4804c(ParcelFileDescriptor.dup((FileDescriptor) kbg.m4803b(ios.f21142d).mo9706a()));
            }
            kbg kbg2 = kau.f21835a;
            Object obj = this.f11223b;
            obj.f22625q = new bgb(this.f11222a, obj, obj.f22611c, obj.f22623o, obj.f22615g, obj.f22616h, obj.f22617i, obj.f22618j, file, obj.f22613e, obj.f22614f, ios, new hke(), kbg2, currentTimeMillis, bhc, bib, kbg, this.f11223b.f22624p);
            a = kow.m13873a(this.f11223b.f22625q);
        }
        return a;
    }
}
