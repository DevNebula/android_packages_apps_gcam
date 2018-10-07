package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: bwt */
public final class bwt implements bwp {
    /* renamed from: a */
    private final List f22865a = new ArrayList(400);
    /* renamed from: b */
    private boolean f22866b = true;
    /* renamed from: c */
    private final /* synthetic */ ccq f22867c;

    public bwt(ccq ccq) {
        this.f22867c = ccq;
    }

    public final synchronized void close() {
        this.f22866b = false;
        this.f22867c.mo12447a((bwp) this);
    }

    /* renamed from: a */
    public final synchronized void mo12435a(long j, long j2, bwq bwq) {
        if (this.f22866b) {
            synchronized (this.f22867c) {
                int i;
                bwr bwr;
                long j3;
                bwr bwr2;
                this.f22865a.clear();
                int i2 = this.f22867c.f12166c;
                while (true) {
                    i = i2;
                    if (i >= 400) {
                        i = 0;
                        break;
                    }
                    bwr = (bwr) this.f22867c.f12164a.get(i);
                    j3 = bwr.f1689e;
                    if (j3 > j2) {
                        i = 0;
                        break;
                    }
                    if (j3 >= j) {
                        bwr2 = (bwr) this.f22867c.f12165b.mo8823a();
                        bwr2.mo2189a(bwr);
                        this.f22865a.add(bwr2);
                    }
                    i2 = i + 1;
                }
                while (true) {
                    ccq ccq = this.f22867c;
                    if (i < ccq.f12166c) {
                        bwr = (bwr) ccq.f12164a.get(i);
                        j3 = bwr.f1689e;
                        if (j3 > j2) {
                            break;
                        }
                        if (j3 >= j) {
                            bwr2 = (bwr) this.f22867c.f12165b.mo8823a();
                            bwr2.mo2189a(bwr);
                            this.f22865a.add(bwr2);
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            bwq.mo2188a(this.f22865a);
            synchronized (this.f22867c) {
                for (int i3 = 0; i3 < this.f22865a.size(); i3++) {
                    this.f22867c.f12165b.mo8824a((bwr) this.f22865a.get(i3));
                }
                this.f22865a.clear();
            }
        } else {
            bwq.mo2188a(Collections.emptyList());
        }
    }
}
