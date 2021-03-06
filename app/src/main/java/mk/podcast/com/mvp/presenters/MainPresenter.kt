package mk.podcast.com.mvp.presenters

import androidx.lifecycle.LifecycleOwner
import mk.padc.share.mvp.presenters.BasePresenter
import mk.podcast.com.delegates.PodcastDelegate
import mk.podcast.com.mvp.views.MainView
import mk.podcast.com.views.viewpods.EmptyViewPod

interface MainPresenter : BasePresenter<MainView>, PodcastDelegate, EmptyViewPod.Delegate {
    fun onUiReady(lifeCycleOwner: LifecycleOwner)
}
