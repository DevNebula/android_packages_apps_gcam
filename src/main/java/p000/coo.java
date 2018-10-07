package p000;

import android.net.Uri;
import java.io.File;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: coo */
final class coo implements Callable {
    /* renamed from: a */
    private final File f2719a;
    /* renamed from: b */
    private final gob f2720b;
    /* renamed from: c */
    private final long f2721c;
    /* renamed from: d */
    private final String f2722d;
    /* renamed from: e */
    private final jqs f2723e;

    public coo(gob gob, File file, String str, long j, jqs jqs) {
        this.f2719a = file;
        this.f2720b = gob;
        this.f2721c = j;
        this.f2722d = str;
        this.f2723e = jqs;
    }

    public final /* synthetic */ Object call() {
        gob gob = this.f2720b;
        gob.mo13389a(this.f2719a, this.f2722d, this.f2723e.mo9534b(), this.f2723e.mo9533a(), this.f2721c);
        god god = gob.f19414d;
        Uri uri = gob.f19412b;
        god.mo7271b();
        return izg.f7956a;
    }
}
