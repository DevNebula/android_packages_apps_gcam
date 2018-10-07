package p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: iaa */
public final class iaa implements ThreadFactory {
    /* renamed from: a */
    private final String f7231a;
    /* renamed from: b */
    private final AtomicInteger f7232b;
    /* renamed from: c */
    private final ThreadFactory f7233c;

    public iaa(String str) {
        this(str, (byte) 0);
    }

    private iaa(String str, byte b) {
        this.f7232b = new AtomicInteger();
        this.f7233c = Executors.defaultThreadFactory();
        this.f7231a = (String) htl.m3489b((Object) str, (Object) "Name must not be null");
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f7233c.newThread(new iab(runnable, 0));
        String str = this.f7231a;
        int andIncrement = this.f7232b.getAndIncrement();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 13);
        stringBuilder.append(str);
        stringBuilder.append("[");
        stringBuilder.append(andIncrement);
        stringBuilder.append("]");
        newThread.setName(stringBuilder.toString());
        return newThread;
    }
}
