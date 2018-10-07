package p000;

import android.annotation.TargetApi;

@TargetApi(16)
/* compiled from: PG */
/* renamed from: eqj */
public final class eqj {
    /* renamed from: a */
    public String f4308a;
    /* renamed from: b */
    private final epw f4309b;
    /* renamed from: c */
    private long f4310c = -1;

    public eqj(epw epw) {
        this.f4309b = epw;
    }

    /* renamed from: a */
    public final epv mo6500a() {
        boolean z;
        jri.m13404b(this.f4308a);
        if (this.f4310c >= 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13405b(z);
        epv a = new epv();
        a.mo6484a("_data", this.f4308a);
        a.f4295a.putNull("mime_type");
        Integer valueOf = Integer.valueOf(0);
        a.mo6482a("media_type", valueOf);
        a.mo6482a("date_modified", valueOf);
        a.mo6483a("datetaken", Long.valueOf(this.f4310c));
        return a;
    }

    /* renamed from: a */
    public final eqj mo6501a(long j) {
        if (j <= 0) {
            StringBuilder stringBuilder = new StringBuilder(45);
            stringBuilder.append("invalid image taken time ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f4310c = j;
        return this;
    }
}
