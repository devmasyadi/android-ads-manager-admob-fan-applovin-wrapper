package com.adsmanager.adswrapper

import com.adsmanager.ads.NetworkAds
import com.adsmanager.ads.NetworkOpenAd

object ConfigAds {
    var isShowAds = false
    var intervalTimeInterstitial = 10 // seconds

    var primaryNetworkOpenAd = NetworkOpenAd.ADMOB
    var secondaryNetworkOpenAd: NetworkOpenAd? = null
    var tertiaryAdsNetworkOpenAd: NetworkOpenAd? = null

    var primaryOpenAdId = "123"
    var secondaryOpenAdId: String? = null
    var tertiaryOpenAdId: String? = null

    var primaryAds: NetworkAds = NetworkAds.ADMOB
    var secondaryAds: NetworkAds? = null
    var tertiaryAds: NetworkAds? = null

    var primaryBannerId: String = "12323"
    var secondaryBannerId: String? = null
    var tertiaryBannerId: String? = null

    var primaryInterstitialId: String = "12323"
    var secondaryInterstitialId: String? = null
    var tertiaryInterstitialId: String? = null

    var primaryNativeId: String = "12323"
    var secondaryNativeId: String? = null
    var tertiaryNativeId: String? = null

    var primaryRewardsId: String = "12323"
    var secondaryRewardsId: String? = null
    var tertiaryRewardsId: String? = null
}