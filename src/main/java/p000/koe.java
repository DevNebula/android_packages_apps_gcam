package p000;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: koe */
abstract class koe {
    /* renamed from: a */
    private static final Logger f8755a = Logger.getLogger(koe.class.getName());
    /* renamed from: c */
    public static final kof f8756c;
    public volatile int remaining;
    public volatile Set seenExceptions = null;

    static {
        kof kog;
        Throwable th;
        try {
            kog = new kog(AtomicReferenceFieldUpdater.newUpdater(koe.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(koe.class, "remaining"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            kog = new koh();
        }
        f8756c = kog;
        if (th != null) {
            f8755a.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    /* renamed from: a */
    abstract void mo10179a(Set set);

    koe(int i) {
        this.remaining = i;
    }
}
