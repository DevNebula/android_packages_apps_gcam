package p000;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

/* compiled from: PG */
/* renamed from: hpc */
final class hpc implements OnSeekBarChangeListener {
    /* renamed from: a */
    private final /* synthetic */ hox f6789a;

    hpc(hox hox) {
        this.f6789a = hox;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            boolean z2;
            if (((Float) this.f6789a.f20239q.mo13673b()).floatValue() != 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            jri.m13396a(z2, (Object) "max zoom value hasn't been initialized properly");
            int max = this.f6789a.f20226c.getMax();
            hox hox = this.f6789a;
            float f = hox.f20224a;
            this.f6789a.f20232j.mo8826a(Float.valueOf((float) (Math.pow((double) (((Float) hox.f20239q.mo13673b()).floatValue() / this.f6789a.f20224a), (double) (((float) i) / ((float) max))) * ((double) f))));
            hox = this.f6789a;
            hox.f20227d.mo2757a(((Float) hox.f20232j.mo13673b()).floatValue());
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f6789a.f20225b.mo14944ak();
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.f6789a.f20225b.mo13440g();
    }
}
