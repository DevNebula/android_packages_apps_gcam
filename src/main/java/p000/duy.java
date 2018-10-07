package p000;

import android.hardware.camera2.CameraCharacteristics;

/* compiled from: PG */
/* renamed from: duy */
public final class duy implements kwk {
    /* renamed from: a */
    private final kwk f16848a;
    /* renamed from: b */
    private final kwk f16849b;

    private duy(kwk kwk, kwk kwk2) {
        this.f16848a = kwk;
        this.f16849b = kwk2;
    }

    /* renamed from: a */
    public static duy m9593a(kwk kwk, kwk kwk2) {
        return new duy(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f16848a;
        return (duc) ktm.m14219a(new dua(((Integer) ((ffc) kwk.mo10566a()).mo9056a(CameraCharacteristics.SENSOR_INFO_WHITE_LEVEL)).intValue(), (gjk) this.f16849b.mo10566a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
