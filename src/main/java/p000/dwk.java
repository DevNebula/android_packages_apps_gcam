package p000;

import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dwk */
final class dwk implements aas {
    /* renamed from: a */
    private final /* synthetic */ dwd f16894a;

    dwk(dwd dwd) {
        this.f16894a = dwd;
    }

    /* renamed from: a */
    public final void mo41a() {
        this.f16894a.f26216e.mo7328a(R.raw.panorama_single_photo_shutter_sound);
        hrg hrg = this.f16894a.f26230s;
        hrg.f6856a.setVisibility(0);
        hrg.f6856a.animate().alpha(0.0f).setDuration(300).setListener(new hrh(hrg));
    }
}
