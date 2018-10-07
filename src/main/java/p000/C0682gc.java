package p000;

import android.content.Context;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gc */
public abstract class C0682gc extends C0243gf {
    /* renamed from: a */
    public volatile C0683gd f18994a;
    /* renamed from: i */
    private final Executor f18995i;
    /* renamed from: j */
    private volatile C0683gd f18996j;

    public C0682gc(Context context) {
        this(context, C0248gk.f5509b);
    }

    /* renamed from: b */
    public abstract Object mo13322b();

    private C0682gc(Context context, Executor executor) {
        super(context);
        this.f18995i = executor;
    }

    /* renamed from: a */
    final void mo13321a(C0683gd c0683gd) {
        if (this.f18996j == c0683gd) {
            SystemClock.uptimeMillis();
            this.f18996j = null;
            mo13320a();
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void mo7096a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo7096a(str, fileDescriptor, printWriter, strArr);
        if (this.f18994a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f18994a);
            printWriter.print(" waiting=");
            printWriter.println(this.f18994a.f19058a);
        }
        if (this.f18996j != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f18996j);
            printWriter.print(" waiting=");
            printWriter.println(this.f18996j.f19058a);
        }
    }

    /* renamed from: a */
    final void mo13320a() {
        if (this.f18996j == null && this.f18994a != null) {
            boolean z = this.f18994a.f19058a;
            C0248gk c0248gk = this.f18994a;
            Executor executor = this.f18995i;
            if (c0248gk.f5515e != C0252go.f5801a) {
                switch (c0248gk.f5515e - 1) {
                    case 1:
                        throw new IllegalStateException("Cannot execute task: the task is already running.");
                    case 2:
                        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                    default:
                        throw new IllegalStateException("We should never reach this state");
                }
            }
            c0248gk.f5515e = C0252go.f5854b;
            C0253gp c0253gp = c0248gk.f5513c;
            executor.execute(c0248gk.f5514d);
        }
    }

    /* renamed from: c */
    protected final boolean mo7098c() {
        boolean z = false;
        if (this.f18994a != null) {
            if (!this.f5365e) {
                this.f5368h = true;
            }
            boolean z2;
            if (this.f18996j != null) {
                z2 = this.f18994a.f19058a;
                this.f18994a = null;
            } else {
                z2 = this.f18994a.f19058a;
                C0248gk c0248gk = this.f18994a;
                c0248gk.f5516f.set(true);
                z = c0248gk.f5514d.cancel(false);
                if (z) {
                    this.f18996j = this.f18994a;
                }
                this.f18994a = null;
            }
        }
        return z;
    }

    /* renamed from: d */
    protected final void mo7099d() {
        super.mo7099d();
        mo7098c();
        this.f18994a = new C0683gd(this);
        mo13320a();
    }
}
