package p000;

import java.lang.Thread.UncaughtExceptionHandler;

/* compiled from: PG */
/* renamed from: bas */
public abstract class bas implements UncaughtExceptionHandler {
    /* renamed from: a */
    private static final String f1073a = bli.m887a("UncaughtExHndlrBase");
    /* renamed from: b */
    private final UncaughtExceptionHandler f1074b;
    /* renamed from: c */
    private final ikd f1075c = new ikd();

    /* renamed from: a */
    protected abstract void mo1884a(Throwable th);

    public bas(UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f1074b = uncaughtExceptionHandler;
    }

    /* renamed from: a */
    final void mo1883a(Thread thread, Throwable th) {
        UncaughtExceptionHandler uncaughtExceptionHandler = this.f1074b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        mo1884a(th);
        if (ikd.m12502b()) {
            mo1883a(thread, th);
            return;
        }
        String str = f1073a;
        String valueOf = String.valueOf(thread);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 40);
        stringBuilder.append("Uncaught exception in background thread ");
        stringBuilder.append(valueOf);
        bli.m892b(str, stringBuilder.toString(), th);
        this.f1075c.execute(new bat(this, thread, th));
    }
}
