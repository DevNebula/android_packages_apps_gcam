package p000;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* renamed from: ghh */
public class ghh {
    /* renamed from: a */
    private int f5435a = 0;
    /* renamed from: b */
    private final ReentrantLock f5436b = new ReentrantLock();
    /* renamed from: c */
    private Condition f5437c = this.f5436b.newCondition();

    /* renamed from: a */
    public final int mo7127a(int i) {
        this.f5436b.lock();
        try {
            this.f5435a += i;
            int i2 = this.f5435a;
            return i2;
        } finally {
            this.f5436b.unlock();
        }
    }

    /* renamed from: a */
    public final void mo7128a() {
        this.f5436b.lock();
        while (this.f5435a != 0) {
            try {
                this.f5437c.await();
            } catch (InterruptedException e) {
                throw e;
            } catch (Throwable th) {
                this.f5436b.unlock();
            }
        }
        this.f5436b.unlock();
    }

    /* renamed from: b */
    public final int mo7129b() {
        this.f5436b.lock();
        int i = this.f5435a;
        this.f5436b.unlock();
        return i;
    }

    /* renamed from: b */
    public final ghh mo7130b(int i) {
        this.f5436b.lock();
        this.f5435a = i;
        this.f5436b.unlock();
        return this;
    }

    /* renamed from: c */
    public final void mo7131c() {
        this.f5436b.lock();
        this.f5437c.signal();
        this.f5436b.unlock();
    }
}
