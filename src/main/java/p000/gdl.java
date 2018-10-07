package p000;

import android.content.Context;
import com.google.android.GoogleCamera.R;
import java.util.Timer;

/* compiled from: PG */
/* renamed from: gdl */
public final class gdl implements iqo {
    /* renamed from: a */
    public final fbg f19084a;
    /* renamed from: b */
    public final fbe f19085b;
    /* renamed from: c */
    public final gds f19086c;
    /* renamed from: d */
    public final ikd f19087d;
    /* renamed from: e */
    public final Object f19088e = new Object();
    /* renamed from: f */
    public Boolean f19089f = Boolean.valueOf(false);
    /* renamed from: g */
    public boolean f19090g = true;
    /* renamed from: h */
    public int f19091h = C0252go.f5809aH;
    /* renamed from: i */
    private final Timer f19092i;

    public gdl(fbg fbg, gds gds, ikd ikd, ilb ilb, Context context, Timer timer) {
        this.f19084a = fbg;
        this.f19086c = gds;
        this.f19087d = ikd;
        this.f19092i = timer;
        fbf a = fbg.mo6717a();
        a.f4670d = context.getResources().getString(R.string.gouda_notification_tap_to_focus);
        a.f4667a = true;
        this.f19085b = a.mo6716a();
        if (gds != null) {
            gds.mo7053a(new gdt(this, ilb));
        }
    }

    public final void close() {
        synchronized (this.f19088e) {
            this.f19092i.cancel();
            this.f19090g = false;
            mo13327a();
            mo13330c();
            this.f19086c.mo7053a(null);
        }
    }

    /* renamed from: a */
    public final void mo13327a() {
        if (this.f19091h != C0252go.f5809aH) {
            this.f19091h = C0252go.f5809aH;
            mo13329b();
            mo13330c();
        }
    }

    /* renamed from: b */
    public final void mo13329b() {
        this.f19084a.mo6719a(this.f19085b);
    }

    /* renamed from: c */
    public final void mo13330c() {
        this.f19087d.execute(new gdm(this));
    }

    /* renamed from: d */
    public final void mo13331d() {
        synchronized (this.f19088e) {
            this.f19091h = C0252go.f5809aH;
            this.f19090g = true;
            this.f19089f = Boolean.valueOf(false);
        }
    }

    /* renamed from: a */
    public final void mo13328a(long j) {
        synchronized (this.f19088e) {
            if (this.f19090g) {
                this.f19092i.schedule(new gdn(this), j);
            }
        }
    }
}
