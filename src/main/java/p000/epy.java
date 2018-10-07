package p000;

import android.annotation.TargetApi;
import android.location.Location;
import android.support.p001v4.app.NotificationCompatJellybean;
import java.io.File;
import java.util.concurrent.TimeUnit;

@TargetApi(16)
/* compiled from: PG */
/* renamed from: epy */
public final class epy {
    /* renamed from: a */
    public File f4296a = null;
    /* renamed from: b */
    public kbg f4297b = null;
    /* renamed from: c */
    public iqm f4298c = null;
    /* renamed from: d */
    private final epw f4299d;
    /* renamed from: e */
    private ixx f4300e = null;
    /* renamed from: f */
    private iqp f4301f = null;
    /* renamed from: g */
    private long f4302g = -1;
    /* renamed from: h */
    private String f4303h = null;

    public epy(epw epw) {
        this.f4299d = epw;
    }

    /* renamed from: a */
    public final epv mo6485a() {
        if (this.f4296a == null) {
            throw new IllegalStateException("image file is not set.");
        } else if (this.f4297b == null) {
            throw new IllegalStateException("image location optional is not set.");
        } else if (this.f4300e == null) {
            throw new IllegalStateException("image MIME type is not set.");
        } else if (this.f4298c == null) {
            throw new IllegalStateException("image orientation is not set.");
        } else if (this.f4301f == null) {
            throw new IllegalStateException("image size is not set.");
        } else if (this.f4302g < 0) {
            throw new IllegalStateException("image taken time is not set.");
        } else if (this.f4303h == null) {
            throw new IllegalStateException("image title is not set.");
        } else {
            epv a = new epv();
            a.mo6482a("media_type", Integer.valueOf(1));
            a.mo6484a("_data", this.f4296a.getAbsolutePath());
            a.mo6483a("_size", Long.valueOf(this.f4296a.length()));
            a.mo6484a("_display_name", this.f4296a.getName());
            a.mo6484a(NotificationCompatJellybean.KEY_TITLE, this.f4303h);
            a.mo6483a("date_added", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.f4302g)));
            a.mo6483a("date_modified", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.f4296a.lastModified())));
            a.mo6484a("mime_type", this.f4300e.f7911i);
            a.mo6482a("width", Integer.valueOf(this.f4301f.f7695a));
            a.mo6482a("height", Integer.valueOf(this.f4301f.f7696b));
            if (this.f4297b.mo9709b()) {
                a.mo6481a("latitude", Double.valueOf(((Location) this.f4297b.mo9706a()).getLatitude()));
                a.mo6481a("longitude", Double.valueOf(((Location) this.f4297b.mo9706a()).getLongitude()));
            }
            a.mo6483a("datetaken", Long.valueOf(this.f4302g));
            a.mo6482a("orientation", Integer.valueOf(this.f4298c.f7692e));
            return a;
        }
    }

    /* renamed from: a */
    public final epy mo6488a(ixx ixx) {
        if (ixx.f7906h.contains(ixx)) {
            this.f4300e = ixx;
            return this;
        }
        String valueOf = String.valueOf(ixx);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
        stringBuilder.append("invalid image MIME type ");
        stringBuilder.append(valueOf);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    public final epy mo6487a(iqp iqp) {
        if (iqp.mo8812a() <= 0) {
            String valueOf = String.valueOf(iqp);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 19);
            stringBuilder.append("invalid image size ");
            stringBuilder.append(valueOf);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f4301f = iqp;
        return this;
    }

    /* renamed from: a */
    public final epy mo6486a(long j) {
        if (j <= 0) {
            StringBuilder stringBuilder = new StringBuilder(45);
            stringBuilder.append("invalid image taken time ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f4302g = j;
        return this;
    }

    /* renamed from: a */
    public final epy mo6489a(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("empty image title");
        }
        this.f4303h = str;
        return this;
    }
}
