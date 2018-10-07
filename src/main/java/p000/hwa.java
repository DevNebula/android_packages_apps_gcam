package p000;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.util.Log;

/* renamed from: hwa */
public class hwa implements OnClickListener {
    /* renamed from: a */
    public final /* synthetic */ Intent f7126a;
    /* renamed from: b */
    public final /* synthetic */ Activity f7127b;
    /* renamed from: c */
    public final /* synthetic */ int f7128c;

    /* renamed from: a */
    public void mo8212a() {
        Intent intent = this.f7126a;
        if (intent != null) {
            this.f7127b.startActivityForResult(intent, this.f7128c);
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo8212a();
        } catch (Throwable e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }

    public hwa(Intent intent, Activity activity, int i) {
        this.f7126a = intent;
        this.f7127b = activity;
        this.f7128c = i;
        this();
    }
}
