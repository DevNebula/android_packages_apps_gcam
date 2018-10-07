package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: idr */
public final class idr implements icp, ied {
    /* renamed from: a */
    public final Lock f24598a;
    /* renamed from: b */
    public final Condition f24599b;
    /* renamed from: c */
    public final Context f24600c;
    /* renamed from: d */
    public final huc f24601d;
    /* renamed from: e */
    public final idt f24602e;
    /* renamed from: f */
    public final Map f24603f;
    /* renamed from: g */
    public final Map f24604g = new HashMap();
    /* renamed from: h */
    public final hvx f24605h;
    /* renamed from: i */
    public final Map f24606i;
    /* renamed from: j */
    public final huk f24607j;
    /* renamed from: k */
    public volatile idq f24608k;
    /* renamed from: l */
    public int f24609l;
    /* renamed from: m */
    public final idn f24610m;
    /* renamed from: n */
    public final iee f24611n;
    /* renamed from: o */
    private ConnectionResult f24612o = null;

    public idr(Context context, idn idn, Lock lock, Looper looper, huc huc, Map map, hvx hvx, Map map2, huk huk, ArrayList arrayList, iee iee) {
        this.f24600c = context;
        this.f24598a = lock;
        this.f24601d = huc;
        this.f24603f = map;
        this.f24605h = hvx;
        this.f24606i = map2;
        this.f24607j = huk;
        this.f24610m = idn;
        this.f24611n = iee;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            ((ico) arrayList.get(i)).f20873b = this;
            i = i2;
        }
        this.f24602e = new idt(this, looper);
        this.f24599b = lock.newCondition();
        this.f24608k = new idm(this);
    }

    /* renamed from: a */
    public final ich mo8395a(ich ich) {
        ich.mo13626d();
        return this.f24608k.mo8374a(ich);
    }

    /* renamed from: a */
    public final void mo8148a(int i) {
        this.f24598a.lock();
        try {
            this.f24608k.mo8376a(i);
        } finally {
            this.f24598a.unlock();
        }
    }

    /* renamed from: a */
    public final void mo8149a(Bundle bundle) {
        this.f24598a.lock();
        try {
            this.f24608k.mo8377a(bundle);
        } finally {
            this.f24598a.unlock();
        }
    }

    /* renamed from: a */
    final void mo14988a(ConnectionResult connectionResult) {
        this.f24598a.lock();
        try {
            this.f24612o = connectionResult;
            this.f24608k = new idm(this);
            this.f24608k.mo8375a();
            this.f24599b.signalAll();
        } finally {
            this.f24598a.unlock();
        }
    }

    /* renamed from: a */
    public final void mo13627a(ConnectionResult connectionResult, huh huh, boolean z) {
        this.f24598a.lock();
        try {
            this.f24608k.mo8378a(connectionResult, huh, z);
        } finally {
            this.f24598a.unlock();
        }
    }

    /* renamed from: a */
    final void mo14989a(ids ids) {
        this.f24602e.sendMessage(this.f24602e.obtainMessage(1, ids));
    }

    /* renamed from: b */
    public final ich mo8397b(ich ich) {
        ich.mo13626d();
        return this.f24608k.mo8379b(ich);
    }

    /* renamed from: b */
    public final void mo8398b() {
        this.f24608k.mo8380b();
    }

    /* renamed from: c */
    public final void mo8399c() {
        if (this.f24608k.mo8381c()) {
            this.f24604g.clear();
        }
    }

    /* renamed from: d */
    public final boolean mo8400d() {
        return this.f24608k instanceof icz;
    }

    /* renamed from: a */
    public final ConnectionResult mo8394a() {
        mo8398b();
        while (this.f24608k instanceof idb) {
            try {
                this.f24599b.await();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (mo8400d()) {
            return ConnectionResult.f23348a;
        }
        ConnectionResult connectionResult = this.f24612o;
        return connectionResult == null ? new ConnectionResult(13, null) : connectionResult;
    }

    /* renamed from: a */
    public final void mo8396a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append(str).append("mState=").println(this.f24608k);
        for (huh huh : this.f24606i.keySet()) {
            printWriter.append(str).append(huh.f7041a).println(":");
            ((huo) this.f24603f.get(huh.mo8131b())).mo13575a(concat, printWriter);
        }
    }
}
