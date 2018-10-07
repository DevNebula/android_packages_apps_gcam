package p000;

import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: cnw */
final class cnw extends izy {
    /* renamed from: a */
    private final /* synthetic */ gkr f23237a;
    /* renamed from: b */
    private final /* synthetic */ cnv f23238b;

    cnw(cnv cnv, gkr gkr) {
        this.f23238b = cnv;
        this.f23237a = gkr;
    }

    /* renamed from: a_ */
    public final /* synthetic */ void mo13769a_(Object obj) {
        anq anq = (anq) obj;
        glw glw = glw.RENDER_PHOTO;
        if (this.f23238b.f2401a.f21537a.equals("Video_VFR")) {
            glw = glw.RENDER_VIDEO;
        }
        this.f23238b.f2402b.f13049f.mo7199a(this.f23237a);
        this.f23237a.mo13366a(anq, hci.m11979a((int) R.string.burst_process_creation, new Object[0]), glw);
    }
}
