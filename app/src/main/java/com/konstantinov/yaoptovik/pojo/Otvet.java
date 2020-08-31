package com.konstantinov.yaoptovik.pojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Otvet {

    @SerializedName("suggestions")
    @Expose
    private List<Suggestions> suggestions = null;

    public List<Suggestions> getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(List<Suggestions> suggestions) {
        this.suggestions = suggestions;
    }

}
