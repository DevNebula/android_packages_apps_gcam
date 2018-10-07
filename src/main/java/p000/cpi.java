package p000;

import android.app.Activity;
import android.net.Uri;
import android.nfc.NfcAdapter;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: cpi */
final class cpi extends AsyncTask {
    /* renamed from: a */
    private final boolean f2743a;
    /* renamed from: b */
    private final /* synthetic */ coy f2744b;

    cpi(coy coy, boolean z) {
        this.f2744b = coy;
        this.f2743a = z;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        Uri[] uriArr = (Uri[]) objArr;
        this.f2744b.f13081l.mo8856a("MetadataUpdateTask");
        List arrayList = new ArrayList();
        for (Uri a : uriArr) {
            cre a2 = this.f2744b.f13078i.mo5682a(a);
            if (a2 != cre.f2792c) {
                err e = a2.mo5692e();
                coy coy = this.f2744b;
                cqf cqf = coy.f13077h;
                if (cqf.m1454a(coy.f13072c, e) || this.f2743a) {
                    arrayList.add(a2);
                }
            }
        }
        this.f2744b.f13081l.mo8857b();
        return arrayList;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        List<cre> list = (List) obj;
        if (this.f2744b.f13073d.mo1827d()) {
            bli.m898e(coy.f13070a, "Activity is destroyed. Canceling load.");
            return;
        }
        this.f2744b.f13081l.mo8856a("MetadataUpdateTask#onPostExecute");
        List arrayList = new ArrayList();
        for (cre e : list) {
            arrayList.add(Integer.valueOf(this.f2744b.mo7813a(e.mo5692e().mo6541g().f4384h)));
        }
        this.f2744b.f13071b.mo5732a(new csk(arrayList, list));
        cqc cqc = this.f2744b.f13079j;
        if (cqc != null) {
            cfk cfk = cqc.f2761a;
            if (!cfk.f23077Y) {
                cre a = cfk.f23056D.mo5754a();
                if (list.contains(a)) {
                    cfk cfk2 = cqc.f2761a;
                    if (a == cre.f2792c) {
                        bli.m898e(cfk.f23052a, "Current data ID not found.");
                        cfk2.f23066N.mo5700a(null);
                        cfk2.f23191z.mo5710c(false);
                        cfk2.f23191z.mo5711d(false);
                        cfk2.f23191z.mo5707a(false);
                        cfk2.f23191z.mo5709b(false);
                        cfk2.f23191z.mo5708b();
                        cfk2.mo14581I();
                    } else {
                        err e2 = a.mo5692e();
                        cfk2.m15205b(e2);
                        cfk2.mo14583P();
                        cfk2.f23066N.mo5700a(e2);
                        if (cfk2.f23189x) {
                            cfk2.f23191z.mo5710c(false);
                            cfk2.f23191z.mo5711d(false);
                        } else {
                            if (!cfk2.f23181p.getAndSet(true)) {
                                cfk2.f23180o.mo8856a("NFC#init");
                                NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(cfk2.f23171f);
                                if (defaultAdapter != null) {
                                    defaultAdapter.setBeamPushUris(null, (Activity) cfk2.f23183r.get());
                                    defaultAdapter.setBeamPushUrisCallback(new cfq(cfk2), (Activity) cfk2.f23183r.get());
                                    cfk2.f23180o.mo8857b();
                                }
                            }
                            Uri uri = e2.mo6541g().f4384h;
                            if (uri.equals(Uri.EMPTY)) {
                                cfk2.f23182q[0] = null;
                            } else {
                                cfk2.f23182q[0] = uri;
                            }
                        }
                        int a2 = cfk2.f23059G.mo7814a(a);
                        if (!cfk2.f23059G.mo7839e(a2)) {
                            cfk2.f23059G.mo7840f(a2);
                        }
                    }
                }
            }
            this.f2744b.f13081l.mo8857b();
        }
    }
}
