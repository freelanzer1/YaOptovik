package com.konstantinov.yaoptovik.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {

        @SerializedName("suggestion")
        @Expose
        private Suggestions suggestions;

        public Suggestions getSuggestions() {
            return suggestions;
        }

        public void setSuggestions(Suggestions suggestions) {
            this.suggestions = suggestions;
        }
}
