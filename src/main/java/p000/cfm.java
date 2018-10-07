package p000;

import android.app.Activity;
import android.net.Uri;
import android.nfc.NfcAdapter;

/* compiled from: PG */
/* renamed from: cfm */
public final class cfm implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ cre f2102a;
    /* renamed from: b */
    private final /* synthetic */ cst f2103b;

    public cfm(cst cst, cre cre) {
        this.f2103b = cst;
        this.f2102a = cre;
    }

    public final void run() {
        cfk cfk = this.f2103b.f13242a;
        cre cre = this.f2102a;
        if (cre == cre.f2792c) {
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
        err e = cre.mo5692e();
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
        int a = cfk.f23059G.mo7814a(cre);
        if (!cfk.f23059G.mo7839e(a)) {
            cfk.f23059G.mo7840f(a);
        }
    }
}
