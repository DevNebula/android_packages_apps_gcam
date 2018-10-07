package p000;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.camera.legacy.app.refocus.ViewerActivity;
import com.google.android.apps.refocus.processing.RenderingTask;

/* compiled from: PG */
/* renamed from: dxg */
final class dxg implements iqb {
    /* renamed from: a */
    public final /* synthetic */ ViewerActivity f16927a;
    /* renamed from: b */
    private final /* synthetic */ Uri f16928b;
    /* renamed from: c */
    private final /* synthetic */ kpw f16929c;
    /* renamed from: d */
    private final /* synthetic */ RenderingTask f16930d;

    dxg(ViewerActivity viewerActivity, Uri uri, kpw kpw, RenderingTask renderingTask) {
        this.f16927a = viewerActivity;
        this.f16928b = uri;
        this.f16929c = kpw;
        this.f16930d = renderingTask;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8765a(Object obj) {
        Object intent = new Intent();
        intent.setData(this.f16928b);
        String str = ViewerActivity.f23265d;
        String valueOf = String.valueOf(this.f16928b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 12);
        stringBuilder.append("finish with ");
        stringBuilder.append(valueOf);
        bli.m888a(str, stringBuilder.toString());
        this.f16929c.mo15641a(intent);
        this.f16930d.removeFinishedCallback(this);
        this.f16927a.f23280s.post(new dxh(this));
    }
}
