package p000;

import com.google.android.GoogleCamera.R;
import com.google.android.apps.refocus.viewer.RGBZFocusControls;
import com.google.android.apps.refocus.viewer.RefocusBokehSeekBar;

/* renamed from: hsl */
public final /* synthetic */ class hsl implements Runnable {
    /* renamed from: a */
    private final RGBZFocusControls f6948a;
    /* renamed from: b */
    private final hsp f6949b;

    public hsl(RGBZFocusControls rGBZFocusControls, hsp hsp) {
        this.f6948a = rGBZFocusControls;
        this.f6949b = hsp;
    }

    public final void run() {
        float B_;
        RGBZFocusControls rGBZFocusControls = this.f6948a;
        hsp hsp = this.f6949b;
        rGBZFocusControls.mo12661a();
        RefocusBokehSeekBar refocusBokehSeekBar = (RefocusBokehSeekBar) rGBZFocusControls.getRootView().findViewById(R.id.refocus_bokeh_seekbar);
        hst hst = rGBZFocusControls.f12904e;
        if (hst == null) {
            bli.m888a(RGBZFocusControls.f12900a, "clingView is null.");
        } else {
            refocusBokehSeekBar.f2654c = hst;
            refocusBokehSeekBar.mo2809a();
        }
        huj huj = new huj(rGBZFocusControls, hsp);
        refocusBokehSeekBar.f2653b = huj;
        hsp = huj.f7044a;
        if (hsp != null) {
            B_ = hsp.mo8091B_();
        } else {
            B_ = 0.0f;
        }
        refocusBokehSeekBar.f2652a = B_;
        refocusBokehSeekBar.setProgress((int) (refocusBokehSeekBar.f2652a * 100.0f));
        refocusBokehSeekBar.mo2809a();
        rGBZFocusControls.getRootView().findViewById(R.id.done_button).setOnClickListener(new hsm(rGBZFocusControls));
    }
}
