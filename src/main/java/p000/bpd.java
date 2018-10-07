package p000;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: bpd */
public final class bpd implements bpq, eoj, eok, eol {
    /* renamed from: a */
    public static final String f22827a = bli.m887a("FatalErrorHandler");
    /* renamed from: b */
    public final AtomicBoolean f22828b = new AtomicBoolean(false);
    /* renamed from: c */
    public final AtomicBoolean f22829c = new AtomicBoolean(true);
    /* renamed from: d */
    private final WeakReference f22830d;
    /* renamed from: e */
    private final ikd f22831e;
    /* renamed from: f */
    private final irs f22832f;

    public bpd(WeakReference weakReference, ikd ikd, irs irs) {
        this.f22830d = weakReference;
        this.f22831e = ikd;
        this.f22832f = irs;
    }

    /* renamed from: a */
    final void mo14572a(String str) {
        Activity activity = (Activity) this.f22830d.get();
        if (activity != null && !activity.isFinishing()) {
            bli.m891b(f22827a, str);
            activity.finish();
        }
    }

    /* renamed from: a */
    public final void mo12416a() {
        Throwable exception = new Exception();
        bli.m892b(f22827a, "Handling Camera Disabled Failure:", exception);
        this.f22832f.mo8885a(1, null, -1, -1);
        m15117a(bpl.ERROR_CAMERA_DISABLED, exception, true);
    }

    /* renamed from: a */
    public final void mo8946a(Throwable th) {
        Throwable exception = new Exception(th);
        bpl bpl = bpl.GENERIC_CAMERA_ERROR;
        if (th instanceof isg) {
            bpl = bpl.m956a(((isg) th).f7753a);
        }
        bli.m892b(f22827a, "Handling Camera Open Failure:", exception);
        this.f22832f.mo8885a(2, null, -1, -1);
        m15117a(bpl, exception, false);
    }

    /* renamed from: b */
    public final void mo12417b() {
        Throwable exception = new Exception();
        bli.m892b(f22827a, "Handling Camera Reconnect Failure:", exception);
        this.f22832f.mo8885a(3, null, -1, -1);
        m15117a(bpl.GENERIC_CAMERA_ERROR, exception, false);
    }

    /* renamed from: c */
    public final void mo12418c() {
        Throwable exception = new Exception();
        bli.m892b(f22827a, "Handling Camera Access Failure:", exception);
        this.f22832f.mo8885a(0, null, -1, -1);
        m15117a(bpl.GENERIC_CAMERA_ERROR, exception, false);
    }

    /* renamed from: d */
    public final void mo12419d() {
        Throwable exception = new Exception();
        bli.m892b(f22827a, "Handling MediaRecorder Failure:", exception);
        this.f22832f.mo8915e();
        m15117a(bpl.MEDIA_RECORDER_FAILURE, exception, false);
    }

    /* renamed from: e */
    public final void mo12420e() {
        Throwable exception = new Exception();
        bli.m892b(f22827a, "Handling Media Storage Failure:", exception);
        this.f22832f.mo8922l();
        m15117a(bpl.MEDIA_STORAGE_FAILURE, exception, false);
    }

    /* renamed from: i */
    public final void mo6372i() {
        this.f22829c.set(true);
    }

    /* renamed from: j */
    public final void mo6373j() {
        this.f22829c.set(false);
        if (this.f22828b.get()) {
            mo14572a("Activity received OnStop in a fatal error state. Executing finish()");
        }
    }

    /* renamed from: a */
    private final void m15117a(bpl bpl, Exception exception, boolean z) {
        this.f22828b.compareAndSet(false, bpl.f1421g);
        Activity activity = (Activity) this.f22830d.get();
        if ((z || this.f22829c.get()) && activity != null) {
            this.f22831e.execute(new bpe(this, z, activity, bpl, exception));
        } else if (bpl.f1421g) {
            mo14572a("Activity received an error, but was not running. Executing finish()");
        }
    }
}
