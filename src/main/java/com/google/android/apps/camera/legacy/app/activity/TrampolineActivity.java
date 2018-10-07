package com.google.android.apps.camera.legacy.app.activity;

import android.app.Activity;
import android.app.KeyguardManager;
import android.app.TaskStackBuilder;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;
import p000.aqe;
import p000.bli;
import p000.cdu;
import p000.cdv;
import p000.cdw;
import p000.ikb;

/* compiled from: PG */
public class TrampolineActivity extends Activity {
    /* renamed from: a */
    public static final String f2493a = bli.m887a("TrampolineActivity");
    /* renamed from: c */
    private static final Object f2494c = new Object();
    /* renamed from: e */
    private static TrampolineActivity f2495e = null;
    /* renamed from: b */
    public final BroadcastReceiver f2496b = new cdu(this);
    /* renamed from: d */
    private ikb f2497d;
    /* renamed from: f */
    private Intent f2498f;
    /* renamed from: g */
    private boolean f2499g = false;
    /* renamed from: h */
    private final BroadcastReceiver f2500h = new cdv();

    /* renamed from: a */
    public static void m1265a() {
        synchronized (f2494c) {
            if (f2495e != null) {
                f2495e.finish();
            }
            f2495e = null;
        }
    }

    /* renamed from: a */
    public final void mo2603a(Context context) {
        bli.m894c(f2493a, "Device unlocked, firing target intent.");
        Intent intent = new Intent(context, CameraActivity.class);
        intent.setFlags(intent.getFlags() | 67108864).setAction("android.intent.action.MAIN");
        TaskStackBuilder create = TaskStackBuilder.create(context);
        if (this.f2499g) {
            create.addNextIntent(intent);
        }
        create.addNextIntent(this.f2498f).startActivities();
        m1265a();
    }

    protected void onCreate(Bundle bundle) {
        bli.m894c(f2493a, "Trampoline onCreate");
        synchronized (f2494c) {
            f2495e = this;
        }
        super.onCreate(bundle);
        Window window = getWindow();
        LayoutParams attributes = window.getAttributes();
        attributes.flags |= 4194304;
        window.setAttributes(attributes);
        registerReceiver(this.f2500h, new IntentFilter("android.intent.action.SCREEN_OFF"));
        Intent intent = getIntent();
        this.f2498f = (Intent) intent.getParcelableExtra("android.intent.extra.INTENT");
        aqe.m610a(this.f2498f, "Argument must not be null");
        this.f2499g = intent.getBooleanExtra("push_camera", false);
    }

    protected void onDestroy() {
        bli.m894c(f2493a, "Trampoline onDestroy");
        unregisterReceiver(this.f2500h);
        super.onDestroy();
    }

    protected void onNewIntent(Intent intent) {
        bli.m894c(f2493a, "Trampoline onNewIntent");
        super.onNewIntent(intent);
    }

    protected void onPause() {
        bli.m894c(f2493a, "Trampoline onPause");
        this.f2497d.close();
        super.onPause();
    }

    protected void onResume() {
        super.onResume();
        this.f2497d = new ikb();
        bli.m894c(f2493a, "Trampoline onResume");
        if (((KeyguardManager) getSystemService("keyguard")).isDeviceLocked()) {
            bli.m894c(f2493a, "Waiting for device to be unlocked");
            registerReceiver(this.f2496b, new IntentFilter("android.intent.action.USER_PRESENT"));
            this.f2497d.mo8557a(new cdw(this));
            return;
        }
        bli.m894c(f2493a, "Launching target activity from onResume");
        mo2603a(this);
    }

    protected void onStart() {
        bli.m894c(f2493a, "Trampoline onStart");
        super.onStart();
    }

    protected void onStop() {
        bli.m894c(f2493a, "Trampoline onStop");
        super.onStop();
    }
}
