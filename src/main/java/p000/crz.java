package p000;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.ExternalViewerButton;
import com.google.android.apps.camera.legacy.app.refocus.ViewerActivity;
import com.google.android.apps.camera.metadata.refocus.GDepthUtil;
import com.google.android.apps.camera.p005ui.widget.Cling;

/* compiled from: PG */
/* renamed from: crz */
final class crz implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ crw f2838a;

    crz(crw crw) {
        this.f2838a = crw;
    }

    public final void onClick(View view) {
        crx crx = this.f2838a.f2819c;
        if (crx != null) {
            cre a = crx.mo5714a();
            if (a != cre.f2792c) {
                err e = a.mo5692e();
                Uri uri = e.mo6541g().f4384h;
                if (uri.equals(Uri.EMPTY)) {
                    bli.m898e(cfk.f23052a, "Cannot open empty URL.");
                    return;
                }
                if (e.mo6545k().f4343b.f4351h) {
                    cfk cfk = crx.f2836a;
                    eja eja = cfk.f23061I;
                    if (eja != null) {
                        eja.mo13151a((Activity) cfk.f23183r.get(), uri);
                        return;
                    }
                }
                if (e.mo6545k().f4343b.f4352i) {
                    eja eja2 = crx.f2836a.f23061I;
                    Intent intent = new Intent(eja2.f17462e.mo12480k(), ViewerActivity.class);
                    intent.setDataAndType(uri, GDepthUtil.MIME_JPEG);
                    intent.addFlags(65536);
                    eja2.f17462e.mo12476b(intent);
                    if (crx.f2836a.f23178m.mo7293a("default_scope", "pref_should_show_refocus_viewer_cling")) {
                        crx.f2836a.f23178m.mo7298b("default_scope", "pref_should_show_refocus_viewer_cling", false);
                        crw crw = crx.f2836a.f23191z;
                        ExternalViewerButton externalViewerButton = crw.f2821e;
                        Cling cling = (Cling) externalViewerButton.f2521c.get(cum.REFOCUS);
                        if (cling != null) {
                            ExternalViewerButton externalViewerButton2 = crw.f2821e;
                            cum cum = cum.REFOCUS;
                            Cling cling2 = (Cling) externalViewerButton2.f2521c.get(cum);
                            if (cling2 == null) {
                                String str = ExternalViewerButton.f2519a;
                                String valueOf = String.valueOf(cum);
                                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 48);
                                stringBuilder.append("Cling does not exist for the given viewer type: ");
                                stringBuilder.append(valueOf);
                                bli.m898e(str, stringBuilder.toString());
                            } else {
                                externalViewerButton2.f2521c.remove(cum);
                                cling2.mo2745a(null);
                            }
                            cling.setVisibility(8);
                            crw.f2818b.removeView(cling);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (e.mo6545k().f4343b.f4353j) {
                    crx.f2836a.mo12470a(a);
                    return;
                } else {
                    return;
                }
            }
            bli.m898e(cfk.f23052a, "Cannot open INVALID node.");
        }
    }
}
