package p000;

import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore.Video.Media;
import java.util.Date;
import java.util.List;

/* compiled from: PG */
/* renamed from: cfr */
final class cfr implements glq {
    /* renamed from: a */
    public final /* synthetic */ cfk f12332a;

    cfr(cfk cfk) {
        this.f12332a = cfk;
    }

    /* renamed from: a */
    final void mo12497a(cre cre, err err) {
        if (cre == cre.f2792c) {
            this.f12332a.f23059G.mo7825a(err, cov.m8617a(err));
        } else {
            this.f12332a.f23059G.mo7821a(cre, err);
        }
    }

    /* renamed from: a */
    private final boolean m8236a(Uri uri, cre cre) {
        Uri b = this.f12332a.f23179n.mo7410b(uri);
        if (b == null) {
            this.f12332a.f23059G.mo7834c(uri);
            return true;
        }
        String str = cfk.f23052a;
        String valueOf = String.valueOf(b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 33);
        stringBuilder.append("onSessionDone: image content URI=");
        stringBuilder.append(valueOf);
        bli.m894c(str, stringBuilder.toString());
        err a = this.f12332a.f23062J.mo12891a(b);
        if (a != null) {
            if (cre != cre.f2792c && this.f12332a.f23065M.mo5751k() && this.f12332a.f23056D.mo5758a(cre.mo5692e())) {
                a.f23675a = this.f12332a.f23179n.mo7412c(uri);
            }
            mo12497a(cre, a);
            return false;
        }
        str = cfk.f23052a;
        String valueOf2 = String.valueOf(b);
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 49);
        stringBuilder2.append("onSessionDone: Could not find LocalData for URI: ");
        stringBuilder2.append(valueOf2);
        bli.m894c(str, stringBuilder2.toString());
        return true;
    }

    /* renamed from: a */
    public final void mo7205a(Uri uri) {
        String str = cfk.f23052a;
        String valueOf = String.valueOf(uri);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 18);
        stringBuilder.append("onSessionCanceled:");
        stringBuilder.append(valueOf);
        bli.m896d(str, stringBuilder.toString());
        cre b = this.f12332a.f23059G.mo7827b(uri);
        if (b != cre.f2792c) {
            this.f12332a.f23059G.mo7830b(b);
            return;
        }
        str = cfk.f23052a;
        valueOf = String.valueOf(uri);
        stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 62);
        stringBuilder.append("onSessionCanceled tried to remove URI that couldn't be found: ");
        stringBuilder.append(valueOf);
        bli.m898e(str, stringBuilder.toString());
    }

    /* renamed from: a */
    public final void mo7204a(Bitmap bitmap, int i) {
        String str = cfk.f23052a;
        String valueOf = String.valueOf(new iqp(bitmap.getWidth(), bitmap.getHeight()));
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 60);
        stringBuilder.append("onSessionCaptureIndicatorUpdate bitmap=");
        stringBuilder.append(valueOf);
        stringBuilder.append(" rotation=");
        stringBuilder.append(i);
        bli.m896d(str, stringBuilder.toString());
        cfk cfk = this.f12332a;
        if (!cfk.f23076X) {
            cfk.f23173h.post(new cft(cfk, bitmap, i));
        }
    }

    /* renamed from: a */
    public final void mo7210a(Uri uri, List list) {
        String str = cfk.f23052a;
        String valueOf = String.valueOf(uri);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 26);
        stringBuilder.append("onSessionDone: sessionUri:");
        stringBuilder.append(valueOf);
        bli.m896d(str, stringBuilder.toString());
        cre b = this.f12332a.f23059G.mo7827b(uri);
        if (cre.f2792c.equals(b)) {
            Uri b2 = this.f12332a.f23179n.mo7410b(uri);
            if (b2 == null) {
                this.f12332a.f23059G.mo7834c(uri);
                return;
            } else if (b2.getPath().startsWith(Media.EXTERNAL_CONTENT_URI.getPath())) {
                m8237b(uri, b);
                return;
            } else {
                m8236a(uri, b);
                return;
            }
        }
        err e = b.mo5692e();
        if (e instanceof cou) {
            new cfs(this, list, b, uri).executeOnExecutor(this.f12332a.f23068P, new Void[0]);
        } else if (e instanceof cqs) {
            m8237b(uri, b);
        } else if (e instanceof cql) {
            m8236a(uri, b);
        }
    }

    /* renamed from: a */
    public final void mo7209a(Uri uri, hec hec, boolean z) {
        String str = cfk.f23052a;
        String valueOf = String.valueOf(uri);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 16);
        stringBuilder.append("onSessionFailed:");
        stringBuilder.append(valueOf);
        bli.m896d(str, stringBuilder.toString());
        cre b = this.f12332a.f23059G.mo7827b(uri);
        if (this.f12332a.f23056D.mo5754a() == b) {
            this.f12332a.mo14587b(0);
            cfk cfk = this.f12332a;
            crw crw = cfk.f23191z;
            CharSequence a = hec.mo7762a(cfk.f23171f.getResources());
            crw.mo5706a();
            crw.f2823g.setVisibility(0);
            crw.f2824h.setText(a);
            this.f12332a.f23059G.mo7834c(uri);
        }
        if (z) {
            get b2 = this.f12332a.f23169d.mo7201b(uri);
            if (b2 != null) {
                grg h = b2.mo7077h();
                if (h != null) {
                    h.mo7379d();
                }
            }
            if (b != cre.f2792c) {
                this.f12332a.f23059G.mo7830b(b);
            }
        }
    }

    /* renamed from: b */
    public final void mo7212b(Uri uri) {
        String str = cfk.f23052a;
        String valueOf = String.valueOf(uri);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 17);
        stringBuilder.append("onSessionFocused:");
        stringBuilder.append(valueOf);
        bli.m896d(str, stringBuilder.toString());
        int a = this.f12332a.f23059G.mo7813a(uri);
        if (a == -1) {
            a = this.f12332a.f23059G.mo7813a(this.f12332a.f23179n.mo7410b(uri));
        }
        this.f12332a.f23056D.mo5757a(a);
    }

    /* renamed from: a */
    public final void mo7211a(byte[] bArr, int i) {
    }

    /* renamed from: a */
    public final void mo7206a(Uri uri, int i) {
        if (i >= 0) {
            cre a = this.f12332a.f23056D.mo5754a();
            if (a != cre.f2792c && uri.equals(a.mo5692e().mo6541g().f4384h)) {
                this.f12332a.mo14587b(i);
            }
        }
    }

    /* renamed from: a */
    public final void mo7208a(Uri uri, hec hec) {
        cre a = this.f12332a.f23056D.mo5754a();
        if (a != cre.f2792c && uri.equals(a.mo5692e().mo6541g().f4384h)) {
            cfk cfk = this.f12332a;
            cfk.f23066N.mo5701a(hec.mo7762a(cfk.f23171f.getResources()));
        }
    }

    /* renamed from: a */
    public final void mo7207a(Uri uri, glw glw, eqi eqi) {
        String str = cfk.f23052a;
        String valueOf = String.valueOf(uri);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 17);
        stringBuilder.append("onSessionQueued: ");
        stringBuilder.append(valueOf);
        bli.m896d(str, stringBuilder.toString());
        if (this.f12332a.f23179n.mo7416g(uri)) {
            kbg c;
            if (eqi != null) {
                c = kbg.m4804c(Long.valueOf(eqi.mo6497b()));
            } else {
                c = kau.f21835a;
            }
            if (glw != glw.VIDEO) {
                err cou;
                boolean z;
                Object cou2;
                if (glw == glw.BURST || glw == glw.PORTRAIT) {
                    cov a = cov.m8615a(uri, this.f12332a.f23179n, c);
                    if (a != null) {
                        gev b = this.f12332a.f23102aX;
                        cfk cfk = this.f12332a;
                        cou2 = new cou(b, cfk.f23169d, cfk.f23171f, cfk.f23058F, a, cfk.f23179n);
                    } else {
                        cou2 = null;
                    }
                } else if (glw == glw.RENDER_VIDEO) {
                    if (c.mo9709b()) {
                        cqx cqx = this.f12332a.f23063K;
                        long longValue = ((Long) c.mo9706a()).longValue();
                        Date date = new Date(cqx.f13170d.mo7415f(uri));
                        cou2 = new cqs(cqx.f13167a, cqx.f13168b, ((cqw) ((cqw) ((cqw) ((cqw) new cqw(uri).mo6559a(date)).mo6561b(date)).mo6563d()).mo6558a(longValue)).mo6560b(), cqx);
                    } else {
                        str = cfk.f23052a;
                        valueOf = String.valueOf(uri);
                        stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 49);
                        stringBuilder.append("onSessionQueued has no MediaStore record for uri ");
                        stringBuilder.append(valueOf);
                        bli.m891b(str, stringBuilder.toString());
                        return;
                    }
                } else if (glw == glw.HDR_PLUS || glw == glw.HDR_PLUS_AUTO) {
                    cou2 = this.f12332a.f23062J.mo12892a(uri, true, c);
                } else {
                    cou2 = this.f12332a.f23062J.mo12892a(uri, false, c);
                }
                if (cou2 == null) {
                    z = false;
                } else if (cou2 instanceof cou) {
                    z = true;
                } else if (cou2.mo6541g().f4378b == cqo.f13152a) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    this.f12332a.f23059G.mo7825a(cou2, cfk.m15201a(cou2, glw) ^ 1);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo7203a(Bitmap bitmap) {
    }

    /* renamed from: c */
    public final void mo7213c(Uri uri) {
        String str = cfk.f23052a;
        String valueOf = String.valueOf(uri);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 18);
        stringBuilder.append("onSessionUpdated: ");
        stringBuilder.append(valueOf);
        bli.m896d(str, stringBuilder.toString());
        this.f12332a.f23059G.mo7834c(uri);
    }

    /* renamed from: b */
    private final void m8237b(Uri uri, cre cre) {
        Uri b = this.f12332a.f23179n.mo7410b(uri);
        err a = this.f12332a.f23063K.mo12895a(b);
        if (a != null) {
            mo12497a(cre, a);
            return;
        }
        String str = cfk.f23052a;
        String valueOf = String.valueOf(b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
        stringBuilder.append("Could not find VideoItem for URI: ");
        stringBuilder.append(valueOf);
        bli.m891b(str, stringBuilder.toString());
    }
}
