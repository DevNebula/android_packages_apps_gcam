package p000;

import android.app.Activity;
import android.net.Uri;
import android.nfc.NfcAdapter;

/* compiled from: PG */
/* renamed from: cst */
public final class cst implements kwk {
    /* renamed from: a */
    public final /* synthetic */ cfk f13242a;

    public cst(cfk cfk) {
        this.f13242a = cfk;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public final void mo12902a(cre cre) {
        cfk cfk = this.f13242a;
        if (cfk.f23076X) {
            cfk.f23172g.execute(new cfm(this, cre));
        }
    }

    /* renamed from: b */
    public final void mo12903b() {
        cfk cfk = this.f13242a;
        if (cfk.f23076X) {
            cre a = cfk.f23056D.mo5754a();
            if (a == cre.f2792c) {
                bli.m898e(cfk.f23052a, "Current data ID not found.");
                cfk.f23066N.mo5700a(null);
                cfk.f23191z.mo5710c(false);
                cfk.f23191z.mo5711d(false);
                cfk.f23191z.mo5707a(false);
                cfk.f23191z.mo5709b(false);
                cfk.f23191z.mo5708b();
                cfk.mo14581I();
                return;
            }
            err e = a.mo5692e();
            cfk.m15205b(e);
            cfk.mo14583P();
            cfk.f23066N.mo5700a(e);
            if (cfk.f23189x) {
                cfk.f23191z.mo5710c(false);
                cfk.f23191z.mo5711d(false);
            } else {
                if (!cfk.f23181p.getAndSet(true)) {
                    cfk.f23180o.mo8856a("NFC#init");
                    NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(cfk.f23171f);
                    if (defaultAdapter != null) {
                        defaultAdapter.setBeamPushUris(null, (Activity) cfk.f23183r.get());
                        defaultAdapter.setBeamPushUrisCallback(new cfq(cfk), (Activity) cfk.f23183r.get());
                        cfk.f23180o.mo8857b();
                    }
                }
                Uri uri = e.mo6541g().f4384h;
                if (uri.equals(Uri.EMPTY)) {
                    cfk.f23182q[0] = null;
                } else {
                    cfk.f23182q[0] = uri;
                }
            }
            int a2 = cfk.f23059G.mo7814a(a);
            if (!cfk.f23059G.mo7839e(a2)) {
                cfk.f23059G.mo7840f(a2);
            }
        }
    }

    /* renamed from: c */
    public final void mo12904c() {
        cfk cfk = this.f13242a;
        if (cfk.f23076X) {
            cfk.f23072T = true;
            cfk.mo14584Q();
            cfk = this.f13242a;
            ikd.m12501a();
            if (!cfk.f23073U) {
                bli.m896d(cfk.f23052a, "stopPreviewWhenEnteringFilmstrip");
                cfk.f23073U = true;
                cfk.f23187v.execute(cfk.f23107ac);
                cfk.f23108ad.mo8826a((Boolean) cfk.f23131b.mo2303b().mo13673b());
            }
        }
    }

    /* renamed from: d */
    public final void mo12905d() {
        cfk cfk = this.f13242a;
        if (cfk.f23076X) {
            cfk.f23072T = true;
            cfk.mo14584Q();
            cfk = this.f13242a;
            ikd.m12501a();
            if (!cfk.f23073U) {
                bli.m896d(cfk.f23052a, "stopPreviewWhenEnteringFilmstrip");
                cfk.f23073U = true;
                cfk.f23187v.execute(cfk.f23107ac);
                cfk.f23108ad.mo8826a((Boolean) cfk.f23131b.mo2303b().mo13673b());
            }
        }
    }

    /* renamed from: e */
    public final void mo12906e() {
        this.f13242a.mo14579G();
        cfk cfk = this.f13242a;
        cfk.f23072T = false;
        cfk.mo14584Q();
        this.f13242a.mo14582O();
    }
}
