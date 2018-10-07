package p000;

import java.util.UUID;

/* compiled from: PG */
/* renamed from: fqv */
public final class fqv implements fux {
    /* renamed from: a */
    public final gkr f24298a;
    /* renamed from: b */
    public final UUID f24299b;
    /* renamed from: c */
    public boolean f24300c;
    /* renamed from: d */
    public boolean f24301d;
    /* renamed from: e */
    public final /* synthetic */ fqu f24302e;
    /* renamed from: f */
    private boolean f24303f;

    public fqv(fqu fqu, gkr gkr, UUID uuid) {
        this.f24302e = fqu;
        this.f24298a = gkr;
        this.f24299b = uuid;
    }

    /* renamed from: a */
    public final void mo13282a(iwz iwz, kpk kpk) {
        throw new RuntimeException("Should not call RawModeImageSaver.addFullSizeImage()");
    }

    public final synchronized void close() {
        if (!this.f24303f) {
            this.f24303f = true;
            this.f24298a.mo13378f();
        }
    }

    /* renamed from: a */
    public final synchronized void mo14901a(ikb ikb) {
        if (this.f24300c && this.f24301d) {
            this.f24303f = true;
            this.f24298a.mo13378f();
            ikb.close();
        }
    }
}
