package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.p001v4.app.NotificationCompat;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p000.hta;
import p000.htf;
import p000.htl;

public class GoogleSignInAccount extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new htf();
    /* renamed from: m */
    private static Comparator f23301m = new hta();
    /* renamed from: a */
    private final int f23302a;
    /* renamed from: b */
    private String f23303b;
    /* renamed from: c */
    private String f23304c;
    /* renamed from: d */
    private String f23305d;
    /* renamed from: e */
    private String f23306e;
    /* renamed from: f */
    private Uri f23307f;
    /* renamed from: g */
    private String f23308g;
    /* renamed from: h */
    private long f23309h;
    /* renamed from: i */
    private String f23310i;
    /* renamed from: j */
    private List f23311j;
    /* renamed from: k */
    private String f23312k;
    /* renamed from: l */
    private String f23313l;

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List list, String str7, String str8) {
        this.f23302a = i;
        this.f23303b = str;
        this.f23304c = str2;
        this.f23305d = str3;
        this.f23306e = str4;
        this.f23307f = uri;
        this.f23308g = str5;
        this.f23309h = j;
        this.f23310i = str6;
        this.f23311j = list;
        this.f23312k = str7;
        this.f23313l = str8;
    }

    public boolean equals(Object obj) {
        return obj instanceof GoogleSignInAccount ? ((GoogleSignInAccount) obj).m15357a().toString().equals(m15357a().toString()) : false;
    }

    public int hashCode() {
        return m15357a().toString().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 1, this.f23302a);
        htl.m3469a(parcel, 2, this.f23303b);
        htl.m3469a(parcel, 3, this.f23304c);
        htl.m3469a(parcel, 4, this.f23305d);
        htl.m3469a(parcel, 5, this.f23306e);
        htl.m3468a(parcel, 6, this.f23307f, i);
        htl.m3469a(parcel, 7, this.f23308g);
        htl.m3465a(parcel, 8, this.f23309h);
        htl.m3469a(parcel, 9, this.f23310i);
        htl.m3470a(parcel, 10, this.f23311j);
        htl.m3469a(parcel, 11, this.f23312k);
        htl.m3469a(parcel, 12, this.f23313l);
        htl.m3496c(parcel, b);
    }

    /* renamed from: a */
    public static GoogleSignInAccount m15356a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        Object optString = jSONObject.optString("photoUrl", null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        Object hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, jSONObject.optString("id"), jSONObject.optString("tokenId", null), jSONObject.optString(NotificationCompat.CATEGORY_EMAIL, null), jSONObject.optString("displayName", null), parse, null, Long.valueOf(parseLong).longValue(), htl.m3460a(jSONObject.getString("obfuscatedIdentifier")), new ArrayList((Collection) htl.m3488b(hashSet)), jSONObject.optString("givenName", null), jSONObject.optString("familyName", null));
        googleSignInAccount.f23308g = jSONObject.optString("serverAuthCode", null);
        return googleSignInAccount;
    }

    /* renamed from: a */
    private final JSONObject m15357a() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f23303b;
            if (str != null) {
                jSONObject.put("id", str);
            }
            str = this.f23304c;
            if (str != null) {
                jSONObject.put("tokenId", str);
            }
            str = this.f23305d;
            if (str != null) {
                jSONObject.put(NotificationCompat.CATEGORY_EMAIL, str);
            }
            str = this.f23306e;
            if (str != null) {
                jSONObject.put("displayName", str);
            }
            str = this.f23312k;
            if (str != null) {
                jSONObject.put("givenName", str);
            }
            str = this.f23313l;
            if (str != null) {
                jSONObject.put("familyName", str);
            }
            Uri uri = this.f23307f;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            str = this.f23308g;
            if (str != null) {
                jSONObject.put("serverAuthCode", str);
            }
            jSONObject.put("expirationTime", this.f23309h);
            jSONObject.put("obfuscatedIdentifier", this.f23310i);
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f23311j, f23301m);
            for (Scope scope : this.f23311j) {
                jSONArray.put(scope.f23353a);
            }
            jSONObject.put("grantedScopes", jSONArray);
            return jSONObject;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
