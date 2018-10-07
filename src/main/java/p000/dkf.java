package p000;

import android.media.AudioManager.OnAudioFocusChangeListener;

/* compiled from: PG */
/* renamed from: dkf */
final class dkf implements OnAudioFocusChangeListener {
    dkf() {
    }

    public final void onAudioFocusChange(int i) {
        String str = dke.f14138a;
        StringBuilder stringBuilder = new StringBuilder(31);
        stringBuilder.append("onAudioFocusChange: ");
        stringBuilder.append(i);
        bli.m896d(str, stringBuilder.toString());
    }
}
