package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Vibrator;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* compiled from: PG */
/* renamed from: gwq */
final class gwq implements SensorEventListener {
    /* renamed from: a */
    private final /* synthetic */ Vibrator f6097a;
    /* renamed from: b */
    private final /* synthetic */ BottomBarController f6098b;
    /* renamed from: c */
    private final /* synthetic */ gwp f6099c;

    gwq(gwp gwp, Vibrator vibrator, BottomBarController bottomBarController) {
        this.f6099c = gwp;
        this.f6097a = vibrator;
        this.f6098b = bottomBarController;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.f6099c.f19745h.mo8920j();
        if (this.f6097a.hasVibrator()) {
            this.f6097a.vibrate(gwp.f19738a, -1);
        }
        this.f6098b.switchCamera();
    }
}
