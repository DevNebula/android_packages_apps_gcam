package p000;

import android.app.AlertDialog;
import android.content.res.Resources;
import android.view.KeyEvent;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;

/* compiled from: PG */
/* renamed from: dhz */
public abstract class dhz extends cvs {
    /* renamed from: d */
    public static final String f26038d = bli.m887a("CdrFastVid2Mod");
    /* renamed from: A */
    private final bkg f26039A;
    /* renamed from: B */
    private ikb f26040B;
    /* renamed from: C */
    private ebd f26041C;
    /* renamed from: D */
    private final hny f26042D;
    /* renamed from: E */
    private final hnz f26043E = new dib(this);
    /* renamed from: F */
    private final ipv f26044F = new dic(this);
    /* renamed from: G */
    private final haq f26045G = new die();
    /* renamed from: c */
    private final ilp f26046c;
    /* renamed from: e */
    public final ikd f26047e;
    /* renamed from: f */
    public final ikb f26048f;
    /* renamed from: g */
    public final String f26049g;
    /* renamed from: h */
    public final hch f26050h;
    /* renamed from: i */
    public final how f26051i;
    /* renamed from: j */
    public final Object f26052j = new Object();
    /* renamed from: k */
    public hkv f26053k;
    /* renamed from: l */
    public final awr f26054l;
    /* renamed from: m */
    public dii f26055m = dii.UNINITED;
    /* renamed from: n */
    public dil f26056n;
    /* renamed from: o */
    public kpk f26057o;
    /* renamed from: p */
    private final ilb f26058p;
    /* renamed from: q */
    private final bpq f26059q;
    /* renamed from: r */
    private final String f26060r;
    /* renamed from: s */
    private final dhs f26061s;
    /* renamed from: t */
    private final kwk f26062t;
    /* renamed from: u */
    private final BottomBarListener f26063u;
    /* renamed from: v */
    private final BottomBarController f26064v;
    /* renamed from: w */
    private final hcd f26065w;
    /* renamed from: x */
    private final ecd f26066x;
    /* renamed from: y */
    private final dzh f26067y;
    /* renamed from: z */
    private final bja f26068z;

    /* renamed from: a */
    public abstract BottomBarListener mo15505a(BottomBarController bottomBarController, hcd hcd);

    public dhz(ilp ilp, bag bag, bah bah, bpq bpq, ikd ikd, Resources resources, kwk kwk, ilp ilp2, hny hny, ilp ilp3, BottomBarController bottomBarController, hcd hcd, dzh dzh, ecd ecd, dht dht, bja bja, how how, awr awr, bkg bkg, bsn bsn) {
        super(bag, bah);
        bli.m888a(f26038d, "New instance created.");
        this.f26048f = new ikb();
        this.f26059q = bpq;
        this.f26047e = ikd;
        this.f26046c = ilp;
        this.f26058p = new ilb((inc) this.f26046c.mo13673b());
        this.f26060r = resources.getString(R.string.video_accessibility_peek);
        this.f26049g = resources.getString(R.string.pref_camera_video_flashmode_torch);
        this.f26067y = dzh;
        this.f26066x = ecd;
        this.f26062t = kwk;
        this.f26065w = hcd;
        this.f26042D = hny;
        this.f26068z = bja;
        this.f26051i = how;
        this.f26054l = awr;
        this.f26039A = bkg;
        this.f26048f.mo8557a(ilp2.mo13672a(new dih(this), ikd));
        this.f26048f.mo8557a(bkg);
        this.f26061s = dht.mo5970a(ilp3, this.f26044F, bsn);
        this.f26050h = new did(this);
        this.f26064v = bottomBarController;
        this.f26063u = mo15505a(this.f26064v, this.f26065w);
    }

    /* renamed from: a */
    public final void mo15507a(inc inc) {
        inc inc2 = (inc) this.f26058p.f24630c;
        String str;
        String valueOf;
        if (inc == inc2) {
            str = f26038d;
            valueOf = String.valueOf(inc);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 66);
            stringBuilder.append("changeCaptureRate() do nothing since captureRate[");
            stringBuilder.append(valueOf);
            stringBuilder.append("] does not change");
            bli.m891b(str, stringBuilder.toString());
            return;
        }
        valueOf = f26038d;
        str = String.valueOf(inc2);
        String valueOf2 = String.valueOf(inc);
        StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(str).length() + 29) + String.valueOf(valueOf2).length());
        stringBuilder2.append("changeCaptureRate() from:");
        stringBuilder2.append(str);
        stringBuilder2.append("to: ");
        stringBuilder2.append(valueOf2);
        bli.m888a(valueOf, stringBuilder2.toString());
        this.f26058p.mo8826a(inc);
        this.f26046c.mo8826a(inc);
        this.f26053k.mo7932c();
        this.f26053k.mo7928a(inc);
        synchronized (this.f26052j) {
            mo12933h();
            mo15506a(this.f26053k);
        }
    }

    /* renamed from: m */
    final void mo15508m() {
        synchronized (this.f26052j) {
            this.f26055m = dii.ERROR;
            if (this.f26056n != null) {
                bli.m896d(f26038d, "Leave the CamcorderDevice opened in the fatal error state");
            }
        }
    }

    public void close() {
        synchronized (this.f26052j) {
            bli.m888a(f26038d, "closing");
            m17397n();
            this.f26048f.close();
        }
    }

    /* renamed from: f_ */
    public final fha mo12931f_() {
        return null;
    }

    /* renamed from: b */
    public final String mo12925b() {
        return this.f26060r;
    }

    /* renamed from: a */
    public final void mo12922a(gos gos) {
    }

    /* renamed from: a */
    public final void mo12921a(cfh cfh, ezy ezy) {
        synchronized (this.f26052j) {
            String str = f26038d;
            String valueOf = String.valueOf(this.f26055m);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 11);
            stringBuilder.append("init state=");
            stringBuilder.append(valueOf);
            bli.m888a(str, stringBuilder.toString());
            if (this.f26055m == dii.UNINITED) {
                this.f26055m = dii.BACKGROUND;
                this.f26041C = cfh.mo12481l();
            } else if (this.f26055m == dii.BACKGROUND) {
                bli.m888a(f26038d, "init when the module is already in BACKGROUND");
            } else {
                bli.m888a(f26038d, "init when the module is not pause()");
            }
        }
    }

    /* renamed from: c */
    public final boolean mo12928c() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo12929e() {
        return true;
    }

    /* renamed from: f */
    public final boolean mo12930f() {
        synchronized (this.f26052j) {
            if (this.f26053k.f6684d.mo6225N()) {
                this.f26050h.onShutterButtonClick();
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public final void mo12920a(aah aah) {
    }

    /* renamed from: a */
    public final boolean mo12923a(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public final boolean mo12927b(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public final void mo12926b(boolean z) {
    }

    /* renamed from: a */
    public final void mo12919a(int i) {
        synchronized (this.f26052j) {
            if (this.f26055m.equals(dii.CAMCORDER_OPENED)) {
                boolean z;
                jri.m13404b(this.f26056n);
                dil dil = this.f26056n;
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                dil.mo13028b(z);
                return;
            }
        }
    }

    /* renamed from: a */
    final void mo15506a(hkv hkv) {
        bli.m888a(f26038d, "openCamcorderDevice");
        synchronized (this.f26052j) {
            jri.m13395a(this.f26055m.equals(dii.OPENING_CAMCORDER) ^ 1);
            this.f26055m = dii.OPENING_CAMCORDER;
            if (this.f26057o == null) {
                mo12932g();
            }
            kow.m13878a(this.f26057o, new dig(this, hkv), this.f26047e);
        }
    }

    /* renamed from: m_ */
    public final void mo12937m_() {
    }

    /* renamed from: g */
    public final void mo12932g() {
        bli.m888a(f26038d, "prewarm");
        synchronized (this.f26052j) {
            mo12933h();
            this.f26057o = this.f26061s.mo5969a();
            kow.m13878a(this.f26057o, new dif(this), kpq.f8776a);
        }
    }

    /* renamed from: h */
    public final void mo12933h() {
        synchronized (this.f26052j) {
            if (this.f26057o != null) {
                bli.m888a(f26038d, "prewarmCancel: cancel futureStateCamcorderDeviceOpened");
                this.f26057o.cancel(true);
                this.f26057o = null;
            }
            if (this.f26056n != null) {
                bli.m888a(f26038d, "prewarmCancel: close openedCamcorderDevice");
                this.f26056n.close();
                this.f26056n = null;
            }
            this.f26068z.mo1979a();
        }
    }

    /* renamed from: j */
    public final void mo12934j() {
    }

    /* renamed from: k */
    public final void mo12935k() {
        synchronized (this.f26052j) {
            String str = f26038d;
            String valueOf = String.valueOf(this.f26055m);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 12);
            stringBuilder.append("start state=");
            stringBuilder.append(valueOf);
            bli.m888a(str, stringBuilder.toString());
            if (this.f26055m != dii.BACKGROUND) {
                bli.m891b(f26038d, "do nothing. only resume when state is BACKGROUND");
                return;
            }
            this.f26040B = new ikb();
            this.f26040B.mo8557a(this.f26065w.mo7668a(this.f26050h));
            this.f26064v.addListener(this.f26063u);
            this.f26053k = (hkv) this.f26062t.mo10566a();
            this.f26053k.f6687g = this.f26041C;
            jri.m13405b(true);
            hkv hkv = this.f26053k;
            hkv.f6687g.mo13113a(ebk.SURFACE_VIEW, this.f26045G);
            this.f26066x.mo14869a(this.f26067y.mo6125b());
            mo15506a(this.f26053k);
            this.f26053k.mo7928a((inc) this.f26046c.mo13673b());
            this.f26042D.mo13554a(this.f26043E);
            this.f26039A.mo12389a();
        }
    }

    /* renamed from: l */
    public final void mo12936l() {
        synchronized (this.f26052j) {
            String str = f26038d;
            String valueOf = String.valueOf(this.f26055m);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 11);
            stringBuilder.append("stop state=");
            stringBuilder.append(valueOf);
            bli.m888a(str, stringBuilder.toString());
            if (this.f26055m == dii.BACKGROUND) {
                return;
            }
            m17397n();
        }
    }

    /* renamed from: n */
    private final void m17397n() {
        synchronized (this.f26052j) {
            this.f26064v.removeListener(this.f26063u);
            this.f26064v.cancelRecording();
            this.f26055m = dii.BACKGROUND;
            if (this.f26057o != null) {
                bli.m888a(f26038d, "stop: close futureStateCamcorderDeviceOpened");
                this.f26057o.cancel(true);
                this.f26057o = null;
            }
            if (this.f26056n != null) {
                bli.m888a(f26038d, "stop: close openedCamcorderDevice");
                this.f26056n.close();
                this.f26056n = null;
            }
            this.f26053k.mo7928a(null);
            hkv hkv = this.f26053k;
            AlertDialog alertDialog = hkv.f6688h;
            if (alertDialog != null && alertDialog.isShowing()) {
                hkv.f6688h.dismiss();
            }
            hkv.f6687g.mo13130j();
            this.f26042D.mo13555b(this.f26043E);
            this.f26040B.close();
            this.f26068z.mo1979a();
            this.f26039A.mo12390b();
        }
    }
}
