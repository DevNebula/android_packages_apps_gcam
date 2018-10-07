package p000;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.graphics.Point;
import android.provider.Settings.System;
import android.view.Display;
import android.view.WindowManager;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: gcj */
public final class gcj implements eoj, eok, eol, gci {
    /* renamed from: a */
    private final gcm f19002a;
    /* renamed from: b */
    private final gbv f19003b;
    /* renamed from: c */
    private final ContentResolver f19004c;
    /* renamed from: d */
    private final WindowManager f19005d;
    /* renamed from: e */
    private final boolean f19006e;
    /* renamed from: f */
    private final iqz f19007f;
    /* renamed from: g */
    private boolean f19008g = false;

    public gcj(gcm gcm, ContentResolver contentResolver, gbv gbv, WindowManager windowManager, ira ira) {
        boolean z;
        this.f19002a = (gcm) jri.m13404b((Object) gcm);
        this.f19004c = (ContentResolver) jri.m13404b((Object) contentResolver);
        this.f19003b = (gbv) jri.m13404b((Object) gbv);
        this.f19005d = (WindowManager) jri.m13404b((Object) windowManager);
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        int rotation = defaultDisplay.getRotation();
        iqp a = iqp.m4102a(point);
        if (rotation == 1 || rotation == 3) {
            a = a.mo8819f();
        }
        if (a.f7695a <= a.f7696b) {
            z = true;
        } else {
            z = false;
        }
        this.f19006e = z;
        this.f19007f = ira.mo8854a("OrientMgrImpl");
    }

    /* renamed from: a */
    public final void mo7035a(gbw gbw) {
        this.f19003b.mo7026a(gbw);
    }

    /* renamed from: a */
    public final iqm mo7034a() {
        return this.f19003b.f5283e;
    }

    /* renamed from: b */
    public final boolean mo7037b() {
        return this.f19006e;
    }

    /* renamed from: h */
    private final boolean m11155h() {
        return System.getInt(this.f19004c, "accelerometer_rotation", 0) != 1;
    }

    /* renamed from: c */
    public final void mo7038c() {
        if (!this.f19008g && !m11155h()) {
            this.f19008g = true;
            this.f19002a.mo7043a(14);
        }
    }

    /* renamed from: d */
    public final int mo7039d() {
        return gcb.m2522a(mo7034a(), this.f19006e);
    }

    /* renamed from: e */
    public final int mo7040e() {
        return gcb.m2522a(mo7041f(), this.f19006e);
    }

    /* renamed from: i */
    public final void mo6372i() {
        gbv gbv = this.f19003b;
        synchronized (gbv.f5282d) {
            gbv.f5285g++;
            gbv.f5280b.enable();
        }
    }

    /* renamed from: j */
    public final void mo6373j() {
        gbv gbv = this.f19003b;
        synchronized (gbv.f5282d) {
            int i = gbv.f5285g;
            if (i > 0) {
                gbv.f5285g = i - 1;
            }
            if (gbv.f5285g == 0) {
                gbv.f5280b.disable();
            }
        }
    }

    /* renamed from: b */
    public final void mo7036b(gbw gbw) {
        this.f19003b.mo7027b(gbw);
    }

    /* renamed from: f */
    public final iqm mo7041f() {
        return iqm.m4096a(this.f19005d.getDefaultDisplay());
    }

    /* renamed from: g */
    public final void mo7042g() {
        if (this.f19008g && !m11155h()) {
            this.f19008g = false;
            this.f19007f.mo8832b("Unlocked Orientation");
            this.f19002a.mo7043a(2);
        }
    }
}
