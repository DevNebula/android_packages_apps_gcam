package p000;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.GestureDetector.OnGestureListener;
import android.view.View.OnTouchListener;

/* compiled from: PG */
/* renamed from: dfs */
final class dfs extends has {
    /* renamed from: a */
    private final /* synthetic */ des f23867a;

    dfs(des des) {
        this.f23867a = des;
    }

    /* renamed from: a */
    public final OnGestureListener mo7610a() {
        return null;
    }

    /* renamed from: k_ */
    public final OnTouchListener mo7612k_() {
        return this.f23867a.f25929M;
    }

    /* renamed from: l_ */
    public final void mo7613l_() {
        Handler handler = this.f23867a.f25925I;
        if (handler != null) {
            handler.sendEmptyMessage(3);
        }
    }

    /* renamed from: d */
    public final void mo7611d() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0044  */
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture r4, int r5, int r6) {
        /*
        r3 = this;
        r0 = r3.f23867a;
        r1 = r0.f25926J;
        if (r1 != 0) goto L_0x0060;
    L_0x0006:
        r0.f25991z = r5;
        r0.f25917A = r6;
        r0.mo15498o();
        r0 = r3.f23867a;
        r0 = r0.f25981p;
        r0 = r0.mo12481l();
        r0.mo13112a();
        r0 = r3.f23867a;
        r0 = r0.f25981p;
        r0 = r0.mo12481l();
        r1 = r0.f17146I;
        if (r1 == 0) goto L_0x002c;
    L_0x0028:
        r2 = r0.f17141D;
        if (r2 != 0) goto L_0x0052;
    L_0x002c:
        r0 = p000.ebd.f17137a;
        r1 = "Could not set SurfaceTexture default buffer dimensions, not yet setup";
        p000.bli.m898e(r0, r1);
    L_0x0033:
        r0 = r3.f23867a;
        r1 = new bwb;
        r2 = r0.f25925I;
        r1.<init>(r4, r2, r0);
        r0.f25926J = r1;
        r0 = r3.f23867a;
        r1 = r0.f25975j;
        if (r1 == 0) goto L_0x0051;
    L_0x0044:
        r0.mo15504u();
        r0 = r3.f23867a;
        r0 = r0.f25988w;
        r0.mo12481l();
        p000.ebd.m9761i();
    L_0x0051:
        return;
    L_0x0052:
        r2 = r2.mo7606c();
        r0 = r0.f17141D;
        r0 = r0.mo7604b();
        r1.setDefaultBufferSize(r2, r0);
        goto L_0x0033;
    L_0x0060:
        r0 = p000.des.f25916c;
        r1 = "onCameraAvailable queued before onSurfaceTextureAvailable";
        p000.bli.m898e(r0, r1);
        goto L_0x0051;
        */
        throw new UnsupportedOperationException("Method not decompiled: dfs.onSurfaceTextureAvailable(android.graphics.SurfaceTexture, int, int):void");
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f23867a.mo15503t();
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        String str = des.f25916c;
        StringBuilder stringBuilder = new StringBuilder(52);
        stringBuilder.append("onSurfaceTextureSizeChanged: ");
        stringBuilder.append(i);
        stringBuilder.append("x");
        stringBuilder.append(i2);
        bli.m896d(str, stringBuilder.toString());
        des des = this.f23867a;
        des.f25991z = i;
        des.f25917A = i2;
        Handler handler = des.f25925I;
        if (handler != null) {
            handler.obtainMessage(2, i, i2).sendToTarget();
        }
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
