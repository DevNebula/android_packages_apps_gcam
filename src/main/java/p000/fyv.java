package p000;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* renamed from: fyv */
final class fyv implements iqt {
    /* renamed from: a */
    public final kpw f18912a;
    /* renamed from: b */
    private final long f18913b;
    /* renamed from: c */
    private final long f18914c;
    /* renamed from: d */
    private Long f18915d;
    /* renamed from: e */
    private boolean f18916e = false;

    public fyv(long j) {
        this.f18913b = j;
        this.f18914c = 10;
        this.f18912a = kpw.m18486d();
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8826a(Object obj) {
        iwp iwp = (iwp) obj;
        if (!this.f18916e) {
            if (this.f18915d == null) {
                this.f18915d = Long.valueOf(iwp.mo13731b());
            }
            long b = iwp.mo13731b() - ((Long) jqk.m13354c(this.f18915d)).longValue();
            Long l = (Long) iwp.mo13730a(CaptureResult.SENSOR_TIMESTAMP);
            if (l != null && l.longValue() > this.f18913b) {
                this.f18916e = true;
                this.f18912a.mo15641a(Boolean.valueOf(true));
            } else if (b >= this.f18914c) {
                String str = fyu.f5058a;
                long j = this.f18913b;
                String valueOf = String.valueOf(l);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 78);
                stringBuilder.append("timeout waiting for ");
                stringBuilder.append(j);
                stringBuilder.append(" at ");
                stringBuilder.append(valueOf);
                stringBuilder.append(", after ");
                stringBuilder.append(b);
                stringBuilder.append("frames");
                bli.m898e(str, stringBuilder.toString());
                this.f18916e = true;
                this.f18912a.mo15641a(Boolean.valueOf(false));
            }
        }
    }
}
