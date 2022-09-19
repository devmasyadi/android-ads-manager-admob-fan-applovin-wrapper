package com.adsmanager.adswrapper

import android.app.Activity
import com.adsmanager.ads.AdsManagerOpenAd
import com.adsmanager.core.CallbackAds
import com.adsmanager.core.CallbackOpenAd

class AdsManagerOpenAdWrapper(
    private val adsManagerOpenAd: AdsManagerOpenAd
) {

    private var currentActivity: Activity? = null

    fun setCurrentActivity(activity: Activity) {
        this.currentActivity = activity
        adsManagerOpenAd.setCurrentActivity(activity)
    }

    fun getCurrentActivity() = currentActivity

    fun isShowingAd(): Boolean {
        return adsManagerOpenAd.isShowingAd(ConfigAds.primaryNetworkOpenAd)
    }

    fun loadAd(
        activity: Activity,
        callbackAds: CallbackAds?
    ) {
        if (ConfigAds.isShowAds)
            adsManagerOpenAd.loadAd(
                activity,
                ConfigAds.primaryNetworkOpenAd,
                ConfigAds.primaryOpenAdId,
                ConfigAds.secondaryNetworkOpenAd,
                ConfigAds.secondaryOpenAdId,
                ConfigAds.tertiaryAdsNetworkOpenAd,
                ConfigAds.tertiaryOpenAdId,
                callbackAds
            )
    }

    fun showAdIfAvailable(
        activity: Activity,
        callbackOpenAd: CallbackOpenAd?
    ) {
        if (ConfigAds.isShowAds)
            adsManagerOpenAd.showAdIfAvailable(
                activity,
                ConfigAds.primaryNetworkOpenAd,
                ConfigAds.primaryOpenAdId,
                ConfigAds.secondaryNetworkOpenAd,
                ConfigAds.secondaryOpenAdId,
                ConfigAds.tertiaryAdsNetworkOpenAd,
                ConfigAds.tertiaryOpenAdId,
                callbackOpenAd
            )
    }

}
