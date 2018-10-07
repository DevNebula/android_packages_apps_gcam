package p000;

import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.VideoView;

/* compiled from: PG */
/* renamed from: hlz */
public final class hlz {
    /* renamed from: a */
    public final hls f6710a;
    /* renamed from: b */
    public final hkz f6711b;
    /* renamed from: c */
    public final hln f6712c;
    /* renamed from: d */
    public final View f6713d;
    /* renamed from: e */
    public final View f6714e;
    /* renamed from: f */
    public final int f6715f;
    /* renamed from: g */
    public VideoView f6716g;
    /* renamed from: h */
    public View f6717h;
    /* renamed from: i */
    public ImageButton f6718i;
    /* renamed from: j */
    public ImageButton f6719j;
    /* renamed from: k */
    public TextView f6720k;
    /* renamed from: l */
    public TextView f6721l;
    /* renamed from: m */
    public SeekBar f6722m;
    /* renamed from: n */
    public View f6723n;

    public hlz(hls hls, hkz hkz, hln hln, View view, View view2) {
        this.f6710a = hls;
        this.f6711b = hkz;
        this.f6712c = hln;
        this.f6713d = view;
        this.f6714e = view2;
        this.f6715f = view.getResources().getInteger(17694720);
    }

    /* renamed from: a */
    public final void mo7946a(int i) {
        this.f6720k.setText(hhz.m3211a((long) i));
        this.f6722m.setMax(i);
    }

    /* renamed from: b */
    public final void mo7947b(int i) {
        this.f6721l.setText(hhz.m3211a((long) i));
        this.f6722m.setProgress(i);
    }
}
