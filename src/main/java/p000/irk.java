package p000;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: PG */
/* renamed from: irk */
public final class irk implements kwk {
    /* renamed from: a */
    public static final irk f21219a = new irk();

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        HandlerThread handlerThread = new HandlerThread("Camera-Hndlr", -2);
        handlerThread.start();
        return (Handler) ktm.m14219a(new Handler(handlerThread.getLooper()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
