package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* renamed from: idn */
public final class idn extends huq implements iee {
    /* renamed from: b */
    public final Lock f20958b;
    /* renamed from: c */
    public final Looper f20959c;
    /* renamed from: d */
    public final Queue f20960d = new LinkedList();
    /* renamed from: e */
    public final Map f20961e;
    /* renamed from: f */
    public Set f20962f = new HashSet();
    /* renamed from: g */
    public final hzx f20963g;
    /* renamed from: h */
    private final hwd f20964h;
    /* renamed from: i */
    private ied f20965i = null;
    /* renamed from: j */
    private final int f20966j;
    /* renamed from: k */
    private final Context f20967k;
    /* renamed from: l */
    private volatile boolean f20968l;
    /* renamed from: m */
    private long f20969m = 120000;
    /* renamed from: n */
    private long f20970n = 5000;
    /* renamed from: o */
    private final idp f20971o;
    /* renamed from: p */
    private final hua f20972p;
    /* renamed from: q */
    private ieb f20973q;
    /* renamed from: r */
    private final hvx f20974r;
    /* renamed from: s */
    private final Map f20975s;
    /* renamed from: t */
    private final huk f20976t;
    /* renamed from: u */
    private final iek f20977u = new iek();
    /* renamed from: v */
    private final ArrayList f20978v;
    /* renamed from: w */
    private Integer f20979w = null;
    /* renamed from: x */
    private final hwe f20980x = new ido(this);

    public idn(Context context, Lock lock, Looper looper, hvx hvx, hua hua, huk huk, Map map, List list, List list2, Map map2, int i, int i2, ArrayList arrayList) {
        this.f20967k = context;
        this.f20958b = lock;
        this.f20964h = new hwd(looper, this.f20980x);
        this.f20959c = looper;
        this.f20971o = new idp(this, looper);
        this.f20972p = hua;
        this.f20966j = i;
        if (this.f20966j >= 0) {
            this.f20979w = Integer.valueOf(i2);
        }
        this.f20975s = map;
        this.f20961e = map2;
        this.f20978v = arrayList;
        this.f20963g = new hzx();
        for (hus a : list) {
            this.f20964h.mo8217a(a);
        }
        for (hut a2 : list2) {
            this.f20964h.mo8218a(a2);
        }
        this.f20974r = hvx;
        this.f20976t = huk;
    }

    /* renamed from: a */
    public static int m12410a(Iterable iterable) {
        int i = 0;
        for (huo huo : iterable) {
            if (huo.mo13579f()) {
                i = 1;
            }
            huo.mo13580g();
        }
        return i == 0 ? 3 : 1;
    }

    /* renamed from: b */
    private static String m12413b(int i) {
        switch (i) {
            case 1:
                return "SIGN_IN_MODE_REQUIRED";
            case 2:
                return "SIGN_IN_MODE_OPTIONAL";
            case 3:
                return "SIGN_IN_MODE_NONE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: a */
    public final ConnectionResult mo8132a() {
        boolean z = true;
        htl.m3479a(Looper.myLooper() != Looper.getMainLooper(), (Object) "blockingConnect must not be called on the UI thread");
        this.f20958b.lock();
        try {
            if (this.f20966j < 0) {
                Integer num = this.f20979w;
                if (num == null) {
                    this.f20979w = Integer.valueOf(idn.m12410a(this.f20961e.values()));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            if (this.f20979w == null) {
                z = false;
            }
            htl.m3479a(z, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            m12411a(this.f20979w.intValue());
            this.f20964h.f7133e = true;
            ConnectionResult a = this.f20965i.mo8394a();
            return a;
        } finally {
            this.f20958b.unlock();
        }
    }

    /* renamed from: a */
    public final huo mo8133a(hum hum) {
        Object obj = (huo) this.f20961e.get(hum);
        htl.m3489b(obj, (Object) "Appropriate Api was not requested.");
        return obj;
    }

    /* renamed from: a */
    public final void mo8136a(hus hus) {
        this.f20964h.mo8217a(hus);
    }

    /* renamed from: a */
    public final void mo8137a(hut hut) {
        this.f20964h.mo8218a(hut);
    }

    /* renamed from: d */
    public final Looper mo8143d() {
        return this.f20959c;
    }

    /* renamed from: e */
    public final boolean mo8144e() {
        ied ied = this.f20965i;
        return ied != null && ied.mo8400d();
    }

    /* renamed from: b */
    public final void mo8139b() {
        boolean z = true;
        this.f20958b.lock();
        try {
            if (this.f20966j < 0) {
                Integer num = this.f20979w;
                if (num == null) {
                    this.f20979w = Integer.valueOf(idn.m12410a(this.f20961e.values()));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            htl.m3479a(this.f20979w != null, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            int intValue = this.f20979w.intValue();
            this.f20958b.lock();
            if (!(intValue == 3 || intValue == 1 || intValue == 2)) {
                z = false;
            }
            StringBuilder stringBuilder = new StringBuilder(33);
            stringBuilder.append("Illegal sign-in mode: ");
            stringBuilder.append(intValue);
            htl.m3493b(z, stringBuilder.toString());
            m12411a(intValue);
            m12415h();
        } catch (Throwable th) {
        } finally {
            this.f20958b.unlock();
        }
        this.f20958b.unlock();
    }

    /* renamed from: c */
    public final void mo8142c() {
        this.f20958b.lock();
        try {
            hzx hzx = this.f20963g;
            for (ick ick : (ick[]) hzx.f7221c.toArray(hzx.f7220b)) {
                ick.mo13622a(null);
                if (ick.mo13625c()) {
                    hzx.f7221c.remove(ick);
                }
            }
            ied ied = this.f20965i;
            if (ied != null) {
                ied.mo8399c();
            }
            iek iek = this.f20977u;
            for (ieg ieg : iek.f7342a) {
                ieg.f7336a = null;
            }
            iek.f7342a.clear();
            for (ich ich : this.f20960d) {
                ich.mo13622a(null);
                ich.mo13620a();
            }
            this.f20960d.clear();
            if (this.f20965i != null) {
                mo13637f();
                this.f20964h.mo8216a();
                return;
            }
            this.f20958b.unlock();
        } finally {
            this.f20958b.unlock();
        }
    }

    /* renamed from: b */
    public final void mo8140b(hus hus) {
        hwd hwd = this.f20964h;
        htl.m3488b((Object) hus);
        synchronized (hwd.f7137i) {
            if (!hwd.f7130b.remove(hus)) {
                String valueOf = String.valueOf(hus);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 52);
                stringBuilder.append("unregisterConnectionCallbacks(): listener ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" not found");
                Log.w("GmsClientEvents", stringBuilder.toString());
            } else if (hwd.f7135g) {
                hwd.f7131c.add(hus);
            }
        }
    }

    /* renamed from: b */
    public final void mo8141b(hut hut) {
        hwd hwd = this.f20964h;
        htl.m3488b((Object) hut);
        synchronized (hwd.f7137i) {
            if (!hwd.f7132d.remove(hut)) {
                String valueOf = String.valueOf(hut);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 57);
                stringBuilder.append("unregisterConnectionFailedListener(): listener ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" not found");
                Log.w("GmsClientEvents", stringBuilder.toString());
            }
        }
    }

    /* renamed from: a */
    public final ich mo8134a(ich ich) {
        htl.m3493b(ich.f24595e != null, (Object) "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.f20961e.containsKey(ich.f24595e);
        huh huh = ich.f24596f;
        String str = huh != null ? huh.f7041a : "the API";
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 65);
        stringBuilder.append("GoogleApiClient is not configured to use ");
        stringBuilder.append(str);
        stringBuilder.append(" required for this call.");
        htl.m3493b(containsKey, stringBuilder.toString());
        this.f20958b.lock();
        try {
            ied ied = this.f20965i;
            if (ied == null) {
                this.f20960d.add(ich);
            } else {
                ich = ied.mo8395a(ich);
                this.f20958b.unlock();
            }
            return ich;
        } finally {
            this.f20958b.unlock();
        }
    }

    /* renamed from: b */
    public final ich mo8138b(ich ich) {
        htl.m3493b(ich.f24595e != null, (Object) "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.f20961e.containsKey(ich.f24595e);
        huh huh = ich.f24596f;
        String str = huh != null ? huh.f7041a : "the API";
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 65);
        stringBuilder.append("GoogleApiClient is not configured to use ");
        stringBuilder.append(str);
        stringBuilder.append(" required for this call.");
        htl.m3493b(containsKey, stringBuilder.toString());
        this.f20958b.lock();
        try {
            ied ied = this.f20965i;
            if (ied != null) {
                if (this.f20968l) {
                    this.f20960d.add(ich);
                    while (!this.f20960d.isEmpty()) {
                        ich ich2 = (ich) this.f20960d.remove();
                        this.f20963g.mo8293a(ich2);
                        ich2.mo14986b(Status.f23356b);
                    }
                    this.f20958b.unlock();
                } else {
                    ich = ied.mo8397b(ich);
                }
                return ich;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } finally {
            this.f20958b.unlock();
        }
    }

    /* renamed from: a */
    public final void mo8403a(ConnectionResult connectionResult) {
        if (!huc.m3515a(this.f20967k, connectionResult.f23349b)) {
            mo13637f();
        }
        if (!this.f20968l) {
            hwd hwd = this.f20964h;
            htl.m3479a(Looper.myLooper() == hwd.f7136h.getLooper(), (Object) "onConnectionFailure must only be called on the Handler thread");
            hwd.f7136h.removeMessages(1);
            synchronized (hwd.f7137i) {
                ArrayList arrayList = new ArrayList(hwd.f7132d);
                int i = hwd.f7134f.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    hut hut = (hut) it.next();
                    if (!hwd.f7133e || hwd.f7134f.get() != i) {
                        break;
                    } else if (hwd.f7132d.contains(hut)) {
                        hut.mo8150a(connectionResult);
                    }
                }
            }
            this.f20964h.mo8216a();
        }
    }

    /* renamed from: a */
    public final void mo8401a(int i, boolean z) {
        int i2 = 0;
        if (!(i != 1 || z || this.f20968l)) {
            this.f20968l = true;
            if (this.f20973q == null) {
                this.f20973q = hua.m12221a(this.f20967k.getApplicationContext(), new iec(this));
            }
            idp idp = this.f20971o;
            idp.sendMessageDelayed(idp.obtainMessage(1), this.f20969m);
            idp = this.f20971o;
            idp.sendMessageDelayed(idp.obtainMessage(2), this.f20970n);
        }
        for (ick c : (ick[]) this.f20963g.f7221c.toArray(hzx.f7220b)) {
            c.mo13624c(hzx.f7219a);
        }
        hwd hwd = this.f20964h;
        htl.m3479a(Looper.myLooper() == hwd.f7136h.getLooper(), (Object) "onUnintentionalDisconnection must only be called on the Handler thread");
        hwd.f7136h.removeMessages(1);
        synchronized (hwd.f7137i) {
            hwd.f7135g = true;
            ArrayList arrayList = new ArrayList(hwd.f7130b);
            int i3 = hwd.f7134f.get();
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                hus hus = (hus) obj;
                if (!hwd.f7133e || hwd.f7134f.get() != i3) {
                    break;
                } else if (hwd.f7130b.contains(hus)) {
                    hus.mo8148a(i);
                }
            }
            hwd.f7131c.clear();
            hwd.f7135g = false;
        }
        this.f20964h.mo8216a();
        if (i == 2) {
            m12415h();
        }
    }

    /* renamed from: a */
    private final void m12411a(int i) {
        Integer num = this.f20979w;
        if (num == null) {
            this.f20979w = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String valueOf = String.valueOf(idn.m12413b(i));
            String valueOf2 = String.valueOf(idn.m12413b(this.f20979w.intValue()));
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 51) + String.valueOf(valueOf2).length());
            stringBuilder.append("Cannot use sign-in mode: ");
            stringBuilder.append(valueOf);
            stringBuilder.append(". Mode was already set to ");
            stringBuilder.append(valueOf2);
            throw new IllegalStateException(stringBuilder.toString());
        }
        if (this.f20965i == null) {
            Object obj = null;
            for (huo huo : this.f20961e.values()) {
                if (huo.mo13579f()) {
                    obj = 1;
                }
                huo.mo13580g();
            }
            switch (this.f20979w.intValue()) {
                case 1:
                    if (obj == null) {
                        throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                    }
                    break;
                case 2:
                    if (obj != null) {
                        Context context = this.f20967k;
                        Lock lock = this.f20958b;
                        Looper looper = this.f20959c;
                        huc huc = this.f20972p;
                        Map map = this.f20961e;
                        hvx hvx = this.f20974r;
                        Map map2 = this.f20975s;
                        huk huk = this.f20976t;
                        ArrayList arrayList = this.f20978v;
                        Map c0691ih = new C0691ih();
                        Map c0691ih2 = new C0691ih();
                        for (Entry entry : map.entrySet()) {
                            huo huo2 = (huo) entry.getValue();
                            huo2.mo13580g();
                            if (huo2.mo13579f()) {
                                c0691ih.put((hum) entry.getKey(), huo2);
                            } else {
                                c0691ih2.put((hum) entry.getKey(), huo2);
                            }
                        }
                        htl.m3479a(c0691ih.isEmpty() ^ 1, (Object) "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
                        Map c0691ih3 = new C0691ih();
                        Map c0691ih4 = new C0691ih();
                        for (huh huh : map2.keySet()) {
                            hum b = huh.mo8131b();
                            if (c0691ih.containsKey(b)) {
                                c0691ih3.put(huh, (Boolean) map2.get(huh));
                            } else if (c0691ih2.containsKey(b)) {
                                c0691ih4.put(huh, (Boolean) map2.get(huh));
                            } else {
                                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            int i3 = i2 + 1;
                            ico ico = (ico) arrayList.get(i2);
                            if (c0691ih3.containsKey(ico.f20872a)) {
                                arrayList2.add(ico);
                                i2 = i3;
                            } else if (c0691ih4.containsKey(ico.f20872a)) {
                                arrayList3.add(ico);
                                i2 = i3;
                            } else {
                                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                            }
                        }
                        this.f20965i = new icq(context, this, lock, looper, huc, c0691ih, c0691ih2, hvx, huk, arrayList2, arrayList3, c0691ih3, c0691ih4);
                        return;
                    }
                    break;
            }
            this.f20965i = new idr(this.f20967k, this, this.f20958b, this.f20959c, this.f20972p, this.f20961e, this.f20974r, this.f20975s, this.f20976t, this.f20978v, this);
        }
    }

    /* renamed from: a */
    public final void mo8402a(Bundle bundle) {
        boolean z = true;
        int i = 0;
        while (!this.f20960d.isEmpty()) {
            mo8138b((ich) this.f20960d.remove());
        }
        hwd hwd = this.f20964h;
        htl.m3479a(Looper.myLooper() == hwd.f7136h.getLooper(), (Object) "onConnectionSuccess must only be called on the Handler thread");
        synchronized (hwd.f7137i) {
            htl.m3478a(hwd.f7135g ^ 1);
            hwd.f7136h.removeMessages(1);
            hwd.f7135g = true;
            if (hwd.f7131c.size() != 0) {
                z = false;
            }
            htl.m3478a(z);
            ArrayList arrayList = new ArrayList(hwd.f7130b);
            int i2 = hwd.f7134f.get();
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                hus hus = (hus) obj;
                if (!hwd.f7133e || !hwd.f7129a.mo8220d() || hwd.f7134f.get() != i2) {
                    break;
                } else if (!hwd.f7131c.contains(hus)) {
                    hus.mo8149a(bundle);
                }
            }
            hwd.f7131c.clear();
            hwd.f7135g = false;
        }
    }

    /* renamed from: a */
    public final ieg mo8135a(Object obj) {
        this.f20958b.lock();
        ieg a;
        try {
            iek iek = this.f20977u;
            a = iek.m3768a(obj, this.f20959c, "NO_TYPE");
            iek.f7342a.add(a);
            return a;
        } finally {
            a = this.f20958b;
            a.unlock();
        }
    }

    /* renamed from: h */
    private final void m12415h() {
        this.f20964h.f7133e = true;
        this.f20965i.mo8398b();
    }

    /* renamed from: f */
    final boolean mo13637f() {
        if (!this.f20968l) {
            return false;
        }
        this.f20968l = false;
        this.f20971o.removeMessages(2);
        this.f20971o.removeMessages(1);
        ieb ieb = this.f20973q;
        if (ieb == null) {
            return true;
        }
        ieb.mo8391a();
        this.f20973q = null;
        return true;
    }

    /* renamed from: g */
    final String mo13638g() {
        Writer stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        Object obj = "";
        printWriter.append(obj).append("mContext=").println(this.f20967k);
        printWriter.append(obj).append("mResuming=").print(this.f20968l);
        printWriter.append(" mWorkQueue.size()=").print(this.f20960d.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f20963g.f7221c.size());
        ied ied = this.f20965i;
        if (ied != null) {
            ied.mo8396a(obj, null, printWriter, null);
        }
        return stringWriter.toString();
    }
}
