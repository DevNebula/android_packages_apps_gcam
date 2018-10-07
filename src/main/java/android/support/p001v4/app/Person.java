package android.support.p001v4.app;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p001v4.app.NotificationCompat.MessagingStyle.Message;
import p000.C0263hd;

/* compiled from: PG */
/* renamed from: android.support.v4.app.Person */
public class Person {
    public static final String ICON_KEY = "icon";
    public static final String IS_BOT_KEY = "isBot";
    public static final String IS_IMPORTANT_KEY = "isImportant";
    public static final String KEY_KEY = "key";
    public static final String NAME_KEY = "name";
    public static final String URI_KEY = "uri";
    public C0263hd mIcon;
    public boolean mIsBot;
    public boolean mIsImportant;
    public String mKey;
    public CharSequence mName;
    public String mUri;

    /* compiled from: PG */
    /* renamed from: android.support.v4.app.Person$Builder */
    public class Builder {
        public C0263hd mIcon;
        public boolean mIsBot;
        public boolean mIsImportant;
        public String mKey;
        public CharSequence mName;
        public String mUri;

        private Builder(Person person) {
            this.mName = person.mName;
            this.mIcon = person.mIcon;
            this.mUri = person.mUri;
            this.mKey = person.mKey;
            this.mIsBot = person.mIsBot;
            this.mIsImportant = person.mIsImportant;
        }

        public Person build() {
            return new Person(this);
        }

        public Builder setBot(boolean z) {
            this.mIsBot = z;
            return this;
        }

        public Builder setIcon(C0263hd c0263hd) {
            this.mIcon = c0263hd;
            return this;
        }

        public Builder setImportant(boolean z) {
            this.mIsImportant = z;
            return this;
        }

        public Builder setKey(String str) {
            this.mKey = str;
            return this;
        }

        public Builder setName(CharSequence charSequence) {
            this.mName = charSequence;
            return this;
        }

        public Builder setUri(String str) {
            this.mUri = str;
            return this;
        }
    }

    private Person(Builder builder) {
        this.mName = builder.mName;
        this.mIcon = builder.mIcon;
        this.mUri = builder.mUri;
        this.mKey = builder.mKey;
        this.mIsBot = builder.mIsBot;
        this.mIsImportant = builder.mIsImportant;
    }

    public static Person fromBundle(Bundle bundle) {
        C0263hd a;
        Bundle bundle2 = bundle.getBundle("icon");
        Builder name = new Builder().setName(bundle.getCharSequence(NAME_KEY));
        if (bundle2 != null) {
            a = C0263hd.m3131a(bundle2);
        } else {
            a = null;
        }
        return name.setIcon(a).setUri(bundle.getString("uri")).setKey(bundle.getString(KEY_KEY)).setBot(bundle.getBoolean(IS_BOT_KEY)).setImportant(bundle.getBoolean(IS_IMPORTANT_KEY)).build();
    }

    public C0263hd getIcon() {
        return this.mIcon;
    }

    public String getKey() {
        return this.mKey;
    }

    public CharSequence getName() {
        return this.mName;
    }

    public String getUri() {
        return this.mUri;
    }

    public boolean isBot() {
        return this.mIsBot;
    }

    public boolean isImportant() {
        return this.mIsImportant;
    }

    public Builder toBuilder() {
        return new Builder();
    }

    public Bundle toBundle() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence(NAME_KEY, this.mName);
        C0263hd c0263hd = this.mIcon;
        if (c0263hd != null) {
            Bundle bundle3 = new Bundle();
            switch (c0263hd.f6370a) {
                case -1:
                    bundle3.putParcelable("obj", (Parcelable) c0263hd.f6371b);
                    break;
                case 1:
                case 5:
                    bundle3.putParcelable("obj", (Bitmap) c0263hd.f6371b);
                    break;
                case 2:
                case 4:
                    bundle3.putString("obj", (String) c0263hd.f6371b);
                    break;
                case 3:
                    bundle3.putByteArray("obj", (byte[]) c0263hd.f6371b);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid icon");
            }
            bundle3.putInt(Message.KEY_DATA_MIME_TYPE, c0263hd.f6370a);
            bundle3.putInt("int1", c0263hd.f6372c);
            bundle3.putInt("int2", c0263hd.f6373d);
            Parcelable parcelable = c0263hd.f6374e;
            if (parcelable != null) {
                bundle3.putParcelable("tint_list", parcelable);
            }
            if (c0263hd.f6375g != C0263hd.f6369f) {
                bundle3.putString("tint_mode", c0263hd.f6375g.name());
                bundle = bundle3;
            } else {
                bundle = bundle3;
            }
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.mUri);
        bundle2.putString(KEY_KEY, this.mKey);
        bundle2.putBoolean(IS_BOT_KEY, this.mIsBot);
        bundle2.putBoolean(IS_IMPORTANT_KEY, this.mIsImportant);
        return bundle2;
    }
}
