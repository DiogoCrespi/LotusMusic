package com.dn0ne.player.app.presentation.components.playback

import com.dn0ne.player.app.domain.playback.PlaybackMode
import com.dn0ne.player.app.domain.track.Track

data class PlaybackState(
    val playlist: List<Track>? = null,
    val currentTrack: Track? = null,
    val isPlaying: Boolean = false,
    val playbackMode: PlaybackMode = PlaybackMode.Repeat,
    val position: Long = 0L
)