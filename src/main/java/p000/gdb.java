package p000;

import com.google.googlex.gcam.GoudaCompleteCallback;

/* compiled from: PG */
/* renamed from: gdb */
final class gdb extends GoudaCompleteCallback {
    /* renamed from: a */
    private final /* synthetic */ kpw f19062a;
    /* renamed from: b */
    private final /* synthetic */ gdv f19063b;

    gdb(kpw kpw, gdv gdv) {
        this.f19062a = kpw;
        this.f19063b = gdv;
    }

    public final void Run(long j) {
        String str = gcv.f19024a;
        StringBuilder stringBuilder = new StringBuilder(41);
        stringBuilder.append("Gouda complete: id = ");
        stringBuilder.append(j);
        bli.m888a(str, stringBuilder.toString());
        this.f19062a.mo15641a(Boolean.valueOf(true));
        gdv gdv = this.f19063b;
        if (gdv != null) {
            kln kln = gdv.f5338b.f25520b;
            long currentTimeMillis = System.currentTimeMillis();
            cau cau = gdv.f5338b;
            kln.f25268b = (int) (currentTimeMillis - cau.f25527i);
            cau.f25529k = true;
            cau.mo15476a(j);
        }
    }
}
