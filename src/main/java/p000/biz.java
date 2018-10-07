package p000;

import android.media.MediaRecorder;
import android.media.MediaRecorder.OnErrorListener;
import android.media.MediaRecorder.OnInfoListener;
import android.os.SystemClock;
import android.view.Surface;
import java.io.File;
import java.io.FileDescriptor;

/* compiled from: PG */
/* renamed from: biz */
public final class biz implements ipy {
    /* renamed from: a */
    private final ipy f11461a;
    /* renamed from: b */
    private final grr f11462b;

    public biz(ipy ipy, grr grr) {
        this.f11461a = ipy;
        this.f11462b = grr;
    }

    /* renamed from: a */
    public final MediaRecorder mo8717a() {
        return this.f11461a.mo8717a();
    }

    /* renamed from: b */
    public final synchronized Surface mo8729b() {
        return this.f11461a.mo8729b();
    }

    /* renamed from: c */
    public final synchronized void mo8731c() {
        this.f11461a.mo8731c();
    }

    /* renamed from: d */
    public final synchronized void mo8733d() {
        try {
            grr grr = this.f11462b;
            iya iya = grr.f2599m;
            grr.f19529a = SystemClock.elapsedRealtimeNanos();
            grr.mo2697a("MediaRecorder Prepare Start", grr.f19529a);
            this.f11461a.mo8733d();
            this.f11462b.mo13461b();
        } catch (Throwable th) {
            this.f11462b.mo13461b();
        }
    }

    /* renamed from: e */
    public final synchronized void mo8735e() {
        this.f11461a.mo8735e();
    }

    /* renamed from: f */
    public final synchronized void mo8737f() {
        this.f11461a.mo8737f();
    }

    /* renamed from: g */
    public final synchronized void mo8739g() {
        this.f11461a.mo8739g();
    }

    /* renamed from: a */
    public final synchronized void mo8720a(int i) {
        this.f11461a.mo8720a(i);
    }

    /* renamed from: b */
    public final synchronized void mo8730b(int i) {
        this.f11461a.mo8730b(i);
    }

    /* renamed from: c */
    public final synchronized void mo8732c(int i) {
        this.f11461a.mo8732c(i);
    }

    /* renamed from: d */
    public final synchronized void mo8734d(int i) {
        this.f11461a.mo8734d(i);
    }

    /* renamed from: e */
    public final synchronized void mo8736e(int i) {
        this.f11461a.mo8736e(i);
    }

    /* renamed from: a */
    public final synchronized void mo8718a(double d) {
        this.f11461a.mo8718a(d);
    }

    /* renamed from: a */
    public final synchronized void mo8725a(Surface surface) {
        this.f11461a.mo8725a(surface);
    }

    /* renamed from: a */
    public final synchronized void mo8719a(float f, float f2) {
        this.f11461a.mo8719a(f, f2);
    }

    /* renamed from: f */
    public final synchronized void mo8738f(int i) {
        this.f11461a.mo8738f(i);
    }

    /* renamed from: a */
    public final synchronized void mo8722a(long j) {
        this.f11461a.mo8722a(j);
    }

    /* renamed from: a */
    public final synchronized void mo8726a(File file) {
        this.f11461a.mo8726a(file);
    }

    /* renamed from: a */
    public final synchronized void mo8723a(OnErrorListener onErrorListener) {
        this.f11461a.mo8723a(onErrorListener);
    }

    /* renamed from: a */
    public final synchronized void mo8724a(OnInfoListener onInfoListener) {
        this.f11461a.mo8724a(onInfoListener);
    }

    /* renamed from: g */
    public final synchronized void mo8740g(int i) {
        this.f11461a.mo8740g(i);
    }

    /* renamed from: a */
    public final synchronized void mo8727a(FileDescriptor fileDescriptor) {
        this.f11461a.mo8727a(fileDescriptor);
    }

    /* renamed from: a */
    public final synchronized void mo8728a(String str) {
        this.f11461a.mo8728a(str);
    }

    /* renamed from: h */
    public final synchronized void mo8742h(int i) {
        this.f11461a.mo8742h(i);
    }

    /* renamed from: i */
    public final synchronized void mo8744i(int i) {
        this.f11461a.mo8744i(i);
    }

    /* renamed from: j */
    public final synchronized void mo8745j(int i) {
        this.f11461a.mo8745j(i);
    }

    /* renamed from: k */
    public final synchronized void mo8746k(int i) {
        this.f11461a.mo8746k(i);
    }

    /* renamed from: a */
    public final synchronized void mo8721a(int i, int i2) {
        this.f11461a.mo8721a(i, i2);
    }

    /* renamed from: l */
    public final synchronized void mo8747l(int i) {
        this.f11461a.mo8747l(i);
    }

    /* renamed from: h */
    public final synchronized void mo8741h() {
        this.f11461a.mo8741h();
    }

    /* renamed from: i */
    public final synchronized void mo8743i() {
        this.f11461a.mo8743i();
    }
}
