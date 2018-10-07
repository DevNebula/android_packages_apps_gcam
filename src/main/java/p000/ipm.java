package p000;

import android.media.AudioRecord;
import android.util.Log;
import java.util.concurrent.Callable;

/* renamed from: ipm */
public final /* synthetic */ class ipm implements Callable {
    /* renamed from: a */
    private final ios f7659a;

    public ipm(ios ios) {
        this.f7659a = ios;
    }

    public final Object call() {
        ios ios = this.f7659a;
        iow iow = ios.f21145g;
        if (iow != null) {
            String valueOf;
            StringBuilder stringBuilder;
            synchronized (iow.f21183a) {
                if (iow.f21196n != ipa.READY) {
                    String valueOf2 = String.valueOf(iow.f21196n);
                    StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 17);
                    stringBuilder2.append("illegal state as ");
                    stringBuilder2.append(valueOf2);
                    Log.e("AudioEncoder", stringBuilder2.toString());
                } else {
                    iow.f21195m = new ioy(iow, "AudioEncoder");
                    iow.f21194l = new ioz(iow, "AudioEncoder");
                    iow.f21192j = 0;
                    iow.f21185c.startRecording();
                    valueOf = String.valueOf(iow.f21185c.getRoutedDevice());
                    stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 30);
                    stringBuilder.append("actual audio recording input: ");
                    stringBuilder.append(valueOf);
                    Log.d("AudioEncoder", stringBuilder.toString());
                    iow.f21186d.start();
                    iow.f21194l.start();
                    iow.f21195m.start();
                    iow.f21196n = ipa.STARTED;
                }
            }
            iov iov = ios.f21149k;
            if (iov != null) {
                AudioRecord audioRecord = ios.f21148j;
                synchronized (iov.f21179e) {
                    if (iov.f21178d) {
                    } else {
                        if (iov.f21177c != null) {
                            iov.mo13697a();
                        }
                        valueOf = String.valueOf(audioRecord);
                        stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 22);
                        stringBuilder.append("Start, with routing = ");
                        stringBuilder.append(valueOf);
                        Log.d("AudioDeviceSelector", stringBuilder.toString());
                        iov.f21177c = audioRecord;
                        iov.mo13698a(audioRecord);
                        audioRecord.addOnRoutingChangedListener(iov.f21175a, iov.f21176b);
                    }
                }
            }
        }
        return null;
    }
}
