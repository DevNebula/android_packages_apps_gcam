package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: bbj */
public final class bbj implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ List f1088a;
    /* renamed from: b */
    private final /* synthetic */ bcp f1089b;

    public bbj(List list, bcp bcp) {
        this.f1088a = list;
        this.f1089b = bcp;
    }

    public final void run() {
        Object obj = null;
        int i = 1;
        for (bbi bbi : this.f1088a) {
            i &= bbi.mo12350b();
            if (bbi.mo12350b() && bbi.mo12348a() != null) {
                this.f1089b.mo14559a(bbi.mo12348a());
                obj = 1;
            }
        }
        if (obj != null || this.f1089b.mo12350b()) {
            for (bbi bbi2 : this.f1088a) {
                bbi2.close();
            }
        } else if (i != 0) {
            iqo bbo = new bbo();
            try {
                for (bbi bbi22 : this.f1088a) {
                    boolean z;
                    jri.m13405b(bbi22.mo12350b());
                    if (bbi22.mo12348a() == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    jri.m13405b(z);
                    iqo c = bbi22.mo12351c();
                    if (c != null) {
                        bbo.add(c);
                    } else {
                        this.f1089b.close();
                    }
                    bbi22.close();
                }
            } finally {
                this.f1089b.mo14558a(bbo);
            }
        }
    }
}
