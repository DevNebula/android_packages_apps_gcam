package p000;

import android.annotation.TargetApi;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import java.util.List;

/* compiled from: PG */
/* renamed from: iwl */
public interface iwl extends iqo {
    /* renamed from: a */
    iwn mo13718a(int i);

    @TargetApi(23)
    /* renamed from: a */
    iwn mo13719a(iwp iwp);

    @TargetApi(23)
    /* renamed from: a */
    void mo13720a(InputConfiguration inputConfiguration, List list, iwi iwi, Handler handler);

    @TargetApi(28)
    /* renamed from: a */
    void mo13721a(iwu iwu);

    /* renamed from: a */
    void mo13722a(List list, iwi iwi, Handler handler);

    @TargetApi(23)
    /* renamed from: a */
    void mo13723a(List list, iwk iwk, Handler handler);

    @TargetApi(24)
    /* renamed from: b */
    void mo13724b(InputConfiguration inputConfiguration, List list, iwi iwi, Handler handler);

    @TargetApi(24)
    /* renamed from: b */
    void mo13725b(List list, iwi iwi, Handler handler);

    void close();
}
