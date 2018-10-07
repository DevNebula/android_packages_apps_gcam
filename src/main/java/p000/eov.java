package p000;

import android.location.Location;
import android.location.LocationManager;

/* compiled from: PG */
/* renamed from: eov */
final class eov implements eox {
    /* renamed from: a */
    public static final String f17578a = bli.m887a("LcyLocProvider");
    /* renamed from: b */
    private final kwk f17579b;
    /* renamed from: c */
    private LocationManager f17580c;
    /* renamed from: d */
    private boolean f17581d;
    /* renamed from: e */
    private eow[] f17582e = new eow[]{new eow("gps"), new eow("network")};

    eov(kwk kwk) {
        this.f17579b = kwk;
    }

    /* renamed from: a */
    public final void mo6437a() {
        bli.m888a(f17578a, "disconnect");
    }

    /* renamed from: b */
    public final Location mo6438b() {
        if (!this.f17581d) {
            return null;
        }
        int i = 0;
        while (true) {
            eow[] eowArr = this.f17582e;
            if (i < eowArr.length) {
                Location location;
                eow eow = eowArr[i];
                if (eow.f4226b) {
                    location = eow.f4225a;
                } else {
                    location = null;
                }
                if (location != null) {
                    return location;
                }
                i++;
            } else {
                bli.m888a(f17578a, "No location received yet.");
                return null;
            }
        }
    }

    /* renamed from: a */
    public final kpk mo6436a(boolean z) {
        String str;
        String valueOf;
        String str2;
        int i = 0;
        if (this.f17581d != z) {
            this.f17581d = z;
            if (z) {
                bli.m896d(f17578a, "starting location updates");
                if (this.f17580c == null) {
                    this.f17580c = (LocationManager) this.f17579b.mo10566a();
                }
                LocationManager locationManager = this.f17580c;
                if (locationManager != null) {
                    try {
                        locationManager.requestLocationUpdates("network", 1000, 0.0f, this.f17582e[1]);
                    } catch (Throwable e) {
                        bli.m895c(f17578a, "fail to request location update, ignore", e);
                    } catch (IllegalArgumentException e2) {
                        str = f17578a;
                        valueOf = String.valueOf(e2.getMessage());
                        str2 = "provider does not exist ";
                        if (valueOf.length() == 0) {
                            valueOf = new String(str2);
                        } else {
                            valueOf = str2.concat(valueOf);
                        }
                        bli.m888a(str, valueOf);
                    }
                    try {
                        this.f17580c.requestLocationUpdates("gps", 1000, 0.0f, this.f17582e[0]);
                    } catch (Throwable e3) {
                        bli.m895c(f17578a, "fail to request location update, ignore", e3);
                    } catch (IllegalArgumentException e22) {
                        str = f17578a;
                        valueOf = String.valueOf(e22.getMessage());
                        str2 = "provider does not exist ";
                        if (valueOf.length() == 0) {
                            valueOf = new String(str2);
                        } else {
                            valueOf = str2.concat(valueOf);
                        }
                        bli.m888a(str, valueOf);
                    }
                    bli.m888a(f17578a, "startReceivingLocationUpdates");
                }
            } else {
                bli.m896d(f17578a, "stopping location updates");
                if (this.f17580c != null) {
                    while (true) {
                        eow[] eowArr = this.f17582e;
                        if (i >= eowArr.length) {
                            break;
                        }
                        try {
                            this.f17580c.removeUpdates(eowArr[i]);
                        } catch (Throwable e4) {
                            bli.m895c(f17578a, "fail to remove location listners, ignore", e4);
                        }
                        i++;
                    }
                    bli.m888a(f17578a, "stopReceivingLocationUpdates");
                }
            }
        }
        return kow.m13873a(Boolean.valueOf(z));
    }
}
