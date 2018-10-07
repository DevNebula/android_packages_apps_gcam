package p000;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

/* compiled from: PG */
/* renamed from: hme */
public final class hme implements OnSeekBarChangeListener {
    /* renamed from: a */
    private final /* synthetic */ hlz f6728a;

    public hme(hlz hlz) {
        this.f6728a = hlz;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            this.f6728a.f6712c.f24474d.seekTo(i);
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f6728a.f6712c.mo13429aa();
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.f6728a.f6712c.mo13420Z();
    }
}
