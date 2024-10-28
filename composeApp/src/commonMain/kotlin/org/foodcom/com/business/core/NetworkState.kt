package org.foodcom.com.business.core

sealed class NetworkState{

   data object Good: NetworkState()

   data object Failed: NetworkState()

}
