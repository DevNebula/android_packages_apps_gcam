package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.google.android.GoogleCamera.R;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;

/* compiled from: PG */
/* renamed from: hcj */
public abstract class hcj {
    /* renamed from: a */
    public abstract boolean mo7679a();

    /* renamed from: b */
    public abstract Drawable mo7680b();

    /* renamed from: c */
    public abstract int mo7681c();

    /* renamed from: d */
    public abstract int mo7682d();

    /* renamed from: e */
    public abstract hbf mo7683e();

    /* renamed from: f */
    public abstract int mo7684f();

    /* renamed from: g */
    public abstract int mo7685g();

    /* renamed from: h */
    public abstract int mo7686h();

    /* renamed from: i */
    public abstract int mo7687i();

    /* renamed from: j */
    public abstract int mo7688j();

    /* renamed from: k */
    public abstract int mo7689k();

    /* renamed from: l */
    public abstract int mo7690l();

    /* renamed from: m */
    public abstract int mo7691m();

    /* renamed from: n */
    public abstract int mo7692n();

    /* renamed from: o */
    public abstract int mo7693o();

    /* renamed from: p */
    public abstract int mo7694p();

    /* renamed from: a */
    private static hck m3085a(hbf hbf) {
        hck h = new hck((byte) 0).mo7698a(hbf).mo7699a(false).mo7713h(0);
        h.f6329c = null;
        return h.mo7697a(0).mo7701b(-1).mo7711g(0).mo7709f(0);
    }

    /* renamed from: a */
    public static hcj m3084a(hbf hbf, Resources resources) {
        hck k;
        switch (hbf.ordinal()) {
            case 0:
                return hcj.m3085a(hbf).mo7707e(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius)).mo7703c(Illuminant.kOther).mo7705d(resources.getColor(R.color.camera_mode_idle_color, null)).mo7720m(0).mo7719l(resources.getColor(R.color.video_mode_color, null)).mo7718k(0).mo7715i(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius)).mo7709f(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius)).mo7711g(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius)).mo7717j(resources.getDimensionPixelSize(R.dimen.photo_button_radius)).mo7696a();
            case 1:
                return hcj.m3085a(hbf).mo7707e(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius)).mo7703c(0).mo7705d(-1).mo7720m(0).mo7719l(resources.getColor(R.color.video_mode_color, null)).mo7718k(0).mo7699a(true).mo7713h(Illuminant.kOther).mo7715i(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius)).mo7717j(resources.getDimensionPixelSize(R.dimen.photo_button_radius)).mo7696a();
            case 2:
                return hcj.m3085a(hbf).mo7707e(resources.getDimensionPixelSize(R.dimen.portrait_button_inner_radius)).mo7703c(Illuminant.kOther).mo7705d(-1).mo7720m(0).mo7719l(resources.getColor(R.color.video_mode_color, null)).mo7718k(0).mo7715i(resources.getDimensionPixelSize(R.dimen.portrait_button_inner_radius)).mo7709f(resources.getDimensionPixelSize(R.dimen.portrait_button_inner_ring_radius)).mo7711g(resources.getDimensionPixelSize(R.dimen.portrait_button_outer_ring_radius)).mo7717j(resources.getDimensionPixelSize(R.dimen.portrait_button_outer_radius)).mo7696a();
            case 3:
                return hcj.m3085a(hbf).mo7707e(resources.getDimensionPixelSize(R.dimen.portrait_button_inner_pressed_radius)).mo7703c(0).mo7705d(-1).mo7720m(0).mo7719l(resources.getColor(R.color.video_mode_color, null)).mo7718k(0).mo7699a(true).mo7713h(Illuminant.kOther).mo7715i(resources.getDimensionPixelSize(R.dimen.portrait_button_inner_pressed_radius)).mo7709f(resources.getDimensionPixelSize(R.dimen.portrait_button_inner_ring_radius) / 2).mo7711g(resources.getDimensionPixelSize(R.dimen.portrait_button_outer_ring_radius) / 2).mo7717j(resources.getDimensionPixelSize(R.dimen.portrait_button_outer_radius)).mo7696a();
            case 4:
                return hcj.m3085a(hbf).mo7707e(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius)).mo7703c(0).mo7705d(-1).mo7720m(0).mo7719l(resources.getColor(R.color.video_mode_color, null)).mo7718k(0).mo7699a(true).mo7713h(Illuminant.kOther).mo7715i(resources.getDimensionPixelSize(R.dimen.photo_button_radius)).mo7701b(resources.getColor(R.color.camera_mode_color, null)).mo7717j(resources.getDimensionPixelSize(R.dimen.photo_button_radius)).mo7696a();
            case 5:
                return hcj.m3085a(hbf).mo7707e(resources.getDimensionPixelSize(R.dimen.photo_button_radius)).mo7703c(0).mo7705d(resources.getColor(R.color.camera_mode_idle_color, null)).mo7719l(resources.getColor(R.color.video_mode_color, null)).mo7720m(resources.getDimensionPixelSize(R.dimen.video_button_inner_radius)).mo7718k(0).mo7715i(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius)).mo7717j(resources.getDimensionPixelSize(R.dimen.photo_button_radius)).mo7696a();
            case 6:
                k = hcj.m3085a(hbf).mo7707e(resources.getDimensionPixelSize(R.dimen.photo_button_radius)).mo7703c(Illuminant.kOther).mo7705d(resources.getColor(R.color.camera_button_cancel_color, null)).mo7719l(resources.getColor(R.color.video_mode_color, null)).mo7720m(0).mo7718k(0);
                k.f6329c = resources.getDrawable(R.drawable.ic_cancel, null);
                return k.mo7697a(resources.getDrawable(R.drawable.ic_check, null).getIntrinsicWidth() / 2).mo7715i(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius)).mo7717j(resources.getDimensionPixelSize(R.dimen.photo_button_radius)).mo7696a();
            case 7:
                k = hcj.m3085a(hbf).mo7707e(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius)).mo7703c(Illuminant.kOther).mo7705d(resources.getColor(R.color.camera_mode_idle_color, null)).mo7719l(resources.getColor(R.color.camera_mode_idle_color, null)).mo7720m(0).mo7718k(0);
                k.f6329c = resources.getDrawable(R.drawable.ic_check, null);
                return k.mo7697a((int) ((((float) resources.getDrawable(R.drawable.ic_check, null).getIntrinsicWidth()) * 1.75f) / 2.0f)).mo7715i(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius)).mo7717j(resources.getDimensionPixelSize(R.dimen.photo_button_radius)).mo7696a();
            case 8:
                k = hcj.m3085a(hbf).mo7707e(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius)).mo7703c(Illuminant.kOther).mo7705d(-1).mo7719l(resources.getColor(R.color.camera_button_cancel_color, null)).mo7720m(resources.getDimensionPixelSize(R.dimen.photo_button_radius)).mo7718k(0);
                k.f6329c = resources.getDrawable(R.drawable.ic_check, null);
                return k.mo7697a(resources.getDrawable(R.drawable.ic_check, null).getIntrinsicWidth() / 2).mo7715i(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius)).mo7717j(resources.getDimensionPixelSize(R.dimen.photo_button_radius)).mo7696a();
            case 9:
                k = hcj.m3085a(hbf).mo7707e(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius)).mo7703c(Illuminant.kOther).mo7705d(-1).mo7719l(resources.getColor(R.color.camera_mode_color, null)).mo7720m(resources.getDimensionPixelSize(R.dimen.photo_button_radius)).mo7718k(0);
                k.f6329c = resources.getDrawable(R.drawable.ic_check, null);
                return k.mo7697a(resources.getDrawable(R.drawable.ic_check, null).getIntrinsicWidth() / 2).mo7715i(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius)).mo7717j(resources.getDimensionPixelSize(R.dimen.photo_button_radius)).mo7696a();
            case 10:
                return hcj.m3085a(hbf).mo7707e(resources.getDimensionPixelSize(R.dimen.photo_button_radius)).mo7703c(Illuminant.kOther).mo7705d(-1).mo7720m(resources.getDimensionPixelSize(R.dimen.photo_button_radius)).mo7719l(resources.getColor(R.color.video_mode_color, null)).mo7718k(resources.getDimensionPixelSize(R.dimen.video_button_stop_square_size) / 2).mo7715i(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius)).mo7717j(resources.getDimensionPixelSize(R.dimen.photo_button_radius)).mo7696a();
            default:
                String valueOf = String.valueOf(hbf);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 28);
                stringBuilder.append("Shutter mode not supported: ");
                stringBuilder.append(valueOf);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: q */
    public final hck mo7695q() {
        hck k = hcj.m3085a(mo7683e()).mo7707e(mo7686h()).mo7703c(mo7684f()).mo7705d(mo7685g()).mo7720m(mo7694p()).mo7719l(mo7693o()).mo7718k(mo7692n());
        k.f6329c = mo7680b();
        return k.mo7697a(mo7681c()).mo7699a(mo7679a()).mo7713h(mo7689k()).mo7715i(mo7690l()).mo7701b(mo7682d()).mo7709f(mo7687i()).mo7711g(mo7688j()).mo7717j(mo7691m());
    }
}
