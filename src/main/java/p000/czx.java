package p000;

/* renamed from: czx */
final /* synthetic */ class czx implements gua {
    /* renamed from: a */
    private final czw f13648a;

    czx(czw czw) {
        this.f13648a = czw;
    }

    /* renamed from: a */
    public final void mo7454a(long j) {
        czw czw = this.f13648a;
        if (j <= 120000000) {
            iqz iqz = czw.f3104g;
            StringBuilder stringBuilder = new StringBuilder(70);
            stringBuilder.append("Low storage alert triggered for burst. Free space=");
            stringBuilder.append(j);
            iqz.mo8838f(stringBuilder.toString());
            czw.f3102e.execute(new czy(czw));
        }
    }
}
