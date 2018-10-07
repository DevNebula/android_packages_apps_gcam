package p000;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* compiled from: PG */
/* renamed from: nc */
final class C0380nc {
    /* renamed from: a */
    public static C0380nc f9235a;
    /* renamed from: b */
    private final Context f9236b;
    /* renamed from: c */
    private final LocationManager f9237c;
    /* renamed from: d */
    private final C0381nd f9238d = new C0381nd();

    C0380nc(Context context, LocationManager locationManager) {
        this.f9236b = context;
        this.f9237c = locationManager;
    }

    /* renamed from: a */
    private final Location m5679a(String str) {
        try {
            if (this.f9237c.isProviderEnabled(str)) {
                return this.f9237c.getLastKnownLocation(str);
            }
        } catch (Throwable e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
        }
        return null;
    }

    /* renamed from: a */
    final boolean mo10702a() {
        C0381nd c0381nd = this.f9238d;
        if (c0381nd.f9240b > System.currentTimeMillis()) {
            return c0381nd.f9239a;
        }
        Location a;
        Location a2;
        Location location;
        if (C0351ll.m5566a(this.f9236b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            a = m5679a("network");
        } else {
            a = null;
        }
        if (C0351ll.m5566a(this.f9236b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            a2 = m5679a("gps");
        } else {
            a2 = null;
        }
        if (a2 == null || a == null) {
            if (a2 != null) {
                location = a2;
            } else {
                location = a;
            }
        } else if (a2.getTime() > a.getTime()) {
            location = a2;
        } else {
            location = a;
        }
        if (location == null) {
            Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
            int i = Calendar.getInstance().get(11);
            if (i < 6 || i >= 22) {
                return true;
            }
            return false;
        }
        boolean z;
        C0381nd c0381nd2 = this.f9238d;
        long currentTimeMillis = System.currentTimeMillis();
        if (C0379nb.f9231a == null) {
            C0379nb.f9231a = new C0379nb();
        }
        C0379nb c0379nb = C0379nb.f9231a;
        c0379nb.mo10701a(-86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        c0379nb.mo10701a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        if (c0379nb.f9234d == 1) {
            z = true;
        } else {
            z = false;
        }
        long j = c0379nb.f9233c;
        long j2 = c0379nb.f9232b;
        c0379nb.mo10701a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j3 = c0379nb.f9233c;
        if (j == -1 || j2 == -1) {
            j3 = 43200000 + currentTimeMillis;
        } else {
            if (currentTimeMillis <= j2) {
                if (currentTimeMillis > j) {
                    j3 = j2;
                } else {
                    j3 = j;
                }
            }
            j3 += 60000;
        }
        c0381nd2.f9239a = z;
        c0381nd2.f9240b = j3;
        return c0381nd.f9239a;
    }
}
