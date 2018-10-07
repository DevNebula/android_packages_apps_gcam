package p000;

import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: god */
public class god {
    /* renamed from: a */
    public final /* synthetic */ glf f5955a;

    /* renamed from: a */
    public synchronized void mo7270a() {
        this.f5955a.f24421k = this.f5955a.f24421k + 1;
        glf glf = this.f5955a;
        if (glf.f24418h != glk.STARTED) {
            glf.mo14930b("Ignoring updateStackedProgressMessage. CaptureSession is not started.");
        } else {
            glf.mo13370a(hci.m11979a((int) R.string.burst_process_x_of_y_items, Integer.valueOf(glf.f24421k), Integer.valueOf(glf.f24420j.size())));
            glf.mo13374b((int) ((((float) glf.f24421k) * 100.0f) / ((float) glf.f24420j.size())));
        }
        god god = this.f5955a.f24422l;
    }

    /* renamed from: b */
    public synchronized void mo7271b() {
        this.f5955a.f24421k = this.f5955a.f24421k + 1;
        glf glf = this.f5955a;
        if (glf.f24418h != glk.STARTED) {
            glf.mo14930b("Ignoring updateStackedProgressMessage. CaptureSession is not started.");
        } else {
            glf.mo13370a(hci.m11979a((int) R.string.burst_process_x_of_y_items, Integer.valueOf(glf.f24421k), Integer.valueOf(glf.f24420j.size())));
            glf.mo13374b((int) ((((float) glf.f24421k) * 100.0f) / ((float) glf.f24420j.size())));
        }
        god god = this.f5955a.f24422l;
    }

    /* renamed from: c */
    public synchronized void mo7272c() {
        god god = this.f5955a.f24422l;
    }

    god(glf glf) {
        this.f5955a = glf;
    }
}
