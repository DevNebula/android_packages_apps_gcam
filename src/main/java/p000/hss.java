package p000;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.google.android.apps.refocus.viewer.RefocusBokehSeekBar;

/* compiled from: PG */
/* renamed from: hss */
public final class hss implements OnSeekBarChangeListener {
    /* renamed from: a */
    private final /* synthetic */ RefocusBokehSeekBar f6955a;

    public hss(RefocusBokehSeekBar refocusBokehSeekBar) {
        this.f6955a = refocusBokehSeekBar;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            RefocusBokehSeekBar refocusBokehSeekBar = this.f6955a;
            refocusBokehSeekBar.f2652a = ((float) i) / 100.0f;
            huj huj = refocusBokehSeekBar.f2653b;
            if (huj != null) {
                huj.f7045b.mo12662a(true, refocusBokehSeekBar.f2652a);
            }
            this.f6955a.mo2809a();
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
