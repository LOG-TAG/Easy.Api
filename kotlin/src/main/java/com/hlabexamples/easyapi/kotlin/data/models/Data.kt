package com.hlabexamples.easyapi.kotlin.data.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by H.T. on 17/04/18.
 */
data class User(
  @SerializedName("id")
  var id: Int = 0,
  @SerializedName("first_name")
  var firstName: String? = null,
  @SerializedName("last_name")
  var lastName: String? = null,
  @SerializedName("avatar")
  var avatar: String? = null
)

open class Base<T>(
  @SerializedName("success")
  @Expose
  var isSuccess: Boolean = false,
  @SerializedName("message")
  @Expose
  var message: String? = null,
  @SerializedName("data")
  @Expose
  var data: T? = null
)

data class Envelop<T>(
  @SerializedName("page")
  var page: Int? = null,
  @SerializedName("per_page")
  var perPage: Int? = null,
  @SerializedName("total")
  var total: Int? = null,
  @SerializedName("total_pages")
  var totalPages: Int? = null
) : Base<T>()