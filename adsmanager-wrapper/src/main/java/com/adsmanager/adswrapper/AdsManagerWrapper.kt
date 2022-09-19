package com.adsmanager.adswrapper

import android.app.Activity
import android.content.Context
import android.widget.RelativeLayout
import com.adsmanager.ads.AdsManager
import com.adsmanager.core.CallbackAds
import com.adsmanager.core.IRewards
import com.adsmanager.core.iadsmanager.IInitialize
import com.adsmanager.core.iadsmanager.SizeBanner
import com.adsmanager.core.iadsmanager.SizeNative


class AdsManagerWrapper(
    private val adsManager: AdsManager
) : IAds {
    override fun initialize(context: Context, iInitialize: IInitialize) {
        if (ConfigAds.isShowAds)
            adsManager.initialize(
                context,
                iInitialize,
                ConfigAds.primaryAds,
                ConfigAds.secondaryAds,
                ConfigAds.tertiaryAds
            )
    }

    override fun setTestDevices(activity: Activity, testDevices: List<String>) {
        if (ConfigAds.isShowAds)
            adsManager.setTestDevices(
                activity,
                testDevices,
                ConfigAds.primaryAds,
                ConfigAds.secondaryAds,
                ConfigAds.tertiaryAds
            )
    }

    override fun loadGdpr(activity: Activity, childDirected: Boolean) {
        if (ConfigAds.isShowAds)
            adsManager.loadGdpr(activity, childDirected, ConfigAds.primaryAds)
    }

    override fun showBanner(
        activity: Activity,
        bannerView: RelativeLayout,
        sizeBanner: SizeBanner,
        callbackAds: CallbackAds?
    ) {
        if (ConfigAds.isShowAds)
            adsManager.showBanner(
                activity,
                bannerView,
                sizeBanner,
                ConfigAds.primaryAds,
                ConfigAds.primaryBannerId,
                ConfigAds.secondaryAds,
                ConfigAds.secondaryBannerId,
                ConfigAds.tertiaryAds,
                ConfigAds.tertiaryBannerId,
                callbackAds
            )
    }

    override fun loadInterstitial(activity: Activity) {
        if (ConfigAds.isShowAds)
            adsManager.loadInterstitial(
                activity,
                ConfigAds.primaryAds,
                ConfigAds.primaryInterstitialId,
                ConfigAds.secondaryAds,
                ConfigAds.secondaryInterstitialId,
                ConfigAds.tertiaryAds,
                ConfigAds.tertiaryInterstitialId
            )
    }

    override fun showInterstitial(activity: Activity, callbackAds: CallbackAds?) {
        if (ConfigAds.isShowAds && Utils.isValidBetweenTimeInterstitial())
            adsManager.showInterstitial(
                activity,
                ConfigAds.primaryAds,
                ConfigAds.primaryInterstitialId,
                ConfigAds.secondaryAds,
                ConfigAds.secondaryInterstitialId,
                ConfigAds.tertiaryAds,
                ConfigAds.tertiaryInterstitialId,
                callbackAds
            )
    }

    override fun showNativeAds(
        activity: Activity,
        nativeView: RelativeLayout,
        sizeNative: SizeNative,
        callbackAds: CallbackAds?
    ) {
        if (ConfigAds.isShowAds)
            adsManager.showNativeAds(
                activity,
                nativeView,
                sizeNative,
                ConfigAds.primaryAds,
                ConfigAds.primaryNativeId,
                ConfigAds.secondaryAds,
                ConfigAds.secondaryNativeId,
                ConfigAds.tertiaryAds,
                ConfigAds.tertiaryNativeId,
                callbackAds
            )
    }

    override fun loadRewards(activity: Activity) {
        if (ConfigAds.isShowAds)
            adsManager.loadRewards(
                activity,
                ConfigAds.primaryAds,
                ConfigAds.primaryRewardsId,
                ConfigAds.secondaryAds,
                ConfigAds.secondaryRewardsId,
                ConfigAds.tertiaryAds,
                ConfigAds.tertiaryRewardsId
            )
    }

    override fun showRewards(activity: Activity, callbackAds: CallbackAds?, iRewards: IRewards?) {
        if (ConfigAds.isShowAds)
            adsManager.showRewards(
                activity,
                ConfigAds.primaryAds,
                ConfigAds.primaryRewardsId,
                ConfigAds.secondaryAds,
                ConfigAds.secondaryRewardsId,
                ConfigAds.tertiaryAds,
                ConfigAds.tertiaryRewardsId,
                callbackAds,
                iRewards
            )
    }

}