package app.simone.users.model

import org.json.JSONObject

/**
 * Created by nicola on 23/06/2017.
 */

class FacebookPicture(json : JSONObject) {

    var url : String? = null
    var isSilhouette : Boolean? = null

    init {
        this.url = json.getString("url")
        this.isSilhouette = json.getBoolean("is_silhouette")
    }
}