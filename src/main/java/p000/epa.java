package p000;

import android.content.Context;
import android.location.Location;
import android.widget.Toast;
import com.google.android.GoogleCamera.R;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: epa */
public final class epa implements enk, enl, enn, eol, hjw {
    /* renamed from: a */
    public static final String f17586a = bli.m887a("LocationManager");
    /* renamed from: b */
    private final Context f17587b;
    /* renamed from: c */
    private final gos f17588c;
    /* renamed from: d */
    private final kwk f17589d;
    /* renamed from: e */
    private final ilp f17590e;
    /* renamed from: f */
    private final ird f17591f;
    /* renamed from: g */
    private kpk f17592g;
    /* renamed from: h */
    private boolean f17593h = false;
    /* renamed from: i */
    private eox f17594i;

    public epa(Context context, gos gos, kwk kwk, ilp ilp, ird ird) {
        this.f17587b = context;
        this.f17588c = gos;
        this.f17589d = kwk;
        this.f17590e = ilp;
        this.f17591f = ird;
    }

    /* renamed from: d */
    public final Location mo7915d() {
        Throwable e;
        ird ird = null;
        if (this.f17594i == null || this.f17592g == null) {
            return null;
        }
        try {
            this.f17591f.mo8856a("Location#getCurrent");
            if (((Boolean) this.f17592g.get(250, TimeUnit.MILLISECONDS)).booleanValue()) {
                Location b = this.f17594i.mo6438b();
                this.f17591f.mo8857b();
                return b;
            }
            this.f17591f.mo8857b();
            return ird;
        } catch (InterruptedException e2) {
            e = e2;
            try {
                bli.m899e(f17586a, "Failed to get current location.", e);
                return ird;
            } finally {
                ird = this.f17591f;
                ird.mo8857b();
            }
        } catch (ExecutionException e3) {
            e = e3;
            bli.m899e(f17586a, "Failed to get current location.", e);
            return ird;
        } catch (TimeoutException e4) {
            e = e4;
            bli.m899e(f17586a, "Failed to get current location.", e);
            return ird;
        }
    }

    /* renamed from: a */
    public final void mo6349a() {
        if (this.f17594i != null) {
            this.f17591f.mo8856a("Location#pause");
            this.f17594i.mo6436a(false);
            this.f17591f.mo8857b();
        }
    }

    /* renamed from: b */
    public final void mo6350b() {
        if (this.f17587b.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 && this.f17587b.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
            this.f17593h = this.f17588c.mo7293a("default_scope", "pref_camera_recordlocation_key");
            if (this.f17593h && !((Boolean) this.f17590e.mo13673b()).booleanValue()) {
                Toast makeText = Toast.makeText(this.f17587b, this.f17587b.getResources().getString(R.string.record_location_notification), 1);
                makeText.setGravity(17, 0, 0);
                makeText.show();
            }
            this.f17590e.mo8826a(Boolean.valueOf(this.f17593h));
        } else {
            this.f17588c.mo7298b("default_scope", "pref_camera_recordlocation_key", false);
            this.f17593h = false;
        }
        if (this.f17594i == null && this.f17593h) {
            if (hud.m12226b(this.f17587b) == 0) {
                bli.m888a(f17586a, "Using fused location provider.");
                this.f17594i = new eos(this.f17587b, new eoy(this));
                this.f17591f.mo8857b();
            } else {
                mo13167e();
            }
        }
        if (this.f17594i != null) {
            this.f17591f.mo8856a("Location#startRecordingLocation");
            this.f17592g = this.f17594i.mo6436a(this.f17593h);
            this.f17591f.mo8857b();
        }
    }

    /* renamed from: c */
    public final void mo6352c() {
        if (this.f17594i != null) {
            bli.m896d(f17586a, "Disconnecting location controller.");
            this.f17591f.mo8856a("Location#disconnect");
            this.f17594i.mo6437a();
            this.f17594i = null;
            this.f17591f.mo8857b();
        }
    }

    /* renamed from: e */
    final void mo13167e() {
        if (this.f17594i != null) {
            bli.m896d(f17586a, "Disconnecting location controller.");
            this.f17594i.mo6437a();
            this.f17594i = null;
        }
        if (this.f17593h) {
            bli.m888a(f17586a, "Using legacy location provider.");
            this.f17594i = new eov(this.f17589d);
        }
    }
}
