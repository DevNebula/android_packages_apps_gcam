package p000;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

/* compiled from: PG */
/* renamed from: bau */
public final class bau implements eoc, eol, gqd {
    /* renamed from: a */
    private static final String f11132a = bli.m887a("CameraAssistant");
    /* renamed from: b */
    private static bsq f11133b = new bsq("camera.bind_assistant", true);
    /* renamed from: c */
    private boolean f11134c;
    /* renamed from: d */
    private final Context f11135d;
    /* renamed from: e */
    private final bsn f11136e;
    /* renamed from: f */
    private final enr f11137f;
    /* renamed from: g */
    private final ikd f11138g;
    /* renamed from: h */
    private ServiceConnection f11139h;

    public bau(Context context, bsn bsn, enr enr, ikd ikd) {
        this.f11135d = context;
        this.f11136e = bsn;
        this.f11137f = enr;
        this.f11138g = ikd;
    }

    /* renamed from: f */
    public final void mo6365f() {
        if (this.f11134c) {
            this.f11135d.unbindService(this.f11139h);
            this.f11134c = false;
            bli.m894c(f11132a, "unbound photos service");
        }
    }

    public final void run() {
        if (!this.f11136e.mo2107a(f11133b)) {
            bli.m888a(f11132a, "binding disabled by flags");
        } else if (this.f11134c) {
            bli.m888a(f11132a, "already bound");
        } else {
            eio.m1804a(this.f11138g, this.f11137f, this);
            try {
                this.f11139h = new bav();
                Intent intent = new Intent();
                intent.setClassName("com.google.android.apps.photos", "com.google.android.apps.photos.cameraassistant.CameraAssistantService");
                this.f11134c = this.f11135d.bindService(intent, this.f11139h, 5);
                String str = f11132a;
                boolean z = this.f11134c;
                StringBuilder stringBuilder = new StringBuilder(28);
                stringBuilder.append("bound photos service = ");
                stringBuilder.append(z);
                bli.m894c(str, stringBuilder.toString());
            } catch (Throwable e) {
                bli.m899e(f11132a, "Either Photos service does not exist or does not have permission to connect.", e);
            }
        }
    }
}
