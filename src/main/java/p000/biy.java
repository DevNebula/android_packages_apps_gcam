package p000;

import android.media.MediaRecorder;
import android.media.MediaRecorder.OnInfoListener;

/* compiled from: PG */
/* renamed from: biy */
final class biy implements OnInfoListener {
    /* renamed from: a */
    private boolean f1225a;
    /* renamed from: b */
    private boolean f1226b;
    /* renamed from: c */
    private final /* synthetic */ iop f1227c;

    biy(iop iop) {
        this.f1227c = iop;
    }

    public final void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        if (i == 801) {
            bli.m896d(bix.f11453a, "MEDIA_RECORDER_INFO_MAX_FILESIZE_REACHED");
            if (!this.f1226b) {
                this.f1226b = true;
                this.f1227c.mo8686e();
            }
        } else if (i == 800) {
            bli.m896d(bix.f11453a, "MEDIA_RECORDER_INFO_MAX_DURATION_REACHED");
            if (!this.f1225a) {
                this.f1225a = true;
                this.f1227c.mo8684c();
            }
        } else if (i == 802) {
            bli.m896d(bix.f11453a, "MEDIA_RECORDER_INFO_MAX_FILESIZE_APPROACHING");
            this.f1227c.mo8685d();
        } else if (i == 803) {
            bli.m896d(bix.f11453a, "MEDIA_RECORDER_INFO_NEXT_OUTPUT_FILE_STARTED");
            this.f1227c.mo8687f();
        }
    }
}
