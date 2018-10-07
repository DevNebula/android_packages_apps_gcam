package p000;

import android.hardware.camera2.CaptureFailure;

/* compiled from: PG */
/* renamed from: itp */
public final class itp implements iwm {
    /* renamed from: a */
    private final CaptureFailure f21274a;

    itp(CaptureFailure captureFailure) {
        this.f21274a = captureFailure;
    }

    /* renamed from: a */
    public final int mo9132a() {
        return this.f21274a.getReason();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("frame number=");
        stringBuilder.append(this.f21274a.getFrameNumber());
        stringBuilder.append(", reason=");
        stringBuilder.append(this.f21274a.getReason());
        stringBuilder.append(", wasImageCaptured=");
        stringBuilder.append(this.f21274a.wasImageCaptured());
        stringBuilder.append(", sequenceId=");
        stringBuilder.append(this.f21274a.getSequenceId());
        return stringBuilder.toString();
    }
}
