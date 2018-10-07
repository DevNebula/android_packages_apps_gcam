package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: gl */
final class C0249gl implements ThreadFactory {
    /* renamed from: a */
    private final AtomicInteger f5587a = new AtomicInteger(1);

    C0249gl() {
    }

    public final Thread newThread(Runnable runnable) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ModernAsyncTask #");
        stringBuilder.append(this.f5587a.getAndIncrement());
        return new Thread(runnable, stringBuilder.toString());
    }
}
