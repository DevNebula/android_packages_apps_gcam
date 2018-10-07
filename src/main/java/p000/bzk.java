package p000;

import com.google.googlex.gcam.EncodedBlobCallback;
import com.google.googlex.gcam.SWIGTYPE_p_unsigned_char;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: bzk */
final class bzk extends EncodedBlobCallback {
    /* renamed from: a */
    private final /* synthetic */ bzx f12049a;
    /* renamed from: b */
    private final /* synthetic */ bze f12050b;

    bzk(bze bze, bzx bzx) {
        this.f12050b = bze;
        this.f12049a = bzx;
    }

    public final void Run(int i, SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char, long j, int i2, int i3) {
        boolean z;
        bli.m888a(bze.f1762a, String.format(null, "Gcam merged DNG data ready: %d bytes, shotId = %d", new Object[]{Long.valueOf(j), Integer.valueOf(i)}));
        if (this.f12050b.f1780s == C0252go.f5954z) {
            z = true;
        } else {
            z = false;
        }
        jri.m13405b(z);
        jri.m13406b(this.f12049a.mo2235b().mo9709b(), (Object) "Got merged DNG callback but no callback present");
        cag cag = (cag) this.f12049a.mo2235b().mo9706a();
        iqo bzw = new bzw(sWIGTYPE_p_unsigned_char, j, i2, i3);
        if (cag.f1820a.f4982b.mo13382k() == glw.RAW) {
            fqv a = cag.f1821b.mo9715b();
            jri.m13404b((Object) a);
            ByteBuffer duplicate = bzw.f12064a.duplicate();
            iqp a2 = iqp.m4101a(bzw.f12065b, bzw.f12066c);
            iqm a3 = iqm.m4095a(cag.f1822c);
            ikb ikb = cag.f1820a.f4981a.f4680g;
            String str = fqu.f18662a;
            String valueOf = String.valueOf(a.f24299b);
            int capacity = duplicate.capacity();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 58);
            stringBuilder.append("Called addDngImage with burstId ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" and file size ");
            stringBuilder.append(capacity);
            bli.m894c(str, stringBuilder.toString());
            try {
                byte[] bArr = new byte[duplicate.capacity()];
                duplicate.get(bArr);
                long l = a.f24298a.mo13383l();
                gkr gkr = a.f24298a;
                gkr gkr2 = gkr;
                gkr2.mo13367a(new bnm(gkr.mo13385n(), 0, l, l, a.f24299b, a3, a2.f7695a, a2.f7696b, bArr, null, gdy.m2550c().mo7062a(), bve.DNG, false, "DNG"));
                a.f24302e.f18664c.mo9168a(0.0f, a.f24298a.mo13383l());
                synchronized (a) {
                    a.f24301d = true;
                    a.mo14901a(ikb);
                }
            } finally {
                bzw.close();
            }
        } else {
            cag.f1823d.f12196h.mo8834c("Got onDngReady() callback with raw data but did not request it");
        }
    }
}
