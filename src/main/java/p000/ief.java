package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* renamed from: ief */
public final class ief implements hus, hut, icp {
    /* renamed from: a */
    public final huo f24614a;
    /* renamed from: b */
    public final icx f24615b;
    /* renamed from: c */
    public final Set f24616c = new HashSet();
    /* renamed from: d */
    public final Map f24617d = new HashMap();
    /* renamed from: e */
    public final int f24618e;
    /* renamed from: f */
    public final hzs f24619f;
    /* renamed from: g */
    public boolean f24620g;
    /* renamed from: h */
    public final /* synthetic */ idv f24621h;
    /* renamed from: i */
    private final Queue f24622i = new LinkedList();
    /* renamed from: j */
    private final icd f24623j;
    /* renamed from: k */
    private ConnectionResult f24624k = null;

    public ief(idv idv, hva hva) {
        this.f24621h = idv;
        this.f24614a = hva.mo8158a(idv.f7319h.getLooper(), this);
        if (this.f24614a instanceof hvl) {
            hvl.m17926i();
        }
        this.f24623j = hva.f7067b;
        this.f24615b = new icx();
        this.f24618e = hva.f7069d;
        if (this.f24614a.mo13579f()) {
            this.f24619f = hva.mo8159a(idv.f7315d, idv.f7319h);
        } else {
            this.f24619f = null;
        }
    }

    /* renamed from: a */
    public final void mo14990a() {
        htl.m3462a(this.f24621h.f7319h);
        if (!this.f24614a.mo13577d() && !this.f24614a.mo13578e()) {
            if (this.f24614a.mo13581h() && this.f24621h.f7324n != 0) {
                idv idv = this.f24621h;
                idv.f7323m;
                idv.f7324n = huc.m3510a(this.f24621h.f7315d);
                if (this.f24621h.f7324n != 0) {
                    mo8150a(new ConnectionResult(this.f24621h.f7324n, null));
                    return;
                }
            }
            hvs hzu = new hzu(this.f24621h, this.f24614a, this.f24623j);
            if (this.f24614a.mo13579f()) {
                hzs hzs = this.f24619f;
                iau iau = hzs.f24536g;
                if (iau != null) {
                    iau.mo13576c();
                }
                if (hzs.f24533d) {
                    hte a = hte.m3426a(hzs.f24530a);
                    GoogleSignInOptions b = a.mo8112b(a.mo8113c("defaultGoogleSignInAccount"));
                    hzs.f24534e = b != null ? new HashSet(b.mo14617a()) : new HashSet();
                    hzs.f24535f = new hvx(null, hzs.f24534e, null, null, null, iav.f7248a);
                }
                huk huk = hzs.f24532c;
                Context context = hzs.f24530a;
                Looper looper = hzs.f24531b.getLooper();
                hvx hvx = hzs.f24535f;
                hzs.f24536g = (iau) huk.mo13572a(context, looper, hvx, hvx.f7117g, hzs, hzs);
                hzs.f24537h = hzu;
                hzs.f24536g.mo14964i();
            }
            this.f24614a.mo13573a(hzu);
        }
    }

    /* renamed from: b */
    final boolean mo14993b() {
        return this.f24614a.mo13577d();
    }

    /* renamed from: a */
    public final void mo8149a(Bundle bundle) {
        if (Looper.myLooper() != this.f24621h.f7319h.getLooper()) {
            this.f24621h.f7319h.post(new idw(this));
        } else {
            mo14996e();
        }
    }

    /* renamed from: a */
    public final void mo8150a(ConnectionResult connectionResult) {
        htl.m3462a(this.f24621h.f7319h);
        hzs hzs = this.f24619f;
        if (hzs != null) {
            hzs.f24536g.mo13576c();
        }
        mo14998g();
        this.f24621h.f7324n = -1;
        m16361b(connectionResult);
        if (connectionResult.f23349b == 4) {
            mo14991a(idv.f7312b);
        } else if (this.f24622i.isEmpty()) {
            this.f24624k = connectionResult;
        } else {
            synchronized (idv.f7313c) {
                null;
            }
            if (!this.f24621h.mo8384a(connectionResult, this.f24618e)) {
                if (connectionResult.f23349b == 18) {
                    this.f24620g = true;
                }
                if (this.f24620g) {
                    this.f24621h.f7319h.sendMessageDelayed(Message.obtain(this.f24621h.f7319h, 9, this.f24623j), this.f24621h.f7320i);
                    return;
                }
                String valueOf = String.valueOf(this.f24623j.f7288a.f7041a);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 38);
                stringBuilder.append("API: ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" is not available on this device.");
                mo14991a(new Status(17, stringBuilder.toString()));
            }
        }
    }

    /* renamed from: a */
    public final void mo8148a(int i) {
        if (Looper.myLooper() != this.f24621h.f7319h.getLooper()) {
            this.f24621h.f7319h.post(new idx(this));
        } else {
            mo14997f();
        }
    }

    /* renamed from: c */
    public final void mo14994c() {
        htl.m3462a(this.f24621h.f7319h);
        mo14991a(idv.f7311a);
        this.f24615b.mo8369a(false, idv.f7311a);
        for (iei icc : this.f24617d.keySet()) {
            mo14992a(new icc(icc, new ifw()));
        }
        m16361b(new ConnectionResult(4));
        this.f24614a.mo13576c();
    }

    /* renamed from: a */
    public final void mo14991a(Status status) {
        htl.m3462a(this.f24621h.f7319h);
        for (ibz a : this.f24622i) {
            a.mo8348a(status);
        }
        this.f24622i.clear();
    }

    /* renamed from: a */
    public final void mo13627a(ConnectionResult connectionResult, huh huh, boolean z) {
        if (Looper.myLooper() != this.f24621h.f7319h.getLooper()) {
            this.f24621h.f7319h.post(new idy(this, connectionResult));
        } else {
            mo8150a(connectionResult);
        }
    }

    /* renamed from: a */
    public final void mo14992a(ibz ibz) {
        htl.m3462a(this.f24621h.f7319h);
        if (this.f24614a.mo13577d()) {
            m16362b(ibz);
            mo15001j();
            return;
        }
        this.f24622i.add(ibz);
        ConnectionResult connectionResult = this.f24624k;
        if (connectionResult == null || !connectionResult.mo14630a()) {
            mo14990a();
        } else {
            mo8150a(this.f24624k);
        }
    }

    /* renamed from: b */
    private final void m16362b(ibz ibz) {
        ibz.mo8349a(this.f24615b, mo14995d());
        try {
            ibz.mo8350a(this);
        } catch (DeadObjectException e) {
            mo8148a(1);
            this.f24614a.mo13576c();
        }
    }

    /* renamed from: b */
    private final void m16361b(ConnectionResult connectionResult) {
        for (ice a : this.f24616c) {
            a.mo8353a(this.f24623j, connectionResult);
        }
        this.f24616c.clear();
    }

    /* renamed from: d */
    public final boolean mo14995d() {
        return this.f24614a.mo13579f();
    }

    /* renamed from: e */
    final void mo14996e() {
        mo14998g();
        m16361b(ConnectionResult.f23348a);
        mo15000i();
        for (hzq hzq : this.f24617d.values()) {
            try {
                C0635ax c0635ax = hzq.f7215a;
                ifw ifw = new ifw();
                c0635ax.mo12334h();
            } catch (DeadObjectException e) {
                mo8148a(1);
                this.f24614a.mo13576c();
            } catch (RemoteException e2) {
            }
        }
        while (this.f24614a.mo13577d() && !this.f24622i.isEmpty()) {
            m16362b((ibz) this.f24622i.remove());
        }
        mo15001j();
    }

    /* renamed from: f */
    final void mo14997f() {
        mo14998g();
        this.f24620g = true;
        this.f24615b.mo8369a(true, hzx.f7219a);
        this.f24621h.f7319h.sendMessageDelayed(Message.obtain(this.f24621h.f7319h, 9, this.f24623j), this.f24621h.f7320i);
        this.f24621h.f7319h.sendMessageDelayed(Message.obtain(this.f24621h.f7319h, 11, this.f24623j), this.f24621h.f7321j);
        this.f24621h.f7324n = -1;
    }

    /* renamed from: g */
    public final void mo14998g() {
        htl.m3462a(this.f24621h.f7319h);
        this.f24624k = null;
    }

    /* renamed from: h */
    public final ConnectionResult mo14999h() {
        htl.m3462a(this.f24621h.f7319h);
        return this.f24624k;
    }

    /* renamed from: i */
    final void mo15000i() {
        if (this.f24620g) {
            this.f24621h.f7319h.removeMessages(11, this.f24623j);
            this.f24621h.f7319h.removeMessages(9, this.f24623j);
            this.f24620g = false;
        }
    }

    /* renamed from: j */
    final void mo15001j() {
        this.f24621h.f7319h.removeMessages(12, this.f24623j);
        this.f24621h.f7319h.sendMessageDelayed(this.f24621h.f7319h.obtainMessage(12, this.f24623j), this.f24621h.f7322k);
    }
}
