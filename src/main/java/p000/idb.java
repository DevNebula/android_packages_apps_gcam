package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* renamed from: idb */
public final class idb implements idq {
    /* renamed from: a */
    public final idr f20923a;
    /* renamed from: b */
    public final Lock f20924b;
    /* renamed from: c */
    public final Context f20925c;
    /* renamed from: d */
    public iau f20926d;
    /* renamed from: e */
    public boolean f20927e;
    /* renamed from: f */
    public boolean f20928f;
    /* renamed from: g */
    public hwk f20929g;
    /* renamed from: h */
    public boolean f20930h;
    /* renamed from: i */
    public boolean f20931i;
    /* renamed from: j */
    public final hvx f20932j;
    /* renamed from: k */
    private final huc f20933k;
    /* renamed from: l */
    private ConnectionResult f20934l;
    /* renamed from: m */
    private int f20935m;
    /* renamed from: n */
    private int f20936n = 0;
    /* renamed from: o */
    private int f20937o;
    /* renamed from: p */
    private final Bundle f20938p = new Bundle();
    /* renamed from: q */
    private final Set f20939q = new HashSet();
    /* renamed from: r */
    private boolean f20940r;
    /* renamed from: s */
    private final Map f20941s;
    /* renamed from: t */
    private final huk f20942t;
    /* renamed from: u */
    private ArrayList f20943u = new ArrayList();

    public idb(idr idr, hvx hvx, Map map, huc huc, huk huk, Lock lock, Context context) {
        this.f20923a = idr;
        this.f20932j = hvx;
        this.f20941s = map;
        this.f20933k = huc;
        this.f20942t = huk;
        this.f20924b = lock;
        this.f20925c = context;
    }

    /* renamed from: a */
    private final void m12374a(boolean z) {
        iau iau = this.f20926d;
        if (iau != null) {
            if (iau.mo13577d() && z) {
                this.f20926d.mo14961A_();
            }
            this.f20926d.mo13576c();
            this.f20929g = null;
        }
    }

    /* renamed from: c */
    private static String m12375c(int i) {
        switch (i) {
            case 0:
                return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            case 1:
                return "STEP_GETTING_REMOTE_SERVICE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: h */
    private final void m12377h() {
        ArrayList arrayList = this.f20943u;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            ((Future) arrayList.get(i)).cancel(true);
            i = i2;
        }
        this.f20943u.clear();
    }

    /* renamed from: a */
    public final ich mo8374a(ich ich) {
        this.f20923a.f24610m.f20960d.add(ich);
        return ich;
    }

    /* renamed from: a */
    public final void mo8375a() {
        this.f20923a.f24604g.clear();
        this.f20927e = false;
        this.f20934l = null;
        this.f20936n = 0;
        this.f20940r = true;
        this.f20928f = false;
        this.f20930h = false;
        Map hashMap = new HashMap();
        for (huh huh : this.f20941s.keySet()) {
            huo huo = (huo) this.f20923a.f24603f.get(huh.mo8131b());
            boolean booleanValue = ((Boolean) this.f20941s.get(huh)).booleanValue();
            if (huo.mo13579f()) {
                this.f20927e = true;
                if (booleanValue) {
                    this.f20939q.add(huh.mo8131b());
                } else {
                    this.f20940r = false;
                }
            }
            hashMap.put(huo, new idd(this, huh, booleanValue));
        }
        if (this.f20927e) {
            this.f20932j.f7118h = Integer.valueOf(System.identityHashCode(this.f20923a.f24610m));
            hus idk = new idk(this);
            huk huk = this.f20942t;
            Context context = this.f20925c;
            Looper looper = this.f20923a.f24610m.f20959c;
            hvx hvx = this.f20932j;
            this.f20926d = (iau) huk.mo13572a(context, looper, hvx, hvx.f7117g, idk, idk);
        }
        this.f20937o = this.f20923a.f24603f.size();
        this.f20943u.add(idu.f7310a.submit(new ide(this, hashMap)));
    }

    /* renamed from: a */
    public final void mo8376a(int i) {
        mo13631b(new ConnectionResult(8, null));
    }

    /* renamed from: a */
    public final void mo8377a(Bundle bundle) {
        if (mo13633b(1)) {
            if (bundle != null) {
                this.f20938p.putAll(bundle);
            }
            if (mo13634d()) {
                m12376g();
            }
        }
    }

    /* renamed from: a */
    public final void mo8378a(ConnectionResult connectionResult, huh huh, boolean z) {
        if (mo13633b(1)) {
            mo13632b(connectionResult, huh, z);
            if (mo13634d()) {
                m12376g();
            }
        }
    }

    /* renamed from: a */
    final boolean mo13630a(ConnectionResult connectionResult) {
        return this.f20940r && !connectionResult.mo14630a();
    }

    /* renamed from: b */
    public final ich mo8379b(ich ich) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* renamed from: b */
    public final void mo8380b() {
    }

    /* renamed from: b */
    final void mo13631b(ConnectionResult connectionResult) {
        m12377h();
        m12374a(connectionResult.mo14630a() ^ 1);
        this.f20923a.mo14988a(connectionResult);
        this.f20923a.f24611n.mo8403a(connectionResult);
    }

    /* renamed from: b */
    final boolean mo13633b(int i) {
        if (this.f20936n == i) {
            return true;
        }
        Log.w("GoogleApiClientConnecting", this.f20923a.f24610m.mo13638g());
        String valueOf = String.valueOf(this);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 23);
        stringBuilder.append("Unexpected callback in ");
        stringBuilder.append(valueOf);
        Log.w("GoogleApiClientConnecting", stringBuilder.toString());
        int i2 = this.f20937o;
        StringBuilder stringBuilder2 = new StringBuilder(33);
        stringBuilder2.append("mRemainingConnections=");
        stringBuilder2.append(i2);
        Log.w("GoogleApiClientConnecting", stringBuilder2.toString());
        valueOf = String.valueOf(idb.m12375c(this.f20936n));
        String valueOf2 = String.valueOf(idb.m12375c(i));
        StringBuilder stringBuilder3 = new StringBuilder((String.valueOf(valueOf).length() + 70) + String.valueOf(valueOf2).length());
        stringBuilder3.append("GoogleApiClient connecting is in step ");
        stringBuilder3.append(valueOf);
        stringBuilder3.append(" but received callback for step ");
        stringBuilder3.append(valueOf2);
        Log.wtf("GoogleApiClientConnecting", stringBuilder3.toString(), new Exception());
        mo13631b(new ConnectionResult(8, null));
        return false;
    }

    /* renamed from: c */
    public final boolean mo8381c() {
        m12377h();
        m12374a(true);
        this.f20923a.mo14988a(null);
        return true;
    }

    /* renamed from: d */
    final boolean mo13634d() {
        this.f20937o--;
        int i = this.f20937o;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            Log.w("GoogleApiClientConnecting", this.f20923a.f24610m.mo13638g());
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            mo13631b(new ConnectionResult(8, null));
            return false;
        }
        ConnectionResult connectionResult = this.f20934l;
        if (connectionResult == null) {
            return true;
        }
        this.f20923a.f24609l = this.f20935m;
        mo13631b(connectionResult);
        return false;
    }

    /* renamed from: f */
    final void mo13636f() {
        this.f20927e = false;
        this.f20923a.f24610m.f20962f = Collections.emptySet();
        for (hum hum : this.f20939q) {
            if (!this.f20923a.f24604g.containsKey(hum)) {
                this.f20923a.f24604g.put(hum, new ConnectionResult(17, null));
            }
        }
    }

    /* JADX WARNING: Missing block: B:17:0x0035, code:
            if (r0 == null) goto L_0x0010;
     */
    /* renamed from: b */
    final void mo13632b(com.google.android.gms.common.ConnectionResult r6, p000.huh r7, boolean r8) {
        /*
        r5 = this;
        r4 = 0;
        r3 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r1 = 0;
        r2 = 1;
        if (r8 != 0) goto L_0x0026;
    L_0x0008:
        r0 = r5.f20934l;
        if (r0 == 0) goto L_0x0024;
    L_0x000c:
        r0 = r5.f20935m;
        if (r0 > r3) goto L_0x0022;
    L_0x0010:
        if (r1 == 0) goto L_0x0016;
    L_0x0012:
        r5.f20934l = r6;
        r5.f20935m = r3;
    L_0x0016:
        r0 = r5.f20923a;
        r0 = r0.f24604g;
        r1 = r7.mo8131b();
        r0.put(r1, r6);
        return;
    L_0x0022:
        r1 = r2;
        goto L_0x0010;
    L_0x0024:
        r1 = r2;
        goto L_0x0010;
    L_0x0026:
        r0 = r6.mo14630a();
        if (r0 != 0) goto L_0x003a;
    L_0x002c:
        r0 = r6.f23349b;
        r0 = p000.huc.m3512a(r4, r0, r4);
        if (r0 != 0) goto L_0x0038;
    L_0x0034:
        r0 = r1;
    L_0x0035:
        if (r0 != 0) goto L_0x0008;
    L_0x0037:
        goto L_0x0010;
    L_0x0038:
        r0 = r2;
        goto L_0x0035;
    L_0x003a:
        r0 = r2;
        goto L_0x0035;
        */
        throw new UnsupportedOperationException("Method not decompiled: idb.b(com.google.android.gms.common.ConnectionResult, huh, boolean):void");
    }

    /* renamed from: e */
    final void mo13635e() {
        if (this.f20937o != 0) {
            return;
        }
        if (!this.f20927e || this.f20928f) {
            ArrayList arrayList = new ArrayList();
            this.f20936n = 1;
            this.f20937o = this.f20923a.f24603f.size();
            for (hum hum : this.f20923a.f24603f.keySet()) {
                if (!this.f20923a.f24604g.containsKey(hum)) {
                    arrayList.add((huo) this.f20923a.f24603f.get(hum));
                } else if (mo13634d()) {
                    m12376g();
                }
            }
            if (!arrayList.isEmpty()) {
                this.f20943u.add(idu.f7310a.submit(new idh(this, arrayList)));
            }
        }
    }

    /* renamed from: g */
    private final void m12376g() {
        idr idr = this.f20923a;
        idr.f24598a.lock();
        try {
            idr.f24610m.mo13637f();
            idr.f24608k = new icz(idr);
            idr.f24608k.mo8375a();
            idr.f24599b.signalAll();
            idu.f7310a.execute(new idc(this));
            iau iau = this.f20926d;
            if (iau != null) {
                if (this.f20930h) {
                    iau.mo14962a(this.f20929g, this.f20931i);
                }
                m12374a(false);
            }
            for (hum hum : this.f20923a.f24604g.keySet()) {
                ((huo) this.f20923a.f24603f.get(hum)).mo13576c();
            }
            this.f20923a.f24611n.mo8402a(!this.f20938p.isEmpty() ? this.f20938p : null);
        } finally {
            idr.f24598a.unlock();
        }
    }
}
