package p000;

import android.os.SystemClock;
import java.util.LinkedList;

/* compiled from: PG */
/* renamed from: grk */
public final class grk {
    /* renamed from: a */
    public static final String f6016a = bli.m887a("GcamUsageStats");
    /* renamed from: b */
    public LinkedList f6017b = new LinkedList();
    /* renamed from: c */
    private final irs f6018c;

    public grk(irs irs) {
        this.f6018c = irs;
    }

    /* renamed from: a */
    public final void mo7380a(grg grg) {
        this.f6017b.add(new epq(SystemClock.uptimeMillis(), this.f6017b.size()));
        this.f6018c.mo8886a(7, null, null, null);
        grg.mo7376b();
    }
}
