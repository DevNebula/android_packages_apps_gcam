package p000;

import android.os.AsyncTask;

/* compiled from: PG */
/* renamed from: cpg */
final class cpg extends AsyncTask {
    cpg() {
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        for (err err : (err[]) objArr) {
            if (err.mo6540f().mo6548a()) {
                err.mo6532a();
            } else {
                String str = coy.f13070a;
                String valueOf = String.valueOf(err);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 26);
                stringBuilder.append("Deletion is not supported:");
                stringBuilder.append(valueOf);
                bli.m896d(str, stringBuilder.toString());
            }
        }
        return null;
    }
}
