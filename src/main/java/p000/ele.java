package p000;

import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: PG */
/* renamed from: ele */
public final class ele extends HandlerThread {
    /* renamed from: a */
    private Handler f4151a = null;
    /* renamed from: b */
    private final /* synthetic */ int f4152b;
    /* renamed from: c */
    private final /* synthetic */ eld f4153c;

    public ele(eld eld, String str, int i) {
        this.f4153c = eld;
        this.f4152b = i;
        super(str);
    }

    protected final void onLooperPrepared() {
        this.f4151a = new Handler(getLooper());
        eld eld = this.f4153c;
        SensorManager sensorManager = eld.f4132d;
        sensorManager.registerListener(eld.f4148t, sensorManager.getDefaultSensor(1), 1, this.f4151a);
        eld = this.f4153c;
        sensorManager = eld.f4132d;
        sensorManager.registerListener(eld.f4148t, sensorManager.getDefaultSensor(4), this.f4152b, this.f4151a);
        eld = this.f4153c;
        sensorManager = eld.f4132d;
        sensorManager.registerListener(eld.f4148t, sensorManager.getDefaultSensor(2), 3, this.f4151a);
    }
}
