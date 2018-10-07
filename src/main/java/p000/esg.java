package p000;

import android.net.Uri;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: esg */
final /* synthetic */ class esg implements Runnable {
    /* renamed from: a */
    private final esd f4417a;
    /* renamed from: b */
    private final esu f4418b;
    /* renamed from: c */
    private final long f4419c;
    /* renamed from: d */
    private final File f4420d;
    /* renamed from: e */
    private final int f4421e;
    /* renamed from: f */
    private final kpk f4422f;
    /* renamed from: g */
    private final Uri f4423g;

    esg(esd esd, esu esu, long j, File file, int i, kpk kpk, Uri uri) {
        this.f4417a = esd;
        this.f4418b = esu;
        this.f4419c = j;
        this.f4420d = file;
        this.f4421e = i;
        this.f4422f = kpk;
        this.f4423g = uri;
    }

    public final void run() {
        eug a;
        esd esd = this.f4417a;
        Object obj = this.f4418b;
        long j = this.f4419c;
        File file = this.f4420d;
        int i = this.f4421e;
        kpk kpk = this.f4422f;
        Uri uri = this.f4423g;
        esu esu = (esu) jri.m13404b(obj);
        eyb eyb = esu.f4441b;
        if (eyb != null) {
            eyb.f18006b.mo12448a(eyb.f18008d);
        }
        synchronized (esd.f17710g) {
            esd.f17714k.remove(Long.valueOf(j));
            ety ety = new ety(esd);
            String str = esd.f17704a;
            String valueOf = String.valueOf(file);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
            stringBuilder.append("Attempting to take microvideo for ");
            stringBuilder.append(valueOf);
            bli.m888a(str, stringBuilder.toString());
            eyy eyy = esu.f4444e;
            eyt eyv = new eyv(eyy.f4601a, TimeUnit.NANOSECONDS.convert(j, TimeUnit.MICROSECONDS), (List) eyy.f4602b.mo10566a(), esd.f17711h, eyy.f4604d, eyy.f4603c);
            bsn bsn = eyy.f4603c.f1335a;
            long a2 = eyv.mo6681a();
            euw euw = new euw();
            kpk d = kpw.m18486d();
            fah fah = new fah();
            kpw d2 = kpw.m18486d();
            ezc ezc = new ezc(esd, file, a2, i, j, euw, d, kpk, fah, d2);
            valueOf = esd.f17704a;
            stringBuilder = new StringBuilder(55);
            stringBuilder.append("We have starting timestamp CROSS <");
            stringBuilder.append(a2);
            stringBuilder.append(">");
            bli.m888a(valueOf, stringBuilder.toString());
            a = esu.f4440a.mo6599a(ezc, Math.max(0, a2), j);
            a.f17821g.mo15644b(d);
            esd.f17709f.put(uri, new eso(a, file, euw, esd.f17712i, System.currentTimeMillis(), esd.f17711h));
            esd.f17713j = esd.f17712i + 1500000;
            eyv.mo6682a(new ess(d2, fah, new ezr(file, a)));
            bli.m888a(esd.f17704a, "startup done HLINE");
        }
        a.f17819e.mo10200a(esf.f4416a, esd.f17705b);
    }
}
