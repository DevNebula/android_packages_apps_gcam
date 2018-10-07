package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.p001v4.app.NotificationCompat;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.zzg;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p000.htb;
import p000.htd;
import p000.htg;
import p000.htl;
import p000.iat;

public class GoogleSignInOptions extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new htg();
    /* renamed from: a */
    private static final Scope f23314a = new Scope("profile");
    /* renamed from: b */
    private static final Scope f23315b = new Scope("openid");
    /* renamed from: c */
    private static final Scope f23316c = new Scope("https://www.googleapis.com/auth/games");
    /* renamed from: d */
    private final int f23317d;
    /* renamed from: e */
    private final ArrayList f23318e;
    /* renamed from: f */
    private Account f23319f;
    /* renamed from: g */
    private boolean f23320g;
    /* renamed from: h */
    private final boolean f23321h;
    /* renamed from: i */
    private final boolean f23322i;
    /* renamed from: j */
    private String f23323j;
    /* renamed from: k */
    private String f23324k;
    /* renamed from: l */
    private ArrayList f23325l;

    static {
        Scope scope = new Scope(NotificationCompat.CATEGORY_EMAIL);
        iat iat = new iat();
        iat.f7246a.add(f23315b);
        iat.f7246a.add(f23314a);
        iat.mo8311a();
        iat = new iat();
        Scope[] scopeArr = new Scope[0];
        iat.f7246a.add(f23316c);
        iat.f7246a.addAll(Arrays.asList(scopeArr));
        iat.mo8311a();
        htb htb = new htb();
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map) {
        this.f23317d = i;
        this.f23318e = arrayList;
        this.f23319f = account;
        this.f23320g = z;
        this.f23321h = z2;
        this.f23322i = z3;
        this.f23323j = str;
        this.f23324k = str2;
        this.f23325l = new ArrayList(map.values());
    }

    /* renamed from: a */
    public static GoogleSignInOptions m15358a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        Collection hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        Object optString = jSONObject.optString("accountName", null);
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", null), jSONObject.optString("hostedDomain", null), new HashMap());
    }

    /* renamed from: a */
    public final ArrayList mo14617a() {
        return new ArrayList(this.f23318e);
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList arrayList2) {
        Map hashMap = new HashMap();
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                zzg zzg = (zzg) arrayList2.get(i2);
                hashMap.put(Integer.valueOf(zzg.f23326a), zzg);
                i2 = i3;
            }
        }
        this(i, arrayList, account, z, z2, z3, str, str2, hashMap);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (this.f23325l.size() > 0 || googleSignInOptions.f23325l.size() > 0 || this.f23318e.size() != googleSignInOptions.mo14617a().size() || !this.f23318e.containsAll(googleSignInOptions.mo14617a())) {
                return false;
            }
            Account account = this.f23319f;
            if (account == null) {
                if (googleSignInOptions.f23319f != null) {
                    return false;
                }
            } else if (!account.equals(googleSignInOptions.f23319f)) {
                return false;
            }
            if (TextUtils.isEmpty(this.f23323j)) {
                if (!TextUtils.isEmpty(googleSignInOptions.f23323j)) {
                    return false;
                }
            } else if (!this.f23323j.equals(googleSignInOptions.f23323j)) {
                return false;
            }
            return this.f23322i == googleSignInOptions.f23322i && this.f23320g == googleSignInOptions.f23320g && this.f23321h == googleSignInOptions.f23321h;
        } catch (ClassCastException e) {
            return false;
        }
    }

    public int hashCode() {
        Object arrayList = new ArrayList();
        ArrayList arrayList2 = this.f23318e;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            arrayList.add(((Scope) arrayList2.get(i)).f23353a);
            i = i2;
        }
        Collections.sort(arrayList);
        return new htd().mo8109a(arrayList).mo8109a(this.f23319f).mo8109a(this.f23323j).mo8110a(this.f23322i).mo8110a(this.f23320g).mo8110a(this.f23321h).f7001a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 1, this.f23317d);
        htl.m3470a(parcel, 2, mo14617a());
        htl.m3468a(parcel, 3, this.f23319f, i);
        htl.m3471a(parcel, 4, this.f23320g);
        htl.m3471a(parcel, 5, this.f23321h);
        htl.m3471a(parcel, 6, this.f23322i);
        htl.m3469a(parcel, 7, this.f23323j);
        htl.m3469a(parcel, 8, this.f23324k);
        htl.m3470a(parcel, 9, this.f23325l);
        htl.m3496c(parcel, b);
    }
}
