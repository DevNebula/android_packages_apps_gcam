package p000;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;

/* compiled from: PG */
/* renamed from: hly */
final class hly implements OnPreparedListener {
    /* renamed from: a */
    private final /* synthetic */ hlw f6709a;

    hly(hlw hlw) {
        this.f6709a = hlw;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        gqj gqj = this.f6709a.f24487a;
        if (gqj.f24482j) {
            gqj.mo13418X();
        } else {
            gqj.mo13416V();
        }
    }
}
