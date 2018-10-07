package p000;

import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: fzy */
public class fzy {
    /* renamed from: a */
    public final fzm f5149a = new fzm(fzo.TIMER, kes.m4868b(fzp.TIMER_ZERO_SECONDS, Integer.valueOf(R.drawable.ic_timer_normal_off), fzp.TIMER_THREE_SECONDS, Integer.valueOf(R.drawable.ic_timer_normal_3s), fzp.TIMER_TEN_SECONDS, Integer.valueOf(R.drawable.ic_timer_normal_10s)), R.string.timer_options_desc, ken.m13710a(new fzn(fzp.TIMER_ZERO_SECONDS, R.drawable.ic_timer_normal_off, R.string.timer_off_desc, R.string.timer_off_desc), new fzn(fzp.TIMER_THREE_SECONDS, R.drawable.ic_timer_expanded_3s, R.string.timer_seconds_desc, R.string.timer_3_seconds_desc), new fzn(fzp.TIMER_TEN_SECONDS, R.drawable.ic_timer_expanded_10s, R.string.timer_seconds_desc, R.string.timer_10_seconds_desc)));
    /* renamed from: b */
    public final fzm f5150b = mo6980a();
    /* renamed from: c */
    public final fzm f5151c = new fzm(fzo.RAW_OUTPUT, kes.m4867b(fzp.UNSELECTED, Integer.valueOf(R.drawable.ic_raw_off_24dp), fzp.SELECTED, Integer.valueOf(R.drawable.ic_raw_on_24dp)), R.string.raw_output_desc, ken.m13709a(new fzn(fzp.UNSELECTED, R.drawable.ic_raw_off_24dp, R.string.raw_output_off_desc, R.string.raw_output_off_desc), new fzn(fzp.SELECTED, R.drawable.ic_raw_on_24dp, R.string.raw_output_on_desc, R.string.raw_output_on_desc)));
    /* renamed from: d */
    public final fzm f5152d;
    /* renamed from: e */
    public final fzm f5153e;
    /* renamed from: f */
    public final fzm f5154f;
    /* renamed from: g */
    public final fzm f5155g;
    /* renamed from: h */
    public final fzm f5156h;
    /* renamed from: i */
    public final fzm f5157i;
    /* renamed from: j */
    public final fzm f5158j;
    /* renamed from: k */
    public final fzm f5159k;
    /* renamed from: l */
    public final fzm f5160l;
    /* renamed from: m */
    public final fzm f5161m;
    /* renamed from: n */
    public final fzm f5162n;
    /* renamed from: o */
    public final fzm f5163o;
    /* renamed from: p */
    public final fzm f5164p;
    /* renamed from: q */
    public final fzm f5165q;

    public fzy() {
        fzo fzo = fzo.WHITE_BALANCE;
        Object obj = fzp.WHITE_BALANCE_AUTO;
        Object valueOf = Integer.valueOf(R.drawable.ic_wb_auto);
        Object obj2 = fzp.WHITE_BALANCE_CLOUDY;
        Object valueOf2 = Integer.valueOf(R.drawable.ic_wb_cloudy);
        Object obj3 = fzp.WHITE_BALANCE_SUNNY;
        Object valueOf3 = Integer.valueOf(R.drawable.ic_wb_sunny);
        Object obj4 = fzp.WHITE_BALANCE_FLUORESCENT;
        Object valueOf4 = Integer.valueOf(R.drawable.ic_wb_fluorescent);
        Object obj5 = fzp.WHITE_BALANCE_INCANDESCENT;
        Object valueOf5 = Integer.valueOf(R.drawable.ic_wb_incandescent);
        khb.m4952b(obj, valueOf);
        khb.m4952b(obj2, valueOf2);
        khb.m4952b(obj3, valueOf3);
        khb.m4952b(obj4, valueOf4);
        khb.m4952b(obj5, valueOf5);
        this.f5152d = new fzm(fzo, kgi.m13758a(5, new Object[]{obj, valueOf, obj2, valueOf2, obj3, valueOf3, obj4, valueOf4, obj5, valueOf5}), R.string.white_balance_options_desc, ken.m13711a(new fzn(fzp.WHITE_BALANCE_AUTO, R.drawable.ic_wb_auto, R.string.white_balance_auto_desc, R.string.white_balance_auto_desc), new fzn(fzp.WHITE_BALANCE_CLOUDY, R.drawable.ic_wb_cloudy, R.string.white_balance_cloudy_desc, R.string.white_balance_cloudy_desc), new fzn(fzp.WHITE_BALANCE_SUNNY, R.drawable.ic_wb_sunny, R.string.white_balance_sunny_desc, R.string.white_balance_sunny_desc), new fzn(fzp.WHITE_BALANCE_FLUORESCENT, R.drawable.ic_wb_fluorescent, R.string.white_balance_fluorescent_desc, R.string.white_balance_fluorescent_desc), new fzn(fzp.WHITE_BALANCE_INCANDESCENT, R.drawable.ic_wb_incandescent, R.string.white_balance_incandescent_desc, R.string.white_balance_incandescent_desc)));
        fzo fzo2 = fzo.PHOTO_FLASH;
        fzp fzp = fzp.PHOTO_FLASH_OFF;
        Integer valueOf6 = Integer.valueOf(R.drawable.ic_flash_normal_off);
        fzp fzp2 = fzp.PHOTO_FLASH_AUTO;
        Integer valueOf7 = Integer.valueOf(R.drawable.ic_flash_normal_auto);
        fzp fzp3 = fzp.PHOTO_FLASH_ON;
        Integer valueOf8 = Integer.valueOf(R.drawable.ic_flash_normal_on);
        this.f5153e = new fzm(fzo2, kes.m4868b(fzp, valueOf6, fzp2, valueOf7, fzp3, valueOf8), R.string.flash_options_desc, ken.m13710a(new fzn(fzp.PHOTO_FLASH_OFF, R.drawable.ic_flash_normal_off, R.string.flash_off_desc, R.string.flash_off_desc), new fzn(fzp.PHOTO_FLASH_AUTO, R.drawable.ic_flash_normal_auto, R.string.flash_auto_desc, R.string.flash_auto_desc), new fzn(fzp.PHOTO_FLASH_ON, R.drawable.ic_flash_normal_on, R.string.flash_on_desc, R.string.flash_on_desc)));
        this.f5154f = new fzm(fzo.VIDEO_FLASH, kes.m4867b(fzp.VIDEO_FLASH_OFF, valueOf6, fzp.VIDEO_FLASH_ON, valueOf8), R.string.flash_options_desc, ken.m13709a(new fzn(fzp.VIDEO_FLASH_OFF, R.drawable.ic_flash_normal_off, R.string.flash_off_desc, R.string.flash_off_desc), new fzn(fzp.VIDEO_FLASH_ON, R.drawable.ic_flash_normal_on, R.string.flash_on_desc, R.string.flash_on_desc)));
        fzo2 = fzo.FPS;
        fzp = fzp.FPS_AUTO;
        valueOf6 = Integer.valueOf(R.drawable.ic_fps_auto);
        fzp2 = fzp.FPS_30;
        valueOf7 = Integer.valueOf(R.drawable.ic_fps_30);
        fzp3 = fzp.FPS_60;
        valueOf8 = Integer.valueOf(R.drawable.ic_fps_60);
        this.f5155g = new fzm(fzo2, kes.m4868b(fzp, valueOf6, fzp2, valueOf7, fzp3, valueOf8), R.string.fps_options_desc, ken.m13709a(new fzn(fzp.FPS_30, R.drawable.ic_fps_expanded_30, R.string.fps_desc, R.string.fps_30_desc), new fzn(fzp.FPS_60, R.drawable.ic_fps_expanded_60, R.string.fps_desc, R.string.fps_60_desc)));
        this.f5156h = new fzm(fzo.FPS, kes.m4868b(fzp.FPS_AUTO, valueOf6, fzp.FPS_30, valueOf7, fzp.FPS_60, valueOf8), R.string.fps_options_desc, ken.m13710a(new fzn(fzp.FPS_AUTO, R.drawable.ic_fps_expanded_auto, R.string.fps_desc_auto, R.string.fps_auto_desc), new fzn(fzp.FPS_30, R.drawable.ic_fps_expanded_30, R.string.fps_desc, R.string.fps_30_desc), new fzn(fzp.FPS_60, R.drawable.ic_fps_expanded_60, R.string.fps_desc, R.string.fps_60_desc)));
        this.f5157i = new fzm(fzo.MICROPHONE, kes.m4867b(fzp.EXT_MICROPHONE_ON, Integer.valueOf(R.drawable.ic_ext_mic_on), fzp.EXT_MICROPHONE_OFF, Integer.valueOf(R.drawable.ic_ext_mic_off)), R.string.ext_mic_options_desc, ken.m13709a(new fzn(fzp.EXT_MICROPHONE_ON, R.drawable.ic_ext_mic_on, R.string.ext_mic_on_desc, R.string.ext_mic_on_acc_desc), new fzn(fzp.EXT_MICROPHONE_OFF, R.drawable.ic_ext_mic_off, R.string.ext_mic_off_desc, R.string.ext_mic_off_acc_desc)));
        this.f5158j = new fzm(fzo.MICROVIDEO, kes.m4868b(fzp.MICROVIDEO_OFF, Integer.valueOf(R.drawable.ic_motion_off), fzp.MICROVIDEO_ON, Integer.valueOf(R.drawable.ic_motion_recording), fzp.MICROVIDEO_AUTO, Integer.valueOf(R.drawable.ic_motion_auto_recording)), R.string.micro_desc, ken.m13710a(new fzn(fzp.MICROVIDEO_OFF, R.drawable.ic_motion_off, R.string.micro_off_desc, R.string.micro_off_desc), new fzn(fzp.MICROVIDEO_AUTO, R.drawable.ic_motion_auto, R.string.micro_auto_desc, R.string.micro_auto_desc), new fzn(fzp.MICROVIDEO_ON, R.drawable.ic_motion_on, R.string.micro_on_desc, R.string.micro_on_desc)));
        this.f5159k = new fzm(fzo.VESPER, kes.m4867b(fzp.VESPER_OFF, Integer.valueOf(R.drawable.ic_faceretouch_off), fzp.VESPER_ON, Integer.valueOf(R.drawable.ic_faceretouch_on)), R.string.faceretouch_desc, ken.m13709a(new fzn(fzp.VESPER_OFF, R.drawable.ic_faceretouch_off, R.string.faceretouch_off_desc, R.string.faceretouch_off_desc), new fzn(fzp.VESPER_ON, R.drawable.ic_faceretouch_on, R.string.faceretouch_on_desc, R.string.faceretouch_on_desc)));
        this.f5160l = new fzm(fzo.PANORAMA_HORIZONTAL, kes.m4867b(fzp.SELECTED, Integer.valueOf(R.drawable.ic_panorama_horizontal_on_white_24), fzp.UNSELECTED, Integer.valueOf(R.drawable.quantum_ic_panorama_horizontal_white_24)), R.string.panorama_horizontal_desc, ken.m13719e());
        this.f5161m = new fzm(fzo.PANORAMA_VERTICAL, kes.m4867b(fzp.SELECTED, Integer.valueOf(R.drawable.ic_panorama_vertical_on_white_24), fzp.UNSELECTED, Integer.valueOf(R.drawable.quantum_ic_panorama_vertical_white_24)), R.string.panorama_vertical_desc, ken.m13719e());
        this.f5162n = new fzm(fzo.PANORAMA_WIDE, kes.m4867b(fzp.SELECTED, Integer.valueOf(R.drawable.ic_panorama_wide_angle_on_white_24), fzp.UNSELECTED, Integer.valueOf(R.drawable.quantum_ic_panorama_wide_angle_white_24)), R.string.panorama_wide_desc, ken.m13719e());
        this.f5163o = new fzm(fzo.PANORAMA_FISHEYE, kes.m4867b(fzp.SELECTED, Integer.valueOf(R.drawable.ic_panorama_fish_eye_on_white_24), fzp.UNSELECTED, Integer.valueOf(R.drawable.quantum_ic_panorama_fish_eye_white_24)), R.string.panorama_fish_eye_desc, ken.m13719e());
        this.f5164p = new fzm(fzo.PANORAMA_PHOTOSPHERE, kes.m4867b(fzp.SELECTED, Integer.valueOf(R.drawable.ic_photosphere_selected_24dp), fzp.UNSELECTED, Integer.valueOf(R.drawable.ic_photosphere_normal)), R.string.photosphere_name, ken.m13719e());
        this.f5165q = new fzm(fzo.IMAX_AUDIO, kes.m4867b(fzp.IMAX_AUDIO_ON, Integer.valueOf(R.drawable.quantum_ic_mic_white_24), fzp.IMAX_AUDIO_OFF, Integer.valueOf(R.drawable.quantum_ic_mic_off_white_24)), R.string.ext_mic_options_desc, ken.m13709a(new fzn(fzp.IMAX_AUDIO_ON, R.drawable.quantum_ic_mic_white_24, R.string.ext_mic_on_desc, R.string.ext_mic_on_acc_desc), new fzn(fzp.IMAX_AUDIO_OFF, R.drawable.quantum_ic_mic_off_white_24, R.string.ext_mic_off_desc, R.string.ext_mic_off_acc_desc)));
    }

    /* renamed from: a */
    public fzm mo6980a() {
        return new fzm(fzo.HDR, kes.m4865a(fzp.HDR_OFF, Integer.valueOf(R.drawable.ic_hdr_off_active_24dp), fzp.HDR_AUTO, Integer.valueOf(R.drawable.ic_hdr_auto_active_24dp), fzp.HDR_ON, Integer.valueOf(R.drawable.ic_hdr_on_active_24dp), fzp.HDR_READY, Integer.valueOf(R.drawable.ic_hdr_auto_checkmark_active_24dp)), R.string.hdr_plus_options_desc, ken.m13710a(new fzn(fzp.HDR_OFF, R.drawable.ic_hdr_off_24dp, R.string.hdr_off_desc, R.string.hdr_off_desc), new fzn(fzp.HDR_AUTO, R.drawable.ic_hdr_auto_24dp, R.string.hdr_auto_desc, R.string.hdr_auto_desc), new fzn(fzp.HDR_ON, R.drawable.ic_hdr_on_24dp, R.string.hdr_on_desc, R.string.hdr_on_desc)));
    }
}
