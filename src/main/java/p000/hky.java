package p000;

import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.VideoView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: hky */
public final class hky extends Fragment {
    /* renamed from: a */
    private final hls f6695a = new hli();
    /* renamed from: b */
    private final hkz f6696b = new hlc();
    /* renamed from: c */
    private final hln f6697c = new hlf();
    /* renamed from: d */
    private hlz f6698d;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = true;
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.videoplayer_fragment, viewGroup, false);
        this.f6698d = new hlz(this.f6695a, this.f6696b, this.f6697c, inflate, getActivity().getWindow().getDecorView());
        hlz hlz = this.f6698d;
        hlz.f6717h = hlz.f6713d.findViewById(R.id.video_view_holder);
        hlz.f6717h.setOnClickListener(new hmc(hlz));
        hlz.f6716g = (VideoView) hlz.f6713d.findViewById(R.id.video_view);
        hlz.f6716g.setOnTouchListener(new hmd(hlz));
        hlz.f6719j = (ImageButton) hlz.f6713d.findViewById(R.id.videoplayer_pause_button);
        hlz.f6719j.setOnClickListener(new hmb(hlz));
        hlz.f6718i = (ImageButton) hlz.f6713d.findViewById(R.id.videoplayer_play_button);
        hlz.f6718i.setOnClickListener(new hma(hlz));
        hlz.f6723n = hlz.f6713d.findViewById(R.id.controls_group);
        hlz.f6722m = (SeekBar) hlz.f6713d.findViewById(R.id.video_player_progress);
        hlz.f6722m.setOnSeekBarChangeListener(new hme(hlz));
        hlz.f6720k = (TextView) hlz.f6713d.findViewById(R.id.video_total_time);
        hlz.f6721l = (TextView) hlz.f6713d.findViewById(R.id.video_current_time);
        Uri uri = (Uri) getArguments().getParcelable("video");
        hln hln = this.f6697c;
        hlz = this.f6698d;
        hln.mo13426a(hlz, new hlq(hlz));
        this.f6697c.mo7343a();
        this.f6697c.mo7344b();
        hls hls = this.f6695a;
        hlz hlz2 = this.f6698d;
        hln hln2 = this.f6697c;
        if (bundle != null) {
            i = bundle.getInt("videoplayer_position", 0);
        }
        if (bundle != null) {
            z = bundle.getBoolean("videoplayer_playing", true);
        }
        hls.mo13425a(hlz2, uri, hln2, i, z);
        this.f6695a.mo7343a();
        this.f6696b.mo13424a(this.f6698d);
        this.f6696b.mo7343a();
        return inflate;
    }

    public final void onPause() {
        super.onPause();
        this.f6695a.mo13414T();
    }

    public final void onResume() {
        super.onResume();
        this.f6695a.mo13415U();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        boolean isPlaying = this.f6698d.f6716g.isPlaying();
        int currentPosition = this.f6698d.f6716g.getCurrentPosition();
        bundle.putBoolean("videoplayer_playing", isPlaying);
        bundle.putInt("videoplayer_position", currentPosition);
    }
}
