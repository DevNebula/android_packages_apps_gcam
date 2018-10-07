package p000;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

/* compiled from: PG */
/* renamed from: eat */
final class eat implements OnSeekBarChangeListener {
    /* renamed from: a */
    private final /* synthetic */ eaq f3676a;

    eat(eaq eaq) {
        this.f3676a = eaq;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        eaq eaq = this.f3676a;
        eaq.f17120e = ((float) i) / 1000.0f;
        eaq.mo13109b();
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
