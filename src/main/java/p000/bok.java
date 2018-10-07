package p000;

import android.os.IBinder;
import android.util.Log;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bok */
public final class bok implements bou {
    /* renamed from: a */
    private final bog f22817a;
    /* renamed from: b */
    private final ilp f22818b;
    /* renamed from: c */
    private final iqo f22819c;
    /* renamed from: d */
    private final iqo f22820d;
    /* renamed from: e */
    private final iqz f22821e;
    /* renamed from: f */
    private final boo f22822f;
    /* renamed from: g */
    private final iqt f22823g;
    /* renamed from: h */
    private final iqt f22824h;
    /* renamed from: i */
    private boolean f22825i;
    /* renamed from: j */
    private final Object f22826j = new Object();

    public bok(bog bog, boo boo, ilp ilp, ilp ilp2, ira ira, Executor executor) {
        this.f22817a = bog;
        this.f22822f = boo;
        this.f22818b = ilp;
        this.f22821e = ira.mo8854a("ElmyraConnH");
        this.f22821e.mo8836d("ElmyraConnectionHandler created.");
        this.f22823g = new bol(this, ilp2);
        this.f22824h = new bom(this, ilp);
        this.f22819c = ilp.mo13672a(this.f22823g, executor);
        this.f22820d = ilp2.mo13672a(this.f22824h, executor);
    }

    public final void close() {
        synchronized (this.f22826j) {
            if (this.f22825i) {
                return;
            }
            this.f22819c.close();
            this.f22820d.close();
            mo12413a();
            this.f22825i = true;
        }
    }

    /* renamed from: a */
    public final void mo12413a() {
        synchronized (this.f22826j) {
            if (this.f22825i) {
                return;
            }
            m15111c();
        }
    }

    /* renamed from: a */
    final void mo14571a(hhx hhx, boolean z) {
        iqz iqz = this.f22821e;
        String valueOf = String.valueOf(hhx);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 57);
        stringBuilder.append("ApplicationMode is now: ");
        stringBuilder.append(valueOf);
        stringBuilder.append(", AGSA availability is now: ");
        stringBuilder.append(z);
        iqz.mo8836d(stringBuilder.toString());
        boo boo = this.f22822f;
        m15111c();
    }

    /* renamed from: b */
    public final void mo12414b() {
        synchronized (this.f22826j) {
            if (this.f22825i) {
                return;
            }
            this.f22823g.mo8826a((hhx) this.f22818b.mo13673b());
        }
    }

    /* renamed from: c */
    private final void m15111c() {
        synchronized (this.f22826j) {
            if (this.f22825i) {
                return;
            }
            this.f22821e.mo8836d("ElmyraClient unbinding from service.");
            bog bog = this.f22817a;
            synchronized (bog.f1386b) {
                if (bog.f1392h) {
                    bog.f1385a.unbindService(bog.f1387c);
                    bog.f1392h = false;
                }
            }
            bog = this.f22817a;
            synchronized (bog.f1386b) {
                bog.f1390f = null;
                kaq kaq = bog.f1389e;
                if (kaq == null) {
                    Log.w("ElmyraClient", "Service is null, should try to reconnect");
                } else {
                    if (null != null) {
                        try {
                            kaq.mo9688a(bog.f1391g, (IBinder) bog.f1388d);
                        } catch (Throwable e) {
                            String str;
                            String str2 = "ElmyraClient";
                            if (null != null) {
                                str = "check";
                            } else {
                                str = "unregister";
                            }
                            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 19);
                            stringBuilder.append("Failed to ");
                            stringBuilder.append(str);
                            stringBuilder.append(" listener");
                            Log.e(str2, stringBuilder.toString(), e);
                        }
                    } else {
                        kaq.mo9688a(bog.f1391g, null);
                    }
                }
            }
        }
    }
}
