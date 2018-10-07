package p000;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* renamed from: eos */
final class eos implements eox, hus, hut, ien {
    /* renamed from: a */
    public static final String f17568a = bli.m887a("FusedLocProvider");
    /* renamed from: g */
    public static final int f17569g = 20000;
    /* renamed from: i */
    private static final Uri f17570i = Uri.parse("content://com.google.settings/partner");
    /* renamed from: b */
    public final hji f17571b;
    /* renamed from: c */
    public hjk f17572c;
    /* renamed from: d */
    public final Context f17573d;
    /* renamed from: e */
    public boolean f17574e;
    /* renamed from: f */
    public boolean f17575f = false;
    /* renamed from: h */
    private final eoy f17576h;

    eos(Context context, eoy eoy) {
        this.f17576h = eoy;
        hur a = new hur(context).mo8146a(ieo.f7343a);
        htl.m3489b((Object) this, (Object) "Listener must not be null");
        a.f7048b.add(this);
        htl.m3489b((Object) this, (Object) "Listener must not be null");
        a.f7049c.add(this);
        this.f17571b = new hji(a.mo8145a());
        this.f17573d = context;
    }

    /* renamed from: a */
    public final void mo6437a() {
        mo13166d();
        bli.m888a(f17568a, "apiClient#disconnect");
        hjk hjk = this.f17572c;
        if (hjk != null) {
            hut hut = hjk.f6637a;
            hut.f20167a.mo8140b((hus) hut);
            hut.f20167a.mo8141b(hut);
            hut.f20167a.mo8142c();
            this.f17572c = null;
        }
    }

    /* renamed from: b */
    public final Location mo6438b() {
        if (this.f17574e) {
            hjk hjk = this.f17572c;
            if (hjk == null) {
                bli.m898e(f17568a, "Cannot provide location because the apiClient is not currently connected.");
                return null;
            }
            Location a = iel.m3769a(hjk.f6637a.f20167a);
            String valueOf;
            StringBuilder stringBuilder;
            if (a == null) {
                bli.m898e(f17568a, "Fused location API did not provide a location.");
                return null;
            } else if (Double.isInfinite(a.getLatitude()) || Double.isNaN(a.getLatitude()) || Double.isInfinite(a.getLongitude()) || Double.isNaN(a.getLongitude()) || (a.getLatitude() == 0.0d && a.getLongitude() == 0.0d)) {
                String str = f17568a;
                valueOf = String.valueOf(a);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 67);
                stringBuilder.append("Fused location API provided a location that is probably incorrect: ");
                stringBuilder.append(valueOf);
                bli.m898e(str, stringBuilder.toString());
                return null;
            } else {
                long elapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - a.getElapsedRealtimeNanos()) / 1000000;
                if (elapsedRealtimeNanos <= 1800000) {
                    return a;
                }
                valueOf = f17568a;
                stringBuilder = new StringBuilder(91);
                stringBuilder.append("Fused location API provided a location from ");
                stringBuilder.append(((float) elapsedRealtimeNanos) / 1000.0f);
                stringBuilder.append(" seconds ago. Ignoring location.");
                bli.m898e(valueOf, stringBuilder.toString());
                return null;
            }
        }
        bli.m888a(f17568a, "Fused location does not have the record location permission.");
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034 A:{SYNTHETIC, Splitter: B:11:0x0034} */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A:{SYNTHETIC, RETURN, ORIG_RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004e  */
    /* renamed from: b */
    private static int m9944b(android.content.Context r10) {
        /*
        r6 = 2;
        r7 = 0;
        r0 = r10.getContentResolver();
        r1 = f17570i;	 Catch:{ RuntimeException -> 0x003a, all -> 0x0049 }
        r2 = 1;
        r2 = new java.lang.String[r2];	 Catch:{ RuntimeException -> 0x003a, all -> 0x0049 }
        r3 = "value";
        r4 = 0;
        r2[r4] = r3;	 Catch:{ RuntimeException -> 0x003a, all -> 0x0049 }
        r3 = "name=?";
        r4 = 1;
        r4 = new java.lang.String[r4];	 Catch:{ RuntimeException -> 0x003a, all -> 0x0049 }
        r5 = "use_location_for_services";
        r8 = 0;
        r4[r8] = r5;	 Catch:{ RuntimeException -> 0x003a, all -> 0x0049 }
        r5 = 0;
        r1 = r0.query(r1, r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x003a, all -> 0x0049 }
        if (r1 == 0) goto L_0x002c;
    L_0x0021:
        r0 = r1.moveToNext();	 Catch:{ RuntimeException -> 0x005f, all -> 0x0052 }
        if (r0 == 0) goto L_0x002c;
    L_0x0027:
        r0 = 0;
        r7 = r1.getString(r0);	 Catch:{ RuntimeException -> 0x005f, all -> 0x0052 }
    L_0x002c:
        if (r1 == 0) goto L_0x0031;
    L_0x002e:
        r1.close();
    L_0x0031:
        if (r7 != 0) goto L_0x0034;
    L_0x0033:
        return r6;
    L_0x0034:
        r0 = java.lang.Integer.parseInt(r7);	 Catch:{ NumberFormatException -> 0x0057 }
    L_0x0038:
        r6 = r0;
        goto L_0x0033;
    L_0x003a:
        r0 = move-exception;
        r1 = r7;
    L_0x003c:
        r2 = f17568a;	 Catch:{ all -> 0x005a }
        r3 = "Failed to get 'Use My Location' setting";
        p000.bli.m899e(r2, r3, r0);	 Catch:{ all -> 0x005a }
        if (r1 == 0) goto L_0x0031;
    L_0x0045:
        r1.close();
        goto L_0x0031;
    L_0x0049:
        r0 = move-exception;
        r1 = r0;
        r0 = r7;
    L_0x004c:
        if (r0 == 0) goto L_0x0051;
    L_0x004e:
        r0.close();
    L_0x0051:
        throw r1;
    L_0x0052:
        r0 = move-exception;
        r9 = r1;
        r1 = r0;
        r0 = r9;
        goto L_0x004c;
    L_0x0057:
        r0 = move-exception;
        r0 = r6;
        goto L_0x0038;
    L_0x005a:
        r0 = move-exception;
        r9 = r1;
        r1 = r0;
        r0 = r9;
        goto L_0x004c;
    L_0x005f:
        r0 = move-exception;
        goto L_0x003c;
        */
        throw new UnsupportedOperationException("Method not decompiled: eos.b(android.content.Context):int");
    }

    /* renamed from: a */
    static boolean m9943a(Context context) {
        if (context.getPackageManager().resolveActivity(new Intent("com.google.android.gsf.GOOGLE_APPS_LOCATION_SETTINGS"), 65536) == null || eos.m9944b(context) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo8149a(Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo8150a(ConnectionResult connectionResult) {
        String str = f17568a;
        String valueOf = String.valueOf(connectionResult);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 19);
        stringBuilder.append("Connection failed: ");
        stringBuilder.append(valueOf);
        bli.m898e(str, stringBuilder.toString());
        eoy eoy = this.f17576h;
        bli.m898e(epa.f17586a, "Connection to fused location provider failed.");
        eoy.f4228a.mo13167e();
    }

    /* renamed from: a */
    public final void mo8148a(int i) {
        String str = f17568a;
        StringBuilder stringBuilder = new StringBuilder(34);
        stringBuilder.append("onConnectionSuspended: ");
        stringBuilder.append(i);
        bli.m888a(str, stringBuilder.toString());
    }

    /* renamed from: c */
    public final void mo8410c() {
        bli.m896d(f17568a, "Got location.");
    }

    /* renamed from: a */
    public final kpk mo6436a(boolean z) {
        kpk d = kpw.m18486d();
        new eot(this, d, z).execute(new Void[0]);
        return d;
    }

    /* renamed from: d */
    final void mo13166d() {
        if (this.f17575f && this.f17572c != null) {
            try {
                bli.m894c(f17568a, "FusedLocationApi#removeLocationUpdates");
                huq huq = this.f17572c.f6637a.f20167a;
                huq.mo8138b(new iev(huq, this));
            } catch (Throwable e) {
                bli.m899e(f17568a, "Failed to remove location listeners. ", e);
            }
        }
        this.f17575f = false;
        this.f17574e = false;
    }
}
