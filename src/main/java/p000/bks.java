package p000;

import java.util.concurrent.Callable;

/* renamed from: bks */
final /* synthetic */ class bks implements Callable {
    /* renamed from: a */
    private final iot f1271a;

    bks(iot iot) {
        this.f1271a = iot;
    }

    public final Object call() {
        iot iot = this.f1271a;
        if (iot.f7620k != null || iot.f7621l != null) {
            return new ios(iot);
        }
        throw new IllegalArgumentException("Either Output video file path or descriptor is required");
    }
}
