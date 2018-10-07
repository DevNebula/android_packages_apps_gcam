package p000;

import android.view.Surface;
import java.util.Map;

/* compiled from: PG */
/* renamed from: fhf */
final class fhf implements iwh {
    /* renamed from: a */
    private final Map f18280a;
    /* renamed from: b */
    private final /* synthetic */ fhe f18281b;

    public fhf(fhe fhe, Map map) {
        this.f18281b = fhe;
        this.f18280a = kes.m4866a(map);
    }

    /* renamed from: a */
    public final void mo9122a(iwo iwo, Surface surface, long j) {
        Object b = iwo.mo13727b();
        ird ird = this.f18281b.f18275b;
        String valueOf = String.valueOf(b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 20);
        stringBuilder.append("onCaptureBufferLost_");
        stringBuilder.append(valueOf);
        ird.mo8856a(stringBuilder.toString());
        ((fiw) jri.m13404b((fiw) this.f18280a.get(b))).mo6823a(surface, j);
        this.f18281b.f18275b.mo8857b();
    }

    /* renamed from: a */
    public final void mo9124a(iwo iwo, iwp iwp) {
        Object b = iwo.mo13727b();
        ird ird = this.f18281b.f18275b;
        String valueOf = String.valueOf(b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 19);
        stringBuilder.append("onCaptureCompleted_");
        stringBuilder.append(valueOf);
        ird.mo8856a(stringBuilder.toString());
        ((fiw) jri.m13404b((fiw) this.f18280a.get(b))).mo6826a_(iwp);
        this.f18281b.f18275b.mo8857b();
    }

    /* renamed from: a */
    public final void mo9123a(iwo iwo, iwm iwm) {
        Object b = iwo.mo13727b();
        ird ird = this.f18281b.f18275b;
        String valueOf = String.valueOf(b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 16);
        stringBuilder.append("onCaptureFailed_");
        stringBuilder.append(valueOf);
        ird.mo8856a(stringBuilder.toString());
        ((fiw) jri.m13404b((fiw) this.f18280a.get(b))).mo6825a(iwm);
        this.f18281b.f18275b.mo8857b();
    }

    /* renamed from: b */
    public final void mo9125b(iwo iwo, iwp iwp) {
        Object b = iwo.mo13727b();
        ird ird = this.f18281b.f18275b;
        String valueOf = String.valueOf(b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 20);
        stringBuilder.append("onCaptureProgressed_");
        stringBuilder.append(valueOf);
        ird.mo8856a(stringBuilder.toString());
        ((fiw) jri.m13404b((fiw) this.f18280a.get(b))).mo6828c(iwp);
        this.f18281b.f18275b.mo8857b();
    }

    /* renamed from: a */
    public final void mo9119a(int i) {
        for (fiw a : this.f18280a.values()) {
            a.mo6821a(i);
        }
    }

    /* renamed from: a */
    public final void mo9120a(int i, long j) {
        for (fiw a : this.f18280a.values()) {
            a.mo6822a(i, j);
        }
    }

    /* renamed from: a */
    public final void mo9121a(iwo iwo, long j, long j2) {
        Object b = iwo.mo13727b();
        ird ird = this.f18281b.f18275b;
        String valueOf = String.valueOf(b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 38);
        stringBuilder.append("onCaptureStarted_");
        stringBuilder.append(valueOf);
        stringBuilder.append("@");
        stringBuilder.append(j);
        ird.mo8856a(stringBuilder.toString());
        fhq fhq = new fhq(j, (long) this.f18281b.f18274a.incrementAndGet(), j2);
        ((fiw) jri.m13404b((fiw) this.f18280a.get(b))).mo6824a(fhq);
        ((fiw) jri.m13404b((fiw) this.f18280a.get(b))).mo6827b(fhq);
        this.f18281b.f18275b.mo8857b();
    }
}
