package p000;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: ach */
public final class ach {
    /* renamed from: a */
    public final apr f226a = new apr();
    /* renamed from: b */
    public final apy f227b = new apy();
    /* renamed from: c */
    public final aea f228c = new aea();
    /* renamed from: d */
    private final akc f229d = new akc(this.f235j);
    /* renamed from: e */
    private final apw f230e = new apw();
    /* renamed from: f */
    private final aop f231f = new aop();
    /* renamed from: g */
    private final apt f232g = new apt();
    /* renamed from: h */
    private final apv f233h = new apv();
    /* renamed from: i */
    private final apu f234i = new apu();
    /* renamed from: j */
    private final C0300iw f235j = ars.m684a();

    public ach() {
        List arrayList = new ArrayList(Arrays.asList(new String[]{"Gif", "Bitmap", "BitmapDrawable"}));
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.f230e.mo1671a(arrayList);
    }

    /* renamed from: a */
    public final ach mo113a(Class cls, adi adi) {
        this.f226a.mo1664a(cls, adi);
        return this;
    }

    /* renamed from: a */
    public final ach mo114a(Class cls, adr adr) {
        this.f227b.mo1675a(cls, adr);
        return this;
    }

    /* renamed from: a */
    public final ach mo115a(Class cls, Class cls2, adq adq) {
        mo118a("legacy_append", cls, cls2, adq);
        return this;
    }

    /* renamed from: a */
    public final ach mo116a(Class cls, Class cls2, akb akb) {
        this.f229d.mo348a(cls, cls2, akb);
        return this;
    }

    /* renamed from: a */
    public final ach mo118a(String str, Class cls, Class cls2, adq adq) {
        this.f230e.mo1670a(str, adq, cls, cls2);
        return this;
    }

    /* renamed from: a */
    public final List mo120a() {
        List a = this.f232g.mo1665a();
        if (!a.isEmpty()) {
            return a;
        }
        throw new aci();
    }

    /* renamed from: a */
    public final agk mo119a(Class cls, Class cls2, Class cls3) {
        agk a = this.f234i.mo1667a(cls, cls2, cls3);
        if (apu.f867a.equals(a)) {
            return null;
        }
        if (a == null) {
            List arrayList = new ArrayList();
            for (Class cls4 : this.f230e.mo1672b(cls, cls2)) {
                for (Class cls5 : this.f231f.mo1639b(cls4, cls3)) {
                    arrayList.add(new afk(cls, cls4, cls5, this.f230e.mo1669a(cls, cls4), this.f231f.mo1637a(cls4, cls5), this.f235j));
                }
            }
            if (arrayList.isEmpty()) {
                a = null;
            } else {
                a = new agk(cls, cls2, cls3, arrayList, this.f235j);
            }
            apu apu = this.f234i;
            synchronized (apu.f868b) {
                Object obj;
                C0691ih c0691ih = apu.f868b;
                arp arp = new arp(cls, cls2, cls3);
                if (a == null) {
                    obj = apu.f867a;
                } else {
                    agk obj2 = a;
                }
                c0691ih.put(arp, obj2);
            }
        }
        return a;
    }

    /* renamed from: a */
    public final List mo121a(Object obj) {
        List a = this.f229d.mo347a(obj);
        if (!a.isEmpty()) {
            return a;
        }
        throw new aci(obj);
    }

    /* renamed from: b */
    public final List mo122b(Class cls, Class cls2, Class cls3) {
        List a = this.f233h.mo1668a(cls, cls2);
        if (a != null) {
            return a;
        }
        List arrayList = new ArrayList();
        for (Class b : this.f229d.mo346a(cls)) {
            for (Class cls4 : this.f230e.mo1672b(b, cls2)) {
                if (!(this.f231f.mo1639b(cls4, cls3).isEmpty() || arrayList.contains(cls4))) {
                    arrayList.add(cls4);
                }
            }
        }
        apv apv = this.f233h;
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        synchronized (apv.f870a) {
            apv.f870a.put(new arp(cls, cls2), unmodifiableList);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final ach mo112a(ImageHeaderParser imageHeaderParser) {
        this.f232g.mo1666a(imageHeaderParser);
        return this;
    }

    /* renamed from: a */
    public final ach mo111a(adz adz) {
        this.f228c.mo198a(adz);
        return this;
    }

    /* renamed from: a */
    public final ach mo117a(Class cls, Class cls2, aoo aoo) {
        this.f231f.mo1638a(cls, cls2, aoo);
        return this;
    }
}
