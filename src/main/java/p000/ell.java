package p000;

import android.os.Environment;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ell */
public final class ell implements elo {
    /* renamed from: a */
    private static final String f17540a = bli.m887a("LocalFileStorageMgr");
    /* renamed from: b */
    private File f17541b;
    /* renamed from: c */
    private gtf f17542c;
    /* renamed from: d */
    private final File f17543d;
    /* renamed from: e */
    private final gmn f17544e;
    /* renamed from: f */
    private final gnu f17545f;

    public ell(gln gln, gtf gtf, gmn gmn, gnu gnu) {
        this.f17543d = gln.mo7197a("panorama_sessions");
        File file = new File(Environment.getExternalStorageDirectory(), "panoramas");
        if (!(file.mkdirs() || file.exists())) {
            bli.m891b(f17540a, "Panorama directory not created.");
            file = null;
        }
        this.f17541b = file;
        this.f17542c = gtf;
        this.f17544e = gmn;
        this.f17545f = gnu;
    }

    /* renamed from: a */
    public static void m9914a(eln eln) {
        if (!new File(eln.f4166c).exists()) {
            bli.m891b(f17540a, "The storage directory does not exist.");
        }
    }

    /* renamed from: a */
    public final void mo6311a(eln eln, elp elp) {
        new elm(eln, elp).start();
    }

    /* renamed from: a */
    public final eln mo6310a() {
        long currentTimeMillis = System.currentTimeMillis();
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date(currentTimeMillis));
        File file = this.f17543d;
        String valueOf = String.valueOf("session_");
        String valueOf2 = String.valueOf(format);
        if (valueOf2.length() == 0) {
            valueOf2 = new String(valueOf);
        } else {
            valueOf2 = valueOf.concat(valueOf2);
        }
        File file2 = new File(file, valueOf2);
        file2.mkdirs();
        try {
            if (file2.isDirectory()) {
                String[] list = file2.list();
                for (String file3 : list) {
                    new File(file2, file3).delete();
                }
            }
        } catch (Exception e) {
            bli.m891b(f17540a, "Could not delete temporary images.");
        }
        eln eln = new eln();
        eln.f4164a = format;
        eln.f4166c = file2.getAbsolutePath();
        String a = this.f17542c.mo7438a(currentTimeMillis, new SimpleDateFormat("'PANO'_yyyyMMdd_HHmmss", Locale.US));
        goe goe = new goe(this.f17545f, eln.f4166c, a);
        gmn gmn = this.f17544e;
        eln.f4165b = new gmi((gmp) gmn.m2669a((gmp) gmn.f5679a.mo10566a(), 1), (glt) gmn.m2669a((glt) gmn.f5680b.mo10566a(), 2), (Executor) gmn.m2669a((Executor) gmn.f5681c.mo10566a(), 3), (gsl) gmn.m2669a((gsl) gmn.f5682d.mo10566a(), 4), (eqa) gmn.m2669a((eqa) gmn.f5683e.mo10566a(), 5), (gsp) gmn.m2669a((gsp) gmn.f5684f.mo10566a(), 6), (gtf) gmn.m2669a((gtf) gmn.f5685g.mo10566a(), 7), (gsi) gmn.m2669a((gsi) gmn.f5686h.mo10566a(), 8), (grg) gmn.m2669a((grg) gmn.f5687i.mo10566a(), 9), (bcv) gmn.m2669a((bcv) gmn.f5688j.mo10566a(), 10), (goe) gmn.m2669a(goe, 11), (gnh) gmn.m2669a((gnh) gmn.f5689k.mo10566a(), 12), (String) gmn.m2669a(a, 13), (kbg) gmn.m2669a(kau.f21835a, 14), currentTimeMillis, (hju) gmn.m2669a((hju) gmn.f5690l.mo10566a(), 16), (gev) gmn.m2669a((gev) gmn.f5691m.mo10566a(), 17));
        if (eln.f4165b.mo13384m().mo7275c()) {
            format = String.valueOf(a);
            valueOf2 = String.valueOf(ixx.JPEG.f7912j);
            if (valueOf2.length() == 0) {
                valueOf2 = new String(format);
            } else {
                valueOf2 = format.concat(valueOf2);
            }
            if (m9915b() == null) {
                bli.m891b(f17540a, "Could not get the thumbnail directory.");
                eln.f4167d = "";
            } else {
                eln.f4167d = new File(m9915b(), valueOf2).getAbsolutePath();
            }
            eln.f4169f = new File(file2, "orientations.txt").getAbsolutePath();
            eln.f4168e = new File(file2, "session.meta").getAbsolutePath();
            return eln;
        }
        throw new IOException("Cannot create temporary session file.");
    }

    /* renamed from: b */
    private final File m9915b() {
        String valueOf = String.valueOf(this.f17541b.getAbsolutePath());
        String str = "Panorama directory is : ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            str.concat(valueOf);
        }
        File file = new File(this.f17541b, "thumbnails");
        if (file.mkdirs() || file.exists()) {
            return file;
        }
        bli.m891b(f17540a, "Thumbnails directory not created.");
        return null;
    }

    /* renamed from: a */
    public final boolean mo6312a(String str) {
        this.f17541b = new File(str);
        if (this.f17541b.exists() || this.f17541b.mkdirs()) {
            return true;
        }
        bli.m891b(f17540a, "Panorama directory not created.");
        return false;
    }
}
