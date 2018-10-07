package p000;

import android.support.p001v4.app.NotificationCompatJellybean;
import com.google.android.apps.camera.metadata.refocus.GDepthUtil;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: wg */
public final class C0558wg {
    /* renamed from: a */
    private Map f9957a = new HashMap();
    /* renamed from: b */
    private Map f9958b = new HashMap();
    /* renamed from: c */
    private Map f9959c = new HashMap();
    /* renamed from: d */
    private Pattern f9960d = Pattern.compile("[/*?\\[\\]]");

    public C0558wg() {
        try {
            mo11459a("http://www.w3.org/XML/1998/namespace", "xml");
            mo11459a("http://www.w3.org/1999/02/22-rdf-syntax-ns#", "rdf");
            mo11459a("http://purl.org/dc/elements/1.1/", "dc");
            mo11459a("http://iptc.org/std/Iptc4xmpCore/1.0/xmlns/", "Iptc4xmpCore");
            mo11459a("adobe:ns:meta/", "x");
            mo11459a("http://ns.adobe.com/iX/1.0/", "iX");
            mo11459a("http://ns.adobe.com/xap/1.0/", "xmp");
            mo11459a("http://ns.adobe.com/xap/1.0/rights/", "xmpRights");
            mo11459a("http://ns.adobe.com/xap/1.0/mm/", "xmpMM");
            mo11459a("http://ns.adobe.com/xap/1.0/bj/", "xmpBJ");
            mo11459a("http://ns.adobe.com/xmp/note/", "xmpNote");
            mo11459a("http://ns.adobe.com/pdf/1.3/", "pdf");
            mo11459a("http://ns.adobe.com/pdfx/1.3/", "pdfx");
            mo11459a("http://www.npes.org/pdfx/ns/id/", "pdfxid");
            mo11459a("http://www.aiim.org/pdfa/ns/schema#", "pdfaSchema");
            mo11459a("http://www.aiim.org/pdfa/ns/property#", "pdfaProperty");
            mo11459a("http://www.aiim.org/pdfa/ns/type#", "pdfaType");
            mo11459a("http://www.aiim.org/pdfa/ns/field#", "pdfaField");
            mo11459a("http://www.aiim.org/pdfa/ns/id/", "pdfaid");
            mo11459a("http://www.aiim.org/pdfa/ns/extension/", "pdfaExtension");
            mo11459a("http://ns.adobe.com/photoshop/1.0/", "photoshop");
            mo11459a("http://ns.adobe.com/album/1.0/", "album");
            mo11459a("http://ns.adobe.com/exif/1.0/", "exif");
            mo11459a("http://ns.adobe.com/exif/1.0/aux/", "aux");
            mo11459a("http://ns.adobe.com/tiff/1.0/", "tiff");
            mo11459a("http://ns.adobe.com/png/1.0/", "png");
            mo11459a("http://ns.adobe.com/jpeg/1.0/", "jpeg");
            mo11459a("http://ns.adobe.com/jp2k/1.0/", "jp2k");
            mo11459a("http://ns.adobe.com/camera-raw-settings/1.0/", "crs");
            mo11459a("http://ns.adobe.com/StockPhoto/1.0/", "bmsp");
            mo11459a("http://ns.adobe.com/creatorAtom/1.0/", "creatorAtom");
            mo11459a("http://ns.adobe.com/asf/1.0/", "asf");
            mo11459a("http://ns.adobe.com/xmp/wav/1.0/", "wav");
            mo11459a("http://ns.adobe.com/xmp/1.0/DynamicMedia/", "xmpDM");
            mo11459a("http://ns.adobe.com/xmp/transient/1.0/", "xmpx");
            mo11459a("http://ns.adobe.com/xap/1.0/t/", "xmpT");
            mo11459a("http://ns.adobe.com/xap/1.0/t/pg/", "xmpTPg");
            mo11459a("http://ns.adobe.com/xap/1.0/g/", "xmpG");
            mo11459a("http://ns.adobe.com/xap/1.0/g/img/", "xmpGImg");
            mo11459a("http://ns.adobe.com/xap/1.0/sType/Font#", "stFNT");
            mo11459a("http://ns.adobe.com/xap/1.0/sType/Dimensions#", "stDim");
            mo11459a("http://ns.adobe.com/xap/1.0/sType/ResourceEvent#", "stEvt");
            mo11459a("http://ns.adobe.com/xap/1.0/sType/ResourceRef#", "stRef");
            mo11459a("http://ns.adobe.com/xap/1.0/sType/Version#", "stVer");
            mo11459a("http://ns.adobe.com/xap/1.0/sType/Job#", "stJob");
            mo11459a("http://ns.adobe.com/xap/1.0/sType/ManifestItem#", "stMfs");
            mo11459a("http://ns.adobe.com/xmp/Identifier/qual/1.0/", "xmpidq");
            C0779xf c0779xf = new C0779xf();
            c0779xf.mo11534a(1536, true);
            C0779xf c0779xf2 = new C0779xf();
            c0779xf2.mo11534a(7680, true);
            m6185a("http://ns.adobe.com/xap/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", c0779xf);
            m6185a("http://ns.adobe.com/xap/1.0/", "Authors", "http://purl.org/dc/elements/1.1/", "creator", null);
            m6185a("http://ns.adobe.com/xap/1.0/", "Description", "http://purl.org/dc/elements/1.1/", "description", null);
            m6185a("http://ns.adobe.com/xap/1.0/", GDepthUtil.FORMAT, "http://purl.org/dc/elements/1.1/", "format", null);
            m6185a("http://ns.adobe.com/xap/1.0/", "Keywords", "http://purl.org/dc/elements/1.1/", "subject", null);
            m6185a("http://ns.adobe.com/xap/1.0/", "Locale", "http://purl.org/dc/elements/1.1/", "language", null);
            m6185a("http://ns.adobe.com/xap/1.0/", "Title", "http://purl.org/dc/elements/1.1/", NotificationCompatJellybean.KEY_TITLE, null);
            m6185a("http://ns.adobe.com/xap/1.0/rights/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", null);
            m6185a("http://ns.adobe.com/pdf/1.3/", "Author", "http://purl.org/dc/elements/1.1/", "creator", c0779xf);
            m6185a("http://ns.adobe.com/pdf/1.3/", "BaseURL", "http://ns.adobe.com/xap/1.0/", "BaseURL", null);
            m6185a("http://ns.adobe.com/pdf/1.3/", "CreationDate", "http://ns.adobe.com/xap/1.0/", "CreateDate", null);
            m6185a("http://ns.adobe.com/pdf/1.3/", "Creator", "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
            m6185a("http://ns.adobe.com/pdf/1.3/", "ModDate", "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
            m6185a("http://ns.adobe.com/pdf/1.3/", "Subject", "http://purl.org/dc/elements/1.1/", "description", c0779xf2);
            m6185a("http://ns.adobe.com/pdf/1.3/", "Title", "http://purl.org/dc/elements/1.1/", NotificationCompatJellybean.KEY_TITLE, c0779xf2);
            m6185a("http://ns.adobe.com/photoshop/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", c0779xf);
            m6185a("http://ns.adobe.com/photoshop/1.0/", "Caption", "http://purl.org/dc/elements/1.1/", "description", c0779xf2);
            m6185a("http://ns.adobe.com/photoshop/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", c0779xf2);
            m6185a("http://ns.adobe.com/photoshop/1.0/", "Keywords", "http://purl.org/dc/elements/1.1/", "subject", null);
            m6185a("http://ns.adobe.com/photoshop/1.0/", "Marked", "http://ns.adobe.com/xap/1.0/rights/", "Marked", null);
            m6185a("http://ns.adobe.com/photoshop/1.0/", "Title", "http://purl.org/dc/elements/1.1/", NotificationCompatJellybean.KEY_TITLE, c0779xf2);
            m6185a("http://ns.adobe.com/photoshop/1.0/", "WebStatement", "http://ns.adobe.com/xap/1.0/rights/", "WebStatement", null);
            m6185a("http://ns.adobe.com/tiff/1.0/", "Artist", "http://purl.org/dc/elements/1.1/", "creator", c0779xf);
            m6185a("http://ns.adobe.com/tiff/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", null);
            m6185a("http://ns.adobe.com/tiff/1.0/", "DateTime", "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
            m6185a("http://ns.adobe.com/tiff/1.0/", "ImageDescription", "http://purl.org/dc/elements/1.1/", "description", null);
            m6185a("http://ns.adobe.com/tiff/1.0/", "Software", "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
            m6185a("http://ns.adobe.com/png/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", c0779xf);
            m6185a("http://ns.adobe.com/png/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", c0779xf2);
            m6185a("http://ns.adobe.com/png/1.0/", "CreationTime", "http://ns.adobe.com/xap/1.0/", "CreateDate", null);
            m6185a("http://ns.adobe.com/png/1.0/", "Description", "http://purl.org/dc/elements/1.1/", "description", c0779xf2);
            m6185a("http://ns.adobe.com/png/1.0/", "ModificationTime", "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
            m6185a("http://ns.adobe.com/png/1.0/", "Software", "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
            m6185a("http://ns.adobe.com/png/1.0/", "Title", "http://purl.org/dc/elements/1.1/", NotificationCompatJellybean.KEY_TITLE, c0779xf2);
        } catch (C0554wb e) {
            throw new RuntimeException("The XMPSchemaRegistry cannot be initialized!");
        }
    }

    /* renamed from: a */
    public final synchronized C0580xl mo11460a(String str) {
        return (C0580xl) this.f9959c.get(str);
    }

    /* renamed from: b */
    public final synchronized String mo11461b(String str) {
        return (String) this.f9957a.get(str);
    }

    /* renamed from: c */
    public final synchronized String mo11462c(String str) {
        Object str2;
        if (str2 != null) {
            if (!str2.endsWith(":")) {
                str2 = String.valueOf(str2).concat(":");
            }
        }
        return (String) this.f9958b.get(str2);
    }

    /* renamed from: a */
    private final synchronized void m6185a(String str, String str2, String str3, String str4, C0779xf c0779xf) {
        C0779xf c0779xf2;
        C0509tz.m5947c(str);
        C0509tz.m5946b(str2);
        C0509tz.m5947c(str3);
        C0509tz.m5946b(str4);
        if (c0779xf != null) {
            c0779xf2 = new C0779xf(C0572wy.m6268a(c0779xf.mo14448c(), null).f10018a);
        } else {
            c0779xf2 = new C0779xf();
        }
        if (this.f9960d.matcher(str2).find() || this.f9960d.matcher(str4).find()) {
            throw new C0554wb("Alias and actual property names must be simple", 102);
        }
        String b = mo11461b(str);
        String b2 = mo11461b(str3);
        if (b == null) {
            throw new C0554wb("Alias namespace is not registered", 101);
        } else if (b2 == null) {
            throw new C0554wb("Actual namespace is not registered", 101);
        } else {
            Object str5;
            String valueOf = String.valueOf(b);
            b = String.valueOf(str2);
            if (b.length() == 0) {
                str5 = new String(valueOf);
            } else {
                valueOf = valueOf.concat(b);
            }
            if (this.f9959c.containsKey(str5)) {
                throw new C0554wb("Alias is already existing", 4);
            }
            Object str6;
            Map map = this.f9959c;
            String valueOf2 = String.valueOf(b2);
            b = String.valueOf(str4);
            if (b.length() == 0) {
                str6 = new String(valueOf2);
            } else {
                str6 = valueOf2.concat(b);
            }
            if (map.containsKey(str6)) {
                throw new C0554wb("Actual property is already an alias, use the base property", 4);
            }
            this.f9959c.put(str5, new C0778xa(str3, b2, str4, c0779xf2));
        }
    }

    /* renamed from: a */
    public final synchronized String mo11459a(String str, String str2) {
        String valueOf;
        C0509tz.m5947c(str);
        if (str2 == null || str2.length() == 0) {
            throw new C0554wb("Empty prefix", 4);
        }
        if (str2.charAt(str2.length() - 1) != ':') {
            valueOf = String.valueOf(str2);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 1);
            stringBuilder.append(valueOf);
            stringBuilder.append(':');
            str2 = stringBuilder.toString();
        }
        if (C0567wp.m6226c(str2.substring(0, str2.length() - 1))) {
            valueOf = (String) this.f9957a.get(str);
            String str3 = (String) this.f9958b.get(str2);
            if (valueOf == null) {
                if (str3 != null) {
                    int i = 1;
                    valueOf = str2;
                    while (this.f9958b.containsKey(valueOf)) {
                        valueOf = str2.substring(0, str2.length() - 1);
                        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 14);
                        stringBuilder2.append(valueOf);
                        stringBuilder2.append("_");
                        stringBuilder2.append(i);
                        stringBuilder2.append("_:");
                        i++;
                        valueOf = stringBuilder2.toString();
                    }
                } else {
                    valueOf = str2;
                }
                this.f9958b.put(valueOf, str);
                this.f9957a.put(str, valueOf);
            }
        } else {
            throw new C0554wb("The prefix is a bad XML name", FrameType.ELEMENT_FLOAT64);
        }
        return valueOf;
    }
}
