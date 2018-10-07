package p000;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* renamed from: bui */
public final class bui implements buh {
    /* renamed from: a */
    private static final String f11803a = bli.m887a("StateMachine");
    /* renamed from: b */
    private iqo f11804b;
    /* renamed from: c */
    private bug f11805c = new buj(this);
    /* renamed from: d */
    private final ReentrantLock f11806d = new ReentrantLock();
    /* renamed from: e */
    private final Condition f11807e = this.f11806d.newCondition();

    public bui(iqo iqo) {
        this.f11804b = iqo;
    }

    /* renamed from: a */
    public final iqo mo2153a() {
        return this.f11804b;
    }

    /* renamed from: b */
    private final void m7846b(bug bug) {
        this.f11806d.lock();
        try {
            if (bug.equals(this.f11805c)) {
                bli.m888a(f11803a, "No op since jump to the same state.");
            } else {
                String str = f11803a;
                String valueOf = String.valueOf(this.f11805c);
                String valueOf2 = String.valueOf(bug);
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 19) + String.valueOf(valueOf2).length());
                stringBuilder.append("Change state : ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" => ");
                stringBuilder.append(valueOf2);
                bli.m888a(str, stringBuilder.toString());
                this.f11805c.mo2151c();
                this.f11805c = bug;
                bug b = this.f11805c.mo2150b();
                while (b != null) {
                    valueOf = f11803a;
                    valueOf2 = String.valueOf(this.f11805c);
                    String valueOf3 = String.valueOf(b);
                    StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(valueOf2).length() + 20) + String.valueOf(valueOf3).length());
                    stringBuilder2.append("Forward state : ");
                    stringBuilder2.append(valueOf2);
                    stringBuilder2.append(" => ");
                    stringBuilder2.append(valueOf3);
                    bli.m888a(valueOf, stringBuilder2.toString());
                    this.f11805c.mo2151c();
                    this.f11805c = b;
                    b = this.f11805c.mo2150b();
                }
                this.f11807e.signalAll();
            }
            this.f11806d.unlock();
        } catch (Throwable th) {
            this.f11806d.unlock();
        }
    }

    /* renamed from: a */
    public final void mo2154a(Object obj) {
        this.f11806d.lock();
        String str;
        String valueOf;
        StringBuilder stringBuilder;
        try {
            buf a = this.f11805c.mo2147a(obj.getClass());
            if (a != null) {
                str = f11803a;
                valueOf = String.valueOf(obj);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 16);
                stringBuilder.append("Process event : ");
                stringBuilder.append(valueOf);
                bli.m888a(str, stringBuilder.toString());
                bug a2 = a.mo2146a(obj);
                if (a2 != null) {
                    m7846b(a2);
                }
            }
            this.f11806d.unlock();
        } catch (Exception e) {
            str = f11803a;
            valueOf = String.valueOf(obj);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 25);
            stringBuilder.append("Failed to process event: ");
            stringBuilder.append(valueOf);
            bli.m891b(str, stringBuilder.toString());
            throw e;
        } catch (Throwable th) {
            this.f11806d.unlock();
        }
    }

    /* renamed from: a */
    public final boolean mo2155a(bug bug) {
        this.f11806d.lock();
        try {
            if (this.f11805c instanceof buj) {
                m7846b(bug);
                return true;
            }
            this.f11806d.unlock();
            return false;
        } finally {
            this.f11806d.unlock();
        }
    }
}
