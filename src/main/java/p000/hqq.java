package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: hqq */
public final class hqq {
    /* renamed from: a */
    public static final String f6815a = String.format("content://%s/publicvalue/lens_oem_availability", new Object[]{"com.google.android.googlequicksearchbox.GsaPublicContentProvider"});
    /* renamed from: b */
    public static final String f6816b = String.format("content://%s/publicvalue/stickers_oem_availability", new Object[]{"com.google.vr.apps.ornament.app.lens.StickersAvailabilityProvider"});
    /* renamed from: g */
    private static final hra f6817g;
    /* renamed from: c */
    public final Context f6818c;
    /* renamed from: d */
    public final List f6819d;
    /* renamed from: e */
    public hra f6820e;
    /* renamed from: f */
    public boolean f6821f;
    /* renamed from: h */
    private final PackageManager f6822h;

    static {
        hra hra = new hra();
        f6817g = hra;
        hra.f24513a = "0.1.0";
        f6817g.f24514b = "";
        f6817g.f24515c = -1;
        f6817g.f24516d = -1;
    }

    public hqq(Context context) {
        this(context, context.getPackageManager());
    }

    private hqq(Context context, PackageManager packageManager) {
        this.f6819d = new ArrayList();
        this.f6818c = context;
        this.f6822h = packageManager;
        this.f6821f = false;
        this.f6820e = f6817g.clone();
        try {
            PackageInfo packageInfo = this.f6822h.getPackageInfo("com.google.android.googlequicksearchbox", 0);
            if (packageInfo != null) {
                this.f6820e.f24514b = packageInfo.versionName;
            }
        } catch (NameNotFoundException e) {
            Log.e("LensSdkParamsReader", "Unable to find agsa package: com.google.android.googlequicksearchbox");
        }
        new hqs(this).execute(new Void[0]);
    }

    /* renamed from: a */
    public final void mo8033a(hqr hqr) {
        if (this.f6821f) {
            hqr.mo8034a(this.f6820e);
        } else {
            this.f6819d.add(hqr);
        }
    }
}
