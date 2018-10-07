package com.google.android.apps.camera.videoplayer;

import android.app.Activity;
import android.app.Fragment;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.GoogleCamera.R;
import p000.hkx;
import p000.hky;

/* compiled from: PG */
public class VideoPlayerActivity extends Activity {
    /* renamed from: a */
    private final BroadcastReceiver f2638a = new hkx(this);

    /* renamed from: a */
    private final void m1371a(Uri uri) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("video", uri);
        Fragment hky = new hky();
        hky.setArguments(bundle);
        getFragmentManager().beginTransaction().add(R.id.video_player_activity_layout, hky).commit();
    }

    /* renamed from: a */
    private final hky m1370a() {
        return (hky) getFragmentManager().findFragmentById(R.id.video_player_activity_layout);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.videoplayer_activity_main);
        if (m1370a() == null) {
            m1371a(getIntent().getData());
        }
        registerReceiver(this.f2638a, new IntentFilter("android.intent.action.SCREEN_OFF"));
    }

    protected void onDestroy() {
        unregisterReceiver(this.f2638a);
        super.onDestroy();
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Fragment a = m1370a();
        if (a != null) {
            getFragmentManager().beginTransaction().remove(a).commit();
        }
        m1371a(intent.getData());
    }
}
