package p000;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.util.TypedValue;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: gsz */
public final class gsz extends DialogFragment {
    /* renamed from: a */
    public gtb f6046a;
    /* renamed from: b */
    private final OnClickListener f6047b = new gta(this);

    static {
        bli.m887a("CameraStorageAccessFailureDialog");
    }

    /* renamed from: a */
    final void mo7428a() {
        gtb gtb = this.f6046a;
        if (gtb != null) {
            gtb.mo7434b();
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        mo7428a();
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Context activity = getActivity();
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(16843605, typedValue, true);
        return new Builder(activity, 16974546).setCancelable(false).setTitle(R.string.storage_error_dialog_title).setMessage(R.string.storage_error_dialog_message).setPositiveButton(R.string.storage_error_button_text, this.f6047b).setIcon(typedValue.resourceId).create();
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        mo7428a();
    }
}
