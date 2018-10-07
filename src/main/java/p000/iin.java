package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: iin */
public final class iin extends hwc {
    /* renamed from: l */
    public final ExecutorService f26519l;
    /* renamed from: m */
    public final ihw f26520m;
    /* renamed from: n */
    private final ihw f26521n;
    /* renamed from: o */
    private final ihw f26522o;
    /* renamed from: p */
    private final ihw f26523p;
    /* renamed from: q */
    private final ihw f26524q;
    /* renamed from: r */
    private final ihw f26525r;
    /* renamed from: s */
    private final ihw f26526s;
    /* renamed from: t */
    private final ihw f26527t;
    /* renamed from: u */
    private final iir f26528u;

    public iin(Context context, Looper looper, hus hus, hut hut, hvx hvx) {
        this(context, looper, hus, hut, hvx, Executors.newCachedThreadPool(), iir.m3816a(context));
    }

    private iin(Context context, Looper looper, hus hus, hut hut, hvx hvx, ExecutorService executorService, iir iir) {
        super(context, looper, 14, hvx, hus, hut);
        this.f26521n = new ihw();
        this.f26522o = new ihw();
        this.f26523p = new ihw();
        this.f26524q = new ihw();
        this.f26520m = new ihw();
        this.f26525r = new ihw();
        this.f26526s = new ihw();
        this.f26527t = new ihw();
        this.f26519l = (ExecutorService) htl.m3488b((Object) executorService);
        this.f26528u = iir;
    }

    /* renamed from: a */
    protected final String mo8177a() {
        return "com.google.android.gms.wearable.BIND";
    }

    /* renamed from: a */
    protected final void mo8179a(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (Log.isLoggable("WearableClient", 2)) {
            StringBuilder stringBuilder = new StringBuilder(41);
            stringBuilder.append("onPostInitHandler: statusCode ");
            stringBuilder.append(i);
            Log.d("WearableClient", stringBuilder.toString());
        }
        if (i == 0) {
            this.f26521n.mo8491a(iBinder);
            this.f26522o.mo8491a(iBinder);
            this.f26523p.mo8491a(iBinder);
            this.f26524q.mo8491a(iBinder);
            this.f26520m.mo8491a(iBinder);
            this.f26525r.mo8491a(iBinder);
            this.f26526s.mo8491a(iBinder);
            this.f26527t.mo8491a(iBinder);
        }
        super.mo8179a(i, iBinder, bundle, i2);
    }

    /* renamed from: a */
    public final void mo8182a(hvs hvs) {
        int i = 0;
        if (!mo8193h()) {
            try {
                Bundle bundle = this.f7084c.getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                if (bundle != null) {
                    i = bundle.getInt("com.google.android.wearable.api.version", 0);
                }
                if (i < huc.f7033c) {
                    int i2 = huc.f7033c;
                    StringBuilder stringBuilder = new StringBuilder(80);
                    stringBuilder.append("Android Wear out of date. Requires API version ");
                    stringBuilder.append(i2);
                    stringBuilder.append(" but found ");
                    stringBuilder.append(i);
                    Log.w("WearableClient", stringBuilder.toString());
                    Context context = this.f7084c;
                    Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (context.getPackageManager().resolveActivity(intent, 65536) == null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    mo8183a(hvs, 6, PendingIntent.getActivity(context, 0, intent, 0));
                    return;
                }
            } catch (NameNotFoundException e) {
                mo8183a(hvs, 16, null);
                return;
            }
        }
        super.mo8182a(hvs);
    }

    /* renamed from: b */
    protected final String mo8187b() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    /* renamed from: h */
    public final boolean mo8193h() {
        return this.f26528u.mo8511a("com.google.android.wearable.app.cn") ^ 1;
    }

    /* renamed from: m */
    protected final String mo8197m() {
        return !this.f26528u.mo8511a("com.google.android.wearable.app.cn") ? "com.google.android.gms" : "com.google.android.wearable.app.cn";
    }
}
