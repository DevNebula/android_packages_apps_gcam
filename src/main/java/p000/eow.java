package p000;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* compiled from: PG */
/* renamed from: eow */
final class eow implements LocationListener {
    /* renamed from: a */
    public Location f4225a;
    /* renamed from: b */
    public boolean f4226b = false;
    /* renamed from: c */
    private String f4227c;

    public eow(String str) {
        this.f4227c = str;
        this.f4225a = new Location(this.f4227c);
    }

    public final void onLocationChanged(Location location) {
        if (location.getLatitude() != 0.0d || location.getLongitude() != 0.0d) {
            if (!this.f4226b) {
                bli.m888a(eov.f17578a, "Got first location.");
            }
            this.f4225a.set(location);
            this.f4226b = true;
        }
    }

    public final void onProviderDisabled(String str) {
        this.f4226b = false;
    }

    public final void onProviderEnabled(String str) {
    }

    public final void onStatusChanged(String str, int i, Bundle bundle) {
        switch (i) {
            case 0:
            case 1:
                this.f4226b = false;
                return;
            default:
                return;
        }
    }
}
