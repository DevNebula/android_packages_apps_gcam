package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Key;
import java.util.Collections;

/* compiled from: PG */
/* renamed from: fec */
final class fec implements fdf {
    /* renamed from: a */
    public final ird f18158a;
    /* renamed from: b */
    public final iqz f18159b;
    /* renamed from: c */
    public final fdg f18160c;
    /* renamed from: d */
    public final fip f18161d;
    /* renamed from: e */
    public final fio f18162e;
    /* renamed from: f */
    public long f18163f = -1;
    /* renamed from: g */
    private final fio f18164g;
    /* renamed from: h */
    private final fio f18165h;
    /* renamed from: i */
    private final fio f18166i;
    /* renamed from: j */
    private boolean f18167j = false;

    public fec(fip fip, fdg fdg, fio fio, ird ird, iqz iqz) {
        this.f18161d = fip;
        this.f18160c = fdg;
        this.f18162e = fio;
        this.f18158a = ird;
        this.f18159b = iqz;
        this.f18164g = new fio(fio);
        this.f18165h = new fio(fio);
        this.f18166i = new fio(fio);
    }

    /* renamed from: a */
    final fdx mo13230a(fdh fdh, fio fio, fio fio2) {
        if (fdh == fdh.CONVERGED) {
            Object fcf = new fcf();
            fio.mo6809a(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(1));
            fio.mo6813a(fds.m10428c(fcf));
            fio2.mo6813a(fds.m10428c(fcf));
            this.f18166i.mo6809a(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(true));
            return fcf;
        } else if (fdh == fdh.LOCKED) {
            fdx fcb = new fcb();
            fio.mo6813a(fds.m10428c(fcb));
            fio2.mo6813a(fds.m10428c(fcb));
            return fcb;
        } else {
            throw new IllegalArgumentException("Unknown requirement for AE!");
        }
    }

    /* renamed from: b */
    final fdx mo13231b(fdh fdh, fio fio, fio fio2) {
        Object fcp = new fcp();
        if (fdh == fdh.CONVERGED) {
            Object obj;
            fim a = this.f18162e.mo6807a();
            Key key = CaptureRequest.CONTROL_AF_MODE;
            for (fin fin : a.f4796b) {
                if (fin.f4800a.equals(key)) {
                    obj = fin.f4801b;
                    break;
                }
            }
            obj = null;
            Integer num = (Integer) obj;
            if (!(num == null || num.intValue() == 1)) {
                key = CaptureRequest.CONTROL_AF_MODE;
                Integer valueOf = Integer.valueOf(1);
                fio.mo6809a(key, valueOf);
                fio2.mo6809a(CaptureRequest.CONTROL_AF_MODE, valueOf);
                this.f18164g.mo6809a(CaptureRequest.CONTROL_AF_MODE, num);
            }
        }
        this.f18165h.mo6809a(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(2));
        fio.mo6809a(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(1));
        fio.mo6813a(fds.m10428c(fcp));
        fio2.mo6813a(fds.m10428c(fcp));
        return fcp;
    }

    /* renamed from: a */
    static fdx m10438a(fio fio, fio fio2) {
        Object fdd = new fdd();
        if (fio != null) {
            fio.mo6813a(fds.m10428c(fdd));
        }
        fio2.mo6813a(fds.m10428c(fdd));
        return fdd;
    }

    public final void close() {
        if (!this.f18167j) {
            this.f18167j = true;
            try {
                this.f18158a.mo8856a("Reset 3A");
                this.f18161d.mo6816a(Collections.singletonList(this.f18164g.mo6807a()), fiv.REPEATING);
                this.f18161d.mo6816a(Collections.singletonList(this.f18165h.mo6807a()), fiv.NON_REPEATING);
                this.f18161d.mo6816a(Collections.singletonList(this.f18166i.mo6807a()), fiv.NON_REPEATING);
                this.f18158a.mo8857b();
            } catch (Throwable e) {
                this.f18159b.mo8831a("Unable to reset after 3A lock", e);
            }
        }
    }

    /* renamed from: a */
    public final long mo6752a() {
        return this.f18163f;
    }

    /* renamed from: a */
    public final fim mo6753a(fim fim) {
        fio fio = new fio(fim);
        Key key = CaptureRequest.CONTROL_AF_TRIGGER;
        Integer valueOf = Integer.valueOf(0);
        fio.mo6809a(key, valueOf);
        fio.mo6809a(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, valueOf);
        switch (this.f18160c.f4707b.ordinal()) {
            case 2:
                fio.mo6809a(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(1));
                break;
        }
        switch (this.f18160c.f4706a.ordinal()) {
            case 1:
                fio.mo6809a(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(true));
                break;
        }
        switch (this.f18160c.f4708c.ordinal()) {
            case 1:
                fio.mo6809a(CaptureRequest.CONTROL_AWB_LOCK, Boolean.valueOf(true));
                break;
            case 2:
                fio.mo6809a(CaptureRequest.CONTROL_AWB_LOCK, Boolean.valueOf(true));
                break;
        }
        return fio.mo6807a();
    }
}
