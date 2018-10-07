package p000;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: gtm */
public final class gtm implements gtl {
    /* renamed from: a */
    public static final String f19581a = bli.m887a("StorageDlgBldr");
    /* renamed from: b */
    public final Context f19582b;
    /* renamed from: c */
    public final ikd f19583c;
    /* renamed from: d */
    private final guf f19584d;

    gtm(Context context, ikd ikd, guf guf) {
        this.f19582b = context;
        this.f19583c = ikd;
        this.f19584d = guf;
    }

    /* renamed from: a */
    private static AlertDialog m11732a(Builder builder) {
        AlertDialog create = builder.create();
        create.setCancelable(false);
        create.setCanceledOnTouchOutside(false);
        return create;
    }

    /* renamed from: a */
    public final AlertDialog mo7441a(OnClickListener onClickListener) {
        return gtm.m11732a(m11733b(this.f19582b.getResources().getString(R.string.video_storage_full_error_recording_dialog_title), this.f19582b.getResources().getString(R.string.video_storage_max_duration_dialog_body), onClickListener));
    }

    /* renamed from: b */
    public final AlertDialog mo7442b(OnClickListener onClickListener) {
        return gtm.m11732a(m11733b(this.f19582b.getResources().getString(R.string.video_storage_full_error_recording_dialog_title), this.f19582b.getResources().getString(R.string.video_storage_max_file_size_dialog_body), onClickListener));
    }

    /* renamed from: c */
    public final AlertDialog mo7443c(OnClickListener onClickListener) {
        return gtm.m11732a(m11731a(this.f19582b.getResources().getString(R.string.photo_storage_full_error_dialog_title), this.f19582b.getResources().getString(R.string.video_storage_full_error_dialog_body), onClickListener));
    }

    /* renamed from: d */
    public final AlertDialog mo7444d(OnClickListener onClickListener) {
        return gtm.m11732a(m11731a(this.f19582b.getResources().getString(R.string.video_storage_full_error_dialog_title), this.f19582b.getResources().getString(R.string.video_storage_full_error_dialog_body), onClickListener));
    }

    /* renamed from: e */
    public final AlertDialog mo7445e(OnClickListener onClickListener) {
        return gtm.m11732a(m11731a(this.f19582b.getResources().getString(R.string.video_storage_full_error_recording_dialog_title), this.f19582b.getResources().getString(R.string.video_storage_full_error_recording_dialog_body), onClickListener));
    }

    /* renamed from: f */
    public final kpk mo7446f(OnClickListener onClickListener) {
        kpk a = this.f19584d.mo7456a(false);
        kow.m13878a(a, new gtn(this, mo7443c(onClickListener)), kpq.f8776a);
        return a;
    }

    /* renamed from: a */
    private final Builder m11731a(String str, String str2, OnClickListener onClickListener) {
        return new Builder(this.f19582b, 16974546).setTitle(str).setMessage(str2).setPositiveButton(this.f19582b.getResources().getString(R.string.video_storage_full_error_free_up_space), new gtp(this)).setNegativeButton(this.f19582b.getResources().getString(R.string.dialog_dismiss), onClickListener);
    }

    /* renamed from: b */
    private final Builder m11733b(String str, String str2, OnClickListener onClickListener) {
        return new Builder(this.f19582b, 16974546).setTitle(str).setMessage(str2).setPositiveButton(this.f19582b.getResources().getString(R.string.dialog_ok), onClickListener);
    }
}
