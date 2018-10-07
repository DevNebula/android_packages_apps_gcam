package p000;

import android.content.IntentFilter;

/* compiled from: PG */
/* renamed from: hoe */
final class hoe implements kov {
    /* renamed from: a */
    private final /* synthetic */ hod f20220a;

    hoe(hod hod) {
        this.f20220a = hod;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        bli.m899e(hod.f24495a, "Connection suspended", th);
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        hjk hjk = (hjk) obj;
        bli.m888a(hod.f24495a, "Google API connected");
        Object obj2 = this.f20220a;
        if (obj2.f24499d) {
            huq huq = hjk.f6637a.f20167a;
            IntentFilter[] intentFilterArr = new IntentFilter[1];
            IntentFilter intentFilter = new IntentFilter("com.google.android.gms.wearable.MESSAGE_RECEIVED");
            intentFilter.addDataScheme("wear");
            intentFilter.addDataAuthority("*", null);
            intentFilterArr[0] = intentFilter;
            huq.mo8134a(new iia(huq, obj2, huq.mo8135a(obj2), intentFilterArr));
            hod hod = this.f20220a;
            igo a = igo.m3801a("/camera_packet");
            a.f7367b.f7365a.put("camera_ready", Boolean.valueOf(true));
            hod.mo14939a(a, null);
        }
    }
}
