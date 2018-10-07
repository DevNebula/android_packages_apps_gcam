package p000;

import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;

/* compiled from: PG */
/* renamed from: hqs */
final class hqs extends AsyncTask {
    /* renamed from: a */
    private int f6823a;
    /* renamed from: b */
    private int f6824b;
    /* renamed from: c */
    private final /* synthetic */ hqq f6825c;

    hqs(hqq hqq) {
        this.f6825c = hqq;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        this.f6823a = m3343a(hqq.f6815a);
        this.f6824b = m3343a(hqq.f6816b);
        return null;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        int i = this.f6823a;
        StringBuilder stringBuilder = new StringBuilder(36);
        stringBuilder.append("Lens availability result:");
        stringBuilder.append(i);
        Log.i("LensSdkParamsReader", stringBuilder.toString());
        i = this.f6824b;
        stringBuilder = new StringBuilder(40);
        stringBuilder.append("Stickers availability result:");
        stringBuilder.append(i);
        Log.i("LensSdkParamsReader", stringBuilder.toString());
        hqq hqq = this.f6825c;
        hra hra = hqq.f6820e;
        hra.f24515c = this.f6823a;
        hra.f24516d = this.f6824b;
        hqq.f6821f = true;
        for (hqr a : hqq.f6819d) {
            a.mo8034a(this.f6825c.f6820e);
        }
        this.f6825c.f6819d.clear();
    }

    /* renamed from: a */
    private final int m3343a(String str) {
        Throwable th;
        Cursor cursor;
        try {
            Cursor query = this.f6825c.f6818c.getContentResolver().query(Uri.parse(str), null, null, null, null);
            if (query != null) {
                try {
                    if (query.getCount() != 0) {
                        query.moveToFirst();
                        int parseInt = Integer.parseInt(query.getString(0));
                        if (parseInt > 6) {
                            parseInt = 6;
                        }
                        if (query == null) {
                            return parseInt;
                        }
                        query.close();
                        return parseInt;
                    }
                } catch (Throwable th2) {
                    Cursor cursor2 = query;
                    th = th2;
                    cursor = cursor2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return 4;
        } catch (Throwable th22) {
            th = th22;
            cursor = null;
        }
    }
}
