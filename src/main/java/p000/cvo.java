package p000;

import android.app.Activity;
import android.net.Uri;
import android.nfc.NfcAdapter;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.PeekableFilmstripLayout;

/* compiled from: PG */
/* renamed from: cvo */
final class cvo implements ctt {
    /* renamed from: a */
    private final /* synthetic */ PeekableFilmstripLayout f13300a;

    cvo(PeekableFilmstripLayout peekableFilmstripLayout) {
        this.f13300a = peekableFilmstripLayout;
    }

    /* renamed from: a */
    public final void mo5807a() {
        bli.m888a(PeekableFilmstripLayout.f12801a, "Filmstrip show animation cancelled.");
        this.f13300a.f12813m.set(false);
    }

    /* renamed from: b */
    public final void mo5808b() {
        if (this.f13300a.f12812l.mo5749i()) {
            bli.m888a(PeekableFilmstripLayout.f12801a, "Activity finishing. Aborting filmstrip show animation.");
            this.f13300a.f12813m.set(false);
            return;
        }
        bli.m888a(PeekableFilmstripLayout.f12801a, "Filmstrip show animation ended.");
        this.f13300a.f12803c.setTranslationX(0.0f);
        PeekableFilmstripLayout peekableFilmstripLayout = this.f13300a;
        peekableFilmstripLayout.f12808h = true;
        peekableFilmstripLayout.f12811k.mo13435b_();
        peekableFilmstripLayout = this.f13300a;
        peekableFilmstripLayout.setBackgroundColor(peekableFilmstripLayout.getResources().getColor(17170444, null));
        cst a = this.f13300a.f12802b;
        if (!a.f13242a.f23077Y) {
            bli.m888a(cfk.f23052a, "onFilmstripShown");
            cfk cfk = a.f13242a;
            cfk.f23076X = true;
            cfk.f23069Q.mo8879a(a.f13242a.mo14580H(), 5);
            cfk = a.f13242a;
            cre a2 = cfk.f23056D.mo5754a();
            if (a2 == cre.f2792c) {
                bli.m898e(cfk.f23052a, "Current data ID not found.");
                cfk.f23066N.mo5700a(null);
                cfk.f23191z.mo5710c(false);
                cfk.f23191z.mo5711d(false);
                cfk.f23191z.mo5707a(false);
                cfk.f23191z.mo5709b(false);
                cfk.f23191z.mo5708b();
                cfk.mo14581I();
            } else {
                err e = a2.mo5692e();
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
                int a3 = cfk.f23059G.mo7814a(a2);
                if (!cfk.f23059G.mo7839e(a3)) {
                    cfk.f23059G.mo7840f(a3);
                }
            }
        }
        this.f13300a.f12802b.mo12905d();
        this.f13300a.f12804d.mo2649m();
        this.f13300a.f12813m.set(false);
        bli.m888a(PeekableFilmstripLayout.f12801a, "Filmstrip show animation complete.");
    }

    /* renamed from: c */
    public final void mo5809c() {
    }
}
