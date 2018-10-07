package p000;

import android.os.SystemClock;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dfu */
final class dfu implements emc {
    /* renamed from: a */
    private final /* synthetic */ des f13736a;

    dfu(des des) {
        this.f13736a = des;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo6325a(Object obj) {
        bli.m888a(des.f25916c, "captureListener");
        des des = this.f13736a;
        if (des.f25984s == 0) {
            des.f25931O = SystemClock.elapsedRealtime();
            des = this.f13736a;
            des.f25978m = true;
            des.f25919C.mo13407J();
        }
        this.f13736a.f25989x.mo7618c();
        des = this.f13736a;
        des.f25984s++;
        des.f25920D.sendEmptyMessage(101);
        this.f13736a.f25972g.mo7328a(R.raw.panorama_single_photo_shutter_sound);
        des = this.f13736a;
        if (!des.f25983r) {
            des.f25983r = true;
            des.f25933R.mo7088d();
        }
    }
}
