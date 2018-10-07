package p000;

import java.io.File;

/* compiled from: PG */
/* renamed from: ezc */
public final class ezc implements ezi, kbn {
    /* renamed from: a */
    private final esd f18055a;
    /* renamed from: b */
    private final File f18056b;
    /* renamed from: c */
    private final long f18057c;
    /* renamed from: d */
    private final int f18058d;
    /* renamed from: e */
    private final long f18059e;
    /* renamed from: f */
    private final euw f18060f;
    /* renamed from: g */
    private final kpw f18061g;
    /* renamed from: h */
    private final kpk f18062h;
    /* renamed from: i */
    private final kpw f18063i;

    public ezc(esd esd, File file, long j, int i, long j2, euw euw, kpw kpw, kpk kpk, fah fah, kpw kpw2) {
        this.f18055a = esd;
        this.f18056b = file;
        this.f18057c = j;
        this.f18058d = i;
        this.f18059e = j2;
        this.f18060f = euw;
        this.f18061g = kpw;
        this.f18062h = kpk;
        this.f18063i = kpw2;
    }

    /* renamed from: a */
    public final String mo6686a() {
        throw new NoSuchMethodError();
    }

    /* renamed from: b */
    public final Object mo9715b() {
        esd esd = this.f18055a;
        File file = this.f18056b;
        long j = this.f18057c;
        int i = this.f18058d;
        long j2 = this.f18059e;
        euw euw = this.f18060f;
        kpw kpw = this.f18061g;
        kpk kpk = this.f18062h;
        knk knk = this.f18063i;
        String str = esd.f17704a;
        String valueOf = String.valueOf(file);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 53);
        stringBuilder.append("Created muxer for ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" for shutter <");
        stringBuilder.append(j);
        stringBuilder.append(">");
        bli.m888a(str, stringBuilder.toString());
        euh euh = esd.f17708e;
        Object fai = new fai(new eus(new eup(new etp(((jhj) new jhj(esd.f17705b).mo13800a(file)).mo13799a(i).mo13801b().mo13798a(), j2, kpw, kpk, esd.f17705b)), euw));
        knk.mo15641a(fai);
        return fai.f4635a;
    }

    /* renamed from: a */
    public final boolean mo6687a(gid gid, gid gid2) {
        throw new NoSuchMethodError();
    }
}
