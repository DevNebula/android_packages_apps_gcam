package p000;

import android.annotation.TargetApi;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: gil */
public final class gil {
    /* renamed from: a */
    public final ExecutorService f5484a = Executors.newSingleThreadExecutor(iel.m3778c("image-saver", 0));
    /* renamed from: b */
    public final gin f5485b;
    /* renamed from: c */
    public final hju f5486c;
    /* renamed from: d */
    public ByteBuffer f5487d;

    public gil(gij gij, gin gin, hju hju) {
        this.f5485b = gin;
        this.f5486c = hju;
    }

    /* renamed from: a */
    static iwp m2618a(gfw gfw) {
        kpk kpk = gfw.f5389d;
        if (kpk == null) {
            return null;
        }
        try {
            return (iwp) kpk.get(500, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            return null;
        } catch (ExecutionException e2) {
            return null;
        } catch (TimeoutException e3) {
            return null;
        }
    }

    /* renamed from: b */
    static int m2619b(gfw gfw) {
        return (gfw.f5391f.width() * 3) * gfw.f5391f.height();
    }
}
