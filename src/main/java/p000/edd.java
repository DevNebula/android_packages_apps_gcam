package p000;

import android.view.WindowManager.LayoutParams;

/* compiled from: PG */
/* renamed from: edd */
class edd extends gqj {
    /* renamed from: a */
    private final /* synthetic */ edb f24128a;

    edd(edb edb) {
        this.f24128a = edb;
        super(null);
    }

    /* renamed from: a */
    public final void mo7343a() {
        bli.m888a(edb.f24118a, "Filmstrip state enter");
        edb edb = this.f24128a;
        LayoutParams attributes = edb.f24119b.getAttributes();
        attributes.rotationAnimation = 0;
        edb.f24119b.setAttributes(attributes);
        this.f24128a.f24121d.setImportantForAccessibility(4);
        this.f24128a.f24123f.mo7343a();
    }

    /* renamed from: b */
    public final void mo7344b() {
        bli.m888a(edb.f24118a, "Filmstrip state exit");
        edb edb = this.f24128a;
        int i = edb.f24122e;
        LayoutParams attributes = edb.f24119b.getAttributes();
        attributes.rotationAnimation = i;
        edb.f24119b.setAttributes(attributes);
        this.f24128a.f24121d.setImportantForAccessibility(1);
        this.f24128a.f24123f.mo7344b();
    }
}
