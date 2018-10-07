package p000;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: icv */
final class icv implements ifu {
    /* renamed from: a */
    private final /* synthetic */ icu f20907a;

    icv(icu icu) {
        this.f20907a = icu;
    }

    /* renamed from: a */
    public final void mo8427a(ifv ifv) {
        Lock lock = null;
        lock.lock();
        try {
            if (this.f20907a.f20890a) {
                Map map;
                if (ifv.mo8430b()) {
                    Map map2 = null;
                    this.f20907a.f20891b = new C0691ih(map2.size());
                    map = null;
                    for (ict ict : map.values()) {
                        this.f20907a.f20891b.put(ict.f7067b, ConnectionResult.f23348a);
                    }
                } else if (ifv.mo8429a() instanceof huz) {
                    huz huz = (huz) ifv.mo8429a();
                    this.f20907a.f20891b = huz.f7063a;
                    icu icu = this.f20907a;
                    map = null;
                    ConnectionResult connectionResult = lock;
                    for (ict ict2 : map.values()) {
                        huh huh = ict2.f7066a;
                        ConnectionResult connectionResult2 = (ConnectionResult) icu.f20891b.get(ict2.f7067b);
                        if (!connectionResult2.mo14631b()) {
                            Map map3 = null;
                            if (!((Boolean) map3.get(huh)).booleanValue() || connectionResult2.mo14630a() || huc.m3517b(connectionResult2.f23349b)) {
                                int i = connectionResult2.f23349b;
                                if (connectionResult != null) {
                                }
                                if (connectionResult == null) {
                                    connectionResult = connectionResult2;
                                }
                            }
                        }
                    }
                    if (connectionResult == null) {
                    }
                    icu.f20892c = connectionResult;
                } else {
                    Log.e("ConnectionlessGAC", "Unexpected availability exception", ifv.mo8429a());
                    this.f20907a.f20891b = Collections.emptyMap();
                    this.f20907a.f20892c = new ConnectionResult(8);
                }
                icu icu2 = this.f20907a;
                ConnectionResult connectionResult3 = icu2.f20892c;
                idn idn;
                if (connectionResult3 == null) {
                    null.f20962f = Collections.emptySet();
                    icu icu3 = this.f20907a;
                    while (true) {
                        Queue queue = null;
                        if (queue.isEmpty()) {
                            break;
                        }
                        queue = null;
                        icu3.mo8397b((ich) queue.remove());
                    }
                    idn = null;
                    idn.mo8402a(null);
                } else {
                    icu2.f20890a = false;
                    idn = null;
                    idn.mo8403a(connectionResult3);
                }
                Condition condition = null;
                condition.signalAll();
                return;
            }
            lock.unlock();
        } finally {
            lock.unlock();
        }
    }
}
