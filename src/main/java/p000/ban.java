package p000;

import android.content.Context;
import java.lang.Thread.UncaughtExceptionHandler;

/* compiled from: PG */
/* renamed from: ban */
public final class ban extends bas {
    /* renamed from: a */
    private final Context f11125a;

    public ban(Context context, UncaughtExceptionHandler uncaughtExceptionHandler) {
        super(uncaughtExceptionHandler);
        this.f11125a = context;
    }

    /* renamed from: a */
    protected final void mo1884a(Throwable th) {
        bap.m800a(this.f11125a, th, "com.android.camera.silentfeedback.SILENT_FEEDBACK");
    }
}
