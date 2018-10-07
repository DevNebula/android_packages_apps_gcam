package p000;

import com.google.googlex.gcam.BoolVector;
import com.google.googlex.gcam.FloatVector;
import com.google.googlex.gcam.ShotLogData;

/* compiled from: PG */
/* renamed from: epu */
public final class epu {
    /* renamed from: a */
    public kkf f4294a = new kkf();

    public epu(ShotLogData shotLogData, int i) {
        float[] fArr;
        kkf kkf;
        boolean z;
        boolean z2 = true;
        this.f4294a.f25100a = shotLogData.getAe_confidence_short_exposure();
        this.f4294a.f25101b = shotLogData.getAe_confidence_long_exposure();
        this.f4294a.f25102c = shotLogData.getAe_confidence_single_exposure();
        this.f4294a.f25103d = shotLogData.getIdeal_range_compression();
        this.f4294a.f25104e = shotLogData.getActual_range_compression();
        this.f4294a.f25090C = shotLogData.getPure_fraction_of_pixels_from_long_exposure();
        this.f4294a.f25091D = shotLogData.getWeighted_fraction_of_pixels_from_long_exposure();
        this.f4294a.f25105f = shotLogData.getShort_exp_adjustment_factor();
        this.f4294a.f25106g = shotLogData.getLong_exp_adjustment_factor();
        this.f4294a.f25107h = shotLogData.getLog_scene_brightness();
        this.f4294a.f25108i = shotLogData.getMetering_frame_count();
        this.f4294a.f25109j = shotLogData.getOriginal_payload_frame_count();
        this.f4294a.f25111l = shotLogData.getBase_frame_index();
        this.f4294a.f25112m = shotLogData.getMerged_frame_count();
        this.f4294a.f25116q = shotLogData.getZsl();
        FloatVector original_payload_frame_sharpness = shotLogData.getOriginal_payload_frame_sharpness();
        this.f4294a.f25110k = new float[((int) original_payload_frame_sharpness.size())];
        int i2 = 0;
        while (true) {
            fArr = this.f4294a.f25110k;
            if (i2 >= fArr.length) {
                break;
            }
            fArr[i2] = original_payload_frame_sharpness.get(i2);
            i2++;
        }
        original_payload_frame_sharpness = shotLogData.getFinal_payload_frame_sharpness();
        this.f4294a.f25117r = new float[((int) original_payload_frame_sharpness.size())];
        i2 = 0;
        while (true) {
            fArr = this.f4294a.f25117r;
            if (i2 >= fArr.length) {
                break;
            }
            fArr[i2] = original_payload_frame_sharpness.get(i2);
            i2++;
        }
        BoolVector was_payload_frame_merged = shotLogData.getWas_payload_frame_merged();
        this.f4294a.f25118s = new boolean[((int) was_payload_frame_merged.size())];
        i2 = 0;
        while (true) {
            kkf = this.f4294a;
            boolean[] zArr = kkf.f25118s;
            if (i2 >= zArr.length) {
                break;
            }
            zArr[i2] = was_payload_frame_merged.get(i2);
            i2++;
        }
        kkf.f25113n = shotLogData.getTime_to_shot();
        this.f4294a.f25114o = shotLogData.getTime_to_postview();
        kkf kkf2 = this.f4294a;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        kkf2.f25093F = z;
        if (shotLogData.getExecuted_finish_on() != 1) {
            z2 = false;
        }
        kkf2.f25115p = z2;
        this.f4294a.f25119t = shotLogData.getCapture_time();
        this.f4294a.f25120u = shotLogData.getPostview_callback_time();
        this.f4294a.f25121v = shotLogData.getMerge_process_time();
        this.f4294a.f25122w = shotLogData.getMerged_raw_callback_time();
        this.f4294a.f25123x = shotLogData.getFinish_process_time();
        this.f4294a.f25124y = shotLogData.getFinal_image_callback_time();
        this.f4294a.f25125z = shotLogData.getJpeg_encode_time();
        this.f4294a.f25088A = shotLogData.getJpeg_callback_time();
        this.f4294a.f25089B = shotLogData.getAborted();
        this.f4294a.f25092E = shotLogData.getCpu_usage_factor();
    }
}
