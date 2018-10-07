package p000;

import android.os.Handler.Callback;
import android.os.Message;
import java.util.List;

/* compiled from: PG */
/* renamed from: aga */
final class aga implements Callback {
    aga() {
    }

    public final boolean handleMessage(Message message) {
        afy afy = (afy) message.obj;
        aqh aqh;
        switch (message.what) {
            case 1:
                afy.f10221b.mo1767b();
                if (!afy.f10238s) {
                    if (!afy.f10220a.isEmpty()) {
                        if (!afy.f10232m) {
                            afy.f10236q = new age(afy.f10230k, afy.f10226g, true);
                            afy.f10232m = true;
                            afy.f10236q.mo11634a();
                            afy.f10223d.mo245a(afy, afy.f10225f, afy.f10236q);
                            int size = afy.f10220a.size();
                            for (int i = 0; i < size; i++) {
                                aqh = (aqh) afy.f10220a.get(i);
                                if (!afy.mo11632b(aqh)) {
                                    afy.f10236q.mo11634a();
                                    aqh.mo1716a(afy.f10236q, afy.f10231l);
                                }
                            }
                            afy.f10236q.mo11636f();
                            break;
                        }
                        throw new IllegalStateException("Already have resource");
                    }
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                afy.f10230k.mo265e();
                break;
            case 2:
                afy.f10221b.mo1767b();
                if (!afy.f10238s) {
                    if (!afy.f10220a.isEmpty()) {
                        if (!afy.f10234o) {
                            afy.f10234o = true;
                            afy.f10223d.mo245a(afy, afy.f10225f, null);
                            for (aqh aqh2 : afy.f10220a) {
                                if (!afy.mo11632b(aqh2)) {
                                    aqh2.mo1715a(afy.f10233n);
                                }
                            }
                            break;
                        }
                        throw new IllegalStateException("Already failed once");
                    }
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                break;
            case 3:
                afy.f10221b.mo1767b();
                if (afy.f10238s) {
                    afy.f10223d.mo244a(afy, afy.f10225f);
                    break;
                }
                throw new IllegalStateException("Not cancelled");
            default:
                int i2 = message.what;
                StringBuilder stringBuilder = new StringBuilder(33);
                stringBuilder.append("Unrecognized message: ");
                stringBuilder.append(i2);
                throw new IllegalStateException(stringBuilder.toString());
        }
        arq.m678a();
        afy.f10220a.clear();
        afy.f10225f = null;
        afy.f10236q = null;
        afy.f10230k = null;
        List list = afy.f10235p;
        if (list != null) {
            list.clear();
        }
        afy.f10234o = false;
        afy.f10238s = false;
        afy.f10232m = false;
        afd afd = afy.f10237r;
        if (afd.f10185d.mo231c()) {
            afd.mo11627b();
        }
        afy.f10237r = null;
        afy.f10233n = null;
        afy.f10231l = null;
        afy.f10222c.mo9114a(afy);
        return true;
    }
}
