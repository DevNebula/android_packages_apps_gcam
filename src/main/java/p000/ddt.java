package p000;

import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: ddt */
final class ddt implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ dds f3217a;

    ddt(dds dds) {
        this.f3217a = dds;
    }

    public final void run() {
        dak H = ((dbu) this.f3217a.f23843a.mo2152d()).mo12978H();
        H.mo5914a(false);
        H.f3115f.mo2738a();
        if (((dbm) this.f3217a.f23843a.f23823d.f11173a).mo12962c().mo12967d().f5009d.mo13673b() != fxj.OFF) {
            boolean z;
            int a = ((dbu) this.f3217a.f23843a.mo2152d()).mo12982L().mo7034a().mo8806a();
            if (((dbm) this.f3217a.f23843a.f23823d.f11173a).mo12961b().mo9064c() == iut.FRONT) {
                z = true;
            } else {
                z = false;
            }
            kow.m13878a(kow.m13875a(new dal(H, a, z), H.f3112c), new dan(H), iel.m3771a());
        }
        ((dbm) this.f3217a.f23843a.f23823d.f11173a).mo12958a().mo7328a(R.raw.camera_shutter);
    }
}
