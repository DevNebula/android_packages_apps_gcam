package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: gwk */
public final class gwk implements kwk {
    /* renamed from: a */
    public static final gwk f19731a = new gwk();

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new gwe(), new DiscardOldestPolicy());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return (Executor) ktm.m14219a(threadPoolExecutor, "Cannot return null from a non-@Nullable @Provides method");
    }
}
