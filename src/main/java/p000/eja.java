package p000;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* renamed from: eja */
public final class eja implements hus, hut, huy {
    /* renamed from: a */
    public static final String f17458a = bli.m887a("PhotoSphereHelper");
    /* renamed from: b */
    public hji f17459b;
    /* renamed from: c */
    public kpk f17460c;
    /* renamed from: d */
    public int f17461d = 1;
    /* renamed from: e */
    public final cfh f17462e;
    /* renamed from: f */
    private final Activity f17463f;
    /* renamed from: g */
    private final irs f17464g;

    public eja(cfh cfh, Activity activity, irs irs) {
        this.f17462e = cfh;
        this.f17463f = activity;
        this.f17464g = irs;
    }

    /* renamed from: a */
    public final void mo8149a(Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo8150a(ConnectionResult connectionResult) {
        String str = f17458a;
        String valueOf = String.valueOf(connectionResult);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 19);
        stringBuilder.append("Connection failed: ");
        stringBuilder.append(valueOf);
        bli.m891b(str, stringBuilder.toString());
        if (connectionResult.f23349b != 19 && connectionResult.mo14630a()) {
            try {
                Activity activity = this.f17463f;
                if (connectionResult.mo14630a()) {
                    activity.startIntentSenderForResult(connectionResult.f23350c.getIntentSender(), 9000, null, 0, 0, 0);
                }
            } catch (Throwable e) {
                bli.m892b(f17458a, "Could not start resolution", e);
            }
        }
    }

    /* renamed from: a */
    public final void mo8148a(int i) {
    }

    /* renamed from: a */
    public final void mo13151a(Activity activity, Uri uri) {
        if (this.f17461d != 0) {
            String str = f17458a;
            int i = this.f17461d;
            StringBuilder stringBuilder = new StringBuilder(40);
            stringBuilder.append("Play Services not Available: ");
            stringBuilder.append(i);
            bli.m891b(str, stringBuilder.toString());
            hud.m12224a(this.f17461d, activity).show();
        } else if (this.f17459b == null) {
            bli.m891b(f17458a, "PanoramaClient must not be null after startup");
            throw new IllegalStateException("PanoramaClient must not be null after startup");
        } else {
            kpk kpk = this.f17460c;
            if (kpk == null) {
                bli.m888a(f17458a, "PanoramaClient not available.");
            } else {
                kow.m13878a(kpk, new ejc(this, uri), kpq.f8776a);
            }
        }
    }
}
