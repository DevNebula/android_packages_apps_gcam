package p000;

import android.content.Intent;
import com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService;

/* compiled from: PG */
/* renamed from: baq */
public final class baq implements kov {
    /* renamed from: a */
    public final /* synthetic */ SilentFeedbackService f11128a;
    /* renamed from: b */
    private final /* synthetic */ Intent f11129b;

    public baq(SilentFeedbackService silentFeedbackService, Intent intent) {
        this.f11128a = silentFeedbackService;
        this.f11129b = intent;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        bli.m892b(SilentFeedbackService.f2423a, "GoogleApiClient silent feedback connection failed with result", th);
        this.f11128a.mo2420a();
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        hjk hjk = (hjk) obj;
        bli.m896d(SilentFeedbackService.f2423a, "GoogleAPIClient connected.");
        try {
            Intent intent = this.f11129b;
            bli.m896d(SilentFeedbackService.f2423a, "Building crash options.");
            hxu hxv = new hxv();
            if (intent != null) {
                hxv.f7161a = " ";
                hxv.f7163c = true;
                if (intent.hasExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.exceptionClass")) {
                    hxv.mo13596a(intent.getStringExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.exceptionClass"));
                }
                if (intent.hasExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.stackTrace")) {
                    hxv.mo13597b(intent.getStringExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.stackTrace"));
                }
                if (intent.hasExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingClass")) {
                    hxv.mo13598c(intent.getStringExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingClass"));
                }
                if (intent.hasExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingFile")) {
                    hxv.mo13599d(intent.getStringExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingFile"));
                }
                if (intent.hasExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingLine")) {
                    hxv.mo13595a(intent.getIntExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingLine", -1));
                }
                if (intent.hasExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingMethod")) {
                    hxv.mo13600e(intent.getStringExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingMethod"));
                }
                if (intent.hasExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.categoryTag")) {
                    hxv.f7162b = intent.getStringExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.categoryTag");
                }
            }
            hxp.m3633a(hjk.f6637a.f20167a, hxv.mo8253a()).mo8151a(new bar(this, hjk));
        } catch (UnsupportedOperationException e) {
            bli.m888a(SilentFeedbackService.f2423a, "Could not clean PII, no feedback sent.");
            this.f11128a.mo2420a();
        }
    }
}
