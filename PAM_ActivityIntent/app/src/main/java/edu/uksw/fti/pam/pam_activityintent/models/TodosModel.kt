package edu.uksw.fti.pam.pam_activityintent.models

import com.google.gson.annotations.SerializedName

data class TodosModel(
    @SerializedName("userId")
    var userId: Int,
    @SerializedName("id")
    var id: Int,
    @SerializedName("username")
    var username: String,
    @SerializedName("password")
    var password: String,
    @SerializedName("firstname")
    var firstname: String,
    @SerializedName("lastname")
    var lastname: String,

)