package p000;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* compiled from: PG */
/* renamed from: bki */
final class bki extends AudioDeviceCallback {
    /* renamed from: a */
    private final /* synthetic */ bkh f1268a;

    bki(bkh bkh) {
        this.f1268a = bkh;
    }

    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.f1268a.mo14570c();
    }

    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.f1268a.mo14570c();
    }
}
