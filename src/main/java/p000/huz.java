package p000;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;

/* renamed from: huz */
public final class huz extends Exception {
    /* renamed from: a */
    public final C0691ih f7063a;

    public huz(C0691ih c0691ih) {
        this.f7063a = c0691ih;
    }

    public final String getMessage() {
        Iterable arrayList = new ArrayList();
        Object obj = 1;
        for (icd icd : this.f7063a.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) this.f7063a.get(icd);
            if (connectionResult.mo14631b()) {
                obj = null;
            }
            String valueOf = String.valueOf(icd.f7288a.f7041a);
            String valueOf2 = String.valueOf(connectionResult);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 2) + String.valueOf(valueOf2).length());
            stringBuilder.append(valueOf);
            stringBuilder.append(": ");
            stringBuilder.append(valueOf2);
            arrayList.add(stringBuilder.toString());
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        if (obj == null) {
            stringBuilder2.append("Some of the queried APIs are unavailable. ");
        } else {
            stringBuilder2.append("None of the queried APIs are available. ");
        }
        stringBuilder2.append(TextUtils.join("; ", arrayList));
        return stringBuilder2.toString();
    }
}
