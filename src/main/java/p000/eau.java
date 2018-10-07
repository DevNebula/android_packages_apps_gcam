package p000;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

/* compiled from: PG */
/* renamed from: eau */
final class eau implements OnSeekBarChangeListener {
    /* renamed from: a */
    private final /* synthetic */ eaq f3677a;

    eau(eaq eaq) {
        this.f3677a = eaq;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        eaq eaq = this.f3677a;
        eaq.f17121f = (float) Math.toRadians((double) i);
        eaq.mo13109b();
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
