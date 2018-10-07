package p000;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.os.Vibrator;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* compiled from: PG */
/* renamed from: gwp */
public final class gwp implements eoc, eof, eoh, eol {
    /* renamed from: a */
    public static final long[] f19738a = new long[]{0, 150, 75, 150};
    /* renamed from: b */
    private static final String f19739b = bli.m887a("DoubleTwistCntrlr");
    /* renamed from: c */
    private final gkh f19740c;
    /* renamed from: d */
    private SensorEventListener f19741d;
    /* renamed from: e */
    private boolean f19742e;
    /* renamed from: f */
    private boolean f19743f;
    /* renamed from: g */
    private gyk f19744g;
    /* renamed from: h */
    private irs f19745h;
    /* renamed from: i */
    private boolean f19746i;

    private gwp(Context context, BottomBarController bottomBarController, gkh gkh, gyk gyk) {
        this.f19746i = true;
        this.f19740c = gkh;
        this.f19744g = gyk;
        this.f19743f = gyk.mo7546a();
        this.f19741d = new gwq(this, (Vibrator) context.getSystemService("vibrator"), bottomBarController);
    }

    public gwp(Context context, BottomBarController bottomBarController, irs irs) {
        this(context, bottomBarController, new gkh(context), new gyk(context));
        this.f19745h = irs;
    }

    /* renamed from: f */
    public final void mo6365f() {
        this.f19740c.mo7170b(this.f19741d);
        this.f19741d = null;
    }

    /* renamed from: g */
    public final void mo6368g() {
        this.f19746i = true;
        if (this.f19742e) {
            this.f19740c.mo7170b(this.f19741d);
        }
    }

    /* renamed from: h */
    public final void mo6370h() {
        this.f19743f = this.f19744g.mo7546a();
        if (this.f19743f && this.f19742e) {
            this.f19740c.mo7169a(this.f19741d);
        }
        this.f19746i = false;
    }

    /* renamed from: a */
    public final boolean mo13473a(boolean z) {
        this.f19742e = z;
        if (this.f19746i) {
            return false;
        }
        String valueOf;
        if (this.f19743f && z) {
            String str = f19739b;
            valueOf = String.valueOf(this);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 21);
            stringBuilder.append("registering listener ");
            stringBuilder.append(valueOf);
            bli.m888a(str, stringBuilder.toString());
            return this.f19740c.mo7169a(this.f19741d);
        }
        valueOf = f19739b;
        String valueOf2 = String.valueOf(this);
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 23);
        stringBuilder2.append("unregistering listener ");
        stringBuilder2.append(valueOf2);
        bli.m888a(valueOf, stringBuilder2.toString());
        this.f19740c.mo7170b(this.f19741d);
        return false;
    }
}
