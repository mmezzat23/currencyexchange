package com.t.currenyexchange.NetWorkConnction

import android.app.Activity
import android.content.Intent
import android.util.Log
import atiaf.redstone.NetWorkConnction.RetrofitClient

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.t.currenyexchange.Dialogs
import com.t.currenyexchange.ErrorResponse
import com.t.currenyexchange.R
import org.json.JSONException
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object FailerResponse {
    val REFRESH_TOKEN = 401
    val SUCCESS = 200
    val CREATED = 201
    val Failer = 422
    val BAD_REQUEST = 400
    val UNAUTHORIZE = 401
    val SERVER_ERROR = 500
    val USER_DELETE = 403
    val Not_FOUND = 404
    val Error = 409
    val limit = 10
    var version = "v1"
    var device_type = "1"
    fun handleFailure(activity: Activity, statusCode: Int, errorResponse: String, listener: RefreshTokenListener) {
        Log.e("fail", statusCode.toString() + "--" + errorResponse)
        val dataType = object : TypeToken<ErrorResponse>() {

        }.type
        var responseBody = ErrorResponse()
        try {
            if (statusCode != FailerResponse.SERVER_ERROR)
                responseBody = Gson().fromJson<ErrorResponse>(errorResponse, dataType)

        } catch (e: Exception) {
        }

        when (statusCode) {
            FailerResponse.BAD_REQUEST -> if (responseBody.getMessage().equals("")) {
                Dialogs.showToast(if (responseBody.getMsg() != null)
                    responseBody.getMsg()
                else
                    "", activity!!)
            } else {
                Dialogs.showToast(if (responseBody.getMessage() != null)
                    responseBody.getMessage()
                else
                    "", activity!!)
            }
            FailerResponse.Not_FOUND -> {
                if (responseBody.getMessage().equals("")) {
                    Dialogs.showToast(if (responseBody.getMsg() != null)
                        responseBody.getMsg()
                    else
                        "", activity!!)
                } else {
                    Dialogs.showToast(if (responseBody.getMessage() != null)
                        responseBody.getMessage()
                    else
                        "", activity!!)
                }
                (activity as Activity).finish()
            }
            FailerResponse.Failer -> if (responseBody.getMessage().equals("")) {
                Dialogs.showToast(if (responseBody.getMsg() != null)
                    responseBody.getMsg()
                else
                    "", activity!!)
            } else {
                Dialogs.showToast(if (responseBody.getMessage() != null)
                    responseBody.getMessage()
                else
                    "", activity!!)
            }
            FailerResponse.Error -> if (responseBody.getMessage().equals("")) {
                Dialogs.showToast(if (responseBody.getMsg() != null)
                    responseBody.getMsg()
                else
                    "", activity!!)
            } else {
                Dialogs.showToast(if (responseBody.getMessage() != null)
                    responseBody.getMessage()
                else
                    "", activity!!)
            }
            FailerResponse.USER_DELETE -> {
            }
            500 -> {
                Dialogs.showToast( activity.getString(R.string.no_network) , activity)
            }
            else -> if (responseBody.getMessage().equals("")) {
                Dialogs.showToast(
                    if (responseBody.getMsg() != null)
                        responseBody.getMsg()
                    else
                        "", activity!!
                )
            }
        }
    }
    interface RefreshTokenListener {
        fun onRefresh()
    }

}