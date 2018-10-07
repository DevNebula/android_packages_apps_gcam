package p000;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.support.p001v4.app.DialogFragment;

/* renamed from: hug */
public final class hug extends DialogFragment {
    /* renamed from: a */
    public OnCancelListener f26502a = null;
    public Dialog mDialog = null;

    public final void onCancel(DialogInterface dialogInterface) {
        OnCancelListener onCancelListener = this.f26502a;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.mDialog == null) {
            setShowsDialog(false);
        }
        return this.mDialog;
    }
}
