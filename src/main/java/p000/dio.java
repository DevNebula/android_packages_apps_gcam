package p000;

import android.view.Surface;

/* renamed from: dio */
final /* synthetic */ class dio implements iju {
    /* renamed from: a */
    private final din f14042a;

    dio(din din) {
        this.f14042a = din;
    }

    /* renamed from: a */
    public final kpk mo8564a(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        din din = this.f14042a;
        iwl iwl = (iwl) obj;
        Surface surface = (Surface) obj2;
        bli.m894c(din.f23927a, "Viewfinder#swapAndStartSurfaceViewViewfinder onSuccess.");
        bli.m894c(din.f23927a, "Call CamcorderDevice#createCaptureSession.");
        ffc ffc = din.f23950b.f1141a;
        iqt ilb = new ilb(ffc.mo9075n());
        ilp fze = new fze(din.f23952d, ffc);
        boolean a = din.f23971w.mo5999a(din.f23972x, din.f23973y, din.f23930C.f14122a);
        String str = din.f23927a;
        StringBuilder stringBuilder = new StringBuilder(20);
        stringBuilder.append("Torch Enabled: ");
        stringBuilder.append(a);
        bli.m894c(str, stringBuilder.toString());
        if (ffc.mo9054A()) {
            a = din.f23971w.mo6001b();
        } else {
            a = false;
        }
        str = din.f23927a;
        stringBuilder = new StringBuilder(34);
        stringBuilder.append("Video Stabilization Enabled: ");
        stringBuilder.append(a);
        bli.m894c(str, stringBuilder.toString());
        if (!din.f23928A.mo7905c()) {
            z = false;
        } else if (din.f23972x != inc.FPS_30) {
            z = false;
        } else if (din.f23973y != ine.RES_2160P) {
            z = true;
        } else {
            z = false;
        }
        if (!din.f23928A.mo7904b()) {
            z2 = false;
        } else if (din.f23956h == iut.FRONT) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (din.f23928A.mo7905c()) {
            z2 = true;
        } else if (din.f23928A.mo7906d()) {
            z2 = true;
        }
        hjf hjf = din.f23928A;
        ivy ivy = hjf.f6633b;
        if (ivy.f7874d) {
            z3 = true;
        } else if (ivy.f7875e) {
            z3 = true;
        } else if (hjf.mo7905c()) {
            z3 = true;
        } else if (din.f23928A.mo7906d()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (din.f23972x.mo8637d()) {
            z3 = false;
        }
        if (!din.f23928A.mo7904b() && !din.f23928A.mo7905c() && !din.f23928A.mo7906d()) {
            z4 = false;
        } else if (din.f23956h == iut.BACK) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean d = din.f23971w.mo6004d();
        if (!din.f23928A.mo7905c() && !din.f23928A.mo7906d()) {
            z5 = false;
        } else if (din.f23928A.f6634c.f7869d) {
            z5 = true;
        } else {
            z5 = false;
        }
        imw a2 = imw.m3904h().mo8617a(z5).mo8618b(z3).mo8620d(z4).mo8619c(z2).mo8621e(a).mo8623g(d).mo8622f(z).mo8616a();
        bfe bfe = din.f23951c;
        fbr fbr = din.f23929B;
        ilp ilp = fbr.f4692b;
        ilp ilp2 = din.f23932E.f26345a;
        return bfe.mo12362a(iwl, ilp, ilp2, fze, din.f23962n.f14126b, ilb, surface, ffc, ilp, fbr.f4691a, din.f23931D, ilp2, din.f23952d, din.f23933F, a2, din.f23935H);
    }
}
