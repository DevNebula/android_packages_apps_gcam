package p000;

import com.google.android.GoogleCamera.R;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: gpo */
public final class gpo implements gpn {
    /* renamed from: c */
    private static final kpk f19450c = kow.m13873a(Integer.valueOf(-1));
    /* renamed from: a */
    public final gpu f19451a;
    /* renamed from: b */
    public boolean f19452b;
    /* renamed from: d */
    private final AtomicReference f19453d = new AtomicReference(f19450c);
    /* renamed from: e */
    private final ird f19454e;

    static {
        bli.m887a("SoundPlayer");
    }

    public gpo(gpu gpu, ird ird, ikd ikd, ena ena) {
        this.f19451a = gpu;
        this.f19454e = ird;
        eio.m1804a(ikd, ena, new gpq(this));
    }

    /* renamed from: a */
    public final void mo7327a() {
        this.f19451a.mo7335a();
    }

    /* renamed from: a */
    public final void mo7328a(int i) {
        if (this.f19452b) {
            this.f19451a.mo7337b(i);
        }
    }

    /* renamed from: b */
    public final void mo7329b() {
        kow.m13878a((kpk) this.f19453d.getAndSet(f19450c), new gpp(this), kpq.f8776a);
        if (this.f19452b) {
            this.f19451a.mo7337b(R.raw.camera_burst_end);
        }
    }

    /* renamed from: c */
    public final void mo7330c() {
        if (this.f19452b) {
            this.f19451a.mo7337b(R.raw.camera_burst_start);
            this.f19453d.set(this.f19451a.mo7338c(R.raw.camera_burst_loop));
        }
    }

    /* renamed from: d */
    public final void mo7331d() {
        this.f19454e.mo8856a("Sounds#shutter");
        this.f19451a.mo7334a(R.raw.camera_shutter);
        this.f19454e.mo8858b("Sounds#burst_start");
        this.f19451a.mo7334a(R.raw.camera_burst_start);
        this.f19454e.mo8858b("Sounds#burst_loop");
        this.f19451a.mo7334a(R.raw.camera_burst_loop);
        this.f19454e.mo8858b("Sounds#burst_end");
        this.f19451a.mo7334a(R.raw.camera_burst_end);
        this.f19454e.mo8858b("Sounds#timer_start");
        this.f19451a.mo7334a(R.raw.timer_start);
        this.f19454e.mo8858b("Sounds#timer_final");
        this.f19451a.mo7334a(R.raw.timer_final);
        this.f19454e.mo8858b("Sounds#timer_increment");
        this.f19451a.mo7334a(R.raw.timer_increment);
        this.f19454e.mo8858b("Sounds#video_start");
        this.f19451a.mo7334a(R.raw.video_start);
        this.f19454e.mo8858b("Sounds#video_stop");
        this.f19451a.mo7334a(R.raw.video_stop);
        this.f19454e.mo8858b("Sounds#video_pause");
        this.f19451a.mo7334a(R.raw.video_pause);
        this.f19454e.mo8858b("Sounds#staged_shot_complete");
        this.f19451a.mo7334a(R.raw.staged_shot_complete);
        this.f19454e.mo8858b("Sounds#staged_shot_cancelled");
        this.f19451a.mo7334a(R.raw.staged_shot_cancelled);
        this.f19454e.mo8858b("Sounds#panorama_single_photo_shutter_sound");
        this.f19451a.mo7334a(R.raw.panorama_single_photo_shutter_sound);
        this.f19454e.mo8857b();
    }

    /* renamed from: e */
    public final void mo7332e() {
        this.f19454e.mo8856a("Sounds#shutter");
        this.f19451a.mo7334a(R.raw.camera_shutter);
        this.f19454e.mo8858b("Sounds#burst_start");
        this.f19451a.mo7334a(R.raw.camera_burst_start);
        this.f19454e.mo8858b("Sounds#video_start");
        this.f19451a.mo7334a(R.raw.video_start);
        this.f19454e.mo8857b();
    }

    /* renamed from: f */
    public final void mo7333f() {
        this.f19451a.mo7336b();
    }
}
