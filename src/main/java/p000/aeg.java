package p000;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: aeg */
public final class aeg implements adw {
    /* renamed from: a */
    private static final aeh f10149a = new aeh();
    /* renamed from: b */
    private final ajl f10150b;
    /* renamed from: c */
    private final int f10151c;
    /* renamed from: d */
    private HttpURLConnection f10152d;
    /* renamed from: e */
    private InputStream f10153e;
    /* renamed from: f */
    private volatile boolean f10154f;

    public aeg(ajl ajl, int i) {
        this(ajl, i, f10149a);
    }

    private aeg(ajl ajl, int i, aeh aeh) {
        this.f10150b = ajl;
        this.f10151c = i;
    }

    /* renamed from: b */
    public final void mo188b() {
        this.f10154f = true;
    }

    /* renamed from: c */
    public final void mo189c() {
        InputStream inputStream = this.f10153e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
            }
        }
        HttpURLConnection httpURLConnection = this.f10152d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f10152d = null;
    }

    /* renamed from: a */
    public final Class mo186a() {
        return InputStream.class;
    }

    /* renamed from: d */
    public final adf mo190d() {
        return adf.REMOTE;
    }

    /* renamed from: a */
    public final void mo187a(acg acg, adx adx) {
        long a = arm.m655a();
        double a2;
        StringBuilder stringBuilder;
        try {
            ajl ajl = this.f10150b;
            if (ajl.f10344f == null) {
                if (TextUtils.isEmpty(ajl.f10343e)) {
                    String str = ajl.f10342d;
                    if (TextUtils.isEmpty(str)) {
                        str = ((URL) aqe.m610a(ajl.f10341c, "Argument must not be null")).toString();
                    }
                    ajl.f10343e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
                }
                ajl.f10344f = new URL(ajl.f10343e);
            }
            adx.mo192a(m6381a(ajl.f10344f, this.f10150b.f10340b.mo336a()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                a2 = arm.m654a(a);
                stringBuilder = new StringBuilder(59);
                stringBuilder.append("Finished http url fetcher fetch in ");
                stringBuilder.append(a2);
                Log.v("HttpUrlFetcher", stringBuilder.toString());
            }
        } catch (Exception e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e);
            }
            adx.mo191a(e);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                a2 = arm.m654a(a);
                stringBuilder = new StringBuilder(59);
                stringBuilder.append("Finished http url fetcher fetch in ");
                stringBuilder.append(a2);
                Log.v("HttpUrlFetcher", stringBuilder.toString());
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                double a3 = arm.m654a(a);
                StringBuilder stringBuilder2 = new StringBuilder(59);
                stringBuilder2.append("Finished http url fetcher fetch in ");
                stringBuilder2.append(a3);
                Log.v("HttpUrlFetcher", stringBuilder2.toString());
            }
        }
    }

    /* renamed from: a */
    private final InputStream m6381a(URL url, Map map) {
        URL url2 = null;
        int i = 0;
        while (true) {
            URL url3 = url;
            if (i >= 5) {
                throw new adj("Too many (> 5) redirects!");
            }
            if (url2 != null) {
                try {
                    if (url3.toURI().equals(url2.toURI())) {
                        throw new adj("In re-direct loop");
                    }
                } catch (URISyntaxException e) {
                }
            }
            this.f10152d = (HttpURLConnection) url3.openConnection();
            for (Entry entry : map.entrySet()) {
                this.f10152d.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            this.f10152d.setConnectTimeout(this.f10151c);
            this.f10152d.setReadTimeout(this.f10151c);
            this.f10152d.setUseCaches(false);
            this.f10152d.setDoInput(true);
            this.f10152d.setInstanceFollowRedirects(false);
            this.f10152d.connect();
            this.f10153e = this.f10152d.getInputStream();
            if (this.f10154f) {
                return null;
            }
            int responseCode = this.f10152d.getResponseCode();
            int i2 = responseCode / 100;
            if (i2 == 2) {
                HttpURLConnection httpURLConnection = this.f10152d;
                if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                    this.f10153e = new ark(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
                } else {
                    if (Log.isLoggable("HttpUrlFetcher", 3)) {
                        String valueOf = String.valueOf(httpURLConnection.getContentEncoding());
                        String str = "Got non empty content encoding: ";
                        if (valueOf.length() == 0) {
                            valueOf = new String(str);
                        } else {
                            valueOf = str.concat(valueOf);
                        }
                        Log.d("HttpUrlFetcher", valueOf);
                    }
                    this.f10153e = httpURLConnection.getInputStream();
                }
                return this.f10153e;
            } else if (i2 == 3) {
                Object headerField = this.f10152d.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new adj("Received empty or null redirect url");
                }
                url = new URL(url3, headerField);
                mo189c();
                i++;
                url2 = url3;
            } else if (responseCode == -1) {
                throw new adj(responseCode);
            } else {
                throw new adj(this.f10152d.getResponseMessage(), 0);
            }
        }
    }
}
